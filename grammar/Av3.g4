grammar Av3;

@header {
package com.teoria_computacao.av3.parser;
}

// --- PARSER RULES ---

prog
    : (declaration | statement)+ EOF
    ;

// Variable Declarations
declaration
    : type ID ';'                     #VarDecl
    | type ID '=' expression ';'      #VarInitDecl
    ;

type
    : INT_T
    | DOUBLE_T
    | BOOL_T
    ;

// Statements
statement
    : assignment ';'                  #StmtAssign
    | IF '(' expression ')' statement (ELSE statement)? #StmtIfElse  // Corrigi para ELSE ser opcional
    | WHILE '(' expression ')' statement              #StmtWhile
    | DO statement WHILE '(' expression ')' ';'       #StmtDoWhile
    | FOR '(' forInit ';' expression ';' forUpdate ')' statement #StmtFor
    | PRINTF '(' printfArgs ')' ';'   #StmtPrintf
    | SCANF '(' ID ')' ';'            #StmtScanf
    | block                           #StmtBlock
    ;

// Block
block
    : '{' (declaration | statement)* '}'
    ;

// Assignment (used in stmt and parts of for)
assignment
    : ID '=' expression
    ;

// For loop parts
forInit
    : assignment
    | forDeclaration
    ;

forDeclaration
    : type ID                         #ForVarDecl
    | type ID '=' expression          #ForInitDecl
    ;

forUpdate
    : assignment
    ;

// --- Expressions (Precedence) ---

expression
    : orExpression
    ;

orExpression
    : andExpression (OR andExpression)*
    ;

andExpression
    : eqExpression (AND eqExpression)*
    ;

eqExpression
    : relExpression ((EQ | NEQ) relExpression)*
    ;

relExpression
    : addExpression ((LT | LTE | GT | GTE) addExpression)*
    ;

addExpression
    : mulExpression ((PLUS | MINUS) mulExpression)*
    ;

mulExpression
    : unaryExpression ((MUL | DIV | MOD) unaryExpression)*
    ;

unaryExpression
    : (NOT | PLUS | MINUS) unaryExpression
    | primary
    ;

primary
    : '(' expression ')'
    | literal
    | ID
    ;

literal
    : INT_LIT
    | DOUBLE_LIT
    | bool_lit
    | STRING_LIT
    ;

bool_lit
    : TRUE
    | FALSE
    ;

// printf arguments
printfArgs
    : STRING_LIT (',' expression)*
    | expression (',' expression)*
    ;


// --- LEXER RULES ---

// Keywords
IF      : 'if';
ELSE    : 'else';
WHILE   : 'while';
DO      : 'do';
FOR     : 'for';
PRINTF  : 'printf';
SCANF   : 'scanf';
INT_T   : 'int';
DOUBLE_T: 'double';
BOOL_T  : 'bool';
TRUE    : 'true';
FALSE   : 'false';

// Operators and punctuation
PLUS    : '+';
MINUS   : '-';
MUL     : '*';
DIV     : '/';
MOD     : '%';
EQ      : '==';
NEQ     : '!=';
LT      : '<';
LTE     : '<=';
GT      : '>';
GTE     : '>=';
AND     : '&&';
OR      : '||';
NOT     : '!';
ASSIGN  : '=';
LPAREN  : '(';
RPAREN  : ')';
LBRACE  : '{';
RBRACE  : '}';
COMMA   : ',';
SEMI    : ';';

// Identifiers
ID      : [a-zA-Z_] [a-zA-Z_0-9]*;

// Numeric literals
DOUBLE_LIT
    : DIGITS '.' DIGITS (EXP_PART)?
    | DIGITS '.' (EXP_PART)?
    | '.' DIGITS (EXP_PART)?
    | DIGITS EXP_PART
    ;

INT_LIT : DIGITS ;

fragment DIGITS    : [0-9]+ ;
fragment EXP_PART  : [eE] [+\-]? DIGITS ;

// Boolean literals
BOOL_LIT: TRUE | FALSE ;

// String literals for printf
STRING_LIT
    : '"' ( ~["\\] | '\\' . )* '"'
    ;

// Ignored whitespace
WS      : [ \t\r\n]+ -> skip ;

// Comments
LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;

BLOCK_COMMENT
    : '/*' .*? '*/' -> skip
    ;