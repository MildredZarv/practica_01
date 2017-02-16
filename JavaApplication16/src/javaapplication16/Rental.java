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
public class Rental {
     public final static Integer tarifa=40;
     public final static Integer MAH=60;
     private String ContractNumber="K681";
     private Integer NOHFTR;
     private Integer minutesOverAnHour;
     private Integer price;
     
     public Rental(){
         ContractNumber="K681";
         NOHFTR=39;
         minutesOverAnHour=0;
         price=1;
     }
     
   
    public void setContractNumber(){
        this.ContractNumber=ContractNumber;
    }
    
    public void setHoursAndMinutes(Integer minutes){
        int hours=minutes/60;
        int adicionales=minutes%60;
        double precio=this.tarifa*hours + adicionales*1; 
        
    }
    
    public String getContractNumber(){
        return ContractNumber;
    }
    public int getNOHFTR(){
        return NOHFTR;
    }
    public int getminutesOverAnHour(){
        return minutesOverAnHour;
    }
    public int getprice(){
        return price;
    }
}

    

