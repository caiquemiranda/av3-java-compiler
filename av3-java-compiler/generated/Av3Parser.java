// Generated from /Users/sergio.sacramento/code/podium/av3-java-compiler/grammar/Av3.g4 by ANTLR 4.13.1
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
		RULE_literal = 18, RULE_printfArgs = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declaration", "type", "statement", "block", "assignment", "forInit", 
			"forDeclaration", "forUpdate", "expression", "orExpression", "andExpression", 
			"eqExpression", "relExpression", "addExpression", "mulExpression", "unaryExpression", 
			"primary", "literal", "printfArgs"
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
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(42);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_T:
				case DOUBLE_T:
				case BOOL_T:
					{
					setState(40);
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
					setState(41);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 18253613050L) != 0) );
			setState(46);
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
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new VarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				type();
				setState(49);
				match(ID);
				setState(50);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new VarInitDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				type();
				setState(53);
				match(ID);
				setState(54);
				match(ASSIGN);
				setState(55);
				expression();
				setState(56);
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
			setState(60);
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
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new StmtAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				assignment();
				setState(63);
				match(SEMI);
				}
				break;
			case IF:
				_localctx = new StmtIfElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(IF);
				setState(66);
				match(LPAREN);
				setState(67);
				expression();
				setState(68);
				match(RPAREN);
				setState(69);
				statement();
				setState(70);
				match(ELSE);
				setState(71);
				statement();
				}
				break;
			case WHILE:
				_localctx = new StmtWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				match(WHILE);
				setState(74);
				match(LPAREN);
				setState(75);
				expression();
				setState(76);
				match(RPAREN);
				setState(77);
				statement();
				}
				break;
			case DO:
				_localctx = new StmtDoWhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				match(DO);
				setState(80);
				statement();
				setState(81);
				match(WHILE);
				setState(82);
				match(LPAREN);
				setState(83);
				expression();
				setState(84);
				match(RPAREN);
				setState(85);
				match(SEMI);
				}
				break;
			case FOR:
				_localctx = new StmtForContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				match(FOR);
				setState(88);
				match(LPAREN);
				setState(89);
				forInit();
				setState(90);
				match(SEMI);
				setState(91);
				expression();
				setState(92);
				match(SEMI);
				setState(93);
				forUpdate();
				setState(94);
				match(RPAREN);
				setState(95);
				statement();
				}
				break;
			case PRINTF:
				_localctx = new StmtPrintfContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				match(PRINTF);
				setState(98);
				match(LPAREN);
				setState(99);
				printfArgs();
				setState(100);
				match(RPAREN);
				setState(101);
				match(SEMI);
				}
				break;
			case SCANF:
				_localctx = new StmtScanfContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(103);
				match(SCANF);
				setState(104);
				match(LPAREN);
				setState(105);
				match(ID);
				setState(106);
				match(RPAREN);
				setState(107);
				match(SEMI);
				}
				break;
			case LBRACE:
				_localctx = new StmtBlockContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(108);
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
			setState(111);
			match(LBRACE);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18253613050L) != 0)) {
				{
				setState(114);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_T:
				case DOUBLE_T:
				case BOOL_T:
					{
					setState(112);
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
					setState(113);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
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
			setState(121);
			match(ID);
			setState(122);
			match(ASSIGN);
			setState(123);
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
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				assignment();
				}
				break;
			case INT_T:
			case DOUBLE_T:
			case BOOL_T:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
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
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new ForVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				type();
				setState(130);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ForInitDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				type();
				setState(133);
				match(ID);
				setState(134);
				match(ASSIGN);
				setState(135);
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
			setState(139);
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
			setState(141);
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
			setState(143);
			andExpression();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(144);
				match(OR);
				setState(145);
				andExpression();
				}
				}
				setState(150);
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
			setState(151);
			eqExpression();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(152);
				match(AND);
				setState(153);
				eqExpression();
				}
				}
				setState(158);
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
			setState(159);
			relExpression();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ || _la==NEQ) {
				{
				{
				setState(160);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NEQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(161);
				relExpression();
				}
				}
				setState(166);
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
			setState(167);
			addExpression();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0)) {
				{
				{
				setState(168);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(169);
				addExpression();
				}
				}
				setState(174);
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
			setState(175);
			mulExpression();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(176);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(177);
				mulExpression();
				}
				}
				setState(182);
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
			setState(183);
			unaryExpression();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 229376L) != 0)) {
				{
				{
				setState(184);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 229376L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(185);
				unaryExpression();
				}
				}
				setState(190);
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
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67133440L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(192);
				unaryExpression();
				}
				break;
			case LPAREN:
			case ID:
			case DOUBLE_LIT:
			case INT_LIT:
			case BOOL_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
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
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(LPAREN);
				setState(197);
				expression();
				setState(198);
				match(RPAREN);
				}
				break;
			case DOUBLE_LIT:
			case INT_LIT:
			case BOOL_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				literal();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
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
		public TerminalNode BOOL_LIT() { return getToken(Av3Parser.BOOL_LIT, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) ) {
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
		enterRule(_localctx, 38, RULE_printfArgs);
		int _la;
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(STRING_LIT);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(207);
					match(COMMA);
					setState(208);
					expression();
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case PLUS:
			case MINUS:
			case NOT:
			case LPAREN:
			case ID:
			case DOUBLE_LIT:
			case INT_LIT:
			case BOOL_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				expression();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(215);
					match(COMMA);
					setState(216);
					expression();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static final String _serializedATN =
		"\u0004\u0001)\u00e1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0004\u0000+\b\u0000"+
		"\u000b\u0000\f\u0000,\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001;\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"n\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004s\b\u0004\n\u0004"+
		"\f\u0004v\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u0080\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u008a\b\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0005\n\u0093\b\n\n\n\f\n\u0096\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u009b\b\u000b\n\u000b\f\u000b\u009e"+
		"\t\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00a3\b\f\n\f\f\f\u00a6\t\f\u0001"+
		"\r\u0001\r\u0001\r\u0005\r\u00ab\b\r\n\r\f\r\u00ae\t\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u00b3\b\u000e\n\u000e\f\u000e\u00b6\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00bb\b\u000f\n\u000f"+
		"\f\u000f\u00be\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00c3\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00cb\b\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u00d2\b\u0013\n\u0013\f\u0013\u00d5"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00da\b\u0013"+
		"\n\u0013\f\u0013\u00dd\t\u0013\u0003\u0013\u00df\b\u0013\u0001\u0013\u0000"+
		"\u0000\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&\u0000\u0007\u0001\u0000\b\n\u0001\u0000"+
		"\u0012\u0013\u0001\u0000\u0014\u0017\u0001\u0000\r\u000e\u0001\u0000\u000f"+
		"\u0011\u0002\u0000\r\u000e\u001a\u001a\u0001\u0000#%\u00e6\u0000*\u0001"+
		"\u0000\u0000\u0000\u0002:\u0001\u0000\u0000\u0000\u0004<\u0001\u0000\u0000"+
		"\u0000\u0006m\u0001\u0000\u0000\u0000\bo\u0001\u0000\u0000\u0000\ny\u0001"+
		"\u0000\u0000\u0000\f\u007f\u0001\u0000\u0000\u0000\u000e\u0089\u0001\u0000"+
		"\u0000\u0000\u0010\u008b\u0001\u0000\u0000\u0000\u0012\u008d\u0001\u0000"+
		"\u0000\u0000\u0014\u008f\u0001\u0000\u0000\u0000\u0016\u0097\u0001\u0000"+
		"\u0000\u0000\u0018\u009f\u0001\u0000\u0000\u0000\u001a\u00a7\u0001\u0000"+
		"\u0000\u0000\u001c\u00af\u0001\u0000\u0000\u0000\u001e\u00b7\u0001\u0000"+
		"\u0000\u0000 \u00c2\u0001\u0000\u0000\u0000\"\u00ca\u0001\u0000\u0000"+
		"\u0000$\u00cc\u0001\u0000\u0000\u0000&\u00de\u0001\u0000\u0000\u0000("+
		"+\u0003\u0002\u0001\u0000)+\u0003\u0006\u0003\u0000*(\u0001\u0000\u0000"+
		"\u0000*)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0005"+
		"\u0000\u0000\u0001/\u0001\u0001\u0000\u0000\u000001\u0003\u0004\u0002"+
		"\u000012\u0005\"\u0000\u000023\u0005!\u0000\u00003;\u0001\u0000\u0000"+
		"\u000045\u0003\u0004\u0002\u000056\u0005\"\u0000\u000067\u0005\u001b\u0000"+
		"\u000078\u0003\u0012\t\u000089\u0005!\u0000\u00009;\u0001\u0000\u0000"+
		"\u0000:0\u0001\u0000\u0000\u0000:4\u0001\u0000\u0000\u0000;\u0003\u0001"+
		"\u0000\u0000\u0000<=\u0007\u0000\u0000\u0000=\u0005\u0001\u0000\u0000"+
		"\u0000>?\u0003\n\u0005\u0000?@\u0005!\u0000\u0000@n\u0001\u0000\u0000"+
		"\u0000AB\u0005\u0001\u0000\u0000BC\u0005\u001c\u0000\u0000CD\u0003\u0012"+
		"\t\u0000DE\u0005\u001d\u0000\u0000EF\u0003\u0006\u0003\u0000FG\u0005\u0002"+
		"\u0000\u0000GH\u0003\u0006\u0003\u0000Hn\u0001\u0000\u0000\u0000IJ\u0005"+
		"\u0003\u0000\u0000JK\u0005\u001c\u0000\u0000KL\u0003\u0012\t\u0000LM\u0005"+
		"\u001d\u0000\u0000MN\u0003\u0006\u0003\u0000Nn\u0001\u0000\u0000\u0000"+
		"OP\u0005\u0004\u0000\u0000PQ\u0003\u0006\u0003\u0000QR\u0005\u0003\u0000"+
		"\u0000RS\u0005\u001c\u0000\u0000ST\u0003\u0012\t\u0000TU\u0005\u001d\u0000"+
		"\u0000UV\u0005!\u0000\u0000Vn\u0001\u0000\u0000\u0000WX\u0005\u0005\u0000"+
		"\u0000XY\u0005\u001c\u0000\u0000YZ\u0003\f\u0006\u0000Z[\u0005!\u0000"+
		"\u0000[\\\u0003\u0012\t\u0000\\]\u0005!\u0000\u0000]^\u0003\u0010\b\u0000"+
		"^_\u0005\u001d\u0000\u0000_`\u0003\u0006\u0003\u0000`n\u0001\u0000\u0000"+
		"\u0000ab\u0005\u0006\u0000\u0000bc\u0005\u001c\u0000\u0000cd\u0003&\u0013"+
		"\u0000de\u0005\u001d\u0000\u0000ef\u0005!\u0000\u0000fn\u0001\u0000\u0000"+
		"\u0000gh\u0005\u0007\u0000\u0000hi\u0005\u001c\u0000\u0000ij\u0005\"\u0000"+
		"\u0000jk\u0005\u001d\u0000\u0000kn\u0005!\u0000\u0000ln\u0003\b\u0004"+
		"\u0000m>\u0001\u0000\u0000\u0000mA\u0001\u0000\u0000\u0000mI\u0001\u0000"+
		"\u0000\u0000mO\u0001\u0000\u0000\u0000mW\u0001\u0000\u0000\u0000ma\u0001"+
		"\u0000\u0000\u0000mg\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000"+
		"n\u0007\u0001\u0000\u0000\u0000ot\u0005\u001e\u0000\u0000ps\u0003\u0002"+
		"\u0001\u0000qs\u0003\u0006\u0003\u0000rp\u0001\u0000\u0000\u0000rq\u0001"+
		"\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"tu\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000wx\u0005\u001f\u0000\u0000x\t\u0001\u0000\u0000\u0000yz\u0005\""+
		"\u0000\u0000z{\u0005\u001b\u0000\u0000{|\u0003\u0012\t\u0000|\u000b\u0001"+
		"\u0000\u0000\u0000}\u0080\u0003\n\u0005\u0000~\u0080\u0003\u000e\u0007"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080"+
		"\r\u0001\u0000\u0000\u0000\u0081\u0082\u0003\u0004\u0002\u0000\u0082\u0083"+
		"\u0005\"\u0000\u0000\u0083\u008a\u0001\u0000\u0000\u0000\u0084\u0085\u0003"+
		"\u0004\u0002\u0000\u0085\u0086\u0005\"\u0000\u0000\u0086\u0087\u0005\u001b"+
		"\u0000\u0000\u0087\u0088\u0003\u0012\t\u0000\u0088\u008a\u0001\u0000\u0000"+
		"\u0000\u0089\u0081\u0001\u0000\u0000\u0000\u0089\u0084\u0001\u0000\u0000"+
		"\u0000\u008a\u000f\u0001\u0000\u0000\u0000\u008b\u008c\u0003\n\u0005\u0000"+
		"\u008c\u0011\u0001\u0000\u0000\u0000\u008d\u008e\u0003\u0014\n\u0000\u008e"+
		"\u0013\u0001\u0000\u0000\u0000\u008f\u0094\u0003\u0016\u000b\u0000\u0090"+
		"\u0091\u0005\u0019\u0000\u0000\u0091\u0093\u0003\u0016\u000b\u0000\u0092"+
		"\u0090\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094"+
		"\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095"+
		"\u0015\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097"+
		"\u009c\u0003\u0018\f\u0000\u0098\u0099\u0005\u0018\u0000\u0000\u0099\u009b"+
		"\u0003\u0018\f\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009e\u0001"+
		"\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009d\u0017\u0001\u0000\u0000\u0000\u009e\u009c\u0001"+
		"\u0000\u0000\u0000\u009f\u00a4\u0003\u001a\r\u0000\u00a0\u00a1\u0007\u0001"+
		"\u0000\u0000\u00a1\u00a3\u0003\u001a\r\u0000\u00a2\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u0019\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00ac\u0003\u001c\u000e"+
		"\u0000\u00a8\u00a9\u0007\u0002\u0000\u0000\u00a9\u00ab\u0003\u001c\u000e"+
		"\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ad\u001b\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000"+
		"\u0000\u00af\u00b4\u0003\u001e\u000f\u0000\u00b0\u00b1\u0007\u0003\u0000"+
		"\u0000\u00b1\u00b3\u0003\u001e\u000f\u0000\u00b2\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u001d\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00bc\u0003 \u0010\u0000"+
		"\u00b8\u00b9\u0007\u0004\u0000\u0000\u00b9\u00bb\u0003 \u0010\u0000\u00ba"+
		"\u00b8\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd"+
		"\u001f\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0007\u0005\u0000\u0000\u00c0\u00c3\u0003 \u0010\u0000\u00c1\u00c3"+
		"\u0003\"\u0011\u0000\u00c2\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c3!\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u001c"+
		"\u0000\u0000\u00c5\u00c6\u0003\u0012\t\u0000\u00c6\u00c7\u0005\u001d\u0000"+
		"\u0000\u00c7\u00cb\u0001\u0000\u0000\u0000\u00c8\u00cb\u0003$\u0012\u0000"+
		"\u00c9\u00cb\u0005\"\u0000\u0000\u00ca\u00c4\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c8\u0001\u0000\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb"+
		"#\u0001\u0000\u0000\u0000\u00cc\u00cd\u0007\u0006\u0000\u0000\u00cd%\u0001"+
		"\u0000\u0000\u0000\u00ce\u00d3\u0005&\u0000\u0000\u00cf\u00d0\u0005 \u0000"+
		"\u0000\u00d0\u00d2\u0003\u0012\t\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00df\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00db\u0003\u0012\t\u0000\u00d7"+
		"\u00d8\u0005 \u0000\u0000\u00d8\u00da\u0003\u0012\t\u0000\u00d9\u00d7"+
		"\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00df"+
		"\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00ce"+
		"\u0001\u0000\u0000\u0000\u00de\u00d6\u0001\u0000\u0000\u0000\u00df\'\u0001"+
		"\u0000\u0000\u0000\u0013*,:mrt\u007f\u0089\u0094\u009c\u00a4\u00ac\u00b4"+
		"\u00bc\u00c2\u00ca\u00d3\u00db\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}