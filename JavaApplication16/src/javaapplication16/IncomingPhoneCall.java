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
public  class IncomingPhoneCall extends PhoneCall{
    
    public IncomingPhoneCall(String number){
        super(number);
        super.setPrice(0.02);
    }
    
    public void getInformation(){
        System.out.println("Número "+getNumero());
        System.out.println("Call Price = $"+getCallPrice());
        
    }
    public Double getCallPrice(){
        return 0.02;
    }
    public String getNumero(){
        return "971436148";
    }
    public void getInformacion(){
        
    }
   
}
