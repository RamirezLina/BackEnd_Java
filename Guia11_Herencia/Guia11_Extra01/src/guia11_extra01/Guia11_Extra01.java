/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11_extra01;

import Entitites.Barco;
import Entitites.BarcoMotor;
import Entitites.Velero;
import Entitites.Yate;
import Services.AlquilerServices;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia11_Extra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Bienvenido a Oceanalq, para alquilar amarres y barcos");
        AlquilerServices as = new AlquilerServices();
        ArrayList<Barco> barcos = new ArrayList();
        barcos.add(new Barco(111, 2, 1997));
        barcos.add(new Barco(222, 7, 1993));
        barcos.add(new Barco(333, 5, 2005));
        barcos.add(new Velero(3,444, 10, 2020));
        barcos.add(new BarcoMotor(15,555, 6, 2008));
        barcos.add(new Yate(2,15,666, 20, 2022));

        int opt;
        do {
            System.out.println("");
            System.out.println("Indique que desea hacer a continuación, digitando el número asociado a la opción");
            System.out.println("1. Mostrar barcos disponibles");
            System.out.println("2. Estimar precio de alquiler");
            System.out.println("3. Ver alquileres a su nombre");
            System.out.println("4. ..");
            System.out.println("5. Salir");
            opt = read.nextInt();

            switch (opt) {
                case 1:
                    as.mostrarBarcos(barcos);

                    break;
                case 2:
                    as.precioAlquiler(barcos);

                    break;
                case 3:
                    as.alquilerCliente();

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
