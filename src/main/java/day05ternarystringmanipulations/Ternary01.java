package day05ternarystringmanipulations;

public class Ternary01 {

    // "ternary" does the same with "if else" by using more simple syntax.

    public static void main(String[] args) {

        //If an integer is positive print "The integer is positive" otherwise print "The integer is not positive"

        int i =12;

        // 1. way if-else

        if (i>0){
            System.out.println("The Integer is Positive");
        }else{
            System.out.println("The Integer is not positive");
        }

        //2.way ternary

        String result= i>0 ? "The Integer is Positive" : "The Integer is not positive";
        System.out.println(result);

        // Soru 1:

        //Type a program to print the minimum of 2 doubles on the console. Use ternary...

        double d= 3.0, e=3;
        double min = d>e ? e : d;
        System.out.println(min);

        // Soru 2:

        //Type code to calculate the absolute value of a number
        //For positive numbers and zero absolute value is the same with the number
        //For negative numbers to find absolute value multiply the number by -1

        double d1= -5.9;

       double abv= d1>=0 ? d1: d1*-1;
        System.out.println(abv);

         //Note: Instead of using ">=", you can use "<". This is better. cunku tek < kontrol ediyor.

        double abv1= d1<0 ? d1*-1 : d1;
        System.out.println(abv1);



        // Soru 3.
       // You have 2 integers;
        //If both of the integers are positive do multiplication
       // If one is negative the other one is positive return "I do not how to multiply"

        int i1=3, i2=5;

        // object data type can be used for all data types whenever we need.

        Object result1 = i1>0 && i2>0 ? i1*i2 :" I don't know how to multiply";
        System.out.println(result1);



    }
}
