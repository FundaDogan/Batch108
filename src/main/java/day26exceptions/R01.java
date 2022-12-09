package day26exceptions;

public class R01 {
    public static void main(String[] args) {
        try {
            printAge(10);
        }catch (IllegalArgumentException e){
            System.out.println("Worker's age can't be less than 16");
        }

    }

    // Create a method to print worker's age

    public static void printAge(int age){

        if (age<16){
            throw new IllegalArgumentException("Worker's age can't be less than 16");
        }
        System.out.println(age);
    }
}
