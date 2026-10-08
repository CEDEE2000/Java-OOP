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

public class Createfiles_2 {
    
    public static void main(String[] args ){
    
    try{
    
        File myfile2 = new File("Filename.john");
        
        
        if(myfile2.createNewFile()){
        
        
        System.out.println(" File created Successfully " + myfile2.getName());
        
        
        
        }else{
        
        
        System.out.println(" File already exists. ");
                
        
        
        
        }
    
    
    
    
    }catch(IOException e ){
    
    
    System.out.println(" Error occur ");
    
    e.printStackTrace();
    
    
    
    }
    
    
    
    
    
    }
    
}
