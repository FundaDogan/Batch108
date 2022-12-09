package day23encapsulationabstraction;

public class StudentRunner {

    public static void main(String[] args) {

        Student std1 = new Student();

        // getter metodu ile private variablelar readable oldu ve std1.ile gorunuyorlar.ama hala privatelar

        System.out.println(std1.name);  //Tom Hanks
        System.out.println(std1.getStdId()); //TH123
        System.out.println(std1.getStdGPA()); // 3.8
        System.out.println(std1.getDisease());  // heart disease
        System.out.println(std1.isSuccessful()); //false

        System.out.println();

        std1.setDisease(null);
        System.out.println(std1.getDisease());  // null

        std1.setStdGPA(4.0);
        System.out.println(std1.getStdGPA());  // 4.0



    }
}
