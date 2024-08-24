// Generated from uol.g4 by ANTLR 4.5
package ksu.yomogi.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link uolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface uolVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link uolParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(uolParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(uolParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(uolParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#responseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResponseExpression(uolParser.ResponseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#iterableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterableExpression(uolParser.IterableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(uolParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#fileImportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileImportStatement(uolParser.FileImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#partsImportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartsImportStatement(uolParser.PartsImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#partsImportContentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartsImportContentList(uolParser.PartsImportContentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#partsImportContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartsImportContent(uolParser.PartsImportContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#classDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefine(uolParser.ClassDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#extendPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendPart(uolParser.ExtendPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#interfaceParts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceParts(uolParser.InterfacePartsContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#interfaceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceList(uolParser.InterfaceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#classParts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassParts(uolParser.ClassPartsContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#classPartsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassPartsList(uolParser.ClassPartsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#memberDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDefine(uolParser.MemberDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#functionDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefine(uolParser.FunctionDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#lambdaDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaDefine(uolParser.LambdaDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#returnExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExpression(uolParser.ReturnExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(uolParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#argumentDefineList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentDefineList(uolParser.ArgumentDefineListContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#arugumentNonDefaultList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArugumentNonDefaultList(uolParser.ArugumentNonDefaultListContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#argumentNonDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentNonDefault(uolParser.ArgumentNonDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#argumentDefaultList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentDefaultList(uolParser.ArgumentDefaultListContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#argumentDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentDefault(uolParser.ArgumentDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#instanceExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceExpression(uolParser.InstanceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#booleanConditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanConditionExpression(uolParser.BooleanConditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#booleanLoopExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLoopExpression(uolParser.BooleanLoopExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#forEachExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachExpression(uolParser.ForEachExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#conditionExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionExpressionList(uolParser.ConditionExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#conditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionExpression(uolParser.ConditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#assignExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpression(uolParser.AssignExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#assignAbleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignAbleExpression(uolParser.AssignAbleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#chainExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainExpression(uolParser.ChainExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#callExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpression(uolParser.CallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(uolParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#argumentContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentContent(uolParser.ArgumentContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(uolParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(uolParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(uolParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#listDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDefine(uolParser.ListDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#listDefineWithKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDefineWithKey(uolParser.ListDefineWithKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#listDefineWithKeyContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDefineWithKeyContent(uolParser.ListDefineWithKeyContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#elementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementExpression(uolParser.ElementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(uolParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link uolParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(uolParser.IntegerLiteralContext ctx);
}