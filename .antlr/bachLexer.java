// Generated from /Users/beaadc/Documents/GitHub/JSBach-Double-Interpreter/bach.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bachLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, KEY=8, NUM=9, 
		VAR=10, PROC=11, MES=12, MENYS=13, MUL=14, DIV=15, MOD=16, EQ=17, NEQ=18, 
		LT=19, GT=20, LEQ=21, GEQ=22, COMMENT=23, STR=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "KEY", "NUM", 
			"VAR", "PROC", "MES", "MENYS", "MUL", "DIV", "MOD", "EQ", "NEQ", "LT", 
			"GT", "LEQ", "GEQ", "COMMENT", "STR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'|:'", "':|'", "'if'", "'while'", "'<-'", "'<?>'", "'<!>'", null, 
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'/='", "'<'", 
			"'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "KEY", "NUM", "VAR", 
			"PROC", "MES", "MENYS", "MUL", "DIV", "MOD", "EQ", "NEQ", "LT", "GT", 
			"LEQ", "GEQ", "COMMENT", "STR", "WS"
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


	public bachLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "bach.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u009a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\7\13V\n\13\f\13\16\13Y\13\13\3\f\3\f\7\f]\n\f\f\f\16\f`\13\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\7\30\u0080\n\30\f\30\16\30\u0083\13\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\7\31\u008d\n\31\f\31\16\31\u0090\13\31\3\31\3\31\3\32"+
		"\6\32\u0095\n\32\r\32\16\32\u0096\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\3\2\n\3\2CI\3\2\62;\3\2c|\6\2\62;C\\a"+
		"ac|\3\2C\\\4\2\f\f\17\17\3\2$$\4\2\f\f\"\"\2\u009e\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\3\65\3\2\2\2\58\3\2\2\2\7;\3\2\2\2\t>\3\2\2\2\13D\3\2\2\2\rG\3"+
		"\2\2\2\17K\3\2\2\2\21O\3\2\2\2\23Q\3\2\2\2\25S\3\2\2\2\27Z\3\2\2\2\31"+
		"a\3\2\2\2\33c\3\2\2\2\35e\3\2\2\2\37g\3\2\2\2!i\3\2\2\2#k\3\2\2\2%m\3"+
		"\2\2\2\'p\3\2\2\2)r\3\2\2\2+t\3\2\2\2-w\3\2\2\2/z\3\2\2\2\61\u008a\3\2"+
		"\2\2\63\u0094\3\2\2\2\65\66\7~\2\2\66\67\7<\2\2\67\4\3\2\2\289\7<\2\2"+
		"9:\7~\2\2:\6\3\2\2\2;<\7k\2\2<=\7h\2\2=\b\3\2\2\2>?\7y\2\2?@\7j\2\2@A"+
		"\7k\2\2AB\7n\2\2BC\7g\2\2C\n\3\2\2\2DE\7>\2\2EF\7/\2\2F\f\3\2\2\2GH\7"+
		">\2\2HI\7A\2\2IJ\7@\2\2J\16\3\2\2\2KL\7>\2\2LM\7#\2\2MN\7@\2\2N\20\3\2"+
		"\2\2OP\t\2\2\2P\22\3\2\2\2QR\t\3\2\2R\24\3\2\2\2SW\t\4\2\2TV\t\5\2\2U"+
		"T\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\26\3\2\2\2YW\3\2\2\2Z^\t\6\2"+
		"\2[]\t\5\2\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\30\3\2\2\2`^\3"+
		"\2\2\2ab\7-\2\2b\32\3\2\2\2cd\7/\2\2d\34\3\2\2\2ef\7,\2\2f\36\3\2\2\2"+
		"gh\7\61\2\2h \3\2\2\2ij\7\'\2\2j\"\3\2\2\2kl\7?\2\2l$\3\2\2\2mn\7\61\2"+
		"\2no\7?\2\2o&\3\2\2\2pq\7>\2\2q(\3\2\2\2rs\7@\2\2s*\3\2\2\2tu\7>\2\2u"+
		"v\7?\2\2v,\3\2\2\2wx\7@\2\2xy\7?\2\2y.\3\2\2\2z{\7\u0080\2\2{|\7\u0080"+
		"\2\2|}\7\u0080\2\2}\u0081\3\2\2\2~\u0080\n\7\2\2\177~\3\2\2\2\u0080\u0083"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0085\7\u0080\2\2\u0085\u0086\7\u0080\2\2\u0086\u0087"+
		"\7\u0080\2\2\u0087\u0088\3\2\2\2\u0088\u0089\b\30\2\2\u0089\60\3\2\2\2"+
		"\u008a\u008e\7$\2\2\u008b\u008d\n\b\2\2\u008c\u008b\3\2\2\2\u008d\u0090"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0092\7$\2\2\u0092\62\3\2\2\2\u0093\u0095\t\t\2\2"+
		"\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\b\32\2\2\u0099\64\3\2\2\2\b\2"+
		"W^\u0081\u008e\u0096\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}