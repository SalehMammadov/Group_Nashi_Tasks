package week1_tasks;

public class Division {
    public static void main(String[] args) {

        division(0,2);
    }

    public static void division(int a, int b) {

      int subtractCounter=0;

        if(a<0){
            a=-a;
        }
        if (b<0){
            b=-b;
        }
        for (int i = a; i > 0; i=i-b) {
            if(b==0){
               throw new RuntimeException("Number can not be divided by zero");
            }
            if((i-b)>=0){
                subtractCounter++; // 5 times
            }
        }
        System.out.println(a+" divided by "+b+" equals "+subtractCounter);

    }
}
/*
    for example:
    a=10 , b=2
    10-2=8
    8-2=6
    6-2=4   number of subtraction until result become less than diviser
    4-2=2    number of subtraction=5
    2-2=0

 */