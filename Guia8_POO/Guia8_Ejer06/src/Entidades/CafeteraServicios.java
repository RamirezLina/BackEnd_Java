/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;
import Entidades.Cafetera;

/**
 *
 * @author LINA RAMIREZ
 */
public class CafeteraServicios {
    Scanner read = new Scanner (System.in);
    
    public Cafetera crearCafetera(){
        System.out.println("Escriba la capacidad máxima de la cafetera en mL");
        double capacidadMaxima = read.nextDouble();
        double cantidadActual = 0;
        
        return new Cafetera(capacidadMaxima, cantidadActual);
    }
    public void llenarCafetera(Cafetera c){
        c.setCantidadActual(c.getCapacidadMaxima());
        System.out.println("La cantidad actual es de "+c.getCantidadActual()+" mL");
    }
    
    public void servirTaza(int tamanoTaza, Cafetera c){
        System.out.println("Sirviendo café en la taza...");
        
        if (tamanoTaza > c.getCantidadActual()) {
            System.out.println("No se ha llenado la taza");
            System.out.println("Se sirvieron "+c.getCantidadActual()+" mL de Cafe");
            c.setCantidadActual(0);
            System.out.println("La cantidad actual de cafe en la cafetera es de "+c.getCantidadActual()+" mL");
            
        }else{
            System.out.println("La taza se llenó completamente");
            c.setCantidadActual(c.getCantidadActual()-tamanoTaza);
            System.out.println("La cantidad actual de cafe en la cafetera es de "+c.getCantidadActual()+" mL");
        }
    }
    
    public void vaciarCafetera(Cafetera c){
        c.setCantidadActual(0);
        System.out.println("La cantidad actual de cafe en la cafetera es de "+c.getCantidadActual()+" mL");
    }
    
    public void agragarCafe(double cafe, Cafetera c){
        c.setCantidadActual(cafe + c.getCantidadActual());
        System.out.println("La cantidad actual de cafe en la cafetera es de "+c.getCantidadActual()+" mL");
    }
}
