/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package input_output_stream;

/**
 *
 * @author HP
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Bufferedwrite_1 {
    public static void main(String[] args){
    
    
    try( BufferedWriter  myfile = new BufferedWriter(new FileWriter("txt"))){
    
    
    myfile.newLine(); // move to the new line 
    
    myfile.write(" hello bro today is game day let code with fun");  // add new text 
    
    
    System.out.println(" Writting to file successful"); 
    
    
    
    }catch(IOException e){
    
    
    System.out.println("error ");
    
    
    
    }
    
    
    }
    
}
