/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package courses;

/**
 *
 * @author HP
 */
public class course {
    
    private int courseId = 1284;
    private String coursename = "java ";
    
    private String coursescode = "ct2564 ";
    
    
    // set courseId
    public void setCourseId(int courseId){
    
      this.courseId = courseId;
        }
    
    //  set Coursename
    
    public void setCoursename(String coursename){
    
    this.coursename = coursename;
    
    }
    
    
    // set courses_code
    
    
    public void setCourses_code(String coursescode){
    
    this.coursescode = coursescode;
    
    }
    
    // get courseId
    public int getCourseId(){ return courseId; }
    
    
    //get Coursename
    
    public String getCoursename(){ return coursename; }
    
    
    
    // get courses_code
    
    public String getCoursescode(){  return coursescode;  }
    
   
}
