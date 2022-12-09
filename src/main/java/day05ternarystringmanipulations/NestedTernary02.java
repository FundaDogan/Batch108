package day05ternarystringmanipulations;

public class NestedTernary02 {

    public static void main(String[] args) {

         /*
     Type code to check the password
     If it has more than 8 characters, initial should be 'i'
     If it has no more than 8 characters initial should be 'K'
     Solve the task by using nested-ternary
      */

        String pwd= "i1b3cXyz";
        String result = pwd.length()>8 ? (pwd.charAt(0)=='i' ? "valid password" : "invalid password"):
                                         (pwd.charAt(0)=='K' ? "valid password" : "invalid password");
        System.out.println(result);









    }

}
