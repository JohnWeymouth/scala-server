// Generated from /Users/trevorallred/projects/tantalim/scala/modules/filterCompiler/src/main/scala/com/tantalim/filter/compiler/Filter.g4 by ANTLR 4.5
package com.tantalim.filter.compiler.src;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FilterLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, TRUE=26, FALSE=27, AND=28, OR=29, FIELD=30, INT=31, FLOAT=32, 
		STRING=33, SPACE=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"TRUE", "FALSE", "AND", "OR", "FIELD", "INT", "FLOAT", "STRING", "SPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'NOW'", "'='", "'!='", "'Equals'", "'NotEquals'", 
		"'In'", "'NotIn'", "'BeginsWith'", "'EndsWith'", "'Contains'", "'>'", 
		"'>='", "'GreaterThan'", "'GreaterThanOrEqual'", "'<'", "'<='", "'LessThan'", 
		"'LessThanOrEqual'", "'Before'", "'OnOrBefore'", "'After'", "'OnOrAfter'", 
		"'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "TRUE", "FALSE", "AND", "OR", "FIELD", "INT", "FLOAT", "STRING", 
		"SPACE"
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
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public FilterLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Filter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u0144\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0103"+
		"\n\35\3\36\3\36\3\36\3\36\5\36\u0109\n\36\3\37\3\37\7\37\u010d\n\37\f"+
		"\37\16\37\u0110\13\37\3 \6 \u0113\n \r \16 \u0114\3!\6!\u0118\n!\r!\16"+
		"!\u0119\3!\3!\7!\u011e\n!\f!\16!\u0121\13!\3!\3!\6!\u0125\n!\r!\16!\u0126"+
		"\5!\u0129\n!\3\"\3\"\3\"\3\"\7\"\u012f\n\"\f\"\16\"\u0132\13\"\3\"\3\""+
		"\3\"\3\"\3\"\7\"\u0139\n\"\f\"\16\"\u013c\13\"\3\"\5\"\u013f\n\"\3#\3"+
		"#\3#\3#\2\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2"+
		"\f\f\17\17$$\5\2\13\f\17\17\"\"\u0150\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5I\3\2\2\2\7K\3\2\2\2\tM\3\2\2"+
		"\2\13Q\3\2\2\2\rS\3\2\2\2\17V\3\2\2\2\21]\3\2\2\2\23g\3\2\2\2\25j\3\2"+
		"\2\2\27p\3\2\2\2\31{\3\2\2\2\33\u0084\3\2\2\2\35\u008d\3\2\2\2\37\u008f"+
		"\3\2\2\2!\u0092\3\2\2\2#\u009e\3\2\2\2%\u00b1\3\2\2\2\'\u00b3\3\2\2\2"+
		")\u00b6\3\2\2\2+\u00bf\3\2\2\2-\u00cf\3\2\2\2/\u00d6\3\2\2\2\61\u00e1"+
		"\3\2\2\2\63\u00e7\3\2\2\2\65\u00f1\3\2\2\2\67\u00f6\3\2\2\29\u0102\3\2"+
		"\2\2;\u0108\3\2\2\2=\u010a\3\2\2\2?\u0112\3\2\2\2A\u0128\3\2\2\2C\u013e"+
		"\3\2\2\2E\u0140\3\2\2\2GH\7*\2\2H\4\3\2\2\2IJ\7+\2\2J\6\3\2\2\2KL\7.\2"+
		"\2L\b\3\2\2\2MN\7P\2\2NO\7Q\2\2OP\7Y\2\2P\n\3\2\2\2QR\7?\2\2R\f\3\2\2"+
		"\2ST\7#\2\2TU\7?\2\2U\16\3\2\2\2VW\7G\2\2WX\7s\2\2XY\7w\2\2YZ\7c\2\2Z"+
		"[\7n\2\2[\\\7u\2\2\\\20\3\2\2\2]^\7P\2\2^_\7q\2\2_`\7v\2\2`a\7G\2\2ab"+
		"\7s\2\2bc\7w\2\2cd\7c\2\2de\7n\2\2ef\7u\2\2f\22\3\2\2\2gh\7K\2\2hi\7p"+
		"\2\2i\24\3\2\2\2jk\7P\2\2kl\7q\2\2lm\7v\2\2mn\7K\2\2no\7p\2\2o\26\3\2"+
		"\2\2pq\7D\2\2qr\7g\2\2rs\7i\2\2st\7k\2\2tu\7p\2\2uv\7u\2\2vw\7Y\2\2wx"+
		"\7k\2\2xy\7v\2\2yz\7j\2\2z\30\3\2\2\2{|\7G\2\2|}\7p\2\2}~\7f\2\2~\177"+
		"\7u\2\2\177\u0080\7Y\2\2\u0080\u0081\7k\2\2\u0081\u0082\7v\2\2\u0082\u0083"+
		"\7j\2\2\u0083\32\3\2\2\2\u0084\u0085\7E\2\2\u0085\u0086\7q\2\2\u0086\u0087"+
		"\7p\2\2\u0087\u0088\7v\2\2\u0088\u0089\7c\2\2\u0089\u008a\7k\2\2\u008a"+
		"\u008b\7p\2\2\u008b\u008c\7u\2\2\u008c\34\3\2\2\2\u008d\u008e\7@\2\2\u008e"+
		"\36\3\2\2\2\u008f\u0090\7@\2\2\u0090\u0091\7?\2\2\u0091 \3\2\2\2\u0092"+
		"\u0093\7I\2\2\u0093\u0094\7t\2\2\u0094\u0095\7g\2\2\u0095\u0096\7c\2\2"+
		"\u0096\u0097\7v\2\2\u0097\u0098\7g\2\2\u0098\u0099\7t\2\2\u0099\u009a"+
		"\7V\2\2\u009a\u009b\7j\2\2\u009b\u009c\7c\2\2\u009c\u009d\7p\2\2\u009d"+
		"\"\3\2\2\2\u009e\u009f\7I\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7g\2\2\u00a1"+
		"\u00a2\7c\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7t\2\2"+
		"\u00a5\u00a6\7V\2\2\u00a6\u00a7\7j\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9"+
		"\7p\2\2\u00a9\u00aa\7Q\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7G\2\2\u00ac"+
		"\u00ad\7s\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7n\2\2"+
		"\u00b0$\3\2\2\2\u00b1\u00b2\7>\2\2\u00b2&\3\2\2\2\u00b3\u00b4\7>\2\2\u00b4"+
		"\u00b5\7?\2\2\u00b5(\3\2\2\2\u00b6\u00b7\7N\2\2\u00b7\u00b8\7g\2\2\u00b8"+
		"\u00b9\7u\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7V\2\2\u00bb\u00bc\7j\2\2"+
		"\u00bc\u00bd\7c\2\2\u00bd\u00be\7p\2\2\u00be*\3\2\2\2\u00bf\u00c0\7N\2"+
		"\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4"+
		"\7V\2\2\u00c4\u00c5\7j\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7p\2\2\u00c7"+
		"\u00c8\7Q\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7G\2\2\u00ca\u00cb\7s\2\2"+
		"\u00cb\u00cc\7w\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7n\2\2\u00ce,\3\2\2"+
		"\2\u00cf\u00d0\7D\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3"+
		"\7q\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7g\2\2\u00d5.\3\2\2\2\u00d6\u00d7"+
		"\7Q\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7Q\2\2\u00d9\u00da\7t\2\2\u00da"+
		"\u00db\7D\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7h\2\2\u00dd\u00de\7q\2\2"+
		"\u00de\u00df\7t\2\2\u00df\u00e0\7g\2\2\u00e0\60\3\2\2\2\u00e1\u00e2\7"+
		"C\2\2\u00e2\u00e3\7h\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6"+
		"\7t\2\2\u00e6\62\3\2\2\2\u00e7\u00e8\7Q\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea"+
		"\7Q\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7C\2\2\u00ec\u00ed\7h\2\2\u00ed"+
		"\u00ee\7v\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7t\2\2\u00f0\64\3\2\2\2\u00f1"+
		"\u00f2\7v\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7w\2\2\u00f4\u00f5\7g\2\2"+
		"\u00f5\66\3\2\2\2\u00f6\u00f7\7h\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7"+
		"n\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb\7g\2\2\u00fb8\3\2\2\2\u00fc\u00fd"+
		"\7c\2\2\u00fd\u00fe\7p\2\2\u00fe\u0103\7f\2\2\u00ff\u0100\7C\2\2\u0100"+
		"\u0101\7P\2\2\u0101\u0103\7F\2\2\u0102\u00fc\3\2\2\2\u0102\u00ff\3\2\2"+
		"\2\u0103:\3\2\2\2\u0104\u0105\7q\2\2\u0105\u0109\7t\2\2\u0106\u0107\7"+
		"Q\2\2\u0107\u0109\7T\2\2\u0108\u0104\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"<\3\2\2\2\u010a\u010e\t\2\2\2\u010b\u010d\t\3\2\2\u010c\u010b\3\2\2\2"+
		"\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f>\3"+
		"\2\2\2\u0110\u010e\3\2\2\2\u0111\u0113\t\4\2\2\u0112\u0111\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115@\3\2\2\2"+
		"\u0116\u0118\t\4\2\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011f\7\60\2\2"+
		"\u011c\u011e\t\4\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0129\3\2\2\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0124\7\60\2\2\u0123\u0125\t\4\2\2\u0124\u0123\3\2\2\2\u0125\u0126\3"+
		"\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128"+
		"\u0117\3\2\2\2\u0128\u0122\3\2\2\2\u0129B\3\2\2\2\u012a\u0130\7$\2\2\u012b"+
		"\u012f\n\5\2\2\u012c\u012d\7$\2\2\u012d\u012f\7$\2\2\u012e\u012b\3\2\2"+
		"\2\u012e\u012c\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u013f\7$\2\2\u0134"+
		"\u013a\7)\2\2\u0135\u0139\n\5\2\2\u0136\u0137\7)\2\2\u0137\u0139\7)\2"+
		"\2\u0138\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d"+
		"\u013f\7)\2\2\u013e\u012a\3\2\2\2\u013e\u0134\3\2\2\2\u013fD\3\2\2\2\u0140"+
		"\u0141\t\6\2\2\u0141\u0142\3\2\2\2\u0142\u0143\b#\2\2\u0143F\3\2\2\2\20"+
		"\2\u0102\u0108\u010e\u0114\u0119\u011f\u0126\u0128\u012e\u0130\u0138\u013a"+
		"\u013e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}