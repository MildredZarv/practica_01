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
public class CarlysEventPriceWithMethods {
    public static void main(String[]args){
        int n=Invitados();
        Lema();
        Evento(n);
        
        
    }
    
    public static int Invitados(){
        Scanner in=new Scanner(System.in);
        System.out.println("Introduzca el número de invitados");
        int n=in.nextInt();
        return n;
    }
    
    public static void Lema(){
        System.out.println("*Aquí va el lema de la empresa*");
    }
    
    public static void Evento(Integer n){
        System.out.println("El precio del evento se definirá con base en el número de invitados: "+n);
        System.out.println("Precio: $");
        System.out.println("");
    }
}
