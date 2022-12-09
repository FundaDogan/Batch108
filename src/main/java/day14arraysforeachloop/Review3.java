package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Review3 {
    public static void main(String[] args) {

        //Example 4: Type code to find the longest word in the sentence

        String s = "I want to go to university to learn more";

        String arr[] = s.split(" ");
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(arr[0]);// shortest word
        System.out.println(arr[arr.length-1]); // longest word.


        // Example 1: Type code to check if a specific element exists in an Array or not

        int counter=0;

        String s1= "go";

        for (String w: arr){

            if (w.equals("go")){
                counter++;
            }

        }
            if (counter>0){
                System.out.println(s1+ " is exist");
            }else {
                System.out.println(s1+ " is not exist");
            }



    }
}
