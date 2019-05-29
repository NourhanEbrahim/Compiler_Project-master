package Translation.TranslatorClasses;
import gen.*;
import Translation.TranslateAndError.Translator;
import org.antlr.v4.runtime.tree.ParseTree;


public class BlockTranslator extends Translator {

    ParseTree parseTree;
    public BlockTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.BlockContext.class);
        parseTree =parsetree;
    }

    @Override
    public String generate() {
        String res="";
        for (int i = 0; i < parseTree.getChildCount(); ++i) {
            ParseTree child = parseTree.getChild(i);
            if (child instanceof COOLParser.StmtContext) {

                 res = new stmtTranslator(child).generate();
            }
        }
        return res;
    }


}
