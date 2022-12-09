package day27exceptionscollections;

public class Custom2Review {

    public static void main(String[] args) {
        try {
            System.out.println(checkTheName("Tom"));
        }catch (IllegalNameException e){
            System.out.println("name should start with uppercase");
        }

    }

    public static boolean checkTheName(String name) {

        if (name.charAt(0) >= 'A' && name.charAt(0) <= 'Z') {
            return true;
        } else {
            throw new IllegalNameException(" name should start with uppercase");
        }
    }
}