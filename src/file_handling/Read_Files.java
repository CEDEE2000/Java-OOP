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
public class Read_Files {
    public static void main(String[] args){
    
        File myfile = new File("C:\\Users\\HP\\OneDrive\\Desktop\\@cedeeka trap\\  file_And_fileWriter");
    
    
    
        try(Scanner reader = new Scanner(myfile)){
        
        
        while(reader.hasNextLine()){
        
        String data = reader.nextLine();
        
        System.out.println(data);
        
        
        }
        
        
        
        
        } catch(FileNotFoundException e){
        
        
        
        System.out.println(" Error occurr ");
        
        e.printStackTrace();
        
        }
    
    
    
    
    }
    
}
