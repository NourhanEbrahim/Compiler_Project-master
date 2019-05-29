package Translation.TranslateAndError;

import Translation.TranslatorClasses.FeatureTranslator;
import org.antlr.v4.runtime.tree.ParseTree;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


@SuppressWarnings("unused")
public class TranslationHandler {
    private static BufferedWriter output_stream = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int newLabel = 0;
    private static int indentations = 0;

    public static void translate(ParseTree tree) {
        new FeatureTranslator(tree).generate();

        try {
            output_stream.flush();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }


    public static void write(String text) {


        try{
            output_stream.write(String.format("%s\n", text));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void setStream(OutputStream s){
        output_stream = new BufferedWriter(new OutputStreamWriter(s));
    }


    public static String getNewLabel() {
        newLabel++;
        return "L" + (newLabel - 1);
    }


}
