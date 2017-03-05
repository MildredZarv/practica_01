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
import java.util.Scanner;
public class BookArray {
    public static void main(String[]args){
        Book[] books=new Book[10];
        Scanner in=new Scanner(System.in);
        books[0]=new Fiction("Pinocho");
        books[1]=new NonFiction("La odisea");
        books[2]=new Fiction("Paco el chato");
        books[3]=new NonFiction("El proceso");
        books[4]=new Fiction("La rana René");
        books[5]=new NonFiction("El juicio");
        books[6]=new Fiction("Pepe Pecas");
        books[7]=new NonFiction("Alzheimer");
        books[8]=new Fiction("Clubes rivales");
        books[9]=new NonFiction("¿Es Dios un matemático?");
        for (int i = 0; i <books.length ; i++) {
            System.out.println("Título: "+books[i].gettitle()+" $"+books[i].getprice());
        }
    }
}
