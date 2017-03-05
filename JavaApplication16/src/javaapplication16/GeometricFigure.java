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
public abstract class GeometricFigure {
    private String tipo;
    private Integer alto;
    private Integer ancho;
    private Double area;
    
    public GeometricFigure(String t, Integer a, Integer b){
        tipo=t;
        alto=a;
        ancho=b;
    }
    
    public String gettipo(){
        return tipo;
        
    }
    public Integer getalto(){
        return alto;
    }
    public Integer getancho(){
        return ancho;
    }
    public abstract Integer getarea();
}
