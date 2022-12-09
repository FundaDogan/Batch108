package day27exceptionscollections;

// To make a class "Exception Class" make it child of the exception class by using "extends" keyword
// if I use "extends exception", it will be "Compile Time Exception" (Checked Exception)
public class IllegalGradeException extends Exception{

    public IllegalGradeException(String message){

        super(message);
}
}
