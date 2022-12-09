package day27exceptionscollections;

public class CustomExceptionReview {

    public static void main(String[] args) {
       printGrades(-45);
    }

    // Create a method to print student's grades

    public static void printGrades(double grade){
        if (grade<0 || grade>100){
            try {
                throw new IllegalGradeException("Grade cannot be less than 0 or greater than 100");
            } catch (IllegalGradeException e) {
                System.out.println(e.getMessage());
            }
        }else {
            System.out.println(grade);
        }
    }
}
