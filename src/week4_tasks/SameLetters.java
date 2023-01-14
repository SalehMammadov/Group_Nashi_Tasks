package week4_tasks;

import java.util.Arrays;
import java.util.Collections;

public class SameLetters {

    public static void main(String[] args) {

        System.out.println( sameLetters( "abc", "cab" ) );
        System.out.println( sameLetters( "abc", "abb" ) );
    }

    public static boolean sameLetters(String a, String b) {

        String[] arr1 = a.split( "" );
        Collections.sort( Arrays.asList(arr1));

        String[] arr2 = b.split( "" );
        Collections.sort( Arrays.asList(arr2));

        if(Arrays.equals(arr1,arr2 )){
            return true;
        }
            return false;
    }
}
