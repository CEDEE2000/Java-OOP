/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file_handling;

/**
 *
 * @author HP
 */
import java.io.FileWriter;
import java.io.IOException;

public class Append_to_a_File {
    
    public static void main(String[] args){
    
        
    try(FileWriter mywrite = new FileWriter("C:\\Users\\HP\\OneDrive\\Desktop\\@cedeeka trap\\  file_And_fileWriter", true)){
    
    
    
    mywrite.write("\n we writer in the privious file without deleting it by using append \n ");
    
    
    System.out.println("  Successfully write into Appended   ");
    
   
    
    }catch(IOException e){
    
    
    System.out.println("Error Occur ");
    
    
    e.printStackTrace();
    
    }
    
    
    
    
    
    }
    
}
