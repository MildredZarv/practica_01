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
public class TennisGame {
    private String jugador1;
    private String jugador2;
    private Integer finalJugador1;
    private Integer finalJugador2;
    private String finalScore1;
    private String finalScore2;
    
    public void setnombres(String name1, String name2){
        jugador1=name1;
        jugador2=name2;
        
    }
    
    public String getjugador1(){
        return jugador1;
    }
    
    public String getjugador2(){
        return jugador2;
    }
    public String getScore1(){
        return finalScore1;
    }
    public String getScore2(){
        return finalScore2;
    }
    public Integer getfinalScore1(){
        return finalJugador1;
    }
    public Integer getfinalScore2(){
        return finalJugador2;
    }
    public void setfinalScores(Integer final1, Integer final2){
        finalJugador1=final1;
        finalJugador2=final2;
        
        if(final1 > 4 || final1 < 0){
            finalJugador1=0;
            finalJugador2=0;
            finalScore1="error";
            finalScore2="error";
            
        }else if(final2 > 4 || final1 < 0){
            finalJugador1=0;
            finalJugador2=0;
            finalScore1="error";
            finalScore2="error";
        }else if(final2 ==4 && final1==4){
            finalJugador1=0;
            finalJugador2=0;
            finalScore1="error";
            finalScore2="error";
        }
    }
    
    
    
}
