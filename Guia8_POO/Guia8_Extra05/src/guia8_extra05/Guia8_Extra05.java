/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_extra05;

import Entidades.Fechas;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia8_Extra05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Fechas ad = new Fechas();
        
        System.out.println("Adivine el mes secreto");
        System.out.println("Introduzca el nombre del mes en minúsculas");
        
        while (!read.next().equalsIgnoreCase(ad.getMesSecreto())) {            
            System.out.println("No ha acertado");
            System.out.println("Intente adivinarlo introduciendo otro mes");
        }
      
        System.out.println("Ha acertado!");
        
//        while (read.) {
//            String next = read.next();
//            
//        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
