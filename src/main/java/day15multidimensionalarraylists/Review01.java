package day15multidimensionalarraylists;

import java.util.Arrays;

public class Review01 {

    public static void main(String[] args) {

        int arr[][] = new int[2][2];  // [
        System.out.println(Arrays.deepToString(arr));
        arr[0][0]= 3;
        arr[0][1]= 4;
        arr[1][0]= 2;
        arr[1][1]= 5;

        System.out.println(Arrays.deepToString(arr));

        int brr[][] = {{2,1}, {3}, {4,5,6}};

        System.out.println(Arrays.toString(brr[0]));
        System.out.println(Arrays.toString(brr[1]));
        System.out.println(Arrays.toString(brr[2]));

        System.out.println(brr[0][0]);
        System.out.println(brr[2][1]);

        // Example 1: Type code to find the num of elements in a multidimensional array.

        String crr[][] = {{"Tom","Jim"}, {"Angie"}, {"Carl","Chris","Ali"}};

        int numOfElements=0;

        for (String[] w: crr){
            numOfElements = numOfElements + w.length;
        }
        System.out.println(numOfElements);

        System.out.println();

        //Example 2: Print the elements which have “a” from a 2 dimensional String array.
        //        { {“learn”, “java”, “it”}, {“is”, “easy”} }

        String drr[][] = {{"learn", "java", "it"}, {"is", "easy"}};

        for (String[] w: drr){

            for (String u: w){

                if (u.contains("a")){
                    System.out.print(u+ " ");
                }
            }
        }

        System.out.println();

        //Example 3: Create an integer multidimensional array then find the sum of the elements

        int err[][]= {{12,54}, {3,2,7}, {21}};

        int sum =0;

        for (int[] w:err){

            for (int u:w){

                sum = sum +u;
            }
        }
        System.out.println(sum);

        System.out.println();







    }
}
