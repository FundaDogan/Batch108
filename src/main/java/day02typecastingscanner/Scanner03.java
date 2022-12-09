package day02typecastingscanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the width,length,height");
        double w = input.nextDouble();
        double l = input.nextDouble();
        double h = input.nextDouble();

        System.out.println("total area is " + (2*w*l+2*w*h+2*l*h));


    }
}
