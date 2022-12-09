package day07stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        String str = "Java is easy";
        str.contains("a");

        boolean isExist = str.contains("a");
        System.out.println(isExist);  //true

        boolean isExist1 = str.contains("x");
        System.out.println(isExist1);  //false

        boolean isExist2 = str.contains("Java");
        System.out.println(isExist2);  //true

        // 2. method

        str.startsWith("J");

        boolean result = str.startsWith("J");
        System.out.println(result);  //true

        boolean result1 = str.startsWith("x");
        System.out.println(result1);  // false

        boolean result2 = str.startsWith("Java");
        System.out.println(result2);   // true

        // 3. method

        str.startsWith("i",5);

        boolean res = str.startsWith("i",5); // indexi 5 olan eleman i mi?
        System.out.println(res);   //true
        // bazen 3, karakter a mi diye kontrol etmek isteriz o zaman kullaniriz.

        /* example 1) check if the given password
                i)has "A" in any position
                ii) has "xy" at the beginning
                iii) has "W" as 7th char
                iv) has 8 chars in total

        */

        String pwd = "xy1AmSW?";

        boolean firstRule = pwd.contains("A");
        boolean secondRule = pwd.startsWith("xy");
        boolean thirdRule = pwd.startsWith("W",7);
        boolean fourthRule = pwd.length()==8;

        System.out.println("Is the password valid? "+ (fourthRule && secondRule && thirdRule && fourthRule));

        // 4. method

        String s = "Do practice to be better";

        s.endsWith("i");

        boolean rslt = s.endsWith("i");
        System.out.println(rslt);  // false

        boolean rslt1 = s.endsWith("r");
        System.out.println(rslt1);  // true

        boolean rslt2 = s.endsWith("better");
        System.out.println(rslt2);  // true

        // hem char hem string ile calisir ama chari string icine koycan

        // 5.method

        s.concat("!"); // concat() method is same with the "+" in java

        String t = s.concat("!");
        System.out.println(t);  // Do practice to be better!

        // we can use repeatedly, no limitation

        String t1 = s.concat("!").concat("...");
        System.out.println(t1);

        // if you use multiple methods side by side, it is called method chain




    }
}
