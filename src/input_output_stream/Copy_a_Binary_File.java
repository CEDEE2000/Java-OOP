/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package input_output_stream;

/**
 *
 * @author HP
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Copy_a_Binary_File {
    
    public static void main(String[] args){
    
    try(FileInputStream input = new FileInputStream("\\C:\\Users\\HP\\OneDrive\\Pictures\\cedee_1.jpeg"); 
            
            
            FileOutputStream output = new FileOutputStream(" copy")
            ){
    
       int i;
       
       
       
       while((i = input.read())!= - i){
       
       
       
       output.write(i);
       
       
       System.out.println( i);
               
       
       }
    
       
        System.out.println("File copy successfully ");
    
    }catch(IOException e){
    
    System.out.println(" error ");
    
    
    e.printStackTrace();
    
    }
    
    
    
    }
    
}
