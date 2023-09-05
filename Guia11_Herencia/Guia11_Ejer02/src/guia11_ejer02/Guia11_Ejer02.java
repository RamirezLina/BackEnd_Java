/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11_ejer02;

import Entities.Electrodomestico;
import Entities.Lavadora;
import Entities.Televisor;
import Services.OlimpicaServices;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia11_Ejer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Bienvenido a su tienda Olímpica Virtual");
        OlimpicaServices os = new OlimpicaServices();
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
         int opt;
        do {
            System.out.println("");
            System.out.println("Indique que desea hacer a continuación, digitando el número asociado a la opción");
            System.out.println("1. Crear un Televisor");
            System.out.println("2. Crear un Lavadora");
            System.out.println("3. Definir precios a los electrodomesticos");
            System.out.println("4. ..");
            System.out.println("5. Salir");
            opt = read.nextInt();

            switch (opt) {
                case 1:
                    Televisor t = new Televisor();
                    t.crearTelevisor();
                    System.out.println(t);
                    electrodomesticos.add(t);
                                        
                    break;
                case 2:
                    Lavadora l = new Lavadora();
                    l.crearLavadora();
                    System.out.println(l);
                    electrodomesticos.add(l);
                    
                    

                    break;
                case 3:
                    os.precioElcetrodomesticos(electrodomesticos);

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
