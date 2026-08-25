package session10;

import java.io.*;

public class Files_Character {

    public static void main(String[] args) throws IOException {
        String fileName = "example.txt";
        File file = new File(fileName);
        // try with resources
        /**
        try (
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file)))
        {
            bufferedWriter.write("Hi");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
*/
        // FileReader
        try (
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader)
                ){

            String line;
            while ((line = bufferedReader.readLine()) != null ) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());

        }



    }
}
