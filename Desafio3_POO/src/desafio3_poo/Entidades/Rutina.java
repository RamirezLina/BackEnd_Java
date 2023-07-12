/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio3_poo.Entidades;

/**
 *
 * @author Gabriel
 */
public class Rutina {
    private int id;
    private double duracion;
    private String nombre, nivelDificultad, descripcion;

    public Rutina() {
    }

    public Rutina(int id, double duracion, String nombre, String nivelDificultad, String descripcion) {
        this.id = id;
        this.duracion = duracion;
        this.nombre = nombre;
        this.nivelDificultad = nivelDificultad;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Rutina{" + "id=" + id + ", duracion=" + duracion + ", nombre=" + nombre + ", nivelDificultad=" + nivelDificultad + ", descripcion=" + descripcion + '}'+"\n";
    }
    
    
}
