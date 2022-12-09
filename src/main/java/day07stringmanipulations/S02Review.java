package day07stringmanipulations;

public class S02Review {

    public static void main(String[] args) {
        String str = "Java is OOP";
        String s = str.replace('a','x');
        System.out.println(s);

        str.replace("Java","Apex");

        String st = "Ali is 13 years old, I think he seems 15.";
        String s1 = st.replaceAll("[0-9]","*");
        System.out.println(s1);

        String s2 = st.replaceAll("[a-z]","*");
        System.out.println(s2);

        String s3 = st.replaceAll("[A-Z]","*");
        System.out.println(s3);

        String s4 = st.replaceAll("[a-zA-Z]","*");
        System.out.println(s4);

        String s5 = st.replaceAll("[a-zA-Z0-9]","*");
        System.out.println(s5);

        String s6 = st.replaceAll("[aeiou]","*");
        System.out.println(s6);

        String s7 = st.replaceAll("[^0-9]","*");
        System.out.println(s7);

        String s8 = st.replaceAll("[^a-zA-z]","*");
        System.out.println(s8);

        String s9 = st.replaceAll("[^aeiou]","*");
        System.out.println(s9);

        String s10 = st.replaceAll("\\s","*");
        System.out.println(s10);

        String s11 = st.replace(" ","*");
        System.out.println(s11);

        String s12 = st.replaceAll("\\S","");
        System.out.println("s12: "+s12);

        String s13 = st.replaceAll("\\d","*");
        System.out.println(s13);

        String s14 = st.replaceAll("\\D","*");
        System.out.println(s14);

        String s15 = st.replaceAll("\\w","*");
        System.out.println(s15);

        String s16 = st.replaceAll("\\W","*");
        System.out.println(s16);

        String s17 = st.replaceAll("\\p{Punct}","*");
        System.out.println(s17);

        String s18 = st.replaceAll("\\P{Punct}","*");
        System.out.println(s18);

        String s19 = st.replaceAll("\\s","");
        System.out.println(s19);




    }
}
