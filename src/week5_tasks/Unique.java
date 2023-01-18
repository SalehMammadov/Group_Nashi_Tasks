package week5_tasks;

public class Unique {
    public static void main(String[] args) {


        System.out.println( uniqueCharacter( "AAABBBCCCDEF" ) );
    }

    public static String uniqueCharacter(String str) {
        String unique="";

        for (int i = 0; i <str.length() ; i++) {
            int frequency=0;
            char ch=str.charAt( i );
            for (int j = 0; j <str.length() ; j++) {
                if(ch==str.charAt(j)){
                    frequency++;
                }
            }
              if(frequency==1){
                  unique+=ch;
            }

        }
                return unique;
    }
}