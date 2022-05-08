grammar bach;
root : f+ EOF ;

f : PROC VAR* '|:' body ':|'  ;

body:   if_block
        |   while_block
        |   assig
        |   comments
        |   mcall
        |   write
        |   read
        ;

if_block: 'if' expr  '|:' body ':|';
while_block:'while' expr '|:' body ':|';
assig: VAR '<-' expr;
comments: COMMENT;
mcall: PROC (VAR)*;


expr : expr  (EQ | NEQ | LT | GT | LEQ | GEQ) expr                       
    |   expr  (MUL | DIV) (expr | VAR)      
    |   expr (MES | MENYS) (expr | VAR)     
    |   (NUM | VAR)                                                         
;


read      : '<?>'  VAR              ;
write     : '<!>'  STR              ;


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
WS      : [ \n]+ -> skip ;



