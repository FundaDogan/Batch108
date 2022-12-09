package day04nestedifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

        // Create a simple calculator which does addition, subtraction, multiplication, division,
        // percentage calculation using switch

        Scanner input = new Scanner(System.in);
        System.out.println("please, enter the first number");
        double firstNum= input.nextDouble();

        System.out.println("please enter the operation");
        char operation = input.next().charAt(0);

        System.out.println("please, enter the second number");
        double secondNum= input.nextDouble();


        switch (operation){

            case '+':
                System.out.println(firstNum+secondNum);
                break;
            case '-':
                System.out.println(firstNum-secondNum);
                break;
            case '*':
                System.out.println(firstNum*secondNum);
                break;
            case '/':
                System.out.println(firstNum/secondNum);
                break;
            case '%':
                System.out.println(firstNum%secondNum);
                break;
            default:
                System.out.println("That operation is not supported by this calculator");

                input.close();




        }





    }
}
