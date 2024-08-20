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
		IMPORT=20, FROM=21, CLASS=22, EXTENDS=23, IMPLEMENTS=24, MODIFIER=25, 
		INSTRUCTION=26, FUNCTION=27, NEW=28, IF=29, ELSEIF=30, ELSE=31, WHILE=32, 
		FOR=33, ASSIGN=34, ADDITIVE_OPERATOR=35, MULTIPLY_OPERATOR=36, CONDITIONAL_OPERATOR=37, 
		CONDITIONAL_LOGICAL_OPERATOR=38, RETURN=39, IDENTIFIER=40;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "NEWLINE", "WS", "DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", 
		"BINARY_LITERAL", "BOOL_LITERAL", "STRING_LITERAL", "NIL_LITERAL", "IMPORT", 
		"FROM", "CLASS", "EXTENDS", "IMPLEMENTS", "MODIFIER", "INSTRUCTION", "FUNCTION", 
		"NEW", "IF", "ELSEIF", "ELSE", "WHILE", "FOR", "ASSIGN", "ADDITIVE_OPERATOR", 
		"MULTIPLY_OPERATOR", "CONDITIONAL_OPERATOR", "CONDITIONAL_LOGICAL_OPERATOR", 
		"RETURN", "IDENTIFIER", "Digits", "Letter", "LetterOrDigit"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2*\u0165\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\6\fq\n\f\r\f\16\fr\3\r\6\rv\n\r\r\r\16\r"+
		"w\3\r\3\r\3\16\3\16\3\16\5\16\177\n\16\5\16\u0081\n\16\3\16\5\16\u0084"+
		"\n\16\3\17\3\17\3\17\3\17\5\17\u008a\n\17\3\17\5\17\u008d\n\17\3\20\3"+
		"\20\7\20\u0091\n\20\f\20\16\20\u0094\13\20\3\20\3\20\5\20\u0098\n\20\3"+
		"\20\5\20\u009b\n\20\3\21\3\21\3\21\3\21\5\21\u00a1\n\21\3\21\5\21\u00a4"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00af\n\22\3\23"+
		"\3\23\7\23\u00b3\n\23\f\23\16\23\u00b6\13\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00f0\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u0103\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\5#\u012f\n"+
		"#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u013f\n&\3\'\3\'\3\'\3"+
		"\'\3\'\5\'\u0146\n\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\7)\u0151\n)\f)\16)\u0154"+
		"\13)\3*\3*\7*\u0158\n*\f*\16*\u015b\13*\3*\5*\u015e\n*\3+\3+\3,\3,\5,"+
		"\u0164\n,\2\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S\2U\2W\2\3\2\21\4\2\f\f\17\17\5"+
		"\2\13\f\16\17\"\"\3\2\63;\4\2NNnn\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd"+
		"\3\2\62\63\6\2\f\f\17\17$$^^\4\2--//\5\2\'\',,\61\61\3\2\62;\4\2\62;a"+
		"a\5\2C\\aac|\u017d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\3Y\3\2\2\2\5[\3\2\2\2\7]\3\2\2\2\t_\3\2\2\2\13a\3\2\2\2\rc\3\2\2"+
		"\2\17f\3\2\2\2\21h\3\2\2\2\23k\3\2\2\2\25m\3\2\2\2\27p\3\2\2\2\31u\3\2"+
		"\2\2\33\u0080\3\2\2\2\35\u0085\3\2\2\2\37\u008e\3\2\2\2!\u009c\3\2\2\2"+
		"#\u00ae\3\2\2\2%\u00b0\3\2\2\2\'\u00b9\3\2\2\2)\u00bd\3\2\2\2+\u00c4\3"+
		"\2\2\2-\u00c9\3\2\2\2/\u00cf\3\2\2\2\61\u00d7\3\2\2\2\63\u00ef\3\2\2\2"+
		"\65\u0102\3\2\2\2\67\u0104\3\2\2\29\u010d\3\2\2\2;\u0111\3\2\2\2=\u0114"+
		"\3\2\2\2?\u011c\3\2\2\2A\u0121\3\2\2\2C\u0127\3\2\2\2E\u012e\3\2\2\2G"+
		"\u0130\3\2\2\2I\u0132\3\2\2\2K\u013e\3\2\2\2M\u0145\3\2\2\2O\u0147\3\2"+
		"\2\2Q\u014e\3\2\2\2S\u0155\3\2\2\2U\u015f\3\2\2\2W\u0163\3\2\2\2YZ\7}"+
		"\2\2Z\4\3\2\2\2[\\\7.\2\2\\\6\3\2\2\2]^\7\177\2\2^\b\3\2\2\2_`\7*\2\2"+
		"`\n\3\2\2\2ab\7+\2\2b\f\3\2\2\2cd\7k\2\2de\7p\2\2e\16\3\2\2\2fg\7\60\2"+
		"\2g\20\3\2\2\2hi\7<\2\2ij\7\"\2\2j\22\3\2\2\2kl\7]\2\2l\24\3\2\2\2mn\7"+
		"_\2\2n\26\3\2\2\2oq\t\2\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\30"+
		"\3\2\2\2tv\t\3\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2y"+
		"z\b\r\2\2z\32\3\2\2\2{\u0081\7\62\2\2|~\t\4\2\2}\177\5S*\2~}\3\2\2\2~"+
		"\177\3\2\2\2\177\u0081\3\2\2\2\u0080{\3\2\2\2\u0080|\3\2\2\2\u0081\u0083"+
		"\3\2\2\2\u0082\u0084\t\5\2\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\34\3\2\2\2\u0085\u0086\7\62\2\2\u0086\u0087\t\6\2\2\u0087\u0089\t\7\2"+
		"\2\u0088\u008a\t\7\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c"+
		"\3\2\2\2\u008b\u008d\t\5\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\36\3\2\2\2\u008e\u0092\7\62\2\2\u008f\u0091\7a\2\2\u0090\u008f\3\2\2"+
		"\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\t\b\2\2\u0096\u0098\t\b\2\2\u0097"+
		"\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u009b\t\5"+
		"\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b \3\2\2\2\u009c\u009d"+
		"\7\62\2\2\u009d\u009e\t\t\2\2\u009e\u00a0\t\n\2\2\u009f\u00a1\t\n\2\2"+
		"\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a4"+
		"\t\5\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\"\3\2\2\2\u00a5"+
		"\u00a6\7v\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7w\2\2\u00a8\u00af\7g\2\2"+
		"\u00a9\u00aa\7h\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad"+
		"\7u\2\2\u00ad\u00af\7g\2\2\u00ae\u00a5\3\2\2\2\u00ae\u00a9\3\2\2\2\u00af"+
		"$\3\2\2\2\u00b0\u00b4\7$\2\2\u00b1\u00b3\n\13\2\2\u00b2\u00b1\3\2\2\2"+
		"\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7"+
		"\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7$\2\2\u00b8&\3\2\2\2\u00b9\u00ba"+
		"\7p\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7n\2\2\u00bc(\3\2\2\2\u00bd\u00be"+
		"\7k\2\2\u00be\u00bf\7o\2\2\u00bf\u00c0\7r\2\2\u00c0\u00c1\7q\2\2\u00c1"+
		"\u00c2\7t\2\2\u00c2\u00c3\7v\2\2\u00c3*\3\2\2\2\u00c4\u00c5\7h\2\2\u00c5"+
		"\u00c6\7t\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7o\2\2\u00c8,\3\2\2\2\u00c9"+
		"\u00ca\7e\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7u\2\2"+
		"\u00cd\u00ce\7u\2\2\u00ce.\3\2\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7z\2"+
		"\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5"+
		"\7f\2\2\u00d5\u00d6\7u\2\2\u00d6\60\3\2\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9"+
		"\7o\2\2\u00d9\u00da\7r\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7g\2\2\u00dc"+
		"\u00dd\7o\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7v\2\2"+
		"\u00e0\u00e1\7u\2\2\u00e1\62\3\2\2\2\u00e2\u00e3\7r\2\2\u00e3\u00e4\7"+
		"w\2\2\u00e4\u00e5\7d\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7k\2\2\u00e7\u00f0"+
		"\7e\2\2\u00e8\u00e9\7r\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7k\2\2\u00eb"+
		"\u00ec\7x\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7v\2\2\u00ee\u00f0\7g\2\2"+
		"\u00ef\u00e2\3\2\2\2\u00ef\u00e8\3\2\2\2\u00f0\64\3\2\2\2\u00f1\u00f2"+
		"\7h\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7c\2\2\u00f5"+
		"\u0103\7n\2\2\u00f6\u00f7\7u\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7c\2\2"+
		"\u00f9\u00fa\7v\2\2\u00fa\u00fb\7k\2\2\u00fb\u0103\7e\2\2\u00fc\u00fd"+
		"\7p\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7k\2\2\u0100"+
		"\u0101\7x\2\2\u0101\u0103\7g\2\2\u0102\u00f1\3\2\2\2\u0102\u00f6\3\2\2"+
		"\2\u0102\u00fc\3\2\2\2\u0103\66\3\2\2\2\u0104\u0105\7h\2\2\u0105\u0106"+
		"\7w\2\2\u0106\u0107\7p\2\2\u0107\u0108\7e\2\2\u0108\u0109\7v\2\2\u0109"+
		"\u010a\7k\2\2\u010a\u010b\7q\2\2\u010b\u010c\7p\2\2\u010c8\3\2\2\2\u010d"+
		"\u010e\7p\2\2\u010e\u010f\7g\2\2\u010f\u0110\7y\2\2\u0110:\3\2\2\2\u0111"+
		"\u0112\7k\2\2\u0112\u0113\7h\2\2\u0113<\3\2\2\2\u0114\u0115\7g\2\2\u0115"+
		"\u0116\7n\2\2\u0116\u0117\7u\2\2\u0117\u0118\7g\2\2\u0118\u0119\7\"\2"+
		"\2\u0119\u011a\7k\2\2\u011a\u011b\7h\2\2\u011b>\3\2\2\2\u011c\u011d\7"+
		"g\2\2\u011d\u011e\7n\2\2\u011e\u011f\7u\2\2\u011f\u0120\7g\2\2\u0120@"+
		"\3\2\2\2\u0121\u0122\7y\2\2\u0122\u0123\7j\2\2\u0123\u0124\7k\2\2\u0124"+
		"\u0125\7n\2\2\u0125\u0126\7g\2\2\u0126B\3\2\2\2\u0127\u0128\7h\2\2\u0128"+
		"\u0129\7q\2\2\u0129\u012a\7t\2\2\u012aD\3\2\2\2\u012b\u012f\7?\2\2\u012c"+
		"\u012d\7k\2\2\u012d\u012f\7u\2\2\u012e\u012b\3\2\2\2\u012e\u012c\3\2\2"+
		"\2\u012fF\3\2\2\2\u0130\u0131\t\f\2\2\u0131H\3\2\2\2\u0132\u0133\t\r\2"+
		"\2\u0133J\3\2\2\2\u0134\u0135\7?\2\2\u0135\u013f\7?\2\2\u0136\u0137\7"+
		"#\2\2\u0137\u013f\7?\2\2\u0138\u013f\7>\2\2\u0139\u013a\7>\2\2\u013a\u013f"+
		"\7?\2\2\u013b\u013f\7@\2\2\u013c\u013d\7@\2\2\u013d\u013f\7?\2\2\u013e"+
		"\u0134\3\2\2\2\u013e\u0136\3\2\2\2\u013e\u0138\3\2\2\2\u013e\u0139\3\2"+
		"\2\2\u013e\u013b\3\2\2\2\u013e\u013c\3\2\2\2\u013fL\3\2\2\2\u0140\u0141"+
		"\7c\2\2\u0141\u0142\7p\2\2\u0142\u0146\7f\2\2\u0143\u0144\7q\2\2\u0144"+
		"\u0146\7t\2\2\u0145\u0140\3\2\2\2\u0145\u0143\3\2\2\2\u0146N\3\2\2\2\u0147"+
		"\u0148\7t\2\2\u0148\u0149\7g\2\2\u0149\u014a\7v\2\2\u014a\u014b\7w\2\2"+
		"\u014b\u014c\7t\2\2\u014c\u014d\7p\2\2\u014dP\3\2\2\2\u014e\u0152\5U+"+
		"\2\u014f\u0151\5W,\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150"+
		"\3\2\2\2\u0152\u0153\3\2\2\2\u0153R\3\2\2\2\u0154\u0152\3\2\2\2\u0155"+
		"\u015d\t\16\2\2\u0156\u0158\t\17\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3"+
		"\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015c\u015e\t\16\2\2\u015d\u0159\3\2\2\2\u015d\u015e\3"+
		"\2\2\2\u015eT\3\2\2\2\u015f\u0160\t\20\2\2\u0160V\3\2\2\2\u0161\u0164"+
		"\5U+\2\u0162\u0164\t\16\2\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164"+
		"X\3\2\2\2\32\2rw~\u0080\u0083\u0089\u008c\u0092\u0097\u009a\u00a0\u00a3"+
		"\u00ae\u00b4\u00ef\u0102\u012e\u013e\u0145\u0152\u0159\u015d\u0163\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}