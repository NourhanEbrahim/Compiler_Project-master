package Translation.TranslatorClasses;
import gen.*;
import Translation.*;
import Translation.Environment.ScopeHandler;
import Translation.TranslateAndError.TranslationHandler;
import Translation.TranslateAndError.Translator;
import org.antlr.v4.runtime.tree.ParseTree;


public class WhileStmtTranslator extends Translator {

    ParseTree parseTree;

    public WhileStmtTranslator(ParseTree parsetree) {

        super(parsetree, COOLParser.WhileStmtContext.class);
        parseTree = parsetree;
    }



    @Override

    public String generate() {

        String label1= TranslationHandler.getNewLabel();
        String label2 =TranslationHandler.getNewLabel();

        TranslationHandler.write(
                String.format(
                        "%s%s : ",
                        space,
                        label1));
        space +="\t\t";
        String child1 = new stmtTranslator(parseTree.getChild(1)).generate();

        TranslationHandler.write( String.format(space + "IFFALSE " + child1 + " GOTO " + label2));

        String child2 = new stmtTranslator(parseTree.getChild(3)).generate();

        TranslationHandler.write( String.format(space +"GOTO " + label1));
        space = space.substring(0,space.length()-2);

        TranslationHandler.write(
                String.format(
                        "%s%s : ",
                        space,
                        label2));
        space +="\t\t";

        return child2;
    }

}