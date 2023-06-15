/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.actividadextra001;

import vehiculo.Vehiculo;

/**
 *
 * @author fabia
 */
public class POOACTIVIDADEXTRA001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Vehiculo v1 = new Vehiculo ( "fiat" , "uno" , 1987 , "automovil");
       Vehiculo v2 = new Vehiculo ( "yamaha" , "qq" , 2005 , "motocicleta");
       Vehiculo v3 = new Vehiculo ( "vahiro" , "xt" , 2023 , "bicicleta");
        
        System.out.println("El auto se movio " + v1.moverse(5) + " m en 5 segundos");
        System.out.println("El moto se movio " + v2.moverse(10) + " m en 10 segundos");
        System.out.println("El bici se movio " + v3.moverse(60) + " m en 60 segundos");
        System.out.println("*****************************************************");
 
        System.out.println("El auto se movio " + (v1.moverse(300) + v1.frenar()) + " m en 5 minutos");
        System.out.println("El moto se movio " + (v2.moverse(300)+ v2.frenar()) + " m en 5 minutos");
        System.out.println("El bici se movio " + (v3.moverse(300) + v3.frenar()) +  " m en 5 minutos");
 
        
    }
    
}
