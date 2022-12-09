package day08stringmanipulationsloops;

public class S01Review {

    public static void main(String[] args) {

        //Example :String shirtPrice = "$12.99";
        //      String bookPrice = "$35.99";
        //      Type code to find the sum of the shirt and book prices.

        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

        String shirt = shirtPrice.replace("$","");
        String book = bookPrice.replace("$","");

        double shirtInDouble = Double.valueOf(shirt);
        double bookInDouble = Double.valueOf(book);

        System.out.println(shirtInDouble);
        System.out.println(bookInDouble);
        System.out.println("Total price: "+ (shirtInDouble+bookInDouble));

        String s = "$45";
        String t = "$25";
        String s1 = s.replace("$","");
        String t1 = t.replace("$","");

        int s1Integer = Integer.valueOf(s1);
        int t1Integer = Integer.valueOf(t1);
        System.out.println(s1Integer+t1Integer);




    }
}
