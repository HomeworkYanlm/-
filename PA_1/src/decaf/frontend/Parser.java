//### This file created by BYACC 1.8(/Java extension  1.13)
//### Java capabilities added 7 Jan 97, Bob Jamison
//### Updated : 27 Nov 97  -- Bob Jamison, Joe Nieten
//###           01 Jan 98  -- Bob Jamison -- fixed generic semantic constructor
//###           01 Jun 99  -- Bob Jamison -- added Runnable support
//###           06 Aug 00  -- Bob Jamison -- made state variables class-global
//###           03 Jan 01  -- Bob Jamison -- improved flags, tracing
//###           16 May 01  -- Bob Jamison -- added custom stack sizing
//###           04 Mar 02  -- Yuval Oren  -- improved java performance, added options
//###           14 Mar 02  -- Tomas Hurka -- -d support, static initializer workaround
//###           14 Sep 06  -- Keltin Leung-- ReduceListener support, eliminate underflow report in error recovery
//### Please send bug reports to tom@hukatronic.cz
//### static char yysccsid[] = "@(#)yaccpar	1.8 (Berkeley) 01/20/90";






//#line 11 "Parser.y"
package decaf.frontend;

import decaf.tree.Tree;
import decaf.tree.Tree.*;
import decaf.error.*;
import java.util.*;
//#line 25 "Parser.java"
interface ReduceListener {
  public boolean onReduce(String rule);
}




public class Parser
             extends BaseParser
             implements ReduceListener
{

boolean yydebug;        //do I want debug output?
int yynerrs;            //number of errors so far
int yyerrflag;          //was there an error?
int yychar;             //the current working character

ReduceListener reduceListener = null;
void yyclearin ()       {yychar = (-1);}
void yyerrok ()         {yyerrflag=0;}
void addReduceListener(ReduceListener l) {
  reduceListener = l;}


//########## MESSAGES ##########
//###############################################################
// method: debug
//###############################################################
void debug(String msg)
{
  if (yydebug)
    System.out.println(msg);
}

//########## STATE STACK ##########
final static int YYSTACKSIZE = 500;  //maximum stack size
int statestk[] = new int[YYSTACKSIZE]; //state stack
int stateptr;
int stateptrmax;                     //highest index of stackptr
int statemax;                        //state when highest index reached
//###############################################################
// methods: state stack push,pop,drop,peek
//###############################################################
final void state_push(int state)
{
  try {
		stateptr++;
		statestk[stateptr]=state;
	 }
	 catch (ArrayIndexOutOfBoundsException e) {
     int oldsize = statestk.length;
     int newsize = oldsize * 2;
     int[] newstack = new int[newsize];
     System.arraycopy(statestk,0,newstack,0,oldsize);
     statestk = newstack;
     statestk[stateptr]=state;
  }
}
final int state_pop()
{
  return statestk[stateptr--];
}
final void state_drop(int cnt)
{
  stateptr -= cnt; 
}
final int state_peek(int relative)
{
  return statestk[stateptr-relative];
}
//###############################################################
// method: init_stacks : allocate and prepare stacks
//###############################################################
final boolean init_stacks()
{
  stateptr = -1;
  val_init();
  return true;
}
//###############################################################
// method: dump_stacks : show n levels of the stacks
//###############################################################
void dump_stacks(int count)
{
int i;
  System.out.println("=index==state====value=     s:"+stateptr+"  v:"+valptr);
  for (i=0;i<count;i++)
    System.out.println(" "+i+"    "+statestk[i]+"      "+valstk[i]);
  System.out.println("======================");
}


//########## SEMANTIC VALUES ##########
//## **user defined:SemValue
String   yytext;//user variable to return contextual strings
SemValue yyval; //used to return semantic vals from action routines
SemValue yylval;//the 'lval' (result) I got from yylex()
SemValue valstk[] = new SemValue[YYSTACKSIZE];
int valptr;
//###############################################################
// methods: value stack push,pop,drop,peek.
//###############################################################
final void val_init()
{
  yyval=new SemValue();
  yylval=new SemValue();
  valptr=-1;
}
final void val_push(SemValue val)
{
  try {
    valptr++;
    valstk[valptr]=val;
  }
  catch (ArrayIndexOutOfBoundsException e) {
    int oldsize = valstk.length;
    int newsize = oldsize*2;
    SemValue[] newstack = new SemValue[newsize];
    System.arraycopy(valstk,0,newstack,0,oldsize);
    valstk = newstack;
    valstk[valptr]=val;
  }
}
final SemValue val_pop()
{
  return valstk[valptr--];
}
final void val_drop(int cnt)
{
  valptr -= cnt;
}
final SemValue val_peek(int relative)
{
  return valstk[valptr-relative];
}
//#### end semantic value section ####
public final static short VOID=257;
public final static short BOOL=258;
public final static short INT=259;
public final static short STRING=260;
public final static short CLASS=261;
public final static short NULL=262;
public final static short EXTENDS=263;
public final static short THIS=264;
public final static short WHILE=265;
public final static short FOR=266;
public final static short IF=267;
public final static short ELSE=268;
public final static short RETURN=269;
public final static short BREAK=270;
public final static short NEW=271;
public final static short PRINT=272;
public final static short READ_INTEGER=273;
public final static short READ_LINE=274;
public final static short LITERAL=275;
public final static short IDENTIFIER=276;
public final static short AND=277;
public final static short OR=278;
public final static short STATIC=279;
public final static short INSTANCEOF=280;
public final static short LESS_EQUAL=281;
public final static short GREATER_EQUAL=282;
public final static short EQUAL=283;
public final static short NOT_EQUAL=284;
public final static short IMAGE=285;
public final static short COMPLEX=286;
public final static short CASE=287;
public final static short DEFULT=288;
public final static short PRINTCOMP=289;
public final static short SUPER=290;
public final static short DCOPY=291;
public final static short SCOPY=292;
public final static short DDO=293;
public final static short OOD=294;
public final static short DDD=295;
public final static short UMINUS=296;
public final static short EMPTY=297;
public final static short YYERRCODE=256;
final static short yylhs[] = {                           -1,
    0,    1,    1,    3,    4,    5,    5,    5,    5,    5,
    5,    5,    2,    6,    6,    7,    7,    7,    9,    9,
   10,   10,    8,    8,   11,   12,   12,   13,   13,   13,
   13,   13,   13,   13,   13,   13,   13,   14,   14,   14,
   14,   26,   26,   22,   22,   24,   28,   30,   31,   31,
   25,   23,   23,   23,   23,   23,   23,   23,   23,   23,
   23,   23,   23,   23,   23,   23,   23,   23,   23,   23,
   23,   23,   23,   23,   23,   23,   23,   23,   23,   23,
   23,   23,   23,   23,   29,   29,   27,   27,   32,   32,
   33,   34,   35,   35,   16,   17,   18,   21,   15,   36,
   36,   19,   19,   20,   20,
};
final static short yylen[] = {                            2,
    1,    2,    1,    2,    2,    1,    1,    1,    1,    1,
    2,    3,    6,    2,    0,    2,    2,    0,    1,    0,
    3,    1,    7,    6,    3,    2,    0,    1,    2,    1,
    2,    1,    1,    2,    2,    2,    1,    3,    1,    1,
    0,    2,    0,    2,    4,    5,    4,    4,    2,    0,
    6,    1,    1,    1,    1,    8,    3,    3,    3,    3,
    3,    3,    3,    3,    3,    3,    3,    3,    3,    3,
    2,    2,    3,    3,    1,    4,    5,    6,    5,    2,
    2,    2,    4,    4,    1,    1,    1,    0,    3,    1,
    3,    2,    2,    0,    4,    5,    9,    1,    6,    2,
    0,    2,    1,    4,    4,
};
final static short yydefred[] = {                         0,
    0,    0,    0,    3,    0,    2,    0,    0,   14,   18,
    0,    8,    9,    6,   10,    0,    0,   13,    7,   16,
    0,    0,   17,   11,    0,    4,    0,    0,    0,    0,
   12,    0,   22,    0,    0,    0,    0,    5,    0,    0,
    0,   27,   24,   21,   23,    0,   86,   75,    0,    0,
    0,    0,   98,    0,    0,    0,    0,   85,    0,    0,
    0,    0,   25,    0,    0,    0,    0,    0,   94,    0,
    0,    0,   28,   37,   26,    0,   30,    0,   32,   33,
    0,    0,    0,    0,    0,    0,    0,    0,   55,    0,
    0,    0,   52,    0,   53,   54,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,   29,   31,   34,   35,   36,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   42,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   73,   74,    0,    0,   70,    0,
    0,    0,    0,    0,    0,    0,   93,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   76,    0,    0,  104,
    0,    0,    0,  105,    0,   83,   84,    0,   95,   92,
   45,    0,    0,   96,    0,    0,   77,    0,    0,   79,
   50,    0,   91,   46,    0,    0,   99,   78,    0,   51,
    0,  100,    0,   49,    0,    0,    0,    0,    0,   56,
   97,    0,    0,   48,   47,
};
final static short yydgoto[] = {                          2,
    3,    4,   73,   21,   34,    8,   11,   23,   35,   36,
   74,   46,   75,   76,   77,   78,   79,   80,   81,   82,
   83,   93,   85,   95,   96,   88,  192,  214,   89,  216,
  209,  193,  156,  157,  112,  207,
};
final static short yysindex[] = {                      -232,
 -238,    0, -232,    0, -220,    0, -218,  -67,    0,    0,
  295,    0,    0,    0,    0, -214,  -51,    0,    0,    0,
   25,  -85,    0,    0,  -83,    0,   35,    4,   53,  -51,
    0,  -51,    0,  -74,   60,   58,   64,    0,  -17,  -51,
  -17,    0,    0,    0,    0,    6,    0,    0,   75,   85,
   86,  116,    0,  195,   92,  102,  105,    0,  106,  116,
  116,   76,    0,  110,  114,  109,  117,  118,    0,  116,
  116,  116,    0,    0,    0,  100,    0,  101,    0,    0,
  104,  111,  112,  113,  911,    0,    0, -107,    0,  116,
  116,  116,    0,  911,    0,    0,  133,   84,  116,  136,
  137,  116,  -27,  -27,  -97,  478,  116,  116,  -93,  116,
  116,  116,  911,  911,  911,    0,    0,    0,    0,    0,
  116,  116,  116,  116,  116,  116,  116,  116,  116,  116,
  116,  116,  116,  116,    0,  116,  144,  504,  126,  530,
  145,  108,  911,  -20,    0,    0,  541,  146,    0,  563,
   16,  148,  593,  605,  631, -199,    0,  911,  939,  -32,
  -10,  -10,  973,  973,   26,   26,  -27,  -27,  -27,  -10,
  -10,  806,  116,   43,  116,   43,    0,  858,  116,    0,
  -87,  116,   80,    0,  116,    0,    0,   43,    0,    0,
    0,  151,  160,    0,  730,  -63,    0,  911,  176,    0,
    0,  178,    0,    0,  116,   43,    0,    0, -201,    0,
  179,    0,  164,    0,  165,  149,   43,  116,  116,    0,
    0,  879,  900,    0,    0,
};
final static short yyrindex[] = {                         0,
    0,    0,  230,    0,  125,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  223,    0,    0,  242,
    0,  242,    0,    0,    0,  246,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  -58,    0,    0,    0,    0,
    0,  -55,    0,    0,    0,    0,    0,    0,    0,   18,
   18,   18,    0,    0,    0,    0,    0,    0,    0,   18,
   18,   18,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,  932,    0,    7,   77,    0,    0,   18,
  -58,   18,    0,  247,    0,    0,    0,    0,   18,    0,
    0,   18,  380,  404,    0,    0,   18,   18,    0,   18,
   18,   18,   45,   69,  123,    0,    0,    0,    0,    0,
   18,   18,   18,   18,   18,   18,   18,   18,   18,   18,
   18,   18,   18,   18,    0,   18,  153,    0,    0,    0,
    0,   18,   36,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,  -19,  283,   41,
  798,  814,  538,  686,  981,  993,  433,  442,  469, 1001,
 1003,    0,  -21,  -58,   18,  -58,    0,    0,   18,    0,
    0,   18,    0,    0,  -21,    0,    0,  -58,    0,    0,
    0,    0,  270,    0,    0,  -33,    0,   50,    0,    0,
    0,    0,    0,    0,   -7,  -58,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  -58,   18,   18,    0,
    0,    0,    0,    0,    0,
};
final static short yygindex[] = {                         0,
    0,  317,  310,   15,   54,    0,    0,    0,  290,    0,
  -16,    0,  -41,  -75,    0,    0,    0,    0,    0,    0,
    0,  926, 1230,  941, 1031,    0,  140,    0,  119,    0,
    0,  -90,    0,    0,    0,    0,
};
final static int YYTABLESIZE=1449;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                        101,
   41,  101,  101,  103,  132,   28,  101,   28,  144,  130,
  128,  101,  129,  135,  131,  139,   28,  151,  135,   88,
  180,   38,   43,  179,   45,  101,  132,  134,    1,  133,
  101,  130,  128,   41,  129,  135,  131,    5,   61,   38,
   72,   71,    7,   53,   33,   62,   33,   39,   53,   53,
   60,   53,   53,   53,   44,   10,  184,    9,  136,  179,
   47,   24,  132,  136,   22,   39,   53,  130,   53,   70,
   25,  135,  131,   58,   30,   61,   90,   72,   71,   90,
  136,   69,   62,   26,   69,   80,  213,   60,   80,  101,
   89,  101,   32,   89,  189,  190,   31,   53,   69,   69,
   39,   40,   80,   80,   41,   42,   70,   98,   61,   81,
   72,   71,   81,   54,   90,   62,  136,   40,   54,   54,
   60,   54,   54,   54,   91,   92,   81,   81,   42,  211,
   63,   99,  194,   69,  196,   40,   54,   80,   54,   70,
   61,  100,   72,   71,  101,  102,  203,   62,   61,  107,
   72,   71,   60,  108,  109,   62,  110,  111,  116,  117,
   60,   81,  118,   82,  212,   42,   82,   54,  137,  119,
  120,   70,  141,  121,  142,  221,  145,  146,  148,   70,
   82,   82,  152,  173,  175,  177,  182,  185,  199,   44,
   27,  204,   29,   44,   44,   44,   44,   44,   44,   44,
   31,   38,  201,  179,  206,   12,   13,   14,   15,   16,
   44,   44,   44,   44,   44,   82,  208,   43,  210,  217,
   43,  218,  219,  101,  101,  101,  101,  101,  101,    1,
  101,  101,  101,  101,   19,  101,  101,  101,  101,  101,
  101,  101,  101,   44,  122,   44,  101,   15,  124,  125,
  126,  127,  101,  101,   43,  101,  101,  101,  101,  101,
  101,  101,   12,   13,   14,   15,   16,   47,   43,   48,
   49,   50,   51,  220,   52,   53,   54,   55,   56,   57,
   58,    5,   20,   53,   53,   59,   19,   53,   53,   53,
   53,   19,   64,   43,   65,   66,   67,   68,   69,   12,
   13,   14,   15,   16,   47,  102,   48,   49,   50,   51,
   87,   52,   53,   54,   55,   56,   57,   58,   69,    6,
   20,   37,   59,   68,  202,    0,   68,  215,   19,   64,
    0,   65,   66,   67,   68,   69,  105,   47,    0,   48,
   68,   68,    0,    0,    0,    0,   54,    0,   56,   57,
   58,    0,    0,   54,   54,   59,    0,   54,   54,   54,
   54,    0,   64,    0,    0,   66,   67,   68,    0,   47,
    0,   48,    0,    0,    0,   68,    0,   47,   54,   48,
   56,   57,   58,    0,    0,    0,   54,   59,   56,   57,
   58,    0,    0,    0,   64,   59,    0,   66,   67,   68,
    0,    0,   64,    0,    0,   66,   67,   68,    0,    0,
    0,    0,    0,    0,    0,    0,   71,    0,    0,   18,
   71,   71,   71,   71,   71,    0,   71,    0,    0,   44,
   44,    0,    0,   44,   44,   44,   44,   71,   71,   71,
   72,   71,    0,    0,   72,   72,   72,   72,   72,    0,
   72,   12,   13,   14,   15,   16,    0,    0,    0,    0,
    0,   72,   72,   72,    0,   72,    0,    0,    0,   59,
   97,    0,   71,   59,   59,   59,   59,   59,   60,   59,
   19,    0,   60,   60,   60,   60,   60,    0,   60,    0,
   59,   59,   59,    0,   59,    0,   72,    0,    0,   60,
   60,   60,    0,   60,    0,   61,    0,    0,    0,   61,
   61,   61,   61,   61,  132,   61,    0,    0,  149,  130,
  128,    0,  129,  135,  131,   59,   61,   61,   61,    0,
   61,    0,    0,    0,   60,    0,    0,  134,    0,  133,
  132,    0,    0,    0,  174,  130,  128,    0,  129,  135,
  131,   12,   13,   14,   15,   16,    0,    0,    0,   68,
   68,   61,    0,  134,    0,  133,  132,    0,  136,    0,
  176,  130,  128,   17,  129,  135,  131,  132,   62,    0,
   19,   62,  130,  128,  181,  129,  135,  131,    0,  134,
    0,  133,    0,    0,  136,   62,   62,    0,    0,  132,
  134,    0,  133,  183,  130,  128,    0,  129,  135,  131,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
  136,    0,  134,    0,  133,    0,    0,    0,    0,  132,
   62,  136,    0,  186,  130,  128,    0,  129,  135,  131,
    0,  132,    0,    0,    0,  187,  130,  128,    0,  129,
  135,  131,  134,  136,  133,    0,   71,   71,    0,    0,
   71,   71,   71,   71,  134,    0,  133,  132,    0,    0,
    0,    0,  130,  128,    0,  129,  135,  131,    0,    0,
   72,   72,    0,  136,   72,   72,   72,   72,  188,    0,
  134,    0,  133,    0,    0,  136,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,   59,
   59,    0,    0,   59,   59,   59,   59,    0,   60,   60,
    0,  136,   60,   60,   60,   60,   63,    0,    0,   63,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,   63,   63,   61,   61,    0,    0,   61,
   61,   61,   61,    0,  122,  123,    0,    0,  124,  125,
  126,  127,    0,    0,    0,    0,  132,    0,    0,    0,
    0,  130,  128,    0,  129,  135,  131,    0,   63,    0,
  122,  123,    0,    0,  124,  125,  126,  127,  205,  134,
    0,  133,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  122,  123,    0,    0,
  124,  125,  126,  127,   62,   62,    0,  122,  123,    0,
  136,  124,  125,  126,  127,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,   66,  122,
  123,   66,  132,  124,  125,  126,  127,  130,  128,    0,
  129,  135,  131,    0,   67,   66,   66,   67,    0,    0,
    0,    0,    0,    0,    0,  134,    0,  133,    0,  122,
  123,   67,   67,  124,  125,  126,  127,    0,    0,    0,
    0,  122,  123,    0,    0,  124,  125,  126,  127,    0,
   66,    0,    0,    0,  132,    0,  136,    0,  191,  130,
  128,    0,  129,  135,  131,    0,   67,  122,  123,    0,
    0,  124,  125,  126,  127,  132,    0,  134,    0,  133,
  130,  128,    0,  129,  135,  131,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  132,  224,  134,    0,
  133,  130,  128,    0,  129,  135,  131,  132,  136,    0,
  197,    0,  130,  128,    0,  129,  135,  131,  225,  134,
    0,  133,   63,   63,    0,    0,    0,    0,   52,  136,
  134,   84,  133,   52,   52,  132,   52,   52,   52,    0,
  130,  128,    0,  129,  135,  131,   86,    0,    0,    0,
  136,   52,    0,   52,    0,    0,    0,    0,  134,    0,
  133,  136,    0,    0,    0,    0,  122,  123,    0,  132,
  124,  125,  126,  127,  130,  128,   84,  129,  135,  131,
    0,   57,   52,   57,   57,   57,    0,    0,    0,  136,
    0,   86,  134,   58,  133,   58,   58,   58,   57,   57,
   57,   65,   57,   64,   65,    0,   64,    0,    0,    0,
   58,   58,   58,    0,   58,    0,    0,    0,   65,   65,
   64,   64,    0,  136,    0,    0,    0,    0,    0,    0,
    0,    0,    0,   57,   66,   66,   87,    0,    0,    0,
   66,   66,  122,  123,    0,   58,  124,  125,  126,  127,
   67,   67,    0,   65,    0,   64,   67,   67,    0,   84,
    0,   84,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,   84,   86,    0,   86,    0,    0,    0,
    0,   87,    0,    0,    0,    0,    0,    0,   86,    0,
   84,   84,    0,    0,  122,  123,    0,    0,  124,  125,
  126,  127,   84,    0,    0,   86,   86,    0,    0,    0,
    0,    0,    0,    0,    0,  122,  123,   86,    0,  124,
  125,  126,  127,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  122,  123,    0,    0,
  124,  125,  126,  127,    0,    0,    0,  122,  123,    0,
    0,  124,  125,  126,  127,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   87,    0,   87,    0,   52,   52,
    0,    0,   52,   52,   52,   52,    0,    0,   87,  124,
  125,  126,  127,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,   87,   87,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,   87,    0,    0,
    0,    0,    0,  124,  125,    0,    0,   57,   57,    0,
    0,   57,   57,   57,   57,    0,    0,    0,    0,   58,
   58,    0,    0,   58,   58,   58,   58,   65,   65,   64,
   64,   94,    0,   65,   65,   64,   64,    0,    0,  103,
  104,  106,    0,    0,    0,    0,    0,    0,    0,  113,
  114,  115,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,  138,
    0,  140,    0,    0,    0,    0,    0,    0,  143,    0,
    0,  147,    0,    0,    0,    0,  150,  143,    0,  153,
  154,  155,    0,    0,    0,    0,    0,    0,    0,    0,
  158,  159,  160,  161,  162,  163,  164,  165,  166,  167,
  168,  169,  170,  171,    0,  172,    0,    0,    0,    0,
    0,  178,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,  143,    0,  195,    0,    0,    0,  198,    0,
    0,  200,    0,    0,  143,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,  222,  223,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                         33,
   59,   35,   36,   59,   37,   91,   40,   91,   99,   42,
   43,   45,   45,   46,   47,   91,   91,  108,   46,   41,
   41,   41,   39,   44,   41,   59,   37,   60,  261,   62,
   64,   42,   43,   41,   45,   46,   47,  276,   33,   59,
   35,   36,  263,   37,   30,   40,   32,   41,   42,   43,
   45,   45,   46,   47,   40,  123,   41,  276,   91,   44,
  262,  276,   37,   91,   11,   59,   60,   42,   62,   64,
   17,   46,   47,  275,   40,   33,   41,   35,   36,   44,
   91,   41,   40,   59,   44,   41,  288,   45,   44,  123,
   41,  125,   40,   44,  294,  295,   93,   91,   58,   59,
   41,   44,   58,   59,   41,  123,   64,   54,   33,   41,
   35,   36,   44,   37,   40,   40,   91,   41,   42,   43,
   45,   45,   46,   47,   40,   40,   58,   59,  123,  205,
  125,   40,  174,   93,  176,   59,   60,   93,   62,   64,
   33,   40,   35,   36,   40,   40,  188,   40,   33,   40,
   35,   36,   45,   40,   46,   40,   40,   40,   59,   59,
   45,   93,   59,   41,  206,  123,   44,   91,  276,   59,
   59,   64,   40,   61,   91,  217,   41,   41,  276,   64,
   58,   59,  276,   40,   59,   41,   41,   40,  276,   37,
  276,   41,  276,   41,   42,   43,   44,   45,   46,   47,
   93,  276,  123,   44,  268,  257,  258,  259,  260,  261,
   58,   59,   60,   61,   62,   93,   41,  276,   41,   41,
  276,   58,   58,  257,  258,  259,  260,  261,  262,    0,
  264,  265,  266,  267,  286,  269,  270,  271,  272,  273,
  274,  275,  276,   91,  277,   93,  280,  123,  281,  282,
  283,  284,  286,  287,  276,  289,  290,  291,  292,  293,
  294,  295,  257,  258,  259,  260,  261,  262,  276,  264,
  265,  266,  267,  125,  269,  270,  271,  272,  273,  274,
  275,   59,   41,  277,  278,  280,   41,  281,  282,  283,
  284,  286,  287,  276,  289,  290,  291,  292,  293,  257,
  258,  259,  260,  261,  262,   59,  264,  265,  266,  267,
   41,  269,  270,  271,  272,  273,  274,  275,  278,    3,
   11,   32,  280,   41,  185,   -1,   44,  209,  286,  287,
   -1,  289,  290,  291,  292,  293,  261,  262,   -1,  264,
   58,   59,   -1,   -1,   -1,   -1,  271,   -1,  273,  274,
  275,   -1,   -1,  277,  278,  280,   -1,  281,  282,  283,
  284,   -1,  287,   -1,   -1,  290,  291,  292,   -1,  262,
   -1,  264,   -1,   -1,   -1,   93,   -1,  262,  271,  264,
  273,  274,  275,   -1,   -1,   -1,  271,  280,  273,  274,
  275,   -1,   -1,   -1,  287,  280,   -1,  290,  291,  292,
   -1,   -1,  287,   -1,   -1,  290,  291,  292,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   37,   -1,   -1,  125,
   41,   42,   43,   44,   45,   -1,   47,   -1,   -1,  277,
  278,   -1,   -1,  281,  282,  283,  284,   58,   59,   60,
   37,   62,   -1,   -1,   41,   42,   43,   44,   45,   -1,
   47,  257,  258,  259,  260,  261,   -1,   -1,   -1,   -1,
   -1,   58,   59,   60,   -1,   62,   -1,   -1,   -1,   37,
  276,   -1,   93,   41,   42,   43,   44,   45,   37,   47,
  286,   -1,   41,   42,   43,   44,   45,   -1,   47,   -1,
   58,   59,   60,   -1,   62,   -1,   93,   -1,   -1,   58,
   59,   60,   -1,   62,   -1,   37,   -1,   -1,   -1,   41,
   42,   43,   44,   45,   37,   47,   -1,   -1,   41,   42,
   43,   -1,   45,   46,   47,   93,   58,   59,   60,   -1,
   62,   -1,   -1,   -1,   93,   -1,   -1,   60,   -1,   62,
   37,   -1,   -1,   -1,   41,   42,   43,   -1,   45,   46,
   47,  257,  258,  259,  260,  261,   -1,   -1,   -1,  277,
  278,   93,   -1,   60,   -1,   62,   37,   -1,   91,   -1,
   41,   42,   43,  279,   45,   46,   47,   37,   41,   -1,
  286,   44,   42,   43,   44,   45,   46,   47,   -1,   60,
   -1,   62,   -1,   -1,   91,   58,   59,   -1,   -1,   37,
   60,   -1,   62,   41,   42,   43,   -1,   45,   46,   47,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   91,   -1,   60,   -1,   62,   -1,   -1,   -1,   -1,   37,
   93,   91,   -1,   41,   42,   43,   -1,   45,   46,   47,
   -1,   37,   -1,   -1,   -1,   41,   42,   43,   -1,   45,
   46,   47,   60,   91,   62,   -1,  277,  278,   -1,   -1,
  281,  282,  283,  284,   60,   -1,   62,   37,   -1,   -1,
   -1,   -1,   42,   43,   -1,   45,   46,   47,   -1,   -1,
  277,  278,   -1,   91,  281,  282,  283,  284,   58,   -1,
   60,   -1,   62,   -1,   -1,   91,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  277,
  278,   -1,   -1,  281,  282,  283,  284,   -1,  277,  278,
   -1,   91,  281,  282,  283,  284,   41,   -1,   -1,   44,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   58,   59,  277,  278,   -1,   -1,  281,
  282,  283,  284,   -1,  277,  278,   -1,   -1,  281,  282,
  283,  284,   -1,   -1,   -1,   -1,   37,   -1,   -1,   -1,
   -1,   42,   43,   -1,   45,   46,   47,   -1,   93,   -1,
  277,  278,   -1,   -1,  281,  282,  283,  284,   59,   60,
   -1,   62,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,  277,  278,   -1,   -1,
  281,  282,  283,  284,  277,  278,   -1,  277,  278,   -1,
   91,  281,  282,  283,  284,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   41,  277,
  278,   44,   37,  281,  282,  283,  284,   42,   43,   -1,
   45,   46,   47,   -1,   41,   58,   59,   44,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   60,   -1,   62,   -1,  277,
  278,   58,   59,  281,  282,  283,  284,   -1,   -1,   -1,
   -1,  277,  278,   -1,   -1,  281,  282,  283,  284,   -1,
   93,   -1,   -1,   -1,   37,   -1,   91,   -1,   93,   42,
   43,   -1,   45,   46,   47,   -1,   93,  277,  278,   -1,
   -1,  281,  282,  283,  284,   37,   -1,   60,   -1,   62,
   42,   43,   -1,   45,   46,   47,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   37,   59,   60,   -1,
   62,   42,   43,   -1,   45,   46,   47,   37,   91,   -1,
   93,   -1,   42,   43,   -1,   45,   46,   47,   59,   60,
   -1,   62,  277,  278,   -1,   -1,   -1,   -1,   37,   91,
   60,   46,   62,   42,   43,   37,   45,   46,   47,   -1,
   42,   43,   -1,   45,   46,   47,   46,   -1,   -1,   -1,
   91,   60,   -1,   62,   -1,   -1,   -1,   -1,   60,   -1,
   62,   91,   -1,   -1,   -1,   -1,  277,  278,   -1,   37,
  281,  282,  283,  284,   42,   43,   91,   45,   46,   47,
   -1,   41,   91,   43,   44,   45,   -1,   -1,   -1,   91,
   -1,   91,   60,   41,   62,   43,   44,   45,   58,   59,
   60,   41,   62,   41,   44,   -1,   44,   -1,   -1,   -1,
   58,   59,   60,   -1,   62,   -1,   -1,   -1,   58,   59,
   58,   59,   -1,   91,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   93,  277,  278,   46,   -1,   -1,   -1,
  283,  284,  277,  278,   -1,   93,  281,  282,  283,  284,
  277,  278,   -1,   93,   -1,   93,  283,  284,   -1,  174,
   -1,  176,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,  188,  174,   -1,  176,   -1,   -1,   -1,
   -1,   91,   -1,   -1,   -1,   -1,   -1,   -1,  188,   -1,
  205,  206,   -1,   -1,  277,  278,   -1,   -1,  281,  282,
  283,  284,  217,   -1,   -1,  205,  206,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,  277,  278,  217,   -1,  281,
  282,  283,  284,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,  277,  278,   -1,   -1,
  281,  282,  283,  284,   -1,   -1,   -1,  277,  278,   -1,
   -1,  281,  282,  283,  284,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,  174,   -1,  176,   -1,  277,  278,
   -1,   -1,  281,  282,  283,  284,   -1,   -1,  188,  281,
  282,  283,  284,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,  205,  206,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,  217,   -1,   -1,
   -1,   -1,   -1,  281,  282,   -1,   -1,  277,  278,   -1,
   -1,  281,  282,  283,  284,   -1,   -1,   -1,   -1,  277,
  278,   -1,   -1,  281,  282,  283,  284,  277,  278,  277,
  278,   52,   -1,  283,  284,  283,  284,   -1,   -1,   60,
   61,   62,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   70,
   71,   72,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   90,
   -1,   92,   -1,   -1,   -1,   -1,   -1,   -1,   99,   -1,
   -1,  102,   -1,   -1,   -1,   -1,  107,  108,   -1,  110,
  111,  112,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
  121,  122,  123,  124,  125,  126,  127,  128,  129,  130,
  131,  132,  133,  134,   -1,  136,   -1,   -1,   -1,   -1,
   -1,  142,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,  173,   -1,  175,   -1,   -1,   -1,  179,   -1,
   -1,  182,   -1,   -1,  185,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,  218,  219,
};
}
final static short YYFINAL=2;
final static short YYMAXTOKEN=297;
final static String yyname[] = {
"end-of-file",null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,"'!'",null,"'#'","'$'","'%'",null,null,"'('","')'","'*'","'+'",
"','","'-'","'.'","'/'",null,null,null,null,null,null,null,null,null,null,"':'",
"';'","'<'","'='","'>'",null,"'@'",null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,"'['",null,"']'",null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,"'{'",null,"'}'",null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,"VOID","BOOL","INT","STRING",
"CLASS","NULL","EXTENDS","THIS","WHILE","FOR","IF","ELSE","RETURN","BREAK",
"NEW","PRINT","READ_INTEGER","READ_LINE","LITERAL","IDENTIFIER","AND","OR",
"STATIC","INSTANCEOF","LESS_EQUAL","GREATER_EQUAL","EQUAL","NOT_EQUAL","IMAGE",
"COMPLEX","CASE","DEFULT","PRINTCOMP","SUPER","DCOPY","SCOPY","DDO","OOD","DDD",
"UMINUS","EMPTY",
};
final static String yyrule[] = {
"$accept : Program",
"Program : ClassList",
"ClassList : ClassList ClassDef",
"ClassList : ClassDef",
"VariableDef : Variable ';'",
"Variable : Type IDENTIFIER",
"Type : INT",
"Type : COMPLEX",
"Type : VOID",
"Type : BOOL",
"Type : STRING",
"Type : CLASS IDENTIFIER",
"Type : Type '[' ']'",
"ClassDef : CLASS IDENTIFIER ExtendsClause '{' FieldList '}'",
"ExtendsClause : EXTENDS IDENTIFIER",
"ExtendsClause :",
"FieldList : FieldList VariableDef",
"FieldList : FieldList FunctionDef",
"FieldList :",
"Formals : VariableList",
"Formals :",
"VariableList : VariableList ',' Variable",
"VariableList : Variable",
"FunctionDef : STATIC Type IDENTIFIER '(' Formals ')' StmtBlock",
"FunctionDef : Type IDENTIFIER '(' Formals ')' StmtBlock",
"StmtBlock : '{' StmtList '}'",
"StmtList : StmtList Stmt",
"StmtList :",
"Stmt : VariableDef",
"Stmt : SimpleStmt ';'",
"Stmt : IfStmt",
"Stmt : DoStmt ';'",
"Stmt : WhileStmt",
"Stmt : ForStmt",
"Stmt : ReturnStmt ';'",
"Stmt : PrintStmt ';'",
"Stmt : BreakStmt ';'",
"Stmt : StmtBlock",
"SimpleStmt : LValue '=' Expr",
"SimpleStmt : Call",
"SimpleStmt : Super",
"SimpleStmt :",
"Receiver : Expr '.'",
"Receiver :",
"LValue : Receiver IDENTIFIER",
"LValue : Expr '[' Expr ']'",
"Call : Receiver IDENTIFIER '(' Actuals ')'",
"ACaseExpr : Constant ':' Expr ';'",
"DefaultExpr : DEFULT ':' Expr ';'",
"ACaseExprlist : ACaseExprlist ACaseExpr",
"ACaseExprlist :",
"Super : SUPER '.' IDENTIFIER '(' Actuals ')'",
"Expr : LValue",
"Expr : Call",
"Expr : Super",
"Expr : Constant",
"Expr : CASE '(' Expr ')' '{' ACaseExprlist DefaultExpr '}'",
"Expr : Expr '+' Expr",
"Expr : Expr '-' Expr",
"Expr : Expr '*' Expr",
"Expr : Expr '/' Expr",
"Expr : Expr '%' Expr",
"Expr : Expr EQUAL Expr",
"Expr : Expr NOT_EQUAL Expr",
"Expr : Expr '<' Expr",
"Expr : Expr '>' Expr",
"Expr : Expr LESS_EQUAL Expr",
"Expr : Expr GREATER_EQUAL Expr",
"Expr : Expr AND Expr",
"Expr : Expr OR Expr",
"Expr : '(' Expr ')'",
"Expr : '-' Expr",
"Expr : '!' Expr",
"Expr : READ_INTEGER '(' ')'",
"Expr : READ_LINE '(' ')'",
"Expr : THIS",
"Expr : NEW IDENTIFIER '(' ')'",
"Expr : NEW Type '[' Expr ']'",
"Expr : INSTANCEOF '(' Expr ',' IDENTIFIER ')'",
"Expr : '(' CLASS IDENTIFIER ')' Expr",
"Expr : '@' Expr",
"Expr : '$' Expr",
"Expr : '#' Expr",
"Expr : DCOPY '(' Expr ')'",
"Expr : SCOPY '(' Expr ')'",
"Constant : LITERAL",
"Constant : NULL",
"Actuals : ExprList",
"Actuals :",
"ExprList : ExprList ',' Expr",
"ExprList : Expr",
"DoSubStmt : Expr ':' Stmt",
"DoBranch : DoSubStmt DDD",
"DoBranchlist : DoBranchlist DoBranch",
"DoBranchlist :",
"DoStmt : DDO DoBranchlist DoSubStmt OOD",
"WhileStmt : WHILE '(' Expr ')' Stmt",
"ForStmt : FOR '(' SimpleStmt ';' Expr ';' SimpleStmt ')' Stmt",
"BreakStmt : BREAK",
"IfStmt : IF '(' Expr ')' Stmt ElseClause",
"ElseClause : ELSE Stmt",
"ElseClause :",
"ReturnStmt : RETURN Expr",
"ReturnStmt : RETURN",
"PrintStmt : PRINT '(' ExprList ')'",
"PrintStmt : PRINTCOMP '(' ExprList ')'",
};

//#line 536 "Parser.y"
    
	/**
	 * 打印当前归约所用的语法规则<br>
	 * 请勿修改。
	 */
    public boolean onReduce(String rule) {
		if (rule.startsWith("$$"))
			return false;
		else
			rule = rule.replaceAll(" \\$\\$\\d+", "");

   	    if (rule.endsWith(":"))
    	    System.out.println(rule + " <empty>");
   	    else
			System.out.println(rule);
		return false;
    }
    
    public void diagnose() {
		addReduceListener(this);
		yyparse();
	}
//#line 720 "Parser.java"
//###############################################################
// method: yylexdebug : check lexer state
//###############################################################
void yylexdebug(int state,int ch)
{
String s=null;
  if (ch < 0) ch=0;
  if (ch <= YYMAXTOKEN) //check index bounds
     s = yyname[ch];    //now get it
  if (s==null)
    s = "illegal-symbol";
  debug("state "+state+", reading "+ch+" ("+s+")");
}





//The following are now global, to aid in error reporting
int yyn;       //next next thing to do
int yym;       //
int yystate;   //current parsing state from state table
String yys;    //current token string


//###############################################################
// method: yyparse : parse input and execute indicated items
//###############################################################
int yyparse()
{
boolean doaction;
  init_stacks();
  yynerrs = 0;
  yyerrflag = 0;
  yychar = -1;          //impossible char forces a read
  yystate=0;            //initial state
  state_push(yystate);  //save it
  while (true) //until parsing is done, either correctly, or w/error
    {
    doaction=true;
    //if (yydebug) debug("loop"); 
    //#### NEXT ACTION (from reduction table)
    for (yyn=yydefred[yystate];yyn==0;yyn=yydefred[yystate])
      {
      //if (yydebug) debug("yyn:"+yyn+"  state:"+yystate+"  yychar:"+yychar);
      if (yychar < 0)      //we want a char?
        {
        yychar = yylex();  //get next token
        //if (yydebug) debug(" next yychar:"+yychar);
        //#### ERROR CHECK ####
        //if (yychar < 0)    //it it didn't work/error
        //  {
        //  yychar = 0;      //change it to default string (no -1!)
          //if (yydebug)
          //  yylexdebug(yystate,yychar);
        //  }
        }//yychar<0
      yyn = yysindex[yystate];  //get amount to shift by (shift index)
      if ((yyn != 0) && (yyn += yychar) >= 0 &&
          yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
        {
        //if (yydebug)
          //debug("state "+yystate+", shifting to state "+yytable[yyn]);
        //#### NEXT STATE ####
        yystate = yytable[yyn];//we are in a new state
        state_push(yystate);   //save it
        val_push(yylval);      //push our lval as the input for next rule
        yychar = -1;           //since we have 'eaten' a token, say we need another
        if (yyerrflag > 0)     //have we recovered an error?
           --yyerrflag;        //give ourselves credit
        doaction=false;        //but don't process yet
        break;   //quit the yyn=0 loop
        }

    yyn = yyrindex[yystate];  //reduce
    if ((yyn !=0 ) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
      {   //we reduced!
      //if (yydebug) debug("reduce");
      yyn = yytable[yyn];
      doaction=true; //get ready to execute
      break;         //drop down to actions
      }
    else //ERROR RECOVERY
      {
      if (yyerrflag==0)
        {
        yyerror("syntax error");
        yynerrs++;
        }
      if (yyerrflag < 3) //low error count?
        {
        yyerrflag = 3;
        while (true)   //do until break
          {
          if (stateptr<0 || valptr<0)   //check for under & overflow here
            {
            return 1;
            }
          yyn = yysindex[state_peek(0)];
          if ((yyn != 0) && (yyn += YYERRCODE) >= 0 &&
                    yyn <= YYTABLESIZE && yycheck[yyn] == YYERRCODE)
            {
            //if (yydebug)
              //debug("state "+state_peek(0)+", error recovery shifting to state "+yytable[yyn]+" ");
            yystate = yytable[yyn];
            state_push(yystate);
            val_push(yylval);
            doaction=false;
            break;
            }
          else
            {
            //if (yydebug)
              //debug("error recovery discarding state "+state_peek(0)+" ");
            if (stateptr<0 || valptr<0)   //check for under & overflow here
              {
              return 1;
              }
            state_pop();
            val_pop();
            }
          }
        }
      else            //discard this token
        {
        if (yychar == 0)
          return 1; //yyabort
        //if (yydebug)
          //{
          //yys = null;
          //if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
          //if (yys == null) yys = "illegal-symbol";
          //debug("state "+yystate+", error recovery discards token "+yychar+" ("+yys+")");
          //}
        yychar = -1;  //read another
        }
      }//end error recovery
    }//yyn=0 loop
    if (!doaction)   //any reason not to proceed?
      continue;      //skip action
    yym = yylen[yyn];          //get count of terminals on rhs
    //if (yydebug)
      //debug("state "+yystate+", reducing "+yym+" by rule "+yyn+" ("+yyrule[yyn]+")");
    if (yym>0)                 //if count of rhs not 'nil'
      yyval = val_peek(yym-1); //get current semantic value
    if (reduceListener == null || reduceListener.onReduce(yyrule[yyn])) // if intercepted!
      switch(yyn)
      {
//########## USER-SUPPLIED ACTIONS ##########
case 1:
//#line 57 "Parser.y"
{
						tree = new Tree.TopLevel(val_peek(0).clist, val_peek(0).loc);
					}
break;
case 2:
//#line 63 "Parser.y"
{
						yyval.clist.add(val_peek(0).cdef);
					}
break;
case 3:
//#line 67 "Parser.y"
{
                		yyval.clist = new ArrayList<Tree.ClassDef>();
                		yyval.clist.add(val_peek(0).cdef);
                	}
break;
case 5:
//#line 77 "Parser.y"
{
						yyval.vdef = new Tree.VarDef(val_peek(0).ident, val_peek(1).type, val_peek(0).loc);
					}
break;
case 6:
//#line 84 "Parser.y"
{
                        yyval.type = new Tree.TypeIdent(Tree.INT, val_peek(0).loc);

                    }
break;
case 7:
//#line 89 "Parser.y"
{
                        yyval.type = new Tree.TypeIdent(Tree.COMPLEX, val_peek(0).loc);
                    }
break;
case 8:
//#line 94 "Parser.y"
{
                        yyval.type = new Tree.TypeIdent(Tree.VOID, val_peek(0).loc);
                    }
break;
case 9:
//#line 98 "Parser.y"
{
                        yyval.type = new Tree.TypeIdent(Tree.BOOL, val_peek(0).loc);
                    }
break;
case 10:
//#line 102 "Parser.y"
{
                        yyval.type = new Tree.TypeIdent(Tree.STRING, val_peek(0).loc);
                    }
break;
case 11:
//#line 106 "Parser.y"
{
                        yyval.type = new Tree.TypeClass(val_peek(0).ident, val_peek(1).loc);
                    }
break;
case 12:
//#line 110 "Parser.y"
{
                        yyval.type = new Tree.TypeArray(val_peek(2).type, val_peek(2).loc);
                    }
break;
case 13:
//#line 116 "Parser.y"
{
						yyval.cdef = new Tree.ClassDef(val_peek(4).ident, val_peek(3).ident, val_peek(1).flist, val_peek(5).loc);
					}
break;
case 14:
//#line 122 "Parser.y"
{
						yyval.ident = val_peek(0).ident;
					}
break;
case 15:
//#line 126 "Parser.y"
{
                		yyval = new SemValue();
                	}
break;
case 16:
//#line 132 "Parser.y"
{
						yyval.flist.add(val_peek(0).vdef);
					}
break;
case 17:
//#line 136 "Parser.y"
{
						yyval.flist.add(val_peek(0).fdef);
					}
break;
case 18:
//#line 140 "Parser.y"
{
                		yyval = new SemValue();
                		yyval.flist = new ArrayList<Tree>();
                	}
break;
case 20:
//#line 148 "Parser.y"
{
                		yyval = new SemValue();
                		yyval.vlist = new ArrayList<Tree.VarDef>(); 
                	}
break;
case 21:
//#line 155 "Parser.y"
{
						yyval.vlist.add(val_peek(0).vdef);
					}
break;
case 22:
//#line 159 "Parser.y"
{
                		yyval.vlist = new ArrayList<Tree.VarDef>();
						yyval.vlist.add(val_peek(0).vdef);
                	}
break;
case 23:
//#line 166 "Parser.y"
{
						yyval.fdef = new MethodDef(true, val_peek(4).ident, val_peek(5).type, val_peek(2).vlist, (Block) val_peek(0).stmt, val_peek(4).loc);
					}
break;
case 24:
//#line 170 "Parser.y"
{
						yyval.fdef = new MethodDef(false, val_peek(4).ident, val_peek(5).type, val_peek(2).vlist, (Block) val_peek(0).stmt, val_peek(4).loc);
					}
break;
case 25:
//#line 176 "Parser.y"
{
						yyval.stmt = new Block(val_peek(1).slist, val_peek(2).loc);
					}
break;
case 26:
//#line 182 "Parser.y"
{
						yyval.slist.add(val_peek(0).stmt);
					}
break;
case 27:
//#line 186 "Parser.y"
{
                		yyval = new SemValue();
                		yyval.slist = new ArrayList<Tree>();
                	}
break;
case 28:
//#line 193 "Parser.y"
{
						yyval.stmt = val_peek(0).vdef;
					}
break;
case 29:
//#line 198 "Parser.y"
{
                		if (yyval.stmt == null) {
                			yyval.stmt = new Tree.Skip(val_peek(0).loc);
                		}
                	}
break;
case 38:
//#line 214 "Parser.y"
{
						yyval.stmt = new Tree.Assign(val_peek(2).lvalue, val_peek(0).expr, val_peek(1).loc);
					}
break;
case 39:
//#line 218 "Parser.y"
{
                		yyval.stmt = new Tree.Exec(val_peek(0).expr, val_peek(0).loc);
                	}
break;
case 40:
//#line 222 "Parser.y"
{
                        yyval.stmt = new Tree.Exec(val_peek(0).expr, val_peek(0).loc);
                    }
break;
case 41:
//#line 226 "Parser.y"
{
                		yyval = new SemValue();
                	}
break;
case 43:
//#line 233 "Parser.y"
{
                		yyval = new SemValue();
                	}
break;
case 44:
//#line 239 "Parser.y"
{
						yyval.lvalue = new Tree.Ident(val_peek(1).expr, val_peek(0).ident, val_peek(0).loc);
						if (val_peek(1).loc == null) {
							yyval.loc = val_peek(0).loc;
						}
					}
break;
case 45:
//#line 246 "Parser.y"
{
                		yyval.lvalue = new Tree.Indexed(val_peek(3).expr, val_peek(1).expr, val_peek(3).loc);
                	}
break;
case 46:
//#line 252 "Parser.y"
{
						yyval.expr = new Tree.CallExpr(val_peek(4).expr, val_peek(3).ident, val_peek(1).elist, val_peek(3).loc);
						if (val_peek(4).loc == null) {
							yyval.loc = val_peek(3).loc;
						}
					}
break;
case 47:
//#line 261 "Parser.y"
{
                     yyval = new SemValue();
                     yyval.cexpr = new Tree.CaseExpr(val_peek(3).expr,val_peek(1).expr,val_peek(3).loc);
                }
break;
case 48:
//#line 268 "Parser.y"
{
                    yyval = new SemValue();
                    yyval.dfexpr = new Tree.DfExpr(val_peek(1).expr,val_peek(3).loc);
                }
break;
case 49:
//#line 275 "Parser.y"
{
                    yyval.celist.add(val_peek(0).cexpr);
                }
break;
case 50:
//#line 279 "Parser.y"
{
                    yyval = new SemValue();
                    yyval.celist = new ArrayList<CaseExpr>();
                }
break;
case 51:
//#line 286 "Parser.y"
{
                        yyval = new SemValue();
                        yyval.expr = new Tree.SuperExpr(val_peek(3).ident, val_peek(1).elist, val_peek(3).loc);
                        yyval.loc = val_peek(3).loc;
                    }
break;
case 52:
//#line 293 "Parser.y"
{
						yyval.expr = val_peek(0).lvalue;
					}
break;
case 56:
//#line 301 "Parser.y"
{
                        yyval.expr = new Tree.Case(val_peek(5).expr, val_peek(2).celist,val_peek(1).dfexpr ,val_peek(7).loc);
                    }
break;
case 57:
//#line 306 "Parser.y"
{
                        yyval.expr = new Tree.Binary(Tree.PLUS, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                    }
break;
case 58:
//#line 310 "Parser.y"
{
                        yyval.expr = new Tree.Binary(Tree.MINUS, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                    }
break;
case 59:
//#line 314 "Parser.y"
{
                        yyval.expr = new Tree.Binary(Tree.MUL, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                    }
break;
case 60:
//#line 318 "Parser.y"
{
                        yyval.expr = new Tree.Binary(Tree.DIV, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                    }
break;
case 61:
//#line 322 "Parser.y"
{
                        yyval.expr = new Tree.Binary(Tree.MOD, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                    }
break;
case 62:
//#line 326 "Parser.y"
{
                        yyval.expr = new Tree.Binary(Tree.EQ, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                    }
break;
case 63:
//#line 330 "Parser.y"
{
                        yyval.expr = new Tree.Binary(Tree.NE, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                    }
break;
case 64:
//#line 334 "Parser.y"
{
                        yyval.expr = new Tree.Binary(Tree.LT, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                    }
break;
case 65:
//#line 338 "Parser.y"
{
                        yyval.expr = new Tree.Binary(Tree.GT, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                    }
break;
case 66:
//#line 342 "Parser.y"
{
                        yyval.expr = new Tree.Binary(Tree.LE, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                    }
break;
case 67:
//#line 346 "Parser.y"
{
                        yyval.expr = new Tree.Binary(Tree.GE, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                    }
break;
case 68:
//#line 350 "Parser.y"
{
                        yyval.expr = new Tree.Binary(Tree.AND, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                    }
break;
case 69:
//#line 354 "Parser.y"
{
                        yyval.expr = new Tree.Binary(Tree.OR, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                    }
break;
case 70:
//#line 358 "Parser.y"
{
                        yyval = val_peek(1);
                    }
break;
case 71:
//#line 362 "Parser.y"
{
                        yyval.expr = new Tree.Unary(Tree.NEG, val_peek(0).expr, val_peek(1).loc);
                    }
break;
case 72:
//#line 366 "Parser.y"
{
                        yyval.expr = new Tree.Unary(Tree.NOT, val_peek(0).expr, val_peek(1).loc);
                    }
break;
case 73:
//#line 370 "Parser.y"
{
                        yyval.expr = new Tree.ReadIntExpr(val_peek(2).loc);
                    }
break;
case 74:
//#line 374 "Parser.y"
{
                        yyval.expr = new Tree.ReadLineExpr(val_peek(2).loc);
                    }
break;
case 75:
//#line 378 "Parser.y"
{
                        yyval.expr = new Tree.ThisExpr(val_peek(0).loc);
                    }
break;
case 76:
//#line 382 "Parser.y"
{
                        yyval.expr = new Tree.NewClass(val_peek(2).ident, val_peek(3).loc);
                    }
break;
case 77:
//#line 386 "Parser.y"
{
                        yyval.expr = new Tree.NewArray(val_peek(3).type, val_peek(1).expr, val_peek(4).loc);
                    }
break;
case 78:
//#line 390 "Parser.y"
{
                        yyval.expr = new Tree.TypeTest(val_peek(3).expr, val_peek(1).ident, val_peek(5).loc);
                    }
break;
case 79:
//#line 394 "Parser.y"
{
                        yyval.expr = new Tree.TypeCast(val_peek(2).ident, val_peek(0).expr, val_peek(0).loc);
                    }
break;
case 80:
//#line 398 "Parser.y"
{
                        yyval.expr = new Tree.Unary(Tree.RE, val_peek(0).expr, val_peek(1).loc);
                    }
break;
case 81:
//#line 402 "Parser.y"
{
                        yyval.expr = new Tree.Unary(Tree.IM, val_peek(0).expr, val_peek(1).loc);
                    }
break;
case 82:
//#line 406 "Parser.y"
{
                        yyval.expr = new Tree.Unary(Tree.TR, val_peek(0).expr, val_peek(1).loc);
                    }
break;
case 83:
//#line 410 "Parser.y"
{
                        yyval.expr = new Tree.CopyExpr("dcopy",val_peek(1).expr, val_peek(3).loc);
                    }
break;
case 84:
//#line 414 "Parser.y"
{
                        yyval.expr = new Tree.CopyExpr("scopy",val_peek(1).expr, val_peek(3).loc);
                    }
break;
case 85:
//#line 420 "Parser.y"
{
						yyval.expr = new Tree.Literal(val_peek(0).typeTag, val_peek(0).literal, val_peek(0).loc);
					}
break;
case 86:
//#line 424 "Parser.y"
{
						yyval.expr = new Null(val_peek(0).loc);
					}
break;
case 88:
//#line 431 "Parser.y"
{
                		yyval = new SemValue();
                		yyval.elist = new ArrayList<Tree.Expr>();
                	}
break;
case 89:
//#line 438 "Parser.y"
{
						yyval.elist.add(val_peek(0).expr);
					}
break;
case 90:
//#line 442 "Parser.y"
{
                		yyval.elist = new ArrayList<Tree.Expr>();
						yyval.elist.add(val_peek(0).expr);
                	}
break;
case 91:
//#line 450 "Parser.y"
{
						/*System.out.println($3.loc);*/
						yyval = new SemValue();
						yyval.dstmt = new Tree.DoSubStmt(val_peek(2).expr,val_peek(0).stmt,val_peek(2).loc);
					}
break;
case 92:
//#line 458 "Parser.y"
{
						yyval.dstmt = val_peek(1).dstmt;
					}
break;
case 93:
//#line 465 "Parser.y"
{
						yyval.Dolist.add(val_peek(0).dstmt);
					}
break;
case 94:
//#line 469 "Parser.y"
{
						yyval.Dolist = new ArrayList<Tree>();
					}
break;
case 95:
//#line 476 "Parser.y"
{
						yyval.stmt = new Tree.DoStmt(val_peek(2).Dolist,val_peek(1).dstmt,val_peek(3).loc);
					}
break;
case 96:
//#line 482 "Parser.y"
{
						yyval.stmt = new Tree.WhileLoop(val_peek(2).expr, val_peek(0).stmt, val_peek(4).loc);
					}
break;
case 97:
//#line 488 "Parser.y"
{
						yyval.stmt = new Tree.ForLoop(val_peek(6).stmt, val_peek(4).expr, val_peek(2).stmt, val_peek(0).stmt, val_peek(8).loc);
					}
break;
case 98:
//#line 494 "Parser.y"
{
						yyval.stmt = new Tree.Break(val_peek(0).loc);
					}
break;
case 99:
//#line 500 "Parser.y"
{
						yyval.stmt = new Tree.If(val_peek(3).expr, val_peek(1).stmt, val_peek(0).stmt, val_peek(5).loc);
					}
break;
case 100:
//#line 506 "Parser.y"
{
						yyval.stmt = val_peek(0).stmt;
					}
break;
case 101:
//#line 510 "Parser.y"
{
						yyval = new SemValue();
					}
break;
case 102:
//#line 516 "Parser.y"
{
						yyval.stmt = new Tree.Return(val_peek(0).expr, val_peek(1).loc);
					}
break;
case 103:
//#line 520 "Parser.y"
{
                		yyval.stmt = new Tree.Return(null, val_peek(0).loc);
                	}
break;
case 104:
//#line 526 "Parser.y"
{
                        yyval.stmt = new Print(val_peek(1).elist, val_peek(3).loc);
                    }
break;
case 105:
//#line 530 "Parser.y"
{
                        yyval.stmt = new PrintComp(val_peek(1).elist, val_peek(3).loc);
                    }
break;
//#line 1429 "Parser.java"
//########## END OF USER-SUPPLIED ACTIONS ##########
    }//switch
    //#### Now let's reduce... ####
    //if (yydebug) debug("reduce");
    state_drop(yym);             //we just reduced yylen states
    yystate = state_peek(0);     //get new state
    val_drop(yym);               //corresponding value drop
    yym = yylhs[yyn];            //select next TERMINAL(on lhs)
    if (yystate == 0 && yym == 0)//done? 'rest' state and at first TERMINAL
      {
      //if (yydebug) debug("After reduction, shifting from state 0 to state "+YYFINAL+"");
      yystate = YYFINAL;         //explicitly say we're done
      state_push(YYFINAL);       //and save it
      val_push(yyval);           //also save the semantic value of parsing
      if (yychar < 0)            //we want another character?
        {
        yychar = yylex();        //get next character
        //if (yychar<0) yychar=0;  //clean, if necessary
        //if (yydebug)
          //yylexdebug(yystate,yychar);
        }
      if (yychar == 0)          //Good exit (if lex returns 0 ;-)
         break;                 //quit the loop--all DONE
      }//if yystate
    else                        //else not done yet
      {                         //get next state and push, for next yydefred[]
      yyn = yygindex[yym];      //find out where to go
      if ((yyn != 0) && (yyn += yystate) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yystate)
        yystate = yytable[yyn]; //get new state
      else
        yystate = yydgoto[yym]; //else go to new defred
      //if (yydebug) debug("after reduction, shifting from state "+state_peek(0)+" to state "+yystate+"");
      state_push(yystate);     //going again, so push state & val...
      val_push(yyval);         //for next action
      }
    }//main loop
  return 0;//yyaccept!!
}
//## end of method parse() ######################################



//## run() --- for Thread #######################################
//## The -Jnorun option was used ##
//## end of method run() ########################################



//## Constructors ###############################################
//## The -Jnoconstruct option was used ##
//###############################################################



}
//################### END OF CLASS ##############################
