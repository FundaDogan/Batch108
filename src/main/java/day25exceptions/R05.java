package day25exceptions;

public class R05 {
    public static void main(String[] args) {
        String s= "Alican";
        getChar(s,9);
    }

    // Create a method to get any character from a String

    public static char getChar(String str,int idx){
          char ch ='a';
        try {
            ch = str.charAt(idx);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        return ch;

    }
}
