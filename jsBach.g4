grammar jsBach;
root : f EOF ;

f : PROC VAR* '|:' body ':|'  ;

body:       if_block
        |   while_block
        |   assig
        |   comments
        |   method_call
        |   write
        |   read
        ;

if_block: 'if' expr  '|:' body ':|';
while_block:'while' expr '|:' body ':|';
assig: VAR '<-' expr;


comments: COMMENT;

//method_call: PROC (VAR)*;
method_call: PROC expr*         ;

expr :  '(' expr ')'
    |   expr  (EQ | NEQ | LT | GT | LEQ | GEQ) expr                       
    |   expr  (MUL | DIV) (expr | VAR)      
    |   expr (MES | MENYS) (expr | VAR)     
    |   (NUM | VAR)
    |   array                                                         
;

array : '{' numsNkeys '}' | '{' '}'          ;
numsNkeys:   (NUM | VAR) ' ' numsNkeys*           
        | KEY ' ' numsNkeys*
        ;

getLength   :   '#' VAR             ;
getElem     :   VAR'['expr']'       ;
addElem     :   VAR '<<' VAR        ;
rmElem      :   '8<' getElem        ;



read      : '<?>'  VAR                      ;
write     : '<!>'  STR | '<!>' expr         ;
play      : '<:>' KEY  | '<!>' numsNkeys    ;

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