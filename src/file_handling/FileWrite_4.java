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

public class FileWrite_4 {
    public static void main(String[]  args){
    
    
    File myfile = new File("C:\\Users\\HP\\OneDrive\\Desktop\\@cedeeka trap\\filename.CODEBOY");
    
    try{
    
    
        if(myfile.createNewFile()){
        
        System.out.println("File created successfully " + myfile.getName());
        
    System.out.println("Absolute Path :  " + myfile.getAbsolutePath());
    
        }else{
        
        System.out.println("File already exists. ");
        
        
        
        }
        
        
       FileWriter mywrite = new FileWriter(myfile);
       
       
       mywrite.write(" hello code boy you are taking the rigth path keep going ");
       
       
       System.out.println(" Write into file successfully ");
       mywrite.close();
    
    
    }catch(IOException e){
        
        
        System.out.println(" error occurr ");
        
        
        e.printStackTrace();
    
    
    
    }
    
        
    }
    
    }
