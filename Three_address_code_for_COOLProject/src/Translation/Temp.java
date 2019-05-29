package Translation;

import java.util.HashSet;
import java.util.Set;

public class Temp {

    private static Set<Integer> taken = new HashSet<>();

    public static int index = -1;


    public Temp(){
        index++;
        taken.add(index);
    }


    @Override
    public String toString(){

        return String.format("t%d", index);

    }
}