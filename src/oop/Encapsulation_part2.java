/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author HP
 */
class school{

private int age = 20;

private String name;

private boolean enrolled;



public void setAge(int age){

   this.age = age;

}

public void setName(String name){

this.name = name;


}

public void setEnrolled(boolean enrolled){

   this.enrolled = enrolled;
}




    public int getAge(){
    
    return age;
    
    
    }
    
    
    
    public String getName(){
    
    return name;
    
    }
    
    
    
    public boolean isEnrolled(){
    
    return enrolled;
    
    }



}



public class Encapsulation_part2 {
    
    
    
    public static void main(String[] args){
    
    school p = new school();
    
    
    p.setAge(20);
    
    p.setName("cedee");
    
    p.setEnrolled(true);
    
    
    
    System.out.println(p.getAge());
    
    System.out.println(p.getName());
    
    
    System.out.println(p.isEnrolled());
    
    
    }
    
}
