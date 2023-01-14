package week2_tasks;

public class SwapTwoVariables {

    public static void main(String[] args) {

        int a = 20;

        int b = 10;

        // expected result a=10 , b=20;

        a+=b; // a=30
        b=a-b; // b=20
        a-=b;  // a=10

        System.out.println( "a = " + a );
        System.out.println( "b = " + b );


    }
}