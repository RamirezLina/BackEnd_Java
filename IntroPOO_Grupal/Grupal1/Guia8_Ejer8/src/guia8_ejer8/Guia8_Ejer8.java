/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejer8;

import Entidades.Cadena;
import Entidades.CadenaServicios;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia8_Ejer8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner read = new Scanner (System.in).useDelimiter("\n");
       CadenaServicios cs = new CadenaServicios();
       Cadena c1 = new Cadena();
       
       cs.llenarCadena(c1);
        System.out.println(c1);
       System.out.println("El numero de vocales de la frase es "+ cs.mostrarVocales(c1));
        System.out.println("La frase invertida corresponde a:");
        System.out.println(cs.invertirFrase(c1));
    }
    
}
