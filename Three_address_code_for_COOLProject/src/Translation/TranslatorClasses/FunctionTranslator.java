package Translation.TranslatorClasses;
import gen.*;
import Translation.*;
import Translation.Environment.ScopeHandler;
import Translation.TranslateAndError.TranslationHandler;
import Translation.TranslateAndError.Translator;
import org.antlr.v4.runtime.tree.ParseTree;

public class FunctionTranslator extends Translator {
    ParseTree parseTree;

    public FunctionTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.FunctionContext.class);
        parseTree =parsetree;
    }

    @Override
    public String generate() {

        space = "\t\t";
        // create a scope for this function
        ScopeHandler.pushScope();
        
        // generate param list
         param_num=0;
        this.generateParam(parseTree);
        
        // set a reference for the function in current scope
       String type = this.generateFeatureLabel(parseTree);

        // generate feature body

        String ret = this.generateFunctionBody(parseTree);

        if (ret != null && !(type.contains("VOID"))) {
            TranslationHandler.write(String.format("%sreturn %s", space,ret));
        }

        space ="";

        ScopeHandler.popScope();

        return null;
    }


    private String generateFunctionBody(ParseTree fun) {
        String bodyRes = null;

        for (int i = 0; i < fun.getChildCount(); i++) {
            ParseTree child = fun.getChild(i);
            if (child instanceof COOLParser.StmtContext) {
                bodyRes = new stmtTranslator(child).generate();

            }

        }

        return bodyRes;
    }

    private String generateFeatureLabel(ParseTree fun) {
        // read function name from first node
        String featureName = fun.getChild(0).getText();

        // the position of type depends on the presence or absence of param list so we first check for it.
        String featureType;
        if (fun.getChild(2) instanceof COOLParser.ParamContext) {
            featureType = fun.getChild(5).getText();
        } else {
            featureType = fun.getChild(4).getText();
        }
        Token featureRef = new Token(featureName, featureType);
        ScopeHandler.addToken(featureRef);
        
        TranslationHandler.write(String.format("%s:", featureRef.name));

        return  featureType;
    }

    private void generateParam(ParseTree fun) {
        for (int i = 0; i < fun.getChildCount(); ++i) {
            ParseTree child = fun.getChild(i);
            if (child instanceof COOLParser.ParamContext) {

                String formalsListTemp = new ParamTranslator(child).generate();
                param_list.clear();

                return;
            }
        }
    }
}
