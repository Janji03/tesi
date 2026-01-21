grammar ToyChoreo;

// ---- Parser rules ----

program
  : stmt* EOF
  ;

stmt
  : letStmt
  | sendStmt
  | ifStmt
  | raceStmt
  ;

letStmt
  : LET ID ASSIGN ID SEMI
  ;

sendStmt
  : SEND ID ARROW ID COLON ID SEMI
  ;

ifStmt
  : IF LPAREN ID RPAREN block ELSE block
  ;

raceStmt
  : RACE ID block OR block SEMI
  ;

block
  : LBRACE stmt* RBRACE
  ;

// ---- Lexer rules ----

LET   : 'let';
SEND  : 'send';
IF    : 'if';
ELSE  : 'else';
RACE  : 'race';
OR    : 'or';

ARROW : '->';
ASSIGN: '=';
COLON : ':';
SEMI  : ';';

LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';

ID
  : [a-zA-Z_][a-zA-Z0-9_]*
  ;

// whitespace + newlines ignored
WS
  : [ \t\r\n]+ -> skip
  ;
