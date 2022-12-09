package day16Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Review02 {

    public static void main(String[] args) {

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        System.out.println(a);

        a.remove("radio");
        System.out.println(a.remove("radio"));
        System.out.println(a);

        System.out.println();

        a.remove(1);
        System.out.println(a);

        // Listlerde method chain yok

        Collections.sort(a);  // alfabetik siraya koyar
        System.out.println(a);


          boolean b = a.remove("Shoes");
        System.out.println(a.remove("Shoes"));
        System.out.println();


        /*Example 2: Type code to check if the list does not have any element different from space
         or the list does not have any element
                   [] ==> Acceptable        [ , , ] ==> Acceptable       [a] ==> Not Acceptable    ...
         */

        List<String> c = new ArrayList<>();
        c.add(" ");
        c.add(" ");
        c.add("a");

        System.out.println(c);

        List<String> d = new ArrayList<>();
        d.add(" ");
        c.removeAll(d);
        System.out.println(c);

        if (c.isEmpty()){
            System.out.println(" list does not have any element different from space");
        }else{
            System.out.println( "list has element different from space");
        }


    }
}
