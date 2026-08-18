package session9.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilesDemo {
    public static void main(String[] args) {

        File file = new File("example.txt");
        try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter("filename.txt");
        } catch (IOException e){
            System.out.println("Error creating file: " + e.getMessage());
        }

        file.delete();
    }
}
