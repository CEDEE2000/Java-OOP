/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author HP
 */
public class Constructor_Parameters_1 {
    int x;
    
    // constructor 
    
    public Constructor_Parameters_1(int y){
    
    x=y;  // initialize value for the class attribute
    
    }
    
    
    
    public static void main(String[] args){
    
    Constructor_Parameters_1  nba = new Constructor_Parameters_1(5);
    
    
    System.out.println(nba.x);
    
    
    }
}
