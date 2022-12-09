package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {

    public static void main(String[] args) {

        String str = "Ali is 13 years old, I like Ali, Ali does not like me!...";

        // Example 1: How many marks are used in the given String?

       // 1. Way

        int i = str.replaceAll("\\P{Punct}","").length();
        System.out.println(i);

        // 2. Way

        int numOfAllChars = str.length();

        int numOfAllCharsDiffFromPunctuationMarks = str.replaceAll("\\p{Punct}","").length();

        System.out.println(numOfAllChars-numOfAllCharsDiffFromPunctuationMarks); //6

        // TRIM method

        // Example 2: Ask user to enter his full name and fix if teh user enters space at the beginning and at the end

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first and the last name");
        String fullName = input.nextLine();

        System.out.println(fullName);

        String fixedFullName = fullName.trim();
        // trim method removes spaces from the beginning and from the end, doesn't remove any spaces in the middle

        System.out.println(fixedFullName);














    }
}
