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
public class DemoHorses {
    private RaceHorse caballo2;
    
//    public DemoHorses(){
//        caballo2.setcolor("Café");
//        caballo2.setañoNac(1945);
//        caballo2.setnombre("Rocinante");
//        
//        caballo2.setcarreras(10);
//    }
//    
//    public void Mostrar(){
//        System.out.println("Información del caballo:\nNombre: "+caballo2.getnombre());
//        System.out.println("Año de nacimiento: "+caballo2.getañoNac()+"\nColor: "+caballo2.getcolor());
//        System.out.println("Carreras ganadas: "+caballo2.getcarreras());
//        
//    }
    
    public static void main(String[]args){
        RaceHorse caballo2=new RaceHorse();
        caballo2.setcarreras(10);
        System.out.println("Información del caballo:\nNombre: "+caballo2.getnombre());
        System.out.println("Año de nacimiento: "+caballo2.getañoNac()+"\nColor: "+caballo2.getcolor());
        System.out.println("Carreras ganadas: "+caballo2.getcarreras());
        
        Horse caballo1=new Horse();
        caballo1.setañoNac(1987);
        caballo1.setcolor("Negro");
        caballo1.setnombre("Pegaso");
        
        System.out.println("Información del caballo:\nNombre: "+caballo1.getnombre());
        System.out.println("Año de nacimiento: "+caballo1.getañoNac()+"\nColor: "+caballo1.getcolor());
        
    }
    
}
