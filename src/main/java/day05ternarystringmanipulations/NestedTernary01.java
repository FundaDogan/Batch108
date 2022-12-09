package day05ternarystringmanipulations;

public class NestedTernary01 {
    public static void main(String[] args) {

        /*
        Type java code by using nested ternary.
        Write a program to check if a year is leap year or not.
        If the year is divisible by 100 then it must be divisible by 400.
        If a year is not divisible by 100 then it must be divisible by 4.
 */
        // NOTE: leap year is very common INTERVIEW question

        int year = 2004;
        String result = (year%100==0) ? ((year%400==0) ? "leap year" : "not leap year" ) :
                                        ((year%4==0) ? "leap year" : "not leap year");
        System.out.println(result);

    }
}

