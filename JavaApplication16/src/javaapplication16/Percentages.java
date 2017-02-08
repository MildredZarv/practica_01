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
public class Percentages {
    public static void main(String[]args){
        double a=10;
        double b=100;
        computePercent(a,b); 
        computePercent(b,a);
    }
    
    public static void computePercent(double a, double b){
        System.out.println(a+" es "+((a*100)/b)+"% de "+b);
        
    } 
}

    
