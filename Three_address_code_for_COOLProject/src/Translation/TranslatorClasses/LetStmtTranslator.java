package Translation.TranslatorClasses;
import gen.*;
import Translation.Environment.ScopeHandler;
import Translation.Token;
import Translation.TranslateAndError.TranslationHandler;
import Translation.TranslateAndError.Translator;
import org.antlr.v4.runtime.tree.ParseTree;

//LET decl (',' decl ) * IN stmt
public class LetStmtTranslator extends Translator {
    ParseTree parseTree;

    //check that child of expression is let stmt
    public LetStmtTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.LetStmtContext.class);
        parseTree = parsetree;
    }

    //generate 3address code for let stmt
    @Override
    public String generate() {
        String exprString="";
        ScopeHandler.pushScope();

        //Let Declaration
        TranslationHandler.write(space + "Let :");
        space += "\t\t";
        for (int i = 0; i < parseTree.getChildCount(); ++i) {
            ParseTree child = parseTree.getChild(i);
            if (parseTree.getChild(i) instanceof COOLParser.DeclContext) {
                new DeclTranslator(child).generate();
            }

            if (parseTree.getChild(i) instanceof COOLParser.StmtContext) {
                TranslationHandler.write("");

                exprString = new stmtTranslator(child).generate();
                TranslationHandler.write("");
                //End Let Body
            }
        }
        space = space.substring(0,space.length()-2);

        //End Let
        ScopeHandler.popScope();

        return exprString;


    }
}
