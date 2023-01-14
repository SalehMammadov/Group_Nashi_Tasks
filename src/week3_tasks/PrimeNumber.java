package week3_tasks;

public class PrimeNumber {
    public static void main(String[] args) {

        isPrime(2);

    }

    private static void isPrime(int n) {

        if(n<=1){
            System.out.println("Number can not be prime");
            return;
        }
        int count=0;
        for (int i = 1; i<=n; i++) {
          if(n%i==0){
             count++; // n=11 , 1,11 , count=2
          }
        }
        if(count>2){
            System.out.println(n+ " is not prime number");
        }else{
            System.out.println(n+" is prime number");
        }
    }
}
