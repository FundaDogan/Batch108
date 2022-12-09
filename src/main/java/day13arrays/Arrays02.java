package day13arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

       // Create a String array and print the elements in alphabetical order on the console in different lines

        String cities[] = new String[5];

        cities[0]= "Tokyo";
        cities[1]= "Berlin";
        cities[2]= "Istanbul";
        cities[3]= "Jacksonville";
        cities[4]= " Calgary";

        System.out.println(Arrays.toString(cities));

        // how to put elements in alphabetical order
        Arrays.sort(cities);
        System.out.println(Arrays.toString(cities));

        for (String w: cities){
            System.out.println(w);
        }

        // Create a string array and print the elements whose length is less than 5

        //Note: To get the number of characters from a String use "length()"
        //      To get the number of elements from an Array use "length"


        // short way to create and add elements
        String names[] = {"Ali","Thomas","Mark","Jackson","Tom","Martin"};

        System.out.println(Arrays.toString(names));
        for (String w: names){

            if (w.length()<5){
                System.out.println(w);
            }
        }

        // Example 3: Create a string Array and print the element before "Tom"

        String students[] = {"Ali","Thomas","Mark","Jackson","Tom","Martin"};

        for (String w: students){

            if (w.equals("Tom")){
                break;
            }
            System.out.println(w);
        }

        System.out.println();

        // Example 3: Create a string Array and print the element before "Tom" and Tom

        for (String w: students){

            System.out.println(w);

            if (w.equals("Tom")){
                break;
            }

        }

        System.out.println();

        // Example 5 : Create a String Array and print the elements different from "Tom

        // 1. Way
        for (String w: students){

            if (!w.equalsIgnoreCase("Tom")){
                System.out.println(w);
            }
        }

        // 2.way

        for (String w: students){
            if (w.equals("Tom")) {
                continue;
            }
            System.out.println(w);
        }



    }
}
