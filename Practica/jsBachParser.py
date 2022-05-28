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
        4,1,25,84,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,5,1,26,8,1,10,1,12,
        1,29,9,1,1,2,1,2,1,2,1,2,1,2,1,2,3,2,37,8,2,1,2,1,2,1,2,1,2,1,2,
        1,2,1,2,3,2,46,8,2,1,2,1,2,1,2,1,2,3,2,52,8,2,5,2,54,8,2,10,2,12,
        2,57,9,2,1,3,1,3,1,3,1,3,1,4,1,4,1,4,1,5,1,5,1,5,1,5,3,5,70,8,5,
        1,6,1,6,1,6,1,6,1,6,1,6,1,7,1,7,1,7,1,7,1,7,1,7,1,7,0,1,4,8,0,2,
        4,6,8,10,12,14,0,4,1,0,10,11,1,0,17,22,1,0,14,15,1,0,12,13,88,0,
        16,1,0,0,0,2,27,1,0,0,0,4,36,1,0,0,0,6,58,1,0,0,0,8,62,1,0,0,0,10,
        69,1,0,0,0,12,71,1,0,0,0,14,77,1,0,0,0,16,17,3,2,1,0,17,18,5,0,0,
        1,18,1,1,0,0,0,19,26,3,4,2,0,20,26,3,6,3,0,21,26,3,8,4,0,22,26,3,
        10,5,0,23,26,3,12,6,0,24,26,3,14,7,0,25,19,1,0,0,0,25,20,1,0,0,0,
        25,21,1,0,0,0,25,22,1,0,0,0,25,23,1,0,0,0,25,24,1,0,0,0,26,29,1,
        0,0,0,27,25,1,0,0,0,27,28,1,0,0,0,28,3,1,0,0,0,29,27,1,0,0,0,30,
        31,6,2,-1,0,31,32,5,1,0,0,32,33,3,4,2,0,33,34,5,2,0,0,34,37,1,0,
        0,0,35,37,7,0,0,0,36,30,1,0,0,0,36,35,1,0,0,0,37,55,1,0,0,0,38,39,
        10,4,0,0,39,40,7,1,0,0,40,54,3,4,2,5,41,42,10,3,0,0,42,45,7,2,0,
        0,43,46,3,4,2,0,44,46,5,11,0,0,45,43,1,0,0,0,45,44,1,0,0,0,46,54,
        1,0,0,0,47,48,10,2,0,0,48,51,7,3,0,0,49,52,3,4,2,0,50,52,5,11,0,
        0,51,49,1,0,0,0,51,50,1,0,0,0,52,54,1,0,0,0,53,38,1,0,0,0,53,41,
        1,0,0,0,53,47,1,0,0,0,54,57,1,0,0,0,55,53,1,0,0,0,55,56,1,0,0,0,
        56,5,1,0,0,0,57,55,1,0,0,0,58,59,5,11,0,0,59,60,5,3,0,0,60,61,3,
        4,2,0,61,7,1,0,0,0,62,63,5,4,0,0,63,64,5,11,0,0,64,9,1,0,0,0,65,
        66,5,5,0,0,66,70,5,24,0,0,67,68,5,5,0,0,68,70,3,4,2,0,69,65,1,0,
        0,0,69,67,1,0,0,0,70,11,1,0,0,0,71,72,5,6,0,0,72,73,3,4,2,0,73,74,
        5,7,0,0,74,75,3,2,1,0,75,76,5,8,0,0,76,13,1,0,0,0,77,78,5,9,0,0,
        78,79,3,4,2,0,79,80,5,7,0,0,80,81,3,2,1,0,81,82,5,8,0,0,82,15,1,
        0,0,0,8,25,27,36,45,51,53,55,69
    ]

class jsBachParser ( Parser ):

    grammarFileName = "jsBach.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'('", "')'", "'<-'", "'<?>'", "'<!>'", 
                     "'if'", "'|:'", "':|'", "'while'", "<INVALID>", "<INVALID>", 
                     "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'/='", 
                     "'<'", "'>'", "'<='", "'>='" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "NUM", "VAR", "MES", "MENYS", 
                      "MUL", "DIV", "MOD", "EQ", "NEQ", "LT", "GT", "LEQ", 
                      "GEQ", "COMMENT", "STR", "WS" ]

    RULE_root = 0
    RULE_body = 1
    RULE_expr = 2
    RULE_assig = 3
    RULE_read = 4
    RULE_write = 5
    RULE_if_block = 6
    RULE_while_block = 7

    ruleNames =  [ "root", "body", "expr", "assig", "read", "write", "if_block", 
                   "while_block" ]

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
    NUM=10
    VAR=11
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
            self.state = 16
            self.body()
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
            self.state = 27
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << jsBachParser.T__0) | (1 << jsBachParser.T__3) | (1 << jsBachParser.T__4) | (1 << jsBachParser.T__5) | (1 << jsBachParser.T__8) | (1 << jsBachParser.NUM) | (1 << jsBachParser.VAR))) != 0):
                self.state = 25
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,0,self._ctx)
                if la_ == 1:
                    self.state = 19
                    self.expr(0)
                    pass

                elif la_ == 2:
                    self.state = 20
                    self.assig()
                    pass

                elif la_ == 3:
                    self.state = 21
                    self.read()
                    pass

                elif la_ == 4:
                    self.state = 22
                    self.write()
                    pass

                elif la_ == 5:
                    self.state = 23
                    self.if_block()
                    pass

                elif la_ == 6:
                    self.state = 24
                    self.while_block()
                    pass


                self.state = 29
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
            self.state = 36
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [jsBachParser.T__0]:
                self.state = 31
                self.match(jsBachParser.T__0)
                self.state = 32
                self.expr(0)
                self.state = 33
                self.match(jsBachParser.T__1)
                pass
            elif token in [jsBachParser.NUM, jsBachParser.VAR]:
                self.state = 35
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
            self.state = 55
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,6,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 53
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
                    if la_ == 1:
                        localctx = jsBachParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 38
                        if not self.precpred(self._ctx, 4):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                        self.state = 39
                        _la = self._input.LA(1)
                        if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << jsBachParser.EQ) | (1 << jsBachParser.NEQ) | (1 << jsBachParser.LT) | (1 << jsBachParser.GT) | (1 << jsBachParser.LEQ) | (1 << jsBachParser.GEQ))) != 0)):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 40
                        self.expr(5)
                        pass

                    elif la_ == 2:
                        localctx = jsBachParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 41
                        if not self.precpred(self._ctx, 3):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                        self.state = 42
                        _la = self._input.LA(1)
                        if not(_la==jsBachParser.MUL or _la==jsBachParser.DIV):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 45
                        self._errHandler.sync(self)
                        la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
                        if la_ == 1:
                            self.state = 43
                            self.expr(0)
                            pass

                        elif la_ == 2:
                            self.state = 44
                            self.match(jsBachParser.VAR)
                            pass


                        pass

                    elif la_ == 3:
                        localctx = jsBachParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 47
                        if not self.precpred(self._ctx, 2):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                        self.state = 48
                        _la = self._input.LA(1)
                        if not(_la==jsBachParser.MES or _la==jsBachParser.MENYS):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 51
                        self._errHandler.sync(self)
                        la_ = self._interp.adaptivePredict(self._input,4,self._ctx)
                        if la_ == 1:
                            self.state = 49
                            self.expr(0)
                            pass

                        elif la_ == 2:
                            self.state = 50
                            self.match(jsBachParser.VAR)
                            pass


                        pass

             
                self.state = 57
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
            self.state = 58
            self.match(jsBachParser.VAR)
            self.state = 59
            self.match(jsBachParser.T__2)
            self.state = 60
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
            self.state = 62
            self.match(jsBachParser.T__3)
            self.state = 63
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
            self.state = 69
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 65
                self.match(jsBachParser.T__4)
                self.state = 66
                self.match(jsBachParser.STR)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 67
                self.match(jsBachParser.T__4)
                self.state = 68
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
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 71
            self.match(jsBachParser.T__5)
            self.state = 72
            self.expr(0)
            self.state = 73
            self.match(jsBachParser.T__6)
            self.state = 74
            self.body()
            self.state = 75
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
        self.enterRule(localctx, 14, self.RULE_while_block)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 77
            self.match(jsBachParser.T__8)
            self.state = 78
            self.expr(0)
            self.state = 79
            self.match(jsBachParser.T__6)
            self.state = 80
            self.body()
            self.state = 81
            self.match(jsBachParser.T__7)
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
         




