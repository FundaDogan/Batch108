package day27exceptionscollections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineReview {
    public static void main(String[] args) {
       read();
    }

    // Create a method to read a text line by line

    public static void read(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src\\main\\java\\day26exceptions\\File01.txt"));

            String line = reader.readLine();
            while (line!=null){
                System.out.println(line);
                line = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
