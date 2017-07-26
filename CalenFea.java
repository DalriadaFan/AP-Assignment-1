package calenfea;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
        
public class CalenFea {
    public static void main(String[] args) {
        Lexer prog = new Lexer();
        prog.Lex();
        prog.PrintTokens();
    }    
}
