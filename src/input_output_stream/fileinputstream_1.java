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

public class fileinputstream_1 {
    
    public static void main(String[] args){
    
   try( FileInputStream myfile = new FileInputStream("Filename.txt")){
   
   
   
   int i;  // veriable to store each bytes that is read 
   
   
   while((i = myfile.read())!= -1){
   
   
   System.out.println((char)i);
   
   }
   
   
   
   
   
   }catch(IOException e){
   
   
   
   System.out.println("Error  occur ");
   
   
   
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
