package day08stringmanipulationsloops;

public class StringManipulations01 {

    public static void main(String[] args) {

        String str = "Java is easy. Java is OOP.";

        str.replaceFirst("Java","Apex");  // just first java will change
        // replace metodu hepsini degistirir.

        String s = str.replaceFirst("Java","Apex");
        System.out.println(s);

        //Example :String shirtPrice = "$12.99";
        //      String bookPrice = "$35.99";
        //      Type code to find the sum of the shirt and book prices.

        // bu degerler string icinde oldugu icin toplanmaz. bu yuzden once $ sign'dan kurtulup,
        // string icindeki sayiyi double'a donusturecegiz. 2. islem icin Double wrapper class'in daki
        // ValueOf methodunu kullanacagiz.  bu method string methodu degil wrapper class methodudur.

        String shirtPrice = "$12.99";
        String shirt = shirtPrice.replace("$","");
        System.out.println(shirt);

        String bookPrice = "$35.99";
        String book = bookPrice.replace("$","");
        System.out.println(book);

        // ValueOf method is not a String method. it comes from Wrapper class
        // it converts String data type to numeric data type.

        //Note: to be able to use value of method string must be in numeric format. That's why we first replace
        // "$" sign

        double shirtInDouble = Double.valueOf(shirt);
        double bookInDouble = Double.valueOf(book);

        System.out.println("Total price is " + (shirtInDouble+bookInDouble));








    }
}
