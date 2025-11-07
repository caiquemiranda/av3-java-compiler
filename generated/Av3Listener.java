// Generated from /Users/sergio.sacramento/code/podium/av3-java-compiler/grammar/Av3.g4 by ANTLR 4.13.1
package com.teoria_computacao.av3.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Av3Parser}.
 */
public interface Av3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Av3Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Av3Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Av3Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Av3Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link Av3Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(Av3Parser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link Av3Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(Av3Parser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarInitDecl}
	 * labeled alternative in {@link Av3Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterVarInitDecl(Av3Parser.VarInitDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarInitDecl}
	 * labeled alternative in {@link Av3Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitVarInitDecl(Av3Parser.VarInitDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Av3Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Av3Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Av3Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Av3Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtAssign}
	 * labeled alternative in {@link Av3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtAssign(Av3Parser.StmtAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtAssign}
	 * labeled alternative in {@link Av3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtAssign(Av3Parser.StmtAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtIfElse}
	 * labeled alternative in {@link Av3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtIfElse(Av3Parser.StmtIfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtIfElse}
	 * labeled alternative in {@link Av3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtIfElse(Av3Parser.StmtIfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtWhile}
	 * labeled alternative in {@link Av3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtWhile(Av3Parser.StmtWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtWhile}
	 * labeled alternative in {@link Av3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtWhile(Av3Parser.StmtWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtDoWhile}
	 * labeled alternative in {@link Av3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtDoWhile(Av3Parser.StmtDoWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtDoWhile}
	 * labeled alternative in {@link Av3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtDoWhile(Av3Parser.StmtDoWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtFor}
	 * labeled alternative in {@link Av3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtFor(Av3Parser.StmtForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtFor}
	 * labeled alternative in {@link Av3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtFor(Av3Parser.StmtForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtPrintf}
	 * labeled alternative in {@link Av3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtPrintf(Av3Parser.StmtPrintfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtPrintf}
	 * labeled alternative in {@link Av3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtPrintf(Av3Parser.StmtPrintfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtScanf}
	 * labeled alternative in {@link Av3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtScanf(Av3Parser.StmtScanfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtScanf}
	 * labeled alternative in {@link Av3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtScanf(Av3Parser.StmtScanfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtBlock}
	 * labeled alternative in {@link Av3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtBlock(Av3Parser.StmtBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtBlock}
	 * labeled alternative in {@link Av3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtBlock(Av3Parser.StmtBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Av3Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Av3Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Av3Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Av3Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Av3Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Av3Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Av3Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Av3Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Av3Parser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(Av3Parser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Av3Parser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(Av3Parser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForVarDecl}
	 * labeled alternative in {@link Av3Parser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForVarDecl(Av3Parser.ForVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForVarDecl}
	 * labeled alternative in {@link Av3Parser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForVarDecl(Av3Parser.ForVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInitDecl}
	 * labeled alternative in {@link Av3Parser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForInitDecl(Av3Parser.ForInitDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitDecl}
	 * labeled alternative in {@link Av3Parser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForInitDecl(Av3Parser.ForInitDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Av3Parser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(Av3Parser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Av3Parser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(Av3Parser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Av3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Av3Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Av3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Av3Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Av3Parser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(Av3Parser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Av3Parser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(Av3Parser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Av3Parser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(Av3Parser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Av3Parser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(Av3Parser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Av3Parser#eqExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqExpression(Av3Parser.EqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Av3Parser#eqExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqExpression(Av3Parser.EqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Av3Parser#relExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelExpression(Av3Parser.RelExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Av3Parser#relExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelExpression(Av3Parser.RelExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Av3Parser#addExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(Av3Parser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Av3Parser#addExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(Av3Parser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Av3Parser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpression(Av3Parser.MulExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Av3Parser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpression(Av3Parser.MulExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Av3Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(Av3Parser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Av3Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(Av3Parser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Av3Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(Av3Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Av3Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(Av3Parser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Av3Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Av3Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Av3Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Av3Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Av3Parser#printfArgs}.
	 * @param ctx the parse tree
	 */
	void enterPrintfArgs(Av3Parser.PrintfArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Av3Parser#printfArgs}.
	 * @param ctx the parse tree
	 */
	void exitPrintfArgs(Av3Parser.PrintfArgsContext ctx);
}