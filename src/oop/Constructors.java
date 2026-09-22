/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author HP
 */

// Create a Main class

public class Constructors {
    
    int x;  // Create a class attribute
    
    
      // Create a class constructor for the Main class

    public Constructors(){
    
    x = 5;  // Set the initial value for the class attribute x

    
    
    }
    
        
    
    
  public static void main(String[] args){
      
// Create an object of class Main (This will call the constructor)
     Constructors result = new Constructors(); 
     
     
     
     System.out.println(result.x); 
     
     
     
  
  }
    
}
