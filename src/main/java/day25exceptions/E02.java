package day25exceptions;

public class E02 {

    public static void main(String[] args) {

        String a[] = {"A", "C", "B", "Z"};
        String r1 = getElement(a,5);
        System.out.println(r1);

    }

    // Create a method to get any element from a String Array.

    public static String getElement(String a[], int idx) {

        String s = "";

        try {
            s = a[idx];

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("A problem occured in array indexes ");

            System.out.println(e.getMessage());  // gives technical message about the exception

           // e.printStackTrace();// gives detailed technical message
        }
        return s;

    }
}
