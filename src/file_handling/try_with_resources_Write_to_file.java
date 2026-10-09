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

public class try_with_resources_Write_to_file {
    public static void main(String[] args){
    
    
    try(FileWriter mywrite = new FileWriter("C:\\Users\\HP\\OneDrive\\Desktop\\@cedeeka trap\\filename.Student2") ){
    
    
    mywrite.write(" Hello cedee kallon ");
    
    
    System.out.println(" successfully write into file ");
    
    
    }catch(IOException e){
    
    
    System.out.println(" ERROR occur writting into file ");
    
    
    
    e.printStackTrace();
    
    
    }
    
    
    
    }
    
}
