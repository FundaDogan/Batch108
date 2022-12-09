package day02typecastingscanner;

public class WrapperClass01 {
    public static void main(String[] args) {

        int i=12;
        Integer k=13;// wrapper class of int

        char c= 'A';
        Character d= 'A';

        /* byte    Byte
           short   Short
           long    Long
           float   Float
           double    Double
           boolean   Boolean
         */
        // Autoboxing
        byte b=23;
        Byte wb =b;

        //Unboxing
        Short ws = 34;
        short s = ws;

        // minimum and max values
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);// characterler dilden dile degistigi icin cevap vermiyo


    }
}
