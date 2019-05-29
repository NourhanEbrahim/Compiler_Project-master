package Translation.TranslatorClasses;
import Translation.Temp;
import Translation.TranslateAndError.TranslationHandler;
import gen.*;
import Translation.Environment.ScopeHandler;
import Translation.TranslateAndError.Translator;
import gen.COOLParser;
import org.antlr.v4.runtime.tree.ParseTree;

public class NegativeTranslator extends Translator {
    ParseTree parseTree;
    public NegativeTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.NegativeExprContext.class);
        parseTree =parsetree;
    }

    @Override
    public String generate() {
        String childTemp = new stmtTranslator(parseTree.getChild(1)).generate();
        Temp temp = new Temp();
        TranslationHandler.write(space + temp.toString() + " = ~ " + childTemp.toString());
        return temp.toString();
    }
}