/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file_handling;

/**
 *
 * @author HP
 */
 import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileWrite_3 {
    
    
    

    public static void main(String[] args) {

        File myfile = new File(
            "C:\\Users\\HP\\OneDrive\\Desktop\\@cedeeka trap\\filename.infos1 "
        );

        try {

            // 1. Create the file
            if (myfile.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("File already exists.");
            }

            // 2. Write to THAT SAME FILE
            FileWriter mywrite = new FileWriter(myfile);

            mywrite.write("Hello Cedee");

            // 3. Close the writer
            mywrite.close();

            System.out.println("Successfully wrote into file.");
            System.out.println("Path: " + myfile.getAbsolutePath());

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
    

