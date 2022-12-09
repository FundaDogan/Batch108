package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        // [0, 2, 3, 0, 12, 0] put the zeros to the end
        //  [2, 3, 12, 0, 0, 0]

        int arr[] = {0, 2, 3, 0, 12, 0};

        int brr[] = new int[arr.length];

        int idx = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                brr[idx] = arr[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(arr));  // [0, 2, 3, 0, 12, 0]
        System.out.println(Arrays.toString(brr));  // [2, 3, 12, 0, 0, 0]

        // Example 2: Type code to check if a specific element exists in an array or not

        int crr[] = {-12, 23, 5};

        int counter = 0;
        int element = 23;  // kodu dinamic ypmak icin yazdi. sadece 23 u degistipip istenen sayiyi ararsin.
        // kodun icini dynamic yapmaya calis her zaman

        for (int w : crr) {

            if (w == 23) {
                counter++;
            }
        }

        if (counter > 0) {
            System.out.println("it is exist");

            // System.out.println("There are "+ counter + " times 23" );   ==> kac tane 23 var ders bunu yazarsin

        } else {
            System.out.println(" it doesn't exist");
        }


    }
}

