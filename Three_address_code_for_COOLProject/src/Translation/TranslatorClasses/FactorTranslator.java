package Translation.TranslatorClasses;
import Translation.*;
import gen.*;
import Translation.TranslateAndError.*;
import org.antlr.v4.runtime.tree.ParseTree;


public class FactorTranslator  extends Translator {

    ParseTree parseTree;

    public FactorTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.FactorContext.class);
        parseTree = parsetree;
    }

    public String generate() {

        if (parseTree.getChildCount() == 1) {
            return new ExprTranslator(parseTree.getChild(0)).generate();
        }

        String termString = new FactorTranslator(parseTree.getChild(0)).generate();

        String valueString = new ExprTranslator(parseTree.getChild(2)).generate();

        Temp myRes = new Temp();

        TranslationHandler.write(
                String.format(
                        "%s%s = %s %s %s\t",
                        space,
                        myRes,
                        termString,
                        parseTree.getChild(1).getText(),
                        valueString
                )
        );

        return myRes.toString();

    }
    }


