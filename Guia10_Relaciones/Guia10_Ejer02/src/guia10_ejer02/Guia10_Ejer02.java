/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_ejer02;

import Entities.Jugador;
import Entities.RevolverAgua;
import Services.JuegoSer;
import Services.revolverSer;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia10_Ejer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido al juego de la ruleta rusa de agua");
        JuegoSer js = new JuegoSer();
        revolverSer rs = new revolverSer();
        
        RevolverAgua r = rs.getR();
        rs.llenarRevolver(r);
        js.llenarJuego(r);
        boolean finJuego = false;
        System.out.println("Empecemos el juego...");
        do {            
            for (int i = 0; i < js.getJuego().getJugadores().size(); i++) {
                rs.mostrarR(js.getJuego().getR());
                js.ronda(i);
                Jugador j = js.getJuego().getJugadores().get(i);
                finJuego = j.isMojado();
                if (finJuego) {
                    System.out.println("Fin del juego!!");
                    break;
                }
            }
            
            
        } while (!finJuego);
        
    }
    
}
