/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;

/**
 *
 * @author LINA RAMIREZ
 */
public class Cine {
    private ArrayList<ArrayList<Asiento>> sala;
    private Pelicula pelicula;
    private float precioEntrada;

    public Cine() {
       this.sala = new ArrayList();
    
    }

    public ArrayList<ArrayList<Asiento>> getSala() {
        return sala;
    }

    public void setSala(ArrayList<ArrayList<Asiento>> sala) {
        this.sala = sala;
    }
   
    

    public Pelicula getPelicula() {
        return pelicula;
    }

    public float getPrecioEntrada() {
        return precioEntrada;
    }

    

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public void setPrecioEntrada(float precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine{" + "sala=" + sala + ", pelicula=" + pelicula + ", precioEntrada=" + precioEntrada + '}';
    }
    
    
}
