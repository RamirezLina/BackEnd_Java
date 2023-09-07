/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11_extra02;

import Entities.Oficina;
import Entities.Polideportivo;
import Services.EdifService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia11_Extra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Bienvenido");
        EdifService efs = new EdifService();
        
                int opt;
        do {
            System.out.println("");
            System.out.println("Indique que desea hacer a continuación, digitando el número asociado a la opción");
            System.out.println("1. Crear un edificio tipo polideportivo");
            System.out.println("2. Crear un edificio tipo oficinas");
            System.out.println("3. Ver la superficie y el volumen de cada edificio");
            System.out.println("4. ..");
            System.out.println("5. Salir");
            opt = read.nextInt();

            switch (opt) {
                case 1:
                    Polideportivo p = new Polideportivo();
                    efs.getEdificios().add(p);

                    break;
                case 2:
                    Oficina of = new Oficina();
                    efs.getEdificios().add(of);

                    break;
                case 3:
                    efs.mostrarCalculos();

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción incorrecta, por favor seleccione una opción posible");
            }

        } while (opt != 5);
    }
    
    
}
