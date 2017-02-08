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
public class Painting {
    private String titulo;
    private String Artista;
    private String medio;
    private Integer precio;
    private double comision;
    
    public Painting(){
        this.titulo="Multiverso";
        this.Artista=" Elizabeth Lazo";
        this.medio="agua";
        this.precio=1234567;
        this.comision=(0.2)*precio;
    }
    
     public void settitulo(String a){
        this.titulo=a;
    }
    
     public String gettitulo(){
        return titulo;
    }
      public void setArtista(String a){
        this.Artista=a;
    }
    
     public String getArtista(){
        return Artista;
    }
      public void setmedio(String a){
        this.medio=a;
    }
    
     public String getmedio(){
        return medio;
    }
      public void setprecio(Integer a){
        this.precio=a;
    }
    
     public double getcomision(){
        return comision;
    }
    
}
