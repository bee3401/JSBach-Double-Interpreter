import sys
from antlr4 import *
from jsbachLexer import jsbachLexer
from jsbachParser import jsbachParser
from EvalVisitor import EvalVisitor

file = open(sys.argv[1])
input_stream = InputStream(file.read())

startFunc = "Main"

params = []

print(input_stream)

lexer = jsbachLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = jsbachParser(token_stream)
tree = parser.root()

if len(sys.argv) > 2:
    startFunc = sys.argv[2]
    i = 3
    while i < len(sys.argv):
        params.append(sys.argv[i])
        i += 1

visitor = EvalVisitor(startFunc, params)
visitor.visit(tree)

#tree = parser.root() 
#visitor = TreeVisitor()
#visitor.visit(tree)