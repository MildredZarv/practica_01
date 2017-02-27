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
public class Alien {
    protected Integer numOjos;
    protected String colorPiel;
    protected Integer numVidas;
    
    public Alien(Integer a, String b, Integer c){
        numOjos=a;
        colorPiel=b;
        numVidas=c;
        
    }
    
    public String toString(){
        String a="CARACTERÍSTICAS:\nNúmero de vidas: "+numVidas+"\nNúmero de Ojos: "+numOjos+"\nColor de piel: "+colorPiel;
        return a;
    }
    
}
