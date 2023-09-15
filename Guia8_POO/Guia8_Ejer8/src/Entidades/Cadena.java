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
public class Cadena {
    private String frase;
    private int longFrase;

    public Cadena(String frase, int longFrase) {
        this.frase = frase;
        this.longFrase = longFrase;
    }

    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }

    public int getLongFrase() {
        return longFrase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongFrase(int longFrase) {
        this.longFrase = longFrase;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longFrase=" + longFrase + '}';
    }
    
    
    
}
