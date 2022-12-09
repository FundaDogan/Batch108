package day25exceptions;

public class R01 {
    public static void main(String[] args) {
        divide(9,0);
    }

    public static void divide(int a, int b){
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println(" a number can not be divided by zero");
        }

    }
}
