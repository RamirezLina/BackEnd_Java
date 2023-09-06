/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitites;

import java.time.LocalDate;

/**
 *
 * @author LINA RAMIREZ
 */
public class Alquiler {
    private String nombreCliente;
    private int idCliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco barco;
    private double precioAlquiler;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, int idCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, Barco barco, double precioAlquiler) {
        this.nombreCliente = nombreCliente;
        this.idCliente = idCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
        this.precioAlquiler = precioAlquiler;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombreCliente=" + nombreCliente + ", idCliente=" + idCliente + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + ", precioAlquiler=" + precioAlquiler + '}';
    }
    
    public void alquilerBarco(){
        int dias = (int)(getFechaDevolucion().toEpochDay()-getFechaAlquiler().toEpochDay());
        setPrecioAlquiler(dias*barco.valorModulo());
        
    }
    
}
