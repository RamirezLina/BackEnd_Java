/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Edificio;
import Entities.Oficina;
import Entities.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author LINA RAMIREZ
 */
public class EdifService {
    
    ArrayList<Edificio> edificios;

    public EdifService() {
        edificios = new ArrayList();
    }

    public ArrayList<Edificio> getEdificios() {
        return edificios;
    }

    public void setEdificios(ArrayList<Edificio> edificios) {
        this.edificios = edificios;
    }
    
    
    
    public void mostrarCalculos(){
        int techado = 0;
        int abierto = 0;
        for (Edificio e : edificios) {
            if (e instanceof Polideportivo) {
                Polideportivo object = (Polideportivo) e;
                System.out.println("Se presenta un polideportivo");
                e.calcularVolumen();
                e.calcularSuperficie();
                
                if (((Polideportivo) e).getTipoInstalacion().equalsIgnoreCase("Techado")) {
                    techado += 1;
                }else{
                    abierto += 1;
                }
            }
            
            if (e instanceof Oficina) {
                Oficina object = (Oficina) e;
                System.out.println("Se presenta un edifico de oficinas");
                e.calcularVolumen();
                e.calcularSuperficie();
                ((Oficina) e).cantPersonas();
            }
            System.out.println("");
        }
        
        System.out.println("Se tienen "+edificios.size()+" edificios registrados");
        System.out.println("Se tienen "+(edificios.size()-techado-abierto)+" edificios de oficinas");
        System.out.println("Se tienen "+(techado+abierto)+" polideportivos");
        System.out.println(techado+" con techo y "+ abierto + " sin techo");
    }
    
    
}
