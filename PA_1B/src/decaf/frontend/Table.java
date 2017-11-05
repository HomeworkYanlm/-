/* This is auto-generated source by LL1-Parser-Gen.
 * Specification file: /Users/liminyan/Desktop/work/PA_1B/src/decaf/frontend/Parser.spec
 * Options: unstrict mode
 * Generated at: Sun Nov 05 21:03:57 CST 2017
 * Please do NOT modify it!
 *
 * Project repository: https://github.com/paulzfm/LL1-Parser-Gen
 * Version: special version for decaf-PA1-B
 * Author: Zhu Fengmin (Paul)
 */

package decaf.frontend;

import decaf.Location;
import decaf.tree.Tree;
import decaf.tree.Tree.*;
import java.util.*;
import javafx.util.Pair;

public class Table
 {
    public static final int eof = -1;
    public static final int eos = 0;
    
    /* tokens and symbols */
    public static final int VOID = 257; //# line 14
    public static final int BOOL = 258; //# line 14
    public static final int INT = 259; //# line 14
    public static final int STRING = 260; //# line 14
    public static final int CLASS = 261; //# line 14
    public static final int NULL = 262; //# line 15
    public static final int EXTENDS = 263; //# line 15
    public static final int THIS = 264; //# line 15
    public static final int WHILE = 265; //# line 15
    public static final int FOR = 266; //# line 15
    public static final int IF = 267; //# line 16
    public static final int ELSE = 268; //# line 16
    public static final int RETURN = 269; //# line 16
    public static final int BREAK = 270; //# line 16
    public static final int NEW = 271; //# line 16
    public static final int CASE = 272; //# line 17
    public static final int OOD = 273; //# line 17
    public static final int DDO = 274; //# line 17
    public static final int DCOPY = 275; //# line 17
    public static final int COMPLEX = 276; //# line 17
    public static final int SCOPY = 277; //# line 17
    public static final int SUPER = 278; //# line 17
    public static final int IMAGE = 279; //# line 17
    public static final int DEFULT = 280; //# line 17
    public static final int DDD = 281; //# line 17
    public static final int PRINTCOMP = 282; //# line 17
    public static final int PRINT = 283; //# line 18
    public static final int READ_INTEGER = 284; //# line 18
    public static final int READ_LINE = 285; //# line 18
    public static final int LITERAL = 286; //# line 19
    public static final int IDENTIFIER = 287; //# line 20
    public static final int AND = 288; //# line 20
    public static final int OR = 289; //# line 20
    public static final int STATIC = 290; //# line 20
    public static final int INSTANCEOF = 291; //# line 20
    public static final int LESS_EQUAL = 292; //# line 21
    public static final int GREATER_EQUAL = 293; //# line 21
    public static final int EQUAL = 294; //# line 21
    public static final int NOT_EQUAL = 295; //# line 21
    
    public static final int VariableDef = 296;
    public static final int ExprT5 = 297;
    public static final int Oper3 = 298;
    public static final int Oper6 = 299;
    public static final int VariableList = 300;
    public static final int Formals = 301;
    public static final int Oper7 = 302;
    public static final int Expr8 = 303;
    public static final int AfterSimpleTypeExpr = 304;
    public static final int Expr2 = 305;
    public static final int Oper2 = 306;
    public static final int Expr6 = 307;
    public static final int ACaseExprlist = 308;
    public static final int BreakStmt = 309;
    public static final int ExprT2 = 310;
    public static final int StmtList = 311;
    public static final int Constant = 312;
    public static final int SubVariableList = 313;
    public static final int PrintStmt = 314;
    public static final int ForStmt = 315;
    public static final int Expr9 = 316;
    public static final int Expr1 = 317;
    public static final int Oper1 = 318;
    public static final int ElseClause = 319;
    public static final int FieldList = 320;
    public static final int ACaseExpr = 321;
    public static final int SubExprList = 322;
    public static final int AfterParenExpr = 323;
    public static final int ClassDef = 324;
    public static final int ReturnStmt = 325;
    public static final int ExprList = 326;
    public static final int StmtBlock = 327;
    public static final int FunctionField = 328;
    public static final int AfterIdentExpr = 329;
    public static final int Program = 330;
    public static final int Expr = 331;
    public static final int Type = 332;
    public static final int Expr5 = 333;
    public static final int AfterNewExpr = 334;
    public static final int Assignment = 335;
    public static final int ExtendsClause = 336;
    public static final int Oper5 = 337;
    public static final int ArrayType = 338;
    public static final int Expr3 = 339;
    public static final int Actuals = 340;
    public static final int Variable = 341;
    public static final int ExprT3 = 342;
    public static final int Stmt = 343;
    public static final int SimpleStmt = 344;
    public static final int SimpleType = 345;
    public static final int WhileStmt = 346;
    public static final int ExprT1 = 347;
    public static final int Expr4 = 348;
    public static final int ExprT4 = 349;
    public static final int ReturnExpr = 350;
    public static final int IfStmt = 351;
    public static final int ExprT6 = 352;
    public static final int ExprT8 = 353;
    public static final int DefaultExpr = 354;
    public static final int Expr7 = 355;
    public static final int ClassList = 356;
    public static final int Oper4 = 357;
    public static final int Field = 358;
    
    /* start symbol */
    public final int start = Program;
    
    /**
      * Judge if a symbol (within valid range) is non-terminal.
      *
      * @param symbol the symbol to be judged.
      * @return true if and only if the symbol is non-terminal.
      */
        
    public boolean isNonTerminal(int symbol) {
        return symbol >= 296;
    }
    
    private final String[] allSymbols = {
        "VOID", "BOOL", "INT", "STRING", "CLASS",
        "NULL", "EXTENDS", "THIS", "WHILE", "FOR",
        "IF", "ELSE", "RETURN", "BREAK", "NEW",
        "CASE", "OOD", "DDO", "DCOPY", "COMPLEX",
        "SCOPY", "SUPER", "IMAGE", "DEFULT", "DDD",
        "PRINTCOMP", "PRINT", "READ_INTEGER", "READ_LINE", "LITERAL",
        "IDENTIFIER", "AND", "OR", "STATIC", "INSTANCEOF",
        "LESS_EQUAL", "GREATER_EQUAL", "EQUAL", "NOT_EQUAL", "VariableDef",
        "ExprT5", "Oper3", "Oper6", "VariableList", "Formals",
        "Oper7", "Expr8", "AfterSimpleTypeExpr", "Expr2", "Oper2",
        "Expr6", "ACaseExprlist", "BreakStmt", "ExprT2", "StmtList",
        "Constant", "SubVariableList", "PrintStmt", "ForStmt", "Expr9",
        "Expr1", "Oper1", "ElseClause", "FieldList", "ACaseExpr",
        "SubExprList", "AfterParenExpr", "ClassDef", "ReturnStmt", "ExprList",
        "StmtBlock", "FunctionField", "AfterIdentExpr", "Program", "Expr",
        "Type", "Expr5", "AfterNewExpr", "Assignment", "ExtendsClause",
        "Oper5", "ArrayType", "Expr3", "Actuals", "Variable",
        "ExprT3", "Stmt", "SimpleStmt", "SimpleType", "WhileStmt",
        "ExprT1", "Expr4", "ExprT4", "ReturnExpr", "IfStmt",
        "ExprT6", "ExprT8", "DefaultExpr", "Expr7", "ClassList",
        "Oper4", "Field",
    };
    
    /**
      * Debugging function (pretty print).
      * Get string presentation of some token or symbol.
      *
      * @param symbol either terminal or non-terminal.
      * @return its string presentation.
      */
        
    public String name(int symbol) {
        if (symbol == eof) return "<eof>";
        if (symbol == eos) return "<eos>";
        if (symbol > 0 && symbol <= 256) return "'" + (char) symbol + "'";
        return allSymbols[symbol - 257];
    }
    
    /* begin lookahead symbols */
    private ArrayList<Set<Integer>> begin = new ArrayList<Set<Integer>>();
    private final Integer[][] beginRaw = {
        {COMPLEX, VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('+'), Integer.valueOf('-'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {EQUAL, NOT_EQUAL},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%')},
        {COMPLEX, VOID, CLASS, INT, STRING, BOOL},
        {COMPLEX, VOID, CLASS, INT, STRING, BOOL, Integer.valueOf(')')},
        {Integer.valueOf('-'), Integer.valueOf('!'), Integer.valueOf('@'), Integer.valueOf('#'), Integer.valueOf('$')},
        {CASE, READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), READ_INTEGER},
        {Integer.valueOf(']'), CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), READ_INTEGER},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), READ_INTEGER},
        {AND},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), READ_INTEGER},
        {LITERAL, NULL, DEFULT},
        {BREAK},
        {AND, Integer.valueOf(']'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf(';')},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, PRINTCOMP, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{'), Integer.valueOf('}')},
        {LITERAL, NULL},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {PRINT, PRINTCOMP},
        {FOR},
        {LITERAL, NULL, READ_INTEGER, READ_LINE, THIS, NEW, INSTANCEOF, Integer.valueOf('('), IDENTIFIER, CASE},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), READ_INTEGER},
        {OR},
        {ELSE, PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, PRINTCOMP, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {COMPLEX, VOID, CLASS, INT, STRING, STATIC, BOOL, Integer.valueOf('}')},
        {LITERAL, NULL},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), READ_INTEGER, CLASS},
        {CLASS},
        {RETURN},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), READ_INTEGER},
        {Integer.valueOf('{')},
        {Integer.valueOf('('), Integer.valueOf(';')},
        {Integer.valueOf('('), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {CLASS},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), READ_INTEGER},
        {COMPLEX, VOID, CLASS, INT, STRING, BOOL},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), READ_INTEGER},
        {IDENTIFIER, COMPLEX, VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('='), Integer.valueOf(';'), Integer.valueOf(')')},
        {EXTENDS, Integer.valueOf('{')},
        {Integer.valueOf('+'), Integer.valueOf('-')},
        {Integer.valueOf('['), IDENTIFIER},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), READ_INTEGER},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), READ_INTEGER, Integer.valueOf(')')},
        {COMPLEX, VOID, CLASS, INT, STRING, BOOL},
        {EQUAL, NOT_EQUAL, Integer.valueOf(']'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {COMPLEX, VOID, CLASS, INT, STRING, BOOL, CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), READ_INTEGER, IF, WHILE, FOR, RETURN, PRINT, PRINTCOMP, BREAK, Integer.valueOf('{')},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), READ_INTEGER, Integer.valueOf(';'), Integer.valueOf(')')},
        {INT, VOID, COMPLEX, BOOL, STRING, CLASS},
        {WHILE},
        {OR, Integer.valueOf(']'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), READ_INTEGER},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf(']'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), READ_INTEGER, Integer.valueOf(';')},
        {IF},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('['), Integer.valueOf('.'), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {DEFULT},
        {Integer.valueOf('!'), Integer.valueOf('-'), Integer.valueOf('@'), Integer.valueOf('$'), Integer.valueOf('#'), CASE, READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), READ_INTEGER},
        {CLASS, eof, eos},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>')},
        {STATIC, COMPLEX, VOID, CLASS, INT, STRING, BOOL},
    };
    
    /**
      * Get begin lookahead tokens for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its begin lookahead tokens.
      */
        
    public Set<Integer> beginSet(int symbol) {
        return begin.get(symbol - 296);
    }
    
    /* follow set */
    private ArrayList<Set<Integer>> follow = new ArrayList<Set<Integer>>();
    private final Integer[][] followRaw = {
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, PRINTCOMP, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), READ_INTEGER},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), READ_INTEGER},
        {Integer.valueOf(')')},
        {Integer.valueOf(')')},
        {CASE, READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), READ_INTEGER},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(']'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf(';')},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), READ_INTEGER},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {DEFULT},
        {Integer.valueOf(';')},
        {Integer.valueOf(']'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf(';')},
        {Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(')')},
        {Integer.valueOf(';')},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, PRINTCOMP, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(']'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), READ_INTEGER},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, PRINTCOMP, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('}')},
        {LITERAL, NULL, DEFULT},
        {Integer.valueOf(')')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {CLASS, eof, eos},
        {Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, PRINTCOMP, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, STATIC, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {COMPLEX, VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {eof, eos},
        {Integer.valueOf(']'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {IDENTIFIER},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('{')},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), READ_INTEGER},
        {IDENTIFIER},
        {Integer.valueOf(']'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {Integer.valueOf(';'), Integer.valueOf(','), Integer.valueOf(')')},
        {Integer.valueOf(']'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, PRINTCOMP, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('['), IDENTIFIER},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, PRINTCOMP, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {Integer.valueOf(']'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf(']'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf(';')},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, PRINTCOMP, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {eof, eos},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), READ_INTEGER},
        {COMPLEX, VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
    };
    
    /**
      * Get follow set for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its follow set.
      */
        
    public Set<Integer> followSet(int symbol) {
        return follow.get(symbol - 296);
    }
    
    public Table() {
        for (int i = 0; i < 63; i++) {
            begin.add(new HashSet(Arrays.asList(beginRaw[i])));
            follow.add(new HashSet(Arrays.asList(followRaw[i])));
        }
    }
    
    /**
      * Predictive table `M` query function.
      * `query(A, a)` will return the corresponding term `M(A, a)`, i.e., the target production
      * for non-terminal `A` when the lookahead token is `a`.
      *
      * @param nonTerminal   the non-terminal.
      * @param lookahead     the lookahead symbol.
      * @return a pair `<id, right>` where `right` is the right-hand side of the target
      * production `nonTerminal -> right`, and `id` is the corresponding action id. To execute
      * such action, call `act(id, params)`.
      * If the corresponding term is undefined in the table, `null` will be returned.
      */
        
    public Pair<Integer, List<Integer>> query(int nonTerminal, int lookahead) {
        switch (nonTerminal) {
            //# line 49
            case VariableDef: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(0, Arrays.asList(Variable, Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 505
            case ExprT5: {
                switch (lookahead) {
                    case '+':
                    case '-':
                        return new Pair<>(1, Arrays.asList(Oper5, Expr6, ExprT5));
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case AND:
                    case ';':
                    case '<':
                    case '>':
                        return new Pair<>(119, Arrays.asList());
                    default: return null;
                }
            }
            //# line 280
            case Oper3: {
                switch (lookahead) {
                    case EQUAL:
                        return new Pair<>(3, Arrays.asList(EQUAL));
                    case NOT_EQUAL:
                        return new Pair<>(4, Arrays.asList(NOT_EQUAL));
                    default: return null;
                }
            }
            //# line 326
            case Oper6: {
                switch (lookahead) {
                    case '*':
                        return new Pair<>(5, Arrays.asList(Integer.valueOf('*')));
                    case '/':
                        return new Pair<>(6, Arrays.asList(Integer.valueOf('/')));
                    case '%':
                        return new Pair<>(7, Arrays.asList(Integer.valueOf('%')));
                    default: return null;
                }
            }
            //# line 169
            case VariableList: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(8, Arrays.asList(Variable, SubVariableList));
                    default: return null;
                }
            }
            //# line 159
            case Formals: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(9, Arrays.asList(VariableList));
                    case ')':
                        return new Pair<>(10, Arrays.asList());
                    default: return null;
                }
            }
            //# line 343
            case Oper7: {
                switch (lookahead) {
                    case '-':
                        return new Pair<>(11, Arrays.asList(Integer.valueOf('-')));
                    case '!':
                        return new Pair<>(12, Arrays.asList(Integer.valueOf('!')));
                    case '@':
                        return new Pair<>(13, Arrays.asList(Integer.valueOf('@')));
                    case '#':
                        return new Pair<>(14, Arrays.asList(Integer.valueOf('#')));
                    case '$':
                        return new Pair<>(15, Arrays.asList(Integer.valueOf('$')));
                    default: return null;
                }
            }
            //# line 561
            case Expr8: {
                switch (lookahead) {
                    case CASE:
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case READ_INTEGER:
                        return new Pair<>(16, Arrays.asList(Expr9, ExprT8));
                    default: return null;
                }
            }
            //# line 674
            case AfterSimpleTypeExpr: {
                switch (lookahead) {
                    case ']':
                        return new Pair<>(17, Arrays.asList(Integer.valueOf(']'), Integer.valueOf('['), AfterSimpleTypeExpr));
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case READ_INTEGER:
                        return new Pair<>(18, Arrays.asList(Expr, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 406
            case Expr2: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case READ_INTEGER:
                        return new Pair<>(19, Arrays.asList(Expr3, ExprT2));
                    default: return null;
                }
            }
            //# line 273
            case Oper2: {
                switch (lookahead) {
                    case AND:
                        return new Pair<>(20, Arrays.asList(AND));
                    default: return null;
                }
            }
            //# line 522
            case Expr6: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case READ_INTEGER:
                        return new Pair<>(21, Arrays.asList(Expr7, ExprT6));
                    default: return null;
                }
            }
            //# line 712
            case ACaseExprlist: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                        return new Pair<>(22, Arrays.asList(ACaseExpr, ACaseExprlist));
                    case DEFULT:
                        return new Pair<>(23, Arrays.asList());
                    default: return null;
                }
            }
            //# line 783
            case BreakStmt: {
                switch (lookahead) {
                    case BREAK:
                        return new Pair<>(24, Arrays.asList(BREAK));
                    default: return null;
                }
            }
            //# line 418
            case ExprT2: {
                switch (lookahead) {
                    case AND:
                        return new Pair<>(25, Arrays.asList(Oper2, Expr3, ExprT2));
                    case ']':
                    case ')':
                    case ',':
                    case '=':
                    case OR:
                    case ';':
                        return new Pair<>(119, Arrays.asList());
                    default: return null;
                }
            }
            //# line 196
            case StmtList: {
                switch (lookahead) {
                    case PRINT:
                    case CASE:
                    case COMPLEX:
                    case VOID:
                    case FOR:
                    case '!':
                    case '-':
                    case CLASS:
                    case PRINTCOMP:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case IF:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '#':
                    case BOOL:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                        return new Pair<>(27, Arrays.asList(Stmt, StmtList));
                    case '}':
                        return new Pair<>(119, Arrays.asList());
                    default: return null;
                }
            }
            //# line 726
            case Constant: {
                switch (lookahead) {
                    case LITERAL:
                        return new Pair<>(29, Arrays.asList(LITERAL));
                    case NULL:
                        return new Pair<>(30, Arrays.asList(NULL));
                    default: return null;
                }
            }
            //# line 179
            case SubVariableList: {
                switch (lookahead) {
                    case ',':
                        return new Pair<>(31, Arrays.asList(Integer.valueOf(','), Variable, SubVariableList));
                    case ')':
                        return new Pair<>(119, Arrays.asList());
                    default: return null;
                }
            }
            //# line 815
            case PrintStmt: {
                switch (lookahead) {
                    case PRINT:
                        return new Pair<>(33, Arrays.asList(PRINT, Integer.valueOf('('), ExprList, Integer.valueOf(')')));
                    case PRINTCOMP:
                        return new Pair<>(34, Arrays.asList(PRINTCOMP, Integer.valueOf('('), ExprList, Integer.valueOf(')')));
                    default: return null;
                }
            }
            //# line 777
            case ForStmt: {
                switch (lookahead) {
                    case FOR:
                        return new Pair<>(35, Arrays.asList(FOR, Integer.valueOf('('), SimpleStmt, Integer.valueOf(';'), Expr, Integer.valueOf(';'), SimpleStmt, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 613
            case Expr9: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                        return new Pair<>(36, Arrays.asList(Constant));
                    case READ_INTEGER:
                        return new Pair<>(37, Arrays.asList(READ_INTEGER, Integer.valueOf('('), Integer.valueOf(')')));
                    case READ_LINE:
                        return new Pair<>(38, Arrays.asList(READ_LINE, Integer.valueOf('('), Integer.valueOf(')')));
                    case THIS:
                        return new Pair<>(39, Arrays.asList(THIS));
                    case NEW:
                        return new Pair<>(40, Arrays.asList(NEW, AfterNewExpr));
                    case INSTANCEOF:
                        return new Pair<>(41, Arrays.asList(INSTANCEOF, Integer.valueOf('('), Expr, Integer.valueOf(','), IDENTIFIER, Integer.valueOf(')')));
                    case '(':
                        return new Pair<>(42, Arrays.asList(Integer.valueOf('('), AfterParenExpr));
                    case IDENTIFIER:
                        return new Pair<>(43, Arrays.asList(IDENTIFIER, AfterIdentExpr));
                    case CASE:
                        return new Pair<>(44, Arrays.asList(CASE, Integer.valueOf('('), Expr, Integer.valueOf(')'), Integer.valueOf('{'), ACaseExprlist, DefaultExpr, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 377
            case Expr1: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case READ_INTEGER:
                        return new Pair<>(45, Arrays.asList(Expr2, ExprT1));
                    default: return null;
                }
            }
            //# line 266
            case Oper1: {
                switch (lookahead) {
                    case OR:
                        return new Pair<>(46, Arrays.asList(OR));
                    default: return null;
                }
            }
            //# line 795
            case ElseClause: {
                switch (lookahead) {
                    case ELSE:
                        return new Pair<>(47, Arrays.asList(ELSE, Stmt));
                    case PRINT:
                    case CASE:
                    case COMPLEX:
                    case VOID:
                    case FOR:
                    case '!':
                    case '-':
                    case CLASS:
                    case PRINTCOMP:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case '}':
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case IF:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '#':
                    case BOOL:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                        return new Pair<>(119, Arrays.asList());
                    default: return null;
                }
            }
            //# line 119
            case FieldList: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case STATIC:
                    case BOOL:
                        return new Pair<>(49, Arrays.asList(Field, FieldList));
                    case '}':
                        return new Pair<>(50, Arrays.asList());
                    default: return null;
                }
            }
            //# line 706
            case ACaseExpr: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                        return new Pair<>(51, Arrays.asList(Constant, Integer.valueOf(':'), Expr, Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 755
            case SubExprList: {
                switch (lookahead) {
                    case ',':
                        return new Pair<>(52, Arrays.asList(Integer.valueOf(','), Expr, SubExprList));
                    case ')':
                        return new Pair<>(53, Arrays.asList());
                    default: return null;
                }
            }
            //# line 686
            case AfterParenExpr: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case READ_INTEGER:
                        return new Pair<>(54, Arrays.asList(Expr, Integer.valueOf(')')));
                    case CLASS:
                        return new Pair<>(55, Arrays.asList(CLASS, IDENTIFIER, Integer.valueOf(')'), Expr9));
                    default: return null;
                }
            }
            //# line 106
            case ClassDef: {
                switch (lookahead) {
                    case CLASS:
                        return new Pair<>(56, Arrays.asList(CLASS, IDENTIFIER, ExtendsClause, Integer.valueOf('{'), FieldList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 802
            case ReturnStmt: {
                switch (lookahead) {
                    case RETURN:
                        return new Pair<>(57, Arrays.asList(RETURN, ReturnExpr));
                    default: return null;
                }
            }
            //# line 747
            case ExprList: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case READ_INTEGER:
                        return new Pair<>(58, Arrays.asList(Expr, SubExprList));
                    default: return null;
                }
            }
            //# line 190
            case StmtBlock: {
                switch (lookahead) {
                    case '{':
                        return new Pair<>(59, Arrays.asList(Integer.valueOf('{'), StmtList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 151
            case FunctionField: {
                switch (lookahead) {
                    case '(':
                        return new Pair<>(60, Arrays.asList(Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case ';':
                        return new Pair<>(119, Arrays.asList(Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 606
            case AfterIdentExpr: {
                switch (lookahead) {
                    case '(':
                        return new Pair<>(62, Arrays.asList(Integer.valueOf('('), Actuals, Integer.valueOf(')')));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case '.':
                    case '-':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case '+':
                    case AND:
                    case '*':
                    case ';':
                    case '<':
                    case '[':
                    case '>':
                    case '%':
                        return new Pair<>(119, Arrays.asList());
                    default: return null;
                }
            }
            //# line 27
            case Program: {
                switch (lookahead) {
                    case CLASS:
                        return new Pair<>(64, Arrays.asList(ClassDef, ClassList));
                    default: return null;
                }
            }
            //# line 371
            case Expr: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case READ_INTEGER:
                        return new Pair<>(65, Arrays.asList(Expr1));
                    default: return null;
                }
            }
            //# line 87
            case Type: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(66, Arrays.asList(SimpleType, ArrayType));
                    default: return null;
                }
            }
            //# line 493
            case Expr5: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case READ_INTEGER:
                        return new Pair<>(67, Arrays.asList(Expr6, ExprT5));
                    default: return null;
                }
            }
            //# line 660
            case AfterNewExpr: {
                switch (lookahead) {
                    case IDENTIFIER:
                        return new Pair<>(68, Arrays.asList(IDENTIFIER, Integer.valueOf('('), Integer.valueOf(')')));
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(69, Arrays.asList(SimpleType, Integer.valueOf('['), AfterSimpleTypeExpr));
                    default: return null;
                }
            }
            //# line 257
            case Assignment: {
                switch (lookahead) {
                    case '=':
                        return new Pair<>(70, Arrays.asList(Integer.valueOf('='), Expr));
                    case ';':
                    case ')':
                        return new Pair<>(119, Arrays.asList());
                    default: return null;
                }
            }
            //# line 112
            case ExtendsClause: {
                switch (lookahead) {
                    case EXTENDS:
                        return new Pair<>(72, Arrays.asList(EXTENDS, IDENTIFIER));
                    case '{':
                        return new Pair<>(119, Arrays.asList());
                    default: return null;
                }
            }
            //# line 314
            case Oper5: {
                switch (lookahead) {
                    case '+':
                        return new Pair<>(74, Arrays.asList(Integer.valueOf('+')));
                    case '-':
                        return new Pair<>(75, Arrays.asList(Integer.valueOf('-')));
                    default: return null;
                }
            }
            //# line 96
            case ArrayType: {
                switch (lookahead) {
                    case '[':
                        return new Pair<>(76, Arrays.asList(Integer.valueOf('['), Integer.valueOf(']'), ArrayType));
                    case IDENTIFIER:
                        return new Pair<>(77, Arrays.asList());
                    default: return null;
                }
            }
            //# line 435
            case Expr3: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case READ_INTEGER:
                        return new Pair<>(78, Arrays.asList(Expr4, ExprT3));
                    default: return null;
                }
            }
            //# line 736
            case Actuals: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case READ_INTEGER:
                        return new Pair<>(79, Arrays.asList(ExprList));
                    case ')':
                        return new Pair<>(80, Arrays.asList());
                    default: return null;
                }
            }
            //# line 55
            case Variable: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(81, Arrays.asList(Type, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 447
            case ExprT3: {
                switch (lookahead) {
                    case EQUAL:
                    case NOT_EQUAL:
                        return new Pair<>(82, Arrays.asList(Oper3, Expr4, ExprT3));
                    case ']':
                    case ')':
                    case ',':
                    case '=':
                    case OR:
                    case AND:
                    case ';':
                        return new Pair<>(119, Arrays.asList());
                    default: return null;
                }
            }
            //# line 204
            case Stmt: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(84, Arrays.asList(VariableDef));
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '#':
                    case READ_INTEGER:
                        return new Pair<>(85, Arrays.asList(SimpleStmt, Integer.valueOf(';')));
                    case IF:
                        return new Pair<>(86, Arrays.asList(IfStmt));
                    case WHILE:
                        return new Pair<>(87, Arrays.asList(WhileStmt));
                    case FOR:
                        return new Pair<>(88, Arrays.asList(ForStmt));
                    case RETURN:
                        return new Pair<>(89, Arrays.asList(ReturnStmt, Integer.valueOf(';')));
                    case PRINT:
                    case PRINTCOMP:
                        return new Pair<>(90, Arrays.asList(PrintStmt, Integer.valueOf(';')));
                    case BREAK:
                        return new Pair<>(91, Arrays.asList(BreakStmt, Integer.valueOf(';')));
                    case '{':
                        return new Pair<>(92, Arrays.asList(StmtBlock));
                    default: return null;
                }
            }
            //# line 246
            case SimpleStmt: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case READ_INTEGER:
                        return new Pair<>(93, Arrays.asList(Expr, Assignment));
                    case ';':
                    case ')':
                        return new Pair<>(119, Arrays.asList());
                    default: return null;
                }
            }
            //# line 61
            case SimpleType: {
                switch (lookahead) {
                    case INT:
                        return new Pair<>(95, Arrays.asList(INT));
                    case VOID:
                        return new Pair<>(96, Arrays.asList(VOID));
                    case COMPLEX:
                        return new Pair<>(97, Arrays.asList(COMPLEX));
                    case BOOL:
                        return new Pair<>(98, Arrays.asList(BOOL));
                    case STRING:
                        return new Pair<>(99, Arrays.asList(STRING));
                    case CLASS:
                        return new Pair<>(100, Arrays.asList(CLASS, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 771
            case WhileStmt: {
                switch (lookahead) {
                    case WHILE:
                        return new Pair<>(101, Arrays.asList(WHILE, Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 389
            case ExprT1: {
                switch (lookahead) {
                    case OR:
                        return new Pair<>(102, Arrays.asList(Oper1, Expr2, ExprT1));
                    case ']':
                    case ')':
                    case ',':
                    case '=':
                    case ';':
                        return new Pair<>(119, Arrays.asList());
                    default: return null;
                }
            }
            //# line 464
            case Expr4: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case READ_INTEGER:
                        return new Pair<>(104, Arrays.asList(Expr5, ExprT4));
                    default: return null;
                }
            }
            //# line 476
            case ExprT4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                    case GREATER_EQUAL:
                    case '<':
                    case '>':
                        return new Pair<>(105, Arrays.asList(Oper4, Expr5, ExprT4));
                    case ']':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case AND:
                    case ';':
                        return new Pair<>(119, Arrays.asList());
                    default: return null;
                }
            }
            //# line 808
            case ReturnExpr: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case READ_INTEGER:
                        return new Pair<>(107, Arrays.asList(Expr));
                    case ';':
                        return new Pair<>(119, Arrays.asList());
                    default: return null;
                }
            }
            //# line 789
            case IfStmt: {
                switch (lookahead) {
                    case IF:
                        return new Pair<>(109, Arrays.asList(IF, Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt, ElseClause));
                    default: return null;
                }
            }
            //# line 534
            case ExprT6: {
                switch (lookahead) {
                    case '*':
                    case '/':
                    case '%':
                        return new Pair<>(110, Arrays.asList(Oper6, Expr7, ExprT6));
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case '-':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case '+':
                    case AND:
                    case ';':
                    case '<':
                    case '>':
                        return new Pair<>(119, Arrays.asList());
                    default: return null;
                }
            }
            //# line 581
            case ExprT8: {
                switch (lookahead) {
                    case '[':
                        return new Pair<>(112, Arrays.asList(Integer.valueOf('['), Expr, Integer.valueOf(']'), ExprT8));
                    case '.':
                        return new Pair<>(113, Arrays.asList(Integer.valueOf('.'), IDENTIFIER, AfterIdentExpr, ExprT8));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case '-':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case '+':
                    case AND:
                    case '*':
                    case ';':
                    case '<':
                    case '>':
                    case '%':
                        return new Pair<>(119, Arrays.asList());
                    default: return null;
                }
            }
            //# line 697
            case DefaultExpr: {
                switch (lookahead) {
                    case DEFULT:
                        return new Pair<>(115, Arrays.asList(DEFULT, Integer.valueOf(':'), Expr, Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 551
            case Expr7: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case '@':
                    case '$':
                    case '#':
                        return new Pair<>(116, Arrays.asList(Oper7, Expr8));
                    case CASE:
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case READ_INTEGER:
                        return new Pair<>(117, Arrays.asList(Expr8));
                    default: return null;
                }
            }
            //# line 38
            case ClassList: {
                switch (lookahead) {
                    case CLASS:
                        return new Pair<>(118, Arrays.asList(ClassDef, ClassList));
                    case eof:
                    case eos:
                        return new Pair<>(119, Arrays.asList());
                    default: return null;
                }
            }
            //# line 292
            case Oper4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                        return new Pair<>(120, Arrays.asList(LESS_EQUAL));
                    case GREATER_EQUAL:
                        return new Pair<>(121, Arrays.asList(GREATER_EQUAL));
                    case '<':
                        return new Pair<>(122, Arrays.asList(Integer.valueOf('<')));
                    case '>':
                        return new Pair<>(123, Arrays.asList(Integer.valueOf('>')));
                    default: return null;
                }
            }
            //# line 135
            case Field: {
                switch (lookahead) {
                    case STATIC:
                        return new Pair<>(124, Arrays.asList(STATIC, Type, IDENTIFIER, Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(125, Arrays.asList(Type, IDENTIFIER, FunctionField));
                    default: return null;
                }
            }
            default: return null;
        }
    }
    
    /**
      * Execute some user-defined semantic action on the specification file.
      * Note that `$$ = params[0], $1 = params[1], ...`. Nothing will be returned, so please
      * do not forget to store the parsed AST result in `params[0]`.
      *
      * @param id      the action id.
      * @param params  parameter array.
      */
        
    public void act(int id, SemValue[] params) {
        switch (id) {
            case 0: {
                //# line 50
                params[0].vdef = params[1].vdef;
                return;
            }
            case 1: {
                //# line 506
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 2: {
                /* no action */
                return;
            }
            case 3: {
                //# line 281
                params[0].counter = Tree.EQ;
                params[0].loc = params[1].loc;
                return;
            }
            case 4: {
                //# line 286
                params[0].counter = Tree.NE;
                params[0].loc = params[1].loc;
                return;
            }
            case 5: {
                //# line 327
                params[0].counter = Tree.MUL;
                params[0].loc = params[1].loc;
                return;
            }
            case 6: {
                //# line 332
                params[0].counter = Tree.DIV;
                params[0].loc = params[1].loc;
                return;
            }
            case 7: {
                //# line 337
                params[0].counter = Tree.MOD;
                params[0].loc = params[1].loc;
                return;
            }
            case 8: {
                //# line 170
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[1].vdef);
                if (params[2].vlist != null) {
                    params[0].vlist.addAll(params[2].vlist);
                }
                return;
            }
            case 9: {
                //# line 160
                params[0].vlist = params[1].vlist;
                return;
            }
            case 10: {
                //# line 164
                params[0].vlist = new ArrayList<VarDef>();
                return;
            }
            case 11: {
                //# line 344
                params[0].counter = Tree.NEG;
                params[0].loc = params[1].loc;
                return;
            }
            case 12: {
                //# line 349
                params[0].counter = Tree.NOT;
                params[0].loc = params[1].loc;
                return;
            }
            case 13: {
                //# line 354
                params[0].counter = Tree.RE;
                     params[0].loc = params[1].loc;
                return;
            }
            case 14: {
                //# line 359
                params[0].counter = Tree.TR;
                     params[0].loc = params[1].loc;
                return;
            }
            case 15: {
                //# line 364
                params[0].counter = Tree.IM;
                     params[0].loc = params[1].loc;
                return;
            }
            case 16: {
                //# line 562
                params[0].expr = params[1].expr;
                params[0].loc = params[1].loc;
                if (params[2].vec != null) {
                    for (SemValue v : params[2].vec) {
                        if (v.expr != null) {
                            params[0].expr = new Tree.Indexed(params[0].expr, v.expr, params[0].loc);
                        } else if (v.elist != null) {
                            params[0].expr = new Tree.CallExpr(params[0].expr, v.ident, v.elist, v.loc);
                            params[0].loc = v.loc;
                        } else {
                            params[0].expr = new Tree.Ident(params[0].expr, v.ident, v.loc);
                            params[0].loc = v.loc;
                        }
                    }
                }
                return;
            }
            case 17: {
                //# line 675
                params[0].expr = params[3].expr;
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 18: {
                //# line 680
                params[0].expr = params[1].expr;
                params[0].counter = 0;
                return;
            }
            case 19: {
                //# line 407
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 20: {
                //# line 274
                params[0].counter = Tree.AND;
                params[0].loc = params[1].loc;
                return;
            }
            case 21: {
                //# line 523
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 22: {
                //# line 713
                System.out.println("fucku");
                params[0].celist.add(params[2].cexpr);
                return;
            }
            case 23: {
                //# line 718
                params[0] = new SemValue();
                params[0].celist = new ArrayList<CaseExpr>();
                return;
            }
            case 24: {
                //# line 784
                params[0].stmt = new Tree.Break(params[1].loc);
                return;
            }
            case 25: {
                //# line 419
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 26: {
                /* no action */
                return;
            }
            case 27: {
                //# line 197
                params[0].slist.add(params[1].stmt);
                params[0].slist.addAll(params[2].slist);
                return;
            }
            case 28: {
                /* no action */
                return;
            }
            case 29: {
                //# line 727
                params[0].expr = new Tree.Literal(params[1].typeTag, params[1].literal, params[1].loc);
                return;
            }
            case 30: {
                //# line 731
                params[0].expr = new Null(params[1].loc);
                return;
            }
            case 31: {
                //# line 180
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[2].vdef);
                if (params[3].vlist != null) {
                    params[0].vlist.addAll(params[3].vlist);
                }
                return;
            }
            case 32: {
                /* no action */
                return;
            }
            case 33: {
                //# line 816
                params[0].stmt = new Tree.Print(params[3].elist, params[1].loc);
                return;
            }
            case 34: {
                //# line 820
                params[0].stmt = new Tree.PrintComp(params[3].elist, params[1].loc);
                return;
            }
            case 35: {
                //# line 778
                params[0].stmt = new Tree.ForLoop(params[3].stmt, params[5].expr, params[7].stmt, params[9].stmt, params[1].loc);
                return;
            }
            case 36: {
                //# line 614
                params[0].expr = params[1].expr;
                return;
            }
            case 37: {
                //# line 618
                params[0].expr = new Tree.ReadIntExpr(params[1].loc);
                return;
            }
            case 38: {
                //# line 622
                params[0].expr = new Tree.ReadLineExpr(params[1].loc);
                return;
            }
            case 39: {
                //# line 626
                params[0].expr = new Tree.ThisExpr(params[1].loc);
                return;
            }
            case 40: {
                //# line 630
                if (params[2].ident != null) {
                    params[0].expr = new Tree.NewClass(params[2].ident, params[1].loc);
                } else {
                    params[0].expr = new Tree.NewArray(params[2].type, params[2].expr, params[1].loc);
                }
                return;
            }
            case 41: {
                //# line 638
                params[0].expr = new Tree.TypeTest(params[3].expr, params[5].ident, params[1].loc);
                return;
            }
            case 42: {
                //# line 642
                params[0].expr = params[2].expr;
                return;
            }
            case 43: {
                //# line 646
                if (params[2].elist != null) {
                    params[0].expr = new Tree.CallExpr(null, params[1].ident, params[2].elist, params[1].loc);
                } else {
                    params[0].expr = new Tree.Ident(null, params[1].ident, params[1].loc);
                }
                return;
            }
            case 44: {
                //# line 654
                params[0].expr = new Tree.Case(params[3].expr,  null ,params[7].dfexpr ,params[1].loc);
                return;
            }
            case 45: {
                //# line 378
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 46: {
                //# line 267
                params[0].counter = Tree.OR;
                params[0].loc = params[1].loc;
                return;
            }
            case 47: {
                //# line 796
                params[0].stmt = params[2].stmt;
                return;
            }
            case 48: {
                /* no action */
                return;
            }
            case 49: {
                //# line 120
                params[0].flist = new ArrayList<Tree>();
                if (params[1].vdef != null) {
                    params[0].flist.add(params[1].vdef);
                } else {
                    params[0].flist.add(params[1].fdef);
                }
                params[0].flist.addAll(params[2].flist);
                return;
            }
            case 50: {
                //# line 130
                params[0].flist = new ArrayList<Tree>();
                return;
            }
            case 51: {
                //# line 707
                params[0].cexpr = new Tree.CaseExpr(params[1].expr,params[3].expr,params[1].loc);
                return;
            }
            case 52: {
                //# line 756
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[2].expr);
                params[0].elist.addAll(params[3].elist);
                return;
            }
            case 53: {
                //# line 762
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 54: {
                //# line 687
                params[0].expr = params[1].expr;
                return;
            }
            case 55: {
                //# line 691
                params[0].expr = new Tree.TypeCast(params[2].ident, params[4].expr, params[4].loc);
                return;
            }
            case 56: {
                //# line 107
                params[0].cdef = new Tree.ClassDef(params[2].ident, params[3].ident, params[5].flist, params[1].loc);
                return;
            }
            case 57: {
                //# line 803
                params[0].stmt = new Tree.Return(params[2].expr, params[1].loc);
                return;
            }
            case 58: {
                //# line 748
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[1].expr);
                params[0].elist.addAll(params[2].elist);
                return;
            }
            case 59: {
                //# line 191
                params[0].stmt = new Tree.Block(params[2].slist, params[1].loc);
                return;
            }
            case 60: {
                //# line 152
                params[0].vlist = params[2].vlist;
                params[0].stmt = params[4].stmt;
                return;
            }
            case 61: {
                /* no action */
                return;
            }
            case 62: {
                //# line 607
                params[0].elist = params[2].elist;
                return;
            }
            case 63: {
                /* no action */
                return;
            }
            case 64: {
                //# line 28
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                params[0].prog = new Tree.TopLevel(params[0].clist, params[0].loc);
                return;
            }
            case 65: {
                //# line 372
                params[0].expr = params[1].expr;
                return;
            }
            case 66: {
                //# line 88
                params[0].type = params[1].type;
                for (int i = 0; i < params[2].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                return;
            }
            case 67: {
                //# line 494
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 68: {
                //# line 661
                params[0].ident = params[1].ident;
                return;
            }
            case 69: {
                //# line 665
                params[0].type = params[1].type;
                for (int i = 0; i < params[3].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                params[0].expr = params[3].expr;
                return;
            }
            case 70: {
                //# line 258
                params[0].loc = params[1].loc;
                params[0].expr = params[2].expr;
                return;
            }
            case 71: {
                /* no action */
                return;
            }
            case 72: {
                //# line 113
                params[0].ident = params[2].ident;
                return;
            }
            case 73: {
                /* no action */
                return;
            }
            case 74: {
                //# line 315
                params[0].counter = Tree.PLUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 75: {
                //# line 320
                params[0].counter = Tree.MINUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 76: {
                //# line 97
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 77: {
                //# line 101
                params[0].counter = 0;
                return;
            }
            case 78: {
                //# line 436
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 79: {
                //# line 737
                params[0].elist = params[1].elist;
                return;
            }
            case 80: {
                //# line 741
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 81: {
                //# line 56
                params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                return;
            }
            case 82: {
                //# line 448
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 83: {
                /* no action */
                return;
            }
            case 84: {
                //# line 205
                params[0].stmt = params[1].vdef;
                return;
            }
            case 85: {
                //# line 209
                if (params[1].stmt == null) {
                    params[0].stmt = new Tree.Skip(params[2].loc);
                } else {
                    params[0].stmt = params[1].stmt;
                }
                return;
            }
            case 86: {
                //# line 217
                params[0].stmt = params[1].stmt;
                return;
            }
            case 87: {
                //# line 221
                params[0].stmt = params[1].stmt;
                return;
            }
            case 88: {
                //# line 225
                params[0].stmt = params[1].stmt;
                return;
            }
            case 89: {
                //# line 229
                params[0].stmt = params[1].stmt;
                return;
            }
            case 90: {
                //# line 233
                params[0].stmt = params[1].stmt;
                return;
            }
            case 91: {
                //# line 237
                params[0].stmt = params[1].stmt;
                return;
            }
            case 92: {
                //# line 241
                params[0].stmt = params[1].stmt;
                return;
            }
            case 93: {
                //# line 247
                if (params[2].expr == null) {
                    params[0].stmt = new Tree.Calculate(params[1].expr, params[1].loc);
                } else {
                    params[0].stmt = new Tree.Assign(params[1].expr, params[2].expr, params[2].loc);
                }
                return;
            }
            case 94: {
                /* no action */
                return;
            }
            case 95: {
                //# line 62
                params[0].type = new Tree.TypeIdent(Tree.INT, params[1].loc);
                return;
            }
            case 96: {
                //# line 66
                params[0].type = new Tree.TypeIdent(Tree.VOID, params[1].loc);
                return;
            }
            case 97: {
                //# line 70
                params[0].type = new Tree.TypeIdent(Tree.COMPLEX, params[1].loc);
                return;
            }
            case 98: {
                //# line 74
                params[0].type = new Tree.TypeIdent(Tree.BOOL, params[1].loc);
                return;
            }
            case 99: {
                //# line 78
                params[0].type = new Tree.TypeIdent(Tree.STRING, params[1].loc);
                return;
            }
            case 100: {
                //# line 82
                params[0].type = new Tree.TypeClass(params[2].ident, params[1].loc);
                return;
            }
            case 101: {
                //# line 772
                params[0].stmt = new Tree.WhileLoop(params[3].expr, params[5].stmt, params[1].loc);
                return;
            }
            case 102: {
                //# line 390
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 103: {
                /* no action */
                return;
            }
            case 104: {
                //# line 465
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 105: {
                //# line 477
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 106: {
                /* no action */
                return;
            }
            case 107: {
                //# line 809
                params[0].expr = params[1].expr;
                return;
            }
            case 108: {
                /* no action */
                return;
            }
            case 109: {
                //# line 790
                params[0].stmt = new Tree.If(params[3].expr, params[5].stmt, params[6].stmt, params[1].loc);
                return;
            }
            case 110: {
                //# line 535
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 111: {
                /* no action */
                return;
            }
            case 112: {
                //# line 582
                SemValue sem = new SemValue();
                sem.expr = params[2].expr;
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[4].vec != null) {
                    params[0].vec.addAll(params[4].vec);
                }
                return;
            }
            case 113: {
                //# line 592
                SemValue sem = new SemValue();
                sem.ident = params[2].ident;
                sem.loc = params[2].loc;
                sem.elist = params[3].elist;
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[4].vec != null) {
                    params[0].vec.addAll(params[4].vec);
                }
                return;
            }
            case 114: {
                /* no action */
                return;
            }
            case 115: {
                //# line 698
                System.out.println("fuck");
                params[0].dfexpr = new Tree.DfExpr(params[3].expr,params[1].loc);
                return;
            }
            case 116: {
                //# line 552
                params[0].expr = new Tree.Unary(params[1].counter, params[2].expr, params[1].loc);
                return;
            }
            case 117: {
                //# line 556
                params[0].expr = params[1].expr;
                return;
            }
            case 118: {
                //# line 39
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                return;
            }
            case 119: {
                /* no action */
                return;
            }
            case 120: {
                //# line 293
                params[0].counter = Tree.LE;
                params[0].loc = params[1].loc;
                return;
            }
            case 121: {
                //# line 298
                params[0].counter = Tree.GE;
                params[0].loc = params[1].loc;
                return;
            }
            case 122: {
                //# line 303
                params[0].counter = Tree.LT;
                params[0].loc = params[1].loc;
                return;
            }
            case 123: {
                //# line 308
                params[0].counter = Tree.GT;
                params[0].loc = params[1].loc;
                return;
            }
            case 124: {
                //# line 136
                params[0].fdef = new Tree.MethodDef(true, params[3].ident, params[2].type, params[5].vlist,
                    (Block) params[7].stmt, params[3].loc);
                return;
            }
            case 125: {
                //# line 141
                if (params[3].vlist != null) {
                    params[0].fdef = new Tree.MethodDef(false, params[2].ident, params[1].type, params[3].vlist,
                        (Block) params[3].stmt, params[2].loc);
                } else {
                    params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                }
                return;
            }
        }
    }
}
/* end of file */
