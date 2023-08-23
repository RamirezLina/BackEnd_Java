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
public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int anio;
    private int numMotor;
    private String chasis;
    private String color;
    private String tipo;

    public Vehiculo(String placa, String marca, String modelo, int anio, int numMotor, String chasis, String color, String tipo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numMotor = numMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public Vehiculo() {
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public String getColor() {
        return color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", numMotor=" + numMotor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + '}';
    }
    
    
}
