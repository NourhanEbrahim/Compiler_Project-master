package Translation.TranslatorClasses;
import gen.*;
import Translation.Environment.ScopeHandler;
import Translation.Temp;
import Translation.Token;
import Translation.TranslateAndError.TranslationHandler;
import Translation.TranslateAndError.Translator;
import gen.COOLParser;
import org.antlr.v4.runtime.tree.ParseTree;

//OBJECTID '(' list ')'
public class MethodOwnCallTranslator extends Translator {
    ParseTree parseTree;

    //ensure that child of expresion is methodOwncall
    public MethodOwnCallTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.MethodOwnCallContext.class);
        parseTree =parsetree;
    }

    //generate 3address code for methodOwncall
    @Override
    public String generate() {

        param_num=0;
        String call;
        this.generateParam(parseTree);

       call = this.generateFunctionCall(parseTree);


       return call;
    }


    private String generateFunctionCall(ParseTree fun) {
       String call ,res;
       Temp temp= new Temp();
        String featureName = fun.getChild(0).getText();

            //check that there is param
            if (param_num != 0) {
                res = "CALL_" + featureName + "(" + param_num + ")" ;
                // assign the value into variable
                TranslationHandler.write(
                        String.format("%s%s = %s%s",
                                space,
                                temp.toString(),
                                methodCall,
                                res));

            } 
        //there is no param
        else {
                res = "CALL_" + featureName + "()" ;
                // assign the value into variable
                TranslationHandler.write(
                        String.format("%s%s = %s%s",
                                space,
                                temp.toString(),
                                methodCall,
                                res));
            }
        call = temp.toString();
         return call;
    }

    //generate 3address code for each param in the function
    private void generateParam(ParseTree fun) {
        for (int i = 0; i < fun.getChildCount(); ++i) {
            ParseTree child = fun.getChild(i);
            if (child instanceof COOLParser.ListContext) {

                String formalsListTemp = new ListTranslator(child).generate();

                // assign the value into variable
                for(int j=0;j<param_num;j++) {
                    TranslationHandler.write(
                            String.format(
                                    "%sParam %s\t",
                                    space,
                                    param_list.remove()
                            )
                    );

                }
                return;
            }
        }
    }
}
