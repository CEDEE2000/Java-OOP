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
public class Get_file_information_2 {
    
    public static void main(String[] args){
    
    
    File mynew = new File("FileName.txt");
    
    
    
    if(mynew.exists()){
    
    System.out.println("File Name " + mynew.getName());
    
    System.out.println(" Absolute Path " + mynew.getAbsolutePath());
    
    
    System.out.println(" Readable " + mynew.canRead());
    
    System.out.println(" Writeable " +mynew.canWrite());
    
    
    System.out.println(" File size in bytes "+mynew.length());
    
    
    
    }else{
    
    
    System.out.println(" the fil is not Exists ");
    
    }
    
    }
    
}
