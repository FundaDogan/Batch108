package day13arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {

    public static void main(String[] args) {

        // Example 1: Let user enter student names into the application
        // (Create an Array together with the user)

        Scanner input = new Scanner(System.in);

        // 1. step: Create an Array

        System.out.println("Enter the number of students you want to enter");
        int numOfStd = input.nextInt();  // user give a num and it is assigned in numOfStd variable

        String names[] = new String[numOfStd];  //  ogrenci sayisi kullanilarak aary olusturduk.

        System.out.println(Arrays.toString(names));


        // 2. step: Insert the elements into the Array

        for (int i =0; i<numOfStd;i++){

            System.out.println("enter the" + (i+1)+ ". student name");
            String stdName = input.next();

            if (!stdName.equalsIgnoreCase("q")){
                names[i]= stdName;
            }else{
                break;
            }
        }
        System.out.println(Arrays.toString(names));






    }
}
