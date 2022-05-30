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
    '/=': lambda x, y: x != y,
    '<':  lambda x, y: x < y,
    '>':  lambda x, y: x > y,
    '<=': lambda x, y: x <= y,
    '>=': lambda x, y: x >= y
}


class EvalVisitor(jsBachVisitor):
    def __init__(self, start_function, parameters):
        self.variables          = {}
        self.local_variables    = {}
        self.methods            = {}
        self.parameters         = parameters
        self.original_values    = {}

        self.current_function = start_function
        self.array            = []
        self.function_stack   = []
        self.keys             = ['A', 'B', 'C', 'D', 'E', 'F', 'G']

        self.read_only        = True

    def visitRoot(self, ctx):
        #print("root")
        l = list(ctx.getChildren())
        i = 0

        #print("root length: " + str(len(l)))
       
        while i < len(l) and l[i].getText() != "<EOF>":
            function_info = self.visit(l[i])
            self.methods[function_info[0]] = (l[i], function_info[1])
            i += 1
        
        self.function_stack.append("Main")
        self.read_only = False
        
        print()
        print("-------------Output-------------")

        self.visit(self.methods["Main"][0])
        print(self.variables)
            

    def visitMethod_call(self, ctx):
        #print("visitMethod_call")
        l = list(ctx.getChildren())


        previous_function = self.current_function
        
        if l[0].getText() in self.methods:
            function_tag = l[0].getText() + "-" + str(len(self.function_stack))
            #print("method exists")
            # update state of local variables in our current function to variables
            self.variables[self.current_function] = self.local_variables

            # change scope
            if l[0].getText() in self.variables:
                new_local_variables = self.variables[function_tag]
            else:
                new_local_variables = {}
            
            # add parameters to local variables
            if len(l) > 1:
                parameter_values = []
                for p in range(1, len(l)):
                    value = self.visit(l[p])
                    parameter_values.append(value)

                if len(parameter_values) == len(self.methods[l[0].getText()][1]):
                    parameter_names = self.methods[l[0].getText()][1]
                    
                    for i in range(0, len(parameter_values)):
                        new_local_variables[parameter_names[i]] = parameter_values[i]
                
                else:
                    raise Exception("Unexpected number of parameters for this function")

                self.local_variables = new_local_variables
               #prin(self.local_variables)
            
            #change current function
            self.current_function = function_tag

            #call function
            function = self.methods[l[0].getText()][0]

            self.function_stack.append(self.current_function)
            self.visit(function)

            #undo everything
            self.variables[self.current_function] = self.local_variables

            # change scope
            old_local_variables = self.variables[previous_function]
           
            # add parameters to local variables
            
            self.local_variables = old_local_variables
            
            #change current function
            self.current_function = previous_function
            self.function_stack.pop()

        else:
            raise Exception("Unknown function")


    def visitFunction(self, ctx):
        #print("visitFunction")
        l = list(ctx.getChildren())
        
        if not self.read_only:
            #print("visitFunction")
            #print(len(l))
            if len(l) > 4:
                #print("function with params")
                i = 1
                while l[i].getText() != '|:':
                    i += 1

                #print("function call starts at " + str(i))
                self.visit(l[i+1])

            else: 
                #print("function w/o params")
                self.visit(l[2])
            
            self.variables[self.current_function] = self.local_variables
        
        else:
            #print("entra")
            #returns fuction name
            parameters = []

            if len(l) > 4:
                i = 1
                while l[i].getText() != '|:':
                    parameters.append(l[i].getText())
                    i += 1
            
            function_info = (l[0].getText(), parameters)
            return function_info

    def visitBody(self, ctx):
        #print("body")
        l = list(ctx.getChildren())
        i = 0

        while i < len(l):
            self.visit(l[i])
            i += 1

        #print("surt del while")
        #return "INFO :: ended body"

    def visitExpr(self, ctx):
        #print("visitExpr")
        l = list(ctx.getChildren())
        i = 0 # remains 0 if there is no brackets in the expression
        
        if len(l) == 1:
            
            txt = l[0].getText()
            #numeric value 
            if txt.isnumeric():
                #print("numeric " + txt)
                return int(txt)
            #variable
            elif txt in self.local_variables:
                #print("variable " + txt)
                ##print("value" + str(self.local_variables[txt]))
                return self.local_variables[txt]
            
            # elif for array management 
            else:
                #print("array " + txt)
                return self.visit(l[0])
                
        else:
            if l[0].getText() == '(':
                #print("entraaa")
                return self.visit(l[1])

            else:
                #print("entra here")
                a = self.visit(l[0])
                b = self.visit(l[2])

                #TODO: add variable id that is invalid or it doesn't make any sense to separate this
                if isinstance(a, str):
                    #print("true for a")
                    if a in self.local_variables:
                        a = self.local_variables[a]
                        
                    else:
                        raise Exception('Error: Variable not found or invalid value')
                
                if isinstance(b, str):
                    #print("True for b")
                    if b in self.local_variables:
                        b = self.local_variables[b]
                    else:
                        raise Exception('Error: Variable not found or invalid value')
                    
                if l[i+1].getText() in numeric_op_dictionary:
                    #print("this is a summy sum")
                    r = numeric_op_dictionary[l[i+1].getText()] (int(a), int(b))
                    #print(r)
                    return int(r)
                
                elif logical_op_dictionary[l[i+1].getText()] (int(a), int(b)) == True:
                    return 1
                else: 
                    return 0

    def visitAssig(self, ctx):
        #print("visitAssig")
        l = list(ctx.getChildren())
        #print(l[2].getText())
        #print("back?????????")
        #print(x)
        try:
            #print("try block start")
            #print(l[2].getText())
            self.local_variables[l[0].getText()] = int(self.visit(l[2]))
            #print("try block end")
        except:
            #print("except block start")
            #print(self.array)
            self.local_variables[l[0].getText()] = self.array
            self.array = []
           #prin("except block end")
       #prin(self.local_variables)
        #return "INFO :: added variable successfully"

    def visitRead(self, ctx):
       #prin("visitRead")
        l = list(ctx.getChildren())

        #TODO: probably might need to change this in a minute, when you add the Key thingies
        value = input()
        self.local_variables[l[1].getText()] = int(value)
        
        #return "INFO :: value read successfully"

    def visitWrite(self, ctx):
       #prin("visitWrite")
        l = list(ctx.getChildren())
        #TODO: same thing; control over Keys and regular strings
        output = ""
        for i in range(1, len(l)):
            if l[i].getText()[0] == '"': #isinstance(l[1].getText(), str) and l[1].getText() not in self.local_variables:  
                output += str(l[i].getText()).replace('"', ' ')

            else:
                output += str(self.visit(l[i])).replace('"', ' ')

            output += " "
        print(output)


    def visitIf_block(self, ctx):
       #prin("ifBlock")
        l = list(ctx.getChildren())
        condition = self.visit(l[1])

        if condition == 1:
            self.visit(l[3])
        
        elif len(l) > 5:
            self.visit(l[5])
            
    def visitElse_block(self, ctx):
       #prin("elseBlock")
        l = list(ctx.getChildren())
        self.visit(l[2])

    def visitWhile_block(self, ctx):
       #prin("visitWhile")
        l = list(ctx.getChildren())

        condition = self.visit(l[1])

        while condition == 1:
            self.visit(l[3])
            condition = self.visit(l[1])

        #return "INFO :: exit while: condition not met any longer"

    def visitArray(self, ctx):
       #prin("visitArray")
        l = list(ctx.getChildren())
        i = 0
        
        self.visit(l[1])

        #probably need a structure for arrays or use the variable one

    def visitNumsNkeys(self, ctx):
       #prin("visitNumsNKeys")
        l = list(ctx.getChildren())
        
        if l[0].getText() not in self.keys:
            self.array.append(int(l[0].getText()))
            if len(l) > 1:
                self.visit(l[1])

        else:
            raise Exception("not implemented yet")
        
    def visitGetElem(self, ctx):
       #prin("visitGetElement")
        l = list(ctx.getChildren())

        var = l[0].getText()
        
        if var in self.local_variables and isinstance(self.local_variables[var], list):            
            array = self.local_variables[var]
            
            if l[2].getText() in self.local_variables:
                i = int(self.visit(l[2]))
            
            elif l[2].getText().isnumeric():
                i = int(l[2].getText())
            
            else:
                raise Exception("Invalid index for array")
            
            if i in range(0, len(array)):
                return array[i]
            else:
                raise Exception("Index out of bounds")
        
        else:
            raise Exception("Array not found") 
                                
    def visitGetLength(self, ctx):
       #prin("getLength")
        l = list(ctx.getChildren())
        
        var = l[1].getText()
        #print("var " + var)
        #print(self.local_variables[var])
        
        if var in self.local_variables and isinstance(self.local_variables[var], list):
            #print("entra if")
            #print(len(self.local_variables[var]))
            return len(self.local_variables[var])
        
        else:
            raise Exception("Array not found") 

    def visitAddElem(self, ctx):
       #prin("visitAddElem")
        l = list(ctx.getChildren())
        var = l[0].getText()
        
        if var in self.local_variables and isinstance(self.local_variables[var], list):
            x = self.visit(l[2])
            
            #print("print value that has to be concatenated: ")
            #print(x)

            if isinstance(x, int):
                self.local_variables[var].append(x)
            
            elif isinstance(x, list):  
                self.local_variables[var] += x
            elif self.array:
                self.local_variables[var] += self.array
                self.array = []
            
        
        else:
            raise Exception("Variable not found or variable is not array")
    
    def visitRmElem(self, ctx):
       #prin("RmElem")
        l = list(ctx.getChildren())
        x = self.visit(l[1])
        var = l[1].getText()[0]
        #print(var)
        try:
            self.local_variables[var].remove(x)
        
        except:
            raise Exception("Value not in array")
        

    



        