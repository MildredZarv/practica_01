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
public class Horse {
    private String nombre;
    private String color;
    private Integer a�oNac;
    
    public Horse(){
       color="Caf�";
        a�oNac=1945;
        nombre="Rocinante";
    }
    
    public void setnombre(String name){
        nombre=name;
    }
    public String getnombre(){
        return nombre;
    }
    public void setcolor(String c){
        color = c;
    }
    public String getcolor(){
        return color;
    }
    public void seta�oNac(Integer n){
        a�oNac=n;
    }
    public Integer geta�oNac(){
        return a�oNac;
    }
    
}
