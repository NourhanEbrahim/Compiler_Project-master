package Translation.TranslatorClasses;
import gen.*;
import Translation.TranslateAndError.Translator;
import org.antlr.v4.runtime.tree.ParseTree;

public class ParamTranslator extends Translator {
    ParseTree parseTree ;
    public ParamTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.ParamContext.class);
        parseTree = parsetree;
    }

    @Override
    public String generate() {
        if(parseTree.getChildCount() == 1){

            new FormalTranslator(parseTree.getChild(0)).generate();

        }else{

            new ParamTranslator(parseTree.getChild(0)).generate();

            new FormalTranslator(parseTree.getChild(2)).generate();


        }

        return null;
    }
}
