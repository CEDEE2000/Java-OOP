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
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_Reader_5 {
    
    public static void main(String[] args){
    
    File myfile5 = new File("filename.txt");
    
    System.out.println("successfully read file");
    try(Scanner st = new Scanner(myfile5)){
    
    
    // while loop
    while(st.hasNextLine()){
    
        // the result to read the data 
    String result = st.nextLine();
    
    // print the result
    System.out.println(result);
    
    }
    
    
    }catch(FileNotFoundException e){
    
    System.out.println(" Error ocurr");
    
    e.printStackTrace();
    
    
    
    
    }
    
    
    }
    
}
