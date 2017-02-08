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
public class BankAccount {
    private String nombre;
    private String NoCuenta;
    private int Saldo;
    
    public BankAccount(){
        this.nombre="Mildred";
        this.NoCuenta="014407478";
        this.Saldo=12000;
    }
    
     public String getnombre(){
        return nombre;
    }
    
    public void setnombre(String a){
        this.nombre=a;
    }
    
     public String getNoCuenta(){
        return NoCuenta;
    }
    
    public void setNoCuenta(String a){
        this.NoCuenta=a;
    }
    
     public int getSaldo(){
        return Saldo;
    }
    
    public void setSaldo(Integer a){
        this.Saldo=a;
    }
    
    public void deductMonthlyFee(){
        this.Saldo=Saldo-4;
    }
    
    public static void explainAccountPolicy() {
        System.out.println("La cuota de servicio se reducirá cada mes.");
    }
    
}


