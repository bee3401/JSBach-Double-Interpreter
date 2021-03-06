// Generated from /Users/beaadc/Documents/GitHub/JSBach-Double-Interpreter/jsbach.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jsbachLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, KEY=19, NUM=20, VAR=21, METHOD_NAME=22, MES=23, MENYS=24, MUL=25, 
		DIV=26, MOD=27, EQ=28, NEQ=29, LT=30, GT=31, LEQ=32, GEQ=33, COMMENT=34, 
		STR=35, WS=36, ALL=37;
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
			"T__17", "KEY", "NUM", "VAR", "METHOD_NAME", "MES", "MENYS", "MUL", "DIV", 
			"MOD", "EQ", "NEQ", "LT", "GT", "LEQ", "GEQ", "COMMENT", "STR", "WS", 
			"ALL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'|:'", "':|'", "'('", "')'", "'<-'", "'<?>'", "'<!>'", "'<:>'", 
			"'{'", "'}'", "'if'", "'else'", "'while'", "'#'", "'['", "']'", "'<<'", 
			"'8<'", null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'='", 
			"'/='", "'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "KEY", "NUM", "VAR", "METHOD_NAME", 
			"MES", "MENYS", "MUL", "DIV", "MOD", "EQ", "NEQ", "LT", "GT", "LEQ", 
			"GEQ", "COMMENT", "STR", "WS", "ALL"
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


	public jsbachLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "jsbach.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00d7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24"+
		"\3\24\5\24\u0087\n\24\3\25\6\25\u008a\n\25\r\25\16\25\u008b\3\26\3\26"+
		"\7\26\u0090\n\26\f\26\16\26\u0093\13\26\3\27\3\27\7\27\u0097\n\27\f\27"+
		"\16\27\u009a\13\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#"+
		"\3#\3#\7#\u00ba\n#\f#\16#\u00bd\13#\3#\3#\3#\3#\3#\3#\3$\3$\7$\u00c7\n"+
		"$\f$\16$\u00ca\13$\3$\3$\3%\6%\u00cf\n%\r%\16%\u00d0\3%\3%\3&\5&\u00d6"+
		"\n&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\f\3\2CI\3\2\62:\3\2\62;\3\2c|\6\2\62"+
		";C\\aac|\3\2C\\\4\2\f\f\17\17\3\2$$\4\2\f\f\"\"\24\2\62;C\\aac|\u00c2"+
		"\u00c5\u00c9\u00c9\u00cb\u00cc\u00cf\u00cf\u00d5\u00d7\u00dc\u00dc\u00de"+
		"\u00de\u00e2\u00e5\u00e9\u00e9\u00eb\u00ec\u00ef\u00ef\u00f5\u00f7\u00fc"+
		"\u00fc\u00fe\u00fe\2\u00dd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5P\3\2\2\2"+
		"\7S\3\2\2\2\tU\3\2\2\2\13W\3\2\2\2\rZ\3\2\2\2\17^\3\2\2\2\21b\3\2\2\2"+
		"\23f\3\2\2\2\25h\3\2\2\2\27j\3\2\2\2\31m\3\2\2\2\33r\3\2\2\2\35x\3\2\2"+
		"\2\37z\3\2\2\2!|\3\2\2\2#~\3\2\2\2%\u0081\3\2\2\2\'\u0084\3\2\2\2)\u0089"+
		"\3\2\2\2+\u008d\3\2\2\2-\u0094\3\2\2\2/\u009b\3\2\2\2\61\u009d\3\2\2\2"+
		"\63\u009f\3\2\2\2\65\u00a1\3\2\2\2\67\u00a3\3\2\2\29\u00a5\3\2\2\2;\u00a7"+
		"\3\2\2\2=\u00aa\3\2\2\2?\u00ac\3\2\2\2A\u00ae\3\2\2\2C\u00b1\3\2\2\2E"+
		"\u00b4\3\2\2\2G\u00c4\3\2\2\2I\u00ce\3\2\2\2K\u00d5\3\2\2\2MN\7~\2\2N"+
		"O\7<\2\2O\4\3\2\2\2PQ\7<\2\2QR\7~\2\2R\6\3\2\2\2ST\7*\2\2T\b\3\2\2\2U"+
		"V\7+\2\2V\n\3\2\2\2WX\7>\2\2XY\7/\2\2Y\f\3\2\2\2Z[\7>\2\2[\\\7A\2\2\\"+
		"]\7@\2\2]\16\3\2\2\2^_\7>\2\2_`\7#\2\2`a\7@\2\2a\20\3\2\2\2bc\7>\2\2c"+
		"d\7<\2\2de\7@\2\2e\22\3\2\2\2fg\7}\2\2g\24\3\2\2\2hi\7\177\2\2i\26\3\2"+
		"\2\2jk\7k\2\2kl\7h\2\2l\30\3\2\2\2mn\7g\2\2no\7n\2\2op\7u\2\2pq\7g\2\2"+
		"q\32\3\2\2\2rs\7y\2\2st\7j\2\2tu\7k\2\2uv\7n\2\2vw\7g\2\2w\34\3\2\2\2"+
		"xy\7%\2\2y\36\3\2\2\2z{\7]\2\2{ \3\2\2\2|}\7_\2\2}\"\3\2\2\2~\177\7>\2"+
		"\2\177\u0080\7>\2\2\u0080$\3\2\2\2\u0081\u0082\7:\2\2\u0082\u0083\7>\2"+
		"\2\u0083&\3\2\2\2\u0084\u0086\t\2\2\2\u0085\u0087\t\3\2\2\u0086\u0085"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087(\3\2\2\2\u0088\u008a\t\4\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c*\3\2\2\2\u008d\u0091\t\5\2\2\u008e\u0090\t\6\2\2\u008f\u008e"+
		"\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		",\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0098\t\7\2\2\u0095\u0097\5K&\2\u0096"+
		"\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099.\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7-\2\2\u009c\60\3"+
		"\2\2\2\u009d\u009e\7/\2\2\u009e\62\3\2\2\2\u009f\u00a0\7,\2\2\u00a0\64"+
		"\3\2\2\2\u00a1\u00a2\7\61\2\2\u00a2\66\3\2\2\2\u00a3\u00a4\7\'\2\2\u00a4"+
		"8\3\2\2\2\u00a5\u00a6\7?\2\2\u00a6:\3\2\2\2\u00a7\u00a8\7\61\2\2\u00a8"+
		"\u00a9\7?\2\2\u00a9<\3\2\2\2\u00aa\u00ab\7>\2\2\u00ab>\3\2\2\2\u00ac\u00ad"+
		"\7@\2\2\u00ad@\3\2\2\2\u00ae\u00af\7>\2\2\u00af\u00b0\7?\2\2\u00b0B\3"+
		"\2\2\2\u00b1\u00b2\7@\2\2\u00b2\u00b3\7?\2\2\u00b3D\3\2\2\2\u00b4\u00b5"+
		"\7\u0080\2\2\u00b5\u00b6\7\u0080\2\2\u00b6\u00b7\7\u0080\2\2\u00b7\u00bb"+
		"\3\2\2\2\u00b8\u00ba\n\b\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00be\u00bf\7\u0080\2\2\u00bf\u00c0\7\u0080\2\2\u00c0\u00c1\7\u0080"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\b#\2\2\u00c3F\3\2\2\2\u00c4\u00c8"+
		"\7$\2\2\u00c5\u00c7\n\t\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00cb\u00cc\7$\2\2\u00ccH\3\2\2\2\u00cd\u00cf\t\n\2\2\u00ce\u00cd"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d3\b%\2\2\u00d3J\3\2\2\2\u00d4\u00d6\t\13\2\2"+
		"\u00d5\u00d4\3\2\2\2\u00d6L\3\2\2\2\13\2\u0086\u008b\u0091\u0098\u00bb"+
		"\u00c8\u00d0\u00d5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}