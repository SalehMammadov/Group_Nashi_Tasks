package week3_tasks;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        isArmstrongNumber(153); // 1x1x1+5x5x5+3x3x3=153
        isArmstrongNumber(255);
        isArmstrongNumber(1634);
        isArmstrongNumber(371);
        isArmstrongNumber(7);

    }

    public static void isArmstrongNumber(int number) {
        int sum = 0;
        String anString = "" + number;
        for (int i = 0; i < anString.length(); i++) {
            String eachDigits = "" + anString.charAt( i ); // 1 , 5 , 3
            int charPower = anString.length();

        sum += Math.pow( Integer.parseInt( eachDigits ), charPower );

        }
        if (number == sum) {
            System.out.println(number+" is Armstrong Number");
        }else{
            System.out.println(number+" is Not Armstrong Number" );
        }
    }
}
