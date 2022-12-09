package day06stringmanipulations;

public class StrManipulations02Review {

    public static void main(String[] args) {

        // INDEX OF metodu

        //Example 1:
        // Type code to see the INDEX of the first occurrence of the character 'a'

        String str = "I like to learn Java";
        System.out.println(str.indexOf('a'));


        //Example 2:
        // Type code to see the ORDER NUMBER of the first occurrence of the character 'a'

        // NOTE: ORDER NUM INDEX NUMBER'in 1 fazlasidir.
        int orderNum= str.indexOf('a')+1;
        System.out.println(orderNum);


        //Example 3:
        // Type code to see the ORDER NUMBER of the first occurrence of "Java"

        String s = "I like to study Java, learn Java, earn money, Java is easy.";
        s.indexOf("Java");    // ilk javadaki j harfinin INDEX'ini basar.
        System.out.println(s.indexOf("Java"));
        System.out.println(s.indexOf("Java")+1);    // ilk javadaki j harfinin ORDERI NUM  basar.
        System.out.println(s.indexOf('w'));  //-1 basar cunku yok.

        //Example 4:
        // Type code to check if a String has 'a' in it or not. Print appropriate messages for the scenarios

        String word = "I like to study";
        word.indexOf('a');   // bu deger -1 se a yok degilse var demektir. bunu if ile yazalim

        System.out.println(word.indexOf('a'));

        if ( word.indexOf('a')==-1) {
            System.out.println("there is no 'a");
        }else{
            System.out.println("there is 'a");
        }

        // LASTINDEXOF metodu,

        //Example 5:
        // Type code to find the ORDER NUMBER of last occurrence of "Java" in a sentence
        String r = "I like to study Java, learn Java, earn money, Java is easy.";

        r.lastIndexOf("Java");   // son Java'nin ilk harfinin indexini verir.
        System.out.println(r.lastIndexOf("Java"));

        int lastJavaON= r.lastIndexOf("Java")+1;
        System.out.println(lastJavaON);
        System.out.println(r.lastIndexOf('w'));  // 'w' olmadigi icin bu da -1 retuen eder.

        //Example 5: Type code to check if a character is unique in a String or not
        //           "Hello" ==> H is unique, e is unique, o is unique
        String m = "Hello";

        //  m.indexOf('H') == m.lastIndexOf('H') ise o eleman bir tanedir, unique.

        if (m.indexOf('H')==-1) {
            System.out.println("there is no H");
        }else if (m.indexOf('H')==m.lastIndexOf('H')){
            System.out.println("H is unoque");
        }else {
            System.out.println("H is not unique");
        }



    }
}
