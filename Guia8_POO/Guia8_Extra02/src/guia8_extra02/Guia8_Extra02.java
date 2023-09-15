/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_extra02;

import Entidades.Puntos;
import Servicios.PuntosServicios;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia8_Extra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PuntosServicios ps = new PuntosServicios();
        System.out.println("Creando los puntos");
        Puntos p1 = ps.crearPuntos();
        
        System.out.println("Calculando la distancia entre los puntos");
        ps.distancia(p1);
    }
    
}
