package day07stringmanipulations;

public class StringManipulations01Review {

    public static void main(String[] args) {

        String str = "Java is easy";
        boolean isCorrect = str.contains("a");
        System.out.println(isCorrect);

        boolean isCor = str.contains("be");
        System.out.println(isCor);

        boolean b1 = str.startsWith("J");
        System.out.println(b1);

        boolean b2 = str.startsWith("Java");
        System.out.println(b2);

         /* example 1) check if the given password
                i)has "A" in any position
                ii) has "xy" at the beginning
                iii) has "W" as 7th char
                iv) has 8 chars in total

        */

        String pwd = "xy1A?m6zK";

        boolean b3 = pwd.contains("A");
        boolean b4 = pwd.startsWith("xy");
        boolean b5 = pwd.startsWith("W",7);
        boolean b6 = pwd.length()==8;

        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);



    }
}
