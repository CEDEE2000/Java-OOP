/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author HP
 */
public class Calling_a_Constructor_from_Another_Constructor {
    
    int myage;
    String  myname;
    
    
      // Constructor with one parameter

    public Calling_a_Constructor_from_Another_Constructor(String myname){
    
      // Call the two-parameter constructor to reuse code and set a default year    

    this(2000, myname);

    }
    
    
      // Constructor with two parameters

   public  Calling_a_Constructor_from_Another_Constructor( int myage, String myname){
   
   
   this.myage=myage;
   this.myname=myname;
  
   }
   
     // Method to print student  information

   public void printfo(){
   
   System.out.println(myage + ""  + myname);
   
   }
   
   
   
   public static void main(String[] args){
   
   
   Calling_a_Constructor_from_Another_Constructor s1 = new Calling_a_Constructor_from_Another_Constructor("cedee");
   
 Calling_a_Constructor_from_Another_Constructor s2 = new Calling_a_Constructor_from_Another_Constructor(100, "john");  
   
   
   s1.printfo();
   
   s2.printfo();
   }
    
}
