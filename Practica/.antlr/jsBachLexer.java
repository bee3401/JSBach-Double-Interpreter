// Generated from /Users/beaadc/Documents/GitHub/JSBach-Double-Interpreter/Practica/jsBach.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jsBachLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		KEY=18, NUM=19, VAR=20, METHOD_NAME=21, MES=22, MENYS=23, MUL=24, DIV=25, 
		MOD=26, EQ=27, NEQ=28, LT=29, GT=30, LEQ=31, GEQ=32, COMMENT=33, STR=34, 
		WS=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"KEY", "NUM", "VAR", "METHOD_NAME", "MES", "MENYS", "MUL", "DIV", "MOD", 
			"EQ", "NEQ", "LT", "GT", "LEQ", "GEQ", "COMMENT", "STR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'|:'", "':|'", "'('", "')'", "'<-'", "'<?>'", "'<!>'", "'if'", 
			"'else'", "'while'", "'{'", "'}'", "'#'", "'['", "']'", "'<<'", "'8<'", 
			null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'/='", 
			"'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "KEY", "NUM", "VAR", "METHOD_NAME", 
			"MES", "MENYS", "MUL", "DIV", "MOD", "EQ", "NEQ", "LT", "GT", "LEQ", 
			"GEQ", "COMMENT", "STR", "WS"
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


	public jsBachLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "jsBach.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00cb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\6\24\u0080\n\24\r\24"+
		"\16\24\u0081\3\25\3\25\7\25\u0086\n\25\f\25\16\25\u0089\13\25\3\26\3\26"+
		"\7\26\u008d\n\26\f\26\16\26\u0090\13\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\7\"\u00b1\n\"\f\"\16\"\u00b4\13"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\7#\u00be\n#\f#\16#\u00c1\13#\3#\3#\3"+
		"$\6$\u00c6\n$\r$\16$\u00c7\3$\3$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\n\3\2CI\3\2\62;"+
		"\3\2c|\6\2\62;C\\aac|\3\2C\\\4\2\f\f\17\17\3\2$$\4\2\f\f\"\"\2\u00d0\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\3I\3\2\2\2\5L\3\2\2\2\7O\3\2\2\2\tQ\3\2\2\2\13S\3\2\2\2\rV\3\2\2\2\17"+
		"Z\3\2\2\2\21^\3\2\2\2\23a\3\2\2\2\25f\3\2\2\2\27l\3\2\2\2\31n\3\2\2\2"+
		"\33p\3\2\2\2\35r\3\2\2\2\37t\3\2\2\2!v\3\2\2\2#y\3\2\2\2%|\3\2\2\2\'\177"+
		"\3\2\2\2)\u0083\3\2\2\2+\u008a\3\2\2\2-\u0091\3\2\2\2/\u0093\3\2\2\2\61"+
		"\u0095\3\2\2\2\63\u0097\3\2\2\2\65\u0099\3\2\2\2\67\u009b\3\2\2\29\u009e"+
		"\3\2\2\2;\u00a1\3\2\2\2=\u00a3\3\2\2\2?\u00a5\3\2\2\2A\u00a8\3\2\2\2C"+
		"\u00ab\3\2\2\2E\u00bb\3\2\2\2G\u00c5\3\2\2\2IJ\7~\2\2JK\7<\2\2K\4\3\2"+
		"\2\2LM\7<\2\2MN\7~\2\2N\6\3\2\2\2OP\7*\2\2P\b\3\2\2\2QR\7+\2\2R\n\3\2"+
		"\2\2ST\7>\2\2TU\7/\2\2U\f\3\2\2\2VW\7>\2\2WX\7A\2\2XY\7@\2\2Y\16\3\2\2"+
		"\2Z[\7>\2\2[\\\7#\2\2\\]\7@\2\2]\20\3\2\2\2^_\7k\2\2_`\7h\2\2`\22\3\2"+
		"\2\2ab\7g\2\2bc\7n\2\2cd\7u\2\2de\7g\2\2e\24\3\2\2\2fg\7y\2\2gh\7j\2\2"+
		"hi\7k\2\2ij\7n\2\2jk\7g\2\2k\26\3\2\2\2lm\7}\2\2m\30\3\2\2\2no\7\177\2"+
		"\2o\32\3\2\2\2pq\7%\2\2q\34\3\2\2\2rs\7]\2\2s\36\3\2\2\2tu\7_\2\2u \3"+
		"\2\2\2vw\7>\2\2wx\7>\2\2x\"\3\2\2\2yz\7:\2\2z{\7>\2\2{$\3\2\2\2|}\t\2"+
		"\2\2}&\3\2\2\2~\u0080\t\3\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082(\3\2\2\2\u0083\u0087\t\4\2\2\u0084"+
		"\u0086\t\5\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088*\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008e"+
		"\t\6\2\2\u008b\u008d\t\5\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f,\3\2\2\2\u0090\u008e\3\2\2\2"+
		"\u0091\u0092\7-\2\2\u0092.\3\2\2\2\u0093\u0094\7/\2\2\u0094\60\3\2\2\2"+
		"\u0095\u0096\7,\2\2\u0096\62\3\2\2\2\u0097\u0098\7\61\2\2\u0098\64\3\2"+
		"\2\2\u0099\u009a\7\'\2\2\u009a\66\3\2\2\2\u009b\u009c\7?\2\2\u009c\u009d"+
		"\7?\2\2\u009d8\3\2\2\2\u009e\u009f\7\61\2\2\u009f\u00a0\7?\2\2\u00a0:"+
		"\3\2\2\2\u00a1\u00a2\7>\2\2\u00a2<\3\2\2\2\u00a3\u00a4\7@\2\2\u00a4>\3"+
		"\2\2\2\u00a5\u00a6\7>\2\2\u00a6\u00a7\7?\2\2\u00a7@\3\2\2\2\u00a8\u00a9"+
		"\7@\2\2\u00a9\u00aa\7?\2\2\u00aaB\3\2\2\2\u00ab\u00ac\7\u0080\2\2\u00ac"+
		"\u00ad\7\u0080\2\2\u00ad\u00ae\7\u0080\2\2\u00ae\u00b2\3\2\2\2\u00af\u00b1"+
		"\n\7\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\u0080"+
		"\2\2\u00b6\u00b7\7\u0080\2\2\u00b7\u00b8\7\u0080\2\2\u00b8\u00b9\3\2\2"+
		"\2\u00b9\u00ba\b\"\2\2\u00baD\3\2\2\2\u00bb\u00bf\7$\2\2\u00bc\u00be\n"+
		"\b\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7$"+
		"\2\2\u00c3F\3\2\2\2\u00c4\u00c6\t\t\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\b$\2\2\u00caH\3\2\2\2\t\2\u0081\u0087\u008e\u00b2\u00bf\u00c7\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}