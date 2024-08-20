// Generated from uol.g4 by ANTLR 4.5
package ksu.yomogi.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class uolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, NEWLINE=11, WS=12, DECIMAL_LITERAL=13, HEX_LITERAL=14, OCT_LITERAL=15, 
		BINARY_LITERAL=16, BOOL_LITERAL=17, STRING_LITERAL=18, NIL_LITERAL=19, 
		IMPORT=20, FROM=21, CLASS=22, EXTENDS=23, IMPLEMENTS=24, MODIFIER=25, 
		INSTRUCTION=26, FUNCTION=27, NEW=28, IF=29, ELSEIF=30, ELSE=31, WHILE=32, 
		FOR=33, ASSIGN=34, ADDITIVE_OPERATOR=35, MULTIPLY_OPERATOR=36, CONDITIONAL_OPERATOR=37, 
		CONDITIONAL_LOGICAL_OPERATOR=38, RETURN=39, IDENTIFIER=40;
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_expression = 2, RULE_responseExpression = 3, 
		RULE_iterableExpression = 4, RULE_expressionList = 5, RULE_fileImportStatement = 6, 
		RULE_partsImportStatement = 7, RULE_partsImportContentList = 8, RULE_partsImportContent = 9, 
		RULE_classDefine = 10, RULE_extendPart = 11, RULE_interfaceParts = 12, 
		RULE_interfaceList = 13, RULE_classParts = 14, RULE_classPartsList = 15, 
		RULE_memberDefine = 16, RULE_functionDefine = 17, RULE_lambdaDefine = 18, 
		RULE_returnExpression = 19, RULE_lambdaBody = 20, RULE_argumentDefineList = 21, 
		RULE_argumentDefaultList = 22, RULE_instanceExpression = 23, RULE_booleanConditionExpression = 24, 
		RULE_booleanLoopExpression = 25, RULE_forEachExpression = 26, RULE_conditionExpressionList = 27, 
		RULE_conditionExpression = 28, RULE_assignExpression = 29, RULE_chainExpression = 30, 
		RULE_callExpression = 31, RULE_argumentList = 32, RULE_additiveExpression = 33, 
		RULE_multiplicativeExpression = 34, RULE_unaryExpression = 35, RULE_listDefine = 36, 
		RULE_listDefineWithKey = 37, RULE_listDefineWithKeyContent = 38, RULE_elementExpression = 39, 
		RULE_literal = 40, RULE_integerLiteral = 41;
	public static final String[] ruleNames = {
		"prog", "statement", "expression", "responseExpression", "iterableExpression", 
		"expressionList", "fileImportStatement", "partsImportStatement", "partsImportContentList", 
		"partsImportContent", "classDefine", "extendPart", "interfaceParts", "interfaceList", 
		"classParts", "classPartsList", "memberDefine", "functionDefine", "lambdaDefine", 
		"returnExpression", "lambdaBody", "argumentDefineList", "argumentDefaultList", 
		"instanceExpression", "booleanConditionExpression", "booleanLoopExpression", 
		"forEachExpression", "conditionExpressionList", "conditionExpression", 
		"assignExpression", "chainExpression", "callExpression", "argumentList", 
		"additiveExpression", "multiplicativeExpression", "unaryExpression", "listDefine", 
		"listDefineWithKey", "listDefineWithKeyContent", "elementExpression", 
		"literal", "integerLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "','", "'}'", "'('", "')'", "'in'", "'.'", "': '", "'['", 
		"']'", null, null, null, null, null, null, null, null, "'nil'", "'import'", 
		"'from'", "'class'", "'extends'", "'implements'", null, null, "'function'", 
		"'new'", "'if'", "'else if'", "'else'", "'while'", "'for'", null, null, 
		null, null, null, "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "NEWLINE", 
		"WS", "DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", 
		"BOOL_LITERAL", "STRING_LITERAL", "NIL_LITERAL", "IMPORT", "FROM", "CLASS", 
		"EXTENDS", "IMPLEMENTS", "MODIFIER", "INSTRUCTION", "FUNCTION", "NEW", 
		"IF", "ELSEIF", "ELSE", "WHILE", "FOR", "ASSIGN", "ADDITIVE_OPERATOR", 
		"MULTIPLY_OPERATOR", "CONDITIONAL_OPERATOR", "CONDITIONAL_LOGICAL_OPERATOR", 
		"RETURN", "IDENTIFIER"
	};
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(84);
				match(NEWLINE);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__8) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << BOOL_LITERAL) | (1L << STRING_LITERAL) | (1L << NIL_LITERAL) | (1L << IMPORT) | (1L << CLASS) | (1L << FUNCTION) | (1L << NEW) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(90);
				statement();
				setState(91);
				match(NEWLINE);
				}
				}
				setState(97);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(102);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				partsImportStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				fileImportStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				classDefine();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
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
		public ChainExpressionContext chainExpression() {
			return getRuleContext(ChainExpressionContext.class,0);
		}
		public CallExpressionContext callExpression() {
			return getRuleContext(CallExpressionContext.class,0);
		}
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public FunctionDefineContext functionDefine() {
			return getRuleContext(FunctionDefineContext.class,0);
		}
		public InstanceExpressionContext instanceExpression() {
			return getRuleContext(InstanceExpressionContext.class,0);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(117);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				listDefine();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				listDefineWithKey();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				lambdaDefine();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				chainExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
				callExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(110);
				assignExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(111);
				functionDefine();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(112);
				instanceExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(113);
				booleanConditionExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(114);
				booleanLoopExpression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(115);
				forEachExpression();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(116);
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

	public static class ResponseExpressionContext extends ParserRuleContext {
		public ChainExpressionContext chainExpression() {
			return getRuleContext(ChainExpressionContext.class,0);
		}
		public CallExpressionContext callExpression() {
			return getRuleContext(CallExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ResponseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_responseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterResponseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitResponseExpression(this);
		}
	}

	public final ResponseExpressionContext responseExpression() throws RecognitionException {
		ResponseExpressionContext _localctx = new ResponseExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_responseExpression);
		try {
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				chainExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				callExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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
		public ChainExpressionContext chainExpression() {
			return getRuleContext(ChainExpressionContext.class,0);
		}
		public CallExpressionContext callExpression() {
			return getRuleContext(CallExpressionContext.class,0);
		}
		public IterableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterIterableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitIterableExpression(this);
		}
	}

	public final IterableExpressionContext iterableExpression() throws RecognitionException {
		IterableExpressionContext _localctx = new IterableExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_iterableExpression);
		try {
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				listDefine();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				listDefineWithKey();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				lambdaDefine();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				chainExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				callExpression();
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__8) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << BOOL_LITERAL) | (1L << STRING_LITERAL) | (1L << NIL_LITERAL) | (1L << FUNCTION) | (1L << NEW) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(133);
				expression();
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(134);
					match(NEWLINE);
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(144);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterFileImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitFileImportStatement(this);
		}
	}

	public final FileImportStatementContext fileImportStatement() throws RecognitionException {
		FileImportStatementContext _localctx = new FileImportStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fileImportStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(IMPORT);
			setState(146);
			match(IDENTIFIER);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterPartsImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitPartsImportStatement(this);
		}
	}

	public final PartsImportStatementContext partsImportStatement() throws RecognitionException {
		PartsImportStatementContext _localctx = new PartsImportStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_partsImportStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(IMPORT);
			setState(151);
			partsImportContentList();
			setState(152);
			match(FROM);
			setState(153);
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

	public static class PartsImportContentListContext extends ParserRuleContext {
		public List<PartsImportContentContext> partsImportContent() {
			return getRuleContexts(PartsImportContentContext.class);
		}
		public PartsImportContentContext partsImportContent(int i) {
			return getRuleContext(PartsImportContentContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(uolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(uolParser.NEWLINE, i);
		}
		public PartsImportContentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partsImportContentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterPartsImportContentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitPartsImportContentList(this);
		}
	}

	public final PartsImportContentListContext partsImportContentList() throws RecognitionException {
		PartsImportContentListContext _localctx = new PartsImportContentListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_partsImportContentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(155);
				partsImportContent();
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(156);
					match(NEWLINE);
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class PartsImportContentContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(uolParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(uolParser.IDENTIFIER, i);
		}
		public PartsImportContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partsImportContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterPartsImportContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitPartsImportContent(this);
		}
	}

	public final PartsImportContentContext partsImportContent() throws RecognitionException {
		PartsImportContentContext _localctx = new PartsImportContentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_partsImportContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__0);
			setState(176);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(168);
				match(IDENTIFIER);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(169);
					match(T__1);
					setState(170);
					match(IDENTIFIER);
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(178);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterClassDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitClassDefine(this);
		}
	}

	public final ClassDefineContext classDefine() throws RecognitionException {
		ClassDefineContext _localctx = new ClassDefineContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(CLASS);
			setState(181);
			match(IDENTIFIER);
			setState(183);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(182);
				extendPart();
				}
			}

			setState(186);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(185);
				interfaceParts();
				}
			}

			setState(188);
			match(T__0);
			setState(189);
			classPartsList();
			setState(190);
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

	public static class ExtendPartContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(uolParser.EXTENDS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(uolParser.IDENTIFIER, 0); }
		public ExtendPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterExtendPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitExtendPart(this);
		}
	}

	public final ExtendPartContext extendPart() throws RecognitionException {
		ExtendPartContext _localctx = new ExtendPartContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_extendPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(192);
			match(EXTENDS);
			setState(193);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterInterfaceParts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitInterfaceParts(this);
		}
	}

	public final InterfacePartsContext interfaceParts() throws RecognitionException {
		InterfacePartsContext _localctx = new InterfacePartsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceParts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(195);
			match(IMPLEMENTS);
			setState(196);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterInterfaceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitInterfaceList(this);
		}
	}

	public final InterfaceListContext interfaceList() throws RecognitionException {
		InterfaceListContext _localctx = new InterfaceListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interfaceList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(IDENTIFIER);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(199);
				match(T__1);
				setState(200);
				match(IDENTIFIER);
				}
				}
				setState(205);
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

	public static class ClassPartsContext extends ParserRuleContext {
		public MemberDefineContext memberDefine() {
			return getRuleContext(MemberDefineContext.class,0);
		}
		public TerminalNode MODIFIER() { return getToken(uolParser.MODIFIER, 0); }
		public FunctionDefineContext functionDefine() {
			return getRuleContext(FunctionDefineContext.class,0);
		}
		public ClassPartsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterClassParts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitClassParts(this);
		}
	}

	public final ClassPartsContext classParts() throws RecognitionException {
		ClassPartsContext _localctx = new ClassPartsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classParts);
		try {
			setState(209);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				memberDefine();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(MODIFIER);
				setState(208);
				functionDefine();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterClassPartsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitClassPartsList(this);
		}
	}

	public final ClassPartsListContext classPartsList() throws RecognitionException {
		ClassPartsListContext _localctx = new ClassPartsListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_classPartsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(211);
				classParts();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(212);
					match(NEWLINE);
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(222);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterMemberDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitMemberDefine(this);
		}
	}

	public final MemberDefineContext memberDefine() throws RecognitionException {
		MemberDefineContext _localctx = new MemberDefineContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_memberDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(MODIFIER);
			setState(225);
			_la = _input.LA(1);
			if (_la==INSTRUCTION) {
				{
				setState(224);
				match(INSTRUCTION);
				}
			}

			setState(227);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterFunctionDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitFunctionDefine(this);
		}
	}

	public final FunctionDefineContext functionDefine() throws RecognitionException {
		FunctionDefineContext _localctx = new FunctionDefineContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionDefine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(FUNCTION);
			setState(230);
			match(IDENTIFIER);
			setState(231);
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

	public static class LambdaDefineContext extends ParserRuleContext {
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public ArgumentDefineListContext argumentDefineList() {
			return getRuleContext(ArgumentDefineListContext.class,0);
		}
		public LambdaDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterLambdaDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitLambdaDefine(this);
		}
	}

	public final LambdaDefineContext lambdaDefine() throws RecognitionException {
		LambdaDefineContext _localctx = new LambdaDefineContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lambdaDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__3);
			setState(235);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(234);
				argumentDefineList();
				}
			}

			setState(237);
			match(T__4);
			setState(238);
			match(T__0);
			setState(239);
			lambdaBody();
			setState(240);
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

	public static class ReturnExpressionContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(uolParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterReturnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitReturnExpression(this);
		}
	}

	public final ReturnExpressionContext returnExpression() throws RecognitionException {
		ReturnExpressionContext _localctx = new ReturnExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_returnExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(RETURN);
			setState(243);
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

	public static class LambdaBodyContext extends ParserRuleContext {
		public ReturnExpressionContext returnExpression() {
			return getRuleContext(ReturnExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitLambdaBody(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_lambdaBody);
		try {
			setState(247);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				returnExpression();
				}
				break;
			case T__0:
			case T__2:
			case T__3:
			case T__8:
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
			case WHILE:
			case FOR:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				expressionList();
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

	public static class ArgumentDefineListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(uolParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(uolParser.IDENTIFIER, i);
		}
		public List<ArgumentDefaultListContext> argumentDefaultList() {
			return getRuleContexts(ArgumentDefaultListContext.class);
		}
		public ArgumentDefaultListContext argumentDefaultList(int i) {
			return getRuleContext(ArgumentDefaultListContext.class,i);
		}
		public ArgumentDefineListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentDefineList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterArgumentDefineList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitArgumentDefineList(this);
		}
	}

	public final ArgumentDefineListContext argumentDefineList() throws RecognitionException {
		ArgumentDefineListContext _localctx = new ArgumentDefineListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_argumentDefineList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(IDENTIFIER);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(250);
					match(T__1);
					setState(251);
					match(IDENTIFIER);
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(257);
				argumentDefaultList();
				}
				}
				setState(262);
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

	public static class ArgumentDefaultListContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(uolParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(uolParser.ASSIGN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArgumentDefaultListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentDefaultList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterArgumentDefaultList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitArgumentDefaultList(this);
		}
	}

	public final ArgumentDefaultListContext argumentDefaultList() throws RecognitionException {
		ArgumentDefaultListContext _localctx = new ArgumentDefaultListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_argumentDefaultList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(263);
			match(T__1);
			setState(264);
			match(IDENTIFIER);
			setState(265);
			match(ASSIGN);
			setState(266);
			literal();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterInstanceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitInstanceExpression(this);
		}
	}

	public final InstanceExpressionContext instanceExpression() throws RecognitionException {
		InstanceExpressionContext _localctx = new InstanceExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_instanceExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(NEW);
			setState(269);
			match(IDENTIFIER);
			setState(270);
			match(T__3);
			setState(272);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__8) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << BOOL_LITERAL) | (1L << STRING_LITERAL) | (1L << NIL_LITERAL) | (1L << FUNCTION) | (1L << NEW) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(271);
				argumentList();
				}
			}

			setState(274);
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

	public static class BooleanConditionExpressionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(uolParser.IF, 0); }
		public List<ConditionExpressionListContext> conditionExpressionList() {
			return getRuleContexts(ConditionExpressionListContext.class);
		}
		public ConditionExpressionListContext conditionExpressionList(int i) {
			return getRuleContext(ConditionExpressionListContext.class,i);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(uolParser.ELSE, 0); }
		public TerminalNode ELSEIF() { return getToken(uolParser.ELSEIF, 0); }
		public BooleanConditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanConditionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterBooleanConditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitBooleanConditionExpression(this);
		}
	}

	public final BooleanConditionExpressionContext booleanConditionExpression() throws RecognitionException {
		BooleanConditionExpressionContext _localctx = new BooleanConditionExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_booleanConditionExpression);
		try {
			setState(330);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(IF);
				setState(277);
				match(T__3);
				setState(278);
				conditionExpressionList();
				setState(279);
				match(T__4);
				setState(280);
				match(T__0);
				setState(281);
				expressionList();
				setState(282);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(IF);
				setState(285);
				match(T__3);
				setState(286);
				conditionExpressionList();
				setState(287);
				match(T__4);
				setState(288);
				match(T__0);
				setState(289);
				expressionList();
				setState(290);
				match(T__2);
				setState(291);
				match(ELSE);
				setState(292);
				match(T__0);
				setState(293);
				expressionList();
				setState(294);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				match(IF);
				setState(297);
				match(T__3);
				setState(298);
				conditionExpressionList();
				setState(299);
				match(T__4);
				setState(300);
				match(T__0);
				setState(301);
				expressionList();
				setState(302);
				match(T__2);
				setState(303);
				match(ELSEIF);
				setState(304);
				match(T__3);
				setState(305);
				conditionExpressionList();
				setState(306);
				match(T__4);
				setState(307);
				match(T__0);
				setState(308);
				expressionList();
				setState(309);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(311);
				match(IF);
				setState(312);
				match(T__3);
				setState(313);
				conditionExpressionList();
				setState(314);
				match(T__4);
				setState(315);
				match(T__0);
				setState(316);
				expressionList();
				setState(317);
				match(T__2);
				setState(318);
				match(ELSEIF);
				setState(319);
				match(T__3);
				setState(320);
				conditionExpressionList();
				setState(321);
				match(T__4);
				setState(322);
				match(T__0);
				setState(323);
				expressionList();
				setState(324);
				match(T__2);
				setState(325);
				match(ELSE);
				setState(326);
				match(T__0);
				setState(327);
				expressionList();
				setState(328);
				match(T__2);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterBooleanLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitBooleanLoopExpression(this);
		}
	}

	public final BooleanLoopExpressionContext booleanLoopExpression() throws RecognitionException {
		BooleanLoopExpressionContext _localctx = new BooleanLoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_booleanLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(WHILE);
			setState(333);
			match(T__3);
			setState(334);
			conditionExpressionList();
			setState(335);
			match(T__4);
			setState(336);
			match(T__0);
			setState(337);
			expressionList();
			setState(338);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterForEachExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitForEachExpression(this);
		}
	}

	public final ForEachExpressionContext forEachExpression() throws RecognitionException {
		ForEachExpressionContext _localctx = new ForEachExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forEachExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(FOR);
			setState(341);
			match(T__3);
			setState(342);
			match(IDENTIFIER);
			setState(343);
			match(T__5);
			setState(344);
			iterableExpression();
			setState(345);
			match(T__4);
			setState(346);
			match(T__0);
			setState(347);
			expressionList();
			setState(348);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterConditionExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitConditionExpressionList(this);
		}
	}

	public final ConditionExpressionListContext conditionExpressionList() throws RecognitionException {
		ConditionExpressionListContext _localctx = new ConditionExpressionListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_conditionExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			conditionExpression();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONDITIONAL_LOGICAL_OPERATOR) {
				{
				{
				setState(351);
				match(CONDITIONAL_LOGICAL_OPERATOR);
				setState(352);
				conditionExpression();
				}
				}
				setState(357);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterConditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitConditionExpression(this);
		}
	}

	public final ConditionExpressionContext conditionExpression() throws RecognitionException {
		ConditionExpressionContext _localctx = new ConditionExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_conditionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			expression();
			setState(361);
			_la = _input.LA(1);
			if (_la==CONDITIONAL_OPERATOR) {
				{
				setState(359);
				match(CONDITIONAL_OPERATOR);
				setState(360);
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

	public static class AssignExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(uolParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(uolParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterAssignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitAssignExpression(this);
		}
	}

	public final AssignExpressionContext assignExpression() throws RecognitionException {
		AssignExpressionContext _localctx = new AssignExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_assignExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(IDENTIFIER);
			setState(364);
			match(ASSIGN);
			setState(365);
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

	public static class ChainExpressionContext extends ParserRuleContext {
		public ElementExpressionContext elementExpression() {
			return getRuleContext(ElementExpressionContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(uolParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(uolParser.IDENTIFIER, i);
		}
		public List<CallExpressionContext> callExpression() {
			return getRuleContexts(CallExpressionContext.class);
		}
		public CallExpressionContext callExpression(int i) {
			return getRuleContext(CallExpressionContext.class,i);
		}
		public ChainExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterChainExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitChainExpression(this);
		}
	}

	public final ChainExpressionContext chainExpression() throws RecognitionException {
		ChainExpressionContext _localctx = new ChainExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_chainExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			elementExpression();
			setState(375);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(368);
					match(T__6);
					setState(371);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(369);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						setState(370);
						callExpression();
						}
						break;
					}
					}
					} 
				}
				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitCallExpression(this);
		}
	}

	public final CallExpressionContext callExpression() throws RecognitionException {
		CallExpressionContext _localctx = new CallExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_callExpression);
		int _la;
		try {
			setState(390);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(IDENTIFIER);
				setState(379);
				match(T__3);
				setState(381);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__8) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << BOOL_LITERAL) | (1L << STRING_LITERAL) | (1L << NIL_LITERAL) | (1L << FUNCTION) | (1L << NEW) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(380);
					argumentList();
					}
				}

				setState(383);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				match(IDENTIFIER);
				setState(385);
				match(IDENTIFIER);
				setState(388);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(386);
					match(T__7);
					setState(387);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_argumentList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			expression();
			setState(397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(393);
					match(T__1);
					setState(394);
					expression();
					}
					} 
				}
				setState(399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			multiplicativeExpression();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADDITIVE_OPERATOR) {
				{
				{
				setState(401);
				match(ADDITIVE_OPERATOR);
				setState(402);
				multiplicativeExpression();
				}
				}
				setState(407);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			unaryExpression();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLY_OPERATOR) {
				{
				{
				setState(409);
				match(MULTIPLY_OPERATOR);
				setState(410);
				unaryExpression();
				}
				}
				setState(415);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_unaryExpression);
		try {
			setState(421);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case NIL_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				literal();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				match(T__3);
				setState(418);
				responseExpression();
				setState(419);
				match(T__4);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterListDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitListDefine(this);
		}
	}

	public final ListDefineContext listDefine() throws RecognitionException {
		ListDefineContext _localctx = new ListDefineContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_listDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(T__8);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__8) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << BOOL_LITERAL) | (1L << STRING_LITERAL) | (1L << NIL_LITERAL) | (1L << FUNCTION) | (1L << NEW) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(424);
				expression();
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(425);
					match(T__1);
					setState(426);
					expression();
					}
					}
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(437);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterListDefineWithKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitListDefineWithKey(this);
		}
	}

	public final ListDefineWithKeyContext listDefineWithKey() throws RecognitionException {
		ListDefineWithKeyContext _localctx = new ListDefineWithKeyContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_listDefineWithKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(T__0);
			setState(440);
			listDefineWithKeyContent();
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(441);
				match(T__1);
				setState(442);
				listDefineWithKeyContent();
				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(448);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterListDefineWithKeyContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitListDefineWithKeyContent(this);
		}
	}

	public final ListDefineWithKeyContentContext listDefineWithKeyContent() throws RecognitionException {
		ListDefineWithKeyContentContext _localctx = new ListDefineWithKeyContentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_listDefineWithKeyContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(STRING_LITERAL);
			setState(451);
			match(T__7);
			setState(452);
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

	public static class ElementExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public InstanceExpressionContext instanceExpression() {
			return getRuleContext(InstanceExpressionContext.class,0);
		}
		public CallExpressionContext callExpression() {
			return getRuleContext(CallExpressionContext.class,0);
		}
		public ElementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterElementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitElementExpression(this);
		}
	}

	public final ElementExpressionContext elementExpression() throws RecognitionException {
		ElementExpressionContext _localctx = new ElementExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_elementExpression);
		try {
			setState(457);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				instanceExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(456);
				callExpression();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_literal);
		try {
			setState(464);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				integerLiteral();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(462);
				match(BOOL_LITERAL);
				}
				break;
			case NIL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(463);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uolListener ) ((uolListener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u01d7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\7\2X\n\2\f\2\16\2[\13\2\3\2\3\2\3\2\7\2`\n\2\f\2\16\2c\13\2\3\3\3\3"+
		"\3\3\3\3\5\3i\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4x\n\4\3\5\3\5\3\5\5\5}\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0086\n"+
		"\6\3\7\3\7\7\7\u008a\n\7\f\7\16\7\u008d\13\7\7\7\u008f\n\7\f\7\16\7\u0092"+
		"\13\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\7\n\u00a0\n\n\f"+
		"\n\16\n\u00a3\13\n\7\n\u00a5\n\n\f\n\16\n\u00a8\13\n\3\13\3\13\3\13\3"+
		"\13\7\13\u00ae\n\13\f\13\16\13\u00b1\13\13\5\13\u00b3\n\13\3\13\3\13\3"+
		"\f\3\f\3\f\5\f\u00ba\n\f\3\f\5\f\u00bd\n\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u00cc\n\17\f\17\16\17\u00cf\13\17"+
		"\3\20\3\20\3\20\5\20\u00d4\n\20\3\21\3\21\7\21\u00d8\n\21\f\21\16\21\u00db"+
		"\13\21\7\21\u00dd\n\21\f\21\16\21\u00e0\13\21\3\22\3\22\5\22\u00e4\n\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u00ee\n\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\5\26\u00fa\n\26\3\27\3\27\3\27\7\27"+
		"\u00ff\n\27\f\27\16\27\u0102\13\27\3\27\7\27\u0105\n\27\f\27\16\27\u0108"+
		"\13\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u0113\n\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5"+
		"\32\u014d\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\7\35\u0164\n\35\f\35"+
		"\16\35\u0167\13\35\3\36\3\36\3\36\5\36\u016c\n\36\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \5 \u0176\n \7 \u0178\n \f \16 \u017b\13 \3!\3!\3!\5!\u0180"+
		"\n!\3!\3!\3!\3!\3!\5!\u0187\n!\5!\u0189\n!\3\"\3\"\3\"\7\"\u018e\n\"\f"+
		"\"\16\"\u0191\13\"\3#\3#\3#\7#\u0196\n#\f#\16#\u0199\13#\3$\3$\3$\7$\u019e"+
		"\n$\f$\16$\u01a1\13$\3%\3%\3%\3%\3%\5%\u01a8\n%\3&\3&\3&\3&\7&\u01ae\n"+
		"&\f&\16&\u01b1\13&\7&\u01b3\n&\f&\16&\u01b6\13&\3&\3&\3\'\3\'\3\'\3\'"+
		"\7\'\u01be\n\'\f\'\16\'\u01c1\13\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\5)\u01cc"+
		"\n)\3*\3*\3*\3*\3*\5*\u01d3\n*\3+\3+\3+\2\2,\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT\2\3\3\2\17\22\u01ee\2"+
		"Y\3\2\2\2\4h\3\2\2\2\6w\3\2\2\2\b|\3\2\2\2\n\u0085\3\2\2\2\f\u0090\3\2"+
		"\2\2\16\u0093\3\2\2\2\20\u0098\3\2\2\2\22\u00a6\3\2\2\2\24\u00a9\3\2\2"+
		"\2\26\u00b6\3\2\2\2\30\u00c2\3\2\2\2\32\u00c5\3\2\2\2\34\u00c8\3\2\2\2"+
		"\36\u00d3\3\2\2\2 \u00de\3\2\2\2\"\u00e1\3\2\2\2$\u00e7\3\2\2\2&\u00eb"+
		"\3\2\2\2(\u00f4\3\2\2\2*\u00f9\3\2\2\2,\u00fb\3\2\2\2.\u0109\3\2\2\2\60"+
		"\u010e\3\2\2\2\62\u014c\3\2\2\2\64\u014e\3\2\2\2\66\u0156\3\2\2\28\u0160"+
		"\3\2\2\2:\u0168\3\2\2\2<\u016d\3\2\2\2>\u0171\3\2\2\2@\u0188\3\2\2\2B"+
		"\u018a\3\2\2\2D\u0192\3\2\2\2F\u019a\3\2\2\2H\u01a7\3\2\2\2J\u01a9\3\2"+
		"\2\2L\u01b9\3\2\2\2N\u01c4\3\2\2\2P\u01cb\3\2\2\2R\u01d2\3\2\2\2T\u01d4"+
		"\3\2\2\2VX\7\r\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Za\3\2\2\2["+
		"Y\3\2\2\2\\]\5\4\3\2]^\7\r\2\2^`\3\2\2\2_\\\3\2\2\2`c\3\2\2\2a_\3\2\2"+
		"\2ab\3\2\2\2b\3\3\2\2\2ca\3\2\2\2di\5\20\t\2ei\5\16\b\2fi\5\26\f\2gi\5"+
		"\6\4\2hd\3\2\2\2he\3\2\2\2hf\3\2\2\2hg\3\2\2\2i\5\3\2\2\2jx\5R*\2kx\5"+
		"J&\2lx\5L\'\2mx\5&\24\2nx\5> \2ox\5@!\2px\5<\37\2qx\5$\23\2rx\5\60\31"+
		"\2sx\5\62\32\2tx\5\64\33\2ux\5\66\34\2vx\5D#\2wj\3\2\2\2wk\3\2\2\2wl\3"+
		"\2\2\2wm\3\2\2\2wn\3\2\2\2wo\3\2\2\2wp\3\2\2\2wq\3\2\2\2wr\3\2\2\2ws\3"+
		"\2\2\2wt\3\2\2\2wu\3\2\2\2wv\3\2\2\2x\7\3\2\2\2y}\5> \2z}\5@!\2{}\5D#"+
		"\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\t\3\2\2\2~\u0086\7\24\2\2\177\u0086"+
		"\7*\2\2\u0080\u0086\5J&\2\u0081\u0086\5L\'\2\u0082\u0086\5&\24\2\u0083"+
		"\u0086\5> \2\u0084\u0086\5@!\2\u0085~\3\2\2\2\u0085\177\3\2\2\2\u0085"+
		"\u0080\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0085\u0084\3\2\2\2\u0086\13\3\2\2\2\u0087\u008b\5\6\4\2\u0088\u008a"+
		"\7\r\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0087\3\2"+
		"\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\r\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\26\2\2\u0094\u0095\7*\2\2"+
		"\u0095\u0096\7\27\2\2\u0096\u0097\7\24\2\2\u0097\17\3\2\2\2\u0098\u0099"+
		"\7\26\2\2\u0099\u009a\5\22\n\2\u009a\u009b\7\27\2\2\u009b\u009c\7\24\2"+
		"\2\u009c\21\3\2\2\2\u009d\u00a1\5\24\13\2\u009e\u00a0\7\r\2\2\u009f\u009e"+
		"\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u009d\3\2\2\2\u00a5\u00a8\3\2"+
		"\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\23\3\2\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a9\u00b2\7\3\2\2\u00aa\u00af\7*\2\2\u00ab\u00ac\7\4\2\2\u00ac"+
		"\u00ae\7*\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\u00aa\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7\5"+
		"\2\2\u00b5\25\3\2\2\2\u00b6\u00b7\7\30\2\2\u00b7\u00b9\7*\2\2\u00b8\u00ba"+
		"\5\30\r\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2"+
		"\u00bb\u00bd\5\32\16\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\u00bf\7\3\2\2\u00bf\u00c0\5 \21\2\u00c0\u00c1\7\5\2\2\u00c1"+
		"\27\3\2\2\2\u00c2\u00c3\7\31\2\2\u00c3\u00c4\7*\2\2\u00c4\31\3\2\2\2\u00c5"+
		"\u00c6\7\32\2\2\u00c6\u00c7\5\34\17\2\u00c7\33\3\2\2\2\u00c8\u00cd\7*"+
		"\2\2\u00c9\u00ca\7\4\2\2\u00ca\u00cc\7*\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\35\3\2\2"+
		"\2\u00cf\u00cd\3\2\2\2\u00d0\u00d4\5\"\22\2\u00d1\u00d2\7\33\2\2\u00d2"+
		"\u00d4\5$\23\2\u00d3\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\37\3\2\2"+
		"\2\u00d5\u00d9\5\36\20\2\u00d6\u00d8\7\r\2\2\u00d7\u00d6\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dd\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00dc\u00d5\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df!\3\2\2\2\u00e0\u00de\3\2\2\2"+
		"\u00e1\u00e3\7\33\2\2\u00e2\u00e4\7\34\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\5<\37\2\u00e6#\3\2\2\2\u00e7"+
		"\u00e8\7\35\2\2\u00e8\u00e9\7*\2\2\u00e9\u00ea\5&\24\2\u00ea%\3\2\2\2"+
		"\u00eb\u00ed\7\6\2\2\u00ec\u00ee\5,\27\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7\7\2\2\u00f0\u00f1\7\3\2\2\u00f1"+
		"\u00f2\5*\26\2\u00f2\u00f3\7\5\2\2\u00f3\'\3\2\2\2\u00f4\u00f5\7)\2\2"+
		"\u00f5\u00f6\5\6\4\2\u00f6)\3\2\2\2\u00f7\u00fa\5(\25\2\u00f8\u00fa\5"+
		"\f\7\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa+\3\2\2\2\u00fb\u0100"+
		"\7*\2\2\u00fc\u00fd\7\4\2\2\u00fd\u00ff\7*\2\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0106\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0103\u0105\5.\30\2\u0104\u0103\3\2\2\2\u0105"+
		"\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107-\3\2\2\2"+
		"\u0108\u0106\3\2\2\2\u0109\u010a\7\4\2\2\u010a\u010b\7*\2\2\u010b\u010c"+
		"\7$\2\2\u010c\u010d\5R*\2\u010d/\3\2\2\2\u010e\u010f\7\36\2\2\u010f\u0110"+
		"\7*\2\2\u0110\u0112\7\6\2\2\u0111\u0113\5B\"\2\u0112\u0111\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\7\7\2\2\u0115\61\3\2\2"+
		"\2\u0116\u0117\7\37\2\2\u0117\u0118\7\6\2\2\u0118\u0119\58\35\2\u0119"+
		"\u011a\7\7\2\2\u011a\u011b\7\3\2\2\u011b\u011c\5\f\7\2\u011c\u011d\7\5"+
		"\2\2\u011d\u014d\3\2\2\2\u011e\u011f\7\37\2\2\u011f\u0120\7\6\2\2\u0120"+
		"\u0121\58\35\2\u0121\u0122\7\7\2\2\u0122\u0123\7\3\2\2\u0123\u0124\5\f"+
		"\7\2\u0124\u0125\7\5\2\2\u0125\u0126\7!\2\2\u0126\u0127\7\3\2\2\u0127"+
		"\u0128\5\f\7\2\u0128\u0129\7\5\2\2\u0129\u014d\3\2\2\2\u012a\u012b\7\37"+
		"\2\2\u012b\u012c\7\6\2\2\u012c\u012d\58\35\2\u012d\u012e\7\7\2\2\u012e"+
		"\u012f\7\3\2\2\u012f\u0130\5\f\7\2\u0130\u0131\7\5\2\2\u0131\u0132\7 "+
		"\2\2\u0132\u0133\7\6\2\2\u0133\u0134\58\35\2\u0134\u0135\7\7\2\2\u0135"+
		"\u0136\7\3\2\2\u0136\u0137\5\f\7\2\u0137\u0138\7\5\2\2\u0138\u014d\3\2"+
		"\2\2\u0139\u013a\7\37\2\2\u013a\u013b\7\6\2\2\u013b\u013c\58\35\2\u013c"+
		"\u013d\7\7\2\2\u013d\u013e\7\3\2\2\u013e\u013f\5\f\7\2\u013f\u0140\7\5"+
		"\2\2\u0140\u0141\7 \2\2\u0141\u0142\7\6\2\2\u0142\u0143\58\35\2\u0143"+
		"\u0144\7\7\2\2\u0144\u0145\7\3\2\2\u0145\u0146\5\f\7\2\u0146\u0147\7\5"+
		"\2\2\u0147\u0148\7!\2\2\u0148\u0149\7\3\2\2\u0149\u014a\5\f\7\2\u014a"+
		"\u014b\7\5\2\2\u014b\u014d\3\2\2\2\u014c\u0116\3\2\2\2\u014c\u011e\3\2"+
		"\2\2\u014c\u012a\3\2\2\2\u014c\u0139\3\2\2\2\u014d\63\3\2\2\2\u014e\u014f"+
		"\7\"\2\2\u014f\u0150\7\6\2\2\u0150\u0151\58\35\2\u0151\u0152\7\7\2\2\u0152"+
		"\u0153\7\3\2\2\u0153\u0154\5\f\7\2\u0154\u0155\7\5\2\2\u0155\65\3\2\2"+
		"\2\u0156\u0157\7#\2\2\u0157\u0158\7\6\2\2\u0158\u0159\7*\2\2\u0159\u015a"+
		"\7\b\2\2\u015a\u015b\5\n\6\2\u015b\u015c\7\7\2\2\u015c\u015d\7\3\2\2\u015d"+
		"\u015e\5\f\7\2\u015e\u015f\7\5\2\2\u015f\67\3\2\2\2\u0160\u0165\5:\36"+
		"\2\u0161\u0162\7(\2\2\u0162\u0164\5:\36\2\u0163\u0161\3\2\2\2\u0164\u0167"+
		"\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u01669\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0168\u016b\5\6\4\2\u0169\u016a\7\'\2\2\u016a\u016c\5\6"+
		"\4\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c;\3\2\2\2\u016d\u016e"+
		"\7*\2\2\u016e\u016f\7$\2\2\u016f\u0170\5\6\4\2\u0170=\3\2\2\2\u0171\u0179"+
		"\5P)\2\u0172\u0175\7\t\2\2\u0173\u0176\7*\2\2\u0174\u0176\5@!\2\u0175"+
		"\u0173\3\2\2\2\u0175\u0174\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0172\3\2"+
		"\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"?\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\7*\2\2\u017d\u017f\7\6\2\2\u017e"+
		"\u0180\5B\"\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\u0189\7\7\2\2\u0182\u0183\7*\2\2\u0183\u0186\7*\2\2\u0184\u0185"+
		"\7\n\2\2\u0185\u0187\5B\"\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0189\3\2\2\2\u0188\u017c\3\2\2\2\u0188\u0182\3\2\2\2\u0189A\3\2\2\2"+
		"\u018a\u018f\5\6\4\2\u018b\u018c\7\4\2\2\u018c\u018e\5\6\4\2\u018d\u018b"+
		"\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"C\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0197\5F$\2\u0193\u0194\7%\2\2\u0194"+
		"\u0196\5F$\2\u0195\u0193\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2"+
		"\2\u0197\u0198\3\2\2\2\u0198E\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019f"+
		"\5H%\2\u019b\u019c\7&\2\2\u019c\u019e\5H%\2\u019d\u019b\3\2\2\2\u019e"+
		"\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0G\3\2\2\2"+
		"\u01a1\u019f\3\2\2\2\u01a2\u01a8\5R*\2\u01a3\u01a4\7\6\2\2\u01a4\u01a5"+
		"\5\b\5\2\u01a5\u01a6\7\7\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a2\3\2\2\2\u01a7"+
		"\u01a3\3\2\2\2\u01a8I\3\2\2\2\u01a9\u01b4\7\13\2\2\u01aa\u01af\5\6\4\2"+
		"\u01ab\u01ac\7\4\2\2\u01ac\u01ae\5\6\4\2\u01ad\u01ab\3\2\2\2\u01ae\u01b1"+
		"\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1"+
		"\u01af\3\2\2\2\u01b2\u01aa\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2"+
		"\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7"+
		"\u01b8\7\f\2\2\u01b8K\3\2\2\2\u01b9\u01ba\7\3\2\2\u01ba\u01bf\5N(\2\u01bb"+
		"\u01bc\7\4\2\2\u01bc\u01be\5N(\2\u01bd\u01bb\3\2\2\2\u01be\u01c1\3\2\2"+
		"\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bf"+
		"\3\2\2\2\u01c2\u01c3\7\5\2\2\u01c3M\3\2\2\2\u01c4\u01c5\7\24\2\2\u01c5"+
		"\u01c6\7\n\2\2\u01c6\u01c7\5\6\4\2\u01c7O\3\2\2\2\u01c8\u01cc\5H%\2\u01c9"+
		"\u01cc\5\60\31\2\u01ca\u01cc\5@!\2\u01cb\u01c8\3\2\2\2\u01cb\u01c9\3\2"+
		"\2\2\u01cb\u01ca\3\2\2\2\u01ccQ\3\2\2\2\u01cd\u01d3\5T+\2\u01ce\u01d3"+
		"\7*\2\2\u01cf\u01d3\7\24\2\2\u01d0\u01d3\7\23\2\2\u01d1\u01d3\7\25\2\2"+
		"\u01d2\u01cd\3\2\2\2\u01d2\u01ce\3\2\2\2\u01d2\u01cf\3\2\2\2\u01d2\u01d0"+
		"\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3S\3\2\2\2\u01d4\u01d5\t\2\2\2\u01d5"+
		"U\3\2\2\2+Yahw|\u0085\u008b\u0090\u00a1\u00a6\u00af\u00b2\u00b9\u00bc"+
		"\u00cd\u00d3\u00d9\u00de\u00e3\u00ed\u00f9\u0100\u0106\u0112\u014c\u0165"+
		"\u016b\u0175\u0179\u017f\u0186\u0188\u018f\u0197\u019f\u01a7\u01af\u01b4"+
		"\u01bf\u01cb\u01d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}