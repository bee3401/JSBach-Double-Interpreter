# Generated from jsBach.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .jsBachParser import jsBachParser
else:
    from jsBachParser import jsBachParser

numeric_op_dictionary = {
    '+': lambda x, y: x + y,
    '-': lambda x, y: x - y,
    '*': lambda x, y: x * y,
    '/': lambda x, y: x // y,
    '^': lambda x, y: x ^ y
}

logical_op_dictionary = {
    '==': lambda x, y: x == y,
    '<>': lambda x, y: x != y,
    '<':  lambda x, y: x < y,
    '>':  lambda x, y: x > y,
    '<=': lambda x, y: x <= y,
    '>=': lambda x, y: x >= y
}


# This class defines a complete generic visitor for a parse tree produced by jsBachParser.

class jsBachVisitor(ParseTreeVisitor):

    def __init__(self, first_function, parameters):
        self.variables  = {}
        self.methods    = {}
        self.params     = {}
        self.original_values = {}

        self.array      = []
        self.method_stack = []

    # Visit a parse tree produced by jsBachParser#root.
    def visitRoot(self, ctx:jsBachParser.RootContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsBachParser#f.
    def visitF(self, ctx:jsBachParser.FContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsBachParser#body.
    def visitBody(self, ctx:jsBachParser.BodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsBachParser#if_block.
    def visitIf_block(self, ctx:jsBachParser.If_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsBachParser#while_block.
    def visitWhile_block(self, ctx:jsBachParser.While_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsBachParser#assig.
    def visitAssig(self, ctx:jsBachParser.AssigContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsBachParser#comments.
    def visitComments(self, ctx:jsBachParser.CommentsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsBachParser#method_call.
    def visitMethod_call(self, ctx:jsBachParser.Method_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsBachParser#expr.
    def visitExpr(self, ctx:jsBachParser.ExprContext):
        l = list(ctx.getChildren())
        i = 0 # remains 0 if there is no brackets in the expression

        
        if len(l) == 1:
            txt = l[0].getText()
            #numeric value 
            if txt.isnumeric():
                return int(txt)
            #variable
            elif txt in self.variables:
                return self.variables[txt]
            # elif for array management 
            else:
                raise Exception('Variable not found or invalid value')

        else:
            #brackets in expression
            if l[0].getText() == '(':
                i = 1

            a = self.visit(l[i])
            b = self.visit(l[i+2])
            
            #TODO: add variable id that is invalid or it doesn't make any sense to separate this
            if a in self.variables:
                a = self.variables[a]
            else:
                raise Exception('Error: Variable not found or invalid value')
            
            if b in self.variables:
                b = self.variables[b]
            else:
                    raise Exception('Error: Variable not found or invalid value')
            
            if l[i+1].getText() in numeric_op_dictionary:
                return numeric_op_dictionary[l[i].getText()] (int(a), int(b))
            elif logical_op_dictionary[l[i+1].getText()] (int(a), int(b)) == True:
                return 1
            else: 
                return 0



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


    # Visit a parse tree produced by jsBachParser#read.
    def visitRead(self, ctx:jsBachParser.ReadContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsBachParser#write.
    def visitWrite(self, ctx:jsBachParser.WriteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jsBachParser#play.
    def visitPlay(self, ctx:jsBachParser.PlayContext):
        return self.visitChildren(ctx)



del jsBachParser