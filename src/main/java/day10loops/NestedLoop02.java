package day10loops;

import java.util.Scanner;

public class NestedLoop02 {

    public static void main(String[] args) {

/*
   3.Example: Type code to get the output like
               1
               1 2
               1 2 3
               1 2 3 4
               1 2 3 4 5
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int numOfRows = input.nextInt();

        for (int i=1; i<=numOfRows; i++){

            for (int k=1; k<=i; k++){

                System.out.println(k);
            }
            System.out.println();
        }

        input.close();



    }

}
