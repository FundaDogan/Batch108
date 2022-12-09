package day03ifstatement;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {

         /*
            Example 1: Type code to print "Weekday" for the weekday names,
            "Weekend day" for the weekend day names
              Monday --> Friday ==> Weekday            Saturday, Sunday ==> Weekend day
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a day name");
        String dayName = scan.next();

        boolean isweekday = dayName.equalsIgnoreCase("monday") ||
                            dayName.equalsIgnoreCase("tuesday") ||
                            dayName.equalsIgnoreCase("wednesday") ||
                            dayName.equalsIgnoreCase("thursday") ||
                            dayName.equalsIgnoreCase("friday");

        boolean isWeekend = dayName.equalsIgnoreCase("saturday") ||
                            dayName.equalsIgnoreCase("sunday");

        if(isweekday){
            System.out.println("weekday");
        }else if(isWeekend){
            System.out.println("weekend");
        }else{
            System.out.println("please enter a valid name");
        }

          /*
            Note: "OR" operator in Java is "||"
                  "||" can be used just with "boolean"s

           */

        scan.close();


    }
}
