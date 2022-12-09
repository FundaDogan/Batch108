package day26exceptions;

public class R02 {
    public static void main(String[] args) {
       divide(6,0);
    }

    // Create a method to do division then cut the connection with database

    public static void divide(int a,int b){
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("cut the connection with database");
        }

    }
}
