/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11_ejer04;

import Entities.Circulo;
import Entities.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia11_Ejer04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Vamos a crear un circulo");
        Circulo circ = new Circulo();
        System.out.println("Indique el radio del circulo");
        circ.setRadio(read.nextDouble());
        circ.setDiametro(2*circ.getRadio());
        circ.calcularArea();
        circ.calcularPerimetro();
        System.out.println("-------------------------------");
        System.out.println("");
        System.out.println("Vamos a crear un rectangulo");
        Rectangulo rec = new Rectangulo();
        System.out.println("Escriba la base del rectangulo");
        rec.setBase(read.nextDouble());
        System.out.println("Escriba la altura dle rectangulo");
        rec.setAltura(read.nextDouble());
        rec.calcularArea();
        rec.calcularPerimetro();
        
        
    }
    
}
