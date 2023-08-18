/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejer04;

import Anexos.Rectangulo;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia8_Ejer04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo primer = new Rectangulo();
        primer.crear();
        System.out.println(primer);
        System.out.println("");
        primer.dibujar();
        System.out.println("");
        System.out.println("El área del rectangulo es "+primer.area());
        System.out.println("El perimetro del rectangulo es "+primer.perimetro());
    }
    
}
