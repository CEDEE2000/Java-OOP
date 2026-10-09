/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file_handling;

/**
 *
 * @author HP
 */
import java.io.FileWriter;
import java.io.IOException;
public class Filewrite_1 {
    
    public static void main(String[] args){
    
    try{
    
    
    FileWriter mywrite = new FileWriter("filename.txt");
    
    mywrite.write("Hello bro i think today is a good day i love the sun \n ");
    
    mywrite.close();
    
    System.out.println(" succssfully write ");
    
    }catch(IOException e){
    
    
    System.out.println(" Error occur when writting in file ");
    
    
         e.printStackTrace();
    
    
    }
    
    
    
    
    }
    
}
