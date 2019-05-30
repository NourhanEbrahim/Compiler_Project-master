package Translation.TranslatorClasses;
import gen.*;
import Translation.TranslateAndError.Translator;
import org.antlr.v4.runtime.tree.ParseTree;

//list ',' stmt | stmt
public class ListTranslator extends Translator {
    ParseTree parseTree ;
    
    //check that the child of expression i list
    public ListTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.ListContext.class);
        parseTree = parsetree;
    }

    //generate 3address code for list
    @Override
    public String generate() {
        //check that it has one child
        if(parseTree.getChildCount() == 1){
            //add the param counter
            param_num ++;
            String param = new stmtTranslator(parseTree.getChild(0)).generate();
            param_list.add(param);

        }
        //it has 3 children
        else{
            new ListTranslator(parseTree.getChild(0)).generate();
            String param = new stmtTranslator(parseTree.getChild(2)).generate();
            param_num ++;
            param_list.add(param);

        }

        return null;
    }
}
