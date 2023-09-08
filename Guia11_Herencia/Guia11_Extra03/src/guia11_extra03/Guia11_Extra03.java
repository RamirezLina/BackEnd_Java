/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11_extra03;

import Entities.Camping;
import Entities.Hotel4;
import Services.Services;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia11_Extra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Bienvenido");
        Services s = new Services();
        
        int opt;
        do {
            System.out.println("");
            System.out.println("Indique que desea hacer a continuación, digitando el número asociado a la opción");
            System.out.println("1. Crear un hotel de 4 estrellas");
            System.out.println("2. Crear un camping");
            System.out.println("3. Consultar todos los alojamietnos");
            System.out.println("4. Consultar los hoteles por precio de habitación");
            System.out.println("5. Salir");
            opt = read.nextInt();

            switch (opt) {
                case 1:
                    Hotel4 h = new Hotel4();
                    s.getAl().add(h);

                    break;
                case 2:
                    Camping c = new Camping();
                    s.getAl().add(c);

                    break;
                case 3:
                    s.mostrarAl();

                    break;
                case 4:
                    s.ordenarHoteles();

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
