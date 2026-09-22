/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author HP
 */
public class Non_access_modifiers_Final {
    
   final int age =45;
   final double pi= 3.14;
   
   public static void main(String[] args){
   
   
   Non_access_modifiers_Final  p = new Non_access_modifiers_Final();
   
   // It will generate an error: cannot assign a value to a final variable
   p.age = 25; 
   
   System.out.println(p.age); 
   
   
   System.out.println(p.pi);
   
   
   }
    
}
