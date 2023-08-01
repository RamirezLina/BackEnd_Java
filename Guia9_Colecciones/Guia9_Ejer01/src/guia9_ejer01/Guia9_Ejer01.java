/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_ejer01;

import Services.razaService;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia9_Ejer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        razaService rs = new razaService();
        rs.añadirRaza();
        System.out.println("");
        System.out.println("A eliminar una raza");
        rs.eliminarRaza();
    }
    
}
