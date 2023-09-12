/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11_extra04;

import Entities.Empleado;
import Entities.Estudiante;
import Entities.PerServicio;
import Entities.Persona;
import Entities.Profesor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia11_Extra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Bienvenido al Sistema de Gestión de la Facultad");
        ArrayList< Persona> p = new ArrayList();

        int opt;
        do {
            System.out.println("");
            System.out.println("Indique que desea hacer a continuación, digitando el número asociado a la opción");
            System.out.println("1. Registrar un estudiante");
            System.out.println("2. Registrar un profesor");
            System.out.println("3. Registrar un empleado del personal de servicio");
            System.out.println("4. Cambiar el estado civil de una persona");
            System.out.println("5. Reasignación de despacho a un empleado.");
            System.out.println("6. Matricular un estudiante en un nuevo curso.");
            System.out.println("7. Cambio de departamento de un profesor.");
            System.out.println("8. Traslado de sección de un empleado del personal de servicio.");
            System.out.println("9. Mostrar todas las personas asociadas al afacultada");
            System.out.println("10. Salir");
            opt = read.nextInt();
            int ID;
            int num;

            switch (opt) {
                case 1:
                    Persona per = new Estudiante();
                    System.out.println("Indique el número de estudiantes a registrar");
                    num = read.nextInt();
                    for (int i = 1; i < num + 1; i++) {
                        per = new Estudiante("MAT", "Luis", "R", "M", 10 + i, "Soltero");
                        p.add(per);
                    }

                    break;
                case 2:
                    Persona prof = new Profesor();
                    System.out.println("Indique el número de profesores a registrar");
                    num = read.nextInt();
                    for (int i = 1; i < num + 1; i++) {
                        prof = new Profesor("MAT", 2012, i, "Pedro", "Paramo", "Juarez", 20 + i, "Casado");
                        p.add(prof);
                    }

                    break;
                case 3:
                    Persona serv = new PerServicio();
                    System.out.println("Indique el número de personal a registrar");
                    num = read.nextInt();
                    for (int i = 1; i < num + 1; i++) {
                        serv = new PerServicio("BIB", 2012, i, "Pedro", "Paramo", "Juarez", 40 + i, "Casado");
                        p.add(serv);
                    }

                    break;
                case 4:

                    Persona persona = new Persona();
                    do {
                        System.out.println("Escriba el ID de la persona a editar");
                        ID = read.nextInt();
                        persona = buscarPersona(ID, p, persona);
                    } while (persona.getID() == 0);
                    persona.cambiarEC();

                    break;
                case 5:

                    Empleado emp = new Empleado() {
                    };

                    do {
                        System.out.println("Escriba el ID de la persona a editar");
                        ID = read.nextInt();
                        emp = (Empleado) buscarPersona(ID, p, emp);
                    } while (emp.getID() == 0);
                    emp.asigDespacho();
                    break;
                case 6:
                    ;
                    Estudiante est = new Estudiante();

                    do {
                        System.out.println("Escriba el ID de la persona a editar");
                        ID = read.nextInt();
                        est = (Estudiante) buscarPersona(ID, p, est);
                    } while (est.getID() == 0);
                    est.cambioCruso();

                    break;
                case 7:
                    System.out.println("Escriba el ID de la persona a editar");
                    ID = read.nextInt();
                    Profesor pro = new Profesor() {
                    };

                    do {
                        pro = (Profesor) buscarPersona(ID, p, pro);
                    } while (pro.getID() == 0);
                    pro.cambioDpto();

                    break;
                case 8:
                    System.out.println("Escriba el ID de la persona a editar");
                    ID = read.nextInt();
                    PerServicio servi = new PerServicio() {
                    };

                    do {
                        servi = (PerServicio) buscarPersona(ID, p, servi);
                    } while (servi.getID() == 0);
                    servi.trasladar();

                    break;
                case 9:
                    for (Persona rp : p) {
                        System.out.println(rp);
                    }
                    break;
                case 10:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción incorrecta, por favor seleccione una opción posible");
            }

        } while (opt != 10);
    }

    public static Persona buscarPersona(int ID, ArrayList<Persona> per, Persona p1) {

        for (Persona p : per) {
            if (p.getID() == ID) {
                p1 = p;
            }
        }
        return p1;
    }

}
