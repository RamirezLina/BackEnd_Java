/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Perro;
import Entities.Persona;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class PersonaServ {

    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private ArrayList<Persona> personas;
    private ArrayList<Perro> perros;

    public PersonaServ() {
        this.personas = new ArrayList();
        this.perros = new ArrayList();
    }

    public void registrarPersona() {
        Persona p = new Persona();
        System.out.println("Escriba el nombre de la persona");
        p.setName(read.next());
        System.out.println("Escriba el apellido de la persona");
        p.setApellido(read.next());
        System.out.println("Escriba la edad");
        p.setEdad(read.nextInt());
        System.out.println("Escriba el número de documento de identidad");
        p.setDocumento(read.nextInt());
        personas.add(p);
    }

    public void registrarPerro() {
        Perro per = new Perro();
        System.out.println("Escriba el nombre del perro");
        per.setNombre(read.next());
        System.out.println("Escriba la raza del perro");
        per.setRaza(read.next());
        System.out.println("Escriba la edad del perro, en número enteros");
        per.setEdad(read.nextInt());
        System.out.println("Escriba el tamaño del perro");
        per.setTamano(read.nextInt());

        perros.add(per);

    }

    public void mostrarPersona() {
        System.out.println("Las personas registradas son:");
        System.out.println("");
        for (Persona persona : personas) {
            System.out.println(persona);
            System.out.println("Las caracteristicas del perro de " + persona.getName() + " " + persona.getApellido() + " son:");
            Perro per = persona.getPerro();
            System.out.println(per);
            System.out.println("");
        }
        System.out.println("El numero de personas registradas son: "+personas.size());

    }

    public void asignarPerro() {
        System.out.println("Escriba el documento de identidad de la persona a asignar el perro");
        Integer dni = read.nextInt();
        boolean enc = false;
        boolean encPerro = false;

        for (Persona persona : personas) {
            if (Objects.equals(dni, persona.getDocumento())) {
                enc = true;
                System.out.println("Escriba el nombre del perro");
                String namePer = read.next();
                for (Perro perro : perros) {
                    if (namePer.equalsIgnoreCase(perro.getNombre())) {
                        persona.setPerro(perro);
                        encPerro = true;
                    }
                }

                if (!encPerro) {
                    System.out.println("No se tiene registrado el perro");
                }
                
            }
        }

        if (!enc) {
            System.out.println("No se tiene registrada la persona");
        }

    }
}
