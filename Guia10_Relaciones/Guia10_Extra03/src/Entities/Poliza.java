/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author LINA RAMIREZ
 */
public class Poliza {
    private int numPoliza;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int numCuotas;
    private String formaPago;
    private float montoTotal;
    private float maxGranizo;
    private String tipoCobertura;
    private ArrayList<Cuota> cuotas;

    public Poliza() {
    }

    public Poliza(int numPoliza, Vehiculo vehiculo, Cliente cliente, LocalDate fechaInicio, LocalDate fechaFin, int numCuotas, String formaPago, float montoTotal, float maxGranizo, String tipoCobertura, ArrayList<Cuota> cuotas) {
        this.numPoliza = numPoliza;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.numCuotas = numCuotas;
        this.formaPago = formaPago;
        this.montoTotal = montoTotal;
        this.maxGranizo = maxGranizo;
        this.tipoCobertura = tipoCobertura;
        this.cuotas = cuotas;
    }

    public int getNumPoliza() {
        return numPoliza;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public int getNumCuotas() {
        return numCuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public float getMaxGranizo() {
        return maxGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    public void setNumPoliza(int numPoliza) {
        this.numPoliza = numPoliza;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setNumCuotas(int numCuotas) {
        this.numCuotas = numCuotas;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public void setMaxGranizo(float maxGranizo) {
        this.maxGranizo = maxGranizo;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public String toString() {
        return "Poliza{" + "numPoliza=" + numPoliza + ", vehiculo=" + vehiculo + ", cliente=" + cliente + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", numCuotas=" + numCuotas + ", formaPago=" + formaPago + ", montoTotal=" + montoTotal + ", maxGranizo=" + maxGranizo + ", tipoCobertura=" + tipoCobertura + ", cuotas=" + cuotas + '}';
    }
    
    
    
    
    
    
}
