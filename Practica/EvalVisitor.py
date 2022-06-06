import os

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

def decode_key(key, encode):
    letters = ['A', 'B', 'C', 'D', 'E', 'F', 'G']
    if encode:
        if len(key) > 2:
            raise Exception("Invalid Key")

        letter = key[0]
        number = '4'        # C4 default 

        if len(key) > 1 :
            number = key[1]
        
        i = 0
        
        while i < len(letters) and letters[i] != letter:
            i = i + 1
        
        return 8*int(number) + i
    
    else:
        number = str(key//8)
        letter = str(letters[key%7]).lower()
        return letter + "'" + number

def generate_score(file, scores):
    f = open(file + ".lily", "w")
    
    f.write("\\" + "version " + '"' + "2.22.1" +'"'+"\n")
    f.write("\\" + "score {\n")
    f.write("    " + "\\" + "absolute {\n")
    f.write("        " + "\\" + "tempo 4 = 120\n")
    f.write("        " + scores + "\n")
    f.write("}\n")
    f.write("    " + "\\" + "layout { }\n")
    f.write("    " + "\\" + "midi { }\n")
    f.write("}")
    f.close()
    os.system("lilypond " + file + ".lily")
    os.system("timidity -Ow -o " + file + ".wav " + file + ".midi")
    os.system("ffmpeg -i " + file + ".wav -codec:a libmp3lame -qscale:a 2 " + file + ".mp3")
    os.system("afplay " + file + ".mp3")
     
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
        file = self.current_function
       
        while i < len(l) and l[i].getText() != "<EOF>":
            function_info = self.visit(l[i])
            self.methods[function_info[0]] = (l[i], function_info[1])
            i += 1
        
        self.memory_sim[self.current_function] = {}
        self.function_stack.append(self.current_function)
        self.read_only = False
        
        if len(self.parameters) > 0:
            if len(self.parameters) == len(self.methods[self.current_function][1]):
                variables = self.methods[self.current_function][1]
                self.variables[self.current_function] = {}
                
                for i in range(0, len(variables)):
                    self.variables[self.current_function][variables[i]] = int(self.parameters[i])
                
                self.local_variables = self.variables[self.current_function]
            else:
                raise Exception("Start function came with parameters but the right amount was not provided") 

        self.visit(self.methods[self.current_function][0])

        if len(self.sheet) != 0:
            generate_score(file, " ".join(self.sheet))

    def visitMethod_call(self, ctx):
       #print("visitMethod_call")
        l = list(ctx.getChildren())

        if l[0].getText() in self.methods:
            previous_function = self.current_function
            parameter_names = self.methods[l[0].getText()][1]
            parameters_length = len(l) - 1
            function_tag = l[0].getText() + "-" + str(len(self.function_stack))
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
                    self.memory_sim[function_tag] = {}                    
                    for i in range(1, len(l)):
                        value = self.visit(l[i])
                        if isinstance(value, int):
                            new_local_variables[parameter_names[i-1]] = value

                        elif isinstance(value, list):
                            #get the array's memory address
                            adr = self.memory_sim[self.current_function][l[i].getText()]
                            #set the memory address access for the parameter in the new function
                            self.memory_sim[function_tag][parameter_names[i-1]] = adr
                    
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
            #change current function
            self.current_function = previous_function
            self.function_stack.pop()
        else:
            raise Exception("Unknown function")


    def visitFunction(self, ctx):
        #print("visitFunction")
        l = list(ctx.getChildren())
        if not self.read_only:
            if len(l) > 4:
                i = 1
                while l[i].getText() != '|:':
                    i += 1
                self.visit(l[i+1])
            else: 
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
        l = list(ctx.getChildren())
        i = 0
        while i < len(l):
            self.visit(l[i])
            i += 1

    def visitExpr(self, ctx):
        #print("visitExpr")
        l = list(ctx.getChildren())
        i = 0 # remains 0 if there is no brackets in the expression
        if len(l) == 1:
            txt = l[0].getText()
            #numeric value 
            if txt.isnumeric():
                return int(txt)
            elif txt[0] in self.keys:
                return decode_key(txt, True)
            #variable
            elif txt in self.local_variables:
                return self.local_variables[txt]  
            #management for arrays stored in variables
            elif txt in self.memory_sim[self.current_function]:
                adr = self.memory_sim[self.current_function][txt]
                return self.arrays[adr]
            # elif for array management 
            elif txt[0] == '{':
                return self.visit(l[0]) 
            else:
                try:
                    return self.visit(l[0])

                except:
                    raise Exception("Invalid element or unaccessible array")   
        else:
            if l[0].getText() == '(':
                return self.visit(l[1])
            else:
                a = self.visit(l[0])
                b = self.visit(l[2])
                if l[i+1].getText() in numeric_op_dictionary:
                    r = numeric_op_dictionary[l[i+1].getText()] (int(a), int(b))
                    return int(r)
                elif logical_op_dictionary[l[i+1].getText()] (int(a), int(b)) == True:
                    return 1
                else: 
                    return 0

    def visitAssig(self, ctx):
        #print("visitAssig")
        l = list(ctx.getChildren())
        value = self.visit(l[2])
        if isinstance(value, int):
            self.local_variables[l[0].getText()] = value
        elif isinstance(value, list):
            #find adress to this array
            adr = self.memory_sim[self.current_function][l[2].getText()]
            #add reference to array for the new variable
            self.memory_sim[self.current_function][l[0].getText()] = adr
        elif l[2].getText()[0] in self.keys:
            self.local_variables[l[0].getText()] = decode_key(l[2].getText(), True)
        else:
            self.arrays[self.first_av_address] = self.array.copy()
            self.memory_sim[self.current_function][l[0].getText()] = self.first_av_address
            self.first_av_address = self.first_av_address + 1
            self.array.clear()

    def visitRead(self, ctx):
       #print("visitRead")
        l = list(ctx.getChildren())
        #TODO: probably might need to change this in a minute, when you add the Key thingies
        value = input()
        self.local_variables[l[1].getText()] = int(value)

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

    def visitArray(self, ctx):
       #print("visitArray")
        l = list(ctx.getChildren())        
        self.visit(l[1])

    def visitNumsNkeys(self, ctx):
       #print("visitNumsNKeys")
        l = list(ctx.getChildren())
        element = l[0].getText()[0]
        if element not in self.keys:
            self.array.append(int(l[0].getText()))
        else:
            key = decode_key(l[0].getText(), True)
            self.array.append(key)
        if len(l) > 1:
            self.visit(l[1])

    def visitGetElem(self, ctx):
       #print("visitGetElement")
        l = list(ctx.getChildren())
        var = l[0].getText()
        if var in self.memory_sim[self.current_function]:  #self.local_variables and isinstance(self.local_variables[var], list): 
            pos = 0
            adr = self.memory_sim[self.current_function][var]           
            array = self.arrays[adr]
            if l[2].getText() in self.local_variables:
                pos = int(self.visit(l[2]))
            elif l[2].getText().isnumeric():
                pos = int(l[2].getText())
            else:
                try:
                    sv = self.visit(l[2])
                    pos = sv
                except: 
                    raise Exception("Invalid index for array")
            if pos in range(0, len(array)+1):
                return array[pos-1]
            else:
                raise Exception("Index out of bounds")
        else:
            raise Exception("Array not found") 
                                
    def visitGetLength(self, ctx):
       #print("getLength")
        l = list(ctx.getChildren())
        var = l[1].getText()
        if var in self.memory_sim[self.current_function]: #self.local_variables and isinstance(self.local_variables[var], list):
            adr = self.memory_sim[self.current_function][var]
            return len(self.arrays[adr])#len(self.local_variables[var])
        else:
            raise Exception("Array not found") 

    def visitAddElem(self, ctx):
       #print("visitAddElem")
        l = list(ctx.getChildren())
        var = l[0].getText()
        if var in self.memory_sim[self.current_function]: #self.local_variables and isinstance(self.local_variables[var], list):
            x = self.visit(l[2])
            adr = self.memory_sim[self.current_function][var]
            if isinstance(x, int):
                self.arrays[adr].append(x)
            elif isinstance(x, list):  
                self.arrays[adr] += x
            elif self.array:
                self.arrays[adr] += self.array
                self.array = []    
        else:
            raise Exception("Variable not found or variable is not array")
    
    def visitRmElem(self, ctx):
       #print("RmElem")
        l = list(ctx.getChildren())
        x = self.visit(l[1])
        var = l[1].getText().partition('[')[0]
        if var in self.memory_sim[self.current_function]:
            adr = self.memory_sim[self.current_function][var]
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
                self.sheet.append(decode_key(self.local_variables[l[1].getText()], False))
            elif l[1].getText() in self.memory_sim[self.current_function]:
                adr = self.memory_sim[self.current_function][l[1].getText()]
                key_array = []
                for i in self.arrays[adr]:
                    key_array.append(decode_key(i, False))
                self.sheet.append(self.arrays[adr])
            else:
                self.sheet.append(l[1].getText())
        else:
            self.visit(l[2])
            key_array = []
            for i in self.array:
                key_array.append(decode_key(i, False))

            self.sheet = self.sheet + key_array
            self.array.clear()