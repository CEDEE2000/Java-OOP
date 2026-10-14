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

public class Fileinputstream_3 {
    
    public static void main(String[] args){
    
    try(FileInputStream input = new FileInputStream("\\C:\\Users\\HP\\OneDrive\\Pictures\\cedee_1.jpeg")){
    
    
    
    
    
    int i;
    
    
    // read input untill it -1
    
    while((i = input.read())!=-i){
    
    
    System.out.println(i);
    
    
    }
    
    
    
    }catch(IOException e){
    
    
        System.out.println(" Errror occur");
    e.printStackTrace();
    
    }
    
    
    
    }
    
}
