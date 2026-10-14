/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package input_output_stream;

/**
 *
 * @author HP
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    
    ArrayList<School> StudentList = new ArrayList<>();
    
    Scanner sct = new Scanner(System.in);
    
    // loop to loop throuth the menu 
    int choice = 5;
    do{
      
        System.out.println(" 1.   Add student    ");
        System.out.println(" 2. View all Students  ");
        System.out.println("3.  search student by ID  ");
        System.out.println("4.   DElete student by ID ");
        System.out.println("5.     Eixt     ");
        
        System.out.println("   Enter your choice   ");
        
        choice = sct.nextInt();
        sct.nextLine();
        
        
        
       if(choice == 1) {
       
       System.out.println(" Enter student name ");
       
        String name = sct.nextLine();
        
        System.out.println(" Enter student ID");
        
       int Id = sct.nextInt();
       sct.nextLine();
       
       
       System.out.println(" Enter student GPA ");
       
       double gpa = sct.nextDouble();
       
       
       // add new  student 
       
       School newstudent = new School(name, Id, gpa);
       
         StudentList.add(newstudent);
         
         System.out.println("Student add successfully ");
         
       
       } else if(choice == 2){
       
       if(StudentList.isEmpty()){
       
      System.out.println(" No student found  ");
       }else{
       
       System.out.println(" Register student ");
        for(School S :StudentList ){
        
       S.displayfor();
        
        
        
        }
       
       }
       
       
       } else if(choice == 3){
       
       System.out.println(" Enter student ID to find the student you are looking for ");
       
       int Id = sct.nextInt();
       sct.nextLine();
       
       Boolean found = false;
       
       
       for( School S: StudentList){
       
       if(S.getID()==(Id)){
       
       found = true;
       
       S.displayfor();
       
       break;
       
       
       }
       
       
       
       }if(!found){
       
       
       System.out.println(" this ID  number  "+ Id + "is not in the system ");
       
       }
       
       
       
       }else if (choice == 4){
       
       System.out.println(" Enter the ID number you want to delete ");
       
       
       int delete = sct.nextInt();
       
       boolean Delete = false;
       
       sct.nextLine();
       
       for(School S : StudentList ){  
        
           if(S.getID() ==(delete)){
               
             Delete = true;  
            
             S.displayfor();
             break;
             
           }else{
           
           System.out.println(" the ID is not yet delete ");
           
           
           }
       
       }
        
       }
        
    }while(choice == 5);
    
    
    }
    
}
