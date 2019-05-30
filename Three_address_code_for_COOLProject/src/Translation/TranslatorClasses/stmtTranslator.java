package Translation.TranslatorClasses;
import Translation.*;
import gen.*;
import Translation.TranslateAndError.*;
import org.antlr.v4.runtime.tree.ParseTree;

//stmt (ADD|MINUS|LESS_THAN|LESS_EQUAL|EQUAL) factor| factor
public class stmtTranslator  extends Translator {

    ParseTree parseTree;
    //ensure that the child of parsetree is stmt
    public stmtTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.StmtContext.class);
        parseTree = parsetree;
    }

    // generate 3address code for stmt
    public String generate() {
        if (parseTree.getChildCount() == 1) {
            return new FactorTranslator(parseTree.getChild(0)).generate();
        }

        String exprString = new stmtTranslator(parseTree.getChild(0)).generate();
        String termString = new FactorTranslator(parseTree.getChild(2)).generate();
        Temp myRes = new Temp();

        // assign expression's value into variable
        TranslationHandler.write(
                String.format(
                        "%s%s = %s %s %s\t",
                        space,
                        myRes,
                        exprString,
                        parseTree.getChild(1).getText(),
                        termString
                )
        );

        return myRes.toString();
    }
    }

