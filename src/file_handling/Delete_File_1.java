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

public class Delete_File_1 {
    
    public static void main(String[] args){
    
    File myfile = new File("FileName.txt");
    
    if(myfile.delete()){
    
    System.out.println(" file Deleted " +myfile.getName());
    
    }else{
    
    System.out.println(" faile to delete file ");
    
    }
    
    
    }
    
}
