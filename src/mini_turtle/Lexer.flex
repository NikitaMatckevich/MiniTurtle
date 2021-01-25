package mini_turtle;

import java_cup.runtime.*;
import java.util.*;
import static mini_turtle.sym.*;

%%

%class lexer
%unicode
%cup
%cupdebug
%line
%column
%yylexthrow Exception

%{

    private Symbol symbol(int id) {
		return new Symbol(id, yyline, yycolumn);
    }

    private Symbol symbol(int id, Object value) {
		return new Symbol(id, yyline, yycolumn, value);
    }

%}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]

Comment = {NonNestedComment} | {EndOfLineComment}
NonNestedComment = "(*" [^*] ~"*)" | "/*" "*"+ ")"
EndOfLineComment = "//" {InputCharacter}* {LineTerminator}?

IntegerLiteral = 0 | [1-9][0-9]*
Identifier = [:jletter:] [:jletterdigit:]*

%%

<YYINITIAL> {
  
	"def"			  { return symbol(DEF); }
	"repeat"		  { return symbol(REPEAT); }
	"penup"			  { return symbol(PENUP); }
	"pendown"		  { return symbol(PENDOWN); }
	"forward"		  { return symbol(FORWARD); }
	"turnleft"		  { return symbol(TURNLEFT); }
	"turnright"		  { return symbol(TURNRIGHT); }
	"color"		  	  { return symbol(COLOR); }
	"black"		  	  { return symbol(BLACK); }
	"white"		  	  { return symbol(WHITE); }
	"red"		  	  { return symbol(RED); }
	"green"		  	  { return symbol(GREEN); }
	"blue"		  	  { return symbol(BLUE); }
	"+"               { return symbol(PLUS); }
  	"-"               { return symbol(MINUS); }
  	"*"               { return symbol(MUL); }
  	"/"               { return symbol(DIV); }
  	"if"		  	  { return symbol(IF); }
  	"else"		  	  { return symbol(ELSE); }
  	","		  	  	  { return symbol(COMMA); }
  	"("		  	  	  { return symbol(LPAR); }
  	")"		  	  	  { return symbol(RPAR); }
  	"{"		  	  	  { return symbol(LCUR); }
  	"}"		  	  	  { return symbol(RCUR); }
  	{IntegerLiteral}  { return symbol(INTEGER, Integer.valueOf(yytext())); }
  	{Identifier}      { return symbol(IDENT, yytext()); }
    {Comment} 		  { /* ignore */ }
    {WhiteSpace} 	  { /* ignore */ }
	.				  { throw new Exception( String.format(
      						"Lexer error: Line %d, column %d: illegal character: '%s'\n",
      		 				yyline, yycolumn, yytext()
      					)); 
      				  }
}
