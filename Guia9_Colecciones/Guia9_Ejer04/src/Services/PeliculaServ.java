/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Pelicula;
import Utilities.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class PeliculaServ {

    private Scanner read;
    private ArrayList <Pelicula> Peliculas;

    public PeliculaServ() {
        this.read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        this.Peliculas = new ArrayList();
    }
    
    public void añadirPelicula() {

        String resp;
        do {
            System.out.println("Desea añadir una película? Responda Si/No");
            resp = read.next();
        } while (!resp.equalsIgnoreCase("si") && !resp.equalsIgnoreCase("no"));

        while (resp.equalsIgnoreCase("si")) {
            System.out.println("");
            System.out.println("Escriba el titulo de la película");
            String titulo = read.next();
            System.out.println("Escriba la duración de la película");
            Double dur = read.nextDouble();
            System.out.println("Escriba el director de la película");
            String dir = read.next();
            
            Pelicula p = new Pelicula(titulo, dir, dur);
            Peliculas.add(p);

            do {
                System.out.println("Desea añadir una nueva película? Responda Si/No");
                resp = read.next();
            } while (!resp.equalsIgnoreCase("si") && !resp.equalsIgnoreCase("no"));

        }

       

    }

    public void mostrarPeliculas() {
        System.out.println("");
        System.out.println("Las peliculas registrados son:");
        Peliculas.forEach((pel) -> {
            System.out.println(pel);
        });
        System.out.println("");
        System.out.println("Cantidad " + Peliculas.size());

    }
    
    public void peliMayor1h(){
        int count = 0;
        for (Pelicula Pel: Peliculas) {
            if (Pel.getDuracionh()>1) {
                System.out.println(Pel);
                count += 1;
            }
        }
        
        System.out.println("");
        System.out.println("De " + Peliculas.size()+" películas, "+count+" tienen una duración mayor a 1 hora");
    }
    
    public void peliculaDuracionDesc(){
        Collections.sort(Peliculas, Comparadores.ordenarporDuracionDesc);
        mostrarPeliculas();
        
    }
    
    
    public void peliculaDuracionAsc(){
        Collections.sort(Peliculas, Comparadores.ordenarporDuracionAsc);
        mostrarPeliculas();
        
    }
    
    
    public void peliculaTitulo(){
        Collections.sort(Peliculas, Comparadores.ordenarporTitulo);
        mostrarPeliculas();
        
    }
    
    public void peliculaDirector(){
        Collections.sort(Peliculas, Comparadores.ordenarporDirector);
        mostrarPeliculas();
        
    }
}
