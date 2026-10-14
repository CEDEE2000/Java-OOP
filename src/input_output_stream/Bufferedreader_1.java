/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package input_output_stream;

/**
 *
 * @author HP
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bufferedreader_1 {
    
    public static void main(String[] args){
    
    
    try(BufferedReader myfile = new BufferedReader(new FileReader("txt"))){
    
    
    String line;
    
    
    while((line =myfile.readLine())!= null){
    
    
    System.out.println(line);
    
    
    }
    
    
    
    }catch(IOException e){
    
    
    System.out.println(" Error ");
    
    
    
    e.printStackTrace();
    
    }
    
    
    
    }
    
}
