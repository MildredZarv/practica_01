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
public class ShowStudent {
    public static void main(String[]args){
        Student H=new Student();
        H.setID("014407478");
        H.setCreditos(25);
        H.setPuntos(200);
        
        System.out.println("ID: "+H.getID());
        System.out.println("Créditos: "+H.getCreditos());
        System.out.println("Puntos: "+H.getPuntos());
        System.out.println("Promedio: "+H.Promedio());
    }
    
}
