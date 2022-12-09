package day05ternarystringmanipulations;

import java.util.Scanner;

public class Nested02Review {
    public static void main(String[] args) {

             /*
     Type code to check the password, ask user to enter the password.
     If it has more than 8 characters, initial should be 'i'
     If it has no more than 8 characters initial should be 'K'
     Solve the task by using nested-ternary
      */
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your password");
        String pwd = input.nextLine();

       String result = pwd.length()>8 ? ((pwd.charAt(0)=='i')? "valid": "invalid"):
                                        ((pwd.charAt(0)=='K')? "valid":"invalid");

        System.out.println(result);

        input.close();


    }
}
