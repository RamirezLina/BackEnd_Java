/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author LINA RAMIREZ
 */
public class Hotel extends Alojamiento{
    
    protected int numHabitaciones;
    protected int numCamas;
    protected int numPisos;
    protected double precioHab;

    public Hotel() {
    }

    public Hotel(int numHabitaciones, int numCamas, int numPisos, double precioHab, String nombre, String direccion, String localidad, String gerente) {
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

    public void setPrecioHab(double precioHab) {
        this.precioHab = precioHab;
    }
    
    
    
}
