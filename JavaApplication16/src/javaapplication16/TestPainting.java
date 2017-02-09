/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;
import java.util.Scanner;
public class TestPainting {
    public static void main(String[]args){
        Painting a= new Painting();
        Painting b=new Painting();
        Painting c= new Painting();
        Solicitar(a,b,c);
        comision();
    }
    
    public static void Solicitar(Painting a, Painting b, Painting c){
        Scanner in=new Scanner(System.in);
        System.out.println("Introduzca el título de la obra");
        String titulo=in.next();
        System.out.println("Introduzca el precio de la obra.");
        int p=in.nextInt();
        a.settitulo(titulo);
        b.setprecio(p);
        c.setcomision(p);
        
        System.out.println("Nombre de la obra: "+a.gettitulo());
        System.out.println("Artista: "+c.getArtista());
        System.out.println("Medio: "+c.getmedio());
        System.out.println("Precio: $"+b.getprecio());
        System.out.println("Comisión galería: $"+c.getcomision());
    }
    
    public static void comision(){
        System.out.println("La comisión para la galería es el 20% del precio de la obra");
    }
    
}
