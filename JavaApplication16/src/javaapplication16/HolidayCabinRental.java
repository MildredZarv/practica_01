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
public class HolidayCabinRental extends CaninRental{
    
    public HolidayCabinRental(Integer n){
        super(n);
        super.settarifa(super.gettarifa() + 150);
    }
    
}
