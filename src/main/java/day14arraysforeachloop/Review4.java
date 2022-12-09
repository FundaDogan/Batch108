package day14arraysforeachloop;

import java.util.Arrays;

public class Review4 {
    public static void main(String[] args) {

        // Example 1: Type code to check if a specific element exists in an Array or not

        int arr[]={-3, 0,4,7};

        Arrays.sort(arr);

        int idx = Arrays.binarySearch(arr,4);
        System.out.println(idx);  // gives 2, means index num of 4

        int idx8 = Arrays.binarySearch(arr,8);

        System.out.println(idx8);

    }
}
