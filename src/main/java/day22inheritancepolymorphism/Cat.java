package day22inheritancepolymorphism;

public class Cat extends Mammal{

    //public String name ="Cat";

    public Cat(){
        System.out.println(this.name);

        System.out.println(super.name);  // mammal
    }

    @Override  // overriding method
    public void eat() {

        System.out.println("Cats eat...");
    }

    @Override
    public Animal create() {
        return super.create();
    }

   // @Override
   // public Short add() {
     //   return super.add();
   // }


}
