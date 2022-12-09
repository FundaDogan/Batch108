package day16Lists;

import java.util.ArrayList;
import java.util.List;

public class Review01 {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        List<Byte> l2 = new ArrayList<>();
        List<String> l3 = new ArrayList<>();
        List<Character> l4 = new ArrayList<>();

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        l1.add(3);
        l1.add(6);
        l1.add(9);

        System.out.println(l1);

        l1.add(0,1);
        System.out.println(l1);

        l1.add(3,4);
        System.out.println(l1);

      List<String> s1 = new ArrayList<>();
      s1.add("Funda");

      List<String> s2 = new ArrayList<>();
      s2.add("Ezgi");

      s1.addAll(s2);
        System.out.println(s1);
        System.out.println(s2);

        s1.addAll(1,s2);
        System.out.println(s1);

        s2.addAll(0,s1);
        System.out.println(s2);

        System.out.println(s1.size());
        System.out.println(s2.size());

        boolean isEmpty = s1.isEmpty();
        System.out.println(isEmpty);

        boolean b1 = l4.isEmpty();
        System.out.println(b1);

    }
}
