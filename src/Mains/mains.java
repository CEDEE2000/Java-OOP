/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mains;

/**
 *
 * @author HP
 */
import Students.student;
import courses.course;
import grades.Grade;

public class mains {
    
    public static void main(String[] args){
    
    
          
          
        System.out.println("\n=============== Studnts detial ======================== \n");

                 student s = new  student (); 
                 
             System.out.println(" Age : "+s.getAge() + "  \n");
             System.out.println(" Name : "+s.getName() + " \n");
               System.out.println(" Email : "+s.getEmail() + " \n ");
                System.out.println ("  Student ID : "+s.getStudentID()  + " \n ");
                  
         System.out.println(" \n =============== Course  information================= \n");

                            course n = new course();
                            
                      System.out.print(" Course ID : "+n.getCourseId() + " ");     
                      
                       System.out.println("\n Course name : " + n.getCoursename() +" ");
                       
                       System.out.println(" \n  Course code : "+n.getCoursescode() +"  ");

                            
                            
                            

           System.out.println("\n =============== grade result ================== \n");
           
           
                     Grade g = new Grade();

           System.out.println();
           
          g.total();

    
    }
    
}
