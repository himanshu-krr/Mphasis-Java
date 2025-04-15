package CheckedExceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionDemo {
    public static void main(String[] args) {
        File file = new File("example.txt");
        
        try {
            FileReader reader = new FileReader(file); // May throw IOException
            System.out.println("File opened successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while opening the file: " + e.getMessage());
        }
    }
}
