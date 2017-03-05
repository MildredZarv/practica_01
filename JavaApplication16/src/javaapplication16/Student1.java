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
public class Student1 extends Persona {
    private String carrera;
    private Double promedio;
    private Boolean permiso;
    
    public void setCarrera(String carr){
        carrera=carr;
    }
    public void setPromedio(Double p){
        promedio=p;
    }
    
     public void setpermiso(Boolean p){
        permiso=p;
    }
    public void mostrarInformacion(){
        if(permiso){
            super.mostrarInformacion();
            System.out.println("Carrera: "+carrera+"\nPromedio: "+promedio);
        }else{
            super.mostrarInformacion();
        }
    }
    
    
}
