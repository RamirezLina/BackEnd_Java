/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Jugador;
import Entities.RevolverAgua;




/**
 * 
 * @author LINA RAMIREZ
 */
public class JugadorSer {

    public JugadorSer() {
    }
    
    
    
    public Jugador crearJugador(int i){
        Jugador j = new Jugador();
        j.setID(i+1);
        j.setName("Jugador "+(i+1));
        j.setMojado(false);
        return j;
    }
    
    public boolean disparo(RevolverAgua r, Jugador j){
        revolverSer rs = new revolverSer();
        boolean disparo;
        if (rs.mojar(r)){
            j.setMojado(true);
            disparo = true;
        }else{
            disparo = false;
            rs.siguienteChorro(r);
        }
        
        return disparo;
    }
    
    
            
}
