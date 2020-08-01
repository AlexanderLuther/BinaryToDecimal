package com.hluther.lexer;
import com.hluther.gui.PrincipalFrame;
import com.hluther.parser.sym;
import java_cup.runtime.*;
%%//

/* 
----------------------------------- Opciones y declaraciones de JFlex -----------------------------------
*/
%class Lexer
%cup
%cupdebug
%line 
%column
%public
LineTerminator = \r|\n|\r\n
WhiteSpace = {LineTerminator} | [ \t\f]

/* 
----------------------------------- Codigo Java -----------------------------------
*/
%{
    private PrincipalFrame principalFrame;
    private String errorLexeme; 
    private int line;
    private int column;

    public Lexer(java.io.Reader in, PrincipalFrame principalFrame) {
        this.principalFrame = principalFrame;    
        this.zzReader = in;
        this.errorLexeme = "";
        line = -1;
        column = -1;
    }
        
    private Symbol symbol(int type, double value) {
        return new Symbol(type, yyline+1, yycolumn, value);
    }

    private Symbol symbol(int type, String value) {
        return new Symbol(type, yyline+1, yycolumn, value);
    }


    private void printToken(String token){
        System.out.println(token);
    }

    private void createErrorLexeme(String lexeme, int line, int column){
        if(this.line == -1 && this.column == -1){
            this.line = line;
            this.column = column;
        }
        errorLexeme = errorLexeme + lexeme;
    }

    private void printError(){
        if(line != -1 && column != -1){
            principalFrame.printError("Error Lexico -> Lexema ["+errorLexeme+"] no reconocido. Linea: "+line+" Columna: "+column + "\n");
            errorLexeme = "";
            line = -1;
            column = -1;
        }
    }

%}
%%//

/* 
----------------------------------- Reglas Lexicas ----------------------------------- 
*/
<YYINITIAL>{
    "1"              { printToken("NUM"); printError(); return symbol(sym.NUM, Double.parseDouble(yytext())); }
    "0"              { printToken("NUM"); printError(); return symbol(sym.NUM, Double.parseDouble(yytext())); }
    "."              { printToken("FULLSTOP"); printError(); return symbol(sym.FULLSTOP, yytext()); }   
    {WhiteSpace}     { printError(); } //Ignore
     .               { printToken("ERROR"); createErrorLexeme(new String(yytext()), (yyline+1), yycolumn); } 
}

