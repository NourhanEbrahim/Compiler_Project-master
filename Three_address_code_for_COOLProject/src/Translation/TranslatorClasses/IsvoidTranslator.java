package Translation.TranslatorClasses;
import Translation.Temp;
import Translation.TranslateAndError.TranslationHandler;
import gen.*;
import Translation.Environment.ScopeHandler;
import Translation.TranslateAndError.Translator;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.ST;

//ISVOID stmt
public class IsvoidTranslator extends Translator {
    ParseTree parseTree;

    //check that child of expression is isvoid
    public IsvoidTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.IsvoidExprContext.class);
        parseTree = parsetree;
    }

    //generate 3address code for isvoid
    @Override
    public String generate() {
        //call stmt class 
        String child = new stmtTranslator(parseTree.getChild(1)).generate();
        Temp myTemp = new Temp();
       
        // assign expression's value into variable
        TranslationHandler.write(space + myTemp.toString() + " = ISVOID " + child);
        return myTemp.toString();

    }

}
