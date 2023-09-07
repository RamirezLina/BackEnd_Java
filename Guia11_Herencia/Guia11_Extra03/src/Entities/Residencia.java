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
public class Residencia extends Extrahotel{
    protected int numHab;
    protected boolean discGremios;
    protected boolean cDeportivo;

    public Residencia() {
    }

    public Residencia(int numHab, boolean discGremios, boolean cDeportivo) {
        this.numHab = numHab;
        this.discGremios = discGremios;
        this.cDeportivo = cDeportivo;
    }

    public int getNumHab() {
        return numHab;
    }

    public void setNumHab(int numHab) {
        this.numHab = numHab;
    }

    public boolean isDiscGremios() {
        return discGremios;
    }

    public void setDiscGremios(boolean discGremios) {
        this.discGremios = discGremios;
    }

    public boolean iscDeportivo() {
        return cDeportivo;
    }

    public void setcDeportivo(boolean cDeportivo) {
        this.cDeportivo = cDeportivo;
    }
    
    
    
}
