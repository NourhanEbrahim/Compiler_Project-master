
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class ParserTest {
    public static void main(String[] args) throws Exception{


        Scanner read = new Scanner(System.in);
        System.out.println("Enter file name");
        String inputFile = read.next()+".txt";
        CharStream input = CharStreams.fromFileName(inputFile);

        COOLParserLexer lexer = new COOLParserLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        COOLParserParser parser = new COOLParserParser(tokens);

        COOLParserParser.ProgramContext tree = parser.program();   // begin parsing from program
       String out = tree.toStringTree(parser);


        PrintWriter w = new PrintWriter("out.txt", "UTF-8");
        w.println(out);
        w.close();


    }
}

// ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
//parseTreeWalker.walk(new COOLParserBaseListener(), tree);