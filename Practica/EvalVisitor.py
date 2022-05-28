from statistics import variance


if __name__ is not None and "." in __name__:
    from .jsBachParser import jsBachParser
    from .jsBachVisitor import jsBachVisitor
else:
    from jsBachParser import jsBachParser
    from jsBachVisitor import jsBachVisitor


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


class EvalVisitor(jsBachVisitor):
    def __init__(self, start_function, parameters):
        self.variables          = {}
        self.methods            = {}
        self.parameters         = parameters
        self.original_values    = {}

        self.start_function = start_function
        self.array          = []
        self.method_stack   = []

    def visitRoot(self, ctx):
        l = list(ctx.getChildren())
        i = 0

        while i < len(l) and l[i].getText() != "<EOF>":
            print(self.visit(l[i]))
            i += 1

    def visitExpr(self, ctx):
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
            if isinstance(a, str):
                if a in self.variables:
                    a = self.variables[a]
                    
                else:
                    raise Exception('Error: Variable not found or invalid value')
            
            if isinstance(b, str):
                if b in self.variables:
                    b = self.variables[b]
                else:
                    raise Exception('Error: Variable not found or invalid value')
                
            if l[i+1].getText() in numeric_op_dictionary:
                return numeric_op_dictionary[l[i+1].getText()] (int(a), int(b))
            elif logical_op_dictionary[l[i+1].getText()] (int(a), int(b)) == True:
                return 1
            else: 
                return 0

    def visitAssig(self, ctx):
        l = list(ctx.getChildren())
        self.variables[l[0].getText()] = int(l[2].getText())
        return "added variable successfully"

    def visitRead(self, ctx):
        l = list(ctx.getChildren())

        #TODO: probably might need to change this in a minute, when you add the Key thingies
        value = input()
        self.variables[l[1].getText()] = int(value)
        
        return "value read successfully"

    def visitWrite(self, ctx):
        l = list(ctx.getChildren())
        #TODO: same thing; control over Keys and regular strings
        if isinstance(l[1].getText(), str) and l[1].getText() not in self.variables:
            output = l[1].getText()

        else:
            output = self.visit(l[1])

        return output
        