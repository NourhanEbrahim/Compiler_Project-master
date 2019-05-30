package Translation.TranslatorClasses;

import Translation.Environment.ScopeHandler;
import Translation.Temp;
import Translation.TranslateAndError.TranslationHandler;
import Translation.TranslateAndError.Translator;
import org.antlr.v4.runtime.tree.ParseTree;
import gen.COOLParser;

//IF stmt THEN stmt (ELSE stmt)? FI
public class ifStmtTranslator extends Translator {

    ParseTree parseTree;
    //ensure that the child of parsetree is ifstmt
    public ifStmtTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.IfStmtContext.class);
        parseTree =parsetree;
    }

    // generate 3address code for ifstmt
    @Override
    public String generate() {
        Temp res = new Temp();
        // push the scope of if
        ScopeHandler.pushScope();
        String elseLabel = TranslationHandler.getNewLabel();

        String child1 = new stmtTranslator(parseTree.getChild(1)).generate();
        // assign expression's value into variable
        TranslationHandler.write(
                String.format(
                        "%sIFFALSE %s GOTO %s",
                        space,
                        child1,
                         elseLabel));

        String child2 = new stmtTranslator(parseTree.getChild(3)).generate();
        TranslationHandler.write(
                String.format(
                        "%s%s = %s",
                        space,
                        res.toString(),
                        child2));

        //check that there is else
        if(parseTree.getChildCount() > 5) {
            String afterLabel = TranslationHandler.getNewLabel();
            TranslationHandler.write(
                    String.format(
                            "%sGOTO %s",
                            space,
                            afterLabel));
            TranslationHandler.write(
                    String.format(
                            "%s%s : ",
                            space,
                            elseLabel));
                    space +="\t\t";
            String child3 = new stmtTranslator(parseTree.getChild(5)).generate();
            TranslationHandler.write(
                    String.format(
                            "%s%s = %s",
                            space,
                            res.toString(),
                            child3));
            space = space.substring(0,space.length()-2);
            TranslationHandler.write(
                    String.format(
                            "%s%s : ",
                            space,
                            afterLabel));
            space+="\t\t";
        }
        else {
            TranslationHandler.write(
                    String.format("%s%s :",
                            space,
                            elseLabel));
            space += "\t\t";
        }
        ScopeHandler.popScope();

        return res.toString();
    }
}
