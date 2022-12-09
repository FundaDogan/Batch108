package day12variabletypesstaticblockarrays;

public class Variable01Re {

    public String name = "Tom Hanks";

    //"age" is "static" or "class" variable
    public static int age = 13;

    public int add(int a, int b){
        int x=13;//local variable
        System.out.println(name);
        return a + b;
    }

    //Create a method to do multiplication
    public int multiply(int c, int d){
        String s = "Java";//local variable
        return c*d;
    }


}
