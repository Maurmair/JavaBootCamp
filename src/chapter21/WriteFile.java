package chapter21;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        FileWriter file = null;
        try {
            file = new FileWriter("MyFile.txt");
            file.write("Hello");
            file.write("World!");

        } catch (IOException ex) {
            System.out.println("Something is not quit right");
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (file != null) {
                    file.close();
                }
            } catch (IOException ex) {
                System.out.println("Error closing file");
            }
        }
    }
}
