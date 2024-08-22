// Generated from uol.g4 by ANTLR 4.5
package ksu.yomogi.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link uolParser}.
 */
public interface uolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link uolParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(uolParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(uolParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(uolParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(uolParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(uolParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(uolParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#responseExpression}.
	 * @param ctx the parse tree
	 */
	void enterResponseExpression(uolParser.ResponseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#responseExpression}.
	 * @param ctx the parse tree
	 */
	void exitResponseExpression(uolParser.ResponseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#iterableExpression}.
	 * @param ctx the parse tree
	 */
	void enterIterableExpression(uolParser.IterableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#iterableExpression}.
	 * @param ctx the parse tree
	 */
	void exitIterableExpression(uolParser.IterableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(uolParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(uolParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#fileImportStatement}.
	 * @param ctx the parse tree
	 */
	void enterFileImportStatement(uolParser.FileImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#fileImportStatement}.
	 * @param ctx the parse tree
	 */
	void exitFileImportStatement(uolParser.FileImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#partsImportStatement}.
	 * @param ctx the parse tree
	 */
	void enterPartsImportStatement(uolParser.PartsImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#partsImportStatement}.
	 * @param ctx the parse tree
	 */
	void exitPartsImportStatement(uolParser.PartsImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#partsImportContentList}.
	 * @param ctx the parse tree
	 */
	void enterPartsImportContentList(uolParser.PartsImportContentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#partsImportContentList}.
	 * @param ctx the parse tree
	 */
	void exitPartsImportContentList(uolParser.PartsImportContentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#partsImportContent}.
	 * @param ctx the parse tree
	 */
	void enterPartsImportContent(uolParser.PartsImportContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#partsImportContent}.
	 * @param ctx the parse tree
	 */
	void exitPartsImportContent(uolParser.PartsImportContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#classDefine}.
	 * @param ctx the parse tree
	 */
	void enterClassDefine(uolParser.ClassDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#classDefine}.
	 * @param ctx the parse tree
	 */
	void exitClassDefine(uolParser.ClassDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#extendPart}.
	 * @param ctx the parse tree
	 */
	void enterExtendPart(uolParser.ExtendPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#extendPart}.
	 * @param ctx the parse tree
	 */
	void exitExtendPart(uolParser.ExtendPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#interfaceParts}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceParts(uolParser.InterfacePartsContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#interfaceParts}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceParts(uolParser.InterfacePartsContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#interfaceList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceList(uolParser.InterfaceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#interfaceList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceList(uolParser.InterfaceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#classParts}.
	 * @param ctx the parse tree
	 */
	void enterClassParts(uolParser.ClassPartsContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#classParts}.
	 * @param ctx the parse tree
	 */
	void exitClassParts(uolParser.ClassPartsContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#classPartsList}.
	 * @param ctx the parse tree
	 */
	void enterClassPartsList(uolParser.ClassPartsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#classPartsList}.
	 * @param ctx the parse tree
	 */
	void exitClassPartsList(uolParser.ClassPartsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#memberDefine}.
	 * @param ctx the parse tree
	 */
	void enterMemberDefine(uolParser.MemberDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#memberDefine}.
	 * @param ctx the parse tree
	 */
	void exitMemberDefine(uolParser.MemberDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#functionDefine}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefine(uolParser.FunctionDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#functionDefine}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefine(uolParser.FunctionDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#lambdaDefine}.
	 * @param ctx the parse tree
	 */
	void enterLambdaDefine(uolParser.LambdaDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#lambdaDefine}.
	 * @param ctx the parse tree
	 */
	void exitLambdaDefine(uolParser.LambdaDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#returnExpression}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpression(uolParser.ReturnExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#returnExpression}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpression(uolParser.ReturnExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(uolParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(uolParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#argumentDefineList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentDefineList(uolParser.ArgumentDefineListContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#argumentDefineList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentDefineList(uolParser.ArgumentDefineListContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#arugumentNonDefaultList}.
	 * @param ctx the parse tree
	 */
	void enterArugumentNonDefaultList(uolParser.ArugumentNonDefaultListContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#arugumentNonDefaultList}.
	 * @param ctx the parse tree
	 */
	void exitArugumentNonDefaultList(uolParser.ArugumentNonDefaultListContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#argumentNonDefault}.
	 * @param ctx the parse tree
	 */
	void enterArgumentNonDefault(uolParser.ArgumentNonDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#argumentNonDefault}.
	 * @param ctx the parse tree
	 */
	void exitArgumentNonDefault(uolParser.ArgumentNonDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#argumentDefaultList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentDefaultList(uolParser.ArgumentDefaultListContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#argumentDefaultList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentDefaultList(uolParser.ArgumentDefaultListContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#argumentDefault}.
	 * @param ctx the parse tree
	 */
	void enterArgumentDefault(uolParser.ArgumentDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#argumentDefault}.
	 * @param ctx the parse tree
	 */
	void exitArgumentDefault(uolParser.ArgumentDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#instanceExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceExpression(uolParser.InstanceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#instanceExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceExpression(uolParser.InstanceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#booleanConditionExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanConditionExpression(uolParser.BooleanConditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#booleanConditionExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanConditionExpression(uolParser.BooleanConditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#booleanLoopExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLoopExpression(uolParser.BooleanLoopExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#booleanLoopExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLoopExpression(uolParser.BooleanLoopExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#forEachExpression}.
	 * @param ctx the parse tree
	 */
	void enterForEachExpression(uolParser.ForEachExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#forEachExpression}.
	 * @param ctx the parse tree
	 */
	void exitForEachExpression(uolParser.ForEachExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#conditionExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterConditionExpressionList(uolParser.ConditionExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#conditionExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitConditionExpressionList(uolParser.ConditionExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#conditionExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionExpression(uolParser.ConditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#conditionExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionExpression(uolParser.ConditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpression(uolParser.AssignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpression(uolParser.AssignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#assignAbleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignAbleExpression(uolParser.AssignAbleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#assignAbleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignAbleExpression(uolParser.AssignAbleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#chainExpression}.
	 * @param ctx the parse tree
	 */
	void enterChainExpression(uolParser.ChainExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#chainExpression}.
	 * @param ctx the parse tree
	 */
	void exitChainExpression(uolParser.ChainExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void enterCallExpression(uolParser.CallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void exitCallExpression(uolParser.CallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(uolParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(uolParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(uolParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(uolParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(uolParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(uolParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(uolParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(uolParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#listDefine}.
	 * @param ctx the parse tree
	 */
	void enterListDefine(uolParser.ListDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#listDefine}.
	 * @param ctx the parse tree
	 */
	void exitListDefine(uolParser.ListDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#listDefineWithKey}.
	 * @param ctx the parse tree
	 */
	void enterListDefineWithKey(uolParser.ListDefineWithKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#listDefineWithKey}.
	 * @param ctx the parse tree
	 */
	void exitListDefineWithKey(uolParser.ListDefineWithKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#listDefineWithKeyContent}.
	 * @param ctx the parse tree
	 */
	void enterListDefineWithKeyContent(uolParser.ListDefineWithKeyContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#listDefineWithKeyContent}.
	 * @param ctx the parse tree
	 */
	void exitListDefineWithKeyContent(uolParser.ListDefineWithKeyContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#elementExpression}.
	 * @param ctx the parse tree
	 */
	void enterElementExpression(uolParser.ElementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#elementExpression}.
	 * @param ctx the parse tree
	 */
	void exitElementExpression(uolParser.ElementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(uolParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(uolParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link uolParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(uolParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link uolParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(uolParser.IntegerLiteralContext ctx);
}