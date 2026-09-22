package oop;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */


class person {

    
        public String name = "cedee";  // Public - accessible everywhere
        
     private    int age =23;  // Private - only accessible inside this class
     
     
}

        







public class Public_vs_Private_Example {
    
    
        
        
        
        public static void main(String[] args){
        
        
        
        person  p = new person();
        
        
        
        
       System.out.println(p.name);   // Works fine

       
       
       System.out.println(p.age);  // Error: age has private access in Person
       
       
       
        }
    
}
