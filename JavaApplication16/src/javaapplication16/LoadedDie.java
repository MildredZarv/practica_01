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
public class LoadedDie extends Die{
    public LoadedDie(){
        Random r=new Random();
        numero=r.nextInt(5)+2;
    }
    
}
