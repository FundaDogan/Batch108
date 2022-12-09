package day26exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class R03 {
    public static void main(String[] args) throws IOException {
       // read();
        System.out.println();
        System.out.println();
        readTheText();
    }

    //Create a method to read a text from a text file

    public static void read() throws IOException {
        FileInputStream fis = new FileInputStream("src\\main\\java\\day26exceptionsX\\File01.txt");

        int i=0;
        while ((i= fis.read())!=-1){
            System.out.print((char)i);
        }
    }

    public static void readTheText(){
        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\day26exceptions\\File01.txt");

            int i=0;
            while ((i= fis.read())!=-1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(" execution did not stop");
    }

}