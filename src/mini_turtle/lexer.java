/* The following code was generated by JFlex 1.6.1 */

package mini_turtle;

import java_cup.runtime.*;
import java.util.*;
import static mini_turtle.sym.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>src/mini_turtle/Lexer.flex</tt>
 */
class lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\13\1\3\1\2\1\44\1\3\1\1\16\13\4\0\1\3\3\0"+
    "\1\12\3\0\1\4\1\6\1\5\1\36\1\41\1\37\1\0\1\7"+
    "\1\10\11\11\7\0\32\12\4\0\1\12\1\0\1\21\1\34\1\33"+
    "\1\14\1\15\1\16\1\31\1\32\1\30\1\12\1\35\1\27\1\12"+
    "\1\23\1\25\1\20\1\12\1\17\1\40\1\22\1\24\1\12\1\26"+
    "\3\12\1\42\1\0\1\43\1\0\6\13\1\45\32\13\2\0\4\12"+
    "\4\0\1\12\2\0\1\13\7\0\1\12\4\0\1\12\5\0\27\12"+
    "\1\0\37\12\1\0\u01ca\12\4\0\14\12\16\0\5\12\7\0\1\12"+
    "\1\0\1\12\21\0\160\13\5\12\1\0\2\12\2\0\4\12\1\0"+
    "\1\12\6\0\1\12\1\0\3\12\1\0\1\12\1\0\24\12\1\0"+
    "\123\12\1\0\213\12\1\0\5\13\2\0\246\12\1\0\46\12\2\0"+
    "\1\12\6\0\51\12\6\0\1\12\1\0\55\13\1\0\1\13\1\0"+
    "\2\13\1\0\2\13\1\0\1\13\10\0\33\12\4\0\4\12\15\0"+
    "\6\13\5\0\1\12\4\0\13\13\1\0\1\13\3\0\53\12\37\13"+
    "\4\0\2\12\1\13\143\12\1\0\1\12\10\13\1\0\6\13\2\12"+
    "\2\13\1\0\4\13\2\12\12\13\3\12\2\0\1\12\17\0\1\13"+
    "\1\12\1\13\36\12\33\13\2\0\131\12\13\13\1\12\16\0\12\13"+
    "\41\12\11\13\2\12\4\0\1\12\2\0\1\13\30\12\4\13\1\12"+
    "\11\13\1\12\3\13\1\12\5\13\22\0\31\12\3\13\4\0\13\12"+
    "\65\0\25\12\1\0\22\12\13\0\61\13\66\12\3\13\1\12\22\13"+
    "\1\12\7\13\12\12\2\13\2\0\12\13\1\0\20\12\3\13\1\0"+
    "\10\12\2\0\2\12\2\0\26\12\1\0\7\12\1\0\1\12\3\0"+
    "\4\12\2\0\1\13\1\12\7\13\2\0\2\13\2\0\3\13\1\12"+
    "\10\0\1\13\4\0\2\12\1\0\3\12\2\13\2\0\12\13\4\12"+
    "\7\0\2\12\1\0\1\13\2\0\3\13\1\0\6\12\4\0\2\12"+
    "\2\0\26\12\1\0\7\12\1\0\2\12\1\0\2\12\1\0\2\12"+
    "\2\0\1\13\1\0\5\13\4\0\2\13\2\0\3\13\3\0\1\13"+
    "\7\0\4\12\1\0\1\12\7\0\14\13\3\12\1\13\13\0\3\13"+
    "\1\0\11\12\1\0\3\12\1\0\26\12\1\0\7\12\1\0\2\12"+
    "\1\0\5\12\2\0\1\13\1\12\10\13\1\0\3\13\1\0\3\13"+
    "\2\0\1\12\17\0\2\12\2\13\2\0\12\13\1\0\1\12\7\0"+
    "\1\12\6\13\1\0\3\13\1\0\10\12\2\0\2\12\2\0\26\12"+
    "\1\0\7\12\1\0\2\12\1\0\5\12\2\0\1\13\1\12\7\13"+
    "\2\0\2\13\2\0\3\13\7\0\3\13\4\0\2\12\1\0\3\12"+
    "\2\13\2\0\12\13\1\0\1\12\20\0\1\13\1\12\1\0\6\12"+
    "\3\0\3\12\1\0\4\12\3\0\2\12\1\0\1\12\1\0\2\12"+
    "\3\0\2\12\3\0\3\12\3\0\14\12\4\0\5\13\3\0\3\13"+
    "\1\0\4\13\2\0\1\12\6\0\1\13\16\0\12\13\11\0\1\12"+
    "\6\0\5\13\10\12\1\0\3\12\1\0\27\12\1\0\20\12\3\0"+
    "\1\12\7\13\1\0\3\13\1\0\4\13\7\0\2\13\1\0\3\12"+
    "\5\0\2\12\2\13\2\0\12\13\20\0\1\12\3\13\1\0\10\12"+
    "\1\0\3\12\1\0\27\12\1\0\12\12\1\0\5\12\2\0\1\13"+
    "\1\12\7\13\1\0\3\13\1\0\4\13\7\0\2\13\7\0\1\12"+
    "\1\0\2\12\2\13\2\0\12\13\1\0\2\12\15\0\4\13\11\12"+
    "\1\0\3\12\1\0\51\12\2\13\1\12\7\13\1\0\3\13\1\0"+
    "\4\13\1\12\5\0\3\12\1\13\7\0\3\12\2\13\2\0\12\13"+
    "\12\0\6\12\1\0\3\13\1\0\22\12\3\0\30\12\1\0\11\12"+
    "\1\0\1\12\2\0\7\12\3\0\1\13\4\0\6\13\1\0\1\13"+
    "\1\0\10\13\6\0\12\13\2\0\2\13\15\0\60\12\1\13\2\12"+
    "\7\13\4\0\10\12\10\13\1\0\12\13\47\0\2\12\1\0\1\12"+
    "\1\0\5\12\1\0\30\12\1\0\1\12\1\0\12\12\1\13\2\12"+
    "\11\13\1\12\2\0\5\12\1\0\1\12\1\0\6\13\2\0\12\13"+
    "\2\0\4\12\40\0\1\12\27\0\2\13\6\0\12\13\13\0\1\13"+
    "\1\0\1\13\1\0\1\13\4\0\2\13\10\12\1\0\44\12\4\0"+
    "\24\13\1\0\2\13\5\12\13\13\1\0\44\13\11\0\1\13\71\0"+
    "\53\12\24\13\1\12\12\13\6\0\6\12\4\13\4\12\3\13\1\12"+
    "\3\13\2\12\7\13\3\12\4\13\15\12\14\13\1\12\17\13\2\0"+
    "\46\12\1\0\1\12\5\0\1\12\2\0\53\12\1\0\u014d\12\1\0"+
    "\4\12\2\0\7\12\1\0\1\12\1\0\4\12\2\0\51\12\1\0"+
    "\4\12\2\0\41\12\1\0\4\12\2\0\7\12\1\0\1\12\1\0"+
    "\4\12\2\0\17\12\1\0\71\12\1\0\4\12\2\0\103\12\2\0"+
    "\3\13\40\0\20\12\20\0\126\12\2\0\6\12\3\0\u026c\12\2\0"+
    "\21\12\1\0\32\12\5\0\113\12\3\0\13\12\7\0\15\12\1\0"+
    "\4\12\3\13\13\0\22\12\3\13\13\0\22\12\2\13\14\0\15\12"+
    "\1\0\3\12\1\0\2\13\14\0\64\12\40\13\3\0\1\12\3\0"+
    "\2\12\1\13\2\0\12\13\41\0\4\13\1\0\12\13\6\0\131\12"+
    "\7\0\5\12\2\13\42\12\1\13\1\12\5\0\106\12\12\0\37\12"+
    "\1\0\14\13\4\0\14\13\12\0\12\13\36\12\2\0\5\12\13\0"+
    "\54\12\4\0\32\12\6\0\12\13\46\0\27\12\5\13\4\0\65\12"+
    "\12\13\1\0\35\13\2\0\13\13\6\0\12\13\15\0\1\12\10\0"+
    "\16\13\1\0\2\13\77\0\5\13\57\12\21\13\7\12\4\0\12\13"+
    "\21\0\11\13\14\0\3\13\36\12\15\13\2\12\12\13\54\12\16\13"+
    "\14\0\44\12\24\13\10\0\12\13\3\0\3\12\12\13\44\12\2\0"+
    "\11\12\7\0\53\12\2\0\3\12\20\0\3\13\1\0\25\13\4\12"+
    "\1\13\6\12\1\13\2\12\3\13\1\12\5\0\300\12\72\13\1\0"+
    "\5\13\u0116\12\2\0\6\12\2\0\46\12\2\0\6\12\2\0\10\12"+
    "\1\0\1\12\1\0\1\12\1\0\1\12\1\0\37\12\2\0\65\12"+
    "\1\0\7\12\1\0\1\12\3\0\3\12\1\0\7\12\3\0\4\12"+
    "\2\0\6\12\4\0\15\12\5\0\3\12\1\0\7\12\16\0\5\13"+
    "\30\0\1\44\1\44\5\13\20\0\2\12\23\0\1\12\13\0\5\13"+
    "\1\0\12\13\1\0\1\12\15\0\1\12\20\0\15\12\3\0\40\12"+
    "\20\0\15\13\4\0\1\13\3\0\14\13\21\0\1\12\4\0\1\12"+
    "\2\0\12\12\1\0\1\12\3\0\5\12\6\0\1\12\1\0\1\12"+
    "\1\0\1\12\1\0\4\12\1\0\13\12\2\0\4\12\5\0\5\12"+
    "\4\0\1\12\21\0\51\12\u0a77\0\57\12\1\0\57\12\1\0\205\12"+
    "\6\0\4\12\3\13\2\12\14\0\46\12\1\0\1\12\5\0\1\12"+
    "\2\0\70\12\7\0\1\12\17\0\1\13\27\12\11\0\7\12\1\0"+
    "\7\12\1\0\7\12\1\0\7\12\1\0\7\12\1\0\7\12\1\0"+
    "\7\12\1\0\7\12\1\0\40\13\57\0\1\12\u01d5\0\3\12\31\0"+
    "\11\12\6\13\1\0\5\12\2\0\5\12\4\0\126\12\2\0\2\13"+
    "\2\0\3\12\1\0\132\12\1\0\4\12\5\0\53\12\1\0\136\12"+
    "\21\0\40\12\60\0\20\12\u0200\0\u19c0\12\100\0\u51fd\12\3\0\u048d\12"+
    "\103\0\56\12\2\0\u010d\12\3\0\20\12\12\13\2\12\24\0\57\12"+
    "\1\13\4\0\12\13\1\0\37\12\2\13\120\12\2\13\45\0\11\12"+
    "\2\0\147\12\2\0\65\12\2\0\11\12\52\0\15\12\1\13\3\12"+
    "\1\13\4\12\1\13\27\12\5\13\4\0\1\13\13\0\1\12\7\0"+
    "\64\12\14\0\2\13\62\12\22\13\12\0\12\13\6\0\22\13\6\12"+
    "\3\0\1\12\1\0\2\12\13\13\34\12\10\13\2\0\27\12\15\13"+
    "\14\0\35\12\3\0\4\13\57\12\16\13\16\0\1\12\12\13\6\0"+
    "\5\12\1\13\12\12\12\13\5\12\1\0\51\12\16\13\11\0\3\12"+
    "\1\13\10\12\2\13\2\0\12\13\6\0\27\12\3\0\1\12\3\13"+
    "\62\12\1\13\1\12\3\13\2\12\2\13\5\12\2\13\1\12\1\13"+
    "\1\12\30\0\3\12\2\0\13\12\5\13\2\0\3\12\2\13\12\0"+
    "\6\12\2\0\6\12\2\0\6\12\11\0\7\12\1\0\7\12\1\0"+
    "\53\12\1\0\16\12\6\0\163\12\10\13\1\0\2\13\2\0\12\13"+
    "\6\0\u2ba4\12\14\0\27\12\4\0\61\12\u2104\0\u016e\12\2\0\152\12"+
    "\46\0\7\12\14\0\5\12\5\0\1\12\1\13\12\12\1\0\15\12"+
    "\1\0\5\12\1\0\1\12\1\0\2\12\1\0\2\12\1\0\154\12"+
    "\41\0\u016b\12\22\0\100\12\2\0\66\12\50\0\15\12\3\0\20\13"+
    "\20\0\20\13\3\0\2\12\30\0\3\12\31\0\1\12\6\0\5\12"+
    "\1\0\207\12\2\0\1\13\4\0\1\12\13\0\12\13\7\0\32\12"+
    "\4\0\1\12\1\0\32\12\13\0\131\12\3\0\6\12\2\0\6\12"+
    "\2\0\6\12\2\0\3\12\3\0\2\12\3\0\2\12\22\0\3\13"+
    "\4\0\14\12\1\0\32\12\1\0\23\12\1\0\2\12\1\0\17\12"+
    "\2\0\16\12\42\0\173\12\105\0\65\12\210\0\1\13\202\0\35\12"+
    "\3\0\61\12\17\0\1\13\37\0\40\12\15\0\36\12\5\0\46\12"+
    "\5\13\5\0\36\12\2\0\44\12\4\0\10\12\1\0\5\12\52\0"+
    "\236\12\2\0\12\13\6\0\44\12\4\0\44\12\4\0\50\12\10\0"+
    "\64\12\234\0\u0137\12\11\0\26\12\12\0\10\12\230\0\6\12\2\0"+
    "\1\12\1\0\54\12\1\0\2\12\3\0\1\12\2\0\27\12\12\0"+
    "\27\12\11\0\37\12\101\0\23\12\1\0\2\12\12\0\26\12\12\0"+
    "\32\12\106\0\70\12\6\0\2\12\100\0\1\12\3\13\1\0\2\13"+
    "\5\0\4\13\4\12\1\0\3\12\1\0\35\12\2\0\3\13\4\0"+
    "\1\13\40\0\35\12\3\0\35\12\43\0\10\12\1\0\34\12\2\13"+
    "\31\0\66\12\12\0\26\12\12\0\23\12\15\0\22\12\156\0\111\12"+
    "\67\0\63\12\15\0\63\12\15\0\44\12\4\13\10\0\12\13\u0146\0"+
    "\52\12\1\0\2\13\3\0\2\12\116\0\35\12\12\0\1\12\10\0"+
    "\26\12\13\13\137\0\25\12\33\0\27\12\11\0\3\13\65\12\17\13"+
    "\37\0\12\13\17\0\4\13\55\12\13\13\2\0\1\13\17\0\1\13"+
    "\2\0\31\12\7\0\12\13\6\0\3\13\44\12\16\13\1\0\12\13"+
    "\4\0\1\12\2\13\1\12\10\0\43\12\1\13\2\0\1\12\11\0"+
    "\3\13\60\12\16\13\4\12\4\0\4\13\1\0\14\13\1\12\1\0"+
    "\1\12\43\0\22\12\1\0\31\12\14\13\6\0\1\13\101\0\7\12"+
    "\1\0\1\12\1\0\4\12\1\0\17\12\1\0\12\12\7\0\57\12"+
    "\14\13\5\0\12\13\6\0\4\13\1\0\10\12\2\0\2\12\2\0"+
    "\26\12\1\0\7\12\1\0\2\12\1\0\5\12\1\0\2\13\1\12"+
    "\7\13\2\0\2\13\2\0\3\13\2\0\1\12\6\0\1\13\5\0"+
    "\5\12\2\13\2\0\7\13\3\0\5\13\213\0\65\12\22\13\4\12"+
    "\5\0\12\13\4\0\1\13\3\12\36\0\60\12\24\13\2\12\1\0"+
    "\1\12\10\0\12\13\246\0\57\12\7\13\2\0\11\13\27\0\4\12"+
    "\2\13\42\0\60\12\21\13\3\0\1\12\13\0\12\13\46\0\53\12"+
    "\15\13\1\12\7\0\12\13\66\0\33\12\2\0\17\13\4\0\12\13"+
    "\306\0\54\12\17\13\145\0\100\12\12\13\25\0\10\12\2\0\1\12"+
    "\2\0\10\12\1\0\2\12\1\0\30\12\6\13\1\0\2\13\2\0"+
    "\4\13\1\12\1\13\1\12\2\13\14\0\12\13\106\0\10\12\2\0"+
    "\47\12\7\13\2\0\7\13\1\12\1\0\1\12\1\13\33\0\1\12"+
    "\12\13\50\12\7\13\1\12\4\13\10\0\1\13\10\0\1\12\13\13"+
    "\56\12\20\13\3\0\1\12\42\0\71\12\u0107\0\11\12\1\0\45\12"+
    "\10\13\1\0\10\13\1\12\17\0\12\13\30\0\36\12\2\0\26\13"+
    "\1\0\16\13\111\0\7\12\1\0\2\12\1\0\46\12\6\13\3\0"+
    "\1\13\1\0\2\13\1\0\7\13\1\12\1\13\10\0\12\13\6\0"+
    "\6\12\1\0\2\12\1\0\40\12\5\13\1\0\2\13\1\0\5\13"+
    "\1\12\7\0\12\13\u0136\0\23\12\4\13\271\0\1\12\54\0\4\12"+
    "\37\0\u039a\12\146\0\157\12\21\0\304\12\u0abc\0\u042f\12\1\0\11\13"+
    "\u0fc7\0\u0247\12\u21b9\0\u0239\12\7\0\37\12\1\0\12\13\146\0\36\12"+
    "\2\0\5\13\13\0\60\12\7\13\11\0\4\12\14\0\12\13\11\0"+
    "\25\12\5\0\23\12\u02b0\0\100\12\200\0\113\12\4\0\1\13\1\12"+
    "\67\13\7\0\4\13\15\12\100\0\2\12\1\0\1\12\1\13\13\0"+
    "\2\13\16\0\u17f8\12\10\0\u04d6\12\52\0\11\12\u22f7\0\u011f\12\61\0"+
    "\3\12\21\0\4\12\10\0\u018c\12\u0904\0\153\12\5\0\15\12\3\0"+
    "\11\12\7\0\12\12\3\0\2\13\1\0\4\13\u14c1\0\5\13\3\0"+
    "\26\13\2\0\7\13\36\0\4\13\224\0\3\13\u01bb\0\125\12\1\0"+
    "\107\12\1\0\2\12\2\0\1\12\2\0\2\12\2\0\4\12\1\0"+
    "\14\12\1\0\1\12\1\0\7\12\1\0\101\12\1\0\4\12\2\0"+
    "\10\12\1\0\7\12\1\0\34\12\1\0\4\12\1\0\5\12\1\0"+
    "\1\12\3\0\7\12\1\0\u0154\12\2\0\31\12\1\0\31\12\1\0"+
    "\37\12\1\0\31\12\1\0\37\12\1\0\31\12\1\0\37\12\1\0"+
    "\31\12\1\0\37\12\1\0\31\12\1\0\10\12\2\0\62\13\u0200\0"+
    "\67\13\4\0\62\13\10\0\1\13\16\0\1\13\26\0\5\13\1\0"+
    "\17\13\u0550\0\7\13\1\0\21\13\2\0\7\13\1\0\2\13\1\0"+
    "\5\13\325\0\55\12\3\0\7\13\7\12\2\0\12\13\4\0\1\12"+
    "\u0171\0\54\12\16\13\5\0\1\12\u0500\0\305\12\13\0\7\13\51\0"+
    "\104\12\7\13\1\12\4\0\12\13\u0356\0\1\12\u014f\0\4\12\1\0"+
    "\33\12\1\0\2\12\1\0\1\12\2\0\1\12\1\0\12\12\1\0"+
    "\4\12\1\0\1\12\1\0\1\12\6\0\1\12\4\0\1\12\1\0"+
    "\1\12\1\0\1\12\1\0\3\12\1\0\2\12\1\0\1\12\2\0"+
    "\1\12\1\0\1\12\1\0\1\12\1\0\1\12\1\0\1\12\1\0"+
    "\2\12\1\0\1\12\2\0\4\12\1\0\7\12\1\0\4\12\1\0"+
    "\4\12\1\0\1\12\1\0\12\12\1\0\21\12\5\0\3\12\1\0"+
    "\5\12\1\0\21\12\u0d34\0\12\13\u0406\0\ua6de\12\42\0\u1035\12\13\0"+
    "\336\12\2\0\u1682\12\16\0\u1d31\12\u0c1f\0\u021e\12\u05e2\0\u134b\12\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uecc0\0"+
    "\1\13\36\0\140\13\200\0\360\13\uffff\0\uffff\0\ufe12\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4\1\5\1\6\2\7"+
    "\14\10\1\11\1\12\1\13\1\14\1\15\2\0\1\2"+
    "\7\10\1\16\3\10\2\0\1\17\2\10\1\20\10\10"+
    "\1\0\1\21\11\10\1\22\3\10\1\23\2\10\1\24"+
    "\1\25\1\26\1\27\1\10\1\30\3\10\1\31\1\32"+
    "\3\10\1\33\1\34";

  private static int [] zzUnpackAction() {
    int [] result = new int[89];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\46\0\114\0\46\0\162\0\46\0\46\0\230"+
    "\0\46\0\276\0\344\0\u010a\0\u0130\0\u0156\0\u017c\0\u01a2"+
    "\0\u01c8\0\u01ee\0\u0214\0\u023a\0\u0260\0\u0286\0\46\0\46"+
    "\0\46\0\46\0\46\0\u02ac\0\u02d2\0\u02f8\0\u031e\0\u0344"+
    "\0\u036a\0\u0390\0\u03b6\0\u03dc\0\u0402\0\344\0\u0428\0\u044e"+
    "\0\u0474\0\u049a\0\u04c0\0\344\0\u04e6\0\u050c\0\344\0\u0532"+
    "\0\u0558\0\u057e\0\u05a4\0\u05ca\0\u05f0\0\u0616\0\u063c\0\u0662"+
    "\0\344\0\u0688\0\u06ae\0\u06d4\0\u06fa\0\u0720\0\u0746\0\u076c"+
    "\0\u0792\0\u07b8\0\344\0\u07de\0\u0804\0\u082a\0\344\0\u0850"+
    "\0\u0876\0\344\0\344\0\344\0\344\0\u089c\0\344\0\u08c2"+
    "\0\u08e8\0\u090e\0\344\0\344\0\u0934\0\u095a\0\u0980\0\344"+
    "\0\344";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[89];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\2\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\2\1\14\1\15\1\16\1\17\1\20"+
    "\1\13\1\21\3\13\1\22\1\13\1\23\1\24\1\13"+
    "\1\25\1\26\1\13\1\27\1\30\1\13\1\31\1\32"+
    "\1\33\52\0\1\4\50\0\1\34\45\0\1\35\1\0"+
    "\1\36\46\0\2\12\44\0\26\13\2\0\1\13\4\0"+
    "\1\13\10\0\5\13\1\37\20\13\2\0\1\13\4\0"+
    "\1\13\10\0\17\13\1\40\6\13\2\0\1\13\4\0"+
    "\1\13\10\0\15\13\1\41\10\13\2\0\1\13\4\0"+
    "\1\13\10\0\5\13\1\42\20\13\2\0\1\13\4\0"+
    "\1\13\10\0\5\13\1\43\20\13\2\0\1\13\4\0"+
    "\1\13\10\0\14\13\1\44\11\13\2\0\1\13\4\0"+
    "\1\13\10\0\22\13\1\45\3\13\2\0\1\13\4\0"+
    "\1\13\10\0\6\13\1\46\17\13\2\0\1\13\4\0"+
    "\1\13\10\0\7\13\1\47\16\13\2\0\1\13\4\0"+
    "\1\13\10\0\15\13\1\50\10\13\2\0\1\13\4\0"+
    "\1\13\10\0\17\13\1\51\6\13\2\0\1\13\4\0"+
    "\1\13\5\52\1\0\40\52\5\0\1\53\40\0\1\36"+
    "\1\3\1\4\43\36\10\0\6\13\1\54\17\13\2\0"+
    "\1\13\4\0\1\13\10\0\26\13\2\0\1\55\4\0"+
    "\1\13\10\0\7\13\1\56\16\13\2\0\1\13\4\0"+
    "\1\13\10\0\4\13\1\57\3\13\1\60\15\13\2\0"+
    "\1\13\4\0\1\13\10\0\13\13\1\61\12\13\2\0"+
    "\1\13\4\0\1\13\10\0\7\13\1\62\16\13\2\0"+
    "\1\13\4\0\1\13\10\0\20\13\1\63\5\13\2\0"+
    "\1\13\4\0\1\13\10\0\5\13\1\64\20\13\2\0"+
    "\1\13\4\0\1\13\10\0\17\13\1\65\6\13\2\0"+
    "\1\13\4\0\1\13\10\0\11\13\1\66\2\13\1\67"+
    "\11\13\2\0\1\13\4\0\1\13\5\52\1\70\40\52"+
    "\5\0\1\53\1\4\47\0\5\13\1\71\20\13\2\0"+
    "\1\13\4\0\1\13\10\0\16\13\1\72\7\13\2\0"+
    "\1\13\4\0\1\13\10\0\5\13\1\73\20\13\2\0"+
    "\1\13\4\0\1\13\10\0\4\13\1\74\7\13\1\75"+
    "\11\13\2\0\1\13\4\0\1\13\10\0\13\13\1\76"+
    "\12\13\2\0\1\13\4\0\1\13\10\0\12\13\1\77"+
    "\13\13\2\0\1\13\4\0\1\13\10\0\5\13\1\100"+
    "\20\13\2\0\1\13\4\0\1\13\10\0\15\13\1\101"+
    "\10\13\2\0\1\13\4\0\1\13\10\0\23\13\1\102"+
    "\2\13\2\0\1\13\4\0\1\13\10\0\5\13\1\103"+
    "\20\13\2\0\1\13\4\0\1\13\5\52\1\70\1\4"+
    "\37\52\10\0\11\13\1\104\14\13\2\0\1\13\4\0"+
    "\1\13\10\0\11\13\1\105\14\13\2\0\1\13\4\0"+
    "\1\13\10\0\15\13\1\106\10\13\2\0\1\13\4\0"+
    "\1\13\10\0\10\13\1\107\15\13\2\0\1\13\4\0"+
    "\1\13\10\0\7\13\1\110\7\13\1\111\6\13\2\0"+
    "\1\13\4\0\1\13\10\0\5\13\1\112\20\13\2\0"+
    "\1\13\4\0\1\13\10\0\13\13\1\113\12\13\2\0"+
    "\1\13\4\0\1\13\10\0\7\13\1\114\16\13\2\0"+
    "\1\13\4\0\1\13\10\0\25\13\1\115\2\0\1\13"+
    "\4\0\1\13\10\0\7\13\1\116\16\13\2\0\1\13"+
    "\4\0\1\13\10\0\12\13\1\117\13\13\2\0\1\13"+
    "\4\0\1\13\10\0\16\13\1\120\7\13\2\0\1\13"+
    "\4\0\1\13\10\0\20\13\1\121\5\13\2\0\1\13"+
    "\4\0\1\13\10\0\5\13\1\122\20\13\2\0\1\13"+
    "\4\0\1\13\10\0\4\13\1\123\21\13\2\0\1\13"+
    "\4\0\1\13\10\0\13\13\1\124\12\13\2\0\1\13"+
    "\4\0\1\13\10\0\21\13\1\125\4\13\2\0\1\13"+
    "\4\0\1\13\10\0\6\13\1\126\17\13\2\0\1\13"+
    "\4\0\1\13\10\0\22\13\1\127\3\13\2\0\1\13"+
    "\4\0\1\13\10\0\12\13\1\130\13\13\2\0\1\13"+
    "\4\0\1\13\10\0\12\13\1\131\13\13\2\0\1\13"+
    "\4\0\1\13";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2470];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\1\1\2\11\1\1\1\11"+
    "\15\1\5\11\2\0\14\1\2\0\14\1\1\0\41\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[89];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */

    private Symbol symbol(int id) {
		return new Symbol(id, yyline, yycolumn);
    }

    private Symbol symbol(int id, Object value) {
		return new Symbol(id, yyline, yycolumn, value);
    }



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 3656) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException, Exception {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { throw new Exception( String.format(
      						"Lexer error: Line %d, column %d: illegal character: '%s'\n",
      		 				yyline, yycolumn, yytext()
      					));
            }
          case 29: break;
          case 2: 
            { /* ignore */
            }
          case 30: break;
          case 3: 
            { return symbol(LPAR);
            }
          case 31: break;
          case 4: 
            { return symbol(MUL);
            }
          case 32: break;
          case 5: 
            { return symbol(RPAR);
            }
          case 33: break;
          case 6: 
            { return symbol(DIV);
            }
          case 34: break;
          case 7: 
            { return symbol(INTEGER, Integer.valueOf(yytext()));
            }
          case 35: break;
          case 8: 
            { return symbol(IDENT, yytext());
            }
          case 36: break;
          case 9: 
            { return symbol(PLUS);
            }
          case 37: break;
          case 10: 
            { return symbol(MINUS);
            }
          case 38: break;
          case 11: 
            { return symbol(COMMA);
            }
          case 39: break;
          case 12: 
            { return symbol(LCUR);
            }
          case 40: break;
          case 13: 
            { return symbol(RCUR);
            }
          case 41: break;
          case 14: 
            { return symbol(IF);
            }
          case 42: break;
          case 15: 
            { return symbol(DEF);
            }
          case 43: break;
          case 16: 
            { return symbol(RED);
            }
          case 44: break;
          case 17: 
            { return symbol(ELSE);
            }
          case 45: break;
          case 18: 
            { return symbol(BLUE);
            }
          case 46: break;
          case 19: 
            { return symbol(PENUP);
            }
          case 47: break;
          case 20: 
            { return symbol(WHITE);
            }
          case 48: break;
          case 21: 
            { return symbol(GREEN);
            }
          case 49: break;
          case 22: 
            { return symbol(COLOR);
            }
          case 50: break;
          case 23: 
            { return symbol(BLACK);
            }
          case 51: break;
          case 24: 
            { return symbol(REPEAT);
            }
          case 52: break;
          case 25: 
            { return symbol(FORWARD);
            }
          case 53: break;
          case 26: 
            { return symbol(PENDOWN);
            }
          case 54: break;
          case 27: 
            { return symbol(TURNLEFT);
            }
          case 55: break;
          case 28: 
            { return symbol(TURNRIGHT);
            }
          case 56: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Converts an int token code into the name of the
   * token by reflection on the cup symbol class/interface sym
   *
   * This code was contributed by Karl Meissner <meissnersd@yahoo.com>
   */
  private String getTokenName(int token) {
    try {
      java.lang.reflect.Field [] classFields = sym.class.getFields();
      for (int i = 0; i < classFields.length; i++) {
        if (classFields[i].getInt(null) == token) {
          return classFields[i].getName();
        }
      }
    } catch (Exception e) {
      e.printStackTrace(System.err);
    }

    return "UNKNOWN TOKEN";
  }

  /**
   * Same as next_token but also prints the token to standard out
   * for debugging.
   *
   * This code was contributed by Karl Meissner <meissnersd@yahoo.com>
   */
  public java_cup.runtime.Symbol debug_next_token() throws java.io.IOException, Exception {
    java_cup.runtime.Symbol s = next_token();
    System.out.println( "line:" + (yyline+1) + " col:" + (yycolumn+1) + " --"+ yytext() + "--" + getTokenName(s.sym) + "--");
    return s;
  }

  /**
   * Runs the scanner on input files.
   *
   * This main method is the debugging routine for the scanner.
   * It prints debugging information about each returned token to
   * System.out until the end of file is reached, or an error occured.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java lexer [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        lexer scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new lexer(reader);
          while ( !scanner.zzAtEOF ) scanner.debug_next_token();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}