package week3_tasks;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        System.out.println( reverseNegative( -5867 ) );
    }

    public static int reverseNegative(int num) {

        String str = new StringBuilder( "" + num ).reverse().toString();
        if (num < 0) {
            str = "-" + str.substring( 0, str.length() - 1 );
        }
        return Integer.valueOf( str );

    }

}