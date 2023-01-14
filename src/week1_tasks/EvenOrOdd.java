package week1_tasks;

public class EvenOrOdd {
    public static void main(String[] args) {

        identify( 5 ); //Odd
        identify( 6 ); //Even

    }
    public static void identify(int number) {
        if(number%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
