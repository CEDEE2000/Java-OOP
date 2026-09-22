/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author HP
 */
class student{

private int age = 20;

private String name = "cedee";

public void setAge(int age){

this.age = age;

}

public void setName(String name){


this.name  = name;
}


public int getAge(){

return age;
}



public String getName(){

return name;



}


}







public class Encapsulation_mean_hiden_sensitive_data_from_users {
    
    
    
    public static void main(String[] args){
    
    
    student p = new student();
    
    
   System.out.println(p.getName());
   
  
    System.out.println(p.getAge());
    
    
    }
    
    
    
    
    
}
