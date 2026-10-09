/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file_handling;

/**
 *
 * @author HP
 */
import java.io.File; // import the file class 
import java.io.FileNotFoundException; // importn  file not found exception to  handle error 
import java.util.Scanner; // import scanner to read file 

public class File_Reader_6 {
  
    public static void main(String[] args){
    
    File myfile = new File(" Filename.txt");
    
    System.out.println(" file successfully readable ");
    
    try(Scanner st = new Scanner(myfile)){
    
    
    
    while(st.hasNextLine()){
    
    String name = st.nextLine();
    
    
    System.out.println(name);
    
    }
    
    
    
    }catch(FileNotFoundException e){
    
    
    
    System.out.println(" Error the file is not found you want to read from ");
    
    
    e.printStackTrace();
    
    
    }
    
    
    
    }
    
    
}
