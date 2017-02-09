/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;
import java.util.Scanner;
public class MyCharacter {
    private String Color;
    private Integer NumOjos;
    private Integer NumVidas;
    
     public void setColor(String a){
        this.Color=a;
    }
    
     public String getColor(){
        return Color;
    }
      public void setNumOjos(Integer a){
        this.NumOjos=a;
    }
    
     public Integer getNumOjos(){
        return NumOjos;
    }
     
      public void setNumVidas(Integer a){
        this.NumVidas=a;
    }
    
     public Integer getNumVidas(){
        return NumVidas;
    }
     
     public static void Visualizar(String a, String b){
         MyCharacter c= new MyCharacter();
         System.out.println("ATRIBUTOS DEL PERSONAJE");
         System.out.println(a+"\n"+b);
         c.setColor("Azul");
         c.setNumOjos(4);
         c.setNumVidas(3);
         System.out.println("Color: "+c.getColor()+"\nNúmero de ojos: "+c.getNumOjos()+"\nNúmero de vidas: "+c.getNumVidas());
         
         
     }
     
     public static void main(String[]args){
         Scanner in=new Scanner(System.in);
         System.out.println("Escriba 2 características que desea que tenga su personaje ejemplo: Velocidad, Fuerza, Agilidad, etc.");
         String c1=in.next();
         String c2=in.next();
         Visualizar(c1,c2);
         
     
     }
}
