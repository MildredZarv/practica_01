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
public class Card {
    private String figura;
    private Integer numero;
    
    public Card(String a, Integer b){
        this.figura=a;
        this.numero=b;
    }
    public void setfigura(String a){
        this.figura=a;
    }
    
     public String getfigura(){
        return figura;
    }
     public void setnumero(Integer a){
        this.numero=a;
    }
    
     public Integer getnumero(){
        return numero;
    }
    private class PickTwoCards{
        private Card[] cartas;
    }
}
