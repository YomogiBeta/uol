package ksu.yomogi.vm;

import ksu.yomogi.parser.uolBaseVisitor;
import ksu.yomogi.parser.uolParser;
import ksu.yomogi.vm.datamanager.DataManager;
import ksu.yomogi.vm.errors.PrimitiveMemberCallError;
import ksu.yomogi.vm.errors.NotFoundSymbolError;
import ksu.yomogi.vm.errors.PrivateMemberCallError;
import ksu.yomogi.vm.errors.UolRuntimeError;
import ksu.yomogi.vm.escapes.IfStatementReturnEscape;
import ksu.yomogi.vm.interfaces.Executable;
import ksu.yomogi.vm.interfaces.Value;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.function.BiFunction;

public class UolVisitor extends uolBaseVisitor<Object> {

    private DataManager aDataManager = new DataManager();

    private Object aReturnValue = null;
    private Boolean anIsSetReturnValue = false;

    private Boolean aRawIdentityEvaluation = false;

    private static final HashMap<String, BiFunction<Integer, Integer, Integer>> aCaluculations = new HashMap<>() {{

        BiFunction<Integer, Integer, Integer> aSubtractionFunction = (aFirst, aSecond) -> aFirst - aSecond;
        BiFunction<Integer, Integer, Integer> aMultiplicationFunction = (aFirst, aSecond) -> aFirst * aSecond;
        BiFunction<Integer, Integer, Integer> aDivistionFunction = (aFirst, aSecond) -> aFirst / aSecond;

        this.put("+", Integer::sum);
        this.put("-", aSubtractionFunction);
        this.put("*", aMultiplicationFunction);
        this.put("/", aDivistionFunction);
    }};

    private static final HashMap<String, BiFunction<Object, Object, Boolean>> aConditionalFunctions = new HashMap<>() {{
        BiFunction<Object, Object, Boolean> anEquals = (aFirst, aSecond) -> aSecond.equals(aFirst);
        BiFunction<Object, Object, Boolean> aLessThan = (aFirst, aSecond) -> {
            if (aFirst instanceof InstanceContent aFirstInstance && aSecond instanceof InstanceContent aSecondInstance) {
                Integer aFirstValue = (Integer) aFirstInstance.getMembers().get("aPrimitiveValue").getValue();
                Integer aSecondValue = (Integer) aSecondInstance.getMembers().get("aPrimitiveValue").getValue();
                return aFirstValue < aSecondValue;
            }
            return false;
        };
        BiFunction<Object, Object, Boolean> aMoreThan = (aFirst, aSecond) -> {
            if (aFirst instanceof InstanceContent aFirstInstance && aSecond instanceof InstanceContent aSecondInstance) {
                Integer aFirstValue = (Integer) aFirstInstance.getMembers().get("aPrimitiveValue").getValue();
                Integer aSecondValue = (Integer) aSecondInstance.getMembers().get("aPrimitiveValue").getValue();
                return aFirstValue > aSecondValue;
            }
            return false;
        };


        this.put("==", anEquals);
        this.put("<", aLessThan);
        this.put(">", aMoreThan);

    }};

    public void init() {
        this.importFile(ClassLoader.getSystemResourceAsStream("language/Object.uol"),"Object");
        this.importFile(ClassLoader.getSystemResourceAsStream("language/Number.uol"), "Number");
        this.importFile(ClassLoader.getSystemResourceAsStream("language/Integer.uol"), "Integer");
        this.importFile(ClassLoader.getSystemResourceAsStream("language/IO.uol"), "IO");
        this.importFile(ClassLoader.getSystemResourceAsStream("language/True.uol"), "True");
        this.importFile(ClassLoader.getSystemResourceAsStream("language/False.uol"), "False");
    }


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    public Object visitExpression(uolParser.ExpressionContext ctx) {
        if (this.getReturnValue() != null) {
            return null;
        }
        super.visitExpression(ctx);
        this.aDataManager.getCounter(DataManager.ARGUMENT_COUNT).reset();
        return null;
    }

    private void importFile(String aFilePath, String aLabel) {
        Stack<ImportLabel> aLabelStack = new Stack<>();
        aLabelStack.push(new ImportLabel("aLabel"));
        this.importFile(aFilePath, aLabelStack);
    }

    private void importFile(InputStream aStream, String aLabel) {
        Stack<ImportLabel> aLabelStack = new Stack<>();
        aLabelStack.push(new ImportLabel("aLabel"));
        this.importFile(aStream, aLabelStack);
    }

    private void importFile(String aFilePath, Stack<ImportLabel> aLabelStack) {
        InputStream aStream = null;
        try {
            aStream = new FileInputStream(aFilePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        this.importFile(aStream, aLabelStack);
        return;
    }

    private void importFile(InputStream aStream, Stack<ImportLabel> aLabelStack) {
        UolVisitor aVisitor = UolVirtualMachine.execute(aStream);

        if (aVisitor != null) {

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
        Stack<ImportLabel> aLabelStack = this.aDataManager.getDataMapContent(DataManager.IMPORT_LABEL_STACK);
        String aCurrentDirectory = System.getProperty("user.dir");
        this.importFile(aCurrentDirectory + File.separator + aFileKey + ".uol", aLabelStack);
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
        String aClassName = ctx.getChild(1).getText();
        this.aDataManager.setDataMapContent(DataManager.CACHE_CLASS_NAME, aClassName);
        super.visitClassDefine(ctx);

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

        String aClassName = this.aDataManager.getDataMapContent(DataManager.CACHE_CLASS_NAME);
        MessageContent aMessageContent = new MessageContent(aMessageName, aClassName, aModifier, anInstruction, aLambda);
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

        if (aValue instanceof Cloneable aCloneableValue) {
            try {
                aValue = aCloneableValue.getClass().getMethod("clone").invoke(aCloneableValue);
            } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException anError) {
                anError.printStackTrace();
            }
        }

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

        String aClassName = this.aDataManager.getDataMapContent(DataManager.CACHE_CLASS_NAME);
        MemberContent aMemberContent = new MemberContent(aMemberName, aClassName, aModifier, anInstruction, aValue);
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
        Object aLambdaContent = this.aDataManager.getDataStack().pop();
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
        uolParser.ExpressionListContext aRunnableContext = (uolParser.ExpressionListContext) this.aDataManager.getDataStack().pop();
        Integer aDefaultArgumentDefineCount = this.aDataManager.getCounter(DataManager.DEFAULT_ARGUMENT_DEFINE_COUNT).getCount();
        LambdaContent aLambdaContent = new LambdaContent(anArgumentMap, aDefaultArgumentDefineCount, aRunnableContext);
        this.aDataManager.getDataStack().push(aLambdaContent);
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
        Object aDefaultValue = this.aDataManager.getDataStack().pop();

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
        this.aDataManager.getDataStack().push(anExpressionListContext);
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
        if (this.aDataManager.getDataStack().isEmpty()) {
            this.setReturnValue(null);
            return null;
        }
        this.setReturnValue(this.aDataManager.getDataStack().pop());
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

        this.aDataManager.getDataStack().push(anInstanceContent);
        this.aDataManager.removeDataMapContent(DataManager.ARGUMENT_LIST);
        return null;
    }

    private InstanceContent createInstance(String aClassName, Object... anArguments) {
        ArrayList<Object> anArgumentsList = new ArrayList<>(List.of(anArguments));
        return this.createInstance(aClassName, anArgumentsList);
    }

    /**
     * クラス名と引数を受け取り、インスタンスを生成するメッセージ
     *
     * @param aClassName  クラス名
     * @param anArguments 引数のリスト
     * @return InstanceContent
     */
    private InstanceContent createInstance(String aClassName, ArrayList<Object> anArguments) {
        InstanceContent anInstanceContent = new InstanceContent(aClassName, this.aDataManager);
        this.aDataManager.setSearchTargetClassName(anInstanceContent);
        this.aDataManager.pushVariableMap((HashMap) anInstanceContent.getMembers());

        anInstanceContent.execute(ClassContent.CONSTRUCT_METHOD, anArguments, this);

        this.aDataManager.rollbackSearchTargetClassName();
        this.aDataManager.popVariableMap();

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
        this.aDataManager.setCurrentChainTarget(null);
        super.visitCallExpression(ctx);
        String aKey = ctx.getChild(0).getText();
        UolVisitor aFunctionRunnedVisitor = null;
        try {
            aFunctionRunnedVisitor = this.executeCall(aKey, ctx);
        } catch (IfStatementReturnEscape aIfStatementReturnEscape) {
            this.aDataManager.getDataStack().push(aIfStatementReturnEscape.getReturnValue());
        }

        if (aFunctionRunnedVisitor != null) {
            if (aFunctionRunnedVisitor.isSetReturnValue()) {
                this.aDataManager.getDataStack().push(aFunctionRunnedVisitor.getReturnValue());
            }
        }

        this.aDataManager.getCounter(DataManager.ARGUMENT_COUNT).reset();

        return null;
    }

    private UolVisitor executeCall(String aKey, uolParser.CallExpressionContext ctx) {
        Executable anExecutableContent = (Executable) this.aDataManager.getVariableContent(aKey);

        if (anExecutableContent != null) {
            try {
                ArrayList<Object> anArguments = this.aDataManager.getDataMapContent(DataManager.ARGUMENT_LIST);
//                if (anExecutableContent instanceof InstanceContent anInstanceContent){
//                    this.aDataManager.pushVariableMap((HashMap) anInstanceContent.getMembers());
//                }
                UolVisitor aResultVisitor = anExecutableContent.execute(anArguments, this.getDataManager());
//                if (anExecutableContent instanceof InstanceContent){
//                    this.aDataManager.popVariableMap();
//                }
                return aResultVisitor;
            } catch (UolRuntimeError error) {
                error.setContext(ctx);
                error.printErrorMessages();
                System.exit(1);
            }
        }

        try {
            throw new NotFoundSymbolError(aKey, ctx);
        } catch (NotFoundSymbolError event) {
            event.printErrorMessages();
            System.exit(1);
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
    public Object visitArgumentList(uolParser.ArgumentListContext ctx) {
        super.visitArgumentList(ctx);
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
        Object aValue = this.aDataManager.getDataStack().pop();

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
        this.aDataManager.setCurrentChainTarget(null);
        this.aDataManager.rollbackSearchTargetClassName();
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
        int chainableCount = ((ctx.parent.getChildCount() + 1) / 2) - 1;
        Integer currentChainCount = this.aDataManager.getCounter(DataManager.CHAIN_COUNT).getCount();

        boolean aCacheRawIdentityEvaluation = this.aRawIdentityEvaluation;
        if (chainableCount != currentChainCount) this.aRawIdentityEvaluation = false;
        super.visitElementExpression(ctx);
        this.aRawIdentityEvaluation = aCacheRawIdentityEvaluation;

        if (chainableCount == currentChainCount) {
            return null;
        }

        Value aStackValue = (Value) this.aDataManager.getDataStack().pop();
        Object aValue = null;

        try {
            aValue = aStackValue.value(this.aDataManager);
        } catch (PrivateMemberCallError | PrimitiveMemberCallError error) {
            error.setContext(ctx);
            error.printErrorMessages();
            System.exit(1);
        }

        if (aValue instanceof InstanceContent aChainableContent) {
            this.aDataManager.setCurrentChainTarget(aChainableContent);
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
        super.visitAssignExpression(ctx);
        Object aVariableValue = this.aDataManager.getDataStack().pop();
        String aVariableKey = (String) this.aDataManager.getDataStack().pop();
        Object aBeforeContent = this.aDataManager.getVariableContent(aVariableKey);


        if (aVariableValue instanceof Cloneable aCloneableValue) {
            try {
                aVariableValue = aCloneableValue.getClass().getMethod("clone").invoke(aCloneableValue);
            } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException anError) {
                anError.printStackTrace();
            }
        }

        if (aBeforeContent instanceof MemberContent aMemberContent) {
            aMemberContent.setValue(aVariableValue, this.aDataManager);
            return null;
        }

//        System.out.println("Assign: " + aVariableKey + " = " + aVariableValue);

        this.aDataManager.setVariableContent(aVariableKey, aVariableValue);
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
    public Object visitBooleanConditionExpression(uolParser.BooleanConditionExpressionContext ctx) {
        super.visitBooleanConditionExpression(ctx);

        Integer aCount = ctx.getChildCount();

        LambdaContent aFirstExecutableContent = null;
        LambdaContent aSecondExecutableContent = null;

        if (aCount == 4) {
            aSecondExecutableContent = (LambdaContent) this.aDataManager.getDataStack().pop();
            aFirstExecutableContent = (LambdaContent) this.aDataManager.getDataStack().pop();
        } else {
            aFirstExecutableContent = (LambdaContent) this.aDataManager.getDataStack().pop();
        }

        Boolean aBool = (Boolean) this.aDataManager.getDataStack().pop();
        String aBoolClassName = aBool ? "True" : "False";

        InstanceContent anInstanceContent = new InstanceContent(aBoolClassName, this.aDataManager);
        UolVisitor aFirstVisitor = anInstanceContent.execute("ifThenTrue", new ArrayList<>(List.of(aFirstExecutableContent)), this);
        UolVisitor aSecondVisitor = null;
        if (aSecondExecutableContent != null)
            aSecondVisitor = anInstanceContent.execute("ifThenFalse", new ArrayList<>(List.of(aSecondExecutableContent)), this);
        this.escapeByIfStatementReturn(aFirstVisitor);
        this.escapeByIfStatementReturn(aSecondVisitor);
        return null;
    }

    private void escapeByIfStatementReturn(UolVisitor aVisitor) throws IfStatementReturnEscape {
        if (aVisitor == null) return;
        if (aVisitor.getReturnValue() != null) {
            IfStatementReturnEscape anEscape = new IfStatementReturnEscape();
            anEscape.setReturnValue(aVisitor.getReturnValue());
            throw anEscape;
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    public Object visitConditionExpression(uolParser.ConditionExpressionContext ctx) {
        super.visitConditionExpression(ctx);

        Object aSecond = this.aDataManager.getDataStack().pop();
        Object aFirst = this.aDataManager.getDataStack().pop();

        String aConditionalOperator = ctx.getToken(uolParser.CONDITIONAL_OPERATOR, 0).toString();

        Boolean aResult = this.aConditionalFunctions.get(aConditionalOperator).apply(aFirst, aSecond);
        this.aDataManager.getDataStack().push(aResult);
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
    public Object visitConditionBody(uolParser.ConditionBodyContext ctx) {
        uolParser.ExpressionListContext anExpressionListContext = ctx.getChild(uolParser.ExpressionListContext.class, 0);
        LambdaContent aLambdaContent = new LambdaContent(new LinkedHashMap<>(), 0, anExpressionListContext);
        this.aDataManager.getDataStack().push(aLambdaContent);
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
    public Object visitConditionAnotherBody(uolParser.ConditionAnotherBodyContext ctx) {
        uolParser.ExpressionListContext anExpressionListContext = ctx.getChild(uolParser.ExpressionListContext.class, 0);
        LambdaContent aLambdaContent = new LambdaContent(new LinkedHashMap<>(), 0, anExpressionListContext);
        this.aDataManager.getDataStack().push(aLambdaContent);
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
    public Object visitAssignAbleExpression(uolParser.AssignAbleExpressionContext ctx) {
        this.aRawIdentityEvaluation = true;
        super.visitAssignAbleExpression(ctx);
        this.aRawIdentityEvaluation = false;
        return null;
    }

    private void applyCalculation(List<TerminalNode> anOperators) {
        anOperators = anOperators.reversed();
        anOperators.forEach((anOperator) -> {
            Object aSecond = this.aDataManager.getDataStack().pop();
            Object aFirst = this.aDataManager.getDataStack().pop();

            Integer aSecondValue = this.getNumberPrimitive(aSecond);
            Integer aFirstValue = this.getNumberPrimitive(aFirst);
            Integer aResult = aCaluculations.get(anOperator.toString()).apply(aFirstValue, aSecondValue);

            this.aDataManager.getDataStack().push(this.createInstance("Integer",aResult));
        });
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    public Object visitAdditiveExpression(uolParser.AdditiveExpressionContext ctx) {
        super.visitAdditiveExpression(ctx);
        List<TerminalNode> anOperators = ctx.ADDITIVE_OPERATOR();
        this.applyCalculation(anOperators);
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
    public Object visitMultiplicativeExpression(uolParser.MultiplicativeExpressionContext ctx) {
        super.visitMultiplicativeExpression(ctx);
        List<TerminalNode> anOperators = ctx.MULTIPLY_OPERATOR();
        this.applyCalculation(anOperators);
        return null;
    }

    private Integer getNumberPrimitive(Object anObject) {
        if (anObject instanceof InstanceContent anInstance) {
            UolVisitor aSecondVisitor = this.primitiveOnlyMessageCall(anInstance, "getPrimitiveValue", new ArrayList<>());
            return (Integer) aSecondVisitor.getReturnValue();
        }
        return (Integer) anObject;
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
                this.aDataManager.getDataStack().push(aVariableContent);
            }
            case uolParser.IDENTIFIER -> {
                String anIdentity = ctx.getText();
                if (this.aRawIdentityEvaluation) {
                    this.aDataManager.getDataStack().push(anIdentity);
                } else {
                    try {
                        Object aVariableValue = this.aDataManager.getVariableContent(anIdentity);
                        if (aVariableValue instanceof Value) {
                            this.aDataManager.getDataStack().push(((Value<?>) aVariableValue).value(this.aDataManager));
                        } else {
                            this.aDataManager.getDataStack().push(aVariableValue);
                        }
                    } catch (PrivateMemberCallError error) {
                        error.setContext(ctx);
                        error.printErrorMessages();
                        System.exit(1);
                    }
                }
            }
            case uolParser.STRING_LITERAL -> {
                String aString = ctx.getText();
                aString = aString.substring(1, aString.length() - 1);
                this.aDataManager.getDataStack().push(aString);
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
        switch (ctx.getStart().getType()) {
            case uolParser.DECIMAL_LITERAL -> {
                InstanceContent aVariableContent = this.createInstance("Integer", Integer.valueOf(ctx.getText()));
                this.aDataManager.getDataStack().push(aVariableContent);
            }
            case uolParser.HEX_LITERAL -> {
                InstanceContent aVariableContent = createInstance("Integer", Integer.valueOf(ctx.getText().substring(2), 16));
                this.aDataManager.getDataStack().push(aVariableContent);
            }
            case uolParser.OCT_LITERAL -> {
                InstanceContent aVariableContent = createInstance("Integer", Integer.valueOf(ctx.getText().substring(2), 8));
                this.aDataManager.getDataStack().push(aVariableContent);
            }
            case uolParser.BINARY_LITERAL -> {
                InstanceContent aVariableContent = createInstance("Integer", Integer.valueOf(ctx.getText().substring(2), 2));
                this.aDataManager.getDataStack().push(aVariableContent);
            }
        }
        return null;
    }

    private UolVisitor primitiveOnlyMessageCall(InstanceContent anInstance, String aMessage, ArrayList<Object> anArguments) {
        this.aDataManager.setSearchTargetClassName(anInstance);
        this.aDataManager.setPrimitiveOnlyMode(true);
        this.aDataManager.pushVariableMap((HashMap) anInstance.getMembers());
        this.aDataManager.pushStackTrace(anInstance);
        UolVisitor aUolVisitor = anInstance.execute(aMessage, anArguments, this);
        this.aDataManager.popStackTrace();
        this.aDataManager.popVariableMap();
        this.aDataManager.setPrimitiveOnlyMode(false);
        this.aDataManager.rollbackSearchTargetClassName();
        return aUolVisitor;
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
     * 戻り値を設定するメッセージ
     *
     * @param aReturnValue 戻り値
     * @return void
     */
    public void setReturnValue(Object aReturnValue) {
        this.aReturnValue = aReturnValue;
        this.anIsSetReturnValue = true;
    }

    /**
     * 戻り値の設定がされているかを応答するメッセージ
     * @return boolean
     */
    public boolean isSetReturnValue() {
        return this.anIsSetReturnValue;
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

    public String toString(){
        return "UolVisitor";
    }

    public boolean equals(Object anObject){
        if (anObject == null) return false;
        if (anObject == this) return true;
        if (anObject instanceof UolVisitor anOther){
            return this.aDataManager.equals(anOther.getDataManager())
                    && this.aReturnValue.equals(anOther.getReturnValue())
                    && this.aRawIdentityEvaluation == anOther.aRawIdentityEvaluation;
        }
        return false;
    }

    public int hashCode(){
        return this.aDataManager.hashCode() + this.aReturnValue.hashCode() + Boolean.hashCode(this.aRawIdentityEvaluation);
    }


}
