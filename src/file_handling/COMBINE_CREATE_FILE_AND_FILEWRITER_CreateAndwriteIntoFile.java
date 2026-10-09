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
import java.io.FileWriter;
import java.io.IOException;

public class COMBINE_CREATE_FILE_AND_FILEWRITER_CreateAndwriteIntoFile {
    
    
    public static void main(String[] args){
    
 // this is the file object ,   in it i  created the location where i  want the file to be in my window computer if it create successfully 
    File myfile =new  File("C:\\Users\\HP\\OneDrive\\Desktop\\@cedeeka trap\\  file_And_fileWriter");
    
    try{
    
    
        if(myfile.createNewFile()){
        
        // after the file is created this message will display  with file name 
        
        System.out.println("File created successfully " + myfile.getName());
        
        // the location where the file is this message will display the area of the file location
        System.out.println("Absolute Path "  + myfile.getAbsolutePath());
        
        
        }else{
        
        
        // this will display if the file is Existed 
        System.out.println(" File already Exists. ");
        
        
        
        
        }
        
        
    // this is the filewriter object in it i put the file i created so i can be able to write in it 
    FileWriter mywrite = new FileWriter(myfile);
    
    // this is the write method
    
    mywrite.write("this is the place i  write the message so it can display in the file we created: Hello my people  ");
    
    // this message will display if file is written   successfully
    
    System.out.println("File successfully write into ");
    
    // here is the closing of the file i write into so our memory can be consum or before opening the file cause error 
    
    mywrite.close();
    
    
    }catch(IOException e){
    
        // this catch display the error if anything go wrong doing the run time 
    System.out.println(" Error occur " );
    
    
    // this print the error 
    e.printStackTrace();
    }
    
    
    }
    
}
