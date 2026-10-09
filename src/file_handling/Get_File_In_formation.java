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

public class Get_File_In_formation {
    
    public static void main(String[] args){
    
    
    File myfile = new File("C:\\\\Users\\\\HP\\\\OneDrive\\\\Desktop\\\\@cedeeka trap\\\\filename.Student2");
    
    
    
    if(myfile.exists()){
    
    System.out.println("File Name " + myfile.getName());
    
    
    System.out.println(" Absolute Path " +myfile.getAbsolutePath());
    
    
    System.out.println("  Writer able " + myfile.canWrite());
    
    
    
    System.out.println(" Readable " + myfile.canRead());
    
    
    System.out.println(" File Size in Bite "+ myfile.length());
    
    
    
    
    
    }else{
    
    System.out.println(" File does not exist ");
    
    
    }
    
    
    }
    
}
