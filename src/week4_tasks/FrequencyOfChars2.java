package week4_tasks;

import java.util.*;

public class FrequencyOfChars2 {

    public static void main(String[] args) {

        System.out.println( FrequencyOfChars2( "AAABBCDD" ) );

    }

    public static Set<String> FrequencyOfChars2(String str) {

        Set<String>setOfChars=new TreeSet<>();
        for (String each : str.split( "" )) {

        int frequency=Collections.frequency( Arrays.asList( str.split( "" ) ),each );
           setOfChars.add( each+""+frequency);
        }
          return setOfChars;

        /*
         String result="";

        for (String each : str.split( "" )) {

        int frequency=Collections.frequency( Arrays.asList( str.split( "" ) ),each );

            if(!result.contains( ""+each ))
            result+=each+""+frequency;
        }

        return result;
         */



    }
}