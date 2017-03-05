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
public abstract class Story {
    private String titulo;
    private String nombre;
    private Integer paginas;
    private String mensaje;
    
    public void settitulo(String t){
        titulo=t;
    }
    public void setnombre(String t){
        nombre=t;
    }
    public abstract void setpaginas();
    
    public void setmensaje(String t){
        mensaje=t;
    }
    public String gettitulo(){
        return titulo;
    }
    public String getnombre(){
        return nombre;
    }
    public Integer getpaginas(){
        return paginas;
    }
    public String getmensaje(){
        return mensaje;
    }
    
}

