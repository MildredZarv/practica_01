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
public class DemoHolidayCabinRental {
    public static void main(String[]args){
        
        CaninRental c1= new CaninRental(3);
        HolidayCabinRental c=new HolidayCabinRental(2);
        
        System.out.println("Caba�a 1: "+c1.getcaba�as()+"\nTarifa: $"+c1.gettarifa());
        System.out.println("Caba�a 2: "+c.getcaba�as()+"\nTarifa: $"+c.gettarifa());
    }
    
}
