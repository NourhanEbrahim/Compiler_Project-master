package Translation.TranslatorClasses;
import gen.*;
import Translation.TranslateAndError.Translator;
import org.antlr.v4.runtime.tree.ParseTree;


// formalsList: formalsList COMMA formal | formal;
public class ListTranslator extends Translator {
    ParseTree parseTree ;
    public ListTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.ListContext.class);
        parseTree = parsetree;
    }

    @Override
    public String generate() {
        if(parseTree.getChildCount() == 1){
            param_num ++;
            String param = new stmtTranslator(parseTree.getChild(0)).generate();
            param_list.add(param);

        }else{

            new ListTranslator(parseTree.getChild(0)).generate();

            String param = new stmtTranslator(parseTree.getChild(2)).generate();
            param_num ++;
            param_list.add(param);

        }

        return null;
    }
}