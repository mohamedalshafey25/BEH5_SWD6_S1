package session10;

import java.io.*;

public class Files_Byte {
    public static void main(String[] args) throws IOException {

        // Reading byte code of original photo
        File originalPhoto = new File("picture.jpg");
        byte[] originalPhotoBytes = new byte[(int) originalPhoto.length()]; // 2500L = 2500 bytes > 2.5 KB  >(int) 2500L = 2500

        FileInputStream inputStream = new FileInputStream(originalPhoto);
        inputStream.read(originalPhotoBytes);   // Reading the file's byte code into the byte array
        System.out.println("Photo byte code read successfully from : " + originalPhoto.getAbsolutePath());
        inputStream.close();

        System.out.println("Length: " + originalPhotoBytes.length);
        for (byte b : originalPhotoBytes) {
            System.out.print(b + " ");
        }

        // writing photo byte code to a new file

        File copiedPhoto = new File("copyPicture.jpg");
        FileOutputStream outputStream = new FileOutputStream(copiedPhoto);
        outputStream.write(originalPhotoBytes);
        outputStream.close();

        System.out.println("\n Picture copied to : "+ copiedPhoto.getAbsolutePath());




    }
}
