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
public class LuxuryCarRental extends CarRental{
    private Double total1;
    
    public LuxuryCarRental(String n, String zc, String s, Integer d, String chofer){
        super(n,zc,s,d);
        super.settotal(279.99);
        
    }
    
    public LuxuryCarRental(String n, String zc, String s, Integer d){
        super(n,zc,s,d);
        super.settotal(79.99);
    }
    
    public void display(){
        super.display();
        System.out.println("Costo del chofer: $200");
    }
    
}
