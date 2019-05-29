package Translation.TranslatorClasses;
import gen.*;
import Translation.Environment.ScopeHandler;
import Translation.TranslateAndError.Translator;
import org.antlr.v4.runtime.tree.ParseTree;


public class FeatureTranslator extends Translator {
    ParseTree parseTree;
    public FeatureTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.FeatureContext.class);
        parseTree =parsetree;
    }

    @Override
    public String generate() {
        ScopeHandler.pushScope();

        for (int i = 0; i < parseTree.getChildCount(); ++i) {

            ParseTree child = parseTree.getChild(i);
            if (child instanceof COOLParser.DeclContext) {

                String temp = new DeclTranslator(child).generate();


            }

            if (child instanceof COOLParser.FunctionContext) {

                String temp = new FunctionTranslator(child).generate();


            }



        }

        ScopeHandler.popScope();
        return null;
    }
}