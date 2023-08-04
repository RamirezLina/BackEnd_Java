/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_extra3;

import Entities.Libreria;
import Entities.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia9_Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        HashSet<Libro> Libros = new HashSet();
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Libreria lib = new Libreria();

        System.out.println("Bienvenido a su aplicación de Biblioteca");

        int opt;
        do {
            System.out.println("");
            System.out.println("Indique que desea hacer a continuación, digitando el número asociado a la opción");
            System.out.println("1. Añadir un libro");
            System.out.println("2. Registrar el prestamo de un libro");
            System.out.println("3. Registrar la devolución de un libro");
            System.out.println("4. Mostrar los libros registrados");
            System.out.println("5. Salir");
            opt = read.nextInt();

            switch (opt) {
                case 1:
                    String resp;
                    do {
                        System.out.println("Desea añadir un libro? Responda Si/No");
                        resp = read.next();
                    } while (!resp.equalsIgnoreCase("si") && !resp.equalsIgnoreCase("no"));

                    while (resp.equalsIgnoreCase("si")) {
                        Libro l = new Libro();
                        System.out.println("Escriba el título del libro");
                        l.setTitulo(read.next());
                        System.out.println("Escriba el autor del libro");
                        l.setAutor(read.next());
                        System.out.println("Escriba el numero de ejemplares en la librería");
                        l.setEjemplaresDisp(read.nextInt());
                        l.setEjemplaresPrest(0);
                        Libros.add(l);

                        do {
                            System.out.println("Desea añadir un nuevo libro? Responda Si/No");
                            resp = read.next();
                        } while (!resp.equalsIgnoreCase("si") && !resp.equalsIgnoreCase("no"));

                    }
                    break;
                case 2:
                    System.out.println("Ingrese el Titulo del libro a prestar");
                    String titulo = read.next();
                    Libro libro;
                    boolean encontrar = false;
                    for (Libro l : Libros) {
                        if (l.getTitulo().equalsIgnoreCase(titulo)) {
                            libro = l;
                            encontrar = true;
                            if (lib.prestamo(l)) {
                                System.out.println("Se ha registrado el prestamo corectamente");
 
                            }else{
                                System.out.println("Todos los libros en el inventario estan prestados");
                            }
                            break;
                        }
                    }
                    
                    if (!encontrar) {
                        System.out.println("El libro no se encuentra en la Biblioteca");
                    }

                    break;
                case 3:
                    System.out.println("Ingrese el Titulo del libro a devolver");
                    String tituloD = read.next();
                    Libro libroD;
                    boolean encontrarD = false;
                    for (Libro l : Libros) {
                        if (l.getTitulo().equalsIgnoreCase(tituloD)) {
                            libro = l;
                            encontrarD= true;
                            if (lib.devolucion(l)) {
                                System.out.println("Se ha registrado la devolución corectamente");
 
                            }else{
                                System.out.println("No hay ejemplares prestados, no acepte la devolución! ");
                            }
                            break;
                        }
                    }
                    
                    if (!encontrarD) {
                        System.out.println("El libro no se encuentra en la Biblioteca");
                    }

                    break;
                case 4:
                    lib.mostrarLibros(Libros);

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
