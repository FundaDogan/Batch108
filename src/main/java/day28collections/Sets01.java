package day28collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Sets01 {
     /*
        1)Sets are for storing multiple non-primitive data in the same data type
        2)Sets are for storing unique data like email addresses, SSN, Phone Numbers in a Country, ...
        3)There are 3 different Sets: i)HashSet: Uses "Hashing Technique".
                                                 It does not put the elements in any order.
                                                 HashSet accepts just a single "null" as element
                                      ii)LinkedHashSet: Puts the elements in "Insertion Order"
                                      iii)TreeSet: Puts the elements in "Natural Order"(Ascending Order in numbers, Alphabetical Order in Strings)
                                          TreeSet is so slow in adding elements
        Question: If you need to store "unique elements" in "natural order", which collection do yo use?
                  Answer: TreeSet
        Question: As you know, TreeSet is so slow in adding elements, how can you improve your code?
                  i)Create a HashSet
                  ii)Add elements into the HashSet
                  iii)Convert HashSet to TreeSet
     */

    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<>();
        System.out.println(emails); //[]

        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        emails.add("Mango");// When you try to add repeated data, java doesn't give any error.
                            // last data will be overwritten to the previous data.


        emails.add(null); // comes first mostly
        emails.add(null); //just once seen

        System.out.println(emails); // random order.

        emails.remove("Fig");
        System.out.println(emails);

        //emails.clear();   // deletes all elements from the hashset
        //System.out.println(emails);  //[]


        Object emails2 = emails.clone(); // When you use clone(), you can make data type "Object"
        System.out.println(emails2);// data type object

        HashSet<String> emails3 = (HashSet<String>) emails.clone();
        System.out.println(emails3);// data type hashset

        // arraylist , linkedlist , hashsets are data structure


        // LinkedHashSet
        LinkedHashSet<Integer> ssn = new LinkedHashSet<>();

        ssn.add(123456789);
        ssn.add(234567891);
        ssn.add(345678912);
        ssn.add(456789123);
        ssn.add(null);

        System.out.println(ssn);

    // TreeSet
        // 1. way: Slower
        Long starting = LocalTime.now().toNanoOfDay();

        TreeSet<Integer> nums = new TreeSet<>();

        nums.add(23);
        nums.add(5);
        nums.add(17);
        nums.add(67);
        nums.add(-41);
        nums.add(-5);

        //nums.add(null); TreeSet doesn't accept "null" as element
        System.out.println(nums);

        Long middle = LocalTime.now().toNanoOfDay();

        // 2. way :Faster
        HashSet<Integer> nums2 = new HashSet<>();

        nums2.add(23);
        nums2.add(5);
        nums2.add(17);
        nums2.add(67);
        nums2.add(-41);
        nums2.add(-5);

        TreeSet<Integer> perfectNums = new TreeSet<>(nums2);
        System.out.println(perfectNums);

        Long ending = LocalTime.now().toNanoOfDay();

        System.out.println("1.Way: " + (middle-starting));
        System.out.println("2.Way: " + (ending-middle));
    }
}
