package day22inheritancepolymorphism;

public class Animal {

    public String name= "Animal";

    // overridden method
    public void eat(){
        System.out.println("animals eat...");
    }

    public Animal create(){
        return new Animal();
    }

    public Integer add(){
        return 12;
    }

    public int multiply(){
        return 24;
    }

    public final int divide(){
        return 34;
    }

    private boolean isRetired(){
        return true;
    }

    public static int counter(){
        return 5;
    }
}
