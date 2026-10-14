/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package input_output_stream;

/**
 *
 * @author HP
 */
public class School {
    
   private  String name;
   private  int  Id;
   private  double gpa;
    
    
    // the constructor to create the student object
 public    School(String name , int  id , double gpa ){
     
     this.name = name;
     
        this.Id = Id;
        this.gpa  = gpa;
    
    }
 
 
 // get and set 
 
 public void setName(String name ){
     
     this.name = name;
 
 
 
 }
 
 
 
 public String getName(){
 
 return name;
 
 }
 
 
 public void  setID(int Id){
 
 this.Id = Id;
 
 
 }
    
 
 
 public int getID(){
 
 
 return Id;
 
 }
 
 
 public void setGpa(double gpa){
 
 this.gpa = gpa;
 
 }
 
 
 
 // method to pring student name safely 
 
 
 public void displayfor(){
 
 
 System.out.print("===============Student  Information =======================");
 System.out.println("Name : " +name + " , " +" ID "+ Id + " , " + " GPA "+ gpa );
         
 System.out.println("=================================================================");
 
 
 }
 
 
   
    
}



