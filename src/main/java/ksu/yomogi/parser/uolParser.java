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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NEWLINE=8, WS=9, 
		SINGLE_COMMET=10, MULTI_COMMET=11, DECIMAL_LITERAL=12, HEX_LITERAL=13, 
		OCT_LITERAL=14, BINARY_LITERAL=15, BOOL_LITERAL=16, STRING_LITERAL=17, 
		NIL_LITERAL=18, IMPORT=19, AS=20, FROM=21, CLASS=22, EXTENDS=23, IMPLEMENTS=24, 
		MODIFIER=25, INSTRUCTION=26, FUNCTION=27, NEW=28, IF=29, ELSE=30, ASSIGN=31, 
		ADDITIVE_OPERATOR=32, MULTIPLY_OPERATOR=33, CONDITIONAL_OPERATOR=34, CONDITIONAL_LOGICAL_OPERATOR=35, 
		RETURN=36, IDENTIFIER=37;
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_expression = 2, RULE_responseExpression = 3, 
		RULE_expressionList = 4, RULE_partsImportStatement = 5, RULE_partsImportContentList = 6, 
		RULE_partsImportContent = 7, RULE_classDefine = 8, RULE_extendPart = 9, 
		RULE_interfaceParts = 10, RULE_interfaceList = 11, RULE_classPartsList = 12, 
		RULE_classParts = 13, RULE_messageDefine = 14, RULE_memberDefine = 15, 
		RULE_functionDefine = 16, RULE_lambdaDefine = 17, RULE_returnExpression = 18, 
		RULE_lambdaBody = 19, RULE_argumentDefineList = 20, RULE_arugumentNonDefaultList = 21, 
		RULE_argumentNonDefault = 22, RULE_argumentDefaultList = 23, RULE_argumentDefault = 24, 
		RULE_instanceExpression = 25, RULE_booleanConditionExpression = 26, RULE_condition = 27, 
		RULE_conditionBody = 28, RULE_conditionAnotherBody = 29, RULE_conditionExpressionList = 30, 
		RULE_conditionExpression = 31, RULE_assignExpression = 32, RULE_assignAbleExpression = 33, 
		RULE_chainExpression = 34, RULE_callExpression = 35, RULE_argumentList = 36, 
		RULE_argumentContent = 37, RULE_additiveExpression = 38, RULE_multiplicativeExpression = 39, 
		RULE_unaryExpression = 40, RULE_elementExpression = 41, RULE_literal = 42, 
		RULE_integerLiteral = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "statement", "expression", "responseExpression", "expressionList", 
			"partsImportStatement", "partsImportContentList", "partsImportContent", 
			"classDefine", "extendPart", "interfaceParts", "interfaceList", "classPartsList", 
			"classParts", "messageDefine", "memberDefine", "functionDefine", "lambdaDefine", 
			"returnExpression", "lambdaBody", "argumentDefineList", "arugumentNonDefaultList", 
			"argumentNonDefault", "argumentDefaultList", "argumentDefault", "instanceExpression", 
			"booleanConditionExpression", "condition", "conditionBody", "conditionAnotherBody", 
			"conditionExpressionList", "conditionExpression", "assignExpression", 
			"assignAbleExpression", "chainExpression", "callExpression", "argumentList", 
			"argumentContent", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "elementExpression", "literal", "integerLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "'('", "')'", "'.'", "': '", null, null, null, 
			null, null, null, null, null, null, null, "'nil'", "'import'", "'as'", 
			"'from'", "'class'", "'extends'", "'implements'", null, null, "'function'", 
			"'new'", "'if'", "'else'", null, null, null, null, null, "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "NEWLINE", "WS", "SINGLE_COMMET", 
			"MULTI_COMMET", "DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", 
			"BOOL_LITERAL", "STRING_LITERAL", "NIL_LITERAL", "IMPORT", "AS", "FROM", 
			"CLASS", "EXTENDS", "IMPLEMENTS", "MODIFIER", "INSTRUCTION", "FUNCTION", 
			"NEW", "IF", "ELSE", "ASSIGN", "ADDITIVE_OPERATOR", "MULTIPLY_OPERATOR", 
			"CONDITIONAL_OPERATOR", "CONDITIONAL_LOGICAL_OPERATOR", "RETURN", "IDENTIFIER"
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
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(88);
				match(NEWLINE);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 138383716368L) != 0)) {
				{
				{
				setState(94);
				statement();
				setState(95);
				match(NEWLINE);
				}
				}
				setState(101);
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
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				partsImportStatement();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				classDefine();
				}
				break;
			case T__3:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case NIL_LITERAL:
			case FUNCTION:
			case NEW:
			case IF:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				expression();
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
	public static class ExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
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
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				lambdaDefine();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				instanceExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				callExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
				chainExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(112);
				assignExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(113);
				functionDefine();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(114);
				booleanConditionExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(115);
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
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				callExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				chainExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
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
		enterRule(_localctx, 8, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 138378997776L) != 0)) {
				{
				{
				setState(124);
				expression();
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(125);
					match(NEWLINE);
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(136);
				returnExpression();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(137);
					match(NEWLINE);
					}
					}
					setState(142);
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
		enterRule(_localctx, 10, RULE_partsImportStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(IMPORT);
			setState(146);
			partsImportContentList();
			setState(147);
			match(FROM);
			setState(148);
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
		enterRule(_localctx, 12, RULE_partsImportContentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__0);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(151);
				partsImportContent();
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(152);
					match(T__1);
					setState(153);
					partsImportContent();
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(161);
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
		enterRule(_localctx, 14, RULE_partsImportContent);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(IDENTIFIER);
				setState(165);
				match(AS);
				setState(166);
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
		enterRule(_localctx, 16, RULE_classDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(CLASS);
			setState(170);
			match(IDENTIFIER);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(171);
				extendPart();
				}
			}

			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(174);
				interfaceParts();
				}
			}

			setState(177);
			match(T__0);
			setState(178);
			classPartsList();
			setState(179);
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
		enterRule(_localctx, 18, RULE_extendPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(181);
			match(EXTENDS);
			setState(182);
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
		enterRule(_localctx, 20, RULE_interfaceParts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(184);
			match(IMPLEMENTS);
			setState(185);
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
		enterRule(_localctx, 22, RULE_interfaceList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(IDENTIFIER);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(188);
				match(T__1);
				setState(189);
				match(IDENTIFIER);
				}
				}
				setState(194);
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
		enterRule(_localctx, 24, RULE_classPartsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(195);
				classParts();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(196);
					match(NEWLINE);
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(206);
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
		enterRule(_localctx, 26, RULE_classParts);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				memberDefine();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
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
		enterRule(_localctx, 28, RULE_messageDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(MODIFIER);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSTRUCTION) {
				{
				setState(212);
				match(INSTRUCTION);
				}
			}

			setState(215);
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
		enterRule(_localctx, 30, RULE_memberDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(MODIFIER);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSTRUCTION) {
				{
				setState(218);
				match(INSTRUCTION);
				}
			}

			setState(221);
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
		enterRule(_localctx, 32, RULE_functionDefine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(FUNCTION);
			setState(224);
			match(IDENTIFIER);
			setState(225);
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
		enterRule(_localctx, 34, RULE_lambdaDefine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__3);
			setState(228);
			argumentDefineList();
			setState(229);
			match(T__4);
			setState(230);
			match(T__0);
			setState(231);
			lambdaBody();
			setState(232);
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
		enterRule(_localctx, 36, RULE_returnExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(RETURN);
			setState(235);
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
		enterRule(_localctx, 38, RULE_lambdaBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
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
		enterRule(_localctx, 40, RULE_argumentDefineList);
		try {
			int _alt;
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(239);
						arugumentNonDefaultList();
						}
						} 
					}
					setState(244);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(245);
				argumentDefaultList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
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
		enterRule(_localctx, 42, RULE_arugumentNonDefaultList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			argumentNonDefault();
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(250);
					match(T__1);
					setState(251);
					argumentNonDefault();
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 44, RULE_argumentNonDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
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
		enterRule(_localctx, 46, RULE_argumentDefaultList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(259);
				argumentDefault();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(265);
				match(T__1);
				setState(266);
				argumentDefault();
				}
				}
				setState(271);
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
		enterRule(_localctx, 48, RULE_argumentDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(IDENTIFIER);
			setState(273);
			match(ASSIGN);
			setState(274);
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
		enterRule(_localctx, 50, RULE_instanceExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(NEW);
			setState(277);
			match(IDENTIFIER);
			setState(278);
			match(T__3);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 138378997776L) != 0)) {
				{
				setState(279);
				argumentList();
				}
			}

			setState(282);
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
		enterRule(_localctx, 52, RULE_booleanConditionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(IF);
			setState(285);
			condition();
			setState(286);
			conditionBody();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(287);
				conditionAnotherBody();
				}
				}
				setState(292);
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
		enterRule(_localctx, 54, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__3);
			setState(294);
			conditionExpressionList();
			setState(295);
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
		enterRule(_localctx, 56, RULE_conditionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(T__0);
			setState(298);
			expressionList();
			setState(299);
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
		enterRule(_localctx, 58, RULE_conditionAnotherBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(ELSE);
			setState(302);
			match(T__0);
			setState(303);
			expressionList();
			setState(304);
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
		enterRule(_localctx, 60, RULE_conditionExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			conditionExpression();
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONDITIONAL_LOGICAL_OPERATOR) {
				{
				{
				setState(307);
				match(CONDITIONAL_LOGICAL_OPERATOR);
				setState(308);
				conditionExpression();
				}
				}
				setState(313);
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
		enterRule(_localctx, 62, RULE_conditionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			expression();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONDITIONAL_OPERATOR) {
				{
				setState(315);
				match(CONDITIONAL_OPERATOR);
				setState(316);
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
		enterRule(_localctx, 64, RULE_assignExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			assignAbleExpression();
			setState(320);
			match(ASSIGN);
			setState(321);
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
		enterRule(_localctx, 66, RULE_assignAbleExpression);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
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
		enterRule(_localctx, 68, RULE_chainExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			elementExpression();
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(328);
					match(T__5);
					{
					setState(329);
					elementExpression();
					}
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 70, RULE_callExpression);
		int _la;
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(IDENTIFIER);
				setState(336);
				match(T__3);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 138378997776L) != 0)) {
					{
					setState(337);
					argumentList();
					}
				}

				setState(340);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(IDENTIFIER);
				setState(342);
				match(IDENTIFIER);
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(343);
					match(T__6);
					setState(344);
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
		enterRule(_localctx, 72, RULE_argumentList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			argumentContent();
			setState(354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(350);
					match(T__1);
					setState(351);
					argumentContent();
					}
					} 
				}
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		enterRule(_localctx, 74, RULE_argumentContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
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
		enterRule(_localctx, 76, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			multiplicativeExpression();
			setState(364);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(360);
					match(ADDITIVE_OPERATOR);
					setState(361);
					multiplicativeExpression();
					}
					} 
				}
				setState(366);
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
		enterRule(_localctx, 78, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			unaryExpression();
			setState(372);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(368);
					match(MULTIPLY_OPERATOR);
					setState(369);
					unaryExpression();
					}
					} 
				}
				setState(374);
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
		enterRule(_localctx, 80, RULE_unaryExpression);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				callExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				match(T__3);
				setState(378);
				responseExpression();
				setState(379);
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
		enterRule(_localctx, 82, RULE_elementExpression);
		try {
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				callExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				instanceExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
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
		enterRule(_localctx, 84, RULE_literal);
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				integerLiteral();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				match(BOOL_LITERAL);
				}
				break;
			case NIL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(392);
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
		enterRule(_localctx, 86, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 61440L) != 0)) ) {
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
		"\u0004\u0001%\u018e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000\u0005\u0000"+
		"Z\b\u0000\n\u0000\f\u0000]\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000b\b\u0000\n\u0000\f\u0000e\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001j\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002u\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003{\b\u0003\u0001\u0004\u0001\u0004\u0005\u0004\u007f\b\u0004"+
		"\n\u0004\f\u0004\u0082\t\u0004\u0005\u0004\u0084\b\u0004\n\u0004\f\u0004"+
		"\u0087\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u008b\b\u0004\n\u0004"+
		"\f\u0004\u008e\t\u0004\u0003\u0004\u0090\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u009b\b\u0006\n\u0006\f\u0006\u009e\t\u0006\u0003"+
		"\u0006\u00a0\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00a8\b\u0007\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u00ad\b\b\u0001\b\u0003\b\u00b0\b\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00bf\b\u000b\n\u000b\f\u000b\u00c2\t\u000b\u0001"+
		"\f\u0001\f\u0005\f\u00c6\b\f\n\f\f\f\u00c9\t\f\u0005\f\u00cb\b\f\n\f\f"+
		"\f\u00ce\t\f\u0001\r\u0001\r\u0003\r\u00d2\b\r\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00d6\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00dc\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0005\u0014\u00f1\b\u0014\n\u0014"+
		"\f\u0014\u00f4\t\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00f8\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00fd\b\u0015\n\u0015"+
		"\f\u0015\u0100\t\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0005\u0017"+
		"\u0105\b\u0017\n\u0017\f\u0017\u0108\t\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u010c\b\u0017\n\u0017\f\u0017\u010f\t\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0119\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u0121\b\u001a\n\u001a\f\u001a\u0124"+
		"\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0136"+
		"\b\u001e\n\u001e\f\u001e\u0139\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u013e\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0003"+
		"!\u0146\b!\u0001\"\u0001\"\u0001\"\u0005\"\u014b\b\"\n\"\f\"\u014e\t\""+
		"\u0001#\u0001#\u0001#\u0003#\u0153\b#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u015a\b#\u0003#\u015c\b#\u0001$\u0001$\u0001$\u0005$\u0161\b"+
		"$\n$\f$\u0164\t$\u0001%\u0001%\u0001&\u0001&\u0001&\u0005&\u016b\b&\n"+
		"&\f&\u016e\t&\u0001\'\u0001\'\u0001\'\u0005\'\u0173\b\'\n\'\f\'\u0176"+
		"\t\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u017e\b(\u0001)"+
		"\u0001)\u0001)\u0003)\u0183\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0003"+
		"*\u018a\b*\u0001+\u0001+\u0001+\u0000\u0000,\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTV\u0000\u0001\u0001\u0000\f\u000f\u0198\u0000[\u0001"+
		"\u0000\u0000\u0000\u0002i\u0001\u0000\u0000\u0000\u0004t\u0001\u0000\u0000"+
		"\u0000\u0006z\u0001\u0000\u0000\u0000\b\u0085\u0001\u0000\u0000\u0000"+
		"\n\u0091\u0001\u0000\u0000\u0000\f\u0096\u0001\u0000\u0000\u0000\u000e"+
		"\u00a7\u0001\u0000\u0000\u0000\u0010\u00a9\u0001\u0000\u0000\u0000\u0012"+
		"\u00b5\u0001\u0000\u0000\u0000\u0014\u00b8\u0001\u0000\u0000\u0000\u0016"+
		"\u00bb\u0001\u0000\u0000\u0000\u0018\u00cc\u0001\u0000\u0000\u0000\u001a"+
		"\u00d1\u0001\u0000\u0000\u0000\u001c\u00d3\u0001\u0000\u0000\u0000\u001e"+
		"\u00d9\u0001\u0000\u0000\u0000 \u00df\u0001\u0000\u0000\u0000\"\u00e3"+
		"\u0001\u0000\u0000\u0000$\u00ea\u0001\u0000\u0000\u0000&\u00ed\u0001\u0000"+
		"\u0000\u0000(\u00f7\u0001\u0000\u0000\u0000*\u00f9\u0001\u0000\u0000\u0000"+
		",\u0101\u0001\u0000\u0000\u0000.\u0106\u0001\u0000\u0000\u00000\u0110"+
		"\u0001\u0000\u0000\u00002\u0114\u0001\u0000\u0000\u00004\u011c\u0001\u0000"+
		"\u0000\u00006\u0125\u0001\u0000\u0000\u00008\u0129\u0001\u0000\u0000\u0000"+
		":\u012d\u0001\u0000\u0000\u0000<\u0132\u0001\u0000\u0000\u0000>\u013a"+
		"\u0001\u0000\u0000\u0000@\u013f\u0001\u0000\u0000\u0000B\u0145\u0001\u0000"+
		"\u0000\u0000D\u0147\u0001\u0000\u0000\u0000F\u015b\u0001\u0000\u0000\u0000"+
		"H\u015d\u0001\u0000\u0000\u0000J\u0165\u0001\u0000\u0000\u0000L\u0167"+
		"\u0001\u0000\u0000\u0000N\u016f\u0001\u0000\u0000\u0000P\u017d\u0001\u0000"+
		"\u0000\u0000R\u0182\u0001\u0000\u0000\u0000T\u0189\u0001\u0000\u0000\u0000"+
		"V\u018b\u0001\u0000\u0000\u0000XZ\u0005\b\u0000\u0000YX\u0001\u0000\u0000"+
		"\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\c\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^_\u0003"+
		"\u0002\u0001\u0000_`\u0005\b\u0000\u0000`b\u0001\u0000\u0000\u0000a^\u0001"+
		"\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000d\u0001\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000fj\u0003\n\u0005\u0000gj\u0003\u0010\b\u0000hj\u0003\u0004"+
		"\u0002\u0000if\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ih\u0001"+
		"\u0000\u0000\u0000j\u0003\u0001\u0000\u0000\u0000ku\u0003T*\u0000lu\u0003"+
		"\"\u0011\u0000mu\u00032\u0019\u0000nu\u0003F#\u0000ou\u0003D\"\u0000p"+
		"u\u0003@ \u0000qu\u0003 \u0010\u0000ru\u00034\u001a\u0000su\u0003L&\u0000"+
		"tk\u0001\u0000\u0000\u0000tl\u0001\u0000\u0000\u0000tm\u0001\u0000\u0000"+
		"\u0000tn\u0001\u0000\u0000\u0000to\u0001\u0000\u0000\u0000tp\u0001\u0000"+
		"\u0000\u0000tq\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000ts\u0001"+
		"\u0000\u0000\u0000u\u0005\u0001\u0000\u0000\u0000v{\u0003T*\u0000w{\u0003"+
		"F#\u0000x{\u0003D\"\u0000y{\u0003L&\u0000zv\u0001\u0000\u0000\u0000zw"+
		"\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000"+
		"\u0000{\u0007\u0001\u0000\u0000\u0000|\u0080\u0003\u0004\u0002\u0000}"+
		"\u007f\u0005\b\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0082\u0001"+
		"\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000"+
		"\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000"+
		"\u0000\u0000\u0083|\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000"+
		"\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u008f\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0088\u008c\u0003$\u0012\u0000\u0089\u008b\u0005\b\u0000\u0000"+
		"\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000"+
		"\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008f\u0088\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000"+
		"\u0090\t\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0013\u0000\u0000\u0092"+
		"\u0093\u0003\f\u0006\u0000\u0093\u0094\u0005\u0015\u0000\u0000\u0094\u0095"+
		"\u0005\u0011\u0000\u0000\u0095\u000b\u0001\u0000\u0000\u0000\u0096\u009f"+
		"\u0005\u0001\u0000\u0000\u0097\u009c\u0003\u000e\u0007\u0000\u0098\u0099"+
		"\u0005\u0002\u0000\u0000\u0099\u009b\u0003\u000e\u0007\u0000\u009a\u0098"+
		"\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u00a0"+
		"\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u0097"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u0003\u0000\u0000\u00a2\r\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a8\u0005%\u0000\u0000\u00a4\u00a5\u0005%\u0000"+
		"\u0000\u00a5\u00a6\u0005\u0014\u0000\u0000\u00a6\u00a8\u0005%\u0000\u0000"+
		"\u00a7\u00a3\u0001\u0000\u0000\u0000\u00a7\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a8\u000f\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0016\u0000\u0000"+
		"\u00aa\u00ac\u0005%\u0000\u0000\u00ab\u00ad\u0003\u0012\t\u0000\u00ac"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad"+
		"\u00af\u0001\u0000\u0000\u0000\u00ae\u00b0\u0003\u0014\n\u0000\u00af\u00ae"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0001\u0000\u0000\u00b2\u00b3"+
		"\u0003\u0018\f\u0000\u00b3\u00b4\u0005\u0003\u0000\u0000\u00b4\u0011\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0005\u0017\u0000\u0000\u00b6\u00b7\u0005"+
		"%\u0000\u0000\u00b7\u0013\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\u0018"+
		"\u0000\u0000\u00b9\u00ba\u0003\u0016\u000b\u0000\u00ba\u0015\u0001\u0000"+
		"\u0000\u0000\u00bb\u00c0\u0005%\u0000\u0000\u00bc\u00bd\u0005\u0002\u0000"+
		"\u0000\u00bd\u00bf\u0005%\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u0017\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c7\u0003\u001a\r\u0000\u00c4"+
		"\u00c6\u0005\b\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c3\u0001\u0000\u0000\u0000\u00cb\u00ce"+
		"\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cd\u0019\u0001\u0000\u0000\u0000\u00ce\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d2\u0003\u001e\u000f\u0000\u00d0\u00d2"+
		"\u0003\u001c\u000e\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d2\u001b\u0001\u0000\u0000\u0000\u00d3\u00d5"+
		"\u0005\u0019\u0000\u0000\u00d4\u00d6\u0005\u001a\u0000\u0000\u00d5\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0003 \u0010\u0000\u00d8\u001d\u0001"+
		"\u0000\u0000\u0000\u00d9\u00db\u0005\u0019\u0000\u0000\u00da\u00dc\u0005"+
		"\u001a\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00db\u00dc\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0003"+
		"@ \u0000\u00de\u001f\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u001b\u0000"+
		"\u0000\u00e0\u00e1\u0005%\u0000\u0000\u00e1\u00e2\u0003\"\u0011\u0000"+
		"\u00e2!\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u0004\u0000\u0000\u00e4"+
		"\u00e5\u0003(\u0014\u0000\u00e5\u00e6\u0005\u0005\u0000\u0000\u00e6\u00e7"+
		"\u0005\u0001\u0000\u0000\u00e7\u00e8\u0003&\u0013\u0000\u00e8\u00e9\u0005"+
		"\u0003\u0000\u0000\u00e9#\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005$\u0000"+
		"\u0000\u00eb\u00ec\u0003\u0006\u0003\u0000\u00ec%\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0003\b\u0004\u0000\u00ee\'\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f1\u0003*\u0015\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f8\u0003.\u0017\u0000\u00f6\u00f8\u0003"+
		".\u0017\u0000\u00f7\u00f2\u0001\u0000\u0000\u0000\u00f7\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f8)\u0001\u0000\u0000\u0000\u00f9\u00fe\u0003,\u0016\u0000"+
		"\u00fa\u00fb\u0005\u0002\u0000\u0000\u00fb\u00fd\u0003,\u0016\u0000\u00fc"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff"+
		"+\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0005%\u0000\u0000\u0102-\u0001\u0000\u0000\u0000\u0103\u0105\u00030"+
		"\u0018\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0105\u0108\u0001\u0000"+
		"\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000"+
		"\u0000\u0000\u0107\u010d\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0005\u0002\u0000\u0000\u010a\u010c\u00030\u0018"+
		"\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000"+
		"\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000"+
		"\u0000\u010e/\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0005%\u0000\u0000\u0111\u0112\u0005\u001f\u0000\u0000\u0112"+
		"\u0113\u0003T*\u0000\u01131\u0001\u0000\u0000\u0000\u0114\u0115\u0005"+
		"\u001c\u0000\u0000\u0115\u0116\u0005%\u0000\u0000\u0116\u0118\u0005\u0004"+
		"\u0000\u0000\u0117\u0119\u0003H$\u0000\u0118\u0117\u0001\u0000\u0000\u0000"+
		"\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0005\u0005\u0000\u0000\u011b3\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0005\u001d\u0000\u0000\u011d\u011e\u00036\u001b\u0000\u011e\u0122"+
		"\u00038\u001c\u0000\u011f\u0121\u0003:\u001d\u0000\u0120\u011f\u0001\u0000"+
		"\u0000\u0000\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u01235\u0001\u0000\u0000"+
		"\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u0126\u0005\u0004\u0000"+
		"\u0000\u0126\u0127\u0003<\u001e\u0000\u0127\u0128\u0005\u0005\u0000\u0000"+
		"\u01287\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u0001\u0000\u0000\u012a"+
		"\u012b\u0003\b\u0004\u0000\u012b\u012c\u0005\u0003\u0000\u0000\u012c9"+
		"\u0001\u0000\u0000\u0000\u012d\u012e\u0005\u001e\u0000\u0000\u012e\u012f"+
		"\u0005\u0001\u0000\u0000\u012f\u0130\u0003\b\u0004\u0000\u0130\u0131\u0005"+
		"\u0003\u0000\u0000\u0131;\u0001\u0000\u0000\u0000\u0132\u0137\u0003>\u001f"+
		"\u0000\u0133\u0134\u0005#\u0000\u0000\u0134\u0136\u0003>\u001f\u0000\u0135"+
		"\u0133\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000\u0137"+
		"\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138"+
		"=\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a\u013d"+
		"\u0003\u0004\u0002\u0000\u013b\u013c\u0005\"\u0000\u0000\u013c\u013e\u0003"+
		"\u0004\u0002\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001"+
		"\u0000\u0000\u0000\u013e?\u0001\u0000\u0000\u0000\u013f\u0140\u0003B!"+
		"\u0000\u0140\u0141\u0005\u001f\u0000\u0000\u0141\u0142\u0003\u0004\u0002"+
		"\u0000\u0142A\u0001\u0000\u0000\u0000\u0143\u0146\u0003P(\u0000\u0144"+
		"\u0146\u0003D\"\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0144"+
		"\u0001\u0000\u0000\u0000\u0146C\u0001\u0000\u0000\u0000\u0147\u014c\u0003"+
		"R)\u0000\u0148\u0149\u0005\u0006\u0000\u0000\u0149\u014b\u0003R)\u0000"+
		"\u014a\u0148\u0001\u0000\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000"+
		"\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000"+
		"\u014dE\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014f"+
		"\u0150\u0005%\u0000\u0000\u0150\u0152\u0005\u0004\u0000\u0000\u0151\u0153"+
		"\u0003H$\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u015c\u0005\u0005"+
		"\u0000\u0000\u0155\u0156\u0005%\u0000\u0000\u0156\u0159\u0005%\u0000\u0000"+
		"\u0157\u0158\u0005\u0007\u0000\u0000\u0158\u015a\u0003H$\u0000\u0159\u0157"+
		"\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015c"+
		"\u0001\u0000\u0000\u0000\u015b\u014f\u0001\u0000\u0000\u0000\u015b\u0155"+
		"\u0001\u0000\u0000\u0000\u015cG\u0001\u0000\u0000\u0000\u015d\u0162\u0003"+
		"J%\u0000\u015e\u015f\u0005\u0002\u0000\u0000\u015f\u0161\u0003J%\u0000"+
		"\u0160\u015e\u0001\u0000\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000"+
		"\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000"+
		"\u0163I\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165"+
		"\u0166\u0003\u0004\u0002\u0000\u0166K\u0001\u0000\u0000\u0000\u0167\u016c"+
		"\u0003N\'\u0000\u0168\u0169\u0005 \u0000\u0000\u0169\u016b\u0003N\'\u0000"+
		"\u016a\u0168\u0001\u0000\u0000\u0000\u016b\u016e\u0001\u0000\u0000\u0000"+
		"\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000"+
		"\u016dM\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016f"+
		"\u0174\u0003P(\u0000\u0170\u0171\u0005!\u0000\u0000\u0171\u0173\u0003"+
		"P(\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0173\u0176\u0001\u0000\u0000"+
		"\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000"+
		"\u0000\u0175O\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000"+
		"\u0177\u017e\u0003F#\u0000\u0178\u017e\u0003T*\u0000\u0179\u017a\u0005"+
		"\u0004\u0000\u0000\u017a\u017b\u0003\u0006\u0003\u0000\u017b\u017c\u0005"+
		"\u0005\u0000\u0000\u017c\u017e\u0001\u0000\u0000\u0000\u017d\u0177\u0001"+
		"\u0000\u0000\u0000\u017d\u0178\u0001\u0000\u0000\u0000\u017d\u0179\u0001"+
		"\u0000\u0000\u0000\u017eQ\u0001\u0000\u0000\u0000\u017f\u0183\u0003F#"+
		"\u0000\u0180\u0183\u00032\u0019\u0000\u0181\u0183\u0003P(\u0000\u0182"+
		"\u017f\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182"+
		"\u0181\u0001\u0000\u0000\u0000\u0183S\u0001\u0000\u0000\u0000\u0184\u018a"+
		"\u0003V+\u0000\u0185\u018a\u0005%\u0000\u0000\u0186\u018a\u0005\u0011"+
		"\u0000\u0000\u0187\u018a\u0005\u0010\u0000\u0000\u0188\u018a\u0005\u0012"+
		"\u0000\u0000\u0189\u0184\u0001\u0000\u0000\u0000\u0189\u0185\u0001\u0000"+
		"\u0000\u0000\u0189\u0186\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000"+
		"\u0000\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u018aU\u0001\u0000\u0000"+
		"\u0000\u018b\u018c\u0007\u0000\u0000\u0000\u018cW\u0001\u0000\u0000\u0000"+
		"([citz\u0080\u0085\u008c\u008f\u009c\u009f\u00a7\u00ac\u00af\u00c0\u00c7"+
		"\u00cc\u00d1\u00d5\u00db\u00f2\u00f7\u00fe\u0106\u010d\u0118\u0122\u0137"+
		"\u013d\u0145\u014c\u0152\u0159\u015b\u0162\u016c\u0174\u017d\u0182\u0189";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}