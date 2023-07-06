/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_extra04;

import Entidades.NIF;
import Services.NIFservices;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia8_Extra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NIFservices nfs = new NIFservices();
        
        System.out.println("Se procede a asignar el dígito verificador");
        NIF a = nfs.crearNif();
        System.out.println("El DNI con el digito verificado es: ");
        nfs.mostrar(a);
        
    }
    
}
