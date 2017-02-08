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
public class TestSandwich {
    public static void main(String[]args){
    Sandwich superSandwich=new Sandwich();
        superSandwich.setPrincipal("Pollo");
        superSandwich.setPan("Integral");
       superSandwich.setprecio(11.80);
        
        System.out.println(superSandwich.getPrincipal());
        System.out.println(superSandwich.getPan());
        System.out.println(superSandwich.getprecio());
}
}
