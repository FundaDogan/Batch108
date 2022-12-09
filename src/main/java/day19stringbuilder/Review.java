package day19stringbuilder;

public class Review {
    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1); // empty

        StringBuilder sb = new StringBuilder("Clara");

        sb.reverse(); // reverse metodu sb yi degistirir.
        System.out.println(sb);

        sb.deleteCharAt(3);
        System.out.println(sb);

        sb.delete(0,2);
        System.out.println(sb);

        sb.insert(2,"xxxyyy");
        System.out.println(sb);

        sb.replace(2,3,"yy");
        System.out.println(sb);

        sb.setCharAt(4,'k');
        System.out.println(sb);

        System.out.println(sb.indexOf("a"));
        System.out.println(sb.indexOf("y",1));

        System.out.println(sb.lastIndexOf("y"));

        String s= sb.substring(2,4); // substring string return eder
        System.out.println(s);

       String numbers = "012345678";
        System.out.println(numbers.substring(7,7));// nothing

        /*
        String letters = "abcdefg";
        System.out.println(letters.substring(6,5));// run time error
         */
        String letters = "abcdefg";
      letters.substring(2,5);
        System.out.println(letters);
      //  System.out.println(s1);

        letters.concat("hjk");
        System.out.println(letters);

    }
}
