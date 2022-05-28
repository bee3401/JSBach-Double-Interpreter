if __name__ is not None and "." in __name__:
    from .jsBachParser import jsBachParser
    from .jsBachVisitor import jsBachVisitor
else:
    from jsBachParser import jsBachParser
    from jsBachVisitor import jsBachVisitor

class TreeVisitor(jsBachVisitor):
    def __init__(self):
        self.nivell = 0
        
    def visitExpr(self, ctx):
        l = list(ctx.getChildren())
        if len(l) == 1:
            print("  " * self.nivell +
                  jsBachParser.symbolicNames[l[0].getSymbol().type] +
                  '(' +l[0].getText() + ')')
        else:  # len(l) == 3
            i = 0

            if l[0].getText()  == '(':
                i = 1

            op = l[i].getText()

            if op == '+':
                print('  ' *  self.nivell + 'ADD(+)')
                self.nivell += 1
                self.visit(l[0])
                self.visit(l[2])
                self.nivell -= 1

            elif op == '-':
                print('  ' *  self.nivell + 'SUBS(-)')
                self.nivell += 1
                self.visit(l[0])
                self.visit(l[2])
                self.nivell -= 1

            elif op == '*':
                print('  ' *  self.nivell + 'MUL(*)')
                self.nivell += 1
                self.visit(l[0])
                self.visit(l[2])
                self.nivell -= 1

            elif op == '/':
                print('  ' *  self.nivell + 'DIV(/)')
                self.nivell += 1
                self.visit(l[0])
                self.visit(l[2])
                self.nivell -= 1