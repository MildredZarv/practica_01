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
public class MetalElement extends Element{
    
    public MetalElement(String s, Integer nA, Double pA){
        super(s,nA,pA);
    }
    public void describeElement(){
        System.out.println("Los metales en su mayoría provienen de los minerales.\nLos metales más abundantes en la corteza terrestre que existen en forma mineral son:\naluminio, hierro, calcio, magnesio, sodio, potasio, titanio, y manganeso.");
        System.out.println("Elemento: "+super.getsimbolo());
        System.out.println("Peso atómico: "+super.getpesoAtomico());
        System.out.println("Número atómico: "+super.getnumeroAtomico());
    }
    
}
