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
public class UseYear {
    public static void main(String[]args){
        
        Year año1=new Year();
        LeapYear año2=new LeapYear();
        
        System.out.println("Días del año 1: "+año1.getdias());
        System.out.println("Días del año 2: "+año2.getdias());
        
    }
    
    
   
    
}
