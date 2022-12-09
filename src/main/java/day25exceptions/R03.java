package day25exceptions;

public class R03 {

    public static void main(String[] args) {
       findNumOfChars(null);

    }

    // create a method to find the number of characters in a String

    public static int findNumOfChars(String str){

        int i=0;
        try {
           i= str.length();
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        return i;
    }
}
