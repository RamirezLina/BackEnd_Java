/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;

/**
 *
 * @author LINA RAMIREZ
 */
public class Juego {
   private ArrayList<Jugador> jugadores;
   private RevolverAgua r;

    
    public Juego() {
        this.jugadores = new ArrayList();
        this.r = new RevolverAgua();
    }

    public Juego(ArrayList<Jugador> jugadores, RevolverAgua r) {
        this.jugadores = jugadores;
        this.r = r;
    }
    

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public RevolverAgua getR() {
        return r;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void setR(RevolverAgua r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", r=" + r + '}';
    }
   
   
    
    
}
