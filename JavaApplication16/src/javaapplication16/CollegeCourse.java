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
public class CollegeCourse {
    private String departamento;
    private Integer numCurso;
    private Integer creditos;
    private Double precio;
    
    
    public CollegeCourse(String dep, Integer num, Integer ced){
        departamento=dep;
        numCurso=num;
        creditos=ced;
        precio=getprecio();
    }
    
    public Double getprecio(){
        return 120.0*creditos;
    }
    
    
    
    public void display(){
        System.out.println(departamento);
        System.out.println(numCurso);
        System.out.println(creditos);
        System.out.println(precio);
    }
}
