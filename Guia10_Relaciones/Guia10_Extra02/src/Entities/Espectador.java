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
public class Espectador {
    private String nombre;
    private int edad;
    private float dineroDisp;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, float dineroDisp) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisp = dineroDisp;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getDineroDisp() {
        return dineroDisp;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDineroDisp(float dineroDisp) {
        this.dineroDisp = dineroDisp;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dineroDisp=" + dineroDisp + '}';
    }
    
    
}
