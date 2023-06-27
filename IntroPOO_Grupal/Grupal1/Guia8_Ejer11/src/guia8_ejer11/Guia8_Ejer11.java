/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejer11;

import java.util.Date;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia8_Ejer11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dia = 1;
        int mes  =10;
        
        int anio = 1997 -1900;
        
        Date fecha = new Date(anio, mes, dia);
        System.out.println(fecha);
        
        Date fechaActual = new Date();
        
        int dif = fechaActual.getYear()-anio;
        System.out.println("Hay "+dif+" años entre las dos fechas");
        
        
    }
    
}
