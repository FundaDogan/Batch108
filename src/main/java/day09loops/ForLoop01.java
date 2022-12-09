package day09loops;

public class ForLoop01 {

    public static void main(String[] args) {

        //INTERVIEW QUESTION  so common

        // Example 1: Type code to reverse a String
        // Tom ==> moT

        String name = "Mark";

        String reversedName = "";  //String tersten yazilinca da bir string olusuyor, onun icin bu container olusturduk.

        for(int i=name.length()-1; i>=0; i--){

            char ch = name.charAt(i);

            reversedName = reversedName+ch;  // normalde buraya sout(ch) yazmisti. o daha basit ama sonra bunu ekledi

        }

            System.out.println(reversedName);

        // This is also very common Interview Question

            // Example 2 : Find the sum of the integers from 3 to 6
                int sum =0;

                for (int i=3; i<7; i++){
                    sum=sum+i;
                }
             System.out.println(sum);


                int product = 1;

                for (int i=3; i<7; i++){

                    product=product*i;

                    }
                System.out.println(product);




    }
}
