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
public class Event {
    public final static Integer Price=35;
    public final static Integer value=50;
    private String NumEvento;
    private Integer Invitados;
    private Integer Precio;
    
    public Event(String a, Integer n){
        NumEvento=a;
        Invitados=n;
    }
    public int getPrice(){
        return Price;
    }
     public String getNumEvento(){
        return NumEvento;
    }
    public int getInvitados(){
        return Invitados;
    }
     public int getPrecio(){
        return Precio;
    }
//    public void setNumEvento(String a){
//        this.NumEvento=a;
//    }
    
    public void setInvitados(Integer a){
        this.Invitados=a;
    }
    
    public  void setEventNumber(String n){
        NumEvento=n;
    }
    
    public  void setGuests(Integer invitados){ 
        Invitados=invitados;
        Precio=(Invitados*this.getPrice());
        
    }
    
    public String DarNum(){
        return NumEvento;
    }
    
    public int inv(){
        return Invitados;
    }
    
    public int DarPrecio(){
        return Precio;
    }
    
}
