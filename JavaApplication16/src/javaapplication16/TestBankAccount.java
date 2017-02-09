/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;
import java.util.Scanner;
public class TestBankAccount {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        BankAccount a1= new BankAccount();
        BankAccount a2= new BankAccount();
        BankAccount a3= new BankAccount();
        BankAccount a4= new BankAccount();
        
        System.out.println("introduzca su nombre");
        String nombre=in.next();
        System.out.println("Introduzca su Número de cuenta");
        String n=in.next();
        a2.setNoCuenta(n);
        System.out.println("Introduzca su saldo inicial");
        int s=in.nextInt();
        a3.setSaldo(s);
    }
    
    
    
}
