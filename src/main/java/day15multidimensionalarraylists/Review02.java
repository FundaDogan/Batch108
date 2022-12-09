package day15multidimensionalarraylists;

import java.util.Arrays;

public class Review02 {

    public static void main(String[] args) {

        //Example 1: Convert multidimensional array to one dimensional array
        //{ {"learn", "java", "it"}, {"is", "easy"} } ==> { "learn", "java", "it", "is", "easy" }

        String arr[][]= {{"learn", "java", "it"}, {"is", "easy"}};

        int numOfElements = 0;

        for (String[] w: arr){

            numOfElements = numOfElements + w.length;
        }
        System.out.println(numOfElements);

        String brr[] = new String[numOfElements];

        int idx= 0;

        for (String[] w: arr){

            for (String u: w ){

                brr[idx]=u;
                idx++;
            }
        }

        System.out.println(Arrays.toString(brr));


        //Example 1: Find the maximum element in a two-dimensional array
        //           { {5, 0}, {-2, 4}, {65, -12, 23} }

        int crr[][]={ {5, 0}, {-2, 4}, {65, -12, 23} };

        int max = crr[0][0];

        for (int[] w: crr){

            for (int u: w){

                if (max<u) {
                    max = u;
                }

            }
        }
        System.out.println(max);

        // 2. Way

        int drr[][]={ {9, 0}, {-2, 4}, {90, -12, 23} };

        int max1 = drr[0][0];

        for (int[] w: drr){

            for (int u: w){

                max1= Math.max(max1,u);
            }
        }
        System.out.println(max1);



    }
}
