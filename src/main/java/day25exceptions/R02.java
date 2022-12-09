package day25exceptions;

public class R02 {
    public static void main(String[] args) {
        String a[] = {"A", "C", "B", "Z"};
        getElement(a,6);

    }

    // get element from string array

    public static String getElement(String a[],int idx){
        String s="";
        try {
             s=  a[idx];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        return s;
    }
}
