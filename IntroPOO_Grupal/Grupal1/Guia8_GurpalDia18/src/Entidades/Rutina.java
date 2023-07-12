/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author LINA RAMIREZ
 */
public class Rutina {
    
    private int id; private int nivelDificultad; private int duracion;
    private String nombre; private String descripcion;

    public Rutina() {
    }

    public Rutina(int id, int nivelDificultad, int duracion, String nombre, String descripcion) {
        this.id = id;
        this.nivelDificultad = nivelDificultad;
        this.duracion = duracion;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Rutina{" + "id=" + id + ", nivelDificultad=" + nivelDificultad + ", duracion=" + duracion + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
    
    
}
