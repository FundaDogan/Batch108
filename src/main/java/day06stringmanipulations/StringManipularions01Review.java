package day06stringmanipulations;

import java.util.Scanner;

public class StringManipularions01Review {
    public static void main(String[] args) {

        //1.Example: Print the first and the last character of the given String on the console. "Java is easy" ==> Jy

        // SUBSTRING METODU
        String str = "Java is easy";

        String s1 = str.substring(0,1);   // first characteri alir.
        System.out.println(s1);
        String s2 = str.substring(2,7);   // va is substringini olusturalim.
        System.out.println(s2);
        String s3 = str.substring(11);    // son cahractei verir.
        System.out.println(s3);
        System.out.println(s1+s3);       // s1 ve s3 string old icin concatenation olur.

        // 2. Example
        // CHARAT() METODU
        char chSon = str.charAt(str.length()-1);    // son characteri basar.
        System.out.println(chSon);

        //3.Example:
        // Type code to get initials of the first name and the last name of a given name. Ali Can ==> AC

        // SPLIT Metodu
        String s= "Tom Hanks";
        s.split(" ")[1].substring(0,1);   // s stringini split ile kelimeler ayirdik ve indexi 1 olan yani
                                               // 2. kelimenin ilk harfini yazdirdik.


        String s11 = s.split(" ")[1].substring(0,1);
        System.out.println(s11);

        //4.Example:
        // Type code to find the number of words in a String; "I like to move it, move it" ==> 7

        String str1 = "I like to move it, move it";
        int i = str1.split(" ").length;
        System.out.println(i);



        }
    }

