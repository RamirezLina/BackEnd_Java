/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_ejer04;

import Services.PeliculaServ;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia9_Ejer04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PeliculaServ ps = new PeliculaServ();
        ps.añadirPelicula();
        ps.mostrarPeliculas();
        System.out.println("");
        System.out.println("Peliculas con duración mayor a 1 h");
        ps.peliMayor1h();
        
        System.out.println("");
        System.out.println("Peliculas de mayor a menor duración");
        ps.peliculaDuracionDesc();
        
        System.out.println("");
        System.out.println("Peliculas de menor a mayor duración");
        ps.peliculaDuracionAsc();
        
        System.out.println("");
        System.out.println("Peliculas por titulo organizadas alfabeticamente");
        ps.peliculaTitulo();
        
        System.out.println("");
        System.out.println("Peliculas por director organizadas alfabeticamente");
        ps.peliculaDirector();
    }
    
}
