package day29maps;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class HashMap03 {
    public static void main(String[] args) {

        //Example 1: Type code to print the number of occurrences of words in a sentence

        //"I like to move it, move it do you like it?"  => I=1, like=2, to=1, move=2, it=3, do=1, you=1
        String sentence = "I like to move it, move it do you like it?";

        //remove punctuation marks
        sentence = sentence.replaceAll("\\p{Punct}","");
        System.out.println(sentence);

        // get the words fro the sentence y using split() method.
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        HashMap<String,Integer> occurrenceMap = new HashMap<>();

        for (String w: words){

            Integer numOfOccurrence = occurrenceMap.get(w);

            if (numOfOccurrence==null){
                occurrenceMap.put(w,1);
            }else{
                occurrenceMap.put(w,numOfOccurrence+1);
            }
        }
        System.out.println(occurrenceMap);

        //Example 2: Type code to print the number of occurrences of letters in a sentence

        String s= "I like apple, apple likes";
        s= s.replaceAll("[^a-zA-Z]","");
        String letters[] = s.split("");

        HashMap<String,Integer> hm = new HashMap<>();

        for (String w:letters){

            Integer numOfOcc = hm.get(w);

            if (numOfOcc==null){
                hm.put(w,1);
            }else{
                hm.put(w,numOfOcc+1);
            }
        }
        System.out.println(hm);

    }
}
