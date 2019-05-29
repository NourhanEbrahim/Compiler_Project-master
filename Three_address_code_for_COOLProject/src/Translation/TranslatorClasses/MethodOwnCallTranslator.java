package Translation.TranslatorClasses;
import gen.*;
import Translation.Environment.ScopeHandler;
import Translation.Temp;
import Translation.Token;
import Translation.TranslateAndError.TranslationHandler;
import Translation.TranslateAndError.Translator;
import gen.COOLParser;
import org.antlr.v4.runtime.tree.ParseTree;


public class MethodOwnCallTranslator extends Translator {
    ParseTree parseTree;

    public MethodOwnCallTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.MethodOwnCallContext.class);
        parseTree =parsetree;
    }

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


            if (param_num != 0) {

                res = "CALL_" + featureName + "(" + param_num + ")" ;
                TranslationHandler.write(
                        String.format("%s%s = %s%s",
                                space,
                                temp.toString(),
                                methodCall,
                                res));

            } else {
                res = "CALL_" + featureName + "()" ;
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

    private void generateParam(ParseTree fun) {
        for (int i = 0; i < fun.getChildCount(); ++i) {
            ParseTree child = fun.getChild(i);
            if (child instanceof COOLParser.ListContext) {

                String formalsListTemp = new ListTranslator(child).generate();

                //Iterator it = q.iterator();
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