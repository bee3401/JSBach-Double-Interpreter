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
        4,1,34,149,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,5,1,40,8,1,10,1,12,
        1,43,9,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,3,2,56,8,2,
        1,2,1,2,1,2,1,2,1,2,1,2,1,2,3,2,65,8,2,1,2,1,2,1,2,1,2,3,2,71,8,
        2,5,2,73,8,2,10,2,12,2,76,9,2,1,3,1,3,1,3,1,3,1,4,1,4,1,4,1,5,1,
        5,1,5,1,5,3,5,89,8,5,1,6,1,6,1,6,1,6,1,6,1,6,3,6,97,8,6,1,7,1,7,
        1,7,1,7,1,7,1,8,1,8,1,8,1,8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,1,9,3,9,
        116,8,9,1,10,1,10,5,10,120,8,10,10,10,12,10,123,9,10,1,10,1,10,5,
        10,127,8,10,10,10,12,10,130,9,10,3,10,132,8,10,1,11,1,11,1,11,1,
        12,1,12,1,12,1,12,1,12,1,13,1,13,1,13,1,13,1,14,1,14,1,14,1,14,0,
        1,4,15,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,0,4,1,0,19,20,1,0,
        26,31,1,0,23,24,1,0,21,22,156,0,30,1,0,0,0,2,41,1,0,0,0,4,55,1,0,
        0,0,6,77,1,0,0,0,8,81,1,0,0,0,10,88,1,0,0,0,12,90,1,0,0,0,14,98,
        1,0,0,0,16,103,1,0,0,0,18,115,1,0,0,0,20,131,1,0,0,0,22,133,1,0,
        0,0,24,136,1,0,0,0,26,141,1,0,0,0,28,145,1,0,0,0,30,31,3,2,1,0,31,
        32,5,0,0,1,32,1,1,0,0,0,33,40,3,4,2,0,34,40,3,6,3,0,35,40,3,8,4,
        0,36,40,3,10,5,0,37,40,3,12,6,0,38,40,3,16,8,0,39,33,1,0,0,0,39,
        34,1,0,0,0,39,35,1,0,0,0,39,36,1,0,0,0,39,37,1,0,0,0,39,38,1,0,0,
        0,40,43,1,0,0,0,41,39,1,0,0,0,41,42,1,0,0,0,42,3,1,0,0,0,43,41,1,
        0,0,0,44,45,6,2,-1,0,45,46,5,1,0,0,46,47,3,4,2,0,47,48,5,2,0,0,48,
        56,1,0,0,0,49,56,7,0,0,0,50,56,3,18,9,0,51,56,3,24,12,0,52,56,3,
        22,11,0,53,56,3,26,13,0,54,56,3,28,14,0,55,44,1,0,0,0,55,49,1,0,
        0,0,55,50,1,0,0,0,55,51,1,0,0,0,55,52,1,0,0,0,55,53,1,0,0,0,55,54,
        1,0,0,0,56,74,1,0,0,0,57,58,10,9,0,0,58,59,7,1,0,0,59,73,3,4,2,10,
        60,61,10,8,0,0,61,64,7,2,0,0,62,65,3,4,2,0,63,65,5,20,0,0,64,62,
        1,0,0,0,64,63,1,0,0,0,65,73,1,0,0,0,66,67,10,7,0,0,67,70,7,3,0,0,
        68,71,3,4,2,0,69,71,5,20,0,0,70,68,1,0,0,0,70,69,1,0,0,0,71,73,1,
        0,0,0,72,57,1,0,0,0,72,60,1,0,0,0,72,66,1,0,0,0,73,76,1,0,0,0,74,
        72,1,0,0,0,74,75,1,0,0,0,75,5,1,0,0,0,76,74,1,0,0,0,77,78,5,20,0,
        0,78,79,5,3,0,0,79,80,3,4,2,0,80,7,1,0,0,0,81,82,5,4,0,0,82,83,5,
        20,0,0,83,9,1,0,0,0,84,85,5,5,0,0,85,89,5,33,0,0,86,87,5,5,0,0,87,
        89,3,4,2,0,88,84,1,0,0,0,88,86,1,0,0,0,89,11,1,0,0,0,90,91,5,6,0,
        0,91,92,3,4,2,0,92,93,5,7,0,0,93,94,3,2,1,0,94,96,5,8,0,0,95,97,
        3,14,7,0,96,95,1,0,0,0,96,97,1,0,0,0,97,13,1,0,0,0,98,99,5,9,0,0,
        99,100,5,7,0,0,100,101,3,2,1,0,101,102,5,8,0,0,102,15,1,0,0,0,103,
        104,5,10,0,0,104,105,3,4,2,0,105,106,5,7,0,0,106,107,3,2,1,0,107,
        108,5,8,0,0,108,17,1,0,0,0,109,110,5,11,0,0,110,111,3,20,10,0,111,
        112,5,12,0,0,112,116,1,0,0,0,113,114,5,11,0,0,114,116,5,12,0,0,115,
        109,1,0,0,0,115,113,1,0,0,0,116,19,1,0,0,0,117,121,7,0,0,0,118,120,
        3,20,10,0,119,118,1,0,0,0,120,123,1,0,0,0,121,119,1,0,0,0,121,122,
        1,0,0,0,122,132,1,0,0,0,123,121,1,0,0,0,124,128,5,18,0,0,125,127,
        3,20,10,0,126,125,1,0,0,0,127,130,1,0,0,0,128,126,1,0,0,0,128,129,
        1,0,0,0,129,132,1,0,0,0,130,128,1,0,0,0,131,117,1,0,0,0,131,124,
        1,0,0,0,132,21,1,0,0,0,133,134,5,13,0,0,134,135,5,20,0,0,135,23,
        1,0,0,0,136,137,5,20,0,0,137,138,5,14,0,0,138,139,3,4,2,0,139,140,
        5,15,0,0,140,25,1,0,0,0,141,142,5,20,0,0,142,143,5,16,0,0,143,144,
        3,4,2,0,144,27,1,0,0,0,145,146,5,17,0,0,146,147,3,24,12,0,147,29,
        1,0,0,0,13,39,41,55,64,70,72,74,88,96,115,121,128,131
    ]

class jsBachParser ( Parser ):

    grammarFileName = "jsBach.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'('", "')'", "'<-'", "'<?>'", "'<!>'", 
                     "'if'", "'|:'", "':|'", "'else'", "'while'", "'{'", 
                     "'}'", "'#'", "'['", "']'", "'<<'", "'8<'", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "'+'", "'-'", "'*'", "'/'", 
                     "'%'", "'=='", "'/='", "'<'", "'>'", "'<='", "'>='" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "KEY", "NUM", "VAR", "MES", 
                      "MENYS", "MUL", "DIV", "MOD", "EQ", "NEQ", "LT", "GT", 
                      "LEQ", "GEQ", "COMMENT", "STR", "WS" ]

    RULE_root = 0
    RULE_body = 1
    RULE_expr = 2
    RULE_assig = 3
    RULE_read = 4
    RULE_write = 5
    RULE_if_block = 6
    RULE_else_block = 7
    RULE_while_block = 8
    RULE_array = 9
    RULE_numsNkeys = 10
    RULE_getLength = 11
    RULE_getElem = 12
    RULE_addElem = 13
    RULE_rmElem = 14

    ruleNames =  [ "root", "body", "expr", "assig", "read", "write", "if_block", 
                   "else_block", "while_block", "array", "numsNkeys", "getLength", 
                   "getElem", "addElem", "rmElem" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    KEY=18
    NUM=19
    VAR=20
    MES=21
    MENYS=22
    MUL=23
    DIV=24
    MOD=25
    EQ=26
    NEQ=27
    LT=28
    GT=29
    LEQ=30
    GEQ=31
    COMMENT=32
    STR=33
    WS=34

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

        def body(self):
            return self.getTypedRuleContext(jsBachParser.BodyContext,0)


        def EOF(self):
            return self.getToken(jsBachParser.EOF, 0)

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
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 30
            self.body()
            self.state = 31
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

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(jsBachParser.ExprContext)
            else:
                return self.getTypedRuleContext(jsBachParser.ExprContext,i)


        def assig(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(jsBachParser.AssigContext)
            else:
                return self.getTypedRuleContext(jsBachParser.AssigContext,i)


        def read(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(jsBachParser.ReadContext)
            else:
                return self.getTypedRuleContext(jsBachParser.ReadContext,i)


        def write(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(jsBachParser.WriteContext)
            else:
                return self.getTypedRuleContext(jsBachParser.WriteContext,i)


        def if_block(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(jsBachParser.If_blockContext)
            else:
                return self.getTypedRuleContext(jsBachParser.If_blockContext,i)


        def while_block(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(jsBachParser.While_blockContext)
            else:
                return self.getTypedRuleContext(jsBachParser.While_blockContext,i)


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
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 41
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << jsBachParser.T__0) | (1 << jsBachParser.T__3) | (1 << jsBachParser.T__4) | (1 << jsBachParser.T__5) | (1 << jsBachParser.T__9) | (1 << jsBachParser.T__10) | (1 << jsBachParser.T__12) | (1 << jsBachParser.T__16) | (1 << jsBachParser.NUM) | (1 << jsBachParser.VAR))) != 0):
                self.state = 39
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,0,self._ctx)
                if la_ == 1:
                    self.state = 33
                    self.expr(0)
                    pass

                elif la_ == 2:
                    self.state = 34
                    self.assig()
                    pass

                elif la_ == 3:
                    self.state = 35
                    self.read()
                    pass

                elif la_ == 4:
                    self.state = 36
                    self.write()
                    pass

                elif la_ == 5:
                    self.state = 37
                    self.if_block()
                    pass

                elif la_ == 6:
                    self.state = 38
                    self.while_block()
                    pass


                self.state = 43
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

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(jsBachParser.ExprContext)
            else:
                return self.getTypedRuleContext(jsBachParser.ExprContext,i)


        def NUM(self):
            return self.getToken(jsBachParser.NUM, 0)

        def VAR(self):
            return self.getToken(jsBachParser.VAR, 0)

        def array(self):
            return self.getTypedRuleContext(jsBachParser.ArrayContext,0)


        def getElem(self):
            return self.getTypedRuleContext(jsBachParser.GetElemContext,0)


        def getLength(self):
            return self.getTypedRuleContext(jsBachParser.GetLengthContext,0)


        def addElem(self):
            return self.getTypedRuleContext(jsBachParser.AddElemContext,0)


        def rmElem(self):
            return self.getTypedRuleContext(jsBachParser.RmElemContext,0)


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
            self.state = 55
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
            if la_ == 1:
                self.state = 45
                self.match(jsBachParser.T__0)
                self.state = 46
                self.expr(0)
                self.state = 47
                self.match(jsBachParser.T__1)
                pass

            elif la_ == 2:
                self.state = 49
                _la = self._input.LA(1)
                if not(_la==jsBachParser.NUM or _la==jsBachParser.VAR):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass

            elif la_ == 3:
                self.state = 50
                self.array()
                pass

            elif la_ == 4:
                self.state = 51
                self.getElem()
                pass

            elif la_ == 5:
                self.state = 52
                self.getLength()
                pass

            elif la_ == 6:
                self.state = 53
                self.addElem()
                pass

            elif la_ == 7:
                self.state = 54
                self.rmElem()
                pass


            self._ctx.stop = self._input.LT(-1)
            self.state = 74
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,6,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 72
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
                    if la_ == 1:
                        localctx = jsBachParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 57
                        if not self.precpred(self._ctx, 9):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 9)")
                        self.state = 58
                        _la = self._input.LA(1)
                        if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << jsBachParser.EQ) | (1 << jsBachParser.NEQ) | (1 << jsBachParser.LT) | (1 << jsBachParser.GT) | (1 << jsBachParser.LEQ) | (1 << jsBachParser.GEQ))) != 0)):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 59
                        self.expr(10)
                        pass

                    elif la_ == 2:
                        localctx = jsBachParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 60
                        if not self.precpred(self._ctx, 8):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 8)")
                        self.state = 61
                        _la = self._input.LA(1)
                        if not(_la==jsBachParser.MUL or _la==jsBachParser.DIV):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 64
                        self._errHandler.sync(self)
                        la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
                        if la_ == 1:
                            self.state = 62
                            self.expr(0)
                            pass

                        elif la_ == 2:
                            self.state = 63
                            self.match(jsBachParser.VAR)
                            pass


                        pass

                    elif la_ == 3:
                        localctx = jsBachParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 66
                        if not self.precpred(self._ctx, 7):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 7)")
                        self.state = 67
                        _la = self._input.LA(1)
                        if not(_la==jsBachParser.MES or _la==jsBachParser.MENYS):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 70
                        self._errHandler.sync(self)
                        la_ = self._interp.adaptivePredict(self._input,4,self._ctx)
                        if la_ == 1:
                            self.state = 68
                            self.expr(0)
                            pass

                        elif la_ == 2:
                            self.state = 69
                            self.match(jsBachParser.VAR)
                            pass


                        pass

             
                self.state = 76
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
            self.state = 77
            self.match(jsBachParser.VAR)
            self.state = 78
            self.match(jsBachParser.T__2)
            self.state = 79
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
            self.state = 81
            self.match(jsBachParser.T__3)
            self.state = 82
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
            self.state = 88
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 84
                self.match(jsBachParser.T__4)
                self.state = 85
                self.match(jsBachParser.STR)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 86
                self.match(jsBachParser.T__4)
                self.state = 87
                self.expr(0)
                pass


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
            return self.getTypedRuleContext(jsBachParser.ExprContext,0)


        def body(self):
            return self.getTypedRuleContext(jsBachParser.BodyContext,0)


        def else_block(self):
            return self.getTypedRuleContext(jsBachParser.Else_blockContext,0)


        def getRuleIndex(self):
            return jsBachParser.RULE_if_block

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIf_block" ):
                return visitor.visitIf_block(self)
            else:
                return visitor.visitChildren(self)




    def if_block(self):

        localctx = jsBachParser.If_blockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_if_block)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 90
            self.match(jsBachParser.T__5)
            self.state = 91
            self.expr(0)
            self.state = 92
            self.match(jsBachParser.T__6)
            self.state = 93
            self.body()
            self.state = 94
            self.match(jsBachParser.T__7)
            self.state = 96
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==jsBachParser.T__8:
                self.state = 95
                self.else_block()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Else_blockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def body(self):
            return self.getTypedRuleContext(jsBachParser.BodyContext,0)


        def getRuleIndex(self):
            return jsBachParser.RULE_else_block

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitElse_block" ):
                return visitor.visitElse_block(self)
            else:
                return visitor.visitChildren(self)




    def else_block(self):

        localctx = jsBachParser.Else_blockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_else_block)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 98
            self.match(jsBachParser.T__8)
            self.state = 99
            self.match(jsBachParser.T__6)
            self.state = 100
            self.body()
            self.state = 101
            self.match(jsBachParser.T__7)
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
            return self.getTypedRuleContext(jsBachParser.ExprContext,0)


        def body(self):
            return self.getTypedRuleContext(jsBachParser.BodyContext,0)


        def getRuleIndex(self):
            return jsBachParser.RULE_while_block

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitWhile_block" ):
                return visitor.visitWhile_block(self)
            else:
                return visitor.visitChildren(self)




    def while_block(self):

        localctx = jsBachParser.While_blockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_while_block)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 103
            self.match(jsBachParser.T__9)
            self.state = 104
            self.expr(0)
            self.state = 105
            self.match(jsBachParser.T__6)
            self.state = 106
            self.body()
            self.state = 107
            self.match(jsBachParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArrayContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def numsNkeys(self):
            return self.getTypedRuleContext(jsBachParser.NumsNkeysContext,0)


        def getRuleIndex(self):
            return jsBachParser.RULE_array

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArray" ):
                return visitor.visitArray(self)
            else:
                return visitor.visitChildren(self)




    def array(self):

        localctx = jsBachParser.ArrayContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_array)
        try:
            self.state = 115
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,9,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 109
                self.match(jsBachParser.T__10)
                self.state = 110
                self.numsNkeys()
                self.state = 111
                self.match(jsBachParser.T__11)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 113
                self.match(jsBachParser.T__10)
                self.state = 114
                self.match(jsBachParser.T__11)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class NumsNkeysContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUM(self):
            return self.getToken(jsBachParser.NUM, 0)

        def VAR(self):
            return self.getToken(jsBachParser.VAR, 0)

        def numsNkeys(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(jsBachParser.NumsNkeysContext)
            else:
                return self.getTypedRuleContext(jsBachParser.NumsNkeysContext,i)


        def KEY(self):
            return self.getToken(jsBachParser.KEY, 0)

        def getRuleIndex(self):
            return jsBachParser.RULE_numsNkeys

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNumsNkeys" ):
                return visitor.visitNumsNkeys(self)
            else:
                return visitor.visitChildren(self)




    def numsNkeys(self):

        localctx = jsBachParser.NumsNkeysContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_numsNkeys)
        self._la = 0 # Token type
        try:
            self.state = 131
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [jsBachParser.NUM, jsBachParser.VAR]:
                self.enterOuterAlt(localctx, 1)
                self.state = 117
                _la = self._input.LA(1)
                if not(_la==jsBachParser.NUM or _la==jsBachParser.VAR):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 121
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,10,self._ctx)
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt==1:
                        self.state = 118
                        self.numsNkeys() 
                    self.state = 123
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,10,self._ctx)

                pass
            elif token in [jsBachParser.KEY]:
                self.enterOuterAlt(localctx, 2)
                self.state = 124
                self.match(jsBachParser.KEY)
                self.state = 128
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,11,self._ctx)
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt==1:
                        self.state = 125
                        self.numsNkeys() 
                    self.state = 130
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,11,self._ctx)

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


    class GetLengthContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VAR(self):
            return self.getToken(jsBachParser.VAR, 0)

        def getRuleIndex(self):
            return jsBachParser.RULE_getLength

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitGetLength" ):
                return visitor.visitGetLength(self)
            else:
                return visitor.visitChildren(self)




    def getLength(self):

        localctx = jsBachParser.GetLengthContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_getLength)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 133
            self.match(jsBachParser.T__12)
            self.state = 134
            self.match(jsBachParser.VAR)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class GetElemContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VAR(self):
            return self.getToken(jsBachParser.VAR, 0)

        def expr(self):
            return self.getTypedRuleContext(jsBachParser.ExprContext,0)


        def getRuleIndex(self):
            return jsBachParser.RULE_getElem

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitGetElem" ):
                return visitor.visitGetElem(self)
            else:
                return visitor.visitChildren(self)




    def getElem(self):

        localctx = jsBachParser.GetElemContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_getElem)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 136
            self.match(jsBachParser.VAR)
            self.state = 137
            self.match(jsBachParser.T__13)
            self.state = 138
            self.expr(0)
            self.state = 139
            self.match(jsBachParser.T__14)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AddElemContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VAR(self):
            return self.getToken(jsBachParser.VAR, 0)

        def expr(self):
            return self.getTypedRuleContext(jsBachParser.ExprContext,0)


        def getRuleIndex(self):
            return jsBachParser.RULE_addElem

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAddElem" ):
                return visitor.visitAddElem(self)
            else:
                return visitor.visitChildren(self)




    def addElem(self):

        localctx = jsBachParser.AddElemContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_addElem)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 141
            self.match(jsBachParser.VAR)
            self.state = 142
            self.match(jsBachParser.T__15)
            self.state = 143
            self.expr(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RmElemContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def getElem(self):
            return self.getTypedRuleContext(jsBachParser.GetElemContext,0)


        def getRuleIndex(self):
            return jsBachParser.RULE_rmElem

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRmElem" ):
                return visitor.visitRmElem(self)
            else:
                return visitor.visitChildren(self)




    def rmElem(self):

        localctx = jsBachParser.RmElemContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_rmElem)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 145
            self.match(jsBachParser.T__16)
            self.state = 146
            self.getElem()
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
                return self.precpred(self._ctx, 9)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 8)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 7)
         




