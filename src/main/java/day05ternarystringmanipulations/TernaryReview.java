package day05ternarystringmanipulations;

import java.util.Scanner;

public class TernaryReview {

    public static void main(String[] args) {

        // Soru 1:

        //Type a program to print the minimum of 2 doubles on the console. Use ternary...

        double d1=3, d2=3;
        double r= d1>d2 ? d2 : d1;  //":" means "else"
        System.out.println(r);


        // Soru 2:

        //Type code to calculate the absolute value of a number. ask the number from user.
        //For positive numbers and zero absolute value is the same with the number
        //For negative numbers to find absolute value multiply the number by -1

        Scanner input = new Scanner(System.in);
        System.out.println("please enter an integer");
        int i = input.nextInt();

        int result = i<0 ? i*-1 : i;
        System.out.println(result);

        input.close();





    }
}
