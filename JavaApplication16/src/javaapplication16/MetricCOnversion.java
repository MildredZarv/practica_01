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
public class MetricCOnversion {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Introduzca un número entero");
        Integer n=in.nextInt();
        Litros(n);
        Pulgadas(n);
    }
    
    public static void Litros(Integer n){
        System.out.println("Hay 3.7854 litros en un galón de E.U. ");
        System.out.println("Entonces en "+n+" galones hay "+n*3.7854+" litros.");
    }
    
    public static void Pulgadas(Integer n){
        System.out.println("\n2.54 centímetros equivalen a una pulgada. ");
        System.out.println("Entonces en "+n+" pulgadas hay "+n*2.54+" centímetros.");
    }
    
}

