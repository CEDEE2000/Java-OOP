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
import java.io.IOException;

public class Create_file_in_your_folder_in_window {
    
    public static void main(String[] args){
    
    
    try{
    
    File myfile5 = new File("C:\\Users\\HP\\OneDrive\\Desktop\\@cedeeka trap\\filename.Bank");
    
    
    if( myfile5.createNewFile()){
    
    
    
    System.out.println("File created Successfully "+myfile5.getName());
        
     System.out.println("Absolute Path"+ myfile5.getAbsolutePath());
        
        
    }else{
    
    System.out.println(" file already exists. ");
    
    
    
    }    
    
    
    } catch(IOException e){
    
    
    
    System.out.println("Error occur");
    
         e.printStackTrace();
    
    
    }
    
    
    }
    
}
