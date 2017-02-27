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
public class RaceHorse extends Horse {
    
    
    private Integer carreras;
    
    public RaceHorse(){
        super();
    }
    
    public void setcarreras(Integer n){
        carreras=n;
        
    }
    
    public Integer getcarreras(){
        return carreras;
    }
    
    
}
