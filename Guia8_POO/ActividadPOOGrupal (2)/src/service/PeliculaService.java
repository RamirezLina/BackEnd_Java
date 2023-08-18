/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Pelicula;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class PeliculaService {
    
    Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    Pelicula pelicula = new Pelicula();   
    
    public Pelicula crearPelicula(){        
        System.out.println("Ingrese el titulo de la pelicula");
        pelicula.setTitulo(input.next());
        System.out.println("Ingrese el género");
        pelicula.setGenero(input.next());
        System.out.println("Ingrese el año");
        pelicula.setAnio(input.nextInt());
        System.out.println("Ingrese la duración en minutos");
        pelicula.setDuracion(input.nextInt());
        return pelicula;
    }
    
    public void listarPeliculasDisponibles(Pelicula[] peliculas){
        for(Pelicula p: peliculas){
            if(!p.getAlquilada()){
                System.out.println(p);
                System.out.println("-_-_-_-_-_-_-_-_-_-_-");                
            }
        }        
    }
    
    public void listarPeliculasAlquiladas(Pelicula[] peliculas){
        for(Pelicula p: peliculas){
            if(p.getAlquilada()){
                System.out.println(p);
                System.out.println("-_-_-_-_-_-_-_-_-_-_-");                
            }
        }        
    }
    
    public void buscarPorTitulo(Pelicula[] peliculas){
        
        boolean encontrada = false;

        System.out.println("Ingrese el titulo que desea buscar");
        
        for(Pelicula p: peliculas){
            
            if(p.getTitulo().equals(input.next())){
                System.out.println(p);
                encontrada=true;
            }
        }
        
        if(!encontrada){
            System.out.println("No existe la pelicula buscada");
        }        
    }
    
    public void buscarPorGenero(Pelicula[] peliculas){

        System.out.println("Ingrese el genero que desea buscar");
        
        if(Arrays.asList(peliculas).contains(input.next())){
            System.out.println("El genero existe");
        }else{
            System.out.println("No existe el genero");
        }    
    }    

    
    
}
