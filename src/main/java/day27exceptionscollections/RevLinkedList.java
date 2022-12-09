package day27exceptionscollections;

import java.util.LinkedList;

public class RevLinkedList {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        LinkedList<String> kids = new LinkedList<>();

        names.add("tom");
        names.add("jim");
        names.add("jane");
        names.add("Ali");
        names.add("Ayse");

        names.add(2,"Jale");
        names.addLast("oya");
        names.addFirst("ahu");

        kids.add("Tunc");
        names.addAll(kids);
        names.addAll(3,kids);

        System.out.println(names);

        //Example 1: Change all names start with "A" to "*****" in linkedlist

        for (String w: names){
            if (w.startsWith("A")){
                w.replaceAll(w,"*****");
            }
        }
        System.out.println(names);

       /*
        for (String w: names){
            if (w.startsWith("A")){
               names.set(names.indexOf(w),"*****");
            }
        }
        System.out.println(names);



        */
    }
}
