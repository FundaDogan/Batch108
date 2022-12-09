package day20accessmodifiersinheritance;

public class CarRunner {

    public static void main(String[] args) {

        Civic c = new Civic();  // created c object from Civic class by using Civic constructor

        // when we run, the codes under constructors in Civic and parents will be executed.

        Honda h = new Honda();
        Car car = new Car();

        System.out.println(c.ecoEngine1());

    }
}
