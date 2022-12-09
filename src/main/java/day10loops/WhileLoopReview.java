package day10loops;

import java.util.Scanner;

public class WhileLoopReview {
    public static void main(String[] args) {

        //4.Example: Type java code by using while loop,
        //           Write a program that prompts the user to input an integer.
        //           It should then find the sum of the digits of that number.
        //           123 ==> 1+2+3 = 6

        Scanner input = new Scanner(System.in);
        System.out.println("please, enter an integer");
        int num = input.nextInt();

        int sum =0;

        num = Math.abs(num);

        while (num>0){

            sum = sum+num%10;

            num/=10;

        }
        System.out.println(sum);


             /*
        Example 5: Type java code by using while loop,
         Write a program that prompts the user to input a number.
       it should then print the multiplication table of that number.

        3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30
        */

        System.out.println("enter an integer to see multiplication table on the console");

        int n = input.nextInt();

        int i=0;
        while (i<11){
            System.out.println(n+"x"+i+"="+n*i);

            i++;
        }







    }
}
