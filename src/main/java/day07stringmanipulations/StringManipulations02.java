package day07stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        String str = "Java is OOP";

        // 6.method

        str.replace('O','*');

        String s1 = str.replace('O','*'); // both are chars
        System.out.println(s1);

        // 7. method

        str.replace("Java","*"); // both are strings

        String s2 = str.replace("Java","*");
        System.out.println(s2);




        String st = "Ali is 13 years old, I think he seems 15.";

        //Example 1: Change all digits to "*" in the given String

        // 1. way: Not recommended, because there is repetition
        String result= st.replace('0','*').
                          replace('1','*').
                          replace('2','*').
                          replace('3','*').
                          replace('4','*').
                          replace('5','*').
                          replace('6','*').
                          replace('7','*').
                          replace('8','*').
                          replace('9','*');

        System.out.println(result);

        // NOTE:

        // 2. Way: Recommended
        st.replaceAll("[0,9]","*");

        String rslt = str.replaceAll("[0,9]","*");
        System.out.println(rslt);

         /*
            Regex means "Regular Expressions"  Interview da sorabilirler.
            Regex represents a group of data
                All digits: [0-9]
                All lowercase letters: [a-z]
                All uppercase letters: [A-Z]
                All lower and uppercase letters: [a-zA-Z]
                All lower and uppercase letters and digits: [a-zA-Z0-9]
                Some multiple characters like a, e, i, o, u: [aeiou]

                All characters different from digits:[^0-9]
                All characters different from letters:[^a-zA-Z]
                All characters different from vowels:[^aeiou]

                Space character: \\s
                All characters different from space character: \\S

                All digits: \\d
                All characters different from digits: \\D

                All uppercase, lowercase letters and digits and _: \\w
                Different from All uppercase, lowercase letters and digits and _: \\W

                All punctuation marks: \\p{Punct}
         */

        String pwd = "2h ?aj !";

        /*Type code to check if a password is valid or not for the following conditions;
                Password must have at least 8 characters different from space character
                Password must have at least 1 symbol

         */

        // ilk sart:  all space i yok edince uzunluk 7 den buyuk oluyor mu?
        boolean firstRule = pwd.replaceAll("\\s","").length()>7;
        System.out.println(firstRule);

        // ikinci sart: symbol disindakilei kaldirinca uzunluk 0 dan buyuk mu?
        boolean secondRule = pwd.replaceAll("[a-zA-Z0-9 ]","").length()>0;
        System.out.println(secondRule);

        System.out.println("Is the password valid? " + (firstRule && secondRule));

        // benim yolum
        if (firstRule && secondRule){
            System.out.println("password is valid");
        }else{
            System.out.println("password is unvalid");
        }





    }
}
