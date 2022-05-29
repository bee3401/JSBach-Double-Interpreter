// Generated from /Users/beaadc/Documents/GitHub/JSBach-Double-Interpreter/Practica/jsBach.g4 by ANTLR 4.8
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
		KEY=18, NUM=19, VAR=20, MES=21, MENYS=22, MUL=23, DIV=24, MOD=25, EQ=26, 
		NEQ=27, LT=28, GT=29, LEQ=30, GEQ=31, COMMENT=32, STR=33, WS=34;
	public static final int
		RULE_root = 0, RULE_body = 1, RULE_expr = 2, RULE_assig = 3, RULE_read = 4, 
		RULE_write = 5, RULE_if_block = 6, RULE_else_block = 7, RULE_while_block = 8, 
		RULE_array = 9, RULE_numsNkeys = 10, RULE_getLength = 11, RULE_getElem = 12, 
		RULE_addElem = 13, RULE_rmElem = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "body", "expr", "assig", "read", "write", "if_block", "else_block", 
			"while_block", "array", "numsNkeys", "getLength", "getElem", "addElem", 
			"rmElem"
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
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
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
			setState(30);
			body();
			setState(31);
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

	public static class BodyContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<AssigContext> assig() {
			return getRuleContexts(AssigContext.class);
		}
		public AssigContext assig(int i) {
			return getRuleContext(AssigContext.class,i);
		}
		public List<ReadContext> read() {
			return getRuleContexts(ReadContext.class);
		}
		public ReadContext read(int i) {
			return getRuleContext(ReadContext.class,i);
		}
		public List<WriteContext> write() {
			return getRuleContexts(WriteContext.class);
		}
		public WriteContext write(int i) {
			return getRuleContext(WriteContext.class,i);
		}
		public List<If_blockContext> if_block() {
			return getRuleContexts(If_blockContext.class);
		}
		public If_blockContext if_block(int i) {
			return getRuleContext(If_blockContext.class,i);
		}
		public List<While_blockContext> while_block() {
			return getRuleContexts(While_blockContext.class);
		}
		public While_blockContext while_block(int i) {
			return getRuleContext(While_blockContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__16) | (1L << NUM) | (1L << VAR))) != 0)) {
				{
				setState(39);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(33);
					expr(0);
					}
					break;
				case 2:
					{
					setState(34);
					assig();
					}
					break;
				case 3:
					{
					setState(35);
					read();
					}
					break;
				case 4:
					{
					setState(36);
					write();
					}
					break;
				case 5:
					{
					setState(37);
					if_block();
					}
					break;
				case 6:
					{
					setState(38);
					while_block();
					}
					break;
				}
				}
				setState(43);
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
		public GetElemContext getElem() {
			return getRuleContext(GetElemContext.class,0);
		}
		public GetLengthContext getLength() {
			return getRuleContext(GetLengthContext.class,0);
		}
		public AddElemContext addElem() {
			return getRuleContext(AddElemContext.class,0);
		}
		public RmElemContext rmElem() {
			return getRuleContext(RmElemContext.class,0);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(45);
				match(T__0);
				setState(46);
				expr(0);
				setState(47);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(49);
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
			case 3:
				{
				setState(50);
				array();
				}
				break;
			case 4:
				{
				setState(51);
				getElem();
				}
				break;
			case 5:
				{
				setState(52);
				getLength();
				}
				break;
			case 6:
				{
				setState(53);
				addElem();
				}
				break;
			case 7:
				{
				setState(54);
				rmElem();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(72);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(57);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(58);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << LT) | (1L << GT) | (1L << LEQ) | (1L << GEQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(59);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(60);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(61);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(64);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
						case 1:
							{
							setState(62);
							expr(0);
							}
							break;
						case 2:
							{
							setState(63);
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
						setState(66);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(67);
						_la = _input.LA(1);
						if ( !(_la==MES || _la==MENYS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(70);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
							{
							setState(68);
							expr(0);
							}
							break;
						case 2:
							{
							setState(69);
							match(VAR);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 6, RULE_assig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(VAR);
			setState(78);
			match(T__2);
			setState(79);
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(jsBachParser.VAR, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__3);
			setState(82);
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
		enterRule(_localctx, 10, RULE_write);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(T__4);
				setState(85);
				match(STR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(T__4);
				setState(87);
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

	public static class If_blockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__5);
			setState(91);
			expr(0);
			setState(92);
			match(T__6);
			setState(93);
			body();
			setState(94);
			match(T__7);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(95);
				else_block();
				}
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

	public static class Else_blockContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__8);
			setState(99);
			match(T__6);
			setState(100);
			body();
			setState(101);
			match(T__7);
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
		enterRule(_localctx, 16, RULE_while_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__9);
			setState(104);
			expr(0);
			setState(105);
			match(T__6);
			setState(106);
			body();
			setState(107);
			match(T__7);
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
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(T__10);
				setState(110);
				numsNkeys();
				setState(111);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(T__10);
				setState(114);
				match(T__11);
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
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(118);
						numsNkeys();
						}
						} 
					}
					setState(123);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case KEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(KEY);
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(125);
						numsNkeys();
						}
						} 
					}
					setState(130);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
			setState(133);
			match(T__12);
			setState(134);
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
			setState(136);
			match(VAR);
			setState(137);
			match(T__13);
			setState(138);
			expr(0);
			setState(139);
			match(T__14);
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
		public TerminalNode VAR() { return getToken(jsBachParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			setState(141);
			match(VAR);
			setState(142);
			match(T__15);
			setState(143);
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
			setState(145);
			match(T__16);
			setState(146);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0097\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4:\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4C\n\4\3\4\3\4\3"+
		"\4\3\4\5\4I\n\4\7\4K\n\4\f\4\16\4N\13\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\5\7[\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bc\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13v\n\13"+
		"\3\f\3\f\7\fz\n\f\f\f\16\f}\13\f\3\f\3\f\7\f\u0081\n\f\f\f\16\f\u0084"+
		"\13\f\5\f\u0086\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\2\3\6\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36\2\6\3\2\25\26\3\2\34!\3\2\31\32\3\2\27\30\2\u009e\2 \3\2\2\2\4+\3"+
		"\2\2\2\69\3\2\2\2\bO\3\2\2\2\nS\3\2\2\2\fZ\3\2\2\2\16\\\3\2\2\2\20d\3"+
		"\2\2\2\22i\3\2\2\2\24u\3\2\2\2\26\u0085\3\2\2\2\30\u0087\3\2\2\2\32\u008a"+
		"\3\2\2\2\34\u008f\3\2\2\2\36\u0093\3\2\2\2 !\5\4\3\2!\"\7\2\2\3\"\3\3"+
		"\2\2\2#*\5\6\4\2$*\5\b\5\2%*\5\n\6\2&*\5\f\7\2\'*\5\16\b\2(*\5\22\n\2"+
		")#\3\2\2\2)$\3\2\2\2)%\3\2\2\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*-\3\2\2"+
		"\2+)\3\2\2\2+,\3\2\2\2,\5\3\2\2\2-+\3\2\2\2./\b\4\1\2/\60\7\3\2\2\60\61"+
		"\5\6\4\2\61\62\7\4\2\2\62:\3\2\2\2\63:\t\2\2\2\64:\5\24\13\2\65:\5\32"+
		"\16\2\66:\5\30\r\2\67:\5\34\17\28:\5\36\20\29.\3\2\2\29\63\3\2\2\29\64"+
		"\3\2\2\29\65\3\2\2\29\66\3\2\2\29\67\3\2\2\298\3\2\2\2:L\3\2\2\2;<\f\13"+
		"\2\2<=\t\3\2\2=K\5\6\4\f>?\f\n\2\2?B\t\4\2\2@C\5\6\4\2AC\7\26\2\2B@\3"+
		"\2\2\2BA\3\2\2\2CK\3\2\2\2DE\f\t\2\2EH\t\5\2\2FI\5\6\4\2GI\7\26\2\2HF"+
		"\3\2\2\2HG\3\2\2\2IK\3\2\2\2J;\3\2\2\2J>\3\2\2\2JD\3\2\2\2KN\3\2\2\2L"+
		"J\3\2\2\2LM\3\2\2\2M\7\3\2\2\2NL\3\2\2\2OP\7\26\2\2PQ\7\5\2\2QR\5\6\4"+
		"\2R\t\3\2\2\2ST\7\6\2\2TU\7\26\2\2U\13\3\2\2\2VW\7\7\2\2W[\7#\2\2XY\7"+
		"\7\2\2Y[\5\6\4\2ZV\3\2\2\2ZX\3\2\2\2[\r\3\2\2\2\\]\7\b\2\2]^\5\6\4\2^"+
		"_\7\t\2\2_`\5\4\3\2`b\7\n\2\2ac\5\20\t\2ba\3\2\2\2bc\3\2\2\2c\17\3\2\2"+
		"\2de\7\13\2\2ef\7\t\2\2fg\5\4\3\2gh\7\n\2\2h\21\3\2\2\2ij\7\f\2\2jk\5"+
		"\6\4\2kl\7\t\2\2lm\5\4\3\2mn\7\n\2\2n\23\3\2\2\2op\7\r\2\2pq\5\26\f\2"+
		"qr\7\16\2\2rv\3\2\2\2st\7\r\2\2tv\7\16\2\2uo\3\2\2\2us\3\2\2\2v\25\3\2"+
		"\2\2w{\t\2\2\2xz\5\26\f\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0086"+
		"\3\2\2\2}{\3\2\2\2~\u0082\7\24\2\2\177\u0081\5\26\f\2\u0080\177\3\2\2"+
		"\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0085w\3\2\2\2\u0085~\3\2\2\2\u0086\27\3"+
		"\2\2\2\u0087\u0088\7\17\2\2\u0088\u0089\7\26\2\2\u0089\31\3\2\2\2\u008a"+
		"\u008b\7\26\2\2\u008b\u008c\7\20\2\2\u008c\u008d\5\6\4\2\u008d\u008e\7"+
		"\21\2\2\u008e\33\3\2\2\2\u008f\u0090\7\26\2\2\u0090\u0091\7\22\2\2\u0091"+
		"\u0092\5\6\4\2\u0092\35\3\2\2\2\u0093\u0094\7\23\2\2\u0094\u0095\5\32"+
		"\16\2\u0095\37\3\2\2\2\17)+9BHJLZbu{\u0082\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}