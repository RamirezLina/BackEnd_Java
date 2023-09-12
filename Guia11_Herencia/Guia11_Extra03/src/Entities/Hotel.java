/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Hotel extends Alojamiento{
    
    protected int numHabitaciones;
    protected int numCamas;
    protected int numPisos;
    protected Double precioHab;

    public Hotel() {
        Scanner read= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Creando un hotel");
        System.out.println("Indique el numero de habitaciones");
        numHabitaciones = read.nextInt();
        System.out.println("Indique el número de camas");
        numCamas = read.nextInt();
        System.out.println("Indique el número de pisos");
        numPisos = read.nextInt();
        
    }

    public Hotel(int numHabitaciones, int numCamas, int numPisos, Double precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.numHabitaciones = numHabitaciones;
        this.numCamas = numCamas;
        this.numPisos = numPisos;
        this.precioHab = precioHab;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public double getPrecioHab() {
        return precioHab;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public void setPrecioHab(Double precioHab) {
        this.precioHab = precioHab;
    }
    
    public Double precioHab(){
        Double precio;
        
        precio = 50d + (1*getNumCamas());
        
        return precio;
    }
    
    @Override
    public String toString() {
        return "Alojamiento{" + "nombre=" + nombre +  ", precio habitación="+precioHab+'}';
    }
    
    
}
