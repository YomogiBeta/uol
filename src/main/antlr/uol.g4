grammar uol;

/**
 * lexer
 */
NEWLINE : [\r\n]+ ;
WS: [ \t\n\r\f]+ -> skip ;
SINGLE_COMMET: '//' ~[\r\n]* -> skip;
MULTI_COMMET: '/*' .*? '*/' -> skip;

DECIMAL_LITERAL : ('0' | [1-9] Digits?) [lL]?;
HEX_LITERAL     : '0' [xX] [0-9a-fA-F] ([0-9a-fA-F])? [lL]?;
OCT_LITERAL     : '0' '_'* [0-7] ([0-7])? [lL]?;
BINARY_LITERAL  : '0' [bB] [01] ([01])? [lL]?;

BOOL_LITERAL: 'true' | 'false';
STRING_LITERAL: '"' (~["\\\r\n])* '"';
NIL_LITERAL: 'nil';

IMPORT: 'import';
AS: 'as';
FROM: 'from';
CLASS: 'class';
EXTENDS: 'extends';
IMPLEMENTS: 'implements';
MODIFIER: 'public' | 'private';
INSTRUCTION: 'final' | 'static' | 'primitive' | 'primitiveOnly';
FUNCTION: 'function';
NEW: 'new';
IF: 'if';
ELSE: 'else';

ASSIGN: '=' | ':=';
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
//    |   fileImportStatement
    |   classDefine
    |   expression
    ;

expression
    : literal
//    | listDefine
//    | listDefineWithKey
    | lambdaDefine
    | instanceExpression
    | callExpression
    | chainExpression
    | assignExpression
    | functionDefine
    | booleanConditionExpression
    | additiveExpression
    ;

responseExpression
    : literal
    | callExpression
    | chainExpression
    | additiveExpression
    ;

//iterableExpression
//    :   STRING_LITERAL
//    |   IDENTIFIER
////    |   listDefine
////    |   listDefineWithKey
//    |   lambdaDefine
//    |   callExpression
//    |   chainExpression
//    ;

expressionList
     : (expression (NEWLINE)*)* (returnExpression (NEWLINE)*)?
     ;

//fileImportStatement
//    : IMPORT IDENTIFIER FROM STRING_LITERAL
//    ;

partsImportStatement
    : IMPORT partsImportContentList FROM STRING_LITERAL
    ;

partsImportContentList
    : '{' (partsImportContent (',' partsImportContent)*)? '}'
    ;

partsImportContent
    : IDENTIFIER
    | IDENTIFIER AS IDENTIFIER
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

classPartsList
    : (classParts (NEWLINE)*)*
    ;

classParts
    : memberDefine
    | messageDefine
    ;

messageDefine
    : MODIFIER (INSTRUCTION)? functionDefine
    ;

memberDefine
    : MODIFIER (INSTRUCTION)? assignExpression
    ;

functionDefine
    :  FUNCTION IDENTIFIER lambdaDefine
    ;

lambdaDefine
    :  '(' argumentDefineList ')' '{' lambdaBody '}'
    ;

returnExpression
    : RETURN responseExpression
    ;

lambdaBody
    : expressionList
    ;

argumentDefineList
    :   arugumentNonDefaultList*  argumentDefaultList
    |   argumentDefaultList
    ;

arugumentNonDefaultList
    :   argumentNonDefault (',' argumentNonDefault)*
    ;

argumentNonDefault
    :   IDENTIFIER
    ;

argumentDefaultList
    :   (argumentDefault)* (',' argumentDefault)*
    ;

argumentDefault
    :   IDENTIFIER ASSIGN literal
    ;

instanceExpression
    :   NEW IDENTIFIER '(' argumentList? ')'
    ;

booleanConditionExpression
    :  IF condition conditionBody (conditionAnotherBody)*
    ;

condition
    :  '(' conditionExpressionList ')'
    ;

conditionBody
    :   '{' expressionList '}'
    ;

conditionAnotherBody
    : ELSE '{' expressionList '}'
    ;

conditionExpressionList
    :   conditionExpression (CONDITIONAL_LOGICAL_OPERATOR conditionExpression)*
    ;

conditionExpression
    :   expression (CONDITIONAL_OPERATOR expression)?
    ;

assignExpression: assignAbleExpression ASSIGN expression ;

assignAbleExpression
    :   unaryExpression
    |   chainExpression
    ;

chainExpression
    :   elementExpression ('.' (elementExpression))*
    ;

callExpression
    :   IDENTIFIER '(' argumentList? ')'
    |   IDENTIFIER IDENTIFIER (': ' argumentList)?
    ;

argumentList
    :   argumentContent (',' argumentContent)*
    ;

argumentContent
    : expression
    ;

additiveExpression
    :	multiplicativeExpression (ADDITIVE_OPERATOR multiplicativeExpression)*
    ;

multiplicativeExpression
    :	unaryExpression (MULTIPLY_OPERATOR unaryExpression)*
    ;

unaryExpression
    :   callExpression
    |   literal
    |   '(' responseExpression ')';


//listDefine
//    :   '[' (expression (',' expression)*)* ']'
//    ;
//
//listDefineWithKey
//    :   '{' listDefineWithKeyContent (',' listDefineWithKeyContent)*'}'
//    ;
//
//listDefineWithKeyContent
//    :  STRING_LITERAL ': ' expression
//    ;

elementExpression
    :   callExpression
    |   instanceExpression
    |   unaryExpression
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
