/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.time.LocalDate;

/**
 *
 * @author LINA RAMIREZ
 */
public class Cuota {
    private int numCuota;
    private float montoCuota;
    private boolean estadoPago;
    private LocalDate fechaVen;
    private String formaPago;

    public Cuota(int numCuota, float montoCuota, boolean estadoPago, LocalDate fechaVen, String formaPago) {
        this.numCuota = numCuota;
        this.montoCuota = montoCuota;
        this.estadoPago = estadoPago;
        this.fechaVen = fechaVen;
        this.formaPago = formaPago;
    }

    public Cuota() {
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public void setMontoCuota(float montoCuota) {
        this.montoCuota = montoCuota;
    }

    public void setEstadoPago(boolean estadoPago) {
        this.estadoPago = estadoPago;
    }

    public void setFechaVen(LocalDate fechaVen) {
        this.fechaVen = fechaVen;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public int getNumCuota() {
        return numCuota;
    }

    public float getMontoCuota() {
        return montoCuota;
    }

    public boolean isEstadoPago() {
        return estadoPago;
    }

    public LocalDate getFechaVen() {
        return fechaVen;
    }

    public String getFormaPago() {
        return formaPago;
    }

    @Override
    public String toString() {
        return "Cuota{" + "numCuota=" + numCuota + ", montoCuota=" + montoCuota + ", estadoPago=" + estadoPago + ", fechaVen=" + fechaVen + ", formaPago=" + formaPago + '}';
    }
    
    
    
}
