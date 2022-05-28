# Generated from jsBach.g4 by ANTLR 4.10.1
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
        4,1,21,67,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,1,0,4,
        0,14,8,0,11,0,12,0,15,1,0,1,0,1,1,1,1,1,1,1,1,3,1,24,8,1,1,2,1,2,
        1,2,1,2,1,2,1,2,3,2,32,8,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,3,2,41,8,
        2,1,2,1,2,1,2,1,2,3,2,47,8,2,5,2,49,8,2,10,2,12,2,52,9,2,1,3,1,3,
        1,3,1,3,1,4,1,4,1,4,1,5,1,5,1,5,1,5,3,5,65,8,5,1,5,0,1,4,6,0,2,4,
        6,8,10,0,4,1,0,6,7,1,0,13,18,1,0,10,11,1,0,8,9,71,0,13,1,0,0,0,2,
        23,1,0,0,0,4,31,1,0,0,0,6,53,1,0,0,0,8,57,1,0,0,0,10,64,1,0,0,0,
        12,14,3,2,1,0,13,12,1,0,0,0,14,15,1,0,0,0,15,13,1,0,0,0,15,16,1,
        0,0,0,16,17,1,0,0,0,17,18,5,0,0,1,18,1,1,0,0,0,19,24,3,4,2,0,20,
        24,3,6,3,0,21,24,3,8,4,0,22,24,3,10,5,0,23,19,1,0,0,0,23,20,1,0,
        0,0,23,21,1,0,0,0,23,22,1,0,0,0,24,3,1,0,0,0,25,26,6,2,-1,0,26,27,
        5,1,0,0,27,28,3,4,2,0,28,29,5,2,0,0,29,32,1,0,0,0,30,32,7,0,0,0,
        31,25,1,0,0,0,31,30,1,0,0,0,32,50,1,0,0,0,33,34,10,4,0,0,34,35,7,
        1,0,0,35,49,3,4,2,5,36,37,10,3,0,0,37,40,7,2,0,0,38,41,3,4,2,0,39,
        41,5,7,0,0,40,38,1,0,0,0,40,39,1,0,0,0,41,49,1,0,0,0,42,43,10,2,
        0,0,43,46,7,3,0,0,44,47,3,4,2,0,45,47,5,7,0,0,46,44,1,0,0,0,46,45,
        1,0,0,0,47,49,1,0,0,0,48,33,1,0,0,0,48,36,1,0,0,0,48,42,1,0,0,0,
        49,52,1,0,0,0,50,48,1,0,0,0,50,51,1,0,0,0,51,5,1,0,0,0,52,50,1,0,
        0,0,53,54,5,7,0,0,54,55,5,3,0,0,55,56,3,4,2,0,56,7,1,0,0,0,57,58,
        5,4,0,0,58,59,5,7,0,0,59,9,1,0,0,0,60,61,5,5,0,0,61,65,5,20,0,0,
        62,63,5,5,0,0,63,65,3,4,2,0,64,60,1,0,0,0,64,62,1,0,0,0,65,11,1,
        0,0,0,8,15,23,31,40,46,48,50,64
    ]

class jsBachParser ( Parser ):

    grammarFileName = "jsBach.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'('", "')'", "'<-'", "'<?>'", "'<!>'", 
                     "<INVALID>", "<INVALID>", "'+'", "'-'", "'*'", "'/'", 
                     "'%'", "'=='", "'/='", "'<'", "'>'", "'<='", "'>='" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "NUM", "VAR", "MES", "MENYS", 
                      "MUL", "DIV", "MOD", "EQ", "NEQ", "LT", "GT", "LEQ", 
                      "GEQ", "COMMENT", "STR", "WS" ]

    RULE_root = 0
    RULE_body = 1
    RULE_expr = 2
    RULE_assig = 3
    RULE_read = 4
    RULE_write = 5

    ruleNames =  [ "root", "body", "expr", "assig", "read", "write" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    NUM=6
    VAR=7
    MES=8
    MENYS=9
    MUL=10
    DIV=11
    MOD=12
    EQ=13
    NEQ=14
    LT=15
    GT=16
    LEQ=17
    GEQ=18
    COMMENT=19
    STR=20
    WS=21

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
            return self.getToken(jsBachParser.EOF, 0)

        def body(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(jsBachParser.BodyContext)
            else:
                return self.getTypedRuleContext(jsBachParser.BodyContext,i)


        def getRuleIndex(self):
            return jsBachParser.RULE_root

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRoot" ):
                return visitor.visitRoot(self)
            else:
                return visitor.visitChildren(self)




    def root(self):

        localctx = jsBachParser.RootContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_root)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 13 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 12
                self.body()
                self.state = 15 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << jsBachParser.T__0) | (1 << jsBachParser.T__3) | (1 << jsBachParser.T__4) | (1 << jsBachParser.NUM) | (1 << jsBachParser.VAR))) != 0)):
                    break

            self.state = 17
            self.match(jsBachParser.EOF)
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

        def expr(self):
            return self.getTypedRuleContext(jsBachParser.ExprContext,0)


        def assig(self):
            return self.getTypedRuleContext(jsBachParser.AssigContext,0)


        def read(self):
            return self.getTypedRuleContext(jsBachParser.ReadContext,0)


        def write(self):
            return self.getTypedRuleContext(jsBachParser.WriteContext,0)


        def getRuleIndex(self):
            return jsBachParser.RULE_body

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBody" ):
                return visitor.visitBody(self)
            else:
                return visitor.visitChildren(self)




    def body(self):

        localctx = jsBachParser.BodyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_body)
        try:
            self.state = 23
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 19
                self.expr(0)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 20
                self.assig()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 21
                self.read()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 22
                self.write()
                pass


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

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(jsBachParser.ExprContext)
            else:
                return self.getTypedRuleContext(jsBachParser.ExprContext,i)


        def NUM(self):
            return self.getToken(jsBachParser.NUM, 0)

        def VAR(self):
            return self.getToken(jsBachParser.VAR, 0)

        def EQ(self):
            return self.getToken(jsBachParser.EQ, 0)

        def NEQ(self):
            return self.getToken(jsBachParser.NEQ, 0)

        def LT(self):
            return self.getToken(jsBachParser.LT, 0)

        def GT(self):
            return self.getToken(jsBachParser.GT, 0)

        def LEQ(self):
            return self.getToken(jsBachParser.LEQ, 0)

        def GEQ(self):
            return self.getToken(jsBachParser.GEQ, 0)

        def MUL(self):
            return self.getToken(jsBachParser.MUL, 0)

        def DIV(self):
            return self.getToken(jsBachParser.DIV, 0)

        def MES(self):
            return self.getToken(jsBachParser.MES, 0)

        def MENYS(self):
            return self.getToken(jsBachParser.MENYS, 0)

        def getRuleIndex(self):
            return jsBachParser.RULE_expr

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpr" ):
                return visitor.visitExpr(self)
            else:
                return visitor.visitChildren(self)



    def expr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = jsBachParser.ExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 4
        self.enterRecursionRule(localctx, 4, self.RULE_expr, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 31
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [jsBachParser.T__0]:
                self.state = 26
                self.match(jsBachParser.T__0)
                self.state = 27
                self.expr(0)
                self.state = 28
                self.match(jsBachParser.T__1)
                pass
            elif token in [jsBachParser.NUM, jsBachParser.VAR]:
                self.state = 30
                _la = self._input.LA(1)
                if not(_la==jsBachParser.NUM or _la==jsBachParser.VAR):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 50
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,6,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 48
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
                    if la_ == 1:
                        localctx = jsBachParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 33
                        if not self.precpred(self._ctx, 4):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                        self.state = 34
                        _la = self._input.LA(1)
                        if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << jsBachParser.EQ) | (1 << jsBachParser.NEQ) | (1 << jsBachParser.LT) | (1 << jsBachParser.GT) | (1 << jsBachParser.LEQ) | (1 << jsBachParser.GEQ))) != 0)):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 35
                        self.expr(5)
                        pass

                    elif la_ == 2:
                        localctx = jsBachParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 36
                        if not self.precpred(self._ctx, 3):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                        self.state = 37
                        _la = self._input.LA(1)
                        if not(_la==jsBachParser.MUL or _la==jsBachParser.DIV):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 40
                        self._errHandler.sync(self)
                        la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
                        if la_ == 1:
                            self.state = 38
                            self.expr(0)
                            pass

                        elif la_ == 2:
                            self.state = 39
                            self.match(jsBachParser.VAR)
                            pass


                        pass

                    elif la_ == 3:
                        localctx = jsBachParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 42
                        if not self.precpred(self._ctx, 2):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                        self.state = 43
                        _la = self._input.LA(1)
                        if not(_la==jsBachParser.MES or _la==jsBachParser.MENYS):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 46
                        self._errHandler.sync(self)
                        la_ = self._interp.adaptivePredict(self._input,4,self._ctx)
                        if la_ == 1:
                            self.state = 44
                            self.expr(0)
                            pass

                        elif la_ == 2:
                            self.state = 45
                            self.match(jsBachParser.VAR)
                            pass


                        pass

             
                self.state = 52
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,6,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class AssigContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VAR(self):
            return self.getToken(jsBachParser.VAR, 0)

        def expr(self):
            return self.getTypedRuleContext(jsBachParser.ExprContext,0)


        def getRuleIndex(self):
            return jsBachParser.RULE_assig

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAssig" ):
                return visitor.visitAssig(self)
            else:
                return visitor.visitChildren(self)




    def assig(self):

        localctx = jsBachParser.AssigContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_assig)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 53
            self.match(jsBachParser.VAR)
            self.state = 54
            self.match(jsBachParser.T__2)
            self.state = 55
            self.expr(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ReadContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VAR(self):
            return self.getToken(jsBachParser.VAR, 0)

        def getRuleIndex(self):
            return jsBachParser.RULE_read

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRead" ):
                return visitor.visitRead(self)
            else:
                return visitor.visitChildren(self)




    def read(self):

        localctx = jsBachParser.ReadContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_read)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 57
            self.match(jsBachParser.T__3)
            self.state = 58
            self.match(jsBachParser.VAR)
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
            return self.getToken(jsBachParser.STR, 0)

        def expr(self):
            return self.getTypedRuleContext(jsBachParser.ExprContext,0)


        def getRuleIndex(self):
            return jsBachParser.RULE_write

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitWrite" ):
                return visitor.visitWrite(self)
            else:
                return visitor.visitChildren(self)




    def write(self):

        localctx = jsBachParser.WriteContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_write)
        try:
            self.state = 64
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 60
                self.match(jsBachParser.T__4)
                self.state = 61
                self.match(jsBachParser.STR)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 62
                self.match(jsBachParser.T__4)
                self.state = 63
                self.expr(0)
                pass


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
        self._predicates[2] = self.expr_sempred
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
         




