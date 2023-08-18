/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Juego;
import Entities.Jugador;
import Entities.RevolverAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class JuegoSer {
    
    private JugadorSer js;
    private Juego juego;

    public JuegoSer() {
        this.js =  new JugadorSer();
        this.juego = new Juego();
    }

    public JugadorSer getJs() {
        return js;
    }

    public Juego getJuego() {
        return juego;
    }
    
    
    public void llenarJuego(RevolverAgua r){
        Scanner read= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Ingrese el número de jugadores");
        int jug = read.nextInt();
        if (jug>6 || jug<1) {
            jug = 6;
        }
        
        
        ArrayList<Jugador>jugadores = new ArrayList();
        
        for (int i = 0; i < jug; i++) {
            Jugador j = js.crearJugador(i);
            jugadores.add(j);
            
        }
        
        
        juego.setJugadores(jugadores);
        juego.setR(r);
        
    }
    
    public void ronda(int i){
        Jugador j = juego.getJugadores().get(i);
        
        System.out.println("El "+j.getName()+" se apunta con el revolver de agua y aprieta el gatillo...");
        boolean res = js.disparo(juego.getR(), j);
        ;
        if (res) {
            
            System.out.println("El "+j.getName()+" se ha mojado");
            System.out.println("");
        }else{
            System.out.println("El "+j.getName()+" no se ha mojado");
            System.out.println("Siguiente jugador...");
            System.out.println("");
            
        }
    }
    
}
