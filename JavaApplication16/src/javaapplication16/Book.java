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
public abstract class Book{
    private String title;
    private Double price;
    
    public Book(String title){
        this.title=title;
    }
    
    public String gettitle(){
        return title;
    }
    public void setprice(Double precio){
        price=precio;
        
    }
    public Double getprice(){
        return price;
    }
    public abstract void setPrice();
    }

