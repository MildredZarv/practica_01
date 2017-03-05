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
public abstract class PhoneCall {
    private String number;
    private Double price;
    
    public PhoneCall(String number){
        this.number=number;
        setPrice(0.0);
    }
    
    public void setPrice(Double price){
        this.price=price;
        
    }
    public void setNumero(String number){
        this.number=number;
    }
    
    
    public abstract String getNumero();
    public abstract Double getCallPrice();
    public abstract void getInformation();
    
    
    
    
}
