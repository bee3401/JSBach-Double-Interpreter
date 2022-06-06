import sys
import os
from antlr4 import *
from jsBachLexer import jsBachLexer
from jsBachParser import jsBachParser
#from TreeVisitor import TreeVisitor
from EvalVisitor import EvalVisitor

file = open(sys.argv[1])
input_stream = InputStream(file.read())

startFunc = "Main"

params = []

print(input_stream)

lexer = jsBachLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = jsBachParser(token_stream)
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