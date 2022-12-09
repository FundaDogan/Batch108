package day23encapsulationabstraction;

public class Student {

    /*
                                    ENCAPSULATION
        Encapsulation is "data hiding"
        To hide a data, we make the access modifier "private"
        After "hiding data", you may need to "read" or "update" the data

        to "read" or "update" the data we will create some methods
        to read "encapsulated data" you should create "get()" methods, we name it "getters"
        to update "encapsulated data" you should create "set()" methods, we name it "setters"

        get() and set() are called "Java Beans".
     */

        public String name = "Tom Hanks";
        private String stdId = "TH123";
        private double stdGPA = 3.8; // nobody touch it
        private String disease = "Heart Disease";
        private boolean successful = false;


    public String getStdId() {   // ==> this is getter method
                                 // they can read it but not touch
        return stdId;
    }

    public double getStdGPA() {
        return stdGPA;
    }

    public String getDisease(){
        return disease;
    }

    // if the data type is "boolean" get method name starts with "is"
    public boolean isSuccessful() {
        return successful;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setStdGPA(double stdGPA) {
        this.stdGPA = stdGPA;
    }

    /*public void setStdGPA(double gpa){   (hoca elle boyle yazdi, runner classta gpa yerine sayi yazicaz)
            this.StdGPA = gpa
     */

    // Even the data type is boolean we use "set" at the beginning of the name.

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public static void main(String[] args) {


    }

    }

