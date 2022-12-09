package day25exceptions;

public class R04 {
    public static void main(String[] args) {
        convert("abc");
    }

    // create a method to convert a String to an integer

    public static int convert(String str){

        int i=0;
        try {
            i = Integer.valueOf(str);
        }catch (NumberFormatException e){
            System.out.println("String is not in number format");
        }
        return i;
    }
}
