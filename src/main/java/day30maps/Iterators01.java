package day30maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");
        System.out.println(list1);//[Ali, Can, Aliye]

        // Example 1:Update every element by putting "!" to end
        //1.way
        for (String w: list1){

            w= w+ "!";
        }
        System.out.println(list1);

        // 2.way

        ListIterator<String> itr = list1.listIterator();

        while (itr.hasNext()){
            String el = itr.next();

            itr.set(el + "*");
        }
        System.out.println(list1);  // [Ali*, Can*, Aliye*]


        while (itr.hasPrevious()){

            String el = itr.previous();

            itr.remove();
        }
        System.out.println(list1);


        //Remove all elements by using iterator
//        Iterator<String> itr1 =  list1.iterator();
//        while(itr1.hasNext()){
//            String el = itr1.next();
//            itr1.remove();
//        }
//        System.out.println(list1)

    }
}
