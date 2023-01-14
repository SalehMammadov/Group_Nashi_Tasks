package week4_tasks;

public class FrequencyOfChars {

    public static void main(String[] args) {

        System.out.println( FrequencyOfChars( "AAABBCDD" ) );
        System.out.println( FrequencyOfChars( "AAAABBCDDD" ) );

    }


    public static String FrequencyOfChars(String str){

        String result="";

        for (int i = 0; i <str.length() ; i++) {
            int frequency=0;
            char ch=str.charAt( i );
            for (int j = 0; j <str.length() ; j++) {
                if(ch==str.charAt(j)){
                    frequency++;
                }
            }
                if(!result.contains(ch+"")){
                    result+=ch+""+frequency;
            }
        }
            return result;
    }

}
