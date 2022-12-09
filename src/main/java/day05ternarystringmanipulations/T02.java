package day05ternarystringmanipulations;

import java.util.Scanner;

public class T02 {

    public static void main(String[] args) {

        // ask user to enter 2 int num and type a program to print the minimum of 2 integers.

        Scanner input = new Scanner(System.in);
        System.out.println("please enter 2 integers");
        int i1 = input.nextInt();
        int i2 = input.nextInt();

        // ternary ile ekrana, eger 1. sayi kucukse onu, degilse digerini yazdir diyecegiz.

        int result = i1<i2 ? i1 : i2;
        System.out.println(result);

        input.close();






    }
}
