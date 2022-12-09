package day25exceptions;

public class E01 {

     /*
        1)"Exception" means un-expected issues in code execution
        2)There are two ways to work with Exceptions
            i)Using try-catch block: Handling Exception
            ii)Throw Exception and block the application
        3) If you do not handle the Exception, Java stops execution and the application is blocked.
        4) Try can be used with a single or more catch blocks
        5) Try can not be used alone
     */

    public static void main(String[] args) {
        divide(6, 0);

        divide2(6,0);
    }

    // 1. Way: not recommended
    //    i) It is not mandatory for developers to know all math rules
    //    ii) In math, there may be very problematic rules, it is so difficult to cover all in if statement
    public static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("a number cannot be divided by 0");
        } else {
            System.out.println(a / b);
        }
    }

    // 2.Way : Handle Exception by using try-catch block  like 911

    public  static void divide2(int a, int b){
        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("a problem occured in division");
        }
    }

}