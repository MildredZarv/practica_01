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

import java.util.GregorianCalendar;
import java.util.Calendar;
public class Year {
    private Integer dias;
    public Year(){
        dias=365;
    }
    
    public Integer getdias(){
        return dias;
    }
    
    public void setdias(Integer n){
        dias=n;
    }
    
//    public Integer daysElapsed(Integer mes, Integer dia){
//        
//        GregorianCalendar cad=new GregorianCalendar();
//        Calendar cal = new GregorianCalendar(2010, Calendar.JULY, 1); 
//        
//        int[] dias=new int[12];
//        for (int i = 0; i < 12; i++) {
//            dias[i]=cad.getActualMaximum(Calendar.DAY_OF_MONTH);
//        }
//    }
}
