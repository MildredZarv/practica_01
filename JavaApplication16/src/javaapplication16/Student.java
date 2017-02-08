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
public class Student {
    private String ID;
    private Integer Creditos;
    private Integer Puntos;
    
    public String getID(){
        return ID;
    }
    
    public void setID(String a){
        this.ID=a;
    }
    
    public int getCreditos(){
        return Creditos;
    }
    
    public void setCreditos(Integer a){
        this.Creditos=a;
    }
    
    public int getPuntos(){
        return Puntos;
        
    }
    
    public void setPuntos(Integer p){
        this.Puntos=p;
    }
    
    public double Promedio(){
        return Puntos/Creditos;
    }
}
