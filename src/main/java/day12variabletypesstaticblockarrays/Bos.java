package day12variabletypesstaticblockarrays;

public class Bos {

        static  int a=12;
        int b = 11;

        public  int add(int a,int b){
            return a+b;
        }

        public static int multiply(int c,int d){

            return c*d;
        }


        public static void main(String[] args) {
        Bos obj = new Bos();

        System.out.println(a);  // a static oldugu icin main metod da static a yi basar calisir hata yok.
            System.out.println(obj.b);  // b non ststic oldugundan obj olmadan basilmaz

        obj.add(3,5);
        System.out.println(obj.add(3,5));

        System.out.println(multiply(2,3));  // multiply metodu static oldugundan obje olmadan yazilir ve calisir

    }





}
