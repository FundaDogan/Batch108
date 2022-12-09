package day17listspassbyvalue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists02 {

    public static void main(String[] args) {

        //Example 1: Find the closest 2 integers in the given list. [12, 15, 10, 21]

        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(15);
        a.add(10);
        a.add(21);

        System.out.println(a); // [12, 15, 10, 21]

        // How to sort list elements

        Collections.sort(a);
        System.out.println(a); // [10, 12, 15, 21]

        // How to get minimum difference

        int minDifference = a.get(1) - a.get(0);

        System.out.println(minDifference);
        for (int i = 1; i < a.size(); i++) {

            Math.min(minDifference, a.get(i) - a.get(i - 1));

        }
        System.out.println(minDifference);

        for (int i = 1; i < a.size(); i++) {
            if (a.get(i) - a.get(i - 1) == minDifference) {
                System.out.println(a.get(i) + " and " + a.get(i - 1));
            }

        }
    }
}