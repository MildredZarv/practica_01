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
public class UseBook {
    public static void main(String[]args){
        Fiction L1=new Fiction("Pinocho");
        NonFiction L2=new NonFiction("La apelación");
        
        System.out.println("Title: "+L1.gettitle()+"\n"+L1.getprice());
        System.out.println("Title: "+L2.gettitle()+"\n"+L2.getprice());
    }
}
