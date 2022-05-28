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
		T__9=10, NUM=11, VAR=12, MES=13, MENYS=14, MUL=15, DIV=16, MOD=17, EQ=18, 
		NEQ=19, LT=20, GT=21, LEQ=22, GEQ=23, COMMENT=24, STR=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "NUM", "VAR", "MES", "MENYS", "MUL", "DIV", "MOD", "EQ", "NEQ", 
			"LT", "GT", "LEQ", "GEQ", "COMMENT", "STR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'<-'", "'<?>'", "'<!>'", "'if'", "'|:'", "':|'", 
			"'else'", "'while'", null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", 
			"'/='", "'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "NUM", 
			"VAR", "MES", "MENYS", "MUL", "DIV", "MOD", "EQ", "NEQ", "LT", "GT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\6\f\\\n\f\r\f\16\f]\3\r\3\r\7\rb"+
		"\n\r\f\r\16\re\13\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\7\31\u0086\n\31\f\31\16\31\u0089\13"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\7\32\u0093\n\32\f\32\16\32"+
		"\u0096\13\32\3\32\3\32\3\33\6\33\u009b\n\33\r\33\16\33\u009c\3\33\3\33"+
		"\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\3\2\b"+
		"\3\2\62;\3\2c|\6\2\62;C\\aac|\4\2\f\f\17\17\3\2$$\4\2\f\f\"\"\2\u00a4"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7;\3"+
		"\2\2\2\t>\3\2\2\2\13B\3\2\2\2\rF\3\2\2\2\17I\3\2\2\2\21L\3\2\2\2\23O\3"+
		"\2\2\2\25T\3\2\2\2\27[\3\2\2\2\31_\3\2\2\2\33f\3\2\2\2\35h\3\2\2\2\37"+
		"j\3\2\2\2!l\3\2\2\2#n\3\2\2\2%p\3\2\2\2\'s\3\2\2\2)v\3\2\2\2+x\3\2\2\2"+
		"-z\3\2\2\2/}\3\2\2\2\61\u0080\3\2\2\2\63\u0090\3\2\2\2\65\u009a\3\2\2"+
		"\2\678\7*\2\28\4\3\2\2\29:\7+\2\2:\6\3\2\2\2;<\7>\2\2<=\7/\2\2=\b\3\2"+
		"\2\2>?\7>\2\2?@\7A\2\2@A\7@\2\2A\n\3\2\2\2BC\7>\2\2CD\7#\2\2DE\7@\2\2"+
		"E\f\3\2\2\2FG\7k\2\2GH\7h\2\2H\16\3\2\2\2IJ\7~\2\2JK\7<\2\2K\20\3\2\2"+
		"\2LM\7<\2\2MN\7~\2\2N\22\3\2\2\2OP\7g\2\2PQ\7n\2\2QR\7u\2\2RS\7g\2\2S"+
		"\24\3\2\2\2TU\7y\2\2UV\7j\2\2VW\7k\2\2WX\7n\2\2XY\7g\2\2Y\26\3\2\2\2Z"+
		"\\\t\2\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^\30\3\2\2\2_c\t\3"+
		"\2\2`b\t\4\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\32\3\2\2\2ec\3"+
		"\2\2\2fg\7-\2\2g\34\3\2\2\2hi\7/\2\2i\36\3\2\2\2jk\7,\2\2k \3\2\2\2lm"+
		"\7\61\2\2m\"\3\2\2\2no\7\'\2\2o$\3\2\2\2pq\7?\2\2qr\7?\2\2r&\3\2\2\2s"+
		"t\7\61\2\2tu\7?\2\2u(\3\2\2\2vw\7>\2\2w*\3\2\2\2xy\7@\2\2y,\3\2\2\2z{"+
		"\7>\2\2{|\7?\2\2|.\3\2\2\2}~\7@\2\2~\177\7?\2\2\177\60\3\2\2\2\u0080\u0081"+
		"\7\u0080\2\2\u0081\u0082\7\u0080\2\2\u0082\u0083\7\u0080\2\2\u0083\u0087"+
		"\3\2\2\2\u0084\u0086\n\5\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u008a\u008b\7\u0080\2\2\u008b\u008c\7\u0080\2\2\u008c\u008d\7\u0080"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u008f\b\31\2\2\u008f\62\3\2\2\2\u0090\u0094"+
		"\7$\2\2\u0091\u0093\n\6\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0097\u0098\7$\2\2\u0098\64\3\2\2\2\u0099\u009b\t\7\2\2\u009a\u0099"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\b\33\2\2\u009f\66\3\2\2\2\b\2]c\u0087\u0094"+
		"\u009c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}