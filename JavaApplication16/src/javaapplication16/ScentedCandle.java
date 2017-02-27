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
public class ScentedCandle extends Candle{
    private String scent;
    
    public void setscent(String a){
        scent=a;
    }
    public String getscent(){
        return scent;
    }
    public void setaltura(Integer n){
        super.setaltura(n);
        
    }
    
}
