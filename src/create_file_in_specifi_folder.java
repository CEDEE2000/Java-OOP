/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.io.File;
import java.io.IOException;

public class create_file_in_specifi_folder {
    
    public static void main(String[] args){
    
    
    try{
    
    File myfile = new File("C:\\Users\\HP\\OneDrive\\Desktop\\JAVA MODULE\\Filename.Student");
    if(myfile.createNewFile()){
    
    System.out.println("File created Successfully " + myfile.getName());
    
    
    System.out.println("Absolute Path " + myfile.getAbsolutePath());
    
    }else{
    
    
        System.out.println("file already exists. ");
    
    
    
    }
    
    
    
    } catch(IOException e){
    
    
    System.out.println("Errors occur");
    
      e.printStackTrace();
    
    }
    
    
    }
    
}
