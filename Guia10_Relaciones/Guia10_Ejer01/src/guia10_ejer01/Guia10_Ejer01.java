/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_ejer01;

import Services.PersonaServ;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia10_Ejer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PersonaServ ps = new PersonaServ();
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Bienvenido al programa para registrar personas y perros");
        
       
        int opt;
        do {       
            System.out.println("");
            System.out.println("Indique que desea hacer a continuación, digitando el número asociado a la opción");
            System.out.println("1. Registrar una persona");
            System.out.println("2. Registrar un perro");
            System.out.println("3. Asignar un perro a una persona");
            System.out.println("4. Mostrar la información de la persona");
            System.out.println("5. Salir");
            opt = read.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Registrar persona");
                    ps.registrarPersona();
                    break;
                case 2:
                    System.out.println("Registrar un perro");
                    ps.registrarPerro();

                    break;
                case 3:
                    ps.asignarPerro();

                    break;
                case 4:
                    ps.mostrarPersona();

                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción incorrecta, por favor seleccione una opción posible");
            }    
           
        } while (opt!=5);
    }
    
}
