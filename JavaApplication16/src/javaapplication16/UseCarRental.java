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
public class UseCarRental {
    public static void main(String[]args){
        CarRental c1=new CarRental("Carro1","qwefqwe4","M",7);
        LuxuryCarRental c2=new LuxuryCarRental("carro2","dfw453w4f","E",3,"S");
        LuxuryCarRental c3=new LuxuryCarRental("carro3","453T4f","E",8);
        
        c1.display();
        c2.display();
        c3.display();
    }
    
}
