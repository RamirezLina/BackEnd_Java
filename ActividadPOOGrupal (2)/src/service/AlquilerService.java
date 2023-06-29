/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Alquiler;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class AlquilerService {
    
    Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    Alquiler alquiler = new Alquiler();    
    
    public Alquiler crearAlquiler(){
        System.out.println("Ingrese la pelicula a alquilar");
        alquiler.setPeliculaAlquilada(input.next());
        System.out.println("Ingrese la fecha de inicio");
        System.out.println("Ingrese el año");
        alquiler.getFechaInicio().setYear(input.nextInt()-1900);
        System.out.println("Ingrese el mes");
        alquiler.getFechaInicio().setMonth(input.nextInt()-1);
        System.out.println("Ingree el día");
        alquiler.getFechaInicio().setDate(input.nextInt());
        
        System.out.println("Ingrese la fecha de fin");
        System.out.println("Ingrese el año");
        alquiler.getFechaFin().setYear(input.nextInt()-1900);
        System.out.println("Ingrese el mes");
        alquiler.getFechaFin().setMonth(input.nextInt()-1);
        System.out.println("Ingrese el día");
        alquiler.getFechaFin().setDate(input.nextInt());
        
        alquiler.setPrecio(calcularPrecio());
        
        return alquiler;
    }
    
    public float calcularPrecio(){
        int cantDias = (int) (alquiler.getFechaFin().getTime()-alquiler.getFechaInicio().getTime()/(1000*60*60*24));
        if(cantDias<=3){
            return 10;            
        }else{            
            return (cantDias-3)+10;
        }
    }
    
    public void buscarAlquiler(Alquiler[] alquileres){
        Date fechaBusqueda = new Date();
        System.out.println("Ingrese el año");
        fechaBusqueda.setYear(input.nextInt()-1900);
        System.out.println("Ingrese el mes");
        fechaBusqueda.setMonth(input.nextInt()-1);
        System.out.println("Ingrese el día");
        fechaBusqueda.setDate(input.nextInt());
        
        boolean encontrada=false;
        
        for(Alquiler a: alquileres){            
            if(fechaBusqueda.equals(a.getFechaInicio())){
                System.out.println(a);
                encontrada=true;
            }      
        }
        
        if(!encontrada){
            System.out.println("Alquiler no encontrado");
        }      
    }
    
}
