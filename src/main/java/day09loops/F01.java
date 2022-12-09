package day09loops;

public class F01 {

    public static void main(String[] args) {

        // Interview question

        // Example 4: Type code to find the sum of the digits of an Integer
        //            584 ==> 5+8+4=17

        //Note: "number % 10" gives me the last digit

        int num = -584;

        num = Math.abs(num);

        int sumOfDigits = 0;

        for(int i=num; i>0; i=i/10){
            sumOfDigits = sumOfDigits + i%10;
        }

        System.out.println(sumOfDigits);





    }

}
