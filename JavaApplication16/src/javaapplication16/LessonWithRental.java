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
public class LessonWithRental extends Rental{
    private Boolean bandera;
    public Integer tipo;
    private final String [] nombres={"Luis", "Alonso", "Daniel", "Diego", "Carlo", "Roberto", "Santiago","Arturo"};
    private String[] equipo={"Jet ski","Boat", "Oar", "Bike", "Car","Power Boat", " pontoon boat", "lifejacket"};
    
    
    
    public LessonWithRental(String a, Integer n, Integer m){
        super(a,n);
        tipo=m;
        if(tipo==0 || tipo==1){
            bandera=true;
        }else{
            bandera=false;
        }
    }
    
    public String getInstuctor(){
        String cad;
    
        if(bandera){
          cad="Usted necesita: "+equipo[tipo]+" y se requiere una lección impartida por \nel instructor "+nombres[tipo]+" para hacer uso del equipo";
        }else{
          cad="Usted no necesita alguna lección para hacer uso del equipo requerido.";
        }
        return cad;
    }
    
}
