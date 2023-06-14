/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejer02;

import Elementos.Circunferencia;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia8_Ejer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circunferencia primer = new Circunferencia(1);
        System.out.println(primer);
        System.out.println(primer.getRadio());
        primer.setRadio(2);
        System.out.println("Ahora, el radio es "+primer.getRadio());
        
        Circunferencia segund = new Circunferencia();
        segund.crearCircunferencia();
        
        System.out.println(primer.area());
        System.out.println(segund.area());
        System.out.println(segund.perimetro());
    }
    
}
