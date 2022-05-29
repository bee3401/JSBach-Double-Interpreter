# Generated from jsBach.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .jsBachParser import jsBachParser
else:
    from jsBachParser import jsBachParser

# This class defines a complete generic visitor for a parse tree produced by jsBachParser.

class jsBachVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by jsBachParser#root.
    def visitRoot(self, ctx:jsBachParser.RootContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsBachParser#body.
    def visitBody(self, ctx:jsBachParser.BodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsBachParser#expr.
    def visitExpr(self, ctx:jsBachParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsBachParser#assig.
    def visitAssig(self, ctx:jsBachParser.AssigContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsBachParser#read.
    def visitRead(self, ctx:jsBachParser.ReadContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsBachParser#write.
    def visitWrite(self, ctx:jsBachParser.WriteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsBachParser#if_block.
    def visitIf_block(self, ctx:jsBachParser.If_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsBachParser#else_block.
    def visitElse_block(self, ctx:jsBachParser.Else_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsBachParser#while_block.
    def visitWhile_block(self, ctx:jsBachParser.While_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsBachParser#array.
    def visitArray(self, ctx:jsBachParser.ArrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsBachParser#numsNkeys.
    def visitNumsNkeys(self, ctx:jsBachParser.NumsNkeysContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsBachParser#getLength.
    def visitGetLength(self, ctx:jsBachParser.GetLengthContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsBachParser#getElem.
    def visitGetElem(self, ctx:jsBachParser.GetElemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsBachParser#addElem.
    def visitAddElem(self, ctx:jsBachParser.AddElemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsBachParser#rmElem.
    def visitRmElem(self, ctx:jsBachParser.RmElemContext):
        return self.visitChildren(ctx)



del jsBachParser