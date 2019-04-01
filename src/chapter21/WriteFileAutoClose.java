package chapter21;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileAutoClose {
    public static void main(String[] args) {
        try (BufferedWriter fileWrite = new BufferedWriter(new FileWriter("MyFile.txt", true))) {
            fileWrite.newLine();
            fileWrite.write("Hello");
            fileWrite.write("World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
