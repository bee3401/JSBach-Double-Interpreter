grammar jsb;

root : function+ EOF ;

function: METHOD_NAME VAR* '|:' body ':|';

body:   (    expr 
        |   assig
        |   read
        |   write
        |   play
        |   if_block
        |   while_block
        |   method_call
        )*
        ;

method_call: METHOD_NAME expr*  ;

expr :  '(' expr ')'
    |   expr  (EQ | NEQ | LT | GT | LEQ | GEQ) expr                       
    |   expr  (MUL | DIV) (expr | VAR)      
    |   expr (MES | MENYS) (expr | VAR)     
    |   (NUM | VAR | KEY)
    |   array
    |   getElem
    |   getLength
    |   addElem
    |   rmElem
    ;

assig: VAR '<-' (expr);

read      : '<?>'  VAR                          ;
write     : '<!>'  (STR | expr)+                ;
play      : '<:>'  (KEY | '{' numsNkeys '}'| VAR)    ;

if_block: 'if' (expr|KEY)  '|:' body ':|' else_block?;
else_block: 'else' '|:' body ':|';
while_block: 'while' (expr) '|:' body ':|';

array : '{' numsNkeys '}' | '{' '}'          ;
numsNkeys:   (NUM | VAR) numsNkeys*           
        | KEY numsNkeys*
        ;

getLength   :   '#' VAR             ;
getElem     :   VAR'['expr']'       ;
addElem     :   VAR '<<' expr       ;
rmElem      :   '8<' getElem        ;

KEY             : [A-G] [0-8]?              ; //? since no numeric value mean C4 D4 .. B4
NUM             : [0-9]+                    ;
VAR             : [a-z] [a-zA-Z_0-9]*       ;
METHOD_NAME     : [A-Z] [a-zA-Z_0-9]*       ;

MES     : '+' ;
MENYS   : '-' ;
MUL     : '*' ;
DIV     : '/' ;
MOD     : '%' ;

EQ      : '=';
NEQ     : '/=';
LT      : '<' ;
GT      : '>' ;
LEQ     : '<=';
GEQ     : '>=';

COMMENT  : '~~~' ~[\r\n]* '~~~' -> skip ;
STR   : '"' ~ '"'* '"'        ;
WS      : [ \n]+ -> skip ;
