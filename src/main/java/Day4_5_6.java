public class Day4_5_6 {
    public static void main(String[] args) {

        //1)	NOTE: leap year is very common INTERVIEW question

        //Type java code by using nested ternary.
        //Write a program to check if a year is leap year or not.
        //If the year is divisible by 100 then it must be divisible by 400.
        //If a year is not divisible by 100 then it must be divisible by 4.

        int year = 2004;
        String result = (year%100==0) ? ((year%400==0) ? "leap year" : "not leap year" ) :
                ((year%4==0) ? "leap year" : "not leap year");
        System.out.println(result);


        /* 2) (day 4)
                Ask user to enter a password
        		If the initial of the password is uppercase
        	    check if it is ‘A’ or not.
        	    If it is ‘A’ the output will be “Valid Password”
        	    otherwise the output will be “Invalid Password”
        	    For example; Ali ==> Valid password    -     ali ==> Invalid    -    Mark ==> Invalid

        		If the initial of the password is lowercase
        		    check if it is ‘z’ or not.
        		    If it is ‘z’ the output will be “Valid Password”
        		    otherwise the output will be “Invalid Password”
        	    For example; zoe ==> Valid password    -     Zoe ==> Invalid    -    john ==> Invalid

          */

// 3)Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
// Type code to print abbreviation of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"  (day 5)


        // 4)Create a simple calculator which does addition, subtraction, multiplication, division,
        // percentage calculation using switch (day 4)


        //5)Type a program to print the minimum of 2 doubles on the console. Use ternary. (day 5)



        //6) You have 2 integers;
            //If both of the integers are positive do multiplication
            // If one is negative the other one is positive return "I do not how to multiply" (day 5)


        // 7) Type code to check if a String has 'a' in it or not. Print appropriate messages for the scenarios (day06)

        // 8) Type code to check if a character is unique in a String or not (day06)



        /*         INTERVIEW QUESTION ==> What is the meaning of “BREAK” keyword?
        Break is used in Switch statement to break the flow to go outside the switch statement.




                                            NOTES
     NOTE: 1)boolean, long, float, double cannot be used in switch statement
     inside the switch parenthesis, you can use just "int", "byte","short","char", "String" data types.

	 NOTE: 2)"ternary" does the same with "if else" by using more simple syntax.

	 NOTE: 3) Strings are non-primitive, non-primitives have values and methods in them.




	                                    STRING METHODS

   1) equals() method compares two Strings by not ignoring cases
      "Tom".equals("tom"); ==> false
      equals() method returns "boolean"

   2)equalsIgnoreCase() method compares two Strings by ignoring cases
    "Tom".equalsIgnoreCase("tom"); ==> true
    equalsIgnoreCase() method returns "boolean"

   3)toLowerCase() method converts all characters in a String to lower cases
      "AuGuSt".toLowerCase(); ==> august
      toLowerCase() method returns String

   4)toUpperCase() method converts all characters in a String to upper cases
      "AuGuSt".toUpperCase(); ==> AUGUST
      toUpperCase() method returns String

   5)charAt() method gives you a character in the String by using index
      "Java is my love".charAt(2); ==> v
      "Java is my love".charAt(6); ==> s
      charAt() method returns char

   6)length() method returns the number of characters in a String
      "Learn Java earn money".length(); ==> 21
      length() method returns integer

    7) indexOf() method can be used with "char" and "String" data types like str.indexOf('a'); and like s.indexOf("Java");

    8) If you use String inside the indexOf(), it will return the index of the first character. s.indexOf("Java"); returns the index of "J"

    9) s.indexOf("xyz"); ==> -1   indexOf() method returns "-1" for non-existing characters

    */

    }
}
