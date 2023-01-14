package week1_tasks;

public class FINRA {
    public static void main(String[] args) {

        wordInsteadNumber();
    }
       public static void wordInsteadNumber() {
            // looping numbers from 1-->30
           for (int i = 1; i <=30 ; i++) {
               if(i%3==0 || i%5==0) { //pre-condition nested if
                   if (i % 3 == 0 && i % 5 == 0) { //numbers divides 3 and 5
                       System.out.println( "FINRA"+"-"+i );
                   }else if (i % 5 == 0) { //numbers only divided by 5
                       System.out.println("RA"+"-"+i);
                   }else{
                       System.out.println("FIN"+"-"+i); //numbers only divided by 3
                   }
               }else{ //nested if ends
               }
           } //for loop ends
    }
}
