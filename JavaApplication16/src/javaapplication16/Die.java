/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.util.Random;

/**
 *
 * @author MildReed Zaarv'
 */
    import java.util.Random;
    public class Die {
    protected Integer numero;
    public Die(){
        Random r=new Random();
        numero=r.nextInt(6)+1;
        
    }
    
    public Integer getnumero(){
        return numero;
    }
    
    public void Mostrar(){
        System.out.print(numero+" ");
    }
}
    

