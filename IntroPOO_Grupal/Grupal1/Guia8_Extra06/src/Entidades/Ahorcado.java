/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Ahorcado {
    Scanner read= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    private String[] palabra;
    private int letrasEncontradas;
    private int jugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int letrasEncontradas, int jugadasMax) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMax = jugadasMax;
    }
    
    

    public Scanner getRead() {
        return read;
    }

    public String[] getPalabra() {
        return palabra;
    }

    

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setRead(Scanner read) {
        this.read = read;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    
   

    @Override
    public String toString() {
        return "Ahorcado{" + "read=" + read +  ", letrasEncontradas=" + letrasEncontradas + ", jugadasMax=" + jugadasMax + '}';
    }
    
    
    
}
