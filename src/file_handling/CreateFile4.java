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

public class CreateFile4 {
    
    public static void main(String[] aers){
    
        try{
        
        File  myfile4 = new File("Filename.Music");
        
        
        if(myfile4.createNewFile()){
        
        
        System.out.println(" file created successfully ");
        
        }else{
        
        
        System.out.println("File already exists. ");
        
        
        }
            
        
        
        
        }catch(IOException e){
        
        
        System.out.println("Error occur ");
        
        
        e.printStackTrace();
        
        
        }
    
    
    
    
    
    }
    
}
