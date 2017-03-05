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
public class UseGeometric {
    public static void main(String[]args){
        Triangular t1=new Triangular("Triángulo",10,5);
        Square s1=new Square("Cuadrado",5,5);
        
        System.out.println("Figura: "+t1.gettipo());
        System.out.println("Alto: "+t1.getalto());
        System.out.println("Ancho: "+t1.getancho());
        System.out.println("Área: "+t1.getarea());
        System.out.println("Figura: "+s1.gettipo());
        System.out.println("Alto: "+s1.getalto());
        System.out.println("Ancho: "+s1.getancho());
        System.out.println("Área: "+s1.getarea());
        
    }
    
    
}
