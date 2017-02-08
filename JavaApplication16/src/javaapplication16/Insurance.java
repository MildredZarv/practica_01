/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;
import java.util.Scanner;
public class Insurance {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Introduzca el año actual.");
        int a=in.nextInt();
        System.out.println("Introduzca el año en el que nació.");
        int b=in.nextInt();
        
        System.out.println("Prima anual de poliza $"+Prima(a,b));
    }
    
    public static int Prima(Integer a, Integer b){
        int c=(15 + (a-b)/10)*20;
        return c;
    }
}
