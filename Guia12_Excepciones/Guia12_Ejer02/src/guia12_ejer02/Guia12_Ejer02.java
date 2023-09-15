/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12_ejer02;

import Entities.ClaseArray;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia12_Ejer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClaseArray ca = new ClaseArray();
        ca.list[0]=1;
        ca.list[1]=2;
        ca.list[2]=3;
        

        try{
            System.out.println(ca.list[2]);
            System.out.println(ca.list[4]);
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("El indice esta fuera del rango del Array");
        }
//        
    }
    
}
