package day26exceptions;

public class E02 {

    /*
        1) If you want to execute a code for every scenario, use "finally" block after try body
        2) "try" can be used in these ways:
        a) try + catch
        b) try+ multiple catch
        c) try +multiple catch + finally
        Note: "try" cannot be used alone

        finally keyword is used to give a stop point for code line

        3) "ArithmeticException", "NullPointerException", "ArrayOutOfBoundException", "StringOutFoundException",
         "NumberFormatException", "IllegalArgumentException" are displayed on the console after running the code,
         therefore they are called "Run Time Exception"

       4) There is compile time exception, they will be displayed before clicking on the run button. Therefore, they are
       called "Compile Time Exception"


     */

    public static void main(String[] args) {

        divide(6,0);  //actual value we receive for the data is called arguments

    }

    // Create a method to do division then cut the connection with database

    public static void divide(int a, int b){  //the data that we parameterize inside method parenthesis these are parameters

        try{
            System.out.println(a/b+ "was saved into database");
        }catch (ArithmeticException e){
            System.out.println("Do not use 0 as divisor");
        }finally {
            System.out.println("cut the connection with the database");
        }



    }
}
