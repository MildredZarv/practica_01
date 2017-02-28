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
public class DemoTennisGames {
    public static void main(String[]args){
        TennisGame a=new TennisGame();
        a.setnombres("Ángel", "Alonso");
        a.setfinalScores(0,3);
        
        TennisGame b=new TennisGame();
        b.setnombres("Luis", "Alan");
        b.setfinalScores(4,4);
        
        DoublesTennisGame c=new DoublesTennisGame();
        c.setnombres("Carlos", "Diego","Luis","Enrique");
        c.setfinalScores(2,3);
        
        System.out.println("Jugador 1 "+ a.getjugador1()+"\nPuntaje final: "+a.getfinalScore1());
        System.out.println("Jugador 2 "+ a.getjugador2()+"\nPuntaje final: "+a.getfinalScore2());
        System.out.println("Jugador 3 "+ b.getjugador1()+"\nPuntaje final: "+b.getScore1());
        System.out.println("Jugador 4 "+ b.getjugador1()+"\nPuntaje final: "+b.getScore1());
        
        System.out.println("Jugador A "+ c.getjugador1()+"\nEntrenador: "+c.getsocio1()+"\nPuntaje final: "+c.getScore1());
        System.out.println("Jugador A "+ c.getjugador2()+"\nEntrenador: "+c.getsocio2()+"\nPuntaje final: "+c.getScore2());
        
    }
    
}
