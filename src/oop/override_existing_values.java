/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author HP
 */
public class override_existing_values {
    
    // If you don't want the ability to override existing values, declare the attribute as final:


      //int x = 40;
  //  x = 20;
    
    public static void main(String[] args){
    
        
            //override_existing_values override = new override_existing_values();

    final int x =20;
    x =25;
    
    
 //  x = 25;
   // will generate an error: cannot assign a value to a final variable
   
   System.out.println( x );   
    
    
    
    
    
    }
    
}
