/* This is auto-generated source by LL1-Parser-Gen.
 * Specification file: /Users/liminyan/Desktop/work/PA_1B/src/decaf/frontend/Parser.spec
 * Options: unstrict mode
 * Generated at: Mon Nov 06 18:38:05 CST 2017
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
    public static final int VOID = 257; //# line 17
    public static final int BOOL = 258; //# line 17
    public static final int INT = 259; //# line 17
    public static final int STRING = 260; //# line 17
    public static final int CLASS = 261; //# line 17
    public static final int NULL = 262; //# line 18
    public static final int EXTENDS = 263; //# line 18
    public static final int THIS = 264; //# line 18
    public static final int WHILE = 265; //# line 18
    public static final int FOR = 266; //# line 18
    public static final int IF = 267; //# line 19
    public static final int ELSE = 268; //# line 19
    public static final int RETURN = 269; //# line 19
    public static final int BREAK = 270; //# line 19
    public static final int NEW = 271; //# line 19
    public static final int CASE = 272; //# line 20
    public static final int OOD = 273; //# line 20
    public static final int DDO = 274; //# line 20
    public static final int DCOPY = 275; //# line 20
    public static final int COMPLEX = 276; //# line 20
    public static final int SCOPY = 277; //# line 21
    public static final int SUPER = 278; //# line 21
    public static final int IMAGE = 279; //# line 21
    public static final int DEFULT = 280; //# line 21
    public static final int PRINTCOMP = 281; //# line 22
    public static final int PRINT = 282; //# line 22
    public static final int READ_INTEGER = 283; //# line 22
    public static final int READ_LINE = 284; //# line 22
    public static final int LITERAL = 285; //# line 24
    public static final int IDENTIFIER = 286; //# line 25
    public static final int AND = 287; //# line 25
    public static final int OR = 288; //# line 25
    public static final int STATIC = 289; //# line 25
    public static final int INSTANCEOF = 290; //# line 25
    public static final int LESS_EQUAL = 291; //# line 26
    public static final int GREATER_EQUAL = 292; //# line 26
    public static final int EQUAL = 293; //# line 26
    public static final int NOT_EQUAL = 294; //# line 26
    public static final int DDD = 295; //# line 29
    
    public static final int VariableDef = 296;
    public static final int DoSubStmt = 297;
    public static final int ExprT5 = 298;
    public static final int Oper3 = 299;
    public static final int Oper6 = 300;
    public static final int VariableList = 301;
    public static final int Formals = 302;
    public static final int Oper7 = 303;
    public static final int Expr8 = 304;
    public static final int AfterSimpleTypeExpr = 305;
    public static final int Expr2 = 306;
    public static final int Oper2 = 307;
    public static final int Expr6 = 308;
    public static final int ACaseExprlist = 309;
    public static final int BreakStmt = 310;
    public static final int ExprT2 = 311;
    public static final int StmtList = 312;
    public static final int Constant = 313;
    public static final int SubVariableList = 314;
    public static final int PrintStmt = 315;
    public static final int ForStmt = 316;
    public static final int DoBranch = 317;
    public static final int Expr9 = 318;
    public static final int Expr1 = 319;
    public static final int DoBranchlist = 320;
    public static final int Oper1 = 321;
    public static final int ElseClause = 322;
    public static final int FieldList = 323;
    public static final int ACaseExpr = 324;
    public static final int SubExprList = 325;
    public static final int AfterParenExpr = 326;
    public static final int ClassDef = 327;
    public static final int ReturnStmt = 328;
    public static final int ExprList = 329;
    public static final int StmtBlock = 330;
    public static final int FunctionField = 331;
    public static final int AfterIdentExpr = 332;
    public static final int DoStmt = 333;
    public static final int Program = 334;
    public static final int Expr = 335;
    public static final int Type = 336;
    public static final int Expr5 = 337;
    public static final int AfterNewExpr = 338;
    public static final int Assignment = 339;
    public static final int ExtendsClause = 340;
    public static final int Oper5 = 341;
    public static final int ArrayType = 342;
    public static final int Expr3 = 343;
    public static final int Actuals = 344;
    public static final int Variable = 345;
    public static final int ExprT3 = 346;
    public static final int Stmt = 347;
    public static final int SimpleStmt = 348;
    public static final int SimpleType = 349;
    public static final int WhileStmt = 350;
    public static final int ExprT1 = 351;
    public static final int Expr4 = 352;
    public static final int ExprT4 = 353;
    public static final int ReturnExpr = 354;
    public static final int IfStmt = 355;
    public static final int ExprT6 = 356;
    public static final int ExprT8 = 357;
    public static final int DefaultExpr = 358;
    public static final int Expr7 = 359;
    public static final int ClassList = 360;
    public static final int Oper4 = 361;
    public static final int Field = 362;
    
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
        "SCOPY", "SUPER", "IMAGE", "DEFULT", "PRINTCOMP",
        "PRINT", "READ_INTEGER", "READ_LINE", "LITERAL", "IDENTIFIER",
        "AND", "OR", "STATIC", "INSTANCEOF", "LESS_EQUAL",
        "GREATER_EQUAL", "EQUAL", "NOT_EQUAL", "DDD", "VariableDef",
        "DoSubStmt", "ExprT5", "Oper3", "Oper6", "VariableList",
        "Formals", "Oper7", "Expr8", "AfterSimpleTypeExpr", "Expr2",
        "Oper2", "Expr6", "ACaseExprlist", "BreakStmt", "ExprT2",
        "StmtList", "Constant", "SubVariableList", "PrintStmt", "ForStmt",
        "DoBranch", "Expr9", "Expr1", "DoBranchlist", "Oper1",
        "ElseClause", "FieldList", "ACaseExpr", "SubExprList", "AfterParenExpr",
        "ClassDef", "ReturnStmt", "ExprList", "StmtBlock", "FunctionField",
        "AfterIdentExpr", "DoStmt", "Program", "Expr", "Type",
        "Expr5", "AfterNewExpr", "Assignment", "ExtendsClause", "Oper5",
        "ArrayType", "Expr3", "Actuals", "Variable", "ExprT3",
        "Stmt", "SimpleStmt", "SimpleType", "WhileStmt", "ExprT1",
        "Expr4", "ExprT4", "ReturnExpr", "IfStmt", "ExprT6",
        "ExprT8", "DefaultExpr", "Expr7", "ClassList", "Oper4",
        "Field",
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
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {Integer.valueOf('+'), Integer.valueOf('-'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {EQUAL, NOT_EQUAL},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%')},
        {COMPLEX, VOID, CLASS, INT, STRING, BOOL},
        {COMPLEX, VOID, CLASS, INT, STRING, BOOL, Integer.valueOf(')')},
        {Integer.valueOf('-'), Integer.valueOf('!'), Integer.valueOf('@'), Integer.valueOf('#'), Integer.valueOf('$')},
        {CASE, READ_LINE, NULL, SCOPY, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), DCOPY, SUPER, READ_INTEGER},
        {Integer.valueOf(']'), CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {AND},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {LITERAL, NULL, DEFULT},
        {BREAK},
        {AND, Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf(';')},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, PRINTCOMP, DDO, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), DCOPY, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{'), Integer.valueOf('}')},
        {LITERAL, NULL},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {PRINT, PRINTCOMP},
        {FOR},
        {DDD},
        {LITERAL, NULL, READ_INTEGER, READ_LINE, THIS, NEW, INSTANCEOF, Integer.valueOf('('), IDENTIFIER, CASE, DCOPY, SCOPY, SUPER},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {DDD, OOD},
        {OR},
        {ELSE, PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, PRINTCOMP, DDO, READ_LINE, WHILE, RETURN, OOD, NULL, INT, SCOPY, Integer.valueOf('}'), Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), DCOPY, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{'), DDD},
        {COMPLEX, VOID, CLASS, INT, STRING, STATIC, BOOL, Integer.valueOf('}')},
        {LITERAL, NULL},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER, CLASS},
        {CLASS},
        {RETURN},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {Integer.valueOf('{')},
        {Integer.valueOf('('), Integer.valueOf(';')},
        {Integer.valueOf('('), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {DDO},
        {CLASS},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {COMPLEX, VOID, CLASS, INT, STRING, BOOL},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {IDENTIFIER, COMPLEX, VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('='), Integer.valueOf(';'), Integer.valueOf(')')},
        {EXTENDS, Integer.valueOf('{')},
        {Integer.valueOf('+'), Integer.valueOf('-')},
        {Integer.valueOf('['), IDENTIFIER},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER, Integer.valueOf(')')},
        {COMPLEX, VOID, CLASS, INT, STRING, BOOL},
        {EQUAL, NOT_EQUAL, Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {COMPLEX, VOID, CLASS, INT, STRING, BOOL, CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER, IF, WHILE, FOR, RETURN, PRINT, PRINTCOMP, BREAK, DDO, Integer.valueOf('{')},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER, Integer.valueOf(';'), Integer.valueOf(')')},
        {INT, VOID, COMPLEX, BOOL, STRING, CLASS},
        {WHILE},
        {OR, Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf(']'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER, Integer.valueOf(';')},
        {IF},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('['), Integer.valueOf('.'), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {DEFULT},
        {Integer.valueOf('!'), Integer.valueOf('-'), Integer.valueOf('@'), Integer.valueOf('$'), Integer.valueOf('#'), CASE, READ_LINE, NULL, SCOPY, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), DCOPY, SUPER, READ_INTEGER},
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
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, PRINTCOMP, DDO, READ_LINE, WHILE, RETURN, OOD, NULL, INT, SCOPY, Integer.valueOf('}'), Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), DCOPY, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{'), DDD},
        {DDD, OOD},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {Integer.valueOf(')')},
        {Integer.valueOf(')')},
        {CASE, READ_LINE, NULL, SCOPY, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), DCOPY, SUPER, READ_INTEGER},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf(';')},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {DEFULT},
        {Integer.valueOf(';')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf(';')},
        {Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(')')},
        {Integer.valueOf(';')},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, PRINTCOMP, DDO, READ_LINE, WHILE, RETURN, OOD, NULL, INT, SCOPY, Integer.valueOf('}'), Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), DCOPY, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{'), DDD},
        {DDD, OOD},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {OOD},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, PRINTCOMP, DDO, READ_LINE, WHILE, RETURN, OOD, NULL, INT, SCOPY, Integer.valueOf('}'), Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), DCOPY, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{'), DDD},
        {Integer.valueOf('}')},
        {LITERAL, NULL, DEFULT},
        {Integer.valueOf(')')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {CLASS, eof, eos},
        {Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, PRINTCOMP, DDO, READ_LINE, WHILE, RETURN, OOD, NULL, INT, SCOPY, Integer.valueOf('}'), Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, STATIC, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), DCOPY, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{'), DDD},
        {COMPLEX, VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(';')},
        {eof, eos},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {IDENTIFIER},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('{')},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {IDENTIFIER},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {Integer.valueOf(';'), Integer.valueOf(','), Integer.valueOf(')')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, PRINTCOMP, DDO, READ_LINE, WHILE, RETURN, OOD, NULL, INT, SCOPY, Integer.valueOf('}'), Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), DCOPY, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{'), DDD},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('['), IDENTIFIER},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, PRINTCOMP, DDO, READ_LINE, WHILE, RETURN, OOD, NULL, INT, SCOPY, Integer.valueOf('}'), Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), DCOPY, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{'), DDD},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {Integer.valueOf(']'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf(']'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf(';')},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, PRINTCOMP, DDO, READ_LINE, WHILE, RETURN, OOD, NULL, INT, SCOPY, Integer.valueOf('}'), Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), DCOPY, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{'), DDD},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {eof, eos},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
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
        for (int i = 0; i < 67; i++) {
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
            //# line 55
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
            //# line 835
            case DoSubStmt: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(1, Arrays.asList(Expr, Integer.valueOf(':'), Stmt));
                    default: return null;
                }
            }
            //# line 516
            case ExprT5: {
                switch (lookahead) {
                    case '+':
                    case '-':
                        return new Pair<>(2, Arrays.asList(Oper5, Expr6, ExprT5));
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case ':':
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
                        return new Pair<>(128, Arrays.asList());
                    default: return null;
                }
            }
            //# line 291
            case Oper3: {
                switch (lookahead) {
                    case EQUAL:
                        return new Pair<>(4, Arrays.asList(EQUAL));
                    case NOT_EQUAL:
                        return new Pair<>(5, Arrays.asList(NOT_EQUAL));
                    default: return null;
                }
            }
            //# line 337
            case Oper6: {
                switch (lookahead) {
                    case '*':
                        return new Pair<>(6, Arrays.asList(Integer.valueOf('*')));
                    case '/':
                        return new Pair<>(7, Arrays.asList(Integer.valueOf('/')));
                    case '%':
                        return new Pair<>(8, Arrays.asList(Integer.valueOf('%')));
                    default: return null;
                }
            }
            //# line 175
            case VariableList: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(9, Arrays.asList(Variable, SubVariableList));
                    default: return null;
                }
            }
            //# line 165
            case Formals: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(10, Arrays.asList(VariableList));
                    case ')':
                        return new Pair<>(11, Arrays.asList());
                    default: return null;
                }
            }
            //# line 354
            case Oper7: {
                switch (lookahead) {
                    case '-':
                        return new Pair<>(12, Arrays.asList(Integer.valueOf('-')));
                    case '!':
                        return new Pair<>(13, Arrays.asList(Integer.valueOf('!')));
                    case '@':
                        return new Pair<>(14, Arrays.asList(Integer.valueOf('@')));
                    case '#':
                        return new Pair<>(15, Arrays.asList(Integer.valueOf('#')));
                    case '$':
                        return new Pair<>(16, Arrays.asList(Integer.valueOf('$')));
                    default: return null;
                }
            }
            //# line 572
            case Expr8: {
                switch (lookahead) {
                    case CASE:
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(17, Arrays.asList(Expr9, ExprT8));
                    default: return null;
                }
            }
            //# line 699
            case AfterSimpleTypeExpr: {
                switch (lookahead) {
                    case ']':
                        return new Pair<>(18, Arrays.asList(Integer.valueOf(']'), Integer.valueOf('['), AfterSimpleTypeExpr));
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(19, Arrays.asList(Expr, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 417
            case Expr2: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(20, Arrays.asList(Expr3, ExprT2));
                    default: return null;
                }
            }
            //# line 284
            case Oper2: {
                switch (lookahead) {
                    case AND:
                        return new Pair<>(21, Arrays.asList(AND));
                    default: return null;
                }
            }
            //# line 533
            case Expr6: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(22, Arrays.asList(Expr7, ExprT6));
                    default: return null;
                }
            }
            //# line 737
            case ACaseExprlist: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                        return new Pair<>(23, Arrays.asList(ACaseExpr, ACaseExprlist));
                    case DEFULT:
                        return new Pair<>(24, Arrays.asList());
                    default: return null;
                }
            }
            //# line 810
            case BreakStmt: {
                switch (lookahead) {
                    case BREAK:
                        return new Pair<>(25, Arrays.asList(BREAK));
                    default: return null;
                }
            }
            //# line 429
            case ExprT2: {
                switch (lookahead) {
                    case AND:
                        return new Pair<>(26, Arrays.asList(Oper2, Expr3, ExprT2));
                    case ']':
                    case ':':
                    case ')':
                    case ',':
                    case '=':
                    case OR:
                    case ';':
                        return new Pair<>(128, Arrays.asList());
                    default: return null;
                }
            }
            //# line 202
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
                    case DDO:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case SCOPY:
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
                    case DCOPY:
                    case BOOL:
                    case SUPER:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                        return new Pair<>(28, Arrays.asList(Stmt, StmtList));
                    case '}':
                        return new Pair<>(128, Arrays.asList());
                    default: return null;
                }
            }
            //# line 752
            case Constant: {
                switch (lookahead) {
                    case LITERAL:
                        return new Pair<>(30, Arrays.asList(LITERAL));
                    case NULL:
                        return new Pair<>(31, Arrays.asList(NULL));
                    default: return null;
                }
            }
            //# line 185
            case SubVariableList: {
                switch (lookahead) {
                    case ',':
                        return new Pair<>(32, Arrays.asList(Integer.valueOf(','), Variable, SubVariableList));
                    case ')':
                        return new Pair<>(128, Arrays.asList());
                    default: return null;
                }
            }
            //# line 875
            case PrintStmt: {
                switch (lookahead) {
                    case PRINT:
                        return new Pair<>(34, Arrays.asList(PRINT, Integer.valueOf('('), ExprList, Integer.valueOf(')')));
                    case PRINTCOMP:
                        return new Pair<>(35, Arrays.asList(PRINTCOMP, Integer.valueOf('('), ExprList, Integer.valueOf(')')));
                    default: return null;
                }
            }
            //# line 804
            case ForStmt: {
                switch (lookahead) {
                    case FOR:
                        return new Pair<>(36, Arrays.asList(FOR, Integer.valueOf('('), SimpleStmt, Integer.valueOf(';'), Expr, Integer.valueOf(';'), SimpleStmt, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 840
            case DoBranch: {
                switch (lookahead) {
                    case DDD:
                        return new Pair<>(37, Arrays.asList(DDD, DoSubStmt));
                    default: return null;
                }
            }
            //# line 624
            case Expr9: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                        return new Pair<>(38, Arrays.asList(Constant));
                    case READ_INTEGER:
                        return new Pair<>(39, Arrays.asList(READ_INTEGER, Integer.valueOf('('), Integer.valueOf(')')));
                    case READ_LINE:
                        return new Pair<>(40, Arrays.asList(READ_LINE, Integer.valueOf('('), Integer.valueOf(')')));
                    case THIS:
                        return new Pair<>(41, Arrays.asList(THIS));
                    case NEW:
                        return new Pair<>(42, Arrays.asList(NEW, AfterNewExpr));
                    case INSTANCEOF:
                        return new Pair<>(43, Arrays.asList(INSTANCEOF, Integer.valueOf('('), Expr, Integer.valueOf(','), IDENTIFIER, Integer.valueOf(')')));
                    case '(':
                        return new Pair<>(44, Arrays.asList(Integer.valueOf('('), AfterParenExpr));
                    case IDENTIFIER:
                        return new Pair<>(45, Arrays.asList(IDENTIFIER, AfterIdentExpr));
                    case CASE:
                        return new Pair<>(46, Arrays.asList(CASE, Integer.valueOf('('), Expr, Integer.valueOf(')'), Integer.valueOf('{'), ACaseExprlist, DefaultExpr, Integer.valueOf('}')));
                    case DCOPY:
                        return new Pair<>(47, Arrays.asList(DCOPY, Integer.valueOf('('), Expr, Integer.valueOf(')')));
                    case SCOPY:
                        return new Pair<>(48, Arrays.asList(SCOPY, Integer.valueOf('('), Expr, Integer.valueOf(')')));
                    case SUPER:
                        return new Pair<>(49, Arrays.asList(SUPER, Integer.valueOf('.'), IDENTIFIER, Integer.valueOf('('), Actuals, Integer.valueOf(')')));
                    default: return null;
                }
            }
            //# line 388
            case Expr1: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(50, Arrays.asList(Expr2, ExprT1));
                    default: return null;
                }
            }
            //# line 846
            case DoBranchlist: {
                switch (lookahead) {
                    case DDD:
                        return new Pair<>(51, Arrays.asList(DoBranch, DoBranchlist));
                    case OOD:
                        return new Pair<>(52, Arrays.asList());
                    default: return null;
                }
            }
            //# line 277
            case Oper1: {
                switch (lookahead) {
                    case OR:
                        return new Pair<>(53, Arrays.asList(OR));
                    default: return null;
                }
            }
            //# line 822
            case ElseClause: {
                switch (lookahead) {
                    case ELSE:
                        return new Pair<>(54, Arrays.asList(ELSE, Stmt));
                    case PRINT:
                    case CASE:
                    case COMPLEX:
                    case VOID:
                    case FOR:
                    case '!':
                    case '-':
                    case CLASS:
                    case PRINTCOMP:
                    case DDO:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case OOD:
                    case NULL:
                    case INT:
                    case SCOPY:
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
                    case DCOPY:
                    case BOOL:
                    case SUPER:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                    case DDD:
                        return new Pair<>(128, Arrays.asList());
                    default: return null;
                }
            }
            //# line 125
            case FieldList: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case STATIC:
                    case BOOL:
                        return new Pair<>(56, Arrays.asList(Field, FieldList));
                    case '}':
                        return new Pair<>(57, Arrays.asList());
                    default: return null;
                }
            }
            //# line 731
            case ACaseExpr: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                        return new Pair<>(58, Arrays.asList(Constant, Integer.valueOf(':'), Expr, Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 781
            case SubExprList: {
                switch (lookahead) {
                    case ',':
                        return new Pair<>(59, Arrays.asList(Integer.valueOf(','), Expr, SubExprList));
                    case ')':
                        return new Pair<>(60, Arrays.asList());
                    default: return null;
                }
            }
            //# line 711
            case AfterParenExpr: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(61, Arrays.asList(Expr, Integer.valueOf(')')));
                    case CLASS:
                        return new Pair<>(62, Arrays.asList(CLASS, IDENTIFIER, Integer.valueOf(')'), Expr9));
                    default: return null;
                }
            }
            //# line 112
            case ClassDef: {
                switch (lookahead) {
                    case CLASS:
                        return new Pair<>(63, Arrays.asList(CLASS, IDENTIFIER, ExtendsClause, Integer.valueOf('{'), FieldList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 829
            case ReturnStmt: {
                switch (lookahead) {
                    case RETURN:
                        return new Pair<>(64, Arrays.asList(RETURN, ReturnExpr));
                    default: return null;
                }
            }
            //# line 773
            case ExprList: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(65, Arrays.asList(Expr, SubExprList));
                    default: return null;
                }
            }
            //# line 196
            case StmtBlock: {
                switch (lookahead) {
                    case '{':
                        return new Pair<>(66, Arrays.asList(Integer.valueOf('{'), StmtList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 157
            case FunctionField: {
                switch (lookahead) {
                    case '(':
                        return new Pair<>(67, Arrays.asList(Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case ';':
                        return new Pair<>(128, Arrays.asList(Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 617
            case AfterIdentExpr: {
                switch (lookahead) {
                    case '(':
                        return new Pair<>(69, Arrays.asList(Integer.valueOf('('), Actuals, Integer.valueOf(')')));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case '.':
                    case '-':
                    case ':':
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
                        return new Pair<>(128, Arrays.asList());
                    default: return null;
                }
            }
            //# line 858
            case DoStmt: {
                switch (lookahead) {
                    case DDO:
                        return new Pair<>(71, Arrays.asList(DDO, DoSubStmt, DoBranchlist, OOD));
                    default: return null;
                }
            }
            //# line 33
            case Program: {
                switch (lookahead) {
                    case CLASS:
                        return new Pair<>(72, Arrays.asList(ClassDef, ClassList));
                    default: return null;
                }
            }
            //# line 382
            case Expr: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(73, Arrays.asList(Expr1));
                    default: return null;
                }
            }
            //# line 93
            case Type: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(74, Arrays.asList(SimpleType, ArrayType));
                    default: return null;
                }
            }
            //# line 504
            case Expr5: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(75, Arrays.asList(Expr6, ExprT5));
                    default: return null;
                }
            }
            //# line 685
            case AfterNewExpr: {
                switch (lookahead) {
                    case IDENTIFIER:
                        return new Pair<>(76, Arrays.asList(IDENTIFIER, Integer.valueOf('('), Integer.valueOf(')')));
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(77, Arrays.asList(SimpleType, Integer.valueOf('['), AfterSimpleTypeExpr));
                    default: return null;
                }
            }
            //# line 268
            case Assignment: {
                switch (lookahead) {
                    case '=':
                        return new Pair<>(78, Arrays.asList(Integer.valueOf('='), Expr));
                    case ';':
                    case ')':
                        return new Pair<>(128, Arrays.asList());
                    default: return null;
                }
            }
            //# line 118
            case ExtendsClause: {
                switch (lookahead) {
                    case EXTENDS:
                        return new Pair<>(80, Arrays.asList(EXTENDS, IDENTIFIER));
                    case '{':
                        return new Pair<>(128, Arrays.asList());
                    default: return null;
                }
            }
            //# line 325
            case Oper5: {
                switch (lookahead) {
                    case '+':
                        return new Pair<>(82, Arrays.asList(Integer.valueOf('+')));
                    case '-':
                        return new Pair<>(83, Arrays.asList(Integer.valueOf('-')));
                    default: return null;
                }
            }
            //# line 102
            case ArrayType: {
                switch (lookahead) {
                    case '[':
                        return new Pair<>(84, Arrays.asList(Integer.valueOf('['), Integer.valueOf(']'), ArrayType));
                    case IDENTIFIER:
                        return new Pair<>(85, Arrays.asList());
                    default: return null;
                }
            }
            //# line 446
            case Expr3: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(86, Arrays.asList(Expr4, ExprT3));
                    default: return null;
                }
            }
            //# line 762
            case Actuals: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(87, Arrays.asList(ExprList));
                    case ')':
                        return new Pair<>(88, Arrays.asList());
                    default: return null;
                }
            }
            //# line 61
            case Variable: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(89, Arrays.asList(Type, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 458
            case ExprT3: {
                switch (lookahead) {
                    case EQUAL:
                    case NOT_EQUAL:
                        return new Pair<>(90, Arrays.asList(Oper3, Expr4, ExprT3));
                    case ']':
                    case ':':
                    case ')':
                    case ',':
                    case '=':
                    case OR:
                    case AND:
                    case ';':
                        return new Pair<>(128, Arrays.asList());
                    default: return null;
                }
            }
            //# line 210
            case Stmt: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(92, Arrays.asList(VariableDef));
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
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
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(93, Arrays.asList(SimpleStmt, Integer.valueOf(';')));
                    case IF:
                        return new Pair<>(94, Arrays.asList(IfStmt));
                    case WHILE:
                        return new Pair<>(95, Arrays.asList(WhileStmt));
                    case FOR:
                        return new Pair<>(96, Arrays.asList(ForStmt));
                    case RETURN:
                        return new Pair<>(97, Arrays.asList(ReturnStmt, Integer.valueOf(';')));
                    case PRINT:
                    case PRINTCOMP:
                        return new Pair<>(98, Arrays.asList(PrintStmt, Integer.valueOf(';')));
                    case BREAK:
                        return new Pair<>(99, Arrays.asList(BreakStmt, Integer.valueOf(';')));
                    case DDO:
                        return new Pair<>(100, Arrays.asList(DoStmt, Integer.valueOf(';')));
                    case '{':
                        return new Pair<>(101, Arrays.asList(StmtBlock));
                    default: return null;
                }
            }
            //# line 257
            case SimpleStmt: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(102, Arrays.asList(Expr, Assignment));
                    case ';':
                    case ')':
                        return new Pair<>(128, Arrays.asList());
                    default: return null;
                }
            }
            //# line 67
            case SimpleType: {
                switch (lookahead) {
                    case INT:
                        return new Pair<>(104, Arrays.asList(INT));
                    case VOID:
                        return new Pair<>(105, Arrays.asList(VOID));
                    case COMPLEX:
                        return new Pair<>(106, Arrays.asList(COMPLEX));
                    case BOOL:
                        return new Pair<>(107, Arrays.asList(BOOL));
                    case STRING:
                        return new Pair<>(108, Arrays.asList(STRING));
                    case CLASS:
                        return new Pair<>(109, Arrays.asList(CLASS, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 798
            case WhileStmt: {
                switch (lookahead) {
                    case WHILE:
                        return new Pair<>(110, Arrays.asList(WHILE, Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 400
            case ExprT1: {
                switch (lookahead) {
                    case OR:
                        return new Pair<>(111, Arrays.asList(Oper1, Expr2, ExprT1));
                    case ']':
                    case ':':
                    case ')':
                    case ',':
                    case '=':
                    case ';':
                        return new Pair<>(128, Arrays.asList());
                    default: return null;
                }
            }
            //# line 475
            case Expr4: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(113, Arrays.asList(Expr5, ExprT4));
                    default: return null;
                }
            }
            //# line 487
            case ExprT4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                    case GREATER_EQUAL:
                    case '<':
                    case '>':
                        return new Pair<>(114, Arrays.asList(Oper4, Expr5, ExprT4));
                    case ']':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case AND:
                    case ';':
                        return new Pair<>(128, Arrays.asList());
                    default: return null;
                }
            }
            //# line 868
            case ReturnExpr: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(116, Arrays.asList(Expr));
                    case ';':
                        return new Pair<>(128, Arrays.asList());
                    default: return null;
                }
            }
            //# line 816
            case IfStmt: {
                switch (lookahead) {
                    case IF:
                        return new Pair<>(118, Arrays.asList(IF, Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt, ElseClause));
                    default: return null;
                }
            }
            //# line 545
            case ExprT6: {
                switch (lookahead) {
                    case '*':
                    case '/':
                    case '%':
                        return new Pair<>(119, Arrays.asList(Oper6, Expr7, ExprT6));
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case '-':
                    case ':':
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
                        return new Pair<>(128, Arrays.asList());
                    default: return null;
                }
            }
            //# line 592
            case ExprT8: {
                switch (lookahead) {
                    case '[':
                        return new Pair<>(121, Arrays.asList(Integer.valueOf('['), Expr, Integer.valueOf(']'), ExprT8));
                    case '.':
                        return new Pair<>(122, Arrays.asList(Integer.valueOf('.'), IDENTIFIER, AfterIdentExpr, ExprT8));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case '-':
                    case ':':
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
                        return new Pair<>(128, Arrays.asList());
                    default: return null;
                }
            }
            //# line 722
            case DefaultExpr: {
                switch (lookahead) {
                    case DEFULT:
                        return new Pair<>(124, Arrays.asList(DEFULT, Integer.valueOf(':'), Expr, Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 562
            case Expr7: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case '@':
                    case '$':
                    case '#':
                        return new Pair<>(125, Arrays.asList(Oper7, Expr8));
                    case CASE:
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(126, Arrays.asList(Expr8));
                    default: return null;
                }
            }
            //# line 44
            case ClassList: {
                switch (lookahead) {
                    case CLASS:
                        return new Pair<>(127, Arrays.asList(ClassDef, ClassList));
                    case eof:
                    case eos:
                        return new Pair<>(128, Arrays.asList());
                    default: return null;
                }
            }
            //# line 303
            case Oper4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                        return new Pair<>(129, Arrays.asList(LESS_EQUAL));
                    case GREATER_EQUAL:
                        return new Pair<>(130, Arrays.asList(GREATER_EQUAL));
                    case '<':
                        return new Pair<>(131, Arrays.asList(Integer.valueOf('<')));
                    case '>':
                        return new Pair<>(132, Arrays.asList(Integer.valueOf('>')));
                    default: return null;
                }
            }
            //# line 141
            case Field: {
                switch (lookahead) {
                    case STATIC:
                        return new Pair<>(133, Arrays.asList(STATIC, Type, IDENTIFIER, Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(134, Arrays.asList(Type, IDENTIFIER, FunctionField));
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
                //# line 56
                params[0].vdef = params[1].vdef;
                return;
            }
            case 1: {
                //# line 836
                params[0].dstmt = new Tree.DoSubStmt(params[1].expr,params[3].stmt,params[2].loc);
                return;
            }
            case 2: {
                //# line 517
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
            case 3: {
                /* no action */
                return;
            }
            case 4: {
                //# line 292
                params[0].counter = Tree.EQ;
                params[0].loc = params[1].loc;
                return;
            }
            case 5: {
                //# line 297
                params[0].counter = Tree.NE;
                params[0].loc = params[1].loc;
                return;
            }
            case 6: {
                //# line 338
                params[0].counter = Tree.MUL;
                params[0].loc = params[1].loc;
                return;
            }
            case 7: {
                //# line 343
                params[0].counter = Tree.DIV;
                params[0].loc = params[1].loc;
                return;
            }
            case 8: {
                //# line 348
                params[0].counter = Tree.MOD;
                params[0].loc = params[1].loc;
                return;
            }
            case 9: {
                //# line 176
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[1].vdef);
                if (params[2].vlist != null) {
                    params[0].vlist.addAll(params[2].vlist);
                }
                return;
            }
            case 10: {
                //# line 166
                params[0].vlist = params[1].vlist;
                return;
            }
            case 11: {
                //# line 170
                params[0].vlist = new ArrayList<VarDef>();
                return;
            }
            case 12: {
                //# line 355
                params[0].counter = Tree.NEG;
                params[0].loc = params[1].loc;
                return;
            }
            case 13: {
                //# line 360
                params[0].counter = Tree.NOT;
                params[0].loc = params[1].loc;
                return;
            }
            case 14: {
                //# line 365
                params[0].counter = Tree.RE;
                     params[0].loc = params[1].loc;
                return;
            }
            case 15: {
                //# line 370
                params[0].counter = Tree.TR;
                     params[0].loc = params[1].loc;
                return;
            }
            case 16: {
                //# line 375
                params[0].counter = Tree.IM;
                     params[0].loc = params[1].loc;
                return;
            }
            case 17: {
                //# line 573
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
            case 18: {
                //# line 700
                params[0].expr = params[3].expr;
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 19: {
                //# line 705
                params[0].expr = params[1].expr;
                params[0].counter = 0;
                return;
            }
            case 20: {
                //# line 418
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 21: {
                //# line 285
                params[0].counter = Tree.AND;
                params[0].loc = params[1].loc;
                return;
            }
            case 22: {
                //# line 534
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 23: {
                //# line 738
                params[0].celist = new ArrayList<Tree.CaseExpr>();
                params[0].celist.add(params[1].cexpr);
                params[0].celist.addAll(params[2].celist);   
                return;
            }
            case 24: {
                //# line 745
                params[0].celist = new ArrayList<Tree.CaseExpr>();
                return;
            }
            case 25: {
                //# line 811
                params[0].stmt = new Tree.Break(params[1].loc);
                return;
            }
            case 26: {
                //# line 430
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
            case 27: {
                /* no action */
                return;
            }
            case 28: {
                //# line 203
                params[0].slist.add(params[1].stmt);
                params[0].slist.addAll(params[2].slist);
                return;
            }
            case 29: {
                /* no action */
                return;
            }
            case 30: {
                //# line 753
                params[0].expr = new Tree.Literal(params[1].typeTag, params[1].literal, params[1].loc);
                return;
            }
            case 31: {
                //# line 757
                params[0].expr = new Null(params[1].loc);
                return;
            }
            case 32: {
                //# line 186
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[2].vdef);
                if (params[3].vlist != null) {
                    params[0].vlist.addAll(params[3].vlist);
                }
                return;
            }
            case 33: {
                /* no action */
                return;
            }
            case 34: {
                //# line 876
                params[0].stmt = new Tree.Print(params[3].elist, params[1].loc);
                return;
            }
            case 35: {
                //# line 880
                params[0].stmt = new Tree.PrintComp(params[3].elist, params[1].loc);
                return;
            }
            case 36: {
                //# line 805
                params[0].stmt = new Tree.ForLoop(params[3].stmt, params[5].expr, params[7].stmt, params[9].stmt, params[1].loc);
                return;
            }
            case 37: {
                //# line 841
                params[0].dstmt = params[2].dstmt;
                return;
            }
            case 38: {
                //# line 625
                params[0].expr = params[1].expr;
                return;
            }
            case 39: {
                //# line 629
                params[0].expr = new Tree.ReadIntExpr(params[1].loc);
                return;
            }
            case 40: {
                //# line 633
                params[0].expr = new Tree.ReadLineExpr(params[1].loc);
                return;
            }
            case 41: {
                //# line 637
                params[0].expr = new Tree.ThisExpr(params[1].loc);
                return;
            }
            case 42: {
                //# line 641
                if (params[2].ident != null) {
                    params[0].expr = new Tree.NewClass(params[2].ident, params[1].loc);
                } else {
                    params[0].expr = new Tree.NewArray(params[2].type, params[2].expr, params[1].loc);
                }
                return;
            }
            case 43: {
                //# line 649
                params[0].expr = new Tree.TypeTest(params[3].expr, params[5].ident, params[1].loc);
                return;
            }
            case 44: {
                //# line 653
                params[0].expr = params[2].expr;
                return;
            }
            case 45: {
                //# line 657
                if (params[2].elist != null) {
                    params[0].expr = new Tree.CallExpr(null, params[1].ident, params[2].elist, params[1].loc);
                } else {
                    params[0].expr = new Tree.Ident(null, params[1].ident, params[1].loc);
                }
                return;
            }
            case 46: {
                //# line 665
                params[0].expr = new Tree.Case(params[3].expr,  params[6].celist ,params[7].dfexpr ,params[1].loc);
                return;
            }
            case 47: {
                //# line 670
                params[0].expr = new Tree.CopyExpr("dcopy",params[3].expr, params[1].loc);
                return;
            }
            case 48: {
                //# line 674
                params[0].expr = new Tree.CopyExpr("scopy",params[3].expr, params[1].loc);
                return;
            }
            case 49: {
                //# line 678
                params[0] = new SemValue();
                params[0].expr = new Tree.SuperExpr(params[3].ident, params[5].elist, params[3].loc);
                params[0].loc = params[3].loc;
                return;
            }
            case 50: {
                //# line 389
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 51: {
                //# line 847
                params[0].Dolist = new ArrayList<Tree>();
                params[0].Dolist.add(params[1].dstmt);
                params[0].Dolist.addAll(params[2].Dolist);
                return;
            }
            case 52: {
                //# line 853
                params[0].Dolist = new ArrayList<Tree>();
                return;
            }
            case 53: {
                //# line 278
                params[0].counter = Tree.OR;
                params[0].loc = params[1].loc;
                return;
            }
            case 54: {
                //# line 823
                params[0].stmt = params[2].stmt;
                return;
            }
            case 55: {
                /* no action */
                return;
            }
            case 56: {
                //# line 126
                params[0].flist = new ArrayList<Tree>();
                if (params[1].vdef != null) {
                    params[0].flist.add(params[1].vdef);
                } else {
                    params[0].flist.add(params[1].fdef);
                }
                params[0].flist.addAll(params[2].flist);
                return;
            }
            case 57: {
                //# line 136
                params[0].flist = new ArrayList<Tree>();
                return;
            }
            case 58: {
                //# line 732
                params[0].cexpr = new Tree.CaseExpr(params[1].expr,params[3].expr,params[1].loc);
                return;
            }
            case 59: {
                //# line 782
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[2].expr);
                params[0].elist.addAll(params[3].elist);
                return;
            }
            case 60: {
                //# line 788
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 61: {
                //# line 712
                params[0].expr = params[1].expr;
                return;
            }
            case 62: {
                //# line 716
                params[0].expr = new Tree.TypeCast(params[2].ident, params[4].expr, params[4].loc);
                return;
            }
            case 63: {
                //# line 113
                params[0].cdef = new Tree.ClassDef(params[2].ident, params[3].ident, params[5].flist, params[1].loc);
                return;
            }
            case 64: {
                //# line 830
                params[0].stmt = new Tree.Return(params[2].expr, params[1].loc);
                return;
            }
            case 65: {
                //# line 774
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[1].expr);
                params[0].elist.addAll(params[2].elist);
                return;
            }
            case 66: {
                //# line 197
                params[0].stmt = new Tree.Block(params[2].slist, params[1].loc);
                return;
            }
            case 67: {
                //# line 158
                params[0].vlist = params[2].vlist;
                params[0].stmt = params[4].stmt;
                return;
            }
            case 68: {
                /* no action */
                return;
            }
            case 69: {
                //# line 618
                params[0].elist = params[2].elist;
                return;
            }
            case 70: {
                /* no action */
                return;
            }
            case 71: {
                //# line 859
                params[0].stmt = new Tree.DoStmt(params[3].Dolist,params[2].dstmt,params[1].loc);
                return;
            }
            case 72: {
                //# line 34
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                params[0].prog = new Tree.TopLevel(params[0].clist, params[0].loc);
                return;
            }
            case 73: {
                //# line 383
                params[0].expr = params[1].expr;
                return;
            }
            case 74: {
                //# line 94
                params[0].type = params[1].type;
                for (int i = 0; i < params[2].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                return;
            }
            case 75: {
                //# line 505
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 76: {
                //# line 686
                params[0].ident = params[1].ident;
                return;
            }
            case 77: {
                //# line 690
                params[0].type = params[1].type;
                for (int i = 0; i < params[3].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                params[0].expr = params[3].expr;
                return;
            }
            case 78: {
                //# line 269
                params[0].loc = params[1].loc;
                params[0].expr = params[2].expr;
                return;
            }
            case 79: {
                /* no action */
                return;
            }
            case 80: {
                //# line 119
                params[0].ident = params[2].ident;
                return;
            }
            case 81: {
                /* no action */
                return;
            }
            case 82: {
                //# line 326
                params[0].counter = Tree.PLUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 83: {
                //# line 331
                params[0].counter = Tree.MINUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 84: {
                //# line 103
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 85: {
                //# line 107
                params[0].counter = 0;
                return;
            }
            case 86: {
                //# line 447
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 87: {
                //# line 763
                params[0].elist = params[1].elist;
                return;
            }
            case 88: {
                //# line 767
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 89: {
                //# line 62
                params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                return;
            }
            case 90: {
                //# line 459
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
            case 91: {
                /* no action */
                return;
            }
            case 92: {
                //# line 211
                params[0].stmt = params[1].vdef;
                return;
            }
            case 93: {
                //# line 215
                if (params[1].stmt == null) {
                    params[0].stmt = new Tree.Skip(params[2].loc);
                } else {
                    params[0].stmt = params[1].stmt;
                }
                return;
            }
            case 94: {
                //# line 223
                params[0].stmt = params[1].stmt;
                return;
            }
            case 95: {
                //# line 227
                params[0].stmt = params[1].stmt;
                return;
            }
            case 96: {
                //# line 231
                params[0].stmt = params[1].stmt;
                return;
            }
            case 97: {
                //# line 235
                params[0].stmt = params[1].stmt;
                return;
            }
            case 98: {
                //# line 239
                params[0].stmt = params[1].stmt;
                return;
            }
            case 99: {
                //# line 243
                params[0].stmt = params[1].stmt;
                return;
            }
            case 100: {
                //# line 247
                params[0].stmt = params[1].stmt;
                return;
            }
            case 101: {
                //# line 251
                params[0].stmt = params[1].stmt;
                return;
            }
            case 102: {
                //# line 258
                if (params[2].expr == null) {
                    params[0].stmt = new Tree.Calculate(params[1].expr, params[1].loc);
                } else {
                    params[0].stmt = new Tree.Assign(params[1].expr, params[2].expr, params[2].loc);
                }
                return;
            }
            case 103: {
                /* no action */
                return;
            }
            case 104: {
                //# line 68
                params[0].type = new Tree.TypeIdent(Tree.INT, params[1].loc);
                return;
            }
            case 105: {
                //# line 72
                params[0].type = new Tree.TypeIdent(Tree.VOID, params[1].loc);
                return;
            }
            case 106: {
                //# line 76
                params[0].type = new Tree.TypeIdent(Tree.COMPLEX, params[1].loc);
                return;
            }
            case 107: {
                //# line 80
                params[0].type = new Tree.TypeIdent(Tree.BOOL, params[1].loc);
                return;
            }
            case 108: {
                //# line 84
                params[0].type = new Tree.TypeIdent(Tree.STRING, params[1].loc);
                return;
            }
            case 109: {
                //# line 88
                params[0].type = new Tree.TypeClass(params[2].ident, params[1].loc);
                return;
            }
            case 110: {
                //# line 799
                params[0].stmt = new Tree.WhileLoop(params[3].expr, params[5].stmt, params[1].loc);
                return;
            }
            case 111: {
                //# line 401
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
            case 112: {
                /* no action */
                return;
            }
            case 113: {
                //# line 476
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 114: {
                //# line 488
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
            case 115: {
                /* no action */
                return;
            }
            case 116: {
                //# line 869
                params[0].expr = params[1].expr;
                return;
            }
            case 117: {
                /* no action */
                return;
            }
            case 118: {
                //# line 817
                params[0].stmt = new Tree.If(params[3].expr, params[5].stmt, params[6].stmt, params[1].loc);
                return;
            }
            case 119: {
                //# line 546
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
            case 120: {
                /* no action */
                return;
            }
            case 121: {
                //# line 593
                SemValue sem = new SemValue();
                sem.expr = params[2].expr;
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[4].vec != null) {
                    params[0].vec.addAll(params[4].vec);
                }
                return;
            }
            case 122: {
                //# line 603
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
            case 123: {
                /* no action */
                return;
            }
            case 124: {
                //# line 723
                params[0].dfexpr = new Tree.DfExpr(params[3].expr,params[1].loc);
                return;
            }
            case 125: {
                //# line 563
                params[0].expr = new Tree.Unary(params[1].counter, params[2].expr, params[1].loc);
                return;
            }
            case 126: {
                //# line 567
                params[0].expr = params[1].expr;
                return;
            }
            case 127: {
                //# line 45
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                return;
            }
            case 128: {
                /* no action */
                return;
            }
            case 129: {
                //# line 304
                params[0].counter = Tree.LE;
                params[0].loc = params[1].loc;
                return;
            }
            case 130: {
                //# line 309
                params[0].counter = Tree.GE;
                params[0].loc = params[1].loc;
                return;
            }
            case 131: {
                //# line 314
                params[0].counter = Tree.LT;
                params[0].loc = params[1].loc;
                return;
            }
            case 132: {
                //# line 319
                params[0].counter = Tree.GT;
                params[0].loc = params[1].loc;
                return;
            }
            case 133: {
                //# line 142
                params[0].fdef = new Tree.MethodDef(true, params[3].ident, params[2].type, params[5].vlist,
                    (Block) params[7].stmt, params[3].loc);
                return;
            }
            case 134: {
                //# line 147
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
