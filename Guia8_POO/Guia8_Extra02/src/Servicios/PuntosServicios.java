/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class PuntosServicios {
    Scanner read= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    public Puntos crearPuntos(){
        Puntos p1 = new Puntos();
        System.out.println("Definiendo el primer punto");
        System.out.println("Escriba la coordenada X del primer punto");
        p1.setX1(read.nextLong());
        System.out.println("Escriba la coordenada y del primer punto");
        p1.setY1(read.nextLong());
        
        System.out.println("");
        
        System.out.println("Definiendo el segundo punto");
        System.out.println("Escriba la coordenada X del segundo punto");
        p1.setX2(read.nextLong());
        System.out.println("Escriba la coordenada y del segundo punto");
        p1.setY2(read.nextLong());
        
        return p1;
    }
    
    public void distancia(Puntos p1){
        
        double distancia;
        
        distancia =  Math.sqrt(Math.pow(p1.getX2()- p1.getX1(),2)+ Math.pow(p1.getY2()- p1.getY1(),2));
        
        System.out.println("La distancia entre los puntos es "+ distancia);
    }
}
