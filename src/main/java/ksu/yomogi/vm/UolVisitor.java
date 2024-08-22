package ksu.yomogi.vm;

import ksu.yomogi.parser.uolBaseVisitor;
import ksu.yomogi.parser.uolParser;
import ksu.yomogi.vm.errors.NotFoundSymbolError;

import java.io.File;
import java.util.HashMap;
import java.util.Stack;

public class UolVisitor extends uolBaseVisitor {

    private final static String aRuntimePath = "src/main/resources/";

    private Stack<Object> aDataStack = new Stack<Object>();
    private HashMap<String, Object> aDataMap = new HashMap<String, Object>();
    private HashMap<String, Object> aGlobalVariableMap = new HashMap<String, Object>();

    private HashMap<String, ClassContent> aClassMap = new HashMap<String, ClassContent>();
    private HashMap<String, Object> aCacheMessageMap = null;
    private HashMap<String, MemberContent> aCacheMemberMap = null;
    private String aCacheParentClassName = "Object";

    private HashMap<String, Object> getCurrentVariableHashMap() {
        return this.aGlobalVariableMap;
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
            Stack<ImportLabel> aLabelStack = (Stack<ImportLabel>) this.aDataMap.get("importLabel");

            aLabelStack.forEach((aLabel) -> {
                ClassContent aClassContent = aVisitor.getClassContent(aLabel.getTrueLabel());
                if (aClassContent != null) {
                    this.aClassMap.put(aLabel.getSubLabel(), aClassContent);
                    return;
                }

                // TODO ファンクションマップ実装後作成

                Object aVarialbe = aVisitor.getGlobalVariable(aLabel.getTrueLabel());
                if (aVarialbe != null) {
                    this.aGlobalVariableMap.put(aLabel.getSubLabel(), aVarialbe);
                }
            });
            this.aDataMap.remove("importLabel");
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

        ImportLabel anImportLabel = null;

        // 1以上の場合、仮名と真名が存在する
        if (ctx.getChildCount() > 1){
            anImportLabel = new ImportLabel(ctx.getChild(0).getText(), ctx.getChild(2).getText());
        } else {
            anImportLabel = new ImportLabel(ctx.getChild(0).getText());
        }

        this.aDataMap.computeIfAbsent("importLabel", k -> new Stack<ImportLabel>());

        Stack<ImportLabel> aLabelStack = (Stack<ImportLabel>) this.aDataMap.get("importLabel");
        aLabelStack.push(anImportLabel);
        this.aDataMap.put("importLabel", aLabelStack);

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

        ClassContent aClassContent = new ClassContent(aClassName, this.aCacheParentClassName, this.aCacheMemberMap, this.aCacheMessageMap);
        this.aClassMap.put(aClassName, aClassContent);

        this.aCacheParentClassName = "Object";
        this.aCacheMemberMap = null;
        this.aCacheMessageMap = null;

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

        if (this.aClassMap.get(aParentClassName) == null) {
            try {
                throw new NotFoundSymbolError(aParentClassName, ctx);
            }catch (NotFoundSymbolError event){
                event.printErrorMessages();
            }
            return null;
        }

        this.aCacheParentClassName = aParentClassName;
        this.aCacheMemberMap = new HashMap<>(this.aClassMap.get(aParentClassName).getMembers());

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
        Object aValue = this.getCurrentVariableHashMap().get(aMemberName);
        this.getCurrentVariableHashMap().remove(aMemberName);

        // メンバに必要な情報の取得
        String aModifier = ctx.getChild(0).getText();
        String anInstruction = "none";

        // 子要素が3つの場合、指示コンテクストが存在する
        if (ctx.getChildCount() == 3) {
            anInstruction = ctx.getChild(1).getText();
        }

        MemberContent aMemberContent = new MemberContent(aModifier, anInstruction, aValue);

        if (this.aCacheMemberMap == null) {
            this.aCacheMemberMap = new HashMap<String, MemberContent>();
        }
        this.aCacheMemberMap.put(aMemberName, aMemberContent);

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

        this.aDataMap.computeIfAbsent("arguments", k -> new HashMap<String, Object>());

        HashMap<String, Object> anArgumentMap = (HashMap<String, Object>) this.aDataMap.get("arguments");
        anArgumentMap.put(anIdentity, aVariableContent);
        this.aDataMap.put("arguments", anArgumentMap);
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
        Object aDefaultValue = this.aDataStack.pop();

        this.aDataMap.computeIfAbsent("arguments", _ -> new HashMap<String, Object>());
        HashMap<String, Object> anArgumentMap = (HashMap<String, Object>) this.aDataMap.get("arguments");
        anArgumentMap.put(anIdentity, aDefaultValue);
        this.aDataMap.put("arguments", anArgumentMap);

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
        Object aVariableValue = this.aDataStack.pop();
        String aVariableKey = (String) this.aDataStack.pop();
        this.getCurrentVariableHashMap().put(aVariableKey, aVariableValue);
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
                this.aDataStack.push(aVariableContent);
            }
            case uolParser.IDENTIFIER -> {
                String anIdentity = ctx.getText();
                this.aDataStack.push(anIdentity);
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
     * @param aClassName クラスの名前
     * @return ClassContent または null
     */
    public ClassContent getClassContent(String aClassName) {
        return this.aClassMap.get(aClassName);
    }

    /**
     * 引数の文字列をキーとして、関数マップより関数コンテンツを探し、応答するメッセージ
     * @param aFunctionName 関数の名前
     * @return FunctionContent または null
     */
    public Object getFunctionContent(String aFunctionName) {
        // TODO ファンクションマップ実装後作成
        return null;
    }

    /**
     * 引数の文字列をキーとして、グローバル変数マップより変数の値を探し、応答するメッセージ
     * @param aVariableName 変数の名前
     * @return Object または null
     */
    public Object getGlobalVariable(String aVariableName) {
        return this.aGlobalVariableMap.get(aVariableName);
    }

}
