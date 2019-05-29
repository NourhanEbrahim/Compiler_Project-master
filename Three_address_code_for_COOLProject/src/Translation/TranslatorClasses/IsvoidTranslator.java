package Translation.TranslatorClasses;
import Translation.Temp;
import Translation.TranslateAndError.TranslationHandler;
import gen.*;
import Translation.Environment.ScopeHandler;
import Translation.TranslateAndError.Translator;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.ST;

public class IsvoidTranslator extends Translator {
    ParseTree parseTree;

    public IsvoidTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.IsvoidExprContext.class);
        parseTree = parsetree;
    }


    @Override
    public String generate() {
        String child = new stmtTranslator(parseTree.getChild(1)).generate();
        Temp myTemp = new Temp();
        TranslationHandler.write(space + myTemp.toString() + " = ISVOID " + child);
        return myTemp.toString();

    }

}