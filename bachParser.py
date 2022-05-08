# Generated from bach.g4 by ANTLR 4.10.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,25,104,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,1,0,4,0,24,8,0,11,0,12,0,25,
        1,0,1,0,1,1,1,1,5,1,32,8,1,10,1,12,1,35,9,1,1,1,1,1,1,1,1,1,1,2,
        1,2,1,2,1,2,1,2,1,2,1,2,3,2,48,8,2,1,3,1,3,1,3,1,3,1,3,1,3,1,4,1,
        4,1,4,1,4,1,4,1,4,1,5,1,5,1,5,1,5,1,6,1,6,1,7,1,7,5,7,70,8,7,10,
        7,12,7,73,9,7,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,3,8,85,8,8,
        1,8,1,8,1,8,1,8,3,8,91,8,8,5,8,93,8,8,10,8,12,8,96,9,8,1,9,1,9,1,
        9,1,10,1,10,1,10,1,10,0,1,16,11,0,2,4,6,8,10,12,14,16,18,20,0,4,
        1,0,9,10,1,0,17,22,1,0,14,15,1,0,12,13,106,0,23,1,0,0,0,2,29,1,0,
        0,0,4,47,1,0,0,0,6,49,1,0,0,0,8,55,1,0,0,0,10,61,1,0,0,0,12,65,1,
        0,0,0,14,67,1,0,0,0,16,74,1,0,0,0,18,97,1,0,0,0,20,100,1,0,0,0,22,
        24,3,2,1,0,23,22,1,0,0,0,24,25,1,0,0,0,25,23,1,0,0,0,25,26,1,0,0,
        0,26,27,1,0,0,0,27,28,5,0,0,1,28,1,1,0,0,0,29,33,5,11,0,0,30,32,
        5,10,0,0,31,30,1,0,0,0,32,35,1,0,0,0,33,31,1,0,0,0,33,34,1,0,0,0,
        34,36,1,0,0,0,35,33,1,0,0,0,36,37,5,1,0,0,37,38,3,4,2,0,38,39,5,
        2,0,0,39,3,1,0,0,0,40,48,3,6,3,0,41,48,3,8,4,0,42,48,3,10,5,0,43,
        48,3,12,6,0,44,48,3,14,7,0,45,48,3,20,10,0,46,48,3,18,9,0,47,40,
        1,0,0,0,47,41,1,0,0,0,47,42,1,0,0,0,47,43,1,0,0,0,47,44,1,0,0,0,
        47,45,1,0,0,0,47,46,1,0,0,0,48,5,1,0,0,0,49,50,5,3,0,0,50,51,3,16,
        8,0,51,52,5,1,0,0,52,53,3,4,2,0,53,54,5,2,0,0,54,7,1,0,0,0,55,56,
        5,4,0,0,56,57,3,16,8,0,57,58,5,1,0,0,58,59,3,4,2,0,59,60,5,2,0,0,
        60,9,1,0,0,0,61,62,5,10,0,0,62,63,5,5,0,0,63,64,3,16,8,0,64,11,1,
        0,0,0,65,66,5,23,0,0,66,13,1,0,0,0,67,71,5,11,0,0,68,70,5,10,0,0,
        69,68,1,0,0,0,70,73,1,0,0,0,71,69,1,0,0,0,71,72,1,0,0,0,72,15,1,
        0,0,0,73,71,1,0,0,0,74,75,6,8,-1,0,75,76,7,0,0,0,76,94,1,0,0,0,77,
        78,10,4,0,0,78,79,7,1,0,0,79,93,3,16,8,5,80,81,10,3,0,0,81,84,7,
        2,0,0,82,85,3,16,8,0,83,85,5,10,0,0,84,82,1,0,0,0,84,83,1,0,0,0,
        85,93,1,0,0,0,86,87,10,2,0,0,87,90,7,3,0,0,88,91,3,16,8,0,89,91,
        5,10,0,0,90,88,1,0,0,0,90,89,1,0,0,0,91,93,1,0,0,0,92,77,1,0,0,0,
        92,80,1,0,0,0,92,86,1,0,0,0,93,96,1,0,0,0,94,92,1,0,0,0,94,95,1,
        0,0,0,95,17,1,0,0,0,96,94,1,0,0,0,97,98,5,6,0,0,98,99,5,10,0,0,99,
        19,1,0,0,0,100,101,5,7,0,0,101,102,5,24,0,0,102,21,1,0,0,0,8,25,
        33,47,71,84,90,92,94
    ]

class bachParser ( Parser ):

    grammarFileName = "bach.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'|:'", "':|'", "'if'", "'while'", "'<-'", 
                     "'<?>'", "'<!>'", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", 
                     "'/='", "'<'", "'>'", "'<='", "'>='" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "KEY", "NUM", "VAR", "PROC", "MES", "MENYS", "MUL", 
                      "DIV", "MOD", "EQ", "NEQ", "LT", "GT", "LEQ", "GEQ", 
                      "COMMENT", "STR", "WS" ]

    RULE_root = 0
    RULE_f = 1
    RULE_body = 2
    RULE_if_block = 3
    RULE_while_block = 4
    RULE_assig = 5
    RULE_comments = 6
    RULE_mcall = 7
    RULE_expr = 8
    RULE_read = 9
    RULE_write = 10

    ruleNames =  [ "root", "f", "body", "if_block", "while_block", "assig", 
                   "comments", "mcall", "expr", "read", "write" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    KEY=8
    NUM=9
    VAR=10
    PROC=11
    MES=12
    MENYS=13
    MUL=14
    DIV=15
    MOD=16
    EQ=17
    NEQ=18
    LT=19
    GT=20
    LEQ=21
    GEQ=22
    COMMENT=23
    STR=24
    WS=25

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.10.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class RootContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(bachParser.EOF, 0)

        def f(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bachParser.FContext)
            else:
                return self.getTypedRuleContext(bachParser.FContext,i)


        def getRuleIndex(self):
            return bachParser.RULE_root




    def root(self):

        localctx = bachParser.RootContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_root)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 23 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 22
                self.f()
                self.state = 25 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==bachParser.PROC):
                    break

            self.state = 27
            self.match(bachParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PROC(self):
            return self.getToken(bachParser.PROC, 0)

        def body(self):
            return self.getTypedRuleContext(bachParser.BodyContext,0)


        def VAR(self, i:int=None):
            if i is None:
                return self.getTokens(bachParser.VAR)
            else:
                return self.getToken(bachParser.VAR, i)

        def getRuleIndex(self):
            return bachParser.RULE_f




    def f(self):

        localctx = bachParser.FContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_f)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 29
            self.match(bachParser.PROC)
            self.state = 33
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==bachParser.VAR:
                self.state = 30
                self.match(bachParser.VAR)
                self.state = 35
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 36
            self.match(bachParser.T__0)
            self.state = 37
            self.body()
            self.state = 38
            self.match(bachParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BodyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def if_block(self):
            return self.getTypedRuleContext(bachParser.If_blockContext,0)


        def while_block(self):
            return self.getTypedRuleContext(bachParser.While_blockContext,0)


        def assig(self):
            return self.getTypedRuleContext(bachParser.AssigContext,0)


        def comments(self):
            return self.getTypedRuleContext(bachParser.CommentsContext,0)


        def mcall(self):
            return self.getTypedRuleContext(bachParser.McallContext,0)


        def write(self):
            return self.getTypedRuleContext(bachParser.WriteContext,0)


        def read(self):
            return self.getTypedRuleContext(bachParser.ReadContext,0)


        def getRuleIndex(self):
            return bachParser.RULE_body




    def body(self):

        localctx = bachParser.BodyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_body)
        try:
            self.state = 47
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [bachParser.T__2]:
                self.enterOuterAlt(localctx, 1)
                self.state = 40
                self.if_block()
                pass
            elif token in [bachParser.T__3]:
                self.enterOuterAlt(localctx, 2)
                self.state = 41
                self.while_block()
                pass
            elif token in [bachParser.VAR]:
                self.enterOuterAlt(localctx, 3)
                self.state = 42
                self.assig()
                pass
            elif token in [bachParser.COMMENT]:
                self.enterOuterAlt(localctx, 4)
                self.state = 43
                self.comments()
                pass
            elif token in [bachParser.PROC]:
                self.enterOuterAlt(localctx, 5)
                self.state = 44
                self.mcall()
                pass
            elif token in [bachParser.T__6]:
                self.enterOuterAlt(localctx, 6)
                self.state = 45
                self.write()
                pass
            elif token in [bachParser.T__5]:
                self.enterOuterAlt(localctx, 7)
                self.state = 46
                self.read()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class If_blockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(bachParser.ExprContext,0)


        def body(self):
            return self.getTypedRuleContext(bachParser.BodyContext,0)


        def getRuleIndex(self):
            return bachParser.RULE_if_block




    def if_block(self):

        localctx = bachParser.If_blockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_if_block)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 49
            self.match(bachParser.T__2)
            self.state = 50
            self.expr(0)
            self.state = 51
            self.match(bachParser.T__0)
            self.state = 52
            self.body()
            self.state = 53
            self.match(bachParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class While_blockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(bachParser.ExprContext,0)


        def body(self):
            return self.getTypedRuleContext(bachParser.BodyContext,0)


        def getRuleIndex(self):
            return bachParser.RULE_while_block




    def while_block(self):

        localctx = bachParser.While_blockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_while_block)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 55
            self.match(bachParser.T__3)
            self.state = 56
            self.expr(0)
            self.state = 57
            self.match(bachParser.T__0)
            self.state = 58
            self.body()
            self.state = 59
            self.match(bachParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssigContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VAR(self):
            return self.getToken(bachParser.VAR, 0)

        def expr(self):
            return self.getTypedRuleContext(bachParser.ExprContext,0)


        def getRuleIndex(self):
            return bachParser.RULE_assig




    def assig(self):

        localctx = bachParser.AssigContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_assig)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 61
            self.match(bachParser.VAR)
            self.state = 62
            self.match(bachParser.T__4)
            self.state = 63
            self.expr(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CommentsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def COMMENT(self):
            return self.getToken(bachParser.COMMENT, 0)

        def getRuleIndex(self):
            return bachParser.RULE_comments




    def comments(self):

        localctx = bachParser.CommentsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_comments)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 65
            self.match(bachParser.COMMENT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class McallContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PROC(self):
            return self.getToken(bachParser.PROC, 0)

        def VAR(self, i:int=None):
            if i is None:
                return self.getTokens(bachParser.VAR)
            else:
                return self.getToken(bachParser.VAR, i)

        def getRuleIndex(self):
            return bachParser.RULE_mcall




    def mcall(self):

        localctx = bachParser.McallContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_mcall)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 67
            self.match(bachParser.PROC)
            self.state = 71
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==bachParser.VAR:
                self.state = 68
                self.match(bachParser.VAR)
                self.state = 73
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUM(self):
            return self.getToken(bachParser.NUM, 0)

        def VAR(self):
            return self.getToken(bachParser.VAR, 0)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bachParser.ExprContext)
            else:
                return self.getTypedRuleContext(bachParser.ExprContext,i)


        def EQ(self):
            return self.getToken(bachParser.EQ, 0)

        def NEQ(self):
            return self.getToken(bachParser.NEQ, 0)

        def LT(self):
            return self.getToken(bachParser.LT, 0)

        def GT(self):
            return self.getToken(bachParser.GT, 0)

        def LEQ(self):
            return self.getToken(bachParser.LEQ, 0)

        def GEQ(self):
            return self.getToken(bachParser.GEQ, 0)

        def MUL(self):
            return self.getToken(bachParser.MUL, 0)

        def DIV(self):
            return self.getToken(bachParser.DIV, 0)

        def MES(self):
            return self.getToken(bachParser.MES, 0)

        def MENYS(self):
            return self.getToken(bachParser.MENYS, 0)

        def getRuleIndex(self):
            return bachParser.RULE_expr



    def expr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = bachParser.ExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 16
        self.enterRecursionRule(localctx, 16, self.RULE_expr, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 75
            _la = self._input.LA(1)
            if not(_la==bachParser.NUM or _la==bachParser.VAR):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self._ctx.stop = self._input.LT(-1)
            self.state = 94
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,7,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 92
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,6,self._ctx)
                    if la_ == 1:
                        localctx = bachParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 77
                        if not self.precpred(self._ctx, 4):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                        self.state = 78
                        _la = self._input.LA(1)
                        if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << bachParser.EQ) | (1 << bachParser.NEQ) | (1 << bachParser.LT) | (1 << bachParser.GT) | (1 << bachParser.LEQ) | (1 << bachParser.GEQ))) != 0)):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 79
                        self.expr(5)
                        pass

                    elif la_ == 2:
                        localctx = bachParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 80
                        if not self.precpred(self._ctx, 3):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                        self.state = 81
                        _la = self._input.LA(1)
                        if not(_la==bachParser.MUL or _la==bachParser.DIV):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 84
                        self._errHandler.sync(self)
                        la_ = self._interp.adaptivePredict(self._input,4,self._ctx)
                        if la_ == 1:
                            self.state = 82
                            self.expr(0)
                            pass

                        elif la_ == 2:
                            self.state = 83
                            self.match(bachParser.VAR)
                            pass


                        pass

                    elif la_ == 3:
                        localctx = bachParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 86
                        if not self.precpred(self._ctx, 2):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                        self.state = 87
                        _la = self._input.LA(1)
                        if not(_la==bachParser.MES or _la==bachParser.MENYS):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 90
                        self._errHandler.sync(self)
                        la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
                        if la_ == 1:
                            self.state = 88
                            self.expr(0)
                            pass

                        elif la_ == 2:
                            self.state = 89
                            self.match(bachParser.VAR)
                            pass


                        pass

             
                self.state = 96
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,7,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class ReadContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VAR(self):
            return self.getToken(bachParser.VAR, 0)

        def getRuleIndex(self):
            return bachParser.RULE_read




    def read(self):

        localctx = bachParser.ReadContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_read)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 97
            self.match(bachParser.T__5)
            self.state = 98
            self.match(bachParser.VAR)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class WriteContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STR(self):
            return self.getToken(bachParser.STR, 0)

        def getRuleIndex(self):
            return bachParser.RULE_write




    def write(self):

        localctx = bachParser.WriteContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_write)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 100
            self.match(bachParser.T__6)
            self.state = 101
            self.match(bachParser.STR)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[8] = self.expr_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expr_sempred(self, localctx:ExprContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 4)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 3)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 2)
         




