package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Arrays02 {

    public static void main(String[] args) {

        // Example 1: 09/29/2022 is given, print the date like "Month: 09  Day:20   Year: 2022"

        String date = "09/29/2022";  // bir string split edilirse ortaya array cikar.


        String dateArray[] = date.split("/");   // Split() method returns Array

        System.out.println(Arrays.toString(dateArray)); // [09, 29, 2022]

        System.out.println("Month: " + dateArray[0]);
        System.out.println("Day: " + dateArray[1]);
        System.out.println("Year: "+ dateArray[2]);

        // Note ctrl+splitin ustune gidince aciklama cikiyor

        //1)Get string from user and type code to find the number of words in a String.
        //  user give  " I like to move it, move it " .


        Scanner input = new Scanner(System.in);
        System.out.println("please enter a sentence");
        String str = input.nextLine();

        String arr[] = str.split(" ");
        System.out.println("the number of the words is" + arr.length);

        // count the number of words starts with "a" in the string

        int count=0;  // This is called "flag"

        for (String w:arr){

            if (w.startsWith("a")){
                count++;
            }
        }
        System.out.println(count);

        //Example 4: Type code to find the longest word in the sentence

       String s = "I want to go to university to learn more";

       String words[] = s.split(" ");

       // I will put the elements ascending order according to their length

        Arrays.sort(words, Comparator.comparingInt(String::length));

        System.out.println(words[words.length-1]);



    }
}
