// Generated from Av3.g4 by ANTLR 4.13.1

package com.teoria_computacao.av3.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Av3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, WHILE=3, DO=4, FOR=5, PRINTF=6, SCANF=7, INT_T=8, DOUBLE_T=9, 
		BOOL_T=10, TRUE=11, FALSE=12, PLUS=13, MINUS=14, MUL=15, DIV=16, MOD=17, 
		EQ=18, NEQ=19, LT=20, LTE=21, GT=22, GTE=23, AND=24, OR=25, NOT=26, ASSIGN=27, 
		LPAREN=28, RPAREN=29, LBRACE=30, RBRACE=31, COMMA=32, SEMI=33, ID=34, 
		DOUBLE_LIT=35, INT_LIT=36, BOOL_LIT=37, STRING_LIT=38, WS=39, LINE_COMMENT=40, 
		BLOCK_COMMENT=41;
	public static final int
		RULE_prog = 0, RULE_declaration = 1, RULE_type = 2, RULE_statement = 3, 
		RULE_block = 4, RULE_assignment = 5, RULE_forInit = 6, RULE_forDeclaration = 7, 
		RULE_forUpdate = 8, RULE_expression = 9, RULE_orExpression = 10, RULE_andExpression = 11, 
		RULE_eqExpression = 12, RULE_relExpression = 13, RULE_addExpression = 14, 
		RULE_mulExpression = 15, RULE_unaryExpression = 16, RULE_primary = 17, 
		RULE_literal = 18, RULE_bool_lit = 19, RULE_printfArgs = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declaration", "type", "statement", "block", "assignment", "forInit", 
			"forDeclaration", "forUpdate", "expression", "orExpression", "andExpression", 
			"eqExpression", "relExpression", "addExpression", "mulExpression", "unaryExpression", 
			"primary", "literal", "bool_lit", "printfArgs"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'while'", "'do'", "'for'", "'printf'", "'scanf'", 
			"'int'", "'double'", "'bool'", "'true'", "'false'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'&&'", "'||'", 
			"'!'", "'='", "'('", "')'", "'{'", "'}'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "WHILE", "DO", "FOR", "PRINTF", "SCANF", "INT_T", 
			"DOUBLE_T", "BOOL_T", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", "DIV", 
			"MOD", "EQ", "NEQ", "LT", "LTE", "GT", "GTE", "AND", "OR", "NOT", "ASSIGN", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "COMMA", "SEMI", "ID", "DOUBLE_LIT", 
			"INT_LIT", "BOOL_LIT", "STRING_LIT", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Av3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Av3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Av3Parser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(44);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_T:
				case DOUBLE_T:
				case BOOL_T:
					{
					setState(42);
					declaration();
					}
					break;
				case IF:
				case WHILE:
				case DO:
				case FOR:
				case PRINTF:
				case SCANF:
				case LBRACE:
				case ID:
					{
					setState(43);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 18253613050L) != 0) );
			setState(48);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends DeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(Av3Parser.ID, 0); }
		public TerminalNode SEMI() { return getToken(Av3Parser.SEMI, 0); }
		public VarDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarInitDeclContext extends DeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(Av3Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Av3Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Av3Parser.SEMI, 0); }
		public VarInitDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterVarInitDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitVarInitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitVarInitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new VarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				type();
				setState(51);
				match(ID);
				setState(52);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new VarInitDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				type();
				setState(55);
				match(ID);
				setState(56);
				match(ASSIGN);
				setState(57);
				expression();
				setState(58);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_T() { return getToken(Av3Parser.INT_T, 0); }
		public TerminalNode DOUBLE_T() { return getToken(Av3Parser.DOUBLE_T, 0); }
		public TerminalNode BOOL_T() { return getToken(Av3Parser.BOOL_T, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtScanfContext extends StatementContext {
		public TerminalNode SCANF() { return getToken(Av3Parser.SCANF, 0); }
		public TerminalNode LPAREN() { return getToken(Av3Parser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(Av3Parser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(Av3Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(Av3Parser.SEMI, 0); }
		public StmtScanfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterStmtScanf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitStmtScanf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitStmtScanf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtPrintfContext extends StatementContext {
		public TerminalNode PRINTF() { return getToken(Av3Parser.PRINTF, 0); }
		public TerminalNode LPAREN() { return getToken(Av3Parser.LPAREN, 0); }
		public PrintfArgsContext printfArgs() {
			return getRuleContext(PrintfArgsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Av3Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(Av3Parser.SEMI, 0); }
		public StmtPrintfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterStmtPrintf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitStmtPrintf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitStmtPrintf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtBlockContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StmtBlockContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterStmtBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitStmtBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitStmtBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtWhileContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(Av3Parser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(Av3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Av3Parser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StmtWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterStmtWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitStmtWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitStmtWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtIfElseContext extends StatementContext {
		public TerminalNode IF() { return getToken(Av3Parser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(Av3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Av3Parser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Av3Parser.ELSE, 0); }
		public StmtIfElseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterStmtIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitStmtIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitStmtIfElse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtDoWhileContext extends StatementContext {
		public TerminalNode DO() { return getToken(Av3Parser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(Av3Parser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(Av3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Av3Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(Av3Parser.SEMI, 0); }
		public StmtDoWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterStmtDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitStmtDoWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitStmtDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtForContext extends StatementContext {
		public TerminalNode FOR() { return getToken(Av3Parser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(Av3Parser.LPAREN, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(Av3Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Av3Parser.SEMI, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Av3Parser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StmtForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterStmtFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitStmtFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitStmtFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtAssignContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Av3Parser.SEMI, 0); }
		public StmtAssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterStmtAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitStmtAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitStmtAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new StmtAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				assignment();
				setState(65);
				match(SEMI);
				}
				break;
			case IF:
				_localctx = new StmtIfElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(IF);
				setState(68);
				match(LPAREN);
				setState(69);
				expression();
				setState(70);
				match(RPAREN);
				setState(71);
				statement();
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(72);
					match(ELSE);
					setState(73);
					statement();
					}
					break;
				}
				}
				break;
			case WHILE:
				_localctx = new StmtWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(WHILE);
				setState(77);
				match(LPAREN);
				setState(78);
				expression();
				setState(79);
				match(RPAREN);
				setState(80);
				statement();
				}
				break;
			case DO:
				_localctx = new StmtDoWhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				match(DO);
				setState(83);
				statement();
				setState(84);
				match(WHILE);
				setState(85);
				match(LPAREN);
				setState(86);
				expression();
				setState(87);
				match(RPAREN);
				setState(88);
				match(SEMI);
				}
				break;
			case FOR:
				_localctx = new StmtForContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				match(FOR);
				setState(91);
				match(LPAREN);
				setState(92);
				forInit();
				setState(93);
				match(SEMI);
				setState(94);
				expression();
				setState(95);
				match(SEMI);
				setState(96);
				forUpdate();
				setState(97);
				match(RPAREN);
				setState(98);
				statement();
				}
				break;
			case PRINTF:
				_localctx = new StmtPrintfContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				match(PRINTF);
				setState(101);
				match(LPAREN);
				setState(102);
				printfArgs();
				setState(103);
				match(RPAREN);
				setState(104);
				match(SEMI);
				}
				break;
			case SCANF:
				_localctx = new StmtScanfContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(106);
				match(SCANF);
				setState(107);
				match(LPAREN);
				setState(108);
				match(ID);
				setState(109);
				match(RPAREN);
				setState(110);
				match(SEMI);
				}
				break;
			case LBRACE:
				_localctx = new StmtBlockContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(111);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Av3Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Av3Parser.RBRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(LBRACE);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18253613050L) != 0)) {
				{
				setState(117);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_T:
				case DOUBLE_T:
				case BOOL_T:
					{
					setState(115);
					declaration();
					}
					break;
				case IF:
				case WHILE:
				case DO:
				case FOR:
				case PRINTF:
				case SCANF:
				case LBRACE:
				case ID:
					{
					setState(116);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Av3Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Av3Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(ID);
			setState(125);
			match(ASSIGN);
			setState(126);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forInit);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				assignment();
				}
				break;
			case INT_T:
			case DOUBLE_T:
			case BOOL_T:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				forDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForDeclarationContext extends ParserRuleContext {
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
	 
		public ForDeclarationContext() { }
		public void copyFrom(ForDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForVarDeclContext extends ForDeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(Av3Parser.ID, 0); }
		public ForVarDeclContext(ForDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterForVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitForVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitForVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInitDeclContext extends ForDeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(Av3Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Av3Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForInitDeclContext(ForDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterForInitDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitForInitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitForInitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forDeclaration);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ForVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				type();
				setState(133);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ForInitDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				type();
				setState(136);
				match(ID);
				setState(137);
				match(ASSIGN);
				setState(138);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			assignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			orExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(Av3Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(Av3Parser.OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			andExpression();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(147);
				match(OR);
				setState(148);
				andExpression();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqExpressionContext> eqExpression() {
			return getRuleContexts(EqExpressionContext.class);
		}
		public EqExpressionContext eqExpression(int i) {
			return getRuleContext(EqExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(Av3Parser.AND); }
		public TerminalNode AND(int i) {
			return getToken(Av3Parser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			eqExpression();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(155);
				match(AND);
				setState(156);
				eqExpression();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqExpressionContext extends ParserRuleContext {
		public List<RelExpressionContext> relExpression() {
			return getRuleContexts(RelExpressionContext.class);
		}
		public RelExpressionContext relExpression(int i) {
			return getRuleContext(RelExpressionContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(Av3Parser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(Av3Parser.EQ, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(Av3Parser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(Av3Parser.NEQ, i);
		}
		public EqExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterEqExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitEqExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitEqExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqExpressionContext eqExpression() throws RecognitionException {
		EqExpressionContext _localctx = new EqExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_eqExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			relExpression();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ || _la==NEQ) {
				{
				{
				setState(163);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NEQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(164);
				relExpression();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelExpressionContext extends ParserRuleContext {
		public List<AddExpressionContext> addExpression() {
			return getRuleContexts(AddExpressionContext.class);
		}
		public AddExpressionContext addExpression(int i) {
			return getRuleContext(AddExpressionContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(Av3Parser.LT); }
		public TerminalNode LT(int i) {
			return getToken(Av3Parser.LT, i);
		}
		public List<TerminalNode> LTE() { return getTokens(Av3Parser.LTE); }
		public TerminalNode LTE(int i) {
			return getToken(Av3Parser.LTE, i);
		}
		public List<TerminalNode> GT() { return getTokens(Av3Parser.GT); }
		public TerminalNode GT(int i) {
			return getToken(Av3Parser.GT, i);
		}
		public List<TerminalNode> GTE() { return getTokens(Av3Parser.GTE); }
		public TerminalNode GTE(int i) {
			return getToken(Av3Parser.GTE, i);
		}
		public RelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterRelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitRelExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitRelExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelExpressionContext relExpression() throws RecognitionException {
		RelExpressionContext _localctx = new RelExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_relExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			addExpression();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0)) {
				{
				{
				setState(171);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(172);
				addExpression();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddExpressionContext extends ParserRuleContext {
		public List<MulExpressionContext> mulExpression() {
			return getRuleContexts(MulExpressionContext.class);
		}
		public MulExpressionContext mulExpression(int i) {
			return getRuleContext(MulExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(Av3Parser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(Av3Parser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(Av3Parser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(Av3Parser.MINUS, i);
		}
		public AddExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExpressionContext addExpression() throws RecognitionException {
		AddExpressionContext _localctx = new AddExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_addExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			mulExpression();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(179);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(180);
				mulExpression();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MulExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(Av3Parser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(Av3Parser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(Av3Parser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(Av3Parser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(Av3Parser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(Av3Parser.MOD, i);
		}
		public MulExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterMulExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitMulExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitMulExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulExpressionContext mulExpression() throws RecognitionException {
		MulExpressionContext _localctx = new MulExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mulExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			unaryExpression();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 229376L) != 0)) {
				{
				{
				setState(187);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 229376L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(188);
				unaryExpression();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(Av3Parser.NOT, 0); }
		public TerminalNode PLUS() { return getToken(Av3Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Av3Parser.MINUS, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unaryExpression);
		int _la;
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67133440L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(195);
				unaryExpression();
				}
				break;
			case TRUE:
			case FALSE:
			case LPAREN:
			case ID:
			case DOUBLE_LIT:
			case INT_LIT:
			case STRING_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				primary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Av3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Av3Parser.RPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(Av3Parser.ID, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_primary);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(LPAREN);
				setState(200);
				expression();
				setState(201);
				match(RPAREN);
				}
				break;
			case TRUE:
			case FALSE:
			case DOUBLE_LIT:
			case INT_LIT:
			case STRING_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				literal();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT_LIT() { return getToken(Av3Parser.INT_LIT, 0); }
		public TerminalNode DOUBLE_LIT() { return getToken(Av3Parser.DOUBLE_LIT, 0); }
		public Bool_litContext bool_lit() {
			return getRuleContext(Bool_litContext.class,0);
		}
		public TerminalNode STRING_LIT() { return getToken(Av3Parser.STRING_LIT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_literal);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(INT_LIT);
				}
				break;
			case DOUBLE_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(DOUBLE_LIT);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				bool_lit();
				}
				break;
			case STRING_LIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				match(STRING_LIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_litContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(Av3Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Av3Parser.FALSE, 0); }
		public Bool_litContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_lit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterBool_lit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitBool_lit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitBool_lit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_litContext bool_lit() throws RecognitionException {
		Bool_litContext _localctx = new Bool_litContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bool_lit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintfArgsContext extends ParserRuleContext {
		public TerminalNode STRING_LIT() { return getToken(Av3Parser.STRING_LIT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Av3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Av3Parser.COMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrintfArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printfArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).enterPrintfArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Av3Listener ) ((Av3Listener)listener).exitPrintfArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Av3Visitor ) return ((Av3Visitor<? extends T>)visitor).visitPrintfArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintfArgsContext printfArgs() throws RecognitionException {
		PrintfArgsContext _localctx = new PrintfArgsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_printfArgs);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(STRING_LIT);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(216);
					match(COMMA);
					setState(217);
					expression();
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				expression();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(224);
					match(COMMA);
					setState(225);
					expression();
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001)\u00ea\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001\u0000"+
		"\u0004\u0000-\b\u0000\u000b\u0000\f\u0000.\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001=\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003K\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003q\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004v\b\u0004\n\u0004\f\u0004y\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0083\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008d"+
		"\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u0096\b\n\n\n\f\n\u0099\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u009e\b\u000b\n\u000b\f\u000b\u00a1\t\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u00a6\b\f\n\f\f\f\u00a9\t\f\u0001\r\u0001\r\u0001\r\u0005\r"+
		"\u00ae\b\r\n\r\f\r\u00b1\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u00b6\b\u000e\n\u000e\f\u000e\u00b9\t\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u00be\b\u000f\n\u000f\f\u000f\u00c1\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c6\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00ce"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00d4"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u00db\b\u0014\n\u0014\f\u0014\u00de\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u00e3\b\u0014\n\u0014\f\u0014\u00e6\t\u0014\u0003"+
		"\u0014\u00e8\b\u0014\u0001\u0014\u0000\u0000\u0015\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000"+
		"\u0007\u0001\u0000\b\n\u0001\u0000\u0012\u0013\u0001\u0000\u0014\u0017"+
		"\u0001\u0000\r\u000e\u0001\u0000\u000f\u0011\u0002\u0000\r\u000e\u001a"+
		"\u001a\u0001\u0000\u000b\f\u00f2\u0000,\u0001\u0000\u0000\u0000\u0002"+
		"<\u0001\u0000\u0000\u0000\u0004>\u0001\u0000\u0000\u0000\u0006p\u0001"+
		"\u0000\u0000\u0000\br\u0001\u0000\u0000\u0000\n|\u0001\u0000\u0000\u0000"+
		"\f\u0082\u0001\u0000\u0000\u0000\u000e\u008c\u0001\u0000\u0000\u0000\u0010"+
		"\u008e\u0001\u0000\u0000\u0000\u0012\u0090\u0001\u0000\u0000\u0000\u0014"+
		"\u0092\u0001\u0000\u0000\u0000\u0016\u009a\u0001\u0000\u0000\u0000\u0018"+
		"\u00a2\u0001\u0000\u0000\u0000\u001a\u00aa\u0001\u0000\u0000\u0000\u001c"+
		"\u00b2\u0001\u0000\u0000\u0000\u001e\u00ba\u0001\u0000\u0000\u0000 \u00c5"+
		"\u0001\u0000\u0000\u0000\"\u00cd\u0001\u0000\u0000\u0000$\u00d3\u0001"+
		"\u0000\u0000\u0000&\u00d5\u0001\u0000\u0000\u0000(\u00e7\u0001\u0000\u0000"+
		"\u0000*-\u0003\u0002\u0001\u0000+-\u0003\u0006\u0003\u0000,*\u0001\u0000"+
		"\u0000\u0000,+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.,\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"01\u0005\u0000\u0000\u00011\u0001\u0001\u0000\u0000\u000023\u0003\u0004"+
		"\u0002\u000034\u0005\"\u0000\u000045\u0005!\u0000\u00005=\u0001\u0000"+
		"\u0000\u000067\u0003\u0004\u0002\u000078\u0005\"\u0000\u000089\u0005\u001b"+
		"\u0000\u00009:\u0003\u0012\t\u0000:;\u0005!\u0000\u0000;=\u0001\u0000"+
		"\u0000\u0000<2\u0001\u0000\u0000\u0000<6\u0001\u0000\u0000\u0000=\u0003"+
		"\u0001\u0000\u0000\u0000>?\u0007\u0000\u0000\u0000?\u0005\u0001\u0000"+
		"\u0000\u0000@A\u0003\n\u0005\u0000AB\u0005!\u0000\u0000Bq\u0001\u0000"+
		"\u0000\u0000CD\u0005\u0001\u0000\u0000DE\u0005\u001c\u0000\u0000EF\u0003"+
		"\u0012\t\u0000FG\u0005\u001d\u0000\u0000GJ\u0003\u0006\u0003\u0000HI\u0005"+
		"\u0002\u0000\u0000IK\u0003\u0006\u0003\u0000JH\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000Kq\u0001\u0000\u0000\u0000LM\u0005\u0003\u0000"+
		"\u0000MN\u0005\u001c\u0000\u0000NO\u0003\u0012\t\u0000OP\u0005\u001d\u0000"+
		"\u0000PQ\u0003\u0006\u0003\u0000Qq\u0001\u0000\u0000\u0000RS\u0005\u0004"+
		"\u0000\u0000ST\u0003\u0006\u0003\u0000TU\u0005\u0003\u0000\u0000UV\u0005"+
		"\u001c\u0000\u0000VW\u0003\u0012\t\u0000WX\u0005\u001d\u0000\u0000XY\u0005"+
		"!\u0000\u0000Yq\u0001\u0000\u0000\u0000Z[\u0005\u0005\u0000\u0000[\\\u0005"+
		"\u001c\u0000\u0000\\]\u0003\f\u0006\u0000]^\u0005!\u0000\u0000^_\u0003"+
		"\u0012\t\u0000_`\u0005!\u0000\u0000`a\u0003\u0010\b\u0000ab\u0005\u001d"+
		"\u0000\u0000bc\u0003\u0006\u0003\u0000cq\u0001\u0000\u0000\u0000de\u0005"+
		"\u0006\u0000\u0000ef\u0005\u001c\u0000\u0000fg\u0003(\u0014\u0000gh\u0005"+
		"\u001d\u0000\u0000hi\u0005!\u0000\u0000iq\u0001\u0000\u0000\u0000jk\u0005"+
		"\u0007\u0000\u0000kl\u0005\u001c\u0000\u0000lm\u0005\"\u0000\u0000mn\u0005"+
		"\u001d\u0000\u0000nq\u0005!\u0000\u0000oq\u0003\b\u0004\u0000p@\u0001"+
		"\u0000\u0000\u0000pC\u0001\u0000\u0000\u0000pL\u0001\u0000\u0000\u0000"+
		"pR\u0001\u0000\u0000\u0000pZ\u0001\u0000\u0000\u0000pd\u0001\u0000\u0000"+
		"\u0000pj\u0001\u0000\u0000\u0000po\u0001\u0000\u0000\u0000q\u0007\u0001"+
		"\u0000\u0000\u0000rw\u0005\u001e\u0000\u0000sv\u0003\u0002\u0001\u0000"+
		"tv\u0003\u0006\u0003\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000"+
		"\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005"+
		"\u001f\u0000\u0000{\t\u0001\u0000\u0000\u0000|}\u0005\"\u0000\u0000}~"+
		"\u0005\u001b\u0000\u0000~\u007f\u0003\u0012\t\u0000\u007f\u000b\u0001"+
		"\u0000\u0000\u0000\u0080\u0083\u0003\n\u0005\u0000\u0081\u0083\u0003\u000e"+
		"\u0007\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\r\u0001\u0000\u0000\u0000\u0084\u0085\u0003\u0004\u0002"+
		"\u0000\u0085\u0086\u0005\"\u0000\u0000\u0086\u008d\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0003\u0004\u0002\u0000\u0088\u0089\u0005\"\u0000\u0000\u0089"+
		"\u008a\u0005\u001b\u0000\u0000\u008a\u008b\u0003\u0012\t\u0000\u008b\u008d"+
		"\u0001\u0000\u0000\u0000\u008c\u0084\u0001\u0000\u0000\u0000\u008c\u0087"+
		"\u0001\u0000\u0000\u0000\u008d\u000f\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0003\n\u0005\u0000\u008f\u0011\u0001\u0000\u0000\u0000\u0090\u0091\u0003"+
		"\u0014\n\u0000\u0091\u0013\u0001\u0000\u0000\u0000\u0092\u0097\u0003\u0016"+
		"\u000b\u0000\u0093\u0094\u0005\u0019\u0000\u0000\u0094\u0096\u0003\u0016"+
		"\u000b\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000"+
		"\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000"+
		"\u0000\u0000\u0098\u0015\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u009a\u009f\u0003\u0018\f\u0000\u009b\u009c\u0005\u0018\u0000"+
		"\u0000\u009c\u009e\u0003\u0018\f\u0000\u009d\u009b\u0001\u0000\u0000\u0000"+
		"\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u0017\u0001\u0000\u0000\u0000"+
		"\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a7\u0003\u001a\r\u0000\u00a3"+
		"\u00a4\u0007\u0001\u0000\u0000\u00a4\u00a6\u0003\u001a\r\u0000\u00a5\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u0019"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00af"+
		"\u0003\u001c\u000e\u0000\u00ab\u00ac\u0007\u0002\u0000\u0000\u00ac\u00ae"+
		"\u0003\u001c\u000e\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00b1"+
		"\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b0\u001b\u0001\u0000\u0000\u0000\u00b1\u00af"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b7\u0003\u001e\u000f\u0000\u00b3\u00b4"+
		"\u0007\u0003\u0000\u0000\u00b4\u00b6\u0003\u001e\u000f\u0000\u00b5\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u001d"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bf"+
		"\u0003 \u0010\u0000\u00bb\u00bc\u0007\u0004\u0000\u0000\u00bc\u00be\u0003"+
		" \u0010\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000"+
		"\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c0\u001f\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0007\u0005\u0000\u0000\u00c3\u00c6\u0003 \u0010"+
		"\u0000\u00c4\u00c6\u0003\"\u0011\u0000\u00c5\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6!\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0005\u001c\u0000\u0000\u00c8\u00c9\u0003\u0012\t\u0000\u00c9\u00ca"+
		"\u0005\u001d\u0000\u0000\u00ca\u00ce\u0001\u0000\u0000\u0000\u00cb\u00ce"+
		"\u0003$\u0012\u0000\u00cc\u00ce\u0005\"\u0000\u0000\u00cd\u00c7\u0001"+
		"\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ce#\u0001\u0000\u0000\u0000\u00cf\u00d4\u0005$\u0000"+
		"\u0000\u00d0\u00d4\u0005#\u0000\u0000\u00d1\u00d4\u0003&\u0013\u0000\u00d2"+
		"\u00d4\u0005&\u0000\u0000\u00d3\u00cf\u0001\u0000\u0000\u0000\u00d3\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d4%\u0001\u0000\u0000\u0000\u00d5\u00d6\u0007"+
		"\u0006\u0000\u0000\u00d6\'\u0001\u0000\u0000\u0000\u00d7\u00dc\u0005&"+
		"\u0000\u0000\u00d8\u00d9\u0005 \u0000\u0000\u00d9\u00db\u0003\u0012\t"+
		"\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000"+
		"\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000"+
		"\u0000\u00dd\u00e8\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000"+
		"\u0000\u00df\u00e4\u0003\u0012\t\u0000\u00e0\u00e1\u0005 \u0000\u0000"+
		"\u00e1\u00e3\u0003\u0012\t\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e7\u00d7\u0001\u0000\u0000\u0000\u00e7"+
		"\u00df\u0001\u0000\u0000\u0000\u00e8)\u0001\u0000\u0000\u0000\u0015,."+
		"<Jpuw\u0082\u008c\u0097\u009f\u00a7\u00af\u00b7\u00bf\u00c5\u00cd\u00d3"+
		"\u00dc\u00e4\u00e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}