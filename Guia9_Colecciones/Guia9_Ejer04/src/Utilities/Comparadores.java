/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import Entities.Pelicula;
import java.util.Comparator;

/**
 *
 * @author LINA RAMIREZ
 */
public class Comparadores {
    
    public static Comparator <Pelicula> ordenarporDuracionDesc = new Comparator <Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           return t1.getDuracionh().compareTo(t.getDuracionh());
        }
    };
    
    
    
    public static Comparator <Pelicula> ordenarporDuracionAsc = new Comparator <Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           return t.getDuracionh().compareTo(t1.getDuracionh());
        }
    };
    
    public static Comparator <Pelicula> ordenarporTitulo = new Comparator <Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    
    public static Comparator <Pelicula> ordenarporDirector = new Comparator <Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           return t.getDirector().compareTo(t1.getTitulo());
        }
    };
}
