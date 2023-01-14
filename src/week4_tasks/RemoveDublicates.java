package week4_tasks;

public class RemoveDublicates {

    public static void main(String[] args) {

        System.out.println( removeDublicates( "AAABBBCCC" ) );

    }

    public static String removeDublicates(String str) {


        String result="";
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt( i );
            if(!result.contains( ch+"" )){
                result+=ch;
        }
    }
            return result;


    }



}
