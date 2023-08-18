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
public class Equipo {
    private ArrayList <Jugador> jugadores;
    
    public void Anadirjugadores(){
        jugadores = new ArrayList();
        for (int i = 0; i < 5; i++) {
            Jugador j = new Jugador ();
            j.setName("Esteban");
            j.setLastname("Sanchez");
            j.setPosicion(3);
            j.setNum(i);
            jugadores.add(j);
            
        }
        
        for (int i = 5; i < 11; i++) {
            Jugador j = new Jugador ();
            j.setName("Lina");
            j.setLastname("Ramirez");
            j.setPosicion(1);
            j.setNum(i);
            jugadores.add(j);
            
        }
        
    }
    
    public void mostrarJugadores(){
        for (Jugador j : jugadores) {
            System.out.println(j);
        }
    }

    @Override
    public String toString() {
        return "Equipo{" + "jugadores=" + jugadores + '}';
    }
    
    
}
