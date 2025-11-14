// Generated from /Users/sergio.sacramento/code/podium/av3-java-compiler/grammar/Av3.g4 by ANTLR 4.13.1
package com.teoria_computacao.av3.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Av3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Av3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Av3Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(Av3Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link Av3Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(Av3Parser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarInitDecl}
	 * labeled alternative in {@link Av3Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarInitDecl(Av3Parser.VarInitDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Av3Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Av3Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtAssign}
	 * labeled alternative in {@link Av3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtAssign(Av3Parser.StmtAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtIfElse}
	 * labeled alternative in {@link Av3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtIfElse(Av3Parser.StmtIfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtWhile}
	 * labeled alternative in {@link Av3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtWhile(Av3Parser.StmtWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtDoWhile}
	 * labeled alternative in {@link Av3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtDoWhile(Av3Parser.StmtDoWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtFor}
	 * labeled alternative in {@link Av3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtFor(Av3Parser.StmtForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtPrintf}
	 * labeled alternative in {@link Av3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtPrintf(Av3Parser.StmtPrintfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtScanf}
	 * labeled alternative in {@link Av3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtScanf(Av3Parser.StmtScanfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtBlock}
	 * labeled alternative in {@link Av3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtBlock(Av3Parser.StmtBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Av3Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Av3Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Av3Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Av3Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Av3Parser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(Av3Parser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForVarDecl}
	 * labeled alternative in {@link Av3Parser#forDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForVarDecl(Av3Parser.ForVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInitDecl}
	 * labeled alternative in {@link Av3Parser#forDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitDecl(Av3Parser.ForInitDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Av3Parser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(Av3Parser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Av3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Av3Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Av3Parser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(Av3Parser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Av3Parser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(Av3Parser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Av3Parser#eqExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpression(Av3Parser.EqExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Av3Parser#relExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpression(Av3Parser.RelExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Av3Parser#addExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(Av3Parser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Av3Parser#mulExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpression(Av3Parser.MulExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Av3Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(Av3Parser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Av3Parser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(Av3Parser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Av3Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Av3Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Av3Parser#printfArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintfArgs(Av3Parser.PrintfArgsContext ctx);
}