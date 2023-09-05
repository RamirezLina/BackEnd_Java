/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Electrodomestico;
import Entities.Lavadora;
import Entities.Televisor;
import java.util.ArrayList;

/**
 *
 * @author LINA RAMIREZ
 */
public class OlimpicaServices {
    
    public void precioElcetrodomesticos(ArrayList<Electrodomestico> elec){
        double precioLavadoras = 0;
        double precioTelevisores = 0;
        for (Electrodomestico e : elec) {
            e.precioFinal();
            if (e instanceof Lavadora) {
                Lavadora object = (Lavadora) e;
                System.out.println("El precio final de la lavadora es "+e.getPrecio());
                precioLavadoras += e.getPrecio();
                continue;
            }
            if (e instanceof Televisor) {
                Televisor object = (Televisor) e;
                System.out.println("El precio final del televisor es "+e.getPrecio());
                precioTelevisores += e.getPrecio();
            }
        }
        
        System.out.println("");
        System.out.println("------------------------------------------------------");
        System.out.println("La suma del precio de todos los electrodomesticos es "+(precioLavadoras+precioTelevisores));    
        System.out.println("La suma del precio de todos los televisores es "+(precioTelevisores));
        System.out.println("La suma del precio de todas las lavadoras es "+(precioLavadoras)); 
    }
    
}
