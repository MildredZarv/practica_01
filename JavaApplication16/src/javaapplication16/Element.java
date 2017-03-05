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
public abstract class Element {
    private String simbolo;
    private Integer numeroAtomico;
    private Double pesoAtomico;
    
    public Element(String s, Integer nA, Double pA){
        simbolo=s;
        numeroAtomico=nA;
        pesoAtomico=pA;
    }
    
    public String getsimbolo(){
        return simbolo;
    }
    public Integer getnumeroAtomico(){
        return numeroAtomico;
    }
    public Double getpesoAtomico(){
        return pesoAtomico;
    }
    public abstract void describeElement();
}
