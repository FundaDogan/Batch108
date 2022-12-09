package day23encapsulationabstraction;

public class AnimalRunner {

    public static void main(String[] args) {

        Cat c = new Cat();  // cat class is concrete, I can create obj
        c.eat();
        c.drink();
        c.meow();

        // Animal a = new Animal();  ==> animal class abstract old icin obj uretilemiyo hata veriyo.

    }
}
