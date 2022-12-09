package day02typecastingscanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age");
        int age = input.nextInt();

        System.out.println(age);

        System.out.println("enter your name");
        String name = input.next();
        System.out.println(name);





    }

}
