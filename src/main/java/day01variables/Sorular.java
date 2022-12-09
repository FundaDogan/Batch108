package day01variables;

public class Sorular {
    public static void main(String[] args) {
       /* 1)Create double variables for the prices of any 3 items. Print the sum of the prices on the
        console with a label.
         */
        double priceOfShoe = 2.99, priceOfShirt=4.89, priceOfHat=5.99;
        System.out.println("total is "+ priceOfShoe + priceOfShirt + priceOfHat);


        //2) Create a float variable, a long variable, and an integer variable for any 3 items. Print the
        //multiplication of the values on the console with a label

        float f= 9.87f;
        long l=3000;
        int i= 38;
        System.out.println("product is "+ f*l*i);

        //3) Type a code to find simple interest.
               // Note: Simple interest formula = principal * rate * numberOfYear / 100

        int principal= 10000, rate=3, numberOfYear=5;
        System.out.println("The simple interest is "+ principal*rate* numberOfYear);






    }
}
