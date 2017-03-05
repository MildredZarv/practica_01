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
public class Vehiculo {
    private Integer numRuedas;
    private Integer millaspGalon;
    
    public Vehiculo( Integer n, Integer s){
        numRuedas=n;
        millaspGalon=s;
    }
    
    public String armarCadena(){
        return "Información del vehículo:\nNumero de ruedas: "+numRuedas+"\nMillas por Galón: "+millaspGalon;
    }
    
}
