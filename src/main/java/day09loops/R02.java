package day09loops;

public class R02 {

    public static void main(String[] args) {

// Example 3 : Type code to find the unique digits in an integer

        String s = "1454";

        int i =0;
        while (i<s.length()){
            String ch = s.substring(i,i+1);
            if (s.indexOf(ch)==s.lastIndexOf(ch)){
                System.out.print(ch+ " ");

            }
            i++;
        }
        System.out.println();

        // Example 3 : Type code to find the sum of the unique digits in an integer

        String s1 = "1234523";

        int sum=0;

        int i1=0;
        while (i1<s1.length()){

            String ch1 = s1.substring(i1,i1+1);

            if (s1.indexOf(ch1)==s1.lastIndexOf(ch1)){

                sum = sum + Integer.valueOf(ch1);
            }

            i1++;
        }

        System.out.println(sum);

        char c1 ='1';
        char c2 = '2';
        System.out.println(c1+c2);
        System.out.println(c1+""+c2);





    }
}
