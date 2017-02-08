/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;
import java.util.Scanner;
public class PaintCalculator {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Introduzca el largo, ancho y alto de una habitación regular");
        int largo=in.nextInt();
        int ancho=in.nextInt();
        int alto=in.nextInt();
        double precio=AreaPared(largo,ancho,alto);
        precio=32*Math.ceil(precio);
       
        System.out.println("El costo total es $"+precio);
        
            
    }
    
    public static  double AreaPared(int a, int b, int c){
       System.out.println("Usted necesita " + Galones(2*(a*c + b*c))+ " galones para pintar la pared");
       
        return Galones(2*(a*c + b*c));
    }
    
    public static float Galones(int a){
        return a/350;
        
    }
}
