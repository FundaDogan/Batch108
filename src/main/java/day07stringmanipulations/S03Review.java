package day07stringmanipulations;

public class S03Review {
    public static void main(String[] args) {

        String str = "Ali is 13 years old, I like Ali, Ali does not like me!...";

        // Example 1: How many punctuation marks are used in the given String?

        int i = str.replaceAll("\\P{Punct}","").length();
        System.out.println(i);

        // TRIM()

        String name = "   funda acar     ";
        String fixedName = name.trim();
        System.out.println(fixedName);




    }
}
