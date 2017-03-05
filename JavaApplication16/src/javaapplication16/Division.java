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
public abstract class Division {
    private String name;
    private String cuenta;
    
    
    public Division(String name, String cuenta){
        this.name=name;
        this.cuenta=cuenta;
    }
    
    public String getname(){
        return name;
    }
    public String getcuenta(){
        return cuenta;
    }
    
    public abstract void display();
}
