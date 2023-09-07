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
public class Hotel4 extends Hotel{
    protected char gimnasio;
    protected String restaurante;
    protected int capacidadRest;

    public Hotel4() {
    }

    public Hotel4(char gimnasio, String restaurante, int capacidadRest, int numHabitaciones, int numCamas, int numPisos, double precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(numHabitaciones, numCamas, numPisos, precioHab, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.restaurante = restaurante;
        this.capacidadRest = capacidadRest;
    }

    public char getGimnasio() {
        return gimnasio;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public int getCapacidadRest() {
        return capacidadRest;
    }

    public void setGimnasio(char gimnasio) {
        this.gimnasio = gimnasio;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public void setCapacidadRest(int capacidadRest) {
        this.capacidadRest = capacidadRest;
    }
    
    
}
