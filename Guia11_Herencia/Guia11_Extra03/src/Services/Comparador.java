/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;


import Entities.Hotel;
import java.util.Comparator;

/**
 *
 * @author LINA RAMIREZ
 */
public class Comparador {
    
    public static Comparator <Hotel> ordenarporPrecio = new Comparator <Hotel>() {
        @Override
        public int compare(Hotel H1, Hotel H2) {
           return H2.precioHab().compareTo(H1.precioHab());
        }
    };
}
