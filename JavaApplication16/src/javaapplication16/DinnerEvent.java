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
public class DinnerEvent extends Event{
    private Integer O1;
    private Integer O2;
    private Integer O3;
    private Integer O4;
    private final String[]  principales={"Pollo", "Atún", "Pescado"};
    private final String[]  secundarios={"Ensalada verde", "Ensalada de manzana", "Ensalada rusa"};
    private final String[]  postres={"Pay de Limón", "Helado", "Brownies"};
    
    
    public DinnerEvent(String numEv, Integer personas, Integer a, Integer b, Integer c, Integer d){
        super(numEv,personas);
        O1=a;
        O2=b;
        O3=c;
        O4=d;
        
        
    }
    
    public String getMenu(){
        String a="Menú: \nEntrada: "+secundarios[O1]+"\nPlato fuerte: "+principales[O2]+" y "+principales[O3]+"\nPostre: "+postres[O4];
        return a;
    }
    

}