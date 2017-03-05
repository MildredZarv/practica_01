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
public class ElementArray {
    public static void main(String[]args){
        MetalElement[] me=new MetalElement[2];
        me[0]=new MetalElement("Ni",28,56.06);
        me[1]=new MetalElement("Ag",47,94.02);
        
        NonMetalElement[] nme=new NonMetalElement[2];
        nme[0]=new NonMetalElement("C",6,12.06);
        nme[1]=new NonMetalElement("N",7,14.002);
        
        me[0].describeElement();
        me[1].describeElement();
        nme[0].describeElement();
        nme[1].describeElement();
    }
    
}
