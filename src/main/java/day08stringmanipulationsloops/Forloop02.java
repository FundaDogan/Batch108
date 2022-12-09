package day08stringmanipulationsloops;

public class Forloop02 {

    public static void main(String[] args) {

        //1.Example: Put * between 2 consecutive characters and to the end in a String.
        // For example; Java ==> J*a*v*a*

        String str = "Java";

        // when we work with string we use index that's why we start with 0

        for (int i=0; i<str.length();i++){
            System.out.print(str.charAt(i) + "*");
        }
        System.out.println();

        // Note: this is an INTERVIEW QUESTION in e-bay

        //2.Example: Type code to print unique characters in a String. Hello ==> Heo
        // string userdan da gelse ya da sen versen basta unique olan soruldugu icin bos containera gerek yok.


        String s = "Hello";

        for (int i=0; i<s.length(); i++){

            if (s.indexOf(s.charAt(i))== s.lastIndexOf(s.charAt(i))){

                System.out.print(s.charAt(i));

            }

        }






    }

}
