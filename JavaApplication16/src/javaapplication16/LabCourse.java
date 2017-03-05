/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 *
 * @author MildReed Zaarv'
 */
public class LabCourse extends CollegeCourse{
    
    public LabCourse(String dep, Integer num, Integer ced){
        super(dep,num,ced);
    }
    
    public Double getprecio(){
        return 50+ super.getprecio();
    }
    
    
    public void display(){
        System.out.println("Este curso es de Laboratorio");
        super.display();
    }
    
    
    
}
