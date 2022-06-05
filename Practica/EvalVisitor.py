from array import array
from re import X
from statistics import variance
from xml.dom.minidom import Element
#import mingus.extra.LilyPond as LilyPond


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
    '=': lambda x, y: x == y,
    '/=': lambda x, y: x != y,
    '<':  lambda x, y: x < y,
    '>':  lambda x, y: x > y,
    '<=': lambda x, y: x <= y,
    '>=': lambda x, y: x >= y
}

def decode_key(key):
    if len(key) > 2:
        raise Exception("Invalid Key")

    letters = ['A', 'B', 'C', 'D', 'E', 'F', 'G']
    letter = key[0]
    number = '4'        # C4 default 

    if len(key) > 1 :
        number = key[1]
    
    i = 0
    
    while i < len(letters) and letters[i] != letter:
        i = i + 1
    
    return 8*int(number) + i


class EvalVisitor(jsBachVisitor):
    def __init__(self, start_function, parameters):
        self.variables          = {}
        self.local_variables    = {}
        self.methods            = {}
        self.parameters         = parameters
        self.arrays             = {}

        self.current_function = start_function
        self.array            = []
        self.function_stack   = []

        self.read_only        = True

        self.keys             = ["A", "B", "C", "D", "E", "F", "G"]
        self.sheet            = []
        self.memory_sim       = {}
        self.first_av_address = 0

    def visitRoot(self, ctx):
        #print("root")
        l = list(ctx.getChildren())
        i = 0

        #print("root length: " + str(len(l)))
       
        while i < len(l) and l[i].getText() != "<EOF>":
            function_info = self.visit(l[i])
            self.methods[function_info[0]] = (l[i], function_info[1])
            i += 1
        
        self.function_stack.append(self.current_function)
        self.read_only = False
        
        print("------------------------Output------------------------")
        print()

        self.visit(self.methods[self.current_function][0])
        

        print()
        print("-------------Final State of all variables-------------")
        print()

        print(self.variables)
        print(self.arrays)
        print(self.memory_sim)

        print()
        print("--------------Final State of music sheet--------------")
        print()

        print(self.sheet)
            
        print()

    def visitMethod_call(self, ctx):
        print("visitMethod_call")
        l = list(ctx.getChildren())

        if l[0].getText() in self.methods:
            #print("method exists")
            previous_function = self.current_function
            pointers_to_remove = []
            parameter_names = self.methods[l[0].getText()][1]
            parameters_length = len(l) - 1

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

                if parameters_length == len(parameter_names):
                    for i in range(1, len(l)):
                        value = self.visit(l[i])
                            
                        if isinstance(value, int):
                            new_local_variables[parameter_names[i-1]] = value

                        elif isinstance(value, list):
                            #get the array's memory address
                            adr = self.memory_sim[l[i].getText()]

                            #set the memory address access for the parameter in the new function
                            self.memory_sim[parameter_names[i-1]] = adr
                            #array_accesses.append(l[i].getText())

                            #add it to the list of pointers to remove after returning from the function
                            pointers_to_remove.append(parameter_names[i-1])
                    
                    self.local_variables = new_local_variables
                
                else:
                    raise Exception("Unexpected number of parameters for this function")
            
            #change current function
            self.current_function = function_tag

            #call function
            function_pointer = self.methods[l[0].getText()][0]

            self.function_stack.append(self.current_function)

            self.visit(function_pointer)

            #undo everything
            self.variables[self.current_function] = self.local_variables

            # change scope
            old_local_variables = self.variables[previous_function]
           
            # add parameters to local variables
            
            self.local_variables = old_local_variables
            
            #remove array references
            for i in pointers_to_remove:
                self.memory_sim.pop(i)
            
            #change current function
            self.current_function = previous_function
            self.function_stack.pop()

        else:
            raise Exception("Unknown function")


    def visitFunction(self, ctx):
        print("visitFunction")
        l = list(ctx.getChildren())
        
        if not self.read_only:
            print(self.current_function)
            print(self.memory_sim)
            #print("visitFunction no-read")
            #print(len(l))
            if len(l) > 4:
                print("function with params")
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
            #returns fuction name
            parameters = []
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

    def visitExpr(self, ctx):
        #print("visitExpr")
        l = list(ctx.getChildren())
        i = 0 # remains 0 if there is no brackets in the expression
        
        #print(l[0].getText())

        if len(l) == 1:
            txt = l[0].getText()
            #print("len 1")
            
            #numeric value 
            if txt.isnumeric():
                #print("numeric " + txt)
                return int(txt)
            
            #variable
            elif txt in self.local_variables:
                #print("variable " + txt)
                ##print("value" + str(self.local_variables[txt]))
                return self.local_variables[txt]
            
            #management for arrays stored in variables
            elif txt in self.memory_sim:
                #print("array variable  " + txt)
                adr = self.memory_sim[txt]
                return self.arrays[adr]
            
            # elif for array management 
            elif txt[0] == '{':
                #print("array " + txt)
                return self.visit(l[0])
            
            else:
                try:
                    return self.visit(l[0])

                except:
                    print(l[0].getText())
                    raise Exception("Invalid element or unaccessible array")
                
        else:
            if l[0].getText() == '(':
                return self.visit(l[1])

            else:
                a = self.visit(l[0])
                b = self.visit(l[2])

                #TODO: add variable id that is invalid or it doesn't make any sense to separate this
                if isinstance(a, str):
                    if a in self.local_variables:
                        a = self.local_variables[a]
                        
                    else:
                        raise Exception('Error: Variable not found or invalid value')
                
                if isinstance(b, str):
                    if b in self.local_variables:
                        b = self.local_variables[b]
                    else:
                        raise Exception('Error: Variable not found or invalid value')
                    
                if l[i+1].getText() in numeric_op_dictionary:
                    r = numeric_op_dictionary[l[i+1].getText()] (int(a), int(b))
                    return int(r)
                
                elif logical_op_dictionary[l[i+1].getText()] (int(a), int(b)) == True:
                    return 1
                else: 
                    return 0

    def visitAssig(self, ctx):
        print("visitAssig")
        l = list(ctx.getChildren())
        
        value = self.visit(l[2])
    
        if isinstance(value, int):
            #print("assign int value")
            self.local_variables[l[0].getText()] = value
    
        elif isinstance(value, list):
            #print("assign array variable")
            #self.arrays[l[0].getText()] = value

            #find adress to this array
            adr = self.memory_sim[l[2].getText()]
            #add reference to array for the new variable
            self.memory_sim[l[0].getText()] = adr

        elif l[2].getText() in self.keys:
            #print("single key in assig")
            self.local_variables[l[0].getText()] = decode_key(l[2].getText())

        else:
            #print("direct array")
            #self.arrays[self.first_av_address] = self.array
            #self.array = []
            self.arrays[self.first_av_address] = self.array.copy()
            self.memory_sim[l[0].getText()] = self.first_av_address
            self.first_av_address = self.first_av_address + 1
            self.array.clear()


    def visitRead(self, ctx):
        #print("visitRead")
        l = list(ctx.getChildren())

        #TODO: probably might need to change this in a minute, when you add the Key thingies
        value = input()
        self.local_variables[l[1].getText()] = int(value)
        
        #return "INFO :: value read successfully"

    def visitWrite(self, ctx):
        #print("visitWrite")
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
        #print("visitArray")
        l = list(ctx.getChildren())
        i = 0
        
        self.visit(l[1])

        #probably need a structure for arrays or use the variable one

    def visitNumsNkeys(self, ctx):
        #print("visitNumsNKeys")
        l = list(ctx.getChildren())
        element = l[0].getText()[0]
        
        if element not in self.keys:
            #print("element not in self.keys (regular numbers)")
            self.array.append(int(l[0].getText()))

        else:
            #print("element is a key")
            key = decode_key(l[0].getText())
            self.array.append(key)
        
        if len(l) > 1:
            self.visit(l[1])

    def visitGetElem(self, ctx):
        print("visitGetElement")
        l = list(ctx.getChildren())
        var = l[0].getText()
        print(var)
        print(self.memory_sim)
        if var in self.memory_sim:  #self.local_variables and isinstance(self.local_variables[var], list): 
            print("var in memory")
            pos = 0
            adr = self.memory_sim[var]           
            array = self.arrays[adr]

            if l[2].getText() in self.local_variables:
                pos = pos + int(self.visit(l[2]))
            
            elif l[2].getText().isnumeric():
                pos = pos + int(l[2].getText())
            
            else:
                try:
                    sv = self.visit(l[2])
                    pos = pos + sv

                except: 
                    raise Exception("Invalid index for array")
            
            if pos in range(0, len(array)):
                return array[pos]
            
            else:
                raise Exception("Index out of bounds")
        
        else:
            raise Exception("Array not found") 
                                
    def visitGetLength(self, ctx):
        #print("getLength")
        l = list(ctx.getChildren())
        var = l[1].getText()
        #print("var " + var)
        #print(self.local_variables[var])
        if var in self.memory_sim: #self.local_variables and isinstance(self.local_variables[var], list):
            adr = self.memory_sim[var]
            return len(self.arrays[adr])#len(self.local_variables[var])
        
        else:
            raise Exception("Array not found") 

    def visitAddElem(self, ctx):
        #print("visitAddElem")
        l = list(ctx.getChildren())
        var = l[0].getText()
        
        if var in self.memory_sim: #self.local_variables and isinstance(self.local_variables[var], list):
            x = self.visit(l[2])
            adr = self.memory_sim(var)
            #print("print value that has to be concatenated: ")
            #print(x)

            if isinstance(x, int):
                #self.local_variables[var].append(x)
                self.arrays[adr].append(x)
            
            elif isinstance(x, list):  
                #self.local_variables[var] += x
                self.arrays[adr] += x
            
            elif self.array:
                #self.local_variables[var] += self.array
                self.arrays[adr] += self.array
                self.array = []
            
        else:
            raise Exception("Variable not found or variable is not array")
    
    def visitRmElem(self, ctx):
        #print("RmElem")
        l = list(ctx.getChildren())
        x = self.visit(l[1])
        var = l[1].getText().partition('[')[0]

        if var in self.memory_sim:
            adr = self.memory_sim(var)
            try:
                self.arrays[adr].remove(x)
            
            except:
                raise Exception("Value not in array")
        else:
            raise Exception("Array not found")


    def visitPlay(self, ctx):
        #print("visitPlay")
        l = list(ctx.getChildren())

        if len(l) == 2:
            if l[1].getText() in self.local_variables:
                self.sheet.append(self.local_variables[l[1].getText()])

            elif l[1].getText() in self.memory_sim:
                adr = self.memory_sim(l[1].getText())
                self.sheet.append(self.arrays[adr])

            else:
                key = decode_key(l[1].getText())
                self.sheet.append(key)

        else:
            self.visit(l[2])

            self.sheet = self.sheet + self.array
            self.array.clear()
  