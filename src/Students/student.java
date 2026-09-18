/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Students;

/**
 *
 * @author HP
 */
public class student {
    
    
        private int studentID  = 158764 ;
    private String name = "cedee";
    private int age   = 21;
    
    private String  email  = "cedee2392gmail.com";
    
    
    public void setStudentID(int studentID){
    
    this.studentID = studentID;
    
    }
    
    public void setName(String name){
    
    
    this.name = name;
    }
    
    public void setAge(int age){
    
    this.age = age;
    
    }
    
    
    public void setEmail(String email){   this.email = email;}
    
    
    
    public int getStudentID(){ return studentID;   }
    
    
    
    public String getName(){  return name; }
    
    
    
    
    public int getAge(){   return age;   }
    
    
    
    public String getEmail(){   return email; }

    
}
