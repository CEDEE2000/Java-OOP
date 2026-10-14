/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package input_output_stream;

/**
 *
 * @author HP
 */

import java.io.FileOutputStream;
import java.io.IOException;

public class Fileoutputstream_1 {
    
    public static void main(String[] args){
    
    
    // the text we want to wriote 
    
    String txt = " hello  , cedee , kallon , moses ";
    
    try(FileOutputStream output = new  FileOutputStream("txt")){
    
    
    output.write(txt.getBytes());
    
    
    System.out.println(" file write successfully ");
    
    }catch(IOException e){
    
    System.out.println("  Error writting in file ");
    
    e.printStackTrace();
    
    }
    
    
    }
    
}
