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
public abstract class Auto {
    private String marca;
    private Integer precio;
    
    public Auto(){
        
    }
    
    public String getmarca(){
        return marca;
    }
    public Integer getprecio(){
        return precio;
    }
    public void setMarca(String m){
        marca=m;
    }
    public void setprecio(Integer n){
        precio=n;
    }
    public abstract void setPrice();
    
}
