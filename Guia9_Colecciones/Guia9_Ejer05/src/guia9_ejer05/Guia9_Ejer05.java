/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_ejer05;

import Services.PaisServ;
import java.util.HashSet;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia9_Ejer05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisServ ps = new PaisServ();
        
        ps.añadirPais();
        System.out.println("La lista de paises ordenada alfabeticamente es...");
        ps.ordenarPaises();
        System.out.println("");
        ps.eliminarPais();
        
        
    }
    
}
