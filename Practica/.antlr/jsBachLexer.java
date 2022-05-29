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
		KEY=18, NUM=19, VAR=20, MES=21, MENYS=22, MUL=23, DIV=24, MOD=25, EQ=26, 
		NEQ=27, LT=28, GT=29, LEQ=30, GEQ=31, COMMENT=32, STR=33, WS=34;
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
			"KEY", "NUM", "VAR", "MES", "MENYS", "MUL", "DIV", "MOD", "EQ", "NEQ", 
			"LT", "GT", "LEQ", "GEQ", "COMMENT", "STR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'<-'", "'<?>'", "'<!>'", "'if'", "'|:'", "':|'", 
			"'else'", "'while'", "'{'", "'}'", "'#'", "'['", "']'", "'<<'", "'8<'", 
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'/='", 
			"'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "KEY", "NUM", "VAR", "MES", "MENYS", 
			"MUL", "DIV", "MOD", "EQ", "NEQ", "LT", "GT", "LEQ", "GEQ", "COMMENT", 
			"STR", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00c2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\6\24~\n\24\r\24\16\24\177"+
		"\3\25\3\25\7\25\u0084\n\25\f\25\16\25\u0087\13\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\7!\u00a8\n!\f!\16!\u00ab"+
		"\13!\3!\3!\3!\3!\3!\3!\3\"\3\"\7\"\u00b5\n\"\f\"\16\"\u00b8\13\"\3\"\3"+
		"\"\3#\6#\u00bd\n#\r#\16#\u00be\3#\3#\2\2$\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$\3\2\t\3\2CI\3\2"+
		"\62;\3\2c|\6\2\62;C\\aac|\4\2\f\f\17\17\3\2$$\4\2\f\f\"\"\2\u00c6\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5"+
		"I\3\2\2\2\7K\3\2\2\2\tN\3\2\2\2\13R\3\2\2\2\rV\3\2\2\2\17Y\3\2\2\2\21"+
		"\\\3\2\2\2\23_\3\2\2\2\25d\3\2\2\2\27j\3\2\2\2\31l\3\2\2\2\33n\3\2\2\2"+
		"\35p\3\2\2\2\37r\3\2\2\2!t\3\2\2\2#w\3\2\2\2%z\3\2\2\2\'}\3\2\2\2)\u0081"+
		"\3\2\2\2+\u0088\3\2\2\2-\u008a\3\2\2\2/\u008c\3\2\2\2\61\u008e\3\2\2\2"+
		"\63\u0090\3\2\2\2\65\u0092\3\2\2\2\67\u0095\3\2\2\29\u0098\3\2\2\2;\u009a"+
		"\3\2\2\2=\u009c\3\2\2\2?\u009f\3\2\2\2A\u00a2\3\2\2\2C\u00b2\3\2\2\2E"+
		"\u00bc\3\2\2\2GH\7*\2\2H\4\3\2\2\2IJ\7+\2\2J\6\3\2\2\2KL\7>\2\2LM\7/\2"+
		"\2M\b\3\2\2\2NO\7>\2\2OP\7A\2\2PQ\7@\2\2Q\n\3\2\2\2RS\7>\2\2ST\7#\2\2"+
		"TU\7@\2\2U\f\3\2\2\2VW\7k\2\2WX\7h\2\2X\16\3\2\2\2YZ\7~\2\2Z[\7<\2\2["+
		"\20\3\2\2\2\\]\7<\2\2]^\7~\2\2^\22\3\2\2\2_`\7g\2\2`a\7n\2\2ab\7u\2\2"+
		"bc\7g\2\2c\24\3\2\2\2de\7y\2\2ef\7j\2\2fg\7k\2\2gh\7n\2\2hi\7g\2\2i\26"+
		"\3\2\2\2jk\7}\2\2k\30\3\2\2\2lm\7\177\2\2m\32\3\2\2\2no\7%\2\2o\34\3\2"+
		"\2\2pq\7]\2\2q\36\3\2\2\2rs\7_\2\2s \3\2\2\2tu\7>\2\2uv\7>\2\2v\"\3\2"+
		"\2\2wx\7:\2\2xy\7>\2\2y$\3\2\2\2z{\t\2\2\2{&\3\2\2\2|~\t\3\2\2}|\3\2\2"+
		"\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080(\3\2\2\2\u0081\u0085"+
		"\t\4\2\2\u0082\u0084\t\5\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086*\3\2\2\2\u0087\u0085\3\2\2\2"+
		"\u0088\u0089\7-\2\2\u0089,\3\2\2\2\u008a\u008b\7/\2\2\u008b.\3\2\2\2\u008c"+
		"\u008d\7,\2\2\u008d\60\3\2\2\2\u008e\u008f\7\61\2\2\u008f\62\3\2\2\2\u0090"+
		"\u0091\7\'\2\2\u0091\64\3\2\2\2\u0092\u0093\7?\2\2\u0093\u0094\7?\2\2"+
		"\u0094\66\3\2\2\2\u0095\u0096\7\61\2\2\u0096\u0097\7?\2\2\u00978\3\2\2"+
		"\2\u0098\u0099\7>\2\2\u0099:\3\2\2\2\u009a\u009b\7@\2\2\u009b<\3\2\2\2"+
		"\u009c\u009d\7>\2\2\u009d\u009e\7?\2\2\u009e>\3\2\2\2\u009f\u00a0\7@\2"+
		"\2\u00a0\u00a1\7?\2\2\u00a1@\3\2\2\2\u00a2\u00a3\7\u0080\2\2\u00a3\u00a4"+
		"\7\u0080\2\2\u00a4\u00a5\7\u0080\2\2\u00a5\u00a9\3\2\2\2\u00a6\u00a8\n"+
		"\6\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\u0080"+
		"\2\2\u00ad\u00ae\7\u0080\2\2\u00ae\u00af\7\u0080\2\2\u00af\u00b0\3\2\2"+
		"\2\u00b0\u00b1\b!\2\2\u00b1B\3\2\2\2\u00b2\u00b6\7$\2\2\u00b3\u00b5\n"+
		"\7\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7$"+
		"\2\2\u00baD\3\2\2\2\u00bb\u00bd\t\b\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c1\b#\2\2\u00c1F\3\2\2\2\b\2\177\u0085\u00a9\u00b6\u00be\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}