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
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_file_2 {
    
    public static void main(String[] args){
    
    File myfile = new File("C:\\Users\\HP\\OneDrive\\Desktop\\@cedeeka trap\\filename.Student2");
        
        
      
    
    try(Scanner reader2 = new Scanner(myfile)){
    
    
    while(reader2.hasNextLine()){
    
    
    
    String data = reader2.nextLine();
    
    System.out.println(data);
    
    
    }
    
    
    
    
    } catch(FileNotFoundException e){
    
    
    System.out.println(" error occur ");
    
    e.printStackTrace();
    
    }
    
    }
    
}
