package java_Course.session9.fileHandling;

import java.io.*;

public class FilesDemo_Character {

    public static void main(String[] args) {


        String fileName = "MyNotes.txt";
        File file = new File(fileName);

        // Try with resources

        try ( FileWriter fileWriter = new FileWriter(fileName, true);
              BufferedWriter bufferedWriter = new BufferedWriter(fileWriter))
        {
           bufferedWriter.write("The first line of text.");
           bufferedWriter.newLine();
           bufferedWriter.write("The second line of text.");
           bufferedWriter.newLine();
           bufferedWriter.write("The last line of text.");
           bufferedWriter.newLine();
           System.out.println("File written successfully: " + file.getAbsolutePath());

        } catch (IOException e){
            System.out.println("Error while writing to file : " + e.getMessage());


        }


    }

}
