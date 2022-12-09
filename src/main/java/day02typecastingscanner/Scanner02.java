package day02typecastingscanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the width");
        double width= input.nextDouble();

        System.out.println("enter the length");
        double length = input.nextDouble();

        System.out.println("Area is " + width*length);



    }




}
