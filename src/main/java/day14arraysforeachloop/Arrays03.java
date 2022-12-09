package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        // Example 1: Type code to check if a specific element exists in an Array or not

         String str[] = {"Ali","Tom","Carl","Angie"};

         // 1.Way:
        String name = "Ali";

        int counter=0;

        for (String w: str){

            if (w.equals("Ali")){
                counter++;
            }
        }
        if (counter>0){
            System.out.println(name+ " is exist");
        }else{
            System.out.println(name+ " is not exist");
        }

        // 2. Way by using binerySearch() method

        //  i)If the element exists binarySearch() method returns the index of the element

        Arrays.sort(str);  // ["Ali", "Angie", "Carl", "Tom"]

        int idx = Arrays.binarySearch(str, "Carl");

        System.out.println(idx);//If the index is zero or more, it means the element exists

        int idxMiami = Arrays.binarySearch(str, "Miami");

        System.out.println(idxMiami);  // -4 ==> "-" means does not exist.

        //  "4" means if it exists it would be 4th element








    }
}
