package day25exceptions;

public class E05 {

    public static void main(String[] args) {

        char r1 = getCharFromString("Java", 9);
        System.out.println(r1); // StringIndexOutOfBoundsException : If you use non-existing index for a string,
                                // you will get StringIndexOutOfBoundsException
    }

    // Create a method to get any character from a String

    public static char getCharFromString(String str, int idx){

        char ch ='a';
        try {

            ch =str.charAt(idx);

        }catch (StringIndexOutOfBoundsException e){

            System.out.println(e.getMessage());
        }

        return ch;
    }
}
