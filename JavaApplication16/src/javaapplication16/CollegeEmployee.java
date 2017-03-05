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
public class CollegeEmployee extends Persona {
    private String numeroSeguro;
    private Integer salario;
    private String departamento;
    
    public void setnumeroSeguro(String name){
        numeroSeguro=name;
    }
    public void setSalario(Integer sal){
        salario=sal;
    }
    public void setdepartamento(String dep){
        departamento=dep;
    }
    
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Numero de seguro :"+numeroSeguro+"\nSalario $"+salario+"\nDepartamento: "+departamento);
    }
    
}
