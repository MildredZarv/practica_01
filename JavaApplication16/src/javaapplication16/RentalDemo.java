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
public class RentalDemo {
    public static void main(String[]args){
        Rental r=new Rental();
        SammysRentalPriceWithMethods r2= new         SammysRentalPriceWithMethods(); 

        String contraro=NumContrato();
        r2.Nombre();
    }
    
    public static String NumContrato(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese número de contraro");
        String contrato=teclado.next();
        return contrato;
    }
    
}

