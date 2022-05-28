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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, NUM=6, VAR=7, MES=8, MENYS=9, 
		MUL=10, DIV=11, MOD=12, EQ=13, NEQ=14, LT=15, GT=16, LEQ=17, GEQ=18, COMMENT=19, 
		STR=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "NUM", "VAR", "MES", "MENYS", 
			"MUL", "DIV", "MOD", "EQ", "NEQ", "LT", "GT", "LEQ", "GEQ", "COMMENT", 
			"STR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'<-'", "'<?>'", "'<!>'", null, null, "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'=='", "'/='", "'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "NUM", "VAR", "MES", "MENYS", "MUL", 
			"DIV", "MOD", "EQ", "NEQ", "LT", "GT", "LEQ", "GEQ", "COMMENT", "STR", 
			"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0082\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\6\7>\n\7\r\7\16\7?\3\b\3\b\7"+
		"\bD\n\b\f\b\16\bG\13\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\7\24h\n\24\f\24\16\24k\13\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\7\25u\n\25\f\25\16\25x\13\25\3\25\3\25"+
		"\3\26\6\26}\n\26\r\26\16\26~\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27\3\2\b\3\2\62;\3\2c|\6\2\62;C\\aac|\4\2\f\f\17\17\3\2$$\4\2\f\f\""+
		"\"\2\u0086\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2"+
		"\5/\3\2\2\2\7\61\3\2\2\2\t\64\3\2\2\2\138\3\2\2\2\r=\3\2\2\2\17A\3\2\2"+
		"\2\21H\3\2\2\2\23J\3\2\2\2\25L\3\2\2\2\27N\3\2\2\2\31P\3\2\2\2\33R\3\2"+
		"\2\2\35U\3\2\2\2\37X\3\2\2\2!Z\3\2\2\2#\\\3\2\2\2%_\3\2\2\2\'b\3\2\2\2"+
		")r\3\2\2\2+|\3\2\2\2-.\7*\2\2.\4\3\2\2\2/\60\7+\2\2\60\6\3\2\2\2\61\62"+
		"\7>\2\2\62\63\7/\2\2\63\b\3\2\2\2\64\65\7>\2\2\65\66\7A\2\2\66\67\7@\2"+
		"\2\67\n\3\2\2\289\7>\2\29:\7#\2\2:;\7@\2\2;\f\3\2\2\2<>\t\2\2\2=<\3\2"+
		"\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\16\3\2\2\2AE\t\3\2\2BD\t\4\2\2CB\3"+
		"\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\20\3\2\2\2GE\3\2\2\2HI\7-\2\2I\22"+
		"\3\2\2\2JK\7/\2\2K\24\3\2\2\2LM\7,\2\2M\26\3\2\2\2NO\7\61\2\2O\30\3\2"+
		"\2\2PQ\7\'\2\2Q\32\3\2\2\2RS\7?\2\2ST\7?\2\2T\34\3\2\2\2UV\7\61\2\2VW"+
		"\7?\2\2W\36\3\2\2\2XY\7>\2\2Y \3\2\2\2Z[\7@\2\2[\"\3\2\2\2\\]\7>\2\2]"+
		"^\7?\2\2^$\3\2\2\2_`\7@\2\2`a\7?\2\2a&\3\2\2\2bc\7\u0080\2\2cd\7\u0080"+
		"\2\2de\7\u0080\2\2ei\3\2\2\2fh\n\5\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2i"+
		"j\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\u0080\2\2mn\7\u0080\2\2no\7\u0080\2"+
		"\2op\3\2\2\2pq\b\24\2\2q(\3\2\2\2rv\7$\2\2su\n\6\2\2ts\3\2\2\2ux\3\2\2"+
		"\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7$\2\2z*\3\2\2\2{}\t\7\2"+
		"\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\b\26\2\2\u0081,\3\2\2\2\b\2?Eiv~\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}