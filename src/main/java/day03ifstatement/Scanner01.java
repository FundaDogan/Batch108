package day03ifstatement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Example 1:Get first, middle, last names, and the SSN from the user then print them like the given format
//          Tom Jim Hanks
//          234567891

        Scanner input = new Scanner(System.in);
        System.out.println("enter your first,middle,last names and SSN");
        String fn = input.next();
        String mn = input.next();
        String ln = input.next();
        int n = input.nextInt();

        System.out.println(fn+" " + mn + " " + ln);
        System.out.println(n);

        input.close();
    }
}
