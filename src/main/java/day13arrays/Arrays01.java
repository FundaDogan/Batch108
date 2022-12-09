package day13arrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        String str = "Tom";

        String names[] = new String[5];
        System.out.println(Arrays.toString(names));

        names[1] ="Tom";
        names[4] = "Mark";
        names[0] = "Jim";
        names[2] = "Mary";
        names[3] = "Susan";
        System.out.println(Arrays.toString(names));

        System.out.println(names[3]);

        //Example 1: Create an integer array and print the sum of the first and the last elements on the console

       int ages[] = new int[7];

       ages[0] =12;
       ages[1] =23;
       ages[3] =10;
       ages[4] =43;
       ages[5] =19;
       ages[6] =60;
        System.out.println(ages[0]+ages[6]);
        System.out.println(ages[0]+ages[ages.length-1]); // all the time use this to make the code dynamic

        //Example 2: Create a double array and find the sum of all elements in the array
//          [1.2, 2.3, 5.0, 4.51] ==> 13.01

        double prices[] = new double[4];

        prices[0]=1.2;
        prices[1]=2.3;
        prices[2]=5.0;
        prices[3]=4.51;

        System.out.println(Arrays.toString(prices));

        //1.way
        double sum =0;

        for (int i =0; i<prices.length; i++){
            sum= sum + prices[i];

        }
        System.out.println(sum);

        //2.Way : we will solve the task by using for each loop
        // for each loop can be used with Arrays and collections

        double summy = 0;

        for (double w : prices){

            summy= summy + w;
        }
        System.out.println(summy);






    }
}
