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
public class CaninRental {
    private Integer caba�as;
    private Double tarifa;
    
    public CaninRental(Integer n){
        caba�as=n;
        if(n==1 || n==2 || n==3){
            tarifa=950.00;
        }else {
            tarifa=1100.00;
        }
        
    }
    
    public void setcaba�as(Integer n){
        caba�as=n;
    }
    public void settarifa(Double a){
        tarifa=a;
    }
    
    public Integer getcaba�as(){
        return caba�as;
    }
    
    public Double gettarifa(){
        return tarifa;
    }
    
}
