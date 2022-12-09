package day30maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {
    public static void main(String[] args) {

        // Example 1: Increase the numbers in a List

        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(60);
        list.add(30);
        list.add(100);

        ListIterator<Integer> itr = list.listIterator();

        while (itr.hasNext()){
            Integer i= itr.next();
             itr.set(i*120/100);
        }
        Collections.reverse(list);
        System.out.println(list);


    }
}
