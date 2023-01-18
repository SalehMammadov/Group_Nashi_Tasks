package week5_tasks;

import java.util.Arrays;
import java.util.Collections;

public class Unique2 {

    public static void main(String[] args) {
        System.out.println( uniqueCharacter2( "abbbccccdeeef" ) );
    }

    public static String uniqueCharacter2(String str) {

        String unique="";
        for (String each : str.split( "" )) {
            int frequency=Collections.frequency( Arrays.asList( str.split( "" ) ), each );
            if(frequency==1){
               unique+=each;
           }
        }
            return unique;
    }
}
