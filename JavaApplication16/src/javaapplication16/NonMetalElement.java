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
public class NonMetalElement extends Element{
    public NonMetalElement(String s, Integer nA, Double pA){
        super(s,nA,pA);
    }
    public void describeElement(){
        System.out.println("Los Elementos no metales son elementos qu�micos que son malos conductores de la corriente el�ctrica y el calor,\nson muy fr�giles por lo que no se pueden estirar ni convertir en una l�mina.");
        System.out.println("Elemento: "+super.getsimbolo());
        System.out.println("Peso at�mico: "+super.getpesoAtomico());
        System.out.println("N�mero at�mico: "+super.getnumeroAtomico());
    }
    
}
