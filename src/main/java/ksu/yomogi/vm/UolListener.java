package ksu.yomogi.vm;

import ksu.yomogi.parser.uolBaseListener;
import ksu.yomogi.parser.uolParser;

import java.util.HashMap;
import java.util.Stack;

public class UolListener extends uolBaseListener {

    private Stack<Object> aDataStack = new Stack<Object>();
    private HashMap<String, PrimitiveContent> aGlobalVariableMap = new HashMap<String, PrimitiveContent>();

    private HashMap<String, ClassContent> aClassMap = new HashMap<String, ClassContent>();
    private HashMap<String, Object> aCacheMessageMap = null;
    private HashMap<String, MemberContent> aCacheMemberMap = null;


    private HashMap<String, PrimitiveContent> getCurrentVariableHashMap() {
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
        String aParentClassName = "Object";

        ClassContent aClassContent = new ClassContent(aClassName, aParentClassName, this.aCacheMemberMap, this.aCacheMessageMap);
        this.aClassMap.put(aClassName, aClassContent);

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
        PrimitiveContent aValue = this.getCurrentVariableHashMap().get(aMemberName);
        this.getCurrentVariableHashMap().remove(aMemberName);

        // メンバに必要な情報の取得
        String aModifier = ctx.getChild(0).getText();
        String anInstruction = "none";

        // 子要素が3つの場合、指示コンテクストが存在する
        if (ctx.getChildCount() == 3) {
            anInstruction = ctx.getChild(1).getText();
        }

        MemberContent aMemberContent = new MemberContent(aModifier, anInstruction, aValue.getValue(), aValue.getType());

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
    public void exitLambdaDefine(uolParser.LambdaDefineContext ctx) {
        super.exitLambdaDefine(ctx);
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
        String aVariableKey = ctx.getStart().getText();
        PrimitiveContent aVariableValue = (PrimitiveContent) this.aDataStack.pop();
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
}