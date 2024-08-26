package ksu.yomogi.vm;

import ksu.yomogi.parser.uolBaseVisitor;
import ksu.yomogi.parser.uolParser;
import ksu.yomogi.vm.datamanager.DataManager;
import ksu.yomogi.vm.errors.MissingArgumentsError;
import ksu.yomogi.vm.errors.NotFoundSymbolError;
import ksu.yomogi.vm.interfaces.Executable;
import ksu.yomogi.vm.interfaces.Value;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Stack;

public class UolVisitor extends uolBaseVisitor<Object> {

    private final static String aRuntimePath = "src/main/resources/";

    private DataManager aDataManager = new DataManager();

    private Object aReturnValue = null;

    private Boolean aRawIdentityEvaluation = false;


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    public Object visitExpression(uolParser.ExpressionContext ctx) {
        super.visitExpression(ctx);
        this.aDataManager.getCounter(DataManager.ARGUMENT_COUNT).reset();
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    public Object visitPartsImportStatement(uolParser.PartsImportStatementContext ctx) {
        super.visitPartsImportStatement(ctx);

        String aFileKey = ctx.getChild(3).getText();
        aFileKey = aFileKey.replaceAll("\\.", File.separator);
        aFileKey = aFileKey.substring(1, aFileKey.length() - 1);
        UolVisitor aVisitor = UolVirtualMachine.execute(aRuntimePath + aFileKey + ".uol");

        if (aVisitor != null) {
            Stack<ImportLabel> aLabelStack = this.aDataManager.getDataMapContent(DataManager.IMPORT_LABEL_STACK);

            aLabelStack.forEach((aLabel) -> {
                ClassContent aClassContent = aVisitor.getClassContent(aLabel.getTrueLabel());
                if (aClassContent != null) {
                    this.aDataManager.setClassContent(aLabel.getSubLabel(), aClassContent);
                    return;
                }

                LambdaContent aLambdaContent = (LambdaContent) aVisitor.getFunctionContent(aLabel.getTrueLabel());
                if (aLambdaContent != null) {
                    this.aDataManager.setVariableContent(aLabel.getSubLabel(), aLambdaContent);
                    return;
                }

                Object aVarialbe = aVisitor.getGlobalVariable(aLabel.getTrueLabel());
                if (aVarialbe != null) {
                    this.aDataManager.setVariableContent(aLabel.getSubLabel(), aVarialbe);
                }
            });

            this.aDataManager.removeDataMapContent(DataManager.IMPORT_LABEL_STACK);
        }

        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    public Object visitPartsImportContent(uolParser.PartsImportContentContext ctx) {
        super.visitPartsImportContent(ctx);

        ImportLabel anImportLabel;

        // 1以上の場合、仮名と真名が存在する
        if (ctx.getChildCount() > 1) {
            anImportLabel = new ImportLabel(ctx.getChild(0).getText(), ctx.getChild(2).getText());
        } else {
            anImportLabel = new ImportLabel(ctx.getChild(0).getText());
        }

        this.aDataManager.setDataMapContentIfAbsent(DataManager.IMPORT_LABEL_STACK, new Stack<ImportLabel>());

        Stack<ImportLabel> aLabelStack = this.aDataManager.getDataMapContent(DataManager.IMPORT_LABEL_STACK);
        aLabelStack.push(anImportLabel);
        this.aDataManager.setDataMapContent(DataManager.IMPORT_LABEL_STACK, aLabelStack);

        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    public Object visitClassDefine(uolParser.ClassDefineContext ctx) {
        super.visitClassDefine(ctx);

        String aClassName = ctx.getChild(1).getText();

        HashMap<String, MemberContent> aMembers = this.aDataManager.getDataMapContent(DataManager.CACHE_MEMBER_MAP);
        HashMap<String, MessageContent> aMessages = this.aDataManager.getDataMapContent(DataManager.CACHE_MESSAGE_MAP);
        String aParentClassName = this.aDataManager.getDataMapContent(DataManager.CACHE_PARENT_CLASS_NAME);
        ClassContent aClassContent = new ClassContent(aClassName, aParentClassName, aMembers, aMessages);
        this.aDataManager.setClassContent(aClassName, aClassContent);

        this.aDataManager.setDataMapContent(DataManager.CACHE_PARENT_CLASS_NAME, "Object");
        this.aDataManager.removeDataMapContent(DataManager.CACHE_MEMBER_MAP);
        this.aDataManager.removeDataMapContent(DataManager.CACHE_MESSAGE_MAP);

        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    public Object visitExtendPart(uolParser.ExtendPartContext ctx) {
        super.visitExtendPart(ctx);

        String aParentClassName = ctx.getChild(1).getText();

        if (this.aDataManager.getClassContent(aParentClassName) == null) {
            try {
                throw new NotFoundSymbolError(aParentClassName, ctx);
            } catch (NotFoundSymbolError event) {
                event.printErrorMessages();
                System.exit(1);
            }
            return null;
        }

        this.aDataManager.setDataMapContent(DataManager.CACHE_PARENT_CLASS_NAME, aParentClassName);
        this.aDataManager.setDataMapContent(DataManager.CACHE_MEMBER_MAP,
                new HashMap<>(this.aDataManager.getClassContent(aParentClassName).getMembers()));

        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    public Object visitMessageDefine(uolParser.MessageDefineContext ctx) {
        super.visitMessageDefine(ctx);

        // 最後の要素の子要素の1番目のテキストがメッセージ名
        String aMessageName = ctx.getChild(ctx.getChildCount() - 1).getChild(1).getText();

        // 関数の名前付けがすでに実行されており、それをメッセージのLambdaContentとして利用する
        LambdaContent aLambda = (LambdaContent) this.aDataManager.getVariableContent(aMessageName);
        this.aDataManager.deleteVariableContent(aMessageName);

        // メンバに必要な情報の取得
        String aModifier = ctx.getChild(0).getText();
        String anInstruction = "none";

        // 子要素が3つの場合、指示コンテクストが存在する
        if (ctx.getChildCount() == 3) {
            anInstruction = ctx.getChild(1).getText();
        }

        MessageContent aMessageContent = new MessageContent(aModifier, anInstruction, aLambda);
        this.aDataManager.setDataMapContentIfAbsent(DataManager.CACHE_MESSAGE_MAP, new HashMap<String, MessageContent>());
        this.aDataManager.setDataMapDeepContent(DataManager.CACHE_MESSAGE_MAP, aMessageName, aMessageContent);

        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    public Object visitMemberDefine(uolParser.MemberDefineContext ctx) {
        super.visitMemberDefine(ctx);

        // 最後の要素の子要素の0番目のテキストがメンバ名
        String aMemberName = ctx.getChild(ctx.getChildCount() - 1).getChild(0).getText();

        // 変数Assignがすでに実行されており、それをメンバの値として利用する
        Object aValue = this.aDataManager.getVariableContent(aMemberName);
        // TODO クラス定義の前に、「メンバ名と同一の名 = value」のような式がある時、
        //  それが上書きされてしまう。ClassDefineの際に、getCurrentVariableHashMapから返されるMapを変更する必要がある
        this.aDataManager.deleteVariableContent(aMemberName);

        // メンバに必要な情報の取得
        String aModifier = ctx.getChild(0).getText();
        String anInstruction = "none";

        // 子要素が3つの場合、指示コンテクストが存在する
        if (ctx.getChildCount() == 3) {
            anInstruction = ctx.getChild(1).getText();
        }

        MemberContent aMemberContent = new MemberContent(aModifier, anInstruction, aValue);
        this.aDataManager.setDataMapContentIfAbsent(DataManager.CACHE_MEMBER_MAP, new HashMap<String, MemberContent>());
        this.aDataManager.setDataMapDeepContent(DataManager.CACHE_MEMBER_MAP, aMemberName, aMemberContent);

        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    public Object visitFunctionDefine(uolParser.FunctionDefineContext ctx) {
        super.visitFunctionDefine(ctx);
        String aFunctionName = ctx.getChild(1).getText();
        Object aLambdaContent = this.aDataManager.getaDataStack().pop();
        this.aDataManager.setVariableContent(aFunctionName, aLambdaContent);
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    public Object visitLambdaDefine(uolParser.LambdaDefineContext ctx) {
        super.visitLambdaDefine(ctx);
        LinkedHashMap<String, Object> anArgumentMap = this.aDataManager.getDataMapContent(DataManager.ARGUMENT_DEFINE_MAP);
        uolParser.ExpressionListContext aRunnableContext = (uolParser.ExpressionListContext) this.aDataManager.getaDataStack().pop();
        Integer aDefaultArgumentDefineCount = this.aDataManager.getCounter(DataManager.DEFAULT_ARGUMENT_DEFINE_COUNT).getCount();
        LambdaContent aLambdaContent = new LambdaContent(anArgumentMap, aDefaultArgumentDefineCount, aRunnableContext);
        this.aDataManager.getaDataStack().push(aLambdaContent);
        this.aDataManager.removeDataMapContent(DataManager.ARGUMENT_DEFINE_MAP);
//        this.aDataManager.getCounter(DataManager.DEFAULT_ARGUMENT_DEFINE_COUNT).reset();
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    public Object visitArgumentNonDefault(uolParser.ArgumentNonDefaultContext ctx) {
        super.visitArgumentNonDefault(ctx);
        String anIdentity = ctx.getChild(0).getText();
        PrimitiveContent aVariableContent = new PrimitiveContent(null, "nil");

        this.aDataManager.setDataMapContentIfAbsent(DataManager.ARGUMENT_DEFINE_MAP, new LinkedHashMap<String, Object>());
        this.aDataManager.setDataMapDeepContent(DataManager.ARGUMENT_DEFINE_MAP, anIdentity, aVariableContent);
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    public Object visitArgumentDefault(uolParser.ArgumentDefaultContext ctx) {
        super.visitArgumentDefault(ctx);
        String anIdentity = ctx.getChild(0).getText();
        Object aDefaultValue = this.aDataManager.getaDataStack().pop();

        this.aDataManager.setDataMapContentIfAbsent(DataManager.ARGUMENT_DEFINE_MAP, new LinkedHashMap<String, Object>());
        this.aDataManager.setDataMapDeepContent(DataManager.ARGUMENT_DEFINE_MAP, anIdentity, aDefaultValue);

        this.aDataManager.getCounter(DataManager.DEFAULT_ARGUMENT_DEFINE_COUNT).increment();

        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    public Object visitLambdaBody(uolParser.LambdaBodyContext ctx) {
        uolParser.ExpressionListContext anExpressionListContext = ctx.getChild(uolParser.ExpressionListContext.class, 0);
        this.aDataManager.getaDataStack().push(anExpressionListContext);
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    public Object visitReturnExpression(uolParser.ReturnExpressionContext ctx) {
        super.visitReturnExpression(ctx);
        this.aReturnValue = this.aDataManager.getaDataStack().pop();
        System.out.println("Return: " + this.aReturnValue);
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    public Object visitInstanceExpression(uolParser.InstanceExpressionContext ctx) {
        super.visitInstanceExpression(ctx);
        String aClassName = ctx.getChild(1).getText();

        ArrayList<Object> anArguments = this.aDataManager.getDataMapContent(DataManager.ARGUMENT_LIST);
        if (anArguments == null) {
            anArguments = new ArrayList<>();
        }
        InstanceContent anInstanceContent = this.createInstance(aClassName, anArguments);

        this.aDataManager.getaDataStack().push(anInstanceContent);
        this.aDataManager.removeDataMapContent(DataManager.ARGUMENT_LIST);
        return null;
    }

    /**
     * クラス名と引数を受け取り、インスタンスを生成するメッセージ
     *
     * @param aClassName  クラス名
     * @param anArguments 引数のリスト
     * @return InstanceContent
     */
    private InstanceContent createInstance(String aClassName, ArrayList<Object> anArguments) {
        ClassContent aClassContent = this.aDataManager.getClassContent(aClassName);
        if (aClassContent == null) {
            try {
                throw new NotFoundSymbolError(aClassName, null);
            } catch (NotFoundSymbolError event) {
                event.printErrorMessages();
                System.exit(1);
            }
        }

        String aParentClassName = aClassContent.getParentClassName();
        HashMap<String, MemberContent> aMembers = new HashMap<>(aClassContent.getMembers());
        InstanceContent anInstanceContent = new InstanceContent(aClassName, aParentClassName, aMembers);

        if (anArguments.size() <= 0) {
            anInstanceContent.execute(ClassContent.CONSTRUCT_METHOD, new ArrayList<>(), this);
        } else {
            anInstanceContent.execute(ClassContent.CONSTRUCT_METHOD, anArguments, this);
        }

        return anInstanceContent;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    public Object visitCallExpression(uolParser.CallExpressionContext ctx) {
        super.visitCallExpression(ctx);
        String aKey = ctx.getChild(0).getText();
        UolVisitor aFunctionRunnedVisitor = this.executeCall(aKey);

        if (aFunctionRunnedVisitor != null) {
            if (aFunctionRunnedVisitor.getReturnValue() != null) {
                this.aDataManager.getaDataStack().push(aFunctionRunnedVisitor.getReturnValue());
            }
        }

        this.aDataManager.removeDataMapContent(DataManager.ARGUMENT_LIST);
        this.aDataManager.getCounter(DataManager.ARGUMENT_COUNT).reset();

        return null;
    }

    private DataManager getDataManagerIfShouldBeTakenOver() {
        if (this.aDataManager.isShouldBeTakenOver()){
            return this.aDataManager;
        }
        return null;
    }

    private UolVisitor executeCall(String aKey) {
        Executable anExecutableContent = (Executable) this.aDataManager.getVariableContent(aKey);

        if (anExecutableContent != null) {
            try {
                ArrayList<Object> anArguments = this.aDataManager.getDataMapContent(DataManager.ARGUMENT_LIST);
                return anExecutableContent.execute(anArguments, this.getDataManagerIfShouldBeTakenOver());

            } catch (MissingArgumentsError error) {
                error.printErrorMessages();
                System.exit(1);
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    public Object visitArgumentContent(uolParser.ArgumentContentContext ctx) {
        super.visitArgumentContent(ctx);
        Object aValue = this.aDataManager.getaDataStack().pop();

        this.aDataManager.setDataMapContentIfAbsent(DataManager.ARGUMENT_LIST, new ArrayList<>());

        ArrayList<Object> anArgumentList = this.aDataManager.getDataMapContent(DataManager.ARGUMENT_LIST);
        anArgumentList.add(aValue);
        this.aDataManager.setDataMapContent(DataManager.ARGUMENT_LIST, anArgumentList);
        this.aDataManager.getCounter(DataManager.ARGUMENT_COUNT).increment();
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    public Object visitChainExpression(uolParser.ChainExpressionContext ctx) {
        super.visitChainExpression(ctx);
        this.aDataManager.releaseVariableMap();
        this.aDataManager.releaseSearchTargetClassName();
        this.aDataManager.getCounter(DataManager.CHAIN_COUNT).reset();
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    public Object visitElementExpression(uolParser.ElementExpressionContext ctx) {
        super.visitElementExpression(ctx);

        int chainableCount = ((ctx.parent.getChildCount() + 1) / 2) - 1;
        Integer currentChainCount = this.aDataManager.getCounter(DataManager.CHAIN_COUNT).getCount();

        if (chainableCount == currentChainCount) {
            return null;
        }
        Value aStackValue = (Value) this.aDataManager.getaDataStack().pop();
        Object aValue = aStackValue.value();

        if (aValue instanceof InstanceContent aChainableContent) {
            this.aDataManager.useVariableMap(aChainableContent.getValuesMap());
            this.aDataManager.setSearchTargetClassName(aChainableContent.getClassName());
        } else {
            try {
                throw new NotFoundSymbolError(aValue.toString(), ctx);
            } catch (NotFoundSymbolError event) {
                event.printErrorMessages();
                System.exit(1);
            }
        }

        this.aDataManager.getCounter(DataManager.CHAIN_COUNT).increment();
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    public Object visitAssignExpression(uolParser.AssignExpressionContext ctx) {
        this.aRawIdentityEvaluation = true;
        super.visitAssignExpression(ctx);
        this.aRawIdentityEvaluation = false;
        Object aVariableValue = this.aDataManager.getaDataStack().pop();
        String aVariableKey = (String) this.aDataManager.getaDataStack().pop();
        this.aDataManager.setVariableContent(aVariableKey, aVariableValue);
        System.out.println("Assign: " + aVariableKey + " = " + aVariableValue);
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    public Object visitLiteral(uolParser.LiteralContext ctx) {
        super.visitLiteral(ctx);
        switch (ctx.getStart().getType()) {
            case uolParser.NIL_LITERAL -> {
                PrimitiveContent aVariableContent = new PrimitiveContent(null, "nil");
                this.aDataManager.getaDataStack().push(aVariableContent);
            }
            case uolParser.IDENTIFIER -> {
                String anIdentity = ctx.getText();
                if (this.aRawIdentityEvaluation) {
                    this.aDataManager.getaDataStack().push(anIdentity);
                } else {
                    Object aVariableValue = this.aDataManager.getVariableContent(anIdentity);
                    this.aDataManager.getaDataStack().push(aVariableValue);
                }
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    public Object visitIntegerLiteral(uolParser.IntegerLiteralContext ctx) {
        super.visitIntegerLiteral(ctx);
//        switch (ctx.getStart().getType()) {
//            case uolParser.DECIMAL_LITERAL -> {
//                VariableContent aVariableContent = new VariableContent(Integer.parseInt(ctx.getText()), "integer");
//                this.aDataStack.push(aVariableContent);
//            }
//            case uolParser.HEX_LITERAL -> {
//                VariableContent aVariableContent = new VariableContent(Integer.parseInt(ctx.getText().substring(2), 16), "integer");
//                this.aDataStack.push(aVariableContent);
//            }
//            case uolParser.OCT_LITERAL -> {
//                VariableContent aVariableContent = new VariableContent(Integer.parseInt(ctx.getText().substring(2), 8), "integer");
//                this.aDataStack.push(aVariableContent);
//            }
//            case uolParser.BINARY_LITERAL -> {
//                VariableContent aVariableContent = new VariableContent(Integer.parseInt(ctx.getText().substring(2), 2), "integer");
//                this.aDataStack.push(aVariableContent);
//            }
//        }
        return null;
    }

    /**
     * 引数の文字列をキーとして、クラスマップよりクラスコンテンツを探し、応答するメッセージ
     *
     * @param aClassName クラスの名前
     * @return ClassContent または null
     */
    public ClassContent getClassContent(String aClassName) {
        return this.aDataManager.getClassContent(aClassName);
    }

    /**
     * 引数の文字列をキーとして、関数マップより関数コンテンツを探し、応答するメッセージ
     *
     * @param aFunctionName 関数の名前
     * @return FunctionContent または null
     */
    public Object getFunctionContent(String aFunctionName) {
        return this.aDataManager.getVariableContent(aFunctionName);
    }

    /**
     * 引数の文字列をキーとして、グローバル変数マップより変数の値を探し、応答するメッセージ
     *
     * @param aVariableName 変数の名前
     * @return Object または null
     */
    public Object getGlobalVariable(String aVariableName) {
        return this.aDataManager.getVariableContent(aVariableName);
    }

    /**
     * 戻り値を応答するメッセージ
     *
     * @return Object
     */
    public Object getReturnValue() {
        return this.aReturnValue;
    }

    /**
     * データマネージャーを応答するメッセージ
     *
     * @return DataManager
     */
    public DataManager getDataManager() {
        return this.aDataManager;
    }

    /**
     * データマネージャーを設定するメッセージ
     */
    public void setDataManager(DataManager aDataManager) {
        this.aDataManager = aDataManager;
    }


}
