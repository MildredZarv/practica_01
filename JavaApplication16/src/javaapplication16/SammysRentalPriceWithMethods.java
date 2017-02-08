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
public class SammysRentalPriceWithMethods {
     public static void main(String[]args){
        int t=tiempo();
        Nombre();
        Calcular(t);
    }
    
    public static int tiempo(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el tiempo que desea alquilar el equipo -en minutos- ");
        int n=teclado.nextInt();
        return n;
    }
    
    public static void Nombre(){
        System.out.println("*Aquí va el lema de la empresa*");
    }
    
    public static void Calcular(Integer n){
        int Horas=n/60;
        n=n%60;
        double precio=480.00;
        double costo=Horas*precio + (precio/60)*n;
        System.out.println("DETALLES DEL ALQUILER");
        System.out.println("Precio del alquiler por hora \t$"+precio);
        if(Horas>0){
            System.out.println("Tiempo que se desea rentar \t"+Horas+" hora \t"+n+" minutos");
        }else{
            System.out.println("Tiempo que se desea rentar  \t"+n+" minutos");
        }
        System.out.println("Total a pagar: \t$"+costo);
        
    }
}
