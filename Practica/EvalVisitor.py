from array import array
from statistics import variance
from xml.dom.minidom import Element


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
        self.keys           = ['A', 'B', 'C', 'D', 'E', 'F', 'G']

    def visitRoot(self, ctx):
        #print("root")
        l = list(ctx.getChildren())
        i = 0

        #print("root length: " + str(len(l)))

        while i < len(l) and l[i].getText() != "<EOF>":
            self.visit(l[i])
            i += 1
        
        print(self.variables)

    def visitBody(self, ctx):
        #print("body")
        l = list(ctx.getChildren())
        i = 0
        
        while i < len(l) and l[i].getText() != "<EOF>":
            self.visit(l[i])
            i += 1

        #return "INFO :: ended body"

    def visitExpr(self, ctx):
        print("visitExpr")
        l = list(ctx.getChildren())
        i = 0 # remains 0 if there is no brackets in the expression
 
        if len(l) == 1:
            txt = l[0].getText()
            #numeric value 
            if txt.isnumeric():
                print("numeric " + txt)
                return int(txt)
            #variable
            elif txt in self.variables:
                print("variable " + txt)
                print(self.variables[txt])
                return self.variables[txt]
            
            # elif for array management 
            else:
                print("array " + txt)
                return self.visit(l[0])
                
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
        print("visitAssig")
        l = list(ctx.getChildren())

        try:
            #print("try block start")
            #print(l[2].getText())
            self.variables[l[0].getText()] = int(self.visit(l[2]))
            #print("try block end")
        except:
            #print("except block start")
            #print(self.array)
            self.variables[l[0].getText()] = self.array
            self.array = []
            #print("except block end")

        #return "INFO :: added variable successfully"

    def visitRead(self, ctx):
        #print("visitRead")
        l = list(ctx.getChildren())

        #TODO: probably might need to change this in a minute, when you add the Key thingies
        value = input()
        self.variables[l[1].getText()] = int(value)
        
        #return "INFO :: value read successfully"

    def visitWrite(self, ctx):
        #print("visitWrite")
        l = list(ctx.getChildren())
        #TODO: same thing; control over Keys and regular strings
        if isinstance(l[1].getText(), str) and l[1].getText() not in self.variables:
            output = l[1].getText()

        else:
            output = self.visit(l[1])

        #print(output)

    def visitIf_block(self, ctx):
        #print("ifBlock")
        l = list(ctx.getChildren())
        condition = self.visit(l[1])

        if condition == 1:
            self.visit(l[3])
        
        elif len(l) > 5:
            self.visit(l[5])
            
    def visitElse_block(self, ctx):
        #print("elseBlock")
        l = list(ctx.getChildren())
        self.visit(l[2])

    def visitWhile_block(self, ctx):
        #print("visitWhile")
        l = list(ctx.getChildren())

        condition = self.visit(l[1])

        while condition == 1:
            self.visit(l[3])
            condition = self.visit(l[1])

        #return "INFO :: exit while: condition not met any longer"

    def visitArray(self, ctx):
        print("visitArray")
        l = list(ctx.getChildren())
        i = 0
        
        self.visit(l[1])

        #probably need a structure for arrays or use the variable one

    def visitNumsNkeys(self, ctx):
        print("visitNumsNKeys")
        l = list(ctx.getChildren())
        
        if l[0].getText() not in self.keys:
            self.array.append(int(l[0].getText()))
            if len(l) > 1:
                self.visit(l[1])

        else:
            raise Exception("not implemented yet")
        
    def visitGetElem(self, ctx):
        #print("visitGetElement")
        l = list(ctx.getChildren())

        var = l[0].getText()
        
        if var in self.variables and isinstance(self.variables[var], list):            
            array = self.variables[var]
            i = int(l[2].getText())
            
            if i in range(0, len(array)):
                return array[i]
            else:
                raise Exception("Index out of bounds")
        
        else:
            raise Exception("Array not found") 
                                
    def visitGetLength(self, ctx):
        #print("getLength")
        l = list(ctx.getChildren())
        
        var = l[1].getText()
        #print("var " + var)
        #print(self.variables[var])
        
        if var in self.variables and isinstance(self.variables[var], list):
            #print("entra if")
            #print(len(self.variables[var]))
            return len(self.variables[var])
        
        else:
            raise Exception("Array not found") 

    def visitAddElem(self, ctx):
        print("visitAddElem")
        l = list(ctx.getChildren())
        var = l[0].getText()
        
        if var in self.variables and isinstance(self.variables[var], list):
            x = self.visit(l[2])
            
            print("print value that has to be concatenated: ")
            print(x)

            if isinstance(x, int):
                self.variables[var].append(x)
            
            elif isinstance(x, list):  
                self.variables[var] += x
            elif self.array:
                self.variables[var] += self.array
                self.array = []
            
        
        else:
            raise Exception("Variable not found or variable is not array")
    
    def visitRmElem(self, ctx):
        print("RmElem")
        l = list(ctx.getChildren())
        x = self.visit(l[1])
        var = l[1].getText()[0]
        print(var)
        try:
            self.variables[var].remove(x)
        
        except:
            raise Exception("Value not in array")
            


        



        