package day08stringmanipulationsloops;

public class Swap {

    public static void main(String[] args) {

        //interviev da sorarlar 2.yol ile coz diye

        /*
        swap the integers
        a=12   b=23;
         */

        // 1. Way : We used third variable

        int a = 12, b=23;

        //1.Way: We used third variable
        int temp = 0;
        temp = b;
        b= a;
        a = temp;
        System.out.println(a);//23
        System.out.println(b);//12

        //2.Way: Without using third variable
        int x=14, y=25;
        y = y - x;
        x = y + x;
        y = x - y;

        System.out.println(x);//25
        System.out.println(y);//14



    }
}
