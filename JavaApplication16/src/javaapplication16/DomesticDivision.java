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
public class DomesticDivision extends Division{
    private String estado;
    public DomesticDivision(String name, String cuenta,String estado){
        super(name,cuenta);
        this.estado=estado;
    }
    
    public void display(){
        System.out.println("Informaci�n de las llamadas");
        System.out.println("Compa��a: "+super.getname());
        System.out.println("N�mero de cuenta: "+super.getcuenta());
        System.out.println("Estado: "+estado);
    }
    
}
