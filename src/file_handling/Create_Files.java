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

public class Create_Files {
   public static void main(String[] args){
   
  try{
  
  File myfile = new File("Filename.txt");
  
  
  if(myfile.createNewFile()){
  
  
  System.out.println("File Created : "+ myfile.getName());
  
  }else{
  
  
  System.out.println(" File already exists. ");
  
  
  }
  
  
  
  }catch(IOException e){
  
  
  System.out.println(" Error occur why creating a file ");
  
  
  e.printStackTrace();
  
  }
   
   
   
   
   } 
    
    
    
    
}
