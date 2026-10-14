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
import java.io.IOException;

public class fileinputStream_2 {
    
    public static void main(String[] args){
    
    
    try(FileInputStream myfile = new FileInputStream("\\C:\\Users\\HP\\OneDrive\\Pictures\\myId.jpg")){
    
    
   
    int i;
    
    while((i = myfile.read())!= -i){
    
    
    System.out.println( i);
    
    }
    
    
    
    
    }catch(IOException e){
            
            
            
       System.out.println("error ");
            
            
            
            }
    
    
    }
    
}
