// Generated from uol.g4 by ANTLR 4.5
package ksu.yomogi.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class uolLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "NEWLINE", "WS", "DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", 
		"BINARY_LITERAL", "BOOL_LITERAL", "STRING_LITERAL", "NIL_LITERAL", "IMPORT", 
		"AS", "FROM", "CLASS", "EXTENDS", "IMPLEMENTS", "MODIFIER", "INSTRUCTION", 
		"FUNCTION", "NEW", "IF", "ELSEIF", "ELSE", "WHILE", "FOR", "ASSIGN", "ADDITIVE_OPERATOR", 
		"MULTIPLY_OPERATOR", "CONDITIONAL_OPERATOR", "CONDITIONAL_LOGICAL_OPERATOR", 
		"RETURN", "IDENTIFIER", "Digits", "Letter", "LetterOrDigit"
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


	public uolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "uol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u016a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\6\fs\n\f\r\f\16\ft\3\r\6\rx\n\r\r\r"+
		"\16\ry\3\r\3\r\3\16\3\16\3\16\5\16\u0081\n\16\5\16\u0083\n\16\3\16\5\16"+
		"\u0086\n\16\3\17\3\17\3\17\3\17\5\17\u008c\n\17\3\17\5\17\u008f\n\17\3"+
		"\20\3\20\7\20\u0093\n\20\f\20\16\20\u0096\13\20\3\20\3\20\5\20\u009a\n"+
		"\20\3\20\5\20\u009d\n\20\3\21\3\21\3\21\3\21\5\21\u00a3\n\21\3\21\5\21"+
		"\u00a6\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b1\n"+
		"\22\3\23\3\23\7\23\u00b5\n\23\f\23\16\23\u00b8\13\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5"+
		"\33\u00f5\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0108\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3"+
		"$\5$\u0134\n$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'"+
		"\u0144\n\'\3(\3(\3(\3(\3(\5(\u014b\n(\3)\3)\3)\3)\3)\3)\3)\3*\3*\7*\u0156"+
		"\n*\f*\16*\u0159\13*\3+\3+\7+\u015d\n+\f+\16+\u0160\13+\3+\5+\u0163\n"+
		"+\3,\3,\3-\3-\5-\u0169\n-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U\2W\2Y\2\3\2\21"+
		"\4\2\f\f\17\17\5\2\13\f\16\17\"\"\3\2\63;\4\2NNnn\4\2ZZzz\5\2\62;CHch"+
		"\3\2\629\4\2DDdd\3\2\62\63\6\2\f\f\17\17$$^^\4\2--//\5\2\'\',,\61\61\3"+
		"\2\62;\4\2\62;aa\5\2C\\aac|\u0182\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3[\3\2\2\2\5]\3\2\2\2\7_\3\2\2\2\ta\3"+
		"\2\2\2\13c\3\2\2\2\re\3\2\2\2\17h\3\2\2\2\21j\3\2\2\2\23m\3\2\2\2\25o"+
		"\3\2\2\2\27r\3\2\2\2\31w\3\2\2\2\33\u0082\3\2\2\2\35\u0087\3\2\2\2\37"+
		"\u0090\3\2\2\2!\u009e\3\2\2\2#\u00b0\3\2\2\2%\u00b2\3\2\2\2\'\u00bb\3"+
		"\2\2\2)\u00bf\3\2\2\2+\u00c6\3\2\2\2-\u00c9\3\2\2\2/\u00ce\3\2\2\2\61"+
		"\u00d4\3\2\2\2\63\u00dc\3\2\2\2\65\u00f4\3\2\2\2\67\u0107\3\2\2\29\u0109"+
		"\3\2\2\2;\u0112\3\2\2\2=\u0116\3\2\2\2?\u0119\3\2\2\2A\u0121\3\2\2\2C"+
		"\u0126\3\2\2\2E\u012c\3\2\2\2G\u0133\3\2\2\2I\u0135\3\2\2\2K\u0137\3\2"+
		"\2\2M\u0143\3\2\2\2O\u014a\3\2\2\2Q\u014c\3\2\2\2S\u0153\3\2\2\2U\u015a"+
		"\3\2\2\2W\u0164\3\2\2\2Y\u0168\3\2\2\2[\\\7}\2\2\\\4\3\2\2\2]^\7.\2\2"+
		"^\6\3\2\2\2_`\7\177\2\2`\b\3\2\2\2ab\7*\2\2b\n\3\2\2\2cd\7+\2\2d\f\3\2"+
		"\2\2ef\7k\2\2fg\7p\2\2g\16\3\2\2\2hi\7\60\2\2i\20\3\2\2\2jk\7<\2\2kl\7"+
		"\"\2\2l\22\3\2\2\2mn\7]\2\2n\24\3\2\2\2op\7_\2\2p\26\3\2\2\2qs\t\2\2\2"+
		"rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\30\3\2\2\2vx\t\3\2\2wv\3\2\2"+
		"\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\b\r\2\2|\32\3\2\2\2}\u0083"+
		"\7\62\2\2~\u0080\t\4\2\2\177\u0081\5U+\2\u0080\177\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0083\3\2\2\2\u0082}\3\2\2\2\u0082~\3\2\2\2\u0083\u0085"+
		"\3\2\2\2\u0084\u0086\t\5\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\34\3\2\2\2\u0087\u0088\7\62\2\2\u0088\u0089\t\6\2\2\u0089\u008b\t\7\2"+
		"\2\u008a\u008c\t\7\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e"+
		"\3\2\2\2\u008d\u008f\t\5\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\36\3\2\2\2\u0090\u0094\7\62\2\2\u0091\u0093\7a\2\2\u0092\u0091\3\2\2"+
		"\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\t\b\2\2\u0098\u009a\t\b\2\2\u0099"+
		"\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u009d\t\5"+
		"\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d \3\2\2\2\u009e\u009f"+
		"\7\62\2\2\u009f\u00a0\t\t\2\2\u00a0\u00a2\t\n\2\2\u00a1\u00a3\t\n\2\2"+
		"\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a6"+
		"\t\5\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\"\3\2\2\2\u00a7"+
		"\u00a8\7v\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7w\2\2\u00aa\u00b1\7g\2\2"+
		"\u00ab\u00ac\7h\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af"+
		"\7u\2\2\u00af\u00b1\7g\2\2\u00b0\u00a7\3\2\2\2\u00b0\u00ab\3\2\2\2\u00b1"+
		"$\3\2\2\2\u00b2\u00b6\7$\2\2\u00b3\u00b5\n\13\2\2\u00b4\u00b3\3\2\2\2"+
		"\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7$\2\2\u00ba&\3\2\2\2\u00bb\u00bc"+
		"\7p\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7n\2\2\u00be(\3\2\2\2\u00bf\u00c0"+
		"\7k\2\2\u00c0\u00c1\7o\2\2\u00c1\u00c2\7r\2\2\u00c2\u00c3\7q\2\2\u00c3"+
		"\u00c4\7t\2\2\u00c4\u00c5\7v\2\2\u00c5*\3\2\2\2\u00c6\u00c7\7c\2\2\u00c7"+
		"\u00c8\7u\2\2\u00c8,\3\2\2\2\u00c9\u00ca\7h\2\2\u00ca\u00cb\7t\2\2\u00cb"+
		"\u00cc\7q\2\2\u00cc\u00cd\7o\2\2\u00cd.\3\2\2\2\u00ce\u00cf\7e\2\2\u00cf"+
		"\u00d0\7n\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7u\2\2"+
		"\u00d3\60\3\2\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7z\2\2\u00d6\u00d7\7"+
		"v\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7f\2\2\u00da\u00db"+
		"\7u\2\2\u00db\62\3\2\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7o\2\2\u00de\u00df"+
		"\7r\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7o\2\2\u00e2"+
		"\u00e3\7g\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7u\2\2"+
		"\u00e6\64\3\2\2\2\u00e7\u00e8\7r\2\2\u00e8\u00e9\7w\2\2\u00e9\u00ea\7"+
		"d\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7k\2\2\u00ec\u00f5\7e\2\2\u00ed\u00ee"+
		"\7r\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7x\2\2\u00f1"+
		"\u00f2\7c\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f5\7g\2\2\u00f4\u00e7\3\2\2"+
		"\2\u00f4\u00ed\3\2\2\2\u00f5\66\3\2\2\2\u00f6\u00f7\7h\2\2\u00f7\u00f8"+
		"\7k\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7c\2\2\u00fa\u0108\7n\2\2\u00fb"+
		"\u00fc\7u\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7v\2\2"+
		"\u00ff\u0100\7k\2\2\u0100\u0108\7e\2\2\u0101\u0102\7p\2\2\u0102\u0103"+
		"\7c\2\2\u0103\u0104\7v\2\2\u0104\u0105\7k\2\2\u0105\u0106\7x\2\2\u0106"+
		"\u0108\7g\2\2\u0107\u00f6\3\2\2\2\u0107\u00fb\3\2\2\2\u0107\u0101\3\2"+
		"\2\2\u01088\3\2\2\2\u0109\u010a\7h\2\2\u010a\u010b\7w\2\2\u010b\u010c"+
		"\7p\2\2\u010c\u010d\7e\2\2\u010d\u010e\7v\2\2\u010e\u010f\7k\2\2\u010f"+
		"\u0110\7q\2\2\u0110\u0111\7p\2\2\u0111:\3\2\2\2\u0112\u0113\7p\2\2\u0113"+
		"\u0114\7g\2\2\u0114\u0115\7y\2\2\u0115<\3\2\2\2\u0116\u0117\7k\2\2\u0117"+
		"\u0118\7h\2\2\u0118>\3\2\2\2\u0119\u011a\7g\2\2\u011a\u011b\7n\2\2\u011b"+
		"\u011c\7u\2\2\u011c\u011d\7g\2\2\u011d\u011e\7\"\2\2\u011e\u011f\7k\2"+
		"\2\u011f\u0120\7h\2\2\u0120@\3\2\2\2\u0121\u0122\7g\2\2\u0122\u0123\7"+
		"n\2\2\u0123\u0124\7u\2\2\u0124\u0125\7g\2\2\u0125B\3\2\2\2\u0126\u0127"+
		"\7y\2\2\u0127\u0128\7j\2\2\u0128\u0129\7k\2\2\u0129\u012a\7n\2\2\u012a"+
		"\u012b\7g\2\2\u012bD\3\2\2\2\u012c\u012d\7h\2\2\u012d\u012e\7q\2\2\u012e"+
		"\u012f\7t\2\2\u012fF\3\2\2\2\u0130\u0134\7?\2\2\u0131\u0132\7k\2\2\u0132"+
		"\u0134\7u\2\2\u0133\u0130\3\2\2\2\u0133\u0131\3\2\2\2\u0134H\3\2\2\2\u0135"+
		"\u0136\t\f\2\2\u0136J\3\2\2\2\u0137\u0138\t\r\2\2\u0138L\3\2\2\2\u0139"+
		"\u013a\7?\2\2\u013a\u0144\7?\2\2\u013b\u013c\7#\2\2\u013c\u0144\7?\2\2"+
		"\u013d\u0144\7>\2\2\u013e\u013f\7>\2\2\u013f\u0144\7?\2\2\u0140\u0144"+
		"\7@\2\2\u0141\u0142\7@\2\2\u0142\u0144\7?\2\2\u0143\u0139\3\2\2\2\u0143"+
		"\u013b\3\2\2\2\u0143\u013d\3\2\2\2\u0143\u013e\3\2\2\2\u0143\u0140\3\2"+
		"\2\2\u0143\u0141\3\2\2\2\u0144N\3\2\2\2\u0145\u0146\7c\2\2\u0146\u0147"+
		"\7p\2\2\u0147\u014b\7f\2\2\u0148\u0149\7q\2\2\u0149\u014b\7t\2\2\u014a"+
		"\u0145\3\2\2\2\u014a\u0148\3\2\2\2\u014bP\3\2\2\2\u014c\u014d\7t\2\2\u014d"+
		"\u014e\7g\2\2\u014e\u014f\7v\2\2\u014f\u0150\7w\2\2\u0150\u0151\7t\2\2"+
		"\u0151\u0152\7p\2\2\u0152R\3\2\2\2\u0153\u0157\5W,\2\u0154\u0156\5Y-\2"+
		"\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158"+
		"\3\2\2\2\u0158T\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u0162\t\16\2\2\u015b"+
		"\u015d\t\17\2\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3"+
		"\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161"+
		"\u0163\t\16\2\2\u0162\u015e\3\2\2\2\u0162\u0163\3\2\2\2\u0163V\3\2\2\2"+
		"\u0164\u0165\t\20\2\2\u0165X\3\2\2\2\u0166\u0169\5W,\2\u0167\u0169\t\16"+
		"\2\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169Z\3\2\2\2\32\2ty\u0080"+
		"\u0082\u0085\u008b\u008e\u0094\u0099\u009c\u00a2\u00a5\u00b0\u00b6\u00f4"+
		"\u0107\u0133\u0143\u014a\u0157\u015e\u0162\u0168\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}