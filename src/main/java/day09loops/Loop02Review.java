package day09loops;

public class Loop02Review {

    public static void main(String[] args) {

        // Example 3 : Type code to find the sum of the unique digits in an integer.
       String num = "1232";

       int sum =0;

       for (int i=0; i<num.length(); i++){

           char ch = num.charAt(i);

           if (num.indexOf(ch) == num.lastIndexOf(ch)){

               sum = sum+ Integer.valueOf(ch);
           }
       }

        System.out.println(sum);






    }
}
