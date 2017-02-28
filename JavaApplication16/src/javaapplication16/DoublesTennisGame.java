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
public class DoublesTennisGame extends TennisGame{
   private String socio1;
   private String socio2;
   
   public void setnombres(String name1, String name2, String name3, String name4){
       super.setnombres(name1, name2);
       socio1=name3;
       socio2=name4;
       
   }
   
   public String getsocio1(){
       return socio1;
   }
   public String getsocio2(){
       return socio2;
   }
   
    
}
