// Generated from uol.g4 by ANTLR 4.13.2
package ksu.yomogi.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class uolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, NEWLINE=11, WS=12, SINGLE_COMMET=13, MULTI_COMMET=14, DECIMAL_LITERAL=15, 
		HEX_LITERAL=16, OCT_LITERAL=17, BINARY_LITERAL=18, BOOL_LITERAL=19, STRING_LITERAL=20, 
		NIL_LITERAL=21, IMPORT=22, AS=23, FROM=24, CLASS=25, EXTENDS=26, IMPLEMENTS=27, 
		MODIFIER=28, INSTRUCTION=29, FUNCTION=30, NEW=31, IF=32, ELSE=33, WHILE=34, 
		FOR=35, ASSIGN=36, ADDITIVE_OPERATOR=37, MULTIPLY_OPERATOR=38, CONDITIONAL_OPERATOR=39, 
		CONDITIONAL_LOGICAL_OPERATOR=40, RETURN=41, IDENTIFIER=42;
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_expression = 2, RULE_responseExpression = 3, 
		RULE_iterableExpression = 4, RULE_expressionList = 5, RULE_fileImportStatement = 6, 
		RULE_partsImportStatement = 7, RULE_partsImportContentList = 8, RULE_partsImportContent = 9, 
		RULE_classDefine = 10, RULE_extendPart = 11, RULE_interfaceParts = 12, 
		RULE_interfaceList = 13, RULE_classPartsList = 14, RULE_classParts = 15, 
		RULE_messageDefine = 16, RULE_memberDefine = 17, RULE_functionDefine = 18, 
		RULE_lambdaDefine = 19, RULE_returnExpression = 20, RULE_lambdaBody = 21, 
		RULE_argumentDefineList = 22, RULE_arugumentNonDefaultList = 23, RULE_argumentNonDefault = 24, 
		RULE_argumentDefaultList = 25, RULE_argumentDefault = 26, RULE_instanceExpression = 27, 
		RULE_booleanConditionExpression = 28, RULE_condition = 29, RULE_conditionBody = 30, 
		RULE_conditionAnotherBody = 31, RULE_booleanLoopExpression = 32, RULE_forEachExpression = 33, 
		RULE_conditionExpressionList = 34, RULE_conditionExpression = 35, RULE_assignExpression = 36, 
		RULE_assignAbleExpression = 37, RULE_chainExpression = 38, RULE_callExpression = 39, 
		RULE_argumentList = 40, RULE_argumentContent = 41, RULE_additiveExpression = 42, 
		RULE_multiplicativeExpression = 43, RULE_unaryExpression = 44, RULE_listDefine = 45, 
		RULE_listDefineWithKey = 46, RULE_listDefineWithKeyContent = 47, RULE_elementExpression = 48, 
		RULE_literal = 49, RULE_integerLiteral = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "statement", "expression", "responseExpression", "iterableExpression", 
			"expressionList", "fileImportStatement", "partsImportStatement", "partsImportContentList", 
			"partsImportContent", "classDefine", "extendPart", "interfaceParts", 
			"interfaceList", "classPartsList", "classParts", "messageDefine", "memberDefine", 
			"functionDefine", "lambdaDefine", "returnExpression", "lambdaBody", "argumentDefineList", 
			"arugumentNonDefaultList", "argumentNonDefault", "argumentDefaultList", 
			"argumentDefault", "instanceExpression", "booleanConditionExpression", 
			"condition", "conditionBody", "conditionAnotherBody", "booleanLoopExpression", 
			"forEachExpression", "conditionExpressionList", "conditionExpression", 
			"assignExpression", "assignAbleExpression", "chainExpression", "callExpression", 
			"argumentList", "argumentContent", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "listDefine", "listDefineWithKey", "listDefineWithKeyContent", 
			"elementExpression", "literal", "integerLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "'('", "')'", "'in'", "'.'", "': '", "'['", 
			"']'", null, null, null, null, null, null, null, null, null, null, "'nil'", 
			"'import'", "'as'", "'from'", "'class'", "'extends'", "'implements'", 
			null, null, "'function'", "'new'", "'if'", "'else'", "'while'", "'for'", 
			null, null, null, null, null, "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "NEWLINE", 
			"WS", "SINGLE_COMMET", "MULTI_COMMET", "DECIMAL_LITERAL", "HEX_LITERAL", 
			"OCT_LITERAL", "BINARY_LITERAL", "BOOL_LITERAL", "STRING_LITERAL", "NIL_LITERAL", 
			"IMPORT", "AS", "FROM", "CLASS", "EXTENDS", "IMPLEMENTS", "MODIFIER", 
			"INSTRUCTION", "FUNCTION", "NEW", "IF", "ELSE", "WHILE", "FOR", "ASSIGN", 
			"ADDITIVE_OPERATOR", "MULTIPLY_OPERATOR", "CONDITIONAL_OPERATOR", "CONDITIONAL_LOGICAL_OPERATOR", 
			"RETURN", "IDENTIFIER"
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
	public String getGrammarFileName() { return "uol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public uolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(uolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(uolParser.NEWLINE, i);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitProg(this);
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
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(102);
				match(NEWLINE);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4457144222226L) != 0)) {
				{
				{
				setState(108);
				statement();
				setState(109);
				match(NEWLINE);
				}
				}
				setState(115);
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
	public static class StatementContext extends ParserRuleContext {
		public PartsImportStatementContext partsImportStatement() {
			return getRuleContext(PartsImportStatementContext.class,0);
		}
		public FileImportStatementContext fileImportStatement() {
			return getRuleContext(FileImportStatementContext.class,0);
		}
		public ClassDefineContext classDefine() {
			return getRuleContext(ClassDefineContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				partsImportStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				fileImportStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				classDefine();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
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
	public static class ExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ListDefineContext listDefine() {
			return getRuleContext(ListDefineContext.class,0);
		}
		public ListDefineWithKeyContext listDefineWithKey() {
			return getRuleContext(ListDefineWithKeyContext.class,0);
		}
		public LambdaDefineContext lambdaDefine() {
			return getRuleContext(LambdaDefineContext.class,0);
		}
		public InstanceExpressionContext instanceExpression() {
			return getRuleContext(InstanceExpressionContext.class,0);
		}
		public CallExpressionContext callExpression() {
			return getRuleContext(CallExpressionContext.class,0);
		}
		public ChainExpressionContext chainExpression() {
			return getRuleContext(ChainExpressionContext.class,0);
		}
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public FunctionDefineContext functionDefine() {
			return getRuleContext(FunctionDefineContext.class,0);
		}
		public BooleanConditionExpressionContext booleanConditionExpression() {
			return getRuleContext(BooleanConditionExpressionContext.class,0);
		}
		public BooleanLoopExpressionContext booleanLoopExpression() {
			return getRuleContext(BooleanLoopExpressionContext.class,0);
		}
		public ForEachExpressionContext forEachExpression() {
			return getRuleContext(ForEachExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				listDefine();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				listDefineWithKey();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				lambdaDefine();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				instanceExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(127);
				callExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(128);
				chainExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(129);
				assignExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(130);
				functionDefine();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(131);
				booleanConditionExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(132);
				booleanLoopExpression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(133);
				forEachExpression();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(134);
				additiveExpression();
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
	public static class ResponseExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CallExpressionContext callExpression() {
			return getRuleContext(CallExpressionContext.class,0);
		}
		public ChainExpressionContext chainExpression() {
			return getRuleContext(ChainExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ResponseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_responseExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitResponseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResponseExpressionContext responseExpression() throws RecognitionException {
		ResponseExpressionContext _localctx = new ResponseExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_responseExpression);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				callExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				chainExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				additiveExpression();
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
	public static class IterableExpressionContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(uolParser.STRING_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(uolParser.IDENTIFIER, 0); }
		public ListDefineContext listDefine() {
			return getRuleContext(ListDefineContext.class,0);
		}
		public ListDefineWithKeyContext listDefineWithKey() {
			return getRuleContext(ListDefineWithKeyContext.class,0);
		}
		public LambdaDefineContext lambdaDefine() {
			return getRuleContext(LambdaDefineContext.class,0);
		}
		public CallExpressionContext callExpression() {
			return getRuleContext(CallExpressionContext.class,0);
		}
		public ChainExpressionContext chainExpression() {
			return getRuleContext(ChainExpressionContext.class,0);
		}
		public IterableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterableExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitIterableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterableExpressionContext iterableExpression() throws RecognitionException {
		IterableExpressionContext _localctx = new IterableExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_iterableExpression);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				listDefine();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				listDefineWithKey();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				lambdaDefine();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(148);
				callExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(149);
				chainExpression();
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
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ReturnExpressionContext returnExpression() {
			return getRuleContext(ReturnExpressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(uolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(uolParser.NEWLINE, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4457106473490L) != 0)) {
				{
				{
				setState(152);
				expression();
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(153);
					match(NEWLINE);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(164);
				returnExpression();
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(165);
					match(NEWLINE);
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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
	public static class FileImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(uolParser.IMPORT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(uolParser.IDENTIFIER, 0); }
		public TerminalNode FROM() { return getToken(uolParser.FROM, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(uolParser.STRING_LITERAL, 0); }
		public FileImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileImportStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitFileImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileImportStatementContext fileImportStatement() throws RecognitionException {
		FileImportStatementContext _localctx = new FileImportStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fileImportStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(IMPORT);
			setState(174);
			match(IDENTIFIER);
			setState(175);
			match(FROM);
			setState(176);
			match(STRING_LITERAL);
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
	public static class PartsImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(uolParser.IMPORT, 0); }
		public PartsImportContentListContext partsImportContentList() {
			return getRuleContext(PartsImportContentListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(uolParser.FROM, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(uolParser.STRING_LITERAL, 0); }
		public PartsImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partsImportStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitPartsImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartsImportStatementContext partsImportStatement() throws RecognitionException {
		PartsImportStatementContext _localctx = new PartsImportStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_partsImportStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(IMPORT);
			setState(179);
			partsImportContentList();
			setState(180);
			match(FROM);
			setState(181);
			match(STRING_LITERAL);
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
	public static class PartsImportContentListContext extends ParserRuleContext {
		public List<PartsImportContentContext> partsImportContent() {
			return getRuleContexts(PartsImportContentContext.class);
		}
		public PartsImportContentContext partsImportContent(int i) {
			return getRuleContext(PartsImportContentContext.class,i);
		}
		public PartsImportContentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partsImportContentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitPartsImportContentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartsImportContentListContext partsImportContentList() throws RecognitionException {
		PartsImportContentListContext _localctx = new PartsImportContentListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_partsImportContentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__0);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(184);
				partsImportContent();
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(185);
					match(T__1);
					setState(186);
					partsImportContent();
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(194);
			match(T__2);
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
	public static class PartsImportContentContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(uolParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(uolParser.IDENTIFIER, i);
		}
		public TerminalNode AS() { return getToken(uolParser.AS, 0); }
		public PartsImportContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partsImportContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitPartsImportContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartsImportContentContext partsImportContent() throws RecognitionException {
		PartsImportContentContext _localctx = new PartsImportContentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_partsImportContent);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(IDENTIFIER);
				setState(198);
				match(AS);
				setState(199);
				match(IDENTIFIER);
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
	public static class ClassDefineContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(uolParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(uolParser.IDENTIFIER, 0); }
		public ClassPartsListContext classPartsList() {
			return getRuleContext(ClassPartsListContext.class,0);
		}
		public ExtendPartContext extendPart() {
			return getRuleContext(ExtendPartContext.class,0);
		}
		public InterfacePartsContext interfaceParts() {
			return getRuleContext(InterfacePartsContext.class,0);
		}
		public ClassDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitClassDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefineContext classDefine() throws RecognitionException {
		ClassDefineContext _localctx = new ClassDefineContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(CLASS);
			setState(203);
			match(IDENTIFIER);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(204);
				extendPart();
				}
			}

			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(207);
				interfaceParts();
				}
			}

			setState(210);
			match(T__0);
			setState(211);
			classPartsList();
			setState(212);
			match(T__2);
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
	public static class ExtendPartContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(uolParser.EXTENDS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(uolParser.IDENTIFIER, 0); }
		public ExtendPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitExtendPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendPartContext extendPart() throws RecognitionException {
		ExtendPartContext _localctx = new ExtendPartContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_extendPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(214);
			match(EXTENDS);
			setState(215);
			match(IDENTIFIER);
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
	public static class InterfacePartsContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(uolParser.IMPLEMENTS, 0); }
		public InterfaceListContext interfaceList() {
			return getRuleContext(InterfaceListContext.class,0);
		}
		public InterfacePartsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceParts; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitInterfaceParts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfacePartsContext interfaceParts() throws RecognitionException {
		InterfacePartsContext _localctx = new InterfacePartsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceParts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(217);
			match(IMPLEMENTS);
			setState(218);
			interfaceList();
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
	public static class InterfaceListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(uolParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(uolParser.IDENTIFIER, i);
		}
		public InterfaceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitInterfaceList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceListContext interfaceList() throws RecognitionException {
		InterfaceListContext _localctx = new InterfaceListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interfaceList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(IDENTIFIER);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(221);
				match(T__1);
				setState(222);
				match(IDENTIFIER);
				}
				}
				setState(227);
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
	public static class ClassPartsListContext extends ParserRuleContext {
		public List<ClassPartsContext> classParts() {
			return getRuleContexts(ClassPartsContext.class);
		}
		public ClassPartsContext classParts(int i) {
			return getRuleContext(ClassPartsContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(uolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(uolParser.NEWLINE, i);
		}
		public ClassPartsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classPartsList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitClassPartsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassPartsListContext classPartsList() throws RecognitionException {
		ClassPartsListContext _localctx = new ClassPartsListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classPartsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(228);
				classParts();
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(229);
					match(NEWLINE);
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(239);
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
	public static class ClassPartsContext extends ParserRuleContext {
		public MemberDefineContext memberDefine() {
			return getRuleContext(MemberDefineContext.class,0);
		}
		public MessageDefineContext messageDefine() {
			return getRuleContext(MessageDefineContext.class,0);
		}
		public ClassPartsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParts; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitClassParts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassPartsContext classParts() throws RecognitionException {
		ClassPartsContext _localctx = new ClassPartsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_classParts);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				memberDefine();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				messageDefine();
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
	public static class MessageDefineContext extends ParserRuleContext {
		public TerminalNode MODIFIER() { return getToken(uolParser.MODIFIER, 0); }
		public FunctionDefineContext functionDefine() {
			return getRuleContext(FunctionDefineContext.class,0);
		}
		public TerminalNode INSTRUCTION() { return getToken(uolParser.INSTRUCTION, 0); }
		public MessageDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageDefine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitMessageDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageDefineContext messageDefine() throws RecognitionException {
		MessageDefineContext _localctx = new MessageDefineContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_messageDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(MODIFIER);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSTRUCTION) {
				{
				setState(245);
				match(INSTRUCTION);
				}
			}

			setState(248);
			functionDefine();
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
	public static class MemberDefineContext extends ParserRuleContext {
		public TerminalNode MODIFIER() { return getToken(uolParser.MODIFIER, 0); }
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public TerminalNode INSTRUCTION() { return getToken(uolParser.INSTRUCTION, 0); }
		public MemberDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDefine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitMemberDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDefineContext memberDefine() throws RecognitionException {
		MemberDefineContext _localctx = new MemberDefineContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_memberDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(MODIFIER);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSTRUCTION) {
				{
				setState(251);
				match(INSTRUCTION);
				}
			}

			setState(254);
			assignExpression();
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
	public static class FunctionDefineContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(uolParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(uolParser.IDENTIFIER, 0); }
		public LambdaDefineContext lambdaDefine() {
			return getRuleContext(LambdaDefineContext.class,0);
		}
		public FunctionDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitFunctionDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefineContext functionDefine() throws RecognitionException {
		FunctionDefineContext _localctx = new FunctionDefineContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionDefine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(FUNCTION);
			setState(257);
			match(IDENTIFIER);
			setState(258);
			lambdaDefine();
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
	public static class LambdaDefineContext extends ParserRuleContext {
		public ArgumentDefineListContext argumentDefineList() {
			return getRuleContext(ArgumentDefineListContext.class,0);
		}
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaDefine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitLambdaDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaDefineContext lambdaDefine() throws RecognitionException {
		LambdaDefineContext _localctx = new LambdaDefineContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_lambdaDefine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(T__3);
			setState(261);
			argumentDefineList();
			setState(262);
			match(T__4);
			setState(263);
			match(T__0);
			setState(264);
			lambdaBody();
			setState(265);
			match(T__2);
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
	public static class ReturnExpressionContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(uolParser.RETURN, 0); }
		public ResponseExpressionContext responseExpression() {
			return getRuleContext(ResponseExpressionContext.class,0);
		}
		public ReturnExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitReturnExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnExpressionContext returnExpression() throws RecognitionException {
		ReturnExpressionContext _localctx = new ReturnExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_returnExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(RETURN);
			setState(268);
			responseExpression();
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
	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitLambdaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lambdaBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			expressionList();
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
	public static class ArgumentDefineListContext extends ParserRuleContext {
		public ArgumentDefaultListContext argumentDefaultList() {
			return getRuleContext(ArgumentDefaultListContext.class,0);
		}
		public List<ArugumentNonDefaultListContext> arugumentNonDefaultList() {
			return getRuleContexts(ArugumentNonDefaultListContext.class);
		}
		public ArugumentNonDefaultListContext arugumentNonDefaultList(int i) {
			return getRuleContext(ArugumentNonDefaultListContext.class,i);
		}
		public ArgumentDefineListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentDefineList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitArgumentDefineList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentDefineListContext argumentDefineList() throws RecognitionException {
		ArgumentDefineListContext _localctx = new ArgumentDefineListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_argumentDefineList);
		try {
			int _alt;
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(272);
						arugumentNonDefaultList();
						}
						} 
					}
					setState(277);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(278);
				argumentDefaultList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				argumentDefaultList();
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
	public static class ArugumentNonDefaultListContext extends ParserRuleContext {
		public List<ArgumentNonDefaultContext> argumentNonDefault() {
			return getRuleContexts(ArgumentNonDefaultContext.class);
		}
		public ArgumentNonDefaultContext argumentNonDefault(int i) {
			return getRuleContext(ArgumentNonDefaultContext.class,i);
		}
		public ArugumentNonDefaultListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arugumentNonDefaultList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitArugumentNonDefaultList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArugumentNonDefaultListContext arugumentNonDefaultList() throws RecognitionException {
		ArugumentNonDefaultListContext _localctx = new ArugumentNonDefaultListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arugumentNonDefaultList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			argumentNonDefault();
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(283);
					match(T__1);
					setState(284);
					argumentNonDefault();
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
	public static class ArgumentNonDefaultContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(uolParser.IDENTIFIER, 0); }
		public ArgumentNonDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentNonDefault; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitArgumentNonDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentNonDefaultContext argumentNonDefault() throws RecognitionException {
		ArgumentNonDefaultContext _localctx = new ArgumentNonDefaultContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_argumentNonDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(IDENTIFIER);
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
	public static class ArgumentDefaultListContext extends ParserRuleContext {
		public List<ArgumentDefaultContext> argumentDefault() {
			return getRuleContexts(ArgumentDefaultContext.class);
		}
		public ArgumentDefaultContext argumentDefault(int i) {
			return getRuleContext(ArgumentDefaultContext.class,i);
		}
		public ArgumentDefaultListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentDefaultList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitArgumentDefaultList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentDefaultListContext argumentDefaultList() throws RecognitionException {
		ArgumentDefaultListContext _localctx = new ArgumentDefaultListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_argumentDefaultList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(292);
				argumentDefault();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(298);
				match(T__1);
				setState(299);
				argumentDefault();
				}
				}
				setState(304);
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
	public static class ArgumentDefaultContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(uolParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(uolParser.ASSIGN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArgumentDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentDefault; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitArgumentDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentDefaultContext argumentDefault() throws RecognitionException {
		ArgumentDefaultContext _localctx = new ArgumentDefaultContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_argumentDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(IDENTIFIER);
			setState(306);
			match(ASSIGN);
			setState(307);
			literal();
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
	public static class InstanceExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(uolParser.NEW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(uolParser.IDENTIFIER, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public InstanceExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitInstanceExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceExpressionContext instanceExpression() throws RecognitionException {
		InstanceExpressionContext _localctx = new InstanceExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_instanceExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(NEW);
			setState(310);
			match(IDENTIFIER);
			setState(311);
			match(T__3);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4457106473490L) != 0)) {
				{
				setState(312);
				argumentList();
				}
			}

			setState(315);
			match(T__4);
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
	public static class BooleanConditionExpressionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(uolParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionBodyContext conditionBody() {
			return getRuleContext(ConditionBodyContext.class,0);
		}
		public List<ConditionAnotherBodyContext> conditionAnotherBody() {
			return getRuleContexts(ConditionAnotherBodyContext.class);
		}
		public ConditionAnotherBodyContext conditionAnotherBody(int i) {
			return getRuleContext(ConditionAnotherBodyContext.class,i);
		}
		public BooleanConditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanConditionExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitBooleanConditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanConditionExpressionContext booleanConditionExpression() throws RecognitionException {
		BooleanConditionExpressionContext _localctx = new BooleanConditionExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_booleanConditionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(IF);
			setState(318);
			condition();
			setState(319);
			conditionBody();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(320);
				conditionAnotherBody();
				}
				}
				setState(325);
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
	public static class ConditionContext extends ParserRuleContext {
		public ConditionExpressionListContext conditionExpressionList() {
			return getRuleContext(ConditionExpressionListContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(T__3);
			setState(327);
			conditionExpressionList();
			setState(328);
			match(T__4);
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
	public static class ConditionBodyContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ConditionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitConditionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionBodyContext conditionBody() throws RecognitionException {
		ConditionBodyContext _localctx = new ConditionBodyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_conditionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__0);
			setState(331);
			expressionList();
			setState(332);
			match(T__2);
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
	public static class ConditionAnotherBodyContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(uolParser.ELSE, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ConditionAnotherBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionAnotherBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitConditionAnotherBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionAnotherBodyContext conditionAnotherBody() throws RecognitionException {
		ConditionAnotherBodyContext _localctx = new ConditionAnotherBodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_conditionAnotherBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(ELSE);
			setState(335);
			match(T__0);
			setState(336);
			expressionList();
			setState(337);
			match(T__2);
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
	public static class BooleanLoopExpressionContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(uolParser.WHILE, 0); }
		public ConditionExpressionListContext conditionExpressionList() {
			return getRuleContext(ConditionExpressionListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public BooleanLoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLoopExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitBooleanLoopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLoopExpressionContext booleanLoopExpression() throws RecognitionException {
		BooleanLoopExpressionContext _localctx = new BooleanLoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_booleanLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(WHILE);
			setState(340);
			match(T__3);
			setState(341);
			conditionExpressionList();
			setState(342);
			match(T__4);
			setState(343);
			match(T__0);
			setState(344);
			expressionList();
			setState(345);
			match(T__2);
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
	public static class ForEachExpressionContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(uolParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(uolParser.IDENTIFIER, 0); }
		public IterableExpressionContext iterableExpression() {
			return getRuleContext(IterableExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForEachExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEachExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitForEachExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForEachExpressionContext forEachExpression() throws RecognitionException {
		ForEachExpressionContext _localctx = new ForEachExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_forEachExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(FOR);
			setState(348);
			match(T__3);
			setState(349);
			match(IDENTIFIER);
			setState(350);
			match(T__5);
			setState(351);
			iterableExpression();
			setState(352);
			match(T__4);
			setState(353);
			match(T__0);
			setState(354);
			expressionList();
			setState(355);
			match(T__2);
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
	public static class ConditionExpressionListContext extends ParserRuleContext {
		public List<ConditionExpressionContext> conditionExpression() {
			return getRuleContexts(ConditionExpressionContext.class);
		}
		public ConditionExpressionContext conditionExpression(int i) {
			return getRuleContext(ConditionExpressionContext.class,i);
		}
		public List<TerminalNode> CONDITIONAL_LOGICAL_OPERATOR() { return getTokens(uolParser.CONDITIONAL_LOGICAL_OPERATOR); }
		public TerminalNode CONDITIONAL_LOGICAL_OPERATOR(int i) {
			return getToken(uolParser.CONDITIONAL_LOGICAL_OPERATOR, i);
		}
		public ConditionExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitConditionExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionExpressionListContext conditionExpressionList() throws RecognitionException {
		ConditionExpressionListContext _localctx = new ConditionExpressionListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_conditionExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			conditionExpression();
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONDITIONAL_LOGICAL_OPERATOR) {
				{
				{
				setState(358);
				match(CONDITIONAL_LOGICAL_OPERATOR);
				setState(359);
				conditionExpression();
				}
				}
				setState(364);
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
	public static class ConditionExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CONDITIONAL_OPERATOR() { return getToken(uolParser.CONDITIONAL_OPERATOR, 0); }
		public ConditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitConditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionExpressionContext conditionExpression() throws RecognitionException {
		ConditionExpressionContext _localctx = new ConditionExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_conditionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			expression();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONDITIONAL_OPERATOR) {
				{
				setState(366);
				match(CONDITIONAL_OPERATOR);
				setState(367);
				expression();
				}
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
	public static class AssignExpressionContext extends ParserRuleContext {
		public AssignAbleExpressionContext assignAbleExpression() {
			return getRuleContext(AssignAbleExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(uolParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitAssignExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignExpressionContext assignExpression() throws RecognitionException {
		AssignExpressionContext _localctx = new AssignExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_assignExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			assignAbleExpression();
			setState(371);
			match(ASSIGN);
			setState(372);
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
	public static class AssignAbleExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ChainExpressionContext chainExpression() {
			return getRuleContext(ChainExpressionContext.class,0);
		}
		public AssignAbleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignAbleExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitAssignAbleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignAbleExpressionContext assignAbleExpression() throws RecognitionException {
		AssignAbleExpressionContext _localctx = new AssignAbleExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_assignAbleExpression);
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				chainExpression();
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
	public static class ChainExpressionContext extends ParserRuleContext {
		public List<ElementExpressionContext> elementExpression() {
			return getRuleContexts(ElementExpressionContext.class);
		}
		public ElementExpressionContext elementExpression(int i) {
			return getRuleContext(ElementExpressionContext.class,i);
		}
		public ChainExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitChainExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainExpressionContext chainExpression() throws RecognitionException {
		ChainExpressionContext _localctx = new ChainExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_chainExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			elementExpression();
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(379);
					match(T__6);
					{
					setState(380);
					elementExpression();
					}
					}
					} 
				}
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
	public static class CallExpressionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(uolParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(uolParser.IDENTIFIER, i);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public CallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallExpressionContext callExpression() throws RecognitionException {
		CallExpressionContext _localctx = new CallExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_callExpression);
		int _la;
		try {
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				match(IDENTIFIER);
				setState(387);
				match(T__3);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4457106473490L) != 0)) {
					{
					setState(388);
					argumentList();
					}
				}

				setState(391);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(IDENTIFIER);
				setState(393);
				match(IDENTIFIER);
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(394);
					match(T__7);
					setState(395);
					argumentList();
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ArgumentContentContext> argumentContent() {
			return getRuleContexts(ArgumentContentContext.class);
		}
		public ArgumentContentContext argumentContent(int i) {
			return getRuleContext(ArgumentContentContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_argumentList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			argumentContent();
			setState(405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(401);
					match(T__1);
					setState(402);
					argumentContent();
					}
					} 
				}
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
	public static class ArgumentContentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitArgumentContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContentContext argumentContent() throws RecognitionException {
		ArgumentContentContext _localctx = new ArgumentContentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_argumentContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
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
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> ADDITIVE_OPERATOR() { return getTokens(uolParser.ADDITIVE_OPERATOR); }
		public TerminalNode ADDITIVE_OPERATOR(int i) {
			return getToken(uolParser.ADDITIVE_OPERATOR, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			multiplicativeExpression();
			setState(415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(411);
					match(ADDITIVE_OPERATOR);
					setState(412);
					multiplicativeExpression();
					}
					} 
				}
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULTIPLY_OPERATOR() { return getTokens(uolParser.MULTIPLY_OPERATOR); }
		public TerminalNode MULTIPLY_OPERATOR(int i) {
			return getToken(uolParser.MULTIPLY_OPERATOR, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			unaryExpression();
			setState(423);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(419);
					match(MULTIPLY_OPERATOR);
					setState(420);
					unaryExpression();
					}
					} 
				}
				setState(425);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		public CallExpressionContext callExpression() {
			return getRuleContext(CallExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ResponseExpressionContext responseExpression() {
			return getRuleContext(ResponseExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_unaryExpression);
		try {
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				callExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				match(T__3);
				setState(429);
				responseExpression();
				setState(430);
				match(T__4);
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
	public static class ListDefineContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ListDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDefine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitListDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDefineContext listDefine() throws RecognitionException {
		ListDefineContext _localctx = new ListDefineContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_listDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(T__8);
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4457106473490L) != 0)) {
				{
				{
				setState(435);
				expression();
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(436);
					match(T__1);
					setState(437);
					expression();
					}
					}
					setState(442);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(448);
			match(T__9);
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
	public static class ListDefineWithKeyContext extends ParserRuleContext {
		public List<ListDefineWithKeyContentContext> listDefineWithKeyContent() {
			return getRuleContexts(ListDefineWithKeyContentContext.class);
		}
		public ListDefineWithKeyContentContext listDefineWithKeyContent(int i) {
			return getRuleContext(ListDefineWithKeyContentContext.class,i);
		}
		public ListDefineWithKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDefineWithKey; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitListDefineWithKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDefineWithKeyContext listDefineWithKey() throws RecognitionException {
		ListDefineWithKeyContext _localctx = new ListDefineWithKeyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_listDefineWithKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(T__0);
			setState(451);
			listDefineWithKeyContent();
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(452);
				match(T__1);
				setState(453);
				listDefineWithKeyContent();
				}
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(459);
			match(T__2);
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
	public static class ListDefineWithKeyContentContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(uolParser.STRING_LITERAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListDefineWithKeyContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDefineWithKeyContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitListDefineWithKeyContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDefineWithKeyContentContext listDefineWithKeyContent() throws RecognitionException {
		ListDefineWithKeyContentContext _localctx = new ListDefineWithKeyContentContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_listDefineWithKeyContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(STRING_LITERAL);
			setState(462);
			match(T__7);
			setState(463);
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
	public static class ElementExpressionContext extends ParserRuleContext {
		public CallExpressionContext callExpression() {
			return getRuleContext(CallExpressionContext.class,0);
		}
		public InstanceExpressionContext instanceExpression() {
			return getRuleContext(InstanceExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ElementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitElementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementExpressionContext elementExpression() throws RecognitionException {
		ElementExpressionContext _localctx = new ElementExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_elementExpression);
		try {
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				callExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				instanceExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				unaryExpression();
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
	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(uolParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(uolParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(uolParser.BOOL_LITERAL, 0); }
		public TerminalNode NIL_LITERAL() { return getToken(uolParser.NIL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_literal);
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				integerLiteral();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(472);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(473);
				match(BOOL_LITERAL);
				}
				break;
			case NIL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(474);
				match(NIL_LITERAL);
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
	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(uolParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(uolParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(uolParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(uolParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 491520L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001*\u01e0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u0001\u0000\u0005\u0000h\b\u0000\n\u0000\f\u0000k\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000p\b\u0000\n\u0000\f\u0000s\t"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001y\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u0088\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u008e\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0097"+
		"\b\u0004\u0001\u0005\u0001\u0005\u0005\u0005\u009b\b\u0005\n\u0005\f\u0005"+
		"\u009e\t\u0005\u0005\u0005\u00a0\b\u0005\n\u0005\f\u0005\u00a3\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u00a7\b\u0005\n\u0005\f\u0005\u00aa"+
		"\t\u0005\u0003\u0005\u00ac\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00bc\b\b\n\b\f\b"+
		"\u00bf\t\b\u0003\b\u00c1\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00c9\b\t\u0001\n\u0001\n\u0001\n\u0003\n\u00ce\b\n\u0001\n"+
		"\u0003\n\u00d1\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u00e0"+
		"\b\r\n\r\f\r\u00e3\t\r\u0001\u000e\u0001\u000e\u0005\u000e\u00e7\b\u000e"+
		"\n\u000e\f\u000e\u00ea\t\u000e\u0005\u000e\u00ec\b\u000e\n\u000e\f\u000e"+
		"\u00ef\t\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00f3\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00f7\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00fd\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0005\u0016\u0112"+
		"\b\u0016\n\u0016\f\u0016\u0115\t\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0119\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u011e\b"+
		"\u0017\n\u0017\f\u0017\u0121\t\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0005\u0019\u0126\b\u0019\n\u0019\f\u0019\u0129\t\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u012d\b\u0019\n\u0019\f\u0019\u0130\t\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u013a\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0142\b\u001c\n\u001c"+
		"\f\u001c\u0145\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0005\"\u0169\b\"\n\"\f"+
		"\"\u016c\t\"\u0001#\u0001#\u0001#\u0003#\u0171\b#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0003%\u0179\b%\u0001&\u0001&\u0001&\u0005&\u017e"+
		"\b&\n&\f&\u0181\t&\u0001\'\u0001\'\u0001\'\u0003\'\u0186\b\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0003\'\u018d\b\'\u0003\'\u018f\b\'\u0001("+
		"\u0001(\u0001(\u0005(\u0194\b(\n(\f(\u0197\t(\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0005*\u019e\b*\n*\f*\u01a1\t*\u0001+\u0001+\u0001+\u0005+\u01a6"+
		"\b+\n+\f+\u01a9\t+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u01b1"+
		"\b,\u0001-\u0001-\u0001-\u0001-\u0005-\u01b7\b-\n-\f-\u01ba\t-\u0005-"+
		"\u01bc\b-\n-\f-\u01bf\t-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0005"+
		".\u01c7\b.\n.\f.\u01ca\t.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001"+
		"0\u00010\u00010\u00030\u01d5\b0\u00011\u00011\u00011\u00011\u00011\u0003"+
		"1\u01dc\b1\u00012\u00012\u00012\u0000\u00003\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\^`bd\u0000\u0001\u0001\u0000\u000f\u0012\u01f1\u0000"+
		"i\u0001\u0000\u0000\u0000\u0002x\u0001\u0000\u0000\u0000\u0004\u0087\u0001"+
		"\u0000\u0000\u0000\u0006\u008d\u0001\u0000\u0000\u0000\b\u0096\u0001\u0000"+
		"\u0000\u0000\n\u00a1\u0001\u0000\u0000\u0000\f\u00ad\u0001\u0000\u0000"+
		"\u0000\u000e\u00b2\u0001\u0000\u0000\u0000\u0010\u00b7\u0001\u0000\u0000"+
		"\u0000\u0012\u00c8\u0001\u0000\u0000\u0000\u0014\u00ca\u0001\u0000\u0000"+
		"\u0000\u0016\u00d6\u0001\u0000\u0000\u0000\u0018\u00d9\u0001\u0000\u0000"+
		"\u0000\u001a\u00dc\u0001\u0000\u0000\u0000\u001c\u00ed\u0001\u0000\u0000"+
		"\u0000\u001e\u00f2\u0001\u0000\u0000\u0000 \u00f4\u0001\u0000\u0000\u0000"+
		"\"\u00fa\u0001\u0000\u0000\u0000$\u0100\u0001\u0000\u0000\u0000&\u0104"+
		"\u0001\u0000\u0000\u0000(\u010b\u0001\u0000\u0000\u0000*\u010e\u0001\u0000"+
		"\u0000\u0000,\u0118\u0001\u0000\u0000\u0000.\u011a\u0001\u0000\u0000\u0000"+
		"0\u0122\u0001\u0000\u0000\u00002\u0127\u0001\u0000\u0000\u00004\u0131"+
		"\u0001\u0000\u0000\u00006\u0135\u0001\u0000\u0000\u00008\u013d\u0001\u0000"+
		"\u0000\u0000:\u0146\u0001\u0000\u0000\u0000<\u014a\u0001\u0000\u0000\u0000"+
		">\u014e\u0001\u0000\u0000\u0000@\u0153\u0001\u0000\u0000\u0000B\u015b"+
		"\u0001\u0000\u0000\u0000D\u0165\u0001\u0000\u0000\u0000F\u016d\u0001\u0000"+
		"\u0000\u0000H\u0172\u0001\u0000\u0000\u0000J\u0178\u0001\u0000\u0000\u0000"+
		"L\u017a\u0001\u0000\u0000\u0000N\u018e\u0001\u0000\u0000\u0000P\u0190"+
		"\u0001\u0000\u0000\u0000R\u0198\u0001\u0000\u0000\u0000T\u019a\u0001\u0000"+
		"\u0000\u0000V\u01a2\u0001\u0000\u0000\u0000X\u01b0\u0001\u0000\u0000\u0000"+
		"Z\u01b2\u0001\u0000\u0000\u0000\\\u01c2\u0001\u0000\u0000\u0000^\u01cd"+
		"\u0001\u0000\u0000\u0000`\u01d4\u0001\u0000\u0000\u0000b\u01db\u0001\u0000"+
		"\u0000\u0000d\u01dd\u0001\u0000\u0000\u0000fh\u0005\u000b\u0000\u0000"+
		"gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000"+
		"\u0000ij\u0001\u0000\u0000\u0000jq\u0001\u0000\u0000\u0000ki\u0001\u0000"+
		"\u0000\u0000lm\u0003\u0002\u0001\u0000mn\u0005\u000b\u0000\u0000np\u0001"+
		"\u0000\u0000\u0000ol\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u0001\u0001\u0000"+
		"\u0000\u0000sq\u0001\u0000\u0000\u0000ty\u0003\u000e\u0007\u0000uy\u0003"+
		"\f\u0006\u0000vy\u0003\u0014\n\u0000wy\u0003\u0004\u0002\u0000xt\u0001"+
		"\u0000\u0000\u0000xu\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"xw\u0001\u0000\u0000\u0000y\u0003\u0001\u0000\u0000\u0000z\u0088\u0003"+
		"b1\u0000{\u0088\u0003Z-\u0000|\u0088\u0003\\.\u0000}\u0088\u0003&\u0013"+
		"\u0000~\u0088\u00036\u001b\u0000\u007f\u0088\u0003N\'\u0000\u0080\u0088"+
		"\u0003L&\u0000\u0081\u0088\u0003H$\u0000\u0082\u0088\u0003$\u0012\u0000"+
		"\u0083\u0088\u00038\u001c\u0000\u0084\u0088\u0003@ \u0000\u0085\u0088"+
		"\u0003B!\u0000\u0086\u0088\u0003T*\u0000\u0087z\u0001\u0000\u0000\u0000"+
		"\u0087{\u0001\u0000\u0000\u0000\u0087|\u0001\u0000\u0000\u0000\u0087}"+
		"\u0001\u0000\u0000\u0000\u0087~\u0001\u0000\u0000\u0000\u0087\u007f\u0001"+
		"\u0000\u0000\u0000\u0087\u0080\u0001\u0000\u0000\u0000\u0087\u0081\u0001"+
		"\u0000\u0000\u0000\u0087\u0082\u0001\u0000\u0000\u0000\u0087\u0083\u0001"+
		"\u0000\u0000\u0000\u0087\u0084\u0001\u0000\u0000\u0000\u0087\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0005\u0001"+
		"\u0000\u0000\u0000\u0089\u008e\u0003b1\u0000\u008a\u008e\u0003N\'\u0000"+
		"\u008b\u008e\u0003L&\u0000\u008c\u008e\u0003T*\u0000\u008d\u0089\u0001"+
		"\u0000\u0000\u0000\u008d\u008a\u0001\u0000\u0000\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0007\u0001"+
		"\u0000\u0000\u0000\u008f\u0097\u0005\u0014\u0000\u0000\u0090\u0097\u0005"+
		"*\u0000\u0000\u0091\u0097\u0003Z-\u0000\u0092\u0097\u0003\\.\u0000\u0093"+
		"\u0097\u0003&\u0013\u0000\u0094\u0097\u0003N\'\u0000\u0095\u0097\u0003"+
		"L&\u0000\u0096\u008f\u0001\u0000\u0000\u0000\u0096\u0090\u0001\u0000\u0000"+
		"\u0000\u0096\u0091\u0001\u0000\u0000\u0000\u0096\u0092\u0001\u0000\u0000"+
		"\u0000\u0096\u0093\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000"+
		"\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\t\u0001\u0000\u0000\u0000"+
		"\u0098\u009c\u0003\u0004\u0002\u0000\u0099\u009b\u0005\u000b\u0000\u0000"+
		"\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u0098\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a2\u00ab\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a8\u0003(\u0014\u0000\u00a5\u00a7\u0005\u000b\u0000\u0000\u00a6"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a4\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac"+
		"\u000b\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0016\u0000\u0000\u00ae"+
		"\u00af\u0005*\u0000\u0000\u00af\u00b0\u0005\u0018\u0000\u0000\u00b0\u00b1"+
		"\u0005\u0014\u0000\u0000\u00b1\r\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005"+
		"\u0016\u0000\u0000\u00b3\u00b4\u0003\u0010\b\u0000\u00b4\u00b5\u0005\u0018"+
		"\u0000\u0000\u00b5\u00b6\u0005\u0014\u0000\u0000\u00b6\u000f\u0001\u0000"+
		"\u0000\u0000\u00b7\u00c0\u0005\u0001\u0000\u0000\u00b8\u00bd\u0003\u0012"+
		"\t\u0000\u00b9\u00ba\u0005\u0002\u0000\u0000\u00ba\u00bc\u0003\u0012\t"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000"+
		"\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c0\u00b8\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u0003\u0000"+
		"\u0000\u00c3\u0011\u0001\u0000\u0000\u0000\u00c4\u00c9\u0005*\u0000\u0000"+
		"\u00c5\u00c6\u0005*\u0000\u0000\u00c6\u00c7\u0005\u0017\u0000\u0000\u00c7"+
		"\u00c9\u0005*\u0000\u0000\u00c8\u00c4\u0001\u0000\u0000\u0000\u00c8\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c9\u0013\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0005\u0019\u0000\u0000\u00cb\u00cd\u0005*\u0000\u0000\u00cc\u00ce\u0003"+
		"\u0016\u000b\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001"+
		"\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf\u00d1\u0003"+
		"\u0018\f\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0001"+
		"\u0000\u0000\u00d3\u00d4\u0003\u001c\u000e\u0000\u00d4\u00d5\u0005\u0003"+
		"\u0000\u0000\u00d5\u0015\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u001a"+
		"\u0000\u0000\u00d7\u00d8\u0005*\u0000\u0000\u00d8\u0017\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0005\u001b\u0000\u0000\u00da\u00db\u0003\u001a\r\u0000"+
		"\u00db\u0019\u0001\u0000\u0000\u0000\u00dc\u00e1\u0005*\u0000\u0000\u00dd"+
		"\u00de\u0005\u0002\u0000\u0000\u00de\u00e0\u0005*\u0000\u0000\u00df\u00dd"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u001b"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e8"+
		"\u0003\u001e\u000f\u0000\u00e5\u00e7\u0005\u000b\u0000\u0000\u00e6\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00e4"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u001d"+
		"\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f3"+
		"\u0003\"\u0011\u0000\u00f1\u00f3\u0003 \u0010\u0000\u00f2\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3\u001f\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f6\u0005\u001c\u0000\u0000\u00f5\u00f7\u0005"+
		"\u001d\u0000\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0003"+
		"$\u0012\u0000\u00f9!\u0001\u0000\u0000\u0000\u00fa\u00fc\u0005\u001c\u0000"+
		"\u0000\u00fb\u00fd\u0005\u001d\u0000\u0000\u00fc\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0003H$\u0000\u00ff#\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0005\u001e\u0000\u0000\u0101\u0102\u0005*\u0000\u0000\u0102\u0103"+
		"\u0003&\u0013\u0000\u0103%\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u0004"+
		"\u0000\u0000\u0105\u0106\u0003,\u0016\u0000\u0106\u0107\u0005\u0005\u0000"+
		"\u0000\u0107\u0108\u0005\u0001\u0000\u0000\u0108\u0109\u0003*\u0015\u0000"+
		"\u0109\u010a\u0005\u0003\u0000\u0000\u010a\'\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0005)\u0000\u0000\u010c\u010d\u0003\u0006\u0003\u0000\u010d)\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0003\n\u0005\u0000\u010f+\u0001\u0000"+
		"\u0000\u0000\u0110\u0112\u0003.\u0017\u0000\u0111\u0110\u0001\u0000\u0000"+
		"\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0116\u0001\u0000\u0000"+
		"\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u0119\u00032\u0019\u0000"+
		"\u0117\u0119\u00032\u0019\u0000\u0118\u0113\u0001\u0000\u0000\u0000\u0118"+
		"\u0117\u0001\u0000\u0000\u0000\u0119-\u0001\u0000\u0000\u0000\u011a\u011f"+
		"\u00030\u0018\u0000\u011b\u011c\u0005\u0002\u0000\u0000\u011c\u011e\u0003"+
		"0\u0018\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000"+
		"\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000"+
		"\u0000\u0000\u0120/\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0005*\u0000\u0000\u01231\u0001\u0000\u0000\u0000\u0124"+
		"\u0126\u00034\u001a\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0126\u0129"+
		"\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0128"+
		"\u0001\u0000\u0000\u0000\u0128\u012e\u0001\u0000\u0000\u0000\u0129\u0127"+
		"\u0001\u0000\u0000\u0000\u012a\u012b\u0005\u0002\u0000\u0000\u012b\u012d"+
		"\u00034\u001a\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u0130\u0001"+
		"\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001"+
		"\u0000\u0000\u0000\u012f3\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u0005*\u0000\u0000\u0132\u0133\u0005$\u0000\u0000"+
		"\u0133\u0134\u0003b1\u0000\u01345\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0005\u001f\u0000\u0000\u0136\u0137\u0005*\u0000\u0000\u0137\u0139\u0005"+
		"\u0004\u0000\u0000\u0138\u013a\u0003P(\u0000\u0139\u0138\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000"+
		"\u0000\u013b\u013c\u0005\u0005\u0000\u0000\u013c7\u0001\u0000\u0000\u0000"+
		"\u013d\u013e\u0005 \u0000\u0000\u013e\u013f\u0003:\u001d\u0000\u013f\u0143"+
		"\u0003<\u001e\u0000\u0140\u0142\u0003>\u001f\u0000\u0141\u0140\u0001\u0000"+
		"\u0000\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000"+
		"\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u01449\u0001\u0000\u0000"+
		"\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u0147\u0005\u0004\u0000"+
		"\u0000\u0147\u0148\u0003D\"\u0000\u0148\u0149\u0005\u0005\u0000\u0000"+
		"\u0149;\u0001\u0000\u0000\u0000\u014a\u014b\u0005\u0001\u0000\u0000\u014b"+
		"\u014c\u0003\n\u0005\u0000\u014c\u014d\u0005\u0003\u0000\u0000\u014d="+
		"\u0001\u0000\u0000\u0000\u014e\u014f\u0005!\u0000\u0000\u014f\u0150\u0005"+
		"\u0001\u0000\u0000\u0150\u0151\u0003\n\u0005\u0000\u0151\u0152\u0005\u0003"+
		"\u0000\u0000\u0152?\u0001\u0000\u0000\u0000\u0153\u0154\u0005\"\u0000"+
		"\u0000\u0154\u0155\u0005\u0004\u0000\u0000\u0155\u0156\u0003D\"\u0000"+
		"\u0156\u0157\u0005\u0005\u0000\u0000\u0157\u0158\u0005\u0001\u0000\u0000"+
		"\u0158\u0159\u0003\n\u0005\u0000\u0159\u015a\u0005\u0003\u0000\u0000\u015a"+
		"A\u0001\u0000\u0000\u0000\u015b\u015c\u0005#\u0000\u0000\u015c\u015d\u0005"+
		"\u0004\u0000\u0000\u015d\u015e\u0005*\u0000\u0000\u015e\u015f\u0005\u0006"+
		"\u0000\u0000\u015f\u0160\u0003\b\u0004\u0000\u0160\u0161\u0005\u0005\u0000"+
		"\u0000\u0161\u0162\u0005\u0001\u0000\u0000\u0162\u0163\u0003\n\u0005\u0000"+
		"\u0163\u0164\u0005\u0003\u0000\u0000\u0164C\u0001\u0000\u0000\u0000\u0165"+
		"\u016a\u0003F#\u0000\u0166\u0167\u0005(\u0000\u0000\u0167\u0169\u0003"+
		"F#\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0169\u016c\u0001\u0000\u0000"+
		"\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000"+
		"\u0000\u016bE\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000"+
		"\u016d\u0170\u0003\u0004\u0002\u0000\u016e\u016f\u0005\'\u0000\u0000\u016f"+
		"\u0171\u0003\u0004\u0002\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170"+
		"\u0171\u0001\u0000\u0000\u0000\u0171G\u0001\u0000\u0000\u0000\u0172\u0173"+
		"\u0003J%\u0000\u0173\u0174\u0005$\u0000\u0000\u0174\u0175\u0003\u0004"+
		"\u0002\u0000\u0175I\u0001\u0000\u0000\u0000\u0176\u0179\u0003X,\u0000"+
		"\u0177\u0179\u0003L&\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0177"+
		"\u0001\u0000\u0000\u0000\u0179K\u0001\u0000\u0000\u0000\u017a\u017f\u0003"+
		"`0\u0000\u017b\u017c\u0005\u0007\u0000\u0000\u017c\u017e\u0003`0\u0000"+
		"\u017d\u017b\u0001\u0000\u0000\u0000\u017e\u0181\u0001\u0000\u0000\u0000"+
		"\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000"+
		"\u0180M\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0182"+
		"\u0183\u0005*\u0000\u0000\u0183\u0185\u0005\u0004\u0000\u0000\u0184\u0186"+
		"\u0003P(\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000"+
		"\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u018f\u0005\u0005"+
		"\u0000\u0000\u0188\u0189\u0005*\u0000\u0000\u0189\u018c\u0005*\u0000\u0000"+
		"\u018a\u018b\u0005\b\u0000\u0000\u018b\u018d\u0003P(\u0000\u018c\u018a"+
		"\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018f"+
		"\u0001\u0000\u0000\u0000\u018e\u0182\u0001\u0000\u0000\u0000\u018e\u0188"+
		"\u0001\u0000\u0000\u0000\u018fO\u0001\u0000\u0000\u0000\u0190\u0195\u0003"+
		"R)\u0000\u0191\u0192\u0005\u0002\u0000\u0000\u0192\u0194\u0003R)\u0000"+
		"\u0193\u0191\u0001\u0000\u0000\u0000\u0194\u0197\u0001\u0000\u0000\u0000"+
		"\u0195\u0193\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000"+
		"\u0196Q\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0198"+
		"\u0199\u0003\u0004\u0002\u0000\u0199S\u0001\u0000\u0000\u0000\u019a\u019f"+
		"\u0003V+\u0000\u019b\u019c\u0005%\u0000\u0000\u019c\u019e\u0003V+\u0000"+
		"\u019d\u019b\u0001\u0000\u0000\u0000\u019e\u01a1\u0001\u0000\u0000\u0000"+
		"\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a0U\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a2"+
		"\u01a7\u0003X,\u0000\u01a3\u01a4\u0005&\u0000\u0000\u01a4\u01a6\u0003"+
		"X,\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000"+
		"\u0000\u01a8W\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000"+
		"\u01aa\u01b1\u0003N\'\u0000\u01ab\u01b1\u0003b1\u0000\u01ac\u01ad\u0005"+
		"\u0004\u0000\u0000\u01ad\u01ae\u0003\u0006\u0003\u0000\u01ae\u01af\u0005"+
		"\u0005\u0000\u0000\u01af\u01b1\u0001\u0000\u0000\u0000\u01b0\u01aa\u0001"+
		"\u0000\u0000\u0000\u01b0\u01ab\u0001\u0000\u0000\u0000\u01b0\u01ac\u0001"+
		"\u0000\u0000\u0000\u01b1Y\u0001\u0000\u0000\u0000\u01b2\u01bd\u0005\t"+
		"\u0000\u0000\u01b3\u01b8\u0003\u0004\u0002\u0000\u01b4\u01b5\u0005\u0002"+
		"\u0000\u0000\u01b5\u01b7\u0003\u0004\u0002\u0000\u01b6\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b7\u01ba\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01bc\u0001\u0000"+
		"\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01bb\u01b3\u0001\u0000"+
		"\u0000\u0000\u01bc\u01bf\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000"+
		"\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01c0\u0001\u0000"+
		"\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005\n\u0000"+
		"\u0000\u01c1[\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005\u0001\u0000\u0000"+
		"\u01c3\u01c8\u0003^/\u0000\u01c4\u01c5\u0005\u0002\u0000\u0000\u01c5\u01c7"+
		"\u0003^/\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c7\u01ca\u0001\u0000"+
		"\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000"+
		"\u0000\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000"+
		"\u0000\u0000\u01cb\u01cc\u0005\u0003\u0000\u0000\u01cc]\u0001\u0000\u0000"+
		"\u0000\u01cd\u01ce\u0005\u0014\u0000\u0000\u01ce\u01cf\u0005\b\u0000\u0000"+
		"\u01cf\u01d0\u0003\u0004\u0002\u0000\u01d0_\u0001\u0000\u0000\u0000\u01d1"+
		"\u01d5\u0003N\'\u0000\u01d2\u01d5\u00036\u001b\u0000\u01d3\u01d5\u0003"+
		"X,\u0000\u01d4\u01d1\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d5a\u0001\u0000\u0000\u0000"+
		"\u01d6\u01dc\u0003d2\u0000\u01d7\u01dc\u0005*\u0000\u0000\u01d8\u01dc"+
		"\u0005\u0014\u0000\u0000\u01d9\u01dc\u0005\u0013\u0000\u0000\u01da\u01dc"+
		"\u0005\u0015\u0000\u0000\u01db\u01d6\u0001\u0000\u0000\u0000\u01db\u01d7"+
		"\u0001\u0000\u0000\u0000\u01db\u01d8\u0001\u0000\u0000\u0000\u01db\u01d9"+
		"\u0001\u0000\u0000\u0000\u01db\u01da\u0001\u0000\u0000\u0000\u01dcc\u0001"+
		"\u0000\u0000\u0000\u01dd\u01de\u0007\u0000\u0000\u0000\u01dee\u0001\u0000"+
		"\u0000\u0000,iqx\u0087\u008d\u0096\u009c\u00a1\u00a8\u00ab\u00bd\u00c0"+
		"\u00c8\u00cd\u00d0\u00e1\u00e8\u00ed\u00f2\u00f6\u00fc\u0113\u0118\u011f"+
		"\u0127\u012e\u0139\u0143\u016a\u0170\u0178\u017f\u0185\u018c\u018e\u0195"+
		"\u019f\u01a7\u01b0\u01b8\u01bd\u01c8\u01d4\u01db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}