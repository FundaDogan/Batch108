package day18datetimeclassvarargs;

public class Varargs {

    /* 1) If you want to make number of parameters flexible in a method, use varargs.
       2) To create a varargs you will type "Data type + ... + space + a name for the varargs".
       3) Varargs use arrays behind, when you work with varargs, you may think you are working with arrays.
       4) Varargs can accept 0 or more elements.

       5) Can I use another regular parameter after varargs?
       No, because varargs cannot be made full; second parameter will be unreachable.It will give error.
       Varargs must be last parameter all the time.

       6) Can I use another regular parameter before varargs?
       Yes, we can use many regular parameters before varargs.

       7) Can I use multiple varargs parameter in a method?
       No,we cannot.
     */

    public static void main(String[] args) {

        System.out.println(add(2, 3));
        System.out.println(add(2,3,4,7));
        //System.out.println(add(2,"f",9,6));
       System.out.println(add(3));
        System.out.println(add());
    }

    // Create a method adds two integers

    public static int add(int a, int b) {
        return a + b;

    }

    // Create a method adds three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Create a method adds n integers
    public static int add(int... a) {

        int sum = 0;
        for (int w : a) {
            sum = sum + w;
        }
        return sum;
    }

    // public static int add(int b, String c,int... a) { yazabilirsin no error
}