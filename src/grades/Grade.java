/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grades;

/**
 *
 * @author HP
 */

public class Grade {
    
    
       int score = 42;
       double grade = 50;
       
       // 42 ÷ 50 × 100 = 84%.
       
       
       public void total(){
       
           
          double result = score / grade * 100;
          
          
          if(result >= 80){
          
          System.out.println("A");
          
          }
          
          
          if(result >= 80 &&  result >= 90){
          
          System.out.println("A");
          
          }else if(result >= 60 && result >= 79){
          
          
          System.out.println("B");
          
          
          }else if ( result >= 50){
          
          
          System.out.println("D");
          
          
          }else{
          
          System.out.println("F");
          
          }
          
          
          
          
           
                 }
       
       
       
           
}
// Create a method that determines the grade from the score.