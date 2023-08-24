/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_extra02;

import Services.CineServices;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia10_Extra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido a su aplicacion del cine");
        CineServices cs = new CineServices();
        cs.crearCine();
        System.out.println("Se ha definido la funcion");
        System.out.println(cs.getCine().getPelicula());
        
        System.out.println("");
        System.out.println("Estan llegando los espectadores");
        cs.crearEspectadores();
        
        System.out.println("Se ubican los espectadores aleatoriamente");
        cs.UbicarEspectadores();

        
        System.out.println("La función queda finalmente asi:");
        cs.mostrarSala();
    }
    
}
