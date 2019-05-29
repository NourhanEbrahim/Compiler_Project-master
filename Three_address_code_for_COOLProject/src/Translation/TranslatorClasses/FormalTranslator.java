package Translation.TranslatorClasses;
import gen.*;
import Translation.*;
import Translation.Environment.ScopeHandler;
import Translation.TranslateAndError.TranslationHandler;
import Translation.TranslateAndError.Translator;
import org.antlr.v4.runtime.tree.ParseTree;



// ID COLON (type|ID);
public class FormalTranslator extends Translator {

    public FormalTranslator(ParseTree parseTree) {
        super(parseTree, COOLParser.FormalContext.class);
    }

    @Override
    public String generate() {

        String variableName = parseTree.getChild(0).getText();
        if (parseTree.getChildCount() > 1) {
            String variableType = parseTree.getChild(2).getText();
            Token variableRef = new Token(variableName, variableType);
            ScopeHandler.addToken(variableRef);
        }
        else {

            Temp myRes = new Temp();

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