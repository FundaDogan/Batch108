package day07stringmanipulations;

public class S04Review {

    public static void main(String[] args) {

        String str = "String is a non primitive data type in Java";

        str.isEmpty(); // this metod returns true if the string doesn't have any char

        boolean result1 = str.isEmpty();
        System.out.println(result1);


        String s = "";

        s.isBlank(); // isEmpty("")--> true       isEmpty(" ")==> false
                     // isBlank("")==> true       isBlank(" ")==> true

        boolean b1 = s.isBlank();
        System.out.println(b1);


        String s1 = " ";

        boolean b2 = s1.isBlank();
        System.out.println(b2);

        //Example 1:Check if a String has just letters and spaces in it

        String s2 = "Learn Java earn money!";
        boolean b3 = s2.replaceAll("[a-zA-Z ]","").isEmpty();
        System.out.println(b3);

        //Example 2:Check SSN for the following rules
        //          1)It must have just digits
        //          2)It must have 9 digits
        String ssn = "123456789";

        boolean b4 = ssn.replaceAll("\\d","").isEmpty();
        System.out.println(b4);

        boolean b5 = ssn.replaceAll("\\D","").length()==9;
        System.out.println(b5);

        String result = (b4 && b5 ) ? "pwd is valid": "pwd is unvalid";
        System.out.println(result);
    }
}
