package Translation.TranslatorClasses;
import Translation.Temp;
import Translation.TranslateAndError.TranslationHandler;
import gen.*;
import Translation.Environment.ScopeHandler;
import Translation.TranslateAndError.Translator;
import gen.COOLParser;
import org.antlr.v4.runtime.tree.ParseTree;

//NOT stmt
public class NotExprTranslator extends Translator {
    ParseTree parseTree;
    //ensure that the child of parsetree is Notexpr
    public NotExprTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.NotExprContext.class);
        parseTree =parsetree;
    }

    // generate 3address code for Notexpr
    @Override
    public String generate() {
        String childTemp = new stmtTranslator(parseTree.getChild(1)).generate();
        Temp temp = new Temp();
        // assign expression's value into variable
        TranslationHandler.write(space + temp.toString() + " = NOT " + childTemp.toString());
        return temp.toString();
    }
}
