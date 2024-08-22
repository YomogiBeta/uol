package ksu.yomogi.vm;

import ksu.yomogi.parser.uolBaseListener;
import ksu.yomogi.parser.uolParser;
import ksu.yomogi.vm.errors.NotFoundSymbolError;

import java.io.File;
import java.util.HashMap;
import java.util.Stack;

public class UolListener extends uolBaseListener {

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
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitProg(uolParser.ProgContext ctx) {
        super.exitProg(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitStatement(uolParser.StatementContext ctx) {
        super.exitStatement(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitExpression(uolParser.ExpressionContext ctx) {
        super.exitExpression(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitInstanceExpression(uolParser.InstanceExpressionContext ctx) {
        super.exitInstanceExpression(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitResponseExpression(uolParser.ResponseExpressionContext ctx) {
        super.exitResponseExpression(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitIterableExpression(uolParser.IterableExpressionContext ctx) {
        super.exitIterableExpression(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitExpressionList(uolParser.ExpressionListContext ctx) {
        super.exitExpressionList(ctx);

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitFileImportStatement(uolParser.FileImportStatementContext ctx) {
        super.exitFileImportStatement(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitPartsImportStatement(uolParser.PartsImportStatementContext ctx) {
        super.exitPartsImportStatement(ctx);

        String aFileKey = ctx.getChild(3).getText();
        aFileKey = aFileKey.replaceAll("\\.", File.separator);
        aFileKey = aFileKey.substring(1, aFileKey.length() - 1);
        UolListener aListener = UolVirtualMachine.execute(aRuntimePath + aFileKey + ".uol");

        if (aListener != null) {

            Stack<ImportLabel> aLabelStack = (Stack<ImportLabel>) this.aDataMap.get("importLabel");

            aLabelStack.forEach((aLabel) -> {
                ClassContent aClassContent = aListener.getClassContent(aLabel.getTrueLabel());
                if (aClassContent != null) {
                    this.aClassMap.put(aLabel.getSubLabel(), aClassContent);
                    return;
                }

                // TODO ファンクションマップ実装後作成

                Object aVarialbe = aListener.getGlobalVariable(aLabel.getTrueLabel());
                if (aVarialbe != null) {
                    this.aGlobalVariableMap.put(aLabel.getSubLabel(), aVarialbe);
                }
            });
        }

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitPartsImportContentList(uolParser.PartsImportContentListContext ctx) {
        super.exitPartsImportContentList(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitPartsImportContent(uolParser.PartsImportContentContext ctx) {
        super.exitPartsImportContent(ctx);
        ImportLabel anImportLabel = null;

        // 1以上の場合、仮名と真名が存在する
        if (ctx.getChildCount() > 1){
            anImportLabel = new ImportLabel(ctx.getChild(0).getText(), ctx.getChild(2).getText());
        } else {
            anImportLabel = new ImportLabel(ctx.getChild(0).getText());
        }

        Stack<ImportLabel> aLabelStack = new Stack<ImportLabel>();
        if (this.aDataMap.get("importLabel") != null) {
            aLabelStack = (Stack<ImportLabel>) this.aDataMap.get("importLabel");
        }
        aLabelStack.push(anImportLabel);
        this.aDataMap.put("importLabel", aLabelStack);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitClassDefine(uolParser.ClassDefineContext ctx) {
        super.exitClassDefine(ctx);
        String aClassName = ctx.getChild(1).getText();

        ClassContent aClassContent = new ClassContent(aClassName, this.aCacheParentClassName, this.aCacheMemberMap, this.aCacheMessageMap);
        this.aClassMap.put(aClassName, aClassContent);

        this.aCacheParentClassName = "Object";
        this.aCacheMemberMap = null;
        this.aCacheMessageMap = null;

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitExtendPart(uolParser.ExtendPartContext ctx) {
        super.exitExtendPart(ctx);

        String aParentClassName = ctx.getChild(1).getText();

        if (this.aClassMap.get(aParentClassName) == null) {
            try {
                throw new NotFoundSymbolError(aParentClassName, ctx);
            }catch (NotFoundSymbolError event){
                event.printErrorMessages();
            }
            return;
        }

        this.aCacheParentClassName = aParentClassName;
        this.aCacheMemberMap = new HashMap<>(this.aClassMap.get(aParentClassName).getMembers());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitInterfaceParts(uolParser.InterfacePartsContext ctx) {
        super.exitInterfaceParts(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitInterfaceList(uolParser.InterfaceListContext ctx) {
        super.exitInterfaceList(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitClassParts(uolParser.ClassPartsContext ctx) {
        super.exitClassParts(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitClassPartsList(uolParser.ClassPartsListContext ctx) {
        super.exitClassPartsList(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitMemberDefine(uolParser.MemberDefineContext ctx) {
        super.exitMemberDefine(ctx);

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
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitFunctionDefine(uolParser.FunctionDefineContext ctx) {
        super.exitFunctionDefine(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitArgumentNonDefault(uolParser.ArgumentNonDefaultContext ctx) {
        super.exitArgumentNonDefault(ctx);
        String anIdentity = ctx.getChild(0).getText();
        this.aDataStack.push(anIdentity);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitArgumentDefault(uolParser.ArgumentDefaultContext ctx) {
        super.exitArgumentDefault(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitLambdaDefine(uolParser.LambdaDefineContext ctx) {
        super.exitLambdaDefine(ctx);
        System.out.println("LambdaDefine");
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitReturnExpression(uolParser.ReturnExpressionContext ctx) {
        super.exitReturnExpression(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitLambdaBody(uolParser.LambdaBodyContext ctx) {
        super.exitLambdaBody(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitArgumentDefineList(uolParser.ArgumentDefineListContext ctx) {
        super.exitArgumentDefineList(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitArgumentDefaultList(uolParser.ArgumentDefaultListContext ctx) {
        super.exitArgumentDefaultList(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitBooleanConditionExpression(uolParser.BooleanConditionExpressionContext ctx) {
        super.exitBooleanConditionExpression(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitBooleanLoopExpression(uolParser.BooleanLoopExpressionContext ctx) {
        super.exitBooleanLoopExpression(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitForEachExpression(uolParser.ForEachExpressionContext ctx) {
        super.exitForEachExpression(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitConditionExpressionList(uolParser.ConditionExpressionListContext ctx) {
        super.exitConditionExpressionList(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitConditionExpression(uolParser.ConditionExpressionContext ctx) {
        super.exitConditionExpression(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitAssignExpression(uolParser.AssignExpressionContext ctx) {
        super.exitAssignExpression(ctx);
        Object aVariableValue = this.aDataStack.pop();
        String aVariableKey = (String) this.aDataStack.pop();
        this.getCurrentVariableHashMap().put(aVariableKey, aVariableValue);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitChainExpression(uolParser.ChainExpressionContext ctx) {
        super.exitChainExpression(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitCallExpression(uolParser.CallExpressionContext ctx) {
        super.exitCallExpression(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitArgumentList(uolParser.ArgumentListContext ctx) {
        super.exitArgumentList(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitAdditiveExpression(uolParser.AdditiveExpressionContext ctx) {
        super.exitAdditiveExpression(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitMultiplicativeExpression(uolParser.MultiplicativeExpressionContext ctx) {
        super.exitMultiplicativeExpression(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitUnaryExpression(uolParser.UnaryExpressionContext ctx) {
        super.exitUnaryExpression(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitListDefine(uolParser.ListDefineContext ctx) {
        super.exitListDefine(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitListDefineWithKey(uolParser.ListDefineWithKeyContext ctx) {
        super.exitListDefineWithKey(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitListDefineWithKeyContent(uolParser.ListDefineWithKeyContentContext ctx) {
        super.exitListDefineWithKeyContent(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitElementExpression(uolParser.ElementExpressionContext ctx) {
        super.exitElementExpression(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitLiteral(uolParser.LiteralContext ctx) {
        super.exitLiteral(ctx);
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
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    public void exitIntegerLiteral(uolParser.IntegerLiteralContext ctx) {
        super.exitIntegerLiteral(ctx);
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
