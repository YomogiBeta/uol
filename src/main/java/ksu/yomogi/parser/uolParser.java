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
		IMPORT=20, AS=21, FROM=22, CLASS=23, EXTENDS=24, IMPLEMENTS=25, MODIFIER=26, 
		INSTRUCTION=27, FUNCTION=28, NEW=29, IF=30, ELSEIF=31, ELSE=32, WHILE=33, 
		FOR=34, ASSIGN=35, ADDITIVE_OPERATOR=36, MULTIPLY_OPERATOR=37, CONDITIONAL_OPERATOR=38, 
		CONDITIONAL_LOGICAL_OPERATOR=39, RETURN=40, IDENTIFIER=41;
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_expression = 2, RULE_responseExpression = 3, 
		RULE_iterableExpression = 4, RULE_expressionList = 5, RULE_fileImportStatement = 6, 
		RULE_partsImportStatement = 7, RULE_partsImportContentList = 8, RULE_partsImportContent = 9, 
		RULE_classDefine = 10, RULE_extendPart = 11, RULE_interfaceParts = 12, 
		RULE_interfaceList = 13, RULE_classParts = 14, RULE_classPartsList = 15, 
		RULE_memberDefine = 16, RULE_functionDefine = 17, RULE_lambdaDefine = 18, 
		RULE_returnExpression = 19, RULE_lambdaBody = 20, RULE_argumentDefineList = 21, 
		RULE_arugumentNonDefaultList = 22, RULE_argumentNonDefault = 23, RULE_argumentDefaultList = 24, 
		RULE_argumentDefault = 25, RULE_instanceExpression = 26, RULE_booleanConditionExpression = 27, 
		RULE_booleanLoopExpression = 28, RULE_forEachExpression = 29, RULE_conditionExpressionList = 30, 
		RULE_conditionExpression = 31, RULE_assignExpression = 32, RULE_assignAbleExpression = 33, 
		RULE_chainExpression = 34, RULE_callExpression = 35, RULE_argumentList = 36, 
		RULE_argumentContent = 37, RULE_additiveExpression = 38, RULE_multiplicativeExpression = 39, 
		RULE_unaryExpression = 40, RULE_listDefine = 41, RULE_listDefineWithKey = 42, 
		RULE_listDefineWithKeyContent = 43, RULE_elementExpression = 44, RULE_literal = 45, 
		RULE_integerLiteral = 46;
	public static final String[] ruleNames = {
		"prog", "statement", "expression", "responseExpression", "iterableExpression", 
		"expressionList", "fileImportStatement", "partsImportStatement", "partsImportContentList", 
		"partsImportContent", "classDefine", "extendPart", "interfaceParts", "interfaceList", 
		"classParts", "classPartsList", "memberDefine", "functionDefine", "lambdaDefine", 
		"returnExpression", "lambdaBody", "argumentDefineList", "arugumentNonDefaultList", 
		"argumentNonDefault", "argumentDefaultList", "argumentDefault", "instanceExpression", 
		"booleanConditionExpression", "booleanLoopExpression", "forEachExpression", 
		"conditionExpressionList", "conditionExpression", "assignExpression", 
		"assignAbleExpression", "chainExpression", "callExpression", "argumentList", 
		"argumentContent", "additiveExpression", "multiplicativeExpression", "unaryExpression", 
		"listDefine", "listDefineWithKey", "listDefineWithKeyContent", "elementExpression", 
		"literal", "integerLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "','", "'}'", "'('", "')'", "'in'", "'.'", "': '", "'['", 
		"']'", null, null, null, null, null, null, null, null, "'nil'", "'import'", 
		"'as'", "'from'", "'class'", "'extends'", "'implements'", null, null, 
		"'function'", "'new'", "'if'", "'else if'", "'else'", "'while'", "'for'", 
		null, null, null, null, null, "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "NEWLINE", 
		"WS", "DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", 
		"BOOL_LITERAL", "STRING_LITERAL", "NIL_LITERAL", "IMPORT", "AS", "FROM", 
		"CLASS", "EXTENDS", "IMPLEMENTS", "MODIFIER", "INSTRUCTION", "FUNCTION", 
		"NEW", "IF", "ELSEIF", "ELSE", "WHILE", "FOR", "ASSIGN", "ADDITIVE_OPERATOR", 
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
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(94);
				match(NEWLINE);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__8) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << BOOL_LITERAL) | (1L << STRING_LITERAL) | (1L << NIL_LITERAL) | (1L << IMPORT) | (1L << CLASS) | (1L << FUNCTION) | (1L << NEW) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(100);
				statement();
				setState(101);
				match(NEWLINE);
				}
				}
				setState(107);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				partsImportStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				fileImportStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				classDefine();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(127);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				listDefine();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				listDefineWithKey();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				lambdaDefine();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				chainExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				callExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(120);
				assignExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(121);
				functionDefine();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(122);
				instanceExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(123);
				booleanConditionExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(124);
				booleanLoopExpression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(125);
				forEachExpression();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(126);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitResponseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResponseExpressionContext responseExpression() throws RecognitionException {
		ResponseExpressionContext _localctx = new ResponseExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_responseExpression);
		try {
			setState(132);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				chainExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				callExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitIterableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterableExpressionContext iterableExpression() throws RecognitionException {
		IterableExpressionContext _localctx = new IterableExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_iterableExpression);
		try {
			setState(141);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				listDefine();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				listDefineWithKey();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				lambdaDefine();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(139);
				chainExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(140);
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
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__8) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << BOOL_LITERAL) | (1L << STRING_LITERAL) | (1L << NIL_LITERAL) | (1L << FUNCTION) | (1L << NEW) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(143);
				expression();
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(144);
					match(NEWLINE);
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(155);
				returnExpression();
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
			setState(164);
			match(IMPORT);
			setState(165);
			match(IDENTIFIER);
			setState(166);
			match(FROM);
			setState(167);
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
			setState(169);
			match(IMPORT);
			setState(170);
			partsImportContentList();
			setState(171);
			match(FROM);
			setState(172);
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
			setState(174);
			match(T__0);
			setState(183);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(175);
				partsImportContent();
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(176);
					match(T__1);
					setState(177);
					partsImportContent();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(185);
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
			setState(191);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(IDENTIFIER);
				setState(189);
				match(AS);
				setState(190);
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
			setState(193);
			match(CLASS);
			setState(194);
			match(IDENTIFIER);
			setState(196);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(195);
				extendPart();
				}
			}

			setState(199);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(198);
				interfaceParts();
				}
			}

			setState(201);
			match(T__0);
			setState(202);
			classPartsList();
			setState(203);
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
			setState(205);
			match(EXTENDS);
			setState(206);
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
			setState(208);
			match(IMPLEMENTS);
			setState(209);
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
			setState(211);
			match(IDENTIFIER);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(212);
				match(T__1);
				setState(213);
				match(IDENTIFIER);
				}
				}
				setState(218);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitClassParts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassPartsContext classParts() throws RecognitionException {
		ClassPartsContext _localctx = new ClassPartsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classParts);
		try {
			setState(222);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				memberDefine();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(MODIFIER);
				setState(221);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitClassPartsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassPartsListContext classPartsList() throws RecognitionException {
		ClassPartsListContext _localctx = new ClassPartsListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_classPartsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(224);
				classParts();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(225);
					match(NEWLINE);
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(235);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitMemberDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDefineContext memberDefine() throws RecognitionException {
		MemberDefineContext _localctx = new MemberDefineContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_memberDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(MODIFIER);
			setState(238);
			_la = _input.LA(1);
			if (_la==INSTRUCTION) {
				{
				setState(237);
				match(INSTRUCTION);
				}
			}

			setState(240);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitFunctionDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefineContext functionDefine() throws RecognitionException {
		FunctionDefineContext _localctx = new FunctionDefineContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionDefine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(FUNCTION);
			setState(243);
			match(IDENTIFIER);
			setState(244);
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
		enterRule(_localctx, 36, RULE_lambdaDefine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__3);
			setState(247);
			argumentDefineList();
			setState(248);
			match(T__4);
			setState(249);
			match(T__0);
			setState(250);
			lambdaBody();
			setState(251);
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
		enterRule(_localctx, 38, RULE_returnExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(RETURN);
			setState(254);
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
		enterRule(_localctx, 40, RULE_lambdaBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
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
		enterRule(_localctx, 42, RULE_argumentDefineList);
		try {
			int _alt;
			setState(266);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(258);
						arugumentNonDefaultList();
						}
						} 
					}
					setState(263);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(264);
				argumentDefaultList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
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
		enterRule(_localctx, 44, RULE_arugumentNonDefaultList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			argumentNonDefault();
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269);
					match(T__1);
					setState(270);
					argumentNonDefault();
					}
					} 
				}
				setState(275);
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
		enterRule(_localctx, 46, RULE_argumentNonDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
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
		enterRule(_localctx, 48, RULE_argumentDefaultList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(278);
				argumentDefault();
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(284);
				match(T__1);
				setState(285);
				argumentDefault();
				}
				}
				setState(290);
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
		enterRule(_localctx, 50, RULE_argumentDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(IDENTIFIER);
			setState(292);
			match(ASSIGN);
			setState(293);
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
		enterRule(_localctx, 52, RULE_instanceExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(NEW);
			setState(296);
			match(IDENTIFIER);
			setState(297);
			match(T__3);
			setState(299);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__8) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << BOOL_LITERAL) | (1L << STRING_LITERAL) | (1L << NIL_LITERAL) | (1L << FUNCTION) | (1L << NEW) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(298);
				argumentList();
				}
			}

			setState(301);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitBooleanConditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanConditionExpressionContext booleanConditionExpression() throws RecognitionException {
		BooleanConditionExpressionContext _localctx = new BooleanConditionExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_booleanConditionExpression);
		try {
			setState(357);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(IF);
				setState(304);
				match(T__3);
				setState(305);
				conditionExpressionList();
				setState(306);
				match(T__4);
				setState(307);
				match(T__0);
				{
				setState(308);
				expressionList();
				}
				setState(309);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
				match(ELSE);
				setState(319);
				match(T__0);
				setState(320);
				expressionList();
				setState(321);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				match(IF);
				setState(324);
				match(T__3);
				setState(325);
				conditionExpressionList();
				setState(326);
				match(T__4);
				setState(327);
				match(T__0);
				setState(328);
				expressionList();
				setState(329);
				match(T__2);
				setState(330);
				match(ELSEIF);
				setState(331);
				match(T__3);
				setState(332);
				conditionExpressionList();
				setState(333);
				match(T__4);
				setState(334);
				match(T__0);
				setState(335);
				expressionList();
				setState(336);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(338);
				match(IF);
				setState(339);
				match(T__3);
				setState(340);
				conditionExpressionList();
				setState(341);
				match(T__4);
				setState(342);
				match(T__0);
				setState(343);
				expressionList();
				setState(344);
				match(T__2);
				setState(345);
				match(ELSEIF);
				setState(346);
				match(T__3);
				setState(347);
				conditionExpressionList();
				setState(348);
				match(T__4);
				setState(349);
				match(T__0);
				setState(350);
				expressionList();
				setState(351);
				match(T__2);
				setState(352);
				match(ELSE);
				setState(353);
				match(T__0);
				setState(354);
				expressionList();
				setState(355);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitBooleanLoopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLoopExpressionContext booleanLoopExpression() throws RecognitionException {
		BooleanLoopExpressionContext _localctx = new BooleanLoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_booleanLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(WHILE);
			setState(360);
			match(T__3);
			setState(361);
			conditionExpressionList();
			setState(362);
			match(T__4);
			setState(363);
			match(T__0);
			setState(364);
			expressionList();
			setState(365);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitForEachExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForEachExpressionContext forEachExpression() throws RecognitionException {
		ForEachExpressionContext _localctx = new ForEachExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_forEachExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(FOR);
			setState(368);
			match(T__3);
			setState(369);
			match(IDENTIFIER);
			setState(370);
			match(T__5);
			setState(371);
			iterableExpression();
			setState(372);
			match(T__4);
			setState(373);
			match(T__0);
			setState(374);
			expressionList();
			setState(375);
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
			setState(377);
			conditionExpression();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONDITIONAL_LOGICAL_OPERATOR) {
				{
				{
				setState(378);
				match(CONDITIONAL_LOGICAL_OPERATOR);
				setState(379);
				conditionExpression();
				}
				}
				setState(384);
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
			setState(385);
			expression();
			setState(388);
			_la = _input.LA(1);
			if (_la==CONDITIONAL_OPERATOR) {
				{
				setState(386);
				match(CONDITIONAL_OPERATOR);
				setState(387);
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
			setState(390);
			assignAbleExpression();
			setState(391);
			match(ASSIGN);
			setState(392);
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
			setState(396);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
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
			setState(398);
			elementExpression();
			setState(406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(399);
					match(T__6);
					setState(402);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(400);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						setState(401);
						callExpression();
						}
						break;
					}
					}
					} 
				}
				setState(408);
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
			setState(421);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				match(IDENTIFIER);
				setState(410);
				match(T__3);
				setState(412);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__8) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << BOOL_LITERAL) | (1L << STRING_LITERAL) | (1L << NIL_LITERAL) | (1L << FUNCTION) | (1L << NEW) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(411);
					argumentList();
					}
				}

				setState(414);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				match(IDENTIFIER);
				setState(416);
				match(IDENTIFIER);
				setState(419);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(417);
					match(T__7);
					setState(418);
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
			setState(423);
			argumentContent();
			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(424);
					match(T__1);
					setState(425);
					argumentContent();
					}
					} 
				}
				setState(430);
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
			setState(431);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			multiplicativeExpression();
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADDITIVE_OPERATOR) {
				{
				{
				setState(434);
				match(ADDITIVE_OPERATOR);
				setState(435);
				multiplicativeExpression();
				}
				}
				setState(440);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			unaryExpression();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLY_OPERATOR) {
				{
				{
				setState(442);
				match(MULTIPLY_OPERATOR);
				setState(443);
				unaryExpression();
				}
				}
				setState(448);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_unaryExpression);
		try {
			setState(454);
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
				setState(449);
				literal();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(T__3);
				setState(451);
				responseExpression();
				setState(452);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitListDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDefineContext listDefine() throws RecognitionException {
		ListDefineContext _localctx = new ListDefineContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_listDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(T__8);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__8) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << BOOL_LITERAL) | (1L << STRING_LITERAL) | (1L << NIL_LITERAL) | (1L << FUNCTION) | (1L << NEW) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(457);
				expression();
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(458);
					match(T__1);
					setState(459);
					expression();
					}
					}
					setState(464);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(470);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitListDefineWithKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDefineWithKeyContext listDefineWithKey() throws RecognitionException {
		ListDefineWithKeyContext _localctx = new ListDefineWithKeyContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_listDefineWithKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(T__0);
			setState(473);
			listDefineWithKeyContent();
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(474);
				match(T__1);
				setState(475);
				listDefineWithKeyContent();
				}
				}
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(481);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitListDefineWithKeyContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDefineWithKeyContentContext listDefineWithKeyContent() throws RecognitionException {
		ListDefineWithKeyContentContext _localctx = new ListDefineWithKeyContentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_listDefineWithKeyContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(STRING_LITERAL);
			setState(484);
			match(T__7);
			setState(485);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitElementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementExpressionContext elementExpression() throws RecognitionException {
		ElementExpressionContext _localctx = new ElementExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_elementExpression);
		try {
			setState(490);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				instanceExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(489);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_literal);
		try {
			setState(497);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				integerLiteral();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(494);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(495);
				match(BOOL_LITERAL);
				}
				break;
			case NIL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(496);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uolVisitor ) return ((uolVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u01f8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\7\2b\n\2\f\2\16\2e\13\2\3\2\3\2\3"+
		"\2\7\2j\n\2\f\2\16\2m\13\2\3\3\3\3\3\3\3\3\5\3s\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0082\n\4\3\5\3\5\3\5\5\5\u0087"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0090\n\6\3\7\3\7\7\7\u0094\n\7\f"+
		"\7\16\7\u0097\13\7\7\7\u0099\n\7\f\7\16\7\u009c\13\7\3\7\3\7\7\7\u00a0"+
		"\n\7\f\7\16\7\u00a3\13\7\5\7\u00a5\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u00b5\n\n\f\n\16\n\u00b8\13\n\5\n\u00ba\n"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00c2\n\13\3\f\3\f\3\f\5\f\u00c7\n"+
		"\f\3\f\5\f\u00ca\n\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\7\17\u00d9\n\17\f\17\16\17\u00dc\13\17\3\20\3\20\3\20\5\20\u00e1"+
		"\n\20\3\21\3\21\7\21\u00e5\n\21\f\21\16\21\u00e8\13\21\7\21\u00ea\n\21"+
		"\f\21\16\21\u00ed\13\21\3\22\3\22\5\22\u00f1\n\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\27\7\27\u0106\n\27\f\27\16\27\u0109\13\27\3\27\3\27\5\27\u010d\n\27"+
		"\3\30\3\30\3\30\7\30\u0112\n\30\f\30\16\30\u0115\13\30\3\31\3\31\3\32"+
		"\7\32\u011a\n\32\f\32\16\32\u011d\13\32\3\32\3\32\7\32\u0121\n\32\f\32"+
		"\16\32\u0124\13\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u012e"+
		"\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u0168\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \7 \u017f\n \f \16 \u0182"+
		"\13 \3!\3!\3!\5!\u0187\n!\3\"\3\"\3\"\3\"\3#\3#\5#\u018f\n#\3$\3$\3$\3"+
		"$\5$\u0195\n$\7$\u0197\n$\f$\16$\u019a\13$\3%\3%\3%\5%\u019f\n%\3%\3%"+
		"\3%\3%\3%\5%\u01a6\n%\5%\u01a8\n%\3&\3&\3&\7&\u01ad\n&\f&\16&\u01b0\13"+
		"&\3\'\3\'\3(\3(\3(\7(\u01b7\n(\f(\16(\u01ba\13(\3)\3)\3)\7)\u01bf\n)\f"+
		")\16)\u01c2\13)\3*\3*\3*\3*\3*\5*\u01c9\n*\3+\3+\3+\3+\7+\u01cf\n+\f+"+
		"\16+\u01d2\13+\7+\u01d4\n+\f+\16+\u01d7\13+\3+\3+\3,\3,\3,\3,\7,\u01df"+
		"\n,\f,\16,\u01e2\13,\3,\3,\3-\3-\3-\3-\3.\3.\3.\5.\u01ed\n.\3/\3/\3/\3"+
		"/\3/\5/\u01f4\n/\3\60\3\60\3\60\2\2\61\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^\2\3\3\2\17\22\u020d\2"+
		"c\3\2\2\2\4r\3\2\2\2\6\u0081\3\2\2\2\b\u0086\3\2\2\2\n\u008f\3\2\2\2\f"+
		"\u009a\3\2\2\2\16\u00a6\3\2\2\2\20\u00ab\3\2\2\2\22\u00b0\3\2\2\2\24\u00c1"+
		"\3\2\2\2\26\u00c3\3\2\2\2\30\u00cf\3\2\2\2\32\u00d2\3\2\2\2\34\u00d5\3"+
		"\2\2\2\36\u00e0\3\2\2\2 \u00eb\3\2\2\2\"\u00ee\3\2\2\2$\u00f4\3\2\2\2"+
		"&\u00f8\3\2\2\2(\u00ff\3\2\2\2*\u0102\3\2\2\2,\u010c\3\2\2\2.\u010e\3"+
		"\2\2\2\60\u0116\3\2\2\2\62\u011b\3\2\2\2\64\u0125\3\2\2\2\66\u0129\3\2"+
		"\2\28\u0167\3\2\2\2:\u0169\3\2\2\2<\u0171\3\2\2\2>\u017b\3\2\2\2@\u0183"+
		"\3\2\2\2B\u0188\3\2\2\2D\u018e\3\2\2\2F\u0190\3\2\2\2H\u01a7\3\2\2\2J"+
		"\u01a9\3\2\2\2L\u01b1\3\2\2\2N\u01b3\3\2\2\2P\u01bb\3\2\2\2R\u01c8\3\2"+
		"\2\2T\u01ca\3\2\2\2V\u01da\3\2\2\2X\u01e5\3\2\2\2Z\u01ec\3\2\2\2\\\u01f3"+
		"\3\2\2\2^\u01f5\3\2\2\2`b\7\r\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2"+
		"\2\2dk\3\2\2\2ec\3\2\2\2fg\5\4\3\2gh\7\r\2\2hj\3\2\2\2if\3\2\2\2jm\3\2"+
		"\2\2ki\3\2\2\2kl\3\2\2\2l\3\3\2\2\2mk\3\2\2\2ns\5\20\t\2os\5\16\b\2ps"+
		"\5\26\f\2qs\5\6\4\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\5\3\2\2\2"+
		"t\u0082\5\\/\2u\u0082\5T+\2v\u0082\5V,\2w\u0082\5&\24\2x\u0082\5F$\2y"+
		"\u0082\5H%\2z\u0082\5B\"\2{\u0082\5$\23\2|\u0082\5\66\34\2}\u0082\58\35"+
		"\2~\u0082\5:\36\2\177\u0082\5<\37\2\u0080\u0082\5N(\2\u0081t\3\2\2\2\u0081"+
		"u\3\2\2\2\u0081v\3\2\2\2\u0081w\3\2\2\2\u0081x\3\2\2\2\u0081y\3\2\2\2"+
		"\u0081z\3\2\2\2\u0081{\3\2\2\2\u0081|\3\2\2\2\u0081}\3\2\2\2\u0081~\3"+
		"\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\7\3\2\2\2\u0083\u0087"+
		"\5F$\2\u0084\u0087\5H%\2\u0085\u0087\5N(\2\u0086\u0083\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0085\3\2\2\2\u0087\t\3\2\2\2\u0088\u0090\7\24\2\2\u0089"+
		"\u0090\7+\2\2\u008a\u0090\5T+\2\u008b\u0090\5V,\2\u008c\u0090\5&\24\2"+
		"\u008d\u0090\5F$\2\u008e\u0090\5H%\2\u008f\u0088\3\2\2\2\u008f\u0089\3"+
		"\2\2\2\u008f\u008a\3\2\2\2\u008f\u008b\3\2\2\2\u008f\u008c\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\13\3\2\2\2\u0091\u0095\5\6\4"+
		"\2\u0092\u0094\7\r\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u0091\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u00a4\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00a1\5(\25\2\u009e"+
		"\u00a0\7\r\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u009d\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\r\3\2\2\2\u00a6\u00a7\7\26\2"+
		"\2\u00a7\u00a8\7+\2\2\u00a8\u00a9\7\30\2\2\u00a9\u00aa\7\24\2\2\u00aa"+
		"\17\3\2\2\2\u00ab\u00ac\7\26\2\2\u00ac\u00ad\5\22\n\2\u00ad\u00ae\7\30"+
		"\2\2\u00ae\u00af\7\24\2\2\u00af\21\3\2\2\2\u00b0\u00b9\7\3\2\2\u00b1\u00b6"+
		"\5\24\13\2\u00b2\u00b3\7\4\2\2\u00b3\u00b5\5\24\13\2\u00b4\u00b2\3\2\2"+
		"\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00ba"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bc\7\5\2\2\u00bc\23\3\2\2\2\u00bd\u00c2\7+\2\2"+
		"\u00be\u00bf\7+\2\2\u00bf\u00c0\7\27\2\2\u00c0\u00c2\7+\2\2\u00c1\u00bd"+
		"\3\2\2\2\u00c1\u00be\3\2\2\2\u00c2\25\3\2\2\2\u00c3\u00c4\7\31\2\2\u00c4"+
		"\u00c6\7+\2\2\u00c5\u00c7\5\30\r\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00ca\5\32\16\2\u00c9\u00c8\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7\3\2\2\u00cc\u00cd\5 "+
		"\21\2\u00cd\u00ce\7\5\2\2\u00ce\27\3\2\2\2\u00cf\u00d0\7\32\2\2\u00d0"+
		"\u00d1\7+\2\2\u00d1\31\3\2\2\2\u00d2\u00d3\7\33\2\2\u00d3\u00d4\5\34\17"+
		"\2\u00d4\33\3\2\2\2\u00d5\u00da\7+\2\2\u00d6\u00d7\7\4\2\2\u00d7\u00d9"+
		"\7+\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\35\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e1\5\"\22"+
		"\2\u00de\u00df\7\34\2\2\u00df\u00e1\5$\23\2\u00e0\u00dd\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\37\3\2\2\2\u00e2\u00e6\5\36\20\2\u00e3\u00e5\7\r"+
		"\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00e2\3\2"+
		"\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"!\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f0\7\34\2\2\u00ef\u00f1\7\35\2"+
		"\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3"+
		"\5B\"\2\u00f3#\3\2\2\2\u00f4\u00f5\7\36\2\2\u00f5\u00f6\7+\2\2\u00f6\u00f7"+
		"\5&\24\2\u00f7%\3\2\2\2\u00f8\u00f9\7\6\2\2\u00f9\u00fa\5,\27\2\u00fa"+
		"\u00fb\7\7\2\2\u00fb\u00fc\7\3\2\2\u00fc\u00fd\5*\26\2\u00fd\u00fe\7\5"+
		"\2\2\u00fe\'\3\2\2\2\u00ff\u0100\7*\2\2\u0100\u0101\5\b\5\2\u0101)\3\2"+
		"\2\2\u0102\u0103\5\f\7\2\u0103+\3\2\2\2\u0104\u0106\5.\30\2\u0105\u0104"+
		"\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010d\5\62\32\2\u010b\u010d\5"+
		"\62\32\2\u010c\u0107\3\2\2\2\u010c\u010b\3\2\2\2\u010d-\3\2\2\2\u010e"+
		"\u0113\5\60\31\2\u010f\u0110\7\4\2\2\u0110\u0112\5\60\31\2\u0111\u010f"+
		"\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"/\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7+\2\2\u0117\61\3\2\2\2\u0118"+
		"\u011a\5\64\33\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3"+
		"\2\2\2\u011b\u011c\3\2\2\2\u011c\u0122\3\2\2\2\u011d\u011b\3\2\2\2\u011e"+
		"\u011f\7\4\2\2\u011f\u0121\5\64\33\2\u0120\u011e\3\2\2\2\u0121\u0124\3"+
		"\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\63\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0125\u0126\7+\2\2\u0126\u0127\7%\2\2\u0127\u0128\5\\/"+
		"\2\u0128\65\3\2\2\2\u0129\u012a\7\37\2\2\u012a\u012b\7+\2\2\u012b\u012d"+
		"\7\6\2\2\u012c\u012e\5J&\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0130\7\7\2\2\u0130\67\3\2\2\2\u0131\u0132\7 \2\2"+
		"\u0132\u0133\7\6\2\2\u0133\u0134\5> \2\u0134\u0135\7\7\2\2\u0135\u0136"+
		"\7\3\2\2\u0136\u0137\5\f\7\2\u0137\u0138\7\5\2\2\u0138\u0168\3\2\2\2\u0139"+
		"\u013a\7 \2\2\u013a\u013b\7\6\2\2\u013b\u013c\5> \2\u013c\u013d\7\7\2"+
		"\2\u013d\u013e\7\3\2\2\u013e\u013f\5\f\7\2\u013f\u0140\7\5\2\2\u0140\u0141"+
		"\7\"\2\2\u0141\u0142\7\3\2\2\u0142\u0143\5\f\7\2\u0143\u0144\7\5\2\2\u0144"+
		"\u0168\3\2\2\2\u0145\u0146\7 \2\2\u0146\u0147\7\6\2\2\u0147\u0148\5> "+
		"\2\u0148\u0149\7\7\2\2\u0149\u014a\7\3\2\2\u014a\u014b\5\f\7\2\u014b\u014c"+
		"\7\5\2\2\u014c\u014d\7!\2\2\u014d\u014e\7\6\2\2\u014e\u014f\5> \2\u014f"+
		"\u0150\7\7\2\2\u0150\u0151\7\3\2\2\u0151\u0152\5\f\7\2\u0152\u0153\7\5"+
		"\2\2\u0153\u0168\3\2\2\2\u0154\u0155\7 \2\2\u0155\u0156\7\6\2\2\u0156"+
		"\u0157\5> \2\u0157\u0158\7\7\2\2\u0158\u0159\7\3\2\2\u0159\u015a\5\f\7"+
		"\2\u015a\u015b\7\5\2\2\u015b\u015c\7!\2\2\u015c\u015d\7\6\2\2\u015d\u015e"+
		"\5> \2\u015e\u015f\7\7\2\2\u015f\u0160\7\3\2\2\u0160\u0161\5\f\7\2\u0161"+
		"\u0162\7\5\2\2\u0162\u0163\7\"\2\2\u0163\u0164\7\3\2\2\u0164\u0165\5\f"+
		"\7\2\u0165\u0166\7\5\2\2\u0166\u0168\3\2\2\2\u0167\u0131\3\2\2\2\u0167"+
		"\u0139\3\2\2\2\u0167\u0145\3\2\2\2\u0167\u0154\3\2\2\2\u01689\3\2\2\2"+
		"\u0169\u016a\7#\2\2\u016a\u016b\7\6\2\2\u016b\u016c\5> \2\u016c\u016d"+
		"\7\7\2\2\u016d\u016e\7\3\2\2\u016e\u016f\5\f\7\2\u016f\u0170\7\5\2\2\u0170"+
		";\3\2\2\2\u0171\u0172\7$\2\2\u0172\u0173\7\6\2\2\u0173\u0174\7+\2\2\u0174"+
		"\u0175\7\b\2\2\u0175\u0176\5\n\6\2\u0176\u0177\7\7\2\2\u0177\u0178\7\3"+
		"\2\2\u0178\u0179\5\f\7\2\u0179\u017a\7\5\2\2\u017a=\3\2\2\2\u017b\u0180"+
		"\5@!\2\u017c\u017d\7)\2\2\u017d\u017f\5@!\2\u017e\u017c\3\2\2\2\u017f"+
		"\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181?\3\2\2\2"+
		"\u0182\u0180\3\2\2\2\u0183\u0186\5\6\4\2\u0184\u0185\7(\2\2\u0185\u0187"+
		"\5\6\4\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187A\3\2\2\2\u0188"+
		"\u0189\5D#\2\u0189\u018a\7%\2\2\u018a\u018b\5\6\4\2\u018bC\3\2\2\2\u018c"+
		"\u018f\5R*\2\u018d\u018f\5F$\2\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2\2"+
		"\u018fE\3\2\2\2\u0190\u0198\5Z.\2\u0191\u0194\7\t\2\2\u0192\u0195\7+\2"+
		"\2\u0193\u0195\5H%\2\u0194\u0192\3\2\2\2\u0194\u0193\3\2\2\2\u0195\u0197"+
		"\3\2\2\2\u0196\u0191\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199G\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c\7+\2\2\u019c"+
		"\u019e\7\6\2\2\u019d\u019f\5J&\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2"+
		"\2\u019f\u01a0\3\2\2\2\u01a0\u01a8\7\7\2\2\u01a1\u01a2\7+\2\2\u01a2\u01a5"+
		"\7+\2\2\u01a3\u01a4\7\n\2\2\u01a4\u01a6\5J&\2\u01a5\u01a3\3\2\2\2\u01a5"+
		"\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u019b\3\2\2\2\u01a7\u01a1\3\2"+
		"\2\2\u01a8I\3\2\2\2\u01a9\u01ae\5L\'\2\u01aa\u01ab\7\4\2\2\u01ab\u01ad"+
		"\5L\'\2\u01ac\u01aa\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01afK\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\5\6\4\2"+
		"\u01b2M\3\2\2\2\u01b3\u01b8\5P)\2\u01b4\u01b5\7&\2\2\u01b5\u01b7\5P)\2"+
		"\u01b6\u01b4\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9"+
		"\3\2\2\2\u01b9O\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01c0\5R*\2\u01bc\u01bd"+
		"\7\'\2\2\u01bd\u01bf\5R*\2\u01be\u01bc\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0"+
		"\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1Q\3\2\2\2\u01c2\u01c0\3\2\2\2"+
		"\u01c3\u01c9\5\\/\2\u01c4\u01c5\7\6\2\2\u01c5\u01c6\5\b\5\2\u01c6\u01c7"+
		"\7\7\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c3\3\2\2\2\u01c8\u01c4\3\2\2\2\u01c9"+
		"S\3\2\2\2\u01ca\u01d5\7\13\2\2\u01cb\u01d0\5\6\4\2\u01cc\u01cd\7\4\2\2"+
		"\u01cd\u01cf\5\6\4\2\u01ce\u01cc\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce"+
		"\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3"+
		"\u01cb\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\7\f\2\2\u01d9"+
		"U\3\2\2\2\u01da\u01db\7\3\2\2\u01db\u01e0\5X-\2\u01dc\u01dd\7\4\2\2\u01dd"+
		"\u01df\5X-\2\u01de\u01dc\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2"+
		"\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4"+
		"\7\5\2\2\u01e4W\3\2\2\2\u01e5\u01e6\7\24\2\2\u01e6\u01e7\7\n\2\2\u01e7"+
		"\u01e8\5\6\4\2\u01e8Y\3\2\2\2\u01e9\u01ed\5R*\2\u01ea\u01ed\5\66\34\2"+
		"\u01eb\u01ed\5H%\2\u01ec\u01e9\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01eb"+
		"\3\2\2\2\u01ed[\3\2\2\2\u01ee\u01f4\5^\60\2\u01ef\u01f4\7+\2\2\u01f0\u01f4"+
		"\7\24\2\2\u01f1\u01f4\7\23\2\2\u01f2\u01f4\7\25\2\2\u01f3\u01ee\3\2\2"+
		"\2\u01f3\u01ef\3\2\2\2\u01f3\u01f0\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f2"+
		"\3\2\2\2\u01f4]\3\2\2\2\u01f5\u01f6\t\2\2\2\u01f6_\3\2\2\2.ckr\u0081\u0086"+
		"\u008f\u0095\u009a\u00a1\u00a4\u00b6\u00b9\u00c1\u00c6\u00c9\u00da\u00e0"+
		"\u00e6\u00eb\u00f0\u0107\u010c\u0113\u011b\u0122\u012d\u0167\u0180\u0186"+
		"\u018e\u0194\u0198\u019e\u01a5\u01a7\u01ae\u01b8\u01c0\u01c8\u01d0\u01d5"+
		"\u01e0\u01ec\u01f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}