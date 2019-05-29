package Translation.TranslatorClasses;

import Translation.Environment.ScopeHandler;
import Translation.Temp;
import Translation.TranslateAndError.TranslationHandler;
import Translation.TranslateAndError.Translator;
import org.antlr.v4.runtime.tree.ParseTree;
import gen.COOLParser;
public class ifStmtTranslator extends Translator {

    ParseTree parseTree;

    public ifStmtTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.IfStmtContext.class);
        parseTree =parsetree;
    }

    @Override
    public String generate() {
        Temp res = new Temp();
        ScopeHandler.pushScope();
        String elseLabel = TranslationHandler.getNewLabel();


        String child1 = new stmtTranslator(parseTree.getChild(1)).generate();
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
