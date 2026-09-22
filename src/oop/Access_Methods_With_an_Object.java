/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author HP
 */
public class Access_Methods_With_an_Object {
    
    
    static void fullThrottle(){
    
    System.out.println("the car is going faster it can !");
    
    
    }
    
    
    
    
    static void speed(int maxspeed){
    
    System.out.println("the max speed is :" + maxspeed);
    
    
    }
    
    
    
    
    
    
    public static void main(String[] args){
    
    
    
    Access_Methods_With_an_Object  mycar = new Access_Methods_With_an_Object();
    
    
    
    mycar.fullThrottle();
    mycar.speed(20);
    
    
    
    
    }
    
}
