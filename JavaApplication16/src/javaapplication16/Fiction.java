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
public  class Fiction extends Book {
    
    
    public Fiction(String title){
        super(title);
        setPrice();
    }
    
    public void setPrice(){
        super.setprice(24.99);
    }
    
}
