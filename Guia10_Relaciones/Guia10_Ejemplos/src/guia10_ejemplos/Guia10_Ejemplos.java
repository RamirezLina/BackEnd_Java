/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_ejemplos;

import Entities.Dni;
import Entities.Equipo;
import Entities.Persona;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia10_Ejemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        EJEMPLO1
//        Persona per1 = new Persona();
//        per1.setName("Lina Ramirez");
//        per1.setLastname("Ramirez");
//        Dni dni = new Dni();
//        dni.setNum(1115089966);
//        dni.setSerie("Cedula");
//        per1.setDni(dni);
//        System.out.println(per1);

//          EJEMPLO2

          Equipo eq = new Equipo();
          eq.Anadirjugadores();
          System.out.println("El equipo esta conformado por:");
          eq.mostrarJugadores();
    }

}
