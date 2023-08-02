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
public class Pelicula {
    private String titulo;
    private String director;
    private Double duracionh;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double duracionh) {
        this.titulo = titulo;
        this.director = director;
        this.duracionh = duracionh;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Double getDuracionh() {
        return duracionh;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracionh(Double duracionh) {
        this.duracionh = duracionh;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracionh=" + duracionh + '}';
    }
    
    
    
}
