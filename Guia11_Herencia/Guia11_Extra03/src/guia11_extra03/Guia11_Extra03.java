/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11_extra03;

import Entities.Camping;
import Entities.Hotel4;
import Entities.Hotel5;
import Entities.Residencia;
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
            System.out.println("2. Crear un hotel de 5 estrellas");
            System.out.println("3. Crear un camping");
            System.out.println("4. Crear una residencia");
            System.out.println("5. Consultar todos los alojamientos");
            System.out.println("6. Consultar los hoteles por precio de habitación");
            System.out.println("7. Consultar los campings con restaurante");
            System.out.println("8. Consultar las residencias con descuento");
            System.out.println("9. Salir");
            opt = read.nextInt();

            switch (opt) {
                case 1:
                    Hotel4 h4 = new Hotel4();
                    h4.setPrecioHab(h4.precioHab());
                    s.getAl().add(h4);

                    break;
                case 2:
                    Hotel5 h5 = new Hotel5();
                    h5.setPrecioHab(h5.precioHab());
                    s.getAl().add(h5);
                    break;
                case 3:
                    Camping c = new Camping();
                    s.getAl().add(c);

                    break;
                case 4:
                    Residencia r = new Residencia();
                    s.getAl().add(r);

                    break;
                case 5:
                    s.mostrarAl();

                    break;
                case 6:
                    s.ordenarHoteles();

                    break;
                case 7:
                    s.campingRest();

                    break;
                case 8:
                    s.residDisc();

                    break; 
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción incorrecta, por favor seleccione una opción posible");
            }

        } while (opt != 9);
    }
    
  
    
}
