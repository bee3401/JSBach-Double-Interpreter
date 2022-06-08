# Generated from jsbach.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .jsbachParser import jsbachParser
else:
    from jsbachParser import jsbachParser

# This class defines a complete generic visitor for a parse tree produced by jsbachParser.

class jsbachVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by jsbachParser#root.
    def visitRoot(self, ctx:jsbachParser.RootContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsbachParser#function.
    def visitFunction(self, ctx:jsbachParser.FunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsbachParser#body.
    def visitBody(self, ctx:jsbachParser.BodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsbachParser#method_call.
    def visitMethod_call(self, ctx:jsbachParser.Method_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsbachParser#expr.
    def visitExpr(self, ctx:jsbachParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsbachParser#assig.
    def visitAssig(self, ctx:jsbachParser.AssigContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsbachParser#read.
    def visitRead(self, ctx:jsbachParser.ReadContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsbachParser#write.
    def visitWrite(self, ctx:jsbachParser.WriteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsbachParser#play.
    def visitPlay(self, ctx:jsbachParser.PlayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsbachParser#if_block.
    def visitIf_block(self, ctx:jsbachParser.If_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsbachParser#else_block.
    def visitElse_block(self, ctx:jsbachParser.Else_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsbachParser#while_block.
    def visitWhile_block(self, ctx:jsbachParser.While_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsbachParser#array.
    def visitArray(self, ctx:jsbachParser.ArrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsbachParser#numsNkeys.
    def visitNumsNkeys(self, ctx:jsbachParser.NumsNkeysContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsbachParser#getLength.
    def visitGetLength(self, ctx:jsbachParser.GetLengthContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsbachParser#getElem.
    def visitGetElem(self, ctx:jsbachParser.GetElemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsbachParser#addElem.
    def visitAddElem(self, ctx:jsbachParser.AddElemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsbachParser#rmElem.
    def visitRmElem(self, ctx:jsbachParser.RmElemContext):
        return self.visitChildren(ctx)



del jsbachParser