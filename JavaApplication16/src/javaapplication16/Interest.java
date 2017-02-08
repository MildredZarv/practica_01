/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;
import java.util.Scanner;
public class Interest {
    public static void main(String[]args){
        double v=Calculos(Interest());
        System.out.println("Su saldo pasado un año será: $"+v);
    }
    
    public static float Interest(){
        Scanner in=new Scanner(System.in);
        System.out.println("Ingrese la inversión inicial");
        float inicial=in.nextFloat();
        return inicial;
        
    }
    
    public static double Calculos(Float a){
        return a+(0.5*a);
    }
    
}
