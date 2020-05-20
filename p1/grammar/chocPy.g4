grammar chocPy;


/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 by Bart Kiers
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 * Project      : python3-parser; an ANTLR4 grammar for Python 3
 *                https://github.com/bkiers/python3-parser
 * Developed by : Bart Kiers, bart@big-o.nl
 */


// All comments that start with "///" are copy-pasted from
// The Python Language Reference

tokens { INDENT, DEDENT }

@lexer::members {
  // A queue where extra tokens are pushed on (see the NEWLINE lexer rule).
  private java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
  // The stack that keeps track of the indentation level.
  private java.util.Stack<Integer> indents = new java.util.Stack<>();
  // The amount of opened braces, brackets and parenthesis.
  private int opened = 0;
  // The most recently produced token.
  private Token lastToken = null;
  @Override
  public void emit(Token t) {
    super.setToken(t);
    tokens.offer(t);
  }

  @Override
  public Token nextToken() {
    // Check if the end-of-file is ahead and there are still some DEDENTS expected.
    if (_input.LA(1) == EOF && !this.indents.isEmpty()) {
      // Remove any trailing EOF tokens from our buffer.
      for (int i = tokens.size() - 1; i >= 0; i--) {
        if (tokens.get(i).getType() == EOF) {
          tokens.remove(i);
        }
      }

      // First emit an extra line break that serves as the end of the statement.
      this.emit(commonToken(chocPyParser.NEWLINE, "\n"));

      // Now emit as much DEDENT tokens as needed.
      while (!indents.isEmpty()) {
        this.emit(createDedent());
        indents.pop();
      }

      // Put the EOF back on the token stream.
      this.emit(commonToken(chocPyParser.EOF, "<EOF>"));
    }

    Token next = super.nextToken();

    if (next.getChannel() == Token.DEFAULT_CHANNEL) {
      // Keep track of the last token on the default channel.
      this.lastToken = next;
    }

    return tokens.isEmpty() ? next : tokens.poll();
  }

  private Token createDedent() {
    CommonToken dedent = commonToken(chocPyParser.DEDENT, "");
    dedent.setLine(this.lastToken.getLine());
    return dedent;
  }

  private CommonToken commonToken(int type, String text) {
    int stop = this.getCharIndex() - 1;
    int start = text.isEmpty() ? stop : stop - text.length() + 1;
    return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
  }

  // Calculates the indentation of the provided spaces, taking the
  // following rules into account:
  //
  // "Tabs are replaced (from left to right) by one to eight spaces
  //  such that the total number of characters up to and including
  //  the replacement is a multiple of eight [...]"
  //
  //  -- https://docs.python.org/3.1/reference/lexical_analysis.html#indentation
  static int getIndentationCount(String spaces) {
    int count = 0;
    for (char ch : spaces.toCharArray()) {
      switch (ch) {
        case '\t':
          count += 8 - (count % 8);
          break;
        default:
          // A normal space char.
          count++;
      }
    }

    return count;
  }

  boolean atStartOfInput() {
    return super.getCharPositionInLine() == 0 && super.getLine() == 1;
  }
}

/*
 * parser rules
 */
program
    : (var_def | func_def | class_def)* stmt* EOF
    ;

class_def
    : CLASS IDENTIFIER TK_PAR_IZQ (IDENTIFIER|OBJECT) TK_PAR_DER TK_DOS_PUNTOS NEWLINE INDENT class_body DEDENT
    ;

class_body
    : PASS (NEWLINE| EOF)       #class_bodypass
    | (var_def | metd_def)+     #class_bodydefinicion
    ;

func_def
    : DEF IDENTIFIER TK_PAR_IZQ (typed_var(TK_COMA typed_var)*)? TK_PAR_DER (TK_EJECUTA type)? TK_DOS_PUNTOS NEWLINE INDENT func_body DEDENT
    ;

metd_def
    : DEF (IDENTIFIER|INIT) TK_PAR_IZQ SELF TK_DOS_PUNTOS STRING(TK_COMA typed_var)* TK_PAR_DER (TK_EJECUTA type)? TK_DOS_PUNTOS NEWLINE INDENT func_body DEDENT
    ;

func_body
    : (global_decl | nonlocal_decl | var_def | func_def)* stmt+
    ;

typed_var
    : IDENTIFIER TK_DOS_PUNTOS type
    ;

type
    : IDENTIFIER                    #typeid
    | IDSTRING                      #typeidstring
    | INT                           #tipeInt
    | STR                           #typeStr
    | BOOL                          #typeBool
    | OBJECT                        #typeObject
    | TK_SQR_IZQ type TK_SQR_DER    #typeAnidado
    ;
global_decl
    : GLOBAL IDENTIFIER NEWLINE
    ;

nonlocal_decl
    : NONLOCAL IDENTIFIER NEWLINE
    ;

var_def
    : typed_var TK_ASIG literal (NEWLINE| EOF)
    ;

stmt
    : simple_stmt (NEWLINE| EOF)                                                                #stmtsimple
    | IF expr TK_DOS_PUNTOS block (ELIF expr TK_DOS_PUNTOS block)* (ELSE TK_DOS_PUNTOS block)?  #stmtif
    | WHILE expr TK_DOS_PUNTOS block                                                            #stmtwhile
    | FOR IDENTIFIER IN expr TK_DOS_PUNTOS block                                                #stmtfor
    ;

simple_stmt
    : PASS                              #simplestmtpass
    | expr                              #simplestmtexpr
    | RETURN (expr)?                    #simplestmtreturn
    | (target TK_ASIG)+ expr            #simplestmtasignacion
    | PRINT TK_PAR_IZQ expr TK_PAR_DER  #simplestmtprint
    ;

block
    : NEWLINE INDENT stmt+ (DEDENT| EOF)
    ;

literal
    : NONE          #literalnone
    | TRUE          #literaltrue
    | FALSE         #literalfalse
    | TK_ENTERO     #literaltk_entero
    | IDSTRING      #literalidstring
    | STRING        #literalstring
    ;

expr
    : cexpr                     #exprcexpr
    | NOT expr                  #exprnot
    | expr (AND | OR) expr      #exprandor
    | expr IF expr ELSE expr    #exprexprcond
    ;

cexpr
    : IDENTIFIER
    | SELF TK_PUNTO IDENTIFIER
    | literal
    | TK_SQR_IZQ (expr (TK_COMA expr)*)? TK_SQR_DER
    | TK_PAR_IZQ expr TK_PAR_DER
    | cexpr TK_PUNTO IDENTIFIER
    | cexpr TK_SQR_IZQ expr TK_SQR_DER
    | IDENTIFIER TK_PAR_IZQ (expr (TK_COMA expr)*)? TK_PAR_DER
    | cexpr TK_PUNTO IDENTIFIER TK_PAR_IZQ (expr (TK_COMA expr)*)? TK_PAR_DER
    | cexpr multdiv cexpr
    | cexpr bin_op cexpr
    | cexpr logop cexpr
    | MINUS_OP cexpr
    | LEN TK_PAR_IZQ (IDENTIFIER|STRING|IDSTRING|
    TK_SQR_IZQ (expr (TK_COMA expr)*)? TK_SQR_DER ) TK_PAR_DER
    ;
logop:
    EQUAL
    | NOT_EQUAL
    | MINOR_EQUAL
    | MAYOR_EQUAL
    | MINOR
    | MAYOR
    | IS
    ;
multdiv
    :MULT_OP
    |DIV_OP
    | MOD_OP;

bin_op
    : //MULT_OP
    | PLUS_OP
    | MINUS_OP

    ;


target
    : IDENTIFIER
    | cexpr TK_PUNTO IDENTIFIER
    | cexpr TK_SQR_IZQ expr TK_SQR_DER
    ;
DEF                : 'def';
RETURN             : 'return';
TK_PAR_IZQ         : '(';
TK_PAR_DER         : ')';
TK_EJECUTA         : '->';
TK_DOS_PUNTOS      : ':';
CLASS              : 'class';
INT		   : 'int';
TK_ASIG            : '=';
STR		       : 'str';
BOOL		   : 'bool';
OBJECT		   : 'object';
PRINT		   : 'print';
TK_SQR_IZQ         : '[';
TK_SQR_DER         : ']';
TK_COMA            : ',';
LEN		   : 'len';
TRUE               : 'True';
FALSE              : 'False';
SELF		   : 'self';
IF                 : 'if';
ELSE               : 'else';
TK_PUNTO           : '.';
GLOBAL             : 'global';
NONLOCAL           : 'nonlocal';
INIT	   : '__init__';
NONE               : 'None';
MINUS_OP           : '-';
MULT_OP            : '*';
DIV_OP             : '//';
MOD_OP             : '%';
NOT                : 'not';
OR                 : 'or';
AND                : 'and';
NOT_EQUAL         : '!=';
PLUS_OP            : '+';
TK_COR_IZQ	   : '{';
TK_COR_DER	   : '}';
PASS               : 'pass';
TK_COM		   : '#';
CONTINUE           : 'continue';
EXCEPT             : 'except';
FINALLY            : 'finally';
BREAK              : 'break';
FOR                : 'for';
FROM		   : 'from';
IMPORT		   : 'import';
IN                 : 'in';
IS                 : 'is';
LAMBDA             : 'lambda';
RAISE		   : 'raise';
TRY                : 'try';
WHILE              : 'while';
AS                 : 'as';
DEL		   : 'del';
ELIF               : 'elif';
ASSERT             : 'assert';
MINOR_EQUAL        : '<=';
MAYOR_EQUAL        : '>=';
EQUAL              : '==';
MAYOR              : '>';
MINOR              : '<';
WITH               : 'with';
fragment SPACES
 : [ \t]+
 ;
SKIP_
 : ( SPACES | COMMENT ) -> skip
 ;
fragment COMMENT
 : '#' ~[\r\n\f]*
 ;
IDENTIFIER         : ID_MULT_OPT ID_CONTINUE*;

// By default, tokens are placed on the default channel (Token.DEFAULT_CHANNEL),
// but may be reassigned by using the ->channel(HIDDEN)


TK_ENTERO          : DIGITO_NO_CERO DIGITO* | '0';

STRING
    : '"' ( ST )* '"'
    ;

IDSTRING
    : STRING
    ;

fragment ST
    : [\\]["]
    | [\\] [\\]
    | [\\]'n'
    | [\\]'t'
    | ~["]
    ;
fragment RN
    : '\r'? '\n'
    ;

fragment DIGITO_NO_CERO
    : [1-9]
    ;

fragment DIGITO
    : [0-9]
    ;

fragment CERO
    : '0'
    ;

fragment ID_CONTINUE
    : ID_MULT_OPT
    | [0-9]
    ;

fragment ID_MULT_OPT
    : '_'
    | [A-Z]
    | [a-z]
    ;

NEWLINE
 : ( {atStartOfInput()}?   SPACES
   | ( '\r'? '\n' | '\r' | '\f' ) SPACES?
   )
   {
     String newLine = getText().replaceAll("[^\r\n\f]+", "");
     String spaces = getText().replaceAll("[\r\n\f]+", "");
     // Strip newlines inside open clauses except if we are near EOF. We keep NEWLINEs near EOF to
     // satisfy the final newline needed by the single_put rule used by the REPL.
     int next = _input.LA(1);
     int nextnext = _input.LA(2);
     if (opened > 0 || (nextnext != -1 && (next == '\r' || next == '\n' || next == '\f' || next == '#'))) {
       // If we're inside a list or on a blank line, ignore all indents,
       // dedents and line breaks.
       skip();
     }
     else {
       emit(commonToken(NEWLINE, newLine));
       int indent = getIndentationCount(spaces);
       int previous = indents.isEmpty() ? 0 : indents.peek();
       if (indent == previous) {
         // skip indents of the same size as the present indent-size
         skip();
       }
       else if (indent > previous) {
         indents.push(indent);
         emit(commonToken(chocPyParser.INDENT, spaces));
       }
       else {
         // Possibly emit more than 1 DEDENT token.
         while(!indents.isEmpty() && indents.peek() > indent) {
           this.emit(createDedent());
           indents.pop();
         }
       }
     }
   }
 ;