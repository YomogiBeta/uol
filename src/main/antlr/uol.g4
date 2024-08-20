grammar uol;

/**
 * lexer
 */
NEWLINE : [\r\n]+ ;
WS: [ \t\n\r\f]+ -> skip ;

DECIMAL_LITERAL : ('0' | [1-9] Digits?) [lL]?;
HEX_LITERAL     : '0' [xX] [0-9a-fA-F] ([0-9a-fA-F])? [lL]?;
OCT_LITERAL     : '0' '_'* [0-7] ([0-7])? [lL]?;
BINARY_LITERAL  : '0' [bB] [01] ([01])? [lL]?;

BOOL_LITERAL: 'true' | 'false';
STRING_LITERAL: '"' (~["\\\r\n])* '"';
NIL_LITERAL: 'nil';

IMPORT: 'import';
FROM: 'from';
CLASS: 'class';
EXTENDS: 'extends';
IMPLEMENTS: 'implements';
MODIFIER: 'public' | 'private';
INSTRUCTION: 'final' | 'static' | 'native';
FUNCTION: 'function';
NEW: 'new';
IF: 'if';
ELSEIF: 'else if';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';

ASSIGN: '=' | 'is';
ADDITIVE_OPERATOR: '+' | '-';
MULTIPLY_OPERATOR: '*' | '/' | '%';
CONDITIONAL_OPERATOR: '==' | '!=' | '<' | '<=' | '>' | '>=';
CONDITIONAL_LOGICAL_OPERATOR: 'and' | 'or';


RETURN: 'return';

IDENTIFIER: Letter LetterOrDigit*;

fragment Digits: [0-9] ([0-9_]* [0-9])?;
fragment Letter: [a-zA-Z_] ;
fragment LetterOrDigit: Letter | [0-9];

/**
 * parser
*/

prog:	(NEWLINE)* (statement NEWLINE)* ;
statement
    :   partsImportStatement
    |   fileImportStatement
    |   classDefine
    |   expression
    ;

expression
    : literal
    | listDefine
    | listDefineWithKey
    | lambdaDefine
    | chainExpression
    | callExpression
    | assignExpression
    | functionDefine
    | instanceExpression
    | booleanConditionExpression
    | booleanLoopExpression
    | forEachExpression
    | additiveExpression
    ;

responseExpression
    : chainExpression
    | callExpression
    | additiveExpression
    ;

iterableExpression
    :   STRING_LITERAL
    |   IDENTIFIER
    |   listDefine
    |   listDefineWithKey
    |   lambdaDefine
    |   chainExpression
    |   callExpression
    ;

expressionList
     :   (expression (NEWLINE)*)*
     ;

fileImportStatement
    : IMPORT IDENTIFIER FROM STRING_LITERAL
    ;

partsImportStatement
    : IMPORT partsImportContentList FROM STRING_LITERAL
    ;

partsImportContentList
    : (partsImportContent (NEWLINE)*)*
    ;

partsImportContent
    : '{' (IDENTIFIER (',' IDENTIFIER)*)? '}'
    ;

classDefine
    :   CLASS IDENTIFIER (extendPart)? (interfaceParts)? '{' classPartsList '}'
    ;

 extendPart
    : (EXTENDS IDENTIFIER)
    ;

 interfaceParts
    : (IMPLEMENTS interfaceList)
    ;

 interfaceList
    : IDENTIFIER (',' IDENTIFIER)*
    ;

classParts
    : memberDefine
    | MODIFIER functionDefine
    ;

classPartsList
    : (classParts (NEWLINE)*)*
    ;

memberDefine
    : MODIFIER (INSTRUCTION)? assignExpression
    ;

functionDefine
    :  FUNCTION IDENTIFIER lambdaDefine
    ;

lambdaDefine
    :  '(' argumentDefineList? ')' '{' lambdaBody '}'
    ;

returnExpression
    : RETURN expression
    ;

lambdaBody
    : returnExpression
    | expressionList
    ;

argumentDefineList
    :   IDENTIFIER (',' IDENTIFIER)* argumentDefaultList*
    ;

argumentDefaultList
    :  (',' IDENTIFIER ASSIGN literal)
    ;

instanceExpression
    :   NEW IDENTIFIER '(' argumentList? ')'
    ;

booleanConditionExpression
    :   IF '(' conditionExpressionList ')' '{' expressionList '}'
    |   IF '(' conditionExpressionList ')' '{' expressionList '}' ELSE '{' expressionList '}'
    |   IF '(' conditionExpressionList ')' '{' expressionList '}' ELSEIF '(' conditionExpressionList ')' '{' expressionList '}'
    |   IF '(' conditionExpressionList ')' '{' expressionList '}' ELSEIF '(' conditionExpressionList ')' '{' expressionList '}' ELSE '{' expressionList '}'
    ;

booleanLoopExpression
    :   WHILE '(' conditionExpressionList ')' '{' expressionList '}'
    ;

forEachExpression
    :   FOR '(' IDENTIFIER 'in' iterableExpression ')' '{' expressionList '}'
    ;

conditionExpressionList
    :   conditionExpression (CONDITIONAL_LOGICAL_OPERATOR conditionExpression)*
    ;

conditionExpression
    :   expression (CONDITIONAL_OPERATOR expression)?
    ;

assignExpression: IDENTIFIER ASSIGN expression ;

chainExpression
    :   elementExpression ('.' (IDENTIFIER | callExpression))*
    ;

callExpression
    :   IDENTIFIER '(' argumentList? ')'
    |   IDENTIFIER IDENTIFIER (': ' argumentList)?
    ;

argumentList
    :   expression (',' expression)*
    ;

additiveExpression
    :	multiplicativeExpression (ADDITIVE_OPERATOR multiplicativeExpression)*
    ;

multiplicativeExpression
    :	unaryExpression (MULTIPLY_OPERATOR unaryExpression)*
    ;

unaryExpression
    :   literal
    |   '(' responseExpression ')';


listDefine
    :   '[' (expression (',' expression)*)* ']'
    ;

listDefineWithKey
    :   '{' listDefineWithKeyContent (',' listDefineWithKeyContent)*'}'
    ;

listDefineWithKeyContent
    :  STRING_LITERAL ': ' expression
    ;

elementExpression
    :   unaryExpression
    |   instanceExpression
    |   callExpression
    ;

literal
    : integerLiteral
    | IDENTIFIER
    | STRING_LITERAL
    | BOOL_LITERAL
    | NIL_LITERAL
    ;

integerLiteral
    : DECIMAL_LITERAL
    | HEX_LITERAL
    | OCT_LITERAL
    | BINARY_LITERAL
    ;