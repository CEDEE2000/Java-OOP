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
import java.io.IOException;

public class CreateFiles_3 {
    public static void main(String[] args){
    
    try{
    
    File myfile3 = new File("filename.Video");
    
    if(myfile3.createNewFile()){
    
    System.out.println("File created Successfully " + myfile3.getName());
    
    
    }else{
    
    System.out.println(" File already exists. ");
    
    
    }
    
    
    }catch(IOException e){
    
    
    System.out.println("Error creating File please try again ");
    
    e.printStackTrace();
    
    
    }
    
    
    
    }
    
}
