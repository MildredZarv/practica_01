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
public class InternationalDivision extends Division {
    private String lenguaje;
    private String pais;
    
    public InternationalDivision(String name, String cuenta,String lenguaje, String pais){
        super(name,cuenta);
        this.lenguaje=lenguaje;
        this.pais=pais;
    }
    public void display(){
        System.out.println("Información de las llamadas");
        System.out.println("Compañía: "+super.getname());
        System.out.println("Número de cuenta: "+super.getcuenta());
        System.out.println("País: "+pais);
        System.out.println("Lenguaje: "+lenguaje);
    }
    
    public String getlenguaje(){
        return lenguaje;
    }
    public String pais(){
        return pais;
    }
}
