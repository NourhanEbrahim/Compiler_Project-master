package Translation.TranslatorClasses;
import gen.*;
import Translation.TranslateAndError.Translator;
import org.antlr.v4.runtime.tree.ParseTree;

//param',' formal|formal
public class ParamTranslator extends Translator {
    ParseTree parseTree ;
    //ensure that the child of parsetree is param
    public ParamTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.ParamContext.class);
        parseTree = parsetree;
    }

    // generate 3address code for decl
    @Override
    public String generate() {
        //check that it has one child
        if(parseTree.getChildCount() == 1){

            new FormalTranslator(parseTree.getChild(0)).generate();

        }
        //has 3 children
        else{

            new ParamTranslator(parseTree.getChild(0)).generate();

            new FormalTranslator(parseTree.getChild(2)).generate();


        }

        return null;
    }
}
