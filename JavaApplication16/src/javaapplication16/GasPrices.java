/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;
import java.util.Scanner;
public class GasPrices {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        Integer pricePerBarrel=in.nextInt();
        prices(pricePerBarrel);
        
    }
    
    public static void prices (Integer a){
        System.out.println("RANGO DE PRECIOS POSIBLES CON BASE EN EL PRECIO POR BARRIL");
        System.out.println("$"+(3.5*a)/100  +" -- $"+(4*a)/100);
    }
}

    

