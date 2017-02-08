/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.util.Scanner;

/**
 *
 * @author MildReed Zaarv'
 */
public class Percentages2 {
    public static void main(String[]args){
        computePercent();
    }
    public static void computePercent(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese dos números");
        double a=teclado.nextInt();
        double b=teclado.nextInt();
        System.out.println(a+" es "+((a*100)/b)+"% de "+b);
        System.out.println(b+" es "+((b*100)/a)+"% de "+a);
    } 
}
    

