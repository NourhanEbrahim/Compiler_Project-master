package Translation.TranslatorClasses;
import Translation.Temp;
import Translation.TranslateAndError.TranslationHandler;
import gen.*;
import Translation.Environment.ScopeHandler;
import Translation.TranslateAndError.Translator;
import gen.COOLParser;
import org.antlr.v4.runtime.tree.ParseTree;

//INTEGER_NEGATIVE stmt
public class NegativeTranslator extends Translator {
    ParseTree parseTree;
    //ensure that child of expression is Negative
    public NegativeTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.NegativeExprContext.class);
        parseTree =parsetree;
    }

    //generate 3address code for negative
    @Override
    public String generate() {
        String childTemp = new stmtTranslator(parseTree.getChild(1)).generate();
        Temp temp = new Temp();
        // assign expression's value into variable
        TranslationHandler.write(space + temp.toString() + " = ~ " + childTemp.toString());
        return temp.toString();
    }
}
