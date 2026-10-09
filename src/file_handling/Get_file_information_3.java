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

public class Get_file_information_3 {
    
    public static void main(String[] args){
    
    
    File myinfo = new File("Filename.txt");
    
    //check if the file is exist using if statement 
    if(myinfo.exists()){
    
    // get the file name 
    System.out.println(" File Name : " +myinfo.getName());
    
    //the path where the file is  store  
    System.out.println(" Absolute Path : " +myinfo.getAbsolutePath());
    
    
    // check if file is Readable 
    
    System.out.println(" file Readable " + myinfo.canRead());
    
    
    
    // check if the file is writeable 
    
    System.out.println(" file writeable " + myinfo.canWrite());
    
    
    
    // check the size of the file length in bytes
    
    System.out.println(" size of the file in bytes "+ myinfo.length());
    
    
    
    
    
    
    
    }else{
    
    
    // display this message if the file is not exists
    
    System.out.println("the file is not exists ");
    
    
    
    }
    
    }
    
}
