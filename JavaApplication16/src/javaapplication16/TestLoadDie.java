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
public class TestLoadDie {
    protected Die j;
    private Die[] jugador1=new Die[1000];
    private LoadedDie[] jugador2=new LoadedDie[1000];
    
    public TestLoadDie(){
        for (int i = 0; i < 1000; i++) {
            jugador1[i]=new Die();
            jugador2[i]=new LoadedDie();
            
        }
    }
    
    public void mostrar1(){
        for (int i = 0; i < 100; i++) {
            jugador1[i].Mostrar();
            jugador2[i].Mostrar();
            System.out.println();
        }
    }
    
}
