package day14arraysforeachloop;

import java.util.Scanner;

public class Review2 {
    public static void main(String[] args) {

        // Example 1: 09/29/2022 is given, print the date like "Month: 09  Day:20   Year: 2022"

        String s= "09/29/2022";
        String arr[]= s.split("/");   // [09, 29, 2022]

        System.out.println("Month: " + arr[0]);
        System.out.println("Day: "+ arr[1]);
        System.out.println("Year: "+ arr[2]);

        //1)Get string from user and type code to find the number of words in a String.
        //  user give  " I like to move it, move it " .

        Scanner input = new Scanner(System.in);
        System.out.println("please, enter a sentence");
        String str = input.nextLine();

        String brr[] = str.split(" ");
        System.out.println(brr.length);


        // count the number of words starts with "a" in the string

        String s1 = "Ayse ali akijk aksksk cunku bos bisey okul";

        String crr[]= s1.split(" ");

        int counter=0;

        for (String w: crr){

            if (w.startsWith("a")){
                counter++;
            }

        }
        System.out.println(counter);



    }
}
