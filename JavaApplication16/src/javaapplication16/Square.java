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
public class Square extends GeometricFigure{
    
    public Square(String t, Integer a, Integer b){
        super(t,a,b);
    }
    
    public Integer getarea(){
        return super.getalto()*super.getancho();
    }
    
}
