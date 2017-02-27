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
public class Candle {
    private String color;
    private Integer altura;
    private float precio;
    
    public void setcolor(String a){
        color=a;
    }
    public String getcolor(){
        return color;
    }
    public void setaltura(Integer n){
        altura=n;
        precio=altura*2;
    }
    public Integer getaltura(){
        return altura;
    }
    public float getprecio(){
        return precio;
    }
    
}
