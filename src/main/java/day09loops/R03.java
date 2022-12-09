package day09loops;

public class R03 {
    public static void main(String[] args) {

       // /Example 3 : Type code to find the sum of the non-unique digits in an integer

        String s = "123423";

        int sum =0;

        String bos = "";

        int i =0;
        while (i<s.length()){

            String ch = s.substring(i,i+1);

            if (s.indexOf(ch)!=s.lastIndexOf(ch)){

                if (!bos.contains(ch)){

                    bos= bos  + String.valueOf(ch);
                    sum = sum+ Integer.valueOf(ch);
                }
            }

            i++;
        }
        System.out.println(sum);

        


    }
}
