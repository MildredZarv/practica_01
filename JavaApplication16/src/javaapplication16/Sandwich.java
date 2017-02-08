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
public class Sandwich {
    private String Principal;
    private String Pan;
    private double precio;
    
    public String getPrincipal(){
        return Principal; 
    }
    
     public void setPrincipal(String a){
      this.Principal=a;
    } 
     
     public String getPan(){
        return Pan;
    }
     
    public void setPan(String p){
       this.Pan=p;
   }
   
    public Double getprecio(){
        return precio; 
    }
    
    public void setprecio(Double q){
        this.precio=q;
    }
    
    public String ingrePincipal(String ingre){
      Principal=ingre;
      return Principal;
    } 
   
   
}


