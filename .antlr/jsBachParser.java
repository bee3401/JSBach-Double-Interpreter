// Generated from /Users/beaadc/Documents/GitHub/JSBach-Double-Interpreter/jsBach.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jsBachParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, KEY=19, NUM=20, VAR=21, METHOD_NAME=22, MES=23, MENYS=24, MUL=25, 
		DIV=26, MOD=27, EQ=28, NEQ=29, LT=30, GT=31, LEQ=32, GEQ=33, COMMENT=34, 
		STR=35, WS=36, PROC=37;
	public static final int
		RULE_root = 0, RULE_f = 1, RULE_body = 2, RULE_if_block = 3, RULE_while_block = 4, 
		RULE_assig = 5, RULE_comments = 6, RULE_method_call = 7, RULE_expr = 8, 
		RULE_array = 9, RULE_numsNkeys = 10, RULE_getLength = 11, RULE_getElem = 12, 
		RULE_addElem = 13, RULE_rmElem = 14, RULE_read = 15, RULE_write = 16, 
		RULE_play = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "f", "body", "if_block", "while_block", "assig", "comments", 
			"method_call", "expr", "array", "numsNkeys", "getLength", "getElem", 
			"addElem", "rmElem", "read", "write", "play"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'|:'", "':|'", "'if'", "'while'", "'<-'", "'('", "')'", "'{'", 
			"'}'", "' '", "'#'", "'['", "']'", "'<<'", "'8<'", "'<?>'", "'<!>'", 
			"'<:>'", null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'='", 
			"'/='", "'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "KEY", "NUM", "VAR", "METHOD_NAME", 
			"MES", "MENYS", "MUL", "DIV", "MOD", "EQ", "NEQ", "LT", "GT", "LEQ", 
			"GEQ", "COMMENT", "STR", "WS", "PROC"
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

	@Override
	public String getGrammarFileName() { return "jsBach.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public jsBachParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode EOF() { return getToken(jsBachParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			f();
			setState(37);
			match(EOF);
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

	public static class FContext extends ParserRuleContext {
		public TerminalNode PROC() { return getToken(jsBachParser.PROC, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> VAR() { return getTokens(jsBachParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(jsBachParser.VAR, i);
		}
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_f);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(PROC);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(40);
				match(VAR);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			match(T__0);
			setState(47);
			body();
			setState(48);
			match(T__1);
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

	public static class BodyContext extends ParserRuleContext {
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public While_blockContext while_block() {
			return getRuleContext(While_blockContext.class,0);
		}
		public AssigContext assig() {
			return getRuleContext(AssigContext.class,0);
		}
		public CommentsContext comments() {
			return getRuleContext(CommentsContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				if_block();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				while_block();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				assig();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				comments();
				}
				break;
			case PROC:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				method_call();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				write();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 7);
				{
				setState(56);
				read();
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

	public static class If_blockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_if_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__2);
			setState(60);
			expr(0);
			setState(61);
			match(T__0);
			setState(62);
			body();
			setState(63);
			match(T__1);
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

	public static class While_blockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public While_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_block; }
	}

	public final While_blockContext while_block() throws RecognitionException {
		While_blockContext _localctx = new While_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_while_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__3);
			setState(66);
			expr(0);
			setState(67);
			match(T__0);
			setState(68);
			body();
			setState(69);
			match(T__1);
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

	public static class AssigContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(jsBachParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assig; }
	}

	public final AssigContext assig() throws RecognitionException {
		AssigContext _localctx = new AssigContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(VAR);
			setState(72);
			match(T__4);
			setState(73);
			expr(0);
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

	public static class CommentsContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(jsBachParser.COMMENT, 0); }
		public CommentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comments; }
	}

	public final CommentsContext comments() throws RecognitionException {
		CommentsContext _localctx = new CommentsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(COMMENT);
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

	public static class Method_callContext extends ParserRuleContext {
		public TerminalNode PROC() { return getToken(jsBachParser.PROC, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_method_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(PROC);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << NUM) | (1L << VAR))) != 0)) {
				{
				{
				setState(78);
				expr(0);
				}
				}
				setState(83);
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

	public static class ExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NUM() { return getToken(jsBachParser.NUM, 0); }
		public TerminalNode VAR() { return getToken(jsBachParser.VAR, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode EQ() { return getToken(jsBachParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(jsBachParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(jsBachParser.LT, 0); }
		public TerminalNode GT() { return getToken(jsBachParser.GT, 0); }
		public TerminalNode LEQ() { return getToken(jsBachParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(jsBachParser.GEQ, 0); }
		public TerminalNode MUL() { return getToken(jsBachParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(jsBachParser.DIV, 0); }
		public TerminalNode MES() { return getToken(jsBachParser.MES, 0); }
		public TerminalNode MENYS() { return getToken(jsBachParser.MENYS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(85);
				match(T__5);
				setState(86);
				expr(0);
				setState(87);
				match(T__6);
				}
				break;
			case NUM:
			case VAR:
				{
				setState(89);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__7:
				{
				setState(90);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(108);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(93);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(94);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << LT) | (1L << GT) | (1L << LEQ) | (1L << GEQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(95);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(97);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(100);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
							{
							setState(98);
							expr(0);
							}
							break;
						case 2:
							{
							setState(99);
							match(VAR);
							}
							break;
						}
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(103);
						_la = _input.LA(1);
						if ( !(_la==MES || _la==MENYS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(106);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
						case 1:
							{
							setState(104);
							expr(0);
							}
							break;
						case 2:
							{
							setState(105);
							match(VAR);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public NumsNkeysContext numsNkeys() {
			return getRuleContext(NumsNkeysContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_array);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(T__7);
				setState(114);
				numsNkeys();
				setState(115);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(T__7);
				setState(118);
				match(T__8);
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

	public static class NumsNkeysContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(jsBachParser.NUM, 0); }
		public TerminalNode VAR() { return getToken(jsBachParser.VAR, 0); }
		public List<NumsNkeysContext> numsNkeys() {
			return getRuleContexts(NumsNkeysContext.class);
		}
		public NumsNkeysContext numsNkeys(int i) {
			return getRuleContext(NumsNkeysContext.class,i);
		}
		public TerminalNode KEY() { return getToken(jsBachParser.KEY, 0); }
		public NumsNkeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numsNkeys; }
	}

	public final NumsNkeysContext numsNkeys() throws RecognitionException {
		NumsNkeysContext _localctx = new NumsNkeysContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_numsNkeys);
		int _la;
		try {
			int _alt;
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(122);
				match(T__9);
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(123);
						numsNkeys();
						}
						} 
					}
					setState(128);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case KEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(KEY);
				setState(130);
				match(T__9);
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(131);
						numsNkeys();
						}
						} 
					}
					setState(136);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
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

	public static class GetLengthContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(jsBachParser.VAR, 0); }
		public GetLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getLength; }
	}

	public final GetLengthContext getLength() throws RecognitionException {
		GetLengthContext _localctx = new GetLengthContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_getLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__10);
			setState(140);
			match(VAR);
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

	public static class GetElemContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(jsBachParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GetElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getElem; }
	}

	public final GetElemContext getElem() throws RecognitionException {
		GetElemContext _localctx = new GetElemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_getElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(VAR);
			setState(143);
			match(T__11);
			setState(144);
			expr(0);
			setState(145);
			match(T__12);
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

	public static class AddElemContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(jsBachParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(jsBachParser.VAR, i);
		}
		public AddElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addElem; }
	}

	public final AddElemContext addElem() throws RecognitionException {
		AddElemContext _localctx = new AddElemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_addElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(VAR);
			setState(148);
			match(T__13);
			setState(149);
			match(VAR);
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

	public static class RmElemContext extends ParserRuleContext {
		public GetElemContext getElem() {
			return getRuleContext(GetElemContext.class,0);
		}
		public RmElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rmElem; }
	}

	public final RmElemContext rmElem() throws RecognitionException {
		RmElemContext _localctx = new RmElemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_rmElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__14);
			setState(152);
			getElem();
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(jsBachParser.VAR, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__15);
			setState(155);
			match(VAR);
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

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(jsBachParser.STR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_write);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(T__16);
				setState(158);
				match(STR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(T__16);
				setState(160);
				expr(0);
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

	public static class PlayContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(jsBachParser.KEY, 0); }
		public NumsNkeysContext numsNkeys() {
			return getRuleContext(NumsNkeysContext.class,0);
		}
		public PlayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_play; }
	}

	public final PlayContext play() throws RecognitionException {
		PlayContext _localctx = new PlayContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_play);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(T__17);
				setState(164);
				match(KEY);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(T__16);
				setState(166);
				numsNkeys();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00ac\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\7\tR\n\t\f\t\16\tU\13"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n^\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\ng\n\n\3\n\3\n\3\n\3\n\5\nm\n\n\7\no\n\n\f\n\16\nr\13\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13z\n\13\3\f\3\f\3\f\7\f\177\n\f\f\f\16\f\u0082\13\f"+
		"\3\f\3\f\3\f\7\f\u0087\n\f\f\f\16\f\u008a\13\f\5\f\u008c\n\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\5\22\u00a4\n\22\3\23\3\23\3\23\3\23\5\23"+
		"\u00aa\n\23\3\23\2\3\22\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"\2\6\3\2\26\27\3\2\36#\3\2\33\34\3\2\31\32\2\u00ae\2&\3\2\2\2\4)\3\2\2"+
		"\2\6;\3\2\2\2\b=\3\2\2\2\nC\3\2\2\2\fI\3\2\2\2\16M\3\2\2\2\20O\3\2\2\2"+
		"\22]\3\2\2\2\24y\3\2\2\2\26\u008b\3\2\2\2\30\u008d\3\2\2\2\32\u0090\3"+
		"\2\2\2\34\u0095\3\2\2\2\36\u0099\3\2\2\2 \u009c\3\2\2\2\"\u00a3\3\2\2"+
		"\2$\u00a9\3\2\2\2&\'\5\4\3\2\'(\7\2\2\3(\3\3\2\2\2)-\7\'\2\2*,\7\27\2"+
		"\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61"+
		"\7\3\2\2\61\62\5\6\4\2\62\63\7\4\2\2\63\5\3\2\2\2\64<\5\b\5\2\65<\5\n"+
		"\6\2\66<\5\f\7\2\67<\5\16\b\28<\5\20\t\29<\5\"\22\2:<\5 \21\2;\64\3\2"+
		"\2\2;\65\3\2\2\2;\66\3\2\2\2;\67\3\2\2\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2"+
		"<\7\3\2\2\2=>\7\5\2\2>?\5\22\n\2?@\7\3\2\2@A\5\6\4\2AB\7\4\2\2B\t\3\2"+
		"\2\2CD\7\6\2\2DE\5\22\n\2EF\7\3\2\2FG\5\6\4\2GH\7\4\2\2H\13\3\2\2\2IJ"+
		"\7\27\2\2JK\7\7\2\2KL\5\22\n\2L\r\3\2\2\2MN\7$\2\2N\17\3\2\2\2OS\7\'\2"+
		"\2PR\5\22\n\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\21\3\2\2\2US\3"+
		"\2\2\2VW\b\n\1\2WX\7\b\2\2XY\5\22\n\2YZ\7\t\2\2Z^\3\2\2\2[^\t\2\2\2\\"+
		"^\5\24\13\2]V\3\2\2\2][\3\2\2\2]\\\3\2\2\2^p\3\2\2\2_`\f\7\2\2`a\t\3\2"+
		"\2ao\5\22\n\bbc\f\6\2\2cf\t\4\2\2dg\5\22\n\2eg\7\27\2\2fd\3\2\2\2fe\3"+
		"\2\2\2go\3\2\2\2hi\f\5\2\2il\t\5\2\2jm\5\22\n\2km\7\27\2\2lj\3\2\2\2l"+
		"k\3\2\2\2mo\3\2\2\2n_\3\2\2\2nb\3\2\2\2nh\3\2\2\2or\3\2\2\2pn\3\2\2\2"+
		"pq\3\2\2\2q\23\3\2\2\2rp\3\2\2\2st\7\n\2\2tu\5\26\f\2uv\7\13\2\2vz\3\2"+
		"\2\2wx\7\n\2\2xz\7\13\2\2ys\3\2\2\2yw\3\2\2\2z\25\3\2\2\2{|\t\2\2\2|\u0080"+
		"\7\f\2\2}\177\5\26\f\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u008c\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\25"+
		"\2\2\u0084\u0088\7\f\2\2\u0085\u0087\5\26\f\2\u0086\u0085\3\2\2\2\u0087"+
		"\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008c\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008b{\3\2\2\2\u008b\u0083\3\2\2\2\u008c\27\3"+
		"\2\2\2\u008d\u008e\7\r\2\2\u008e\u008f\7\27\2\2\u008f\31\3\2\2\2\u0090"+
		"\u0091\7\27\2\2\u0091\u0092\7\16\2\2\u0092\u0093\5\22\n\2\u0093\u0094"+
		"\7\17\2\2\u0094\33\3\2\2\2\u0095\u0096\7\27\2\2\u0096\u0097\7\20\2\2\u0097"+
		"\u0098\7\27\2\2\u0098\35\3\2\2\2\u0099\u009a\7\21\2\2\u009a\u009b\5\32"+
		"\16\2\u009b\37\3\2\2\2\u009c\u009d\7\22\2\2\u009d\u009e\7\27\2\2\u009e"+
		"!\3\2\2\2\u009f\u00a0\7\23\2\2\u00a0\u00a4\7%\2\2\u00a1\u00a2\7\23\2\2"+
		"\u00a2\u00a4\5\22\n\2\u00a3\u009f\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4#\3"+
		"\2\2\2\u00a5\u00a6\7\24\2\2\u00a6\u00aa\7\25\2\2\u00a7\u00a8\7\23\2\2"+
		"\u00a8\u00aa\5\26\f\2\u00a9\u00a5\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa%\3"+
		"\2\2\2\20-;S]flnpy\u0080\u0088\u008b\u00a3\u00a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}