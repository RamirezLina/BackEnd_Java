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
public class Asiento {
    private int fila;
    private String columna;
    private String estado;

    public Asiento() {
    }

    public Asiento(int fila, String columna, String estado) {
        this.fila = fila;
        this.columna = columna;
        this.estado = estado;
    }

    
    
    public int getFila() {
        return fila;
    }

    public String getColumna() {
        return columna;
    }

    public String getEstado() {
        return estado;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  fila + columna + estado;
    }
    
    
}
