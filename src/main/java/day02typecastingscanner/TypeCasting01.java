package day02typecastingscanner;

public class TypeCasting01 {
    public static void main(String[] args) {
        //example 1
        int i1= 3, i2=4;
        String str= "ali";
        System.out.println(i1+i2+str);
        System.out.println(str+i1*i2);

        int result=3-2*(5+2*3)/11;
        System.out.println(result);

        //Auto widening
        int m =14;
        System.out.println(m);

        double d =m;
        System.out.println(d);

        //Explicit narrowing
        int n =15;
        byte b =(byte)n;


    }
}
