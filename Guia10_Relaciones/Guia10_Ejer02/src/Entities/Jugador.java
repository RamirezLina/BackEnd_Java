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
public class Jugador {
    private int ID;
    private String name;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int ID, String name, boolean mojado) {
        this.ID = ID;
        this.name = name;
        this.mojado = mojado;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Juego{" + "ID=" + ID + ", name=" + name + ", mojado=" + mojado + '}';
    }
}
