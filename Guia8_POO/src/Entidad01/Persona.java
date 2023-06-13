/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad01;

/**
 *
 * @author LINA RAMIREZ
 */
public class Persona {
    public String nombre;
    public int edad;
    public String Genero;

    public Persona(String nombre, int edad, String Genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.Genero = Genero;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", Genero=" + Genero + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    
    
    
    
    
}
