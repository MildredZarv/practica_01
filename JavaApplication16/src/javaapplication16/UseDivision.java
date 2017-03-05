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
public class UseDivision {
    public static void main(String[]args){
        InternationalDivision L1=new InternationalDivision("Telcel","21341345","Español","México");
        DomesticDivision L2=new DomesticDivision("Movistar","24123434","Oaxaca");
        L1.display();
        L2.display();
        
    }
    
}
