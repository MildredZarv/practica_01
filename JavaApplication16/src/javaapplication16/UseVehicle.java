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
public class UseVehicle {
    
    public static void main(String[]args){
        Car c1=new Car(12);
        MotorCycle c2= new MotorCycle(20);
        System.out.println(c1.armarCadena());
        System.out.println(c2.armarCadena());
        
    }
    
}
