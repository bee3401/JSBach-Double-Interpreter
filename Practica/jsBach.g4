grammar jsBach;

root : body EOF ;

body:   (    expr 
        |   assig
        |   read
        |   write
        |   if_block
        |   while_block
        )*
        ;

expr :  '(' expr ')'
    |   expr  (EQ | NEQ | LT | GT | LEQ | GEQ) expr                       
    |   expr  (MUL | DIV) (expr | VAR)      
    |   expr (MES | MENYS) (expr | VAR)     
    |   (NUM | VAR)
;

assig: VAR '<-' expr;

read      : '<?>'  VAR                      ;
write     : '<!>'  STR | '<!>' expr         ;

if_block: 'if' expr  '|:' body ':|' else_block?;
else_block: 'else' '|:' body ':|';
while_block:'while' expr '|:' body ':|';

NUM     : [0-9]+                    ;
VAR     : [a-z] [a-zA-Z_0-9]*       ;

MES     : '+' ;
MENYS   : '-' ;
MUL     : '*' ;
DIV     : '/' ;
MOD     : '%' ;

EQ      : '==';
NEQ     : '/=';
LT      : '<' ;
GT      : '>' ;
LEQ     : '<=';
GEQ     : '>=';

COMMENT  : '~~~' ~[\r\n]* '~~~' -> skip ;
STR   : '"' ~ '"'* '"'        ;
WS      : [ \n]+ -> skip ;

/*
root : expr EOF;

expr :  '(' expr ')'
    |   expr  (EQ | NEQ | LT | GT | LEQ | GEQ) expr                       
    |   expr  (MUL | DIV) (expr | VAR)      
    |   expr (MES | MENYS) (expr | VAR)     
    |   (NUM | VAR)
;

KEY     : [A-G]                     ; 
NUM     : [0-9]                     ;
VAR     : [a-z] [a-zA-Z_0-9]*       ;
PROC    : [A-Z] [a-zA-Z_0-9]*       ;


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
WS      : [ \n]+ -> skip ;*/