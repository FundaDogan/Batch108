package day13arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Review {

    public static void main(String[] args) {

        String names[] = new String[3];
        names[0]= "tom";
        names[2]= "Jim";

        System.out.println(Arrays.toString(names));

        //Example 1: Create an integer array and print the sum of the first and the last elements on the console
        int nums[] = new int[4];
        nums[0]=3;
        nums[3]=2;
        int sum =0;
        System.out.println(nums[0]+nums[nums.length-1]);

//Example 2: Create a double array and find the sum of all elements in the array
//          [1.2, 2.3, 5.0, 4.51] ==> 13.01

        double prices[] = new double[4];

        double sum1=0;

        prices[0]=1.2;
        prices[1]=2.3;
        prices[2]=5.0;
        prices[3]=4.51;

        for (double w: prices){
            sum1 = sum1+w;
        }
        System.out.println(sum1);

        // Create a String array and print the elements in alphabetical order on the console in different lines

        String cities[] = new String[3];

        cities[0]="burdur";
        cities[1]="van";
        cities[2]="agri";

        Arrays.sort(cities);

        for (String w: cities){
            System.out.println(w);
        }

        // Create a string array and print the elements whose length is less than 5
        System.out.println();

        for (String w: cities){
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
        } // code larin yerlerinin degismesi sonucu degistiriyor

        System.out.println();

        // Example 5 : Create a String Array and print the elements different from "Tom

        for (String w: students){
            if (!w.equals("Tom")){
                System.out.println(w);
            }
        }
        System.out.println();


        for (String w: students){
            if (w.equals("Tom")){
                continue;
            }
            System.out.print(w+" ");
        }

        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number of students");
        int numOfStd = input.nextInt();

        String names1[] = new String[numOfStd];

        for (int i =0; i<names1.length; i++){

            System.out.println("enter "+ (i+1)+". student name");
            String stdName = input.next();
            names1[i]= stdName;

        }

        System.out.println(Arrays.toString(names1));



    }
}
