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
public class Libro {
    private String titulo;
    private String autor;
    private Integer ejemplaresDisp;
    private Integer ejemplaresPrest;

    public Libro(String titulo, String autor, Integer ejemplaresDisp, Integer ejemplaresPrest) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplaresDisp = ejemplaresDisp;
        this.ejemplaresPrest = ejemplaresPrest;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getEjemplaresDisp() {
        return ejemplaresDisp;
    }

    public Integer getEjemplaresPrest() {
        return ejemplaresPrest;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEjemplaresDisp(Integer ejemplaresDisp) {
        this.ejemplaresDisp = ejemplaresDisp;
    }

    public void setEjemplaresPrest(Integer ejemplaresPrest) {
        this.ejemplaresPrest = ejemplaresPrest;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ejemplaresDisp=" + ejemplaresDisp + ", ejemplaresPrest=" + ejemplaresPrest + '}';
    }
    
    
    
    
    
}
