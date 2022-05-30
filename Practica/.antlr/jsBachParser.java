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
		KEY=18, NUM=19, VAR=20, METHOD_NAME=21, MES=22, MENYS=23, MUL=24, DIV=25, 
		MOD=26, EQ=27, NEQ=28, LT=29, GT=30, LEQ=31, GEQ=32, COMMENT=33, STR=34, 
		WS=35;
	public static final int
		RULE_root = 0, RULE_function = 1, RULE_body = 2, RULE_method_call = 3, 
		RULE_expr = 4, RULE_assig = 5, RULE_read = 6, RULE_write = 7, RULE_if_block = 8, 
		RULE_else_block = 9, RULE_while_block = 10, RULE_array = 11, RULE_numsNkeys = 12, 
		RULE_getLength = 13, RULE_getElem = 14, RULE_addElem = 15, RULE_rmElem = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "function", "body", "method_call", "expr", "assig", "read", "write", 
			"if_block", "else_block", "while_block", "array", "numsNkeys", "getLength", 
			"getElem", "addElem", "rmElem"
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
		public TerminalNode EOF() { return getToken(jsBachParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				function();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==METHOD_NAME );
			setState(39);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode METHOD_NAME() { return getToken(jsBachParser.METHOD_NAME, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> VAR() { return getTokens(jsBachParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(jsBachParser.VAR, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(METHOD_NAME);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(42);
				match(VAR);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(T__0);
			setState(49);
			body();
			setState(50);
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
		public List<Method_callContext> method_call() {
			return getRuleContexts(Method_callContext.class);
		}
		public Method_callContext method_call(int i) {
			return getRuleContext(Method_callContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__16) | (1L << NUM) | (1L << VAR) | (1L << METHOD_NAME))) != 0)) {
				{
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(52);
					expr(0);
					}
					break;
				case 2:
					{
					setState(53);
					assig();
					}
					break;
				case 3:
					{
					setState(54);
					read();
					}
					break;
				case 4:
					{
					setState(55);
					write();
					}
					break;
				case 5:
					{
					setState(56);
					if_block();
					}
					break;
				case 6:
					{
					setState(57);
					while_block();
					}
					break;
				case 7:
					{
					setState(58);
					method_call();
					}
					break;
				}
				}
				setState(63);
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

	public static class Method_callContext extends ParserRuleContext {
		public TerminalNode METHOD_NAME() { return getToken(jsBachParser.METHOD_NAME, 0); }
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
		enterRule(_localctx, 6, RULE_method_call);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(METHOD_NAME);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65);
					expr(0);
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(72);
				match(T__2);
				setState(73);
				expr(0);
				setState(74);
				match(T__3);
				}
				break;
			case 2:
				{
				setState(76);
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
				setState(77);
				array();
				}
				break;
			case 4:
				{
				setState(78);
				getElem();
				}
				break;
			case 5:
				{
				setState(79);
				getLength();
				}
				break;
			case 6:
				{
				setState(80);
				addElem();
				}
				break;
			case 7:
				{
				setState(81);
				rmElem();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(99);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(84);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(85);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << LT) | (1L << GT) | (1L << LEQ) | (1L << GEQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(86);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(87);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(88);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(91);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
						case 1:
							{
							setState(89);
							expr(0);
							}
							break;
						case 2:
							{
							setState(90);
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
						setState(93);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(94);
						_la = _input.LA(1);
						if ( !(_la==MES || _la==MENYS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(97);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
						case 1:
							{
							setState(95);
							expr(0);
							}
							break;
						case 2:
							{
							setState(96);
							match(VAR);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 10, RULE_assig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(VAR);
			setState(105);
			match(T__4);
			setState(106);
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
		enterRule(_localctx, 12, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__5);
			setState(109);
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
		public List<TerminalNode> STR() { return getTokens(jsBachParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(jsBachParser.STR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_write);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__6);
			setState(114); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(114);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STR:
						{
						setState(112);
						match(STR);
						}
						break;
					case T__2:
					case T__10:
					case T__12:
					case T__16:
					case NUM:
					case VAR:
						{
						setState(113);
						expr(0);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(116); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 16, RULE_if_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__7);
			setState(119);
			expr(0);
			setState(120);
			match(T__0);
			setState(121);
			body();
			setState(122);
			match(T__1);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(123);
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
		enterRule(_localctx, 18, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__8);
			setState(127);
			match(T__0);
			setState(128);
			body();
			setState(129);
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
		enterRule(_localctx, 20, RULE_while_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__9);
			setState(132);
			expr(0);
			setState(133);
			match(T__0);
			setState(134);
			body();
			setState(135);
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
		enterRule(_localctx, 22, RULE_array);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(T__10);
				setState(138);
				numsNkeys();
				setState(139);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(T__10);
				setState(142);
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
		enterRule(_localctx, 24, RULE_numsNkeys);
		int _la;
		try {
			int _alt;
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(146);
						numsNkeys();
						}
						} 
					}
					setState(151);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case KEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(KEY);
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(153);
						numsNkeys();
						}
						} 
					}
					setState(158);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 26, RULE_getLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__12);
			setState(162);
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
		enterRule(_localctx, 28, RULE_getElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(VAR);
			setState(165);
			match(T__13);
			setState(166);
			expr(0);
			setState(167);
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
		enterRule(_localctx, 30, RULE_addElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(VAR);
			setState(170);
			match(T__15);
			setState(171);
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
		enterRule(_localctx, 32, RULE_rmElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__16);
			setState(174);
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
		case 4:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00b3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\2\3\2\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\5\3"+
		"\5\7\5E\n\5\f\5\16\5H\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6U\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\6\3\6\3\6\3\6\5\6d\n"+
		"\6\7\6f\n\6\f\6\16\6i\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\6\t"+
		"u\n\t\r\t\16\tv\3\n\3\n\3\n\3\n\3\n\3\n\5\n\177\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0092\n\r\3"+
		"\16\3\16\7\16\u0096\n\16\f\16\16\16\u0099\13\16\3\16\3\16\7\16\u009d\n"+
		"\16\f\16\16\16\u00a0\13\16\5\16\u00a2\n\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\2\3\n\23\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"\2\6\3\2\25\26\3\2\35\"\3\2\32\33\3"+
		"\2\30\31\2\u00bd\2%\3\2\2\2\4+\3\2\2\2\6?\3\2\2\2\bB\3\2\2\2\nT\3\2\2"+
		"\2\fj\3\2\2\2\16n\3\2\2\2\20q\3\2\2\2\22x\3\2\2\2\24\u0080\3\2\2\2\26"+
		"\u0085\3\2\2\2\30\u0091\3\2\2\2\32\u00a1\3\2\2\2\34\u00a3\3\2\2\2\36\u00a6"+
		"\3\2\2\2 \u00ab\3\2\2\2\"\u00af\3\2\2\2$&\5\4\3\2%$\3\2\2\2&\'\3\2\2\2"+
		"\'%\3\2\2\2\'(\3\2\2\2()\3\2\2\2)*\7\2\2\3*\3\3\2\2\2+/\7\27\2\2,.\7\26"+
		"\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2"+
		"\2\2\62\63\7\3\2\2\63\64\5\6\4\2\64\65\7\4\2\2\65\5\3\2\2\2\66>\5\n\6"+
		"\2\67>\5\f\7\28>\5\16\b\29>\5\20\t\2:>\5\22\n\2;>\5\26\f\2<>\5\b\5\2="+
		"\66\3\2\2\2=\67\3\2\2\2=8\3\2\2\2=9\3\2\2\2=:\3\2\2\2=;\3\2\2\2=<\3\2"+
		"\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\7\3\2\2\2A?\3\2\2\2BF\7\27\2\2CE\5"+
		"\n\6\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\t\3\2\2\2HF\3\2\2\2IJ"+
		"\b\6\1\2JK\7\5\2\2KL\5\n\6\2LM\7\6\2\2MU\3\2\2\2NU\t\2\2\2OU\5\30\r\2"+
		"PU\5\36\20\2QU\5\34\17\2RU\5 \21\2SU\5\"\22\2TI\3\2\2\2TN\3\2\2\2TO\3"+
		"\2\2\2TP\3\2\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2Ug\3\2\2\2VW\f\13\2\2WX"+
		"\t\3\2\2Xf\5\n\6\fYZ\f\n\2\2Z]\t\4\2\2[^\5\n\6\2\\^\7\26\2\2][\3\2\2\2"+
		"]\\\3\2\2\2^f\3\2\2\2_`\f\t\2\2`c\t\5\2\2ad\5\n\6\2bd\7\26\2\2ca\3\2\2"+
		"\2cb\3\2\2\2df\3\2\2\2eV\3\2\2\2eY\3\2\2\2e_\3\2\2\2fi\3\2\2\2ge\3\2\2"+
		"\2gh\3\2\2\2h\13\3\2\2\2ig\3\2\2\2jk\7\26\2\2kl\7\7\2\2lm\5\n\6\2m\r\3"+
		"\2\2\2no\7\b\2\2op\7\26\2\2p\17\3\2\2\2qt\7\t\2\2ru\7$\2\2su\5\n\6\2t"+
		"r\3\2\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\21\3\2\2\2xy\7\n\2"+
		"\2yz\5\n\6\2z{\7\3\2\2{|\5\6\4\2|~\7\4\2\2}\177\5\24\13\2~}\3\2\2\2~\177"+
		"\3\2\2\2\177\23\3\2\2\2\u0080\u0081\7\13\2\2\u0081\u0082\7\3\2\2\u0082"+
		"\u0083\5\6\4\2\u0083\u0084\7\4\2\2\u0084\25\3\2\2\2\u0085\u0086\7\f\2"+
		"\2\u0086\u0087\5\n\6\2\u0087\u0088\7\3\2\2\u0088\u0089\5\6\4\2\u0089\u008a"+
		"\7\4\2\2\u008a\27\3\2\2\2\u008b\u008c\7\r\2\2\u008c\u008d\5\32\16\2\u008d"+
		"\u008e\7\16\2\2\u008e\u0092\3\2\2\2\u008f\u0090\7\r\2\2\u0090\u0092\7"+
		"\16\2\2\u0091\u008b\3\2\2\2\u0091\u008f\3\2\2\2\u0092\31\3\2\2\2\u0093"+
		"\u0097\t\2\2\2\u0094\u0096\5\32\16\2\u0095\u0094\3\2\2\2\u0096\u0099\3"+
		"\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u00a2\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009e\7\24\2\2\u009b\u009d\5\32\16\2\u009c\u009b"+
		"\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u0093\3\2\2\2\u00a1\u009a\3\2"+
		"\2\2\u00a2\33\3\2\2\2\u00a3\u00a4\7\17\2\2\u00a4\u00a5\7\26\2\2\u00a5"+
		"\35\3\2\2\2\u00a6\u00a7\7\26\2\2\u00a7\u00a8\7\20\2\2\u00a8\u00a9\5\n"+
		"\6\2\u00a9\u00aa\7\21\2\2\u00aa\37\3\2\2\2\u00ab\u00ac\7\26\2\2\u00ac"+
		"\u00ad\7\22\2\2\u00ad\u00ae\5\n\6\2\u00ae!\3\2\2\2\u00af\u00b0\7\23\2"+
		"\2\u00b0\u00b1\5\36\20\2\u00b1#\3\2\2\2\23\'/=?FT]cegtv~\u0091\u0097\u009e"+
		"\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}