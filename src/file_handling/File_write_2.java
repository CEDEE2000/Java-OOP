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

public class File_write_2 {
    
public static void main(String[] args){

try(FileWriter mywrite2 = new FileWriter(" filename.txt")){


mywrite2.write(" hello john today is work day we have to code ");

System.out.println("successfully write into file ");


}catch(IOException e){

  System.out.println("an Error occur");
          
   e.printStackTrace();

}





}    
    
    
}
