/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author HP
 */
public class many_parameters_as_you_want_in_constructor {
    
    
    
    int myyear;
    String myname;
    
    
    
    public many_parameters_as_you_want_in_constructor(int year , String name){
    
    myyear = year;
    
    myname = name;
    
    
    }
    
    
    public static void main(String[] args){
    
    
    many_parameters_as_you_want_in_constructor  my = new many_parameters_as_you_want_in_constructor(21, "cedee");
    
    
    
    
    
    System.out.println(my.myname  + "  is " + my.myyear);
    
    }
    
}
