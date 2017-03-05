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
public abstract class NewsPaperSuscribe {
    private String direccion;
    private String tipoSuscripcion;
    
    public void setdireccion(String d){
        direccion=d;
        
    }
    public String getdireccion(){
        return direccion;
    }
    
    public String gettipoSuscripcion(){
        return tipoSuscripcion;
    }
    public abstract void settipoSuscripcion();
    
    public Boolean equals(NewsPaperSuscribe s1){
        Boolean bandera;
        if(direccion.equals(s1)){
            bandera=true;
        }else{
            bandera=false;
            
        }return bandera;
    }
            
 }
