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
public class PickTwoCards {
    private Card[] cartas ;
    
    public PickTwoCards(){
        cartas=new Card[52];
        int indice=0;
        String[] figuras={"H","S","D","C"};
        int v=0;
        do{
            for (int i = 1; i < 14; i++) {
                cartas[indice]=new Card(figuras[v],i);
                indice++;
            }
            v++;
        }while(v<4);
        
    }
    
    public Card DameCarta(){
        Random random=new Random();
        return cartas[random.nextInt(52)];
    }
    
}
