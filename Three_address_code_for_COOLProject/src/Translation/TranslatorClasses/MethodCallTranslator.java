package Translation.TranslatorClasses;
import gen.*;
import Translation.Environment.ScopeHandler;
import Translation.Token;
import Translation.TranslateAndError.TranslationHandler;
import Translation.TranslateAndError.Translator;
import org.antlr.v4.runtime.tree.ParseTree;

public class MethodCallTranslator extends Translator {
    ParseTree parseTree;


    public MethodCallTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.MethodCallContext.class);
        parseTree = parsetree;
    }

    @Override
    public String generate() {

        param_num=0;
        String call;

        methodCall = parseTree.getChild(0).getText() + ".";
        call = new MethodOwnCallTranslator(parseTree.getChild(2)).generate();
        methodCall="";
        return call;
    }


}
