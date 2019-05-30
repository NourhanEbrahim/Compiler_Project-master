package Translation.TranslatorClasses;
import gen.*;
import Translation.*;
import Translation.Environment.ScopeHandler;
import Translation.TranslateAndError.TranslationHandler;
import Translation.TranslateAndError.Translator;
import org.antlr.v4.runtime.tree.ParseTree;



//  OBJECTID (':' TYPEID)?
public class FormalTranslator extends Translator {

    //check that child of expression is formal
    public FormalTranslator(ParseTree parseTree) {
        super(parseTree, COOLParser.FormalContext.class);
    }

    //generate 3address code foe formal
    @Override
    public String generate() {

        String variableName = parseTree.getChild(0).getText();
        //check is there a typeId 
        if (parseTree.getChildCount() > 1) {
            String variableType = parseTree.getChild(2).getText();
            Token variableRef = new Token(variableName, variableType);
            ScopeHandler.addToken(variableRef);
        }
        else {

            Temp myRes = new Temp();

            // assign expression's value into variable
            TranslationHandler.write(
                    String.format(
                            "%s%s = %s\t",
                            space,
                            myRes,
                            variableName
                    )
            );

        }

        return null;
    }
}
