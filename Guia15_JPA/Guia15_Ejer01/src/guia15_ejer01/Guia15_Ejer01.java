/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia15_ejer01;

import Services.AutorService;
import Services.EditorialService;
import Services.LibroService;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia15_Ejer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LibroService ls = new LibroService();
        AutorService as = new AutorService();
        EditorialService eds = new EditorialService();

        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Bienvenido a la aplicación de prestamo de la Libreria");

        int opt;
        do {
            System.out.println("");
            System.out.println("Indique que desea hacer a continuación, digitando el número asociado a la opción");
            System.out.println("1. Añadir una entidad en la base de datos");
            System.out.println("2. Modificar una entidad en la base de datos");
            System.out.println("3. Eliminar una entidad en la base de datos");
            System.out.println("4. Listar entidades activas");
            System.out.println("5. Buscar un autor por nombre");
            System.out.println("6. Buscar un libro por ISBN");
            System.out.println("7. Buscar un libro por titulo");
            System.out.println("8. Buscar libros por nombre de autor");
            System.out.println("9. Buscar libros por nombre de editorial");
            System.out.println("10. Salir");
            System.out.println("");
            opt = read.nextInt();
            System.out.println("");

            switch (opt) {
                case 1:
                    try {

                        System.out.println("Indique que entidad desea añadir");
                        System.out.println("1. Libro");
                        System.out.println("2. Autor");
                        System.out.println("3. Editorial");
                        int resp = read.nextInt();

                        switch (resp) {
                            case 1:

                                System.out.println("Creando 3 libros");
                                ls.crearLibro((long) 111, "Ridicula", 2002, 5, 0, 5, 1, 4);
                                ls.crearLibro((long) 222, "Camelias", 1980, 3, 0, 3, 2, 5);
                                ls.crearLibro((long) 333, "Manuel Pacho", 2010, 7, 0, 7, 3, 6);
                                break;
                            case 2:

                                System.out.println("Creando 3 autores");
                                as.crearAutor("Rosa Montero");
                                as.crearAutor("Alejandro Dumas");
                                as.crearAutor("Eduardo Caballero");

                                break;
                            case 3:
                                System.out.println("Creando 3 editoriales");
                                eds.crearEditorial("Seix Barral");
                                eds.crearEditorial("Alma");
                                eds.crearEditorial("Norma");
                                break;
                            default:
                                throw new AssertionError();
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                case 2:

                    try {

                        System.out.println("Indique que entidad desea modificar");
                        System.out.println("1. Libro");
                        System.out.println("2. Autor");
                        System.out.println("3. Editorial");
                        int resp = read.nextInt();
                        Integer id;
                        String nombre;
                        switch (resp) {
                            case 1:

                                System.out.println("Indique el ISBN del libro a modificar");
                                ls.modificarLibro(read.nextLong());
                                break;
                            case 2:

                                System.out.println("Indique el ID del autor a modificar");
                                id = read.nextInt();
                                System.out.println("Indique el nuevo nombre");
                                nombre = read.next();

                                as.modificarAutor(id, nombre);
                                break;
                            case 3:
                                System.out.println("Indique el ID de la editorial a modificar");
                                id = read.nextInt();
                                System.out.println("Indique el nuevo nombre");
                                nombre = read.next();

                                eds.modificarEditorial(id, nombre);
                                break;
                            default:
                                throw new AssertionError();
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }

                    break;
                case 3:
                    try {

                        System.out.println("Indique que entidad desea eliminar");
                        System.out.println("1. Libro");
                        System.out.println("2. Autor");
                        System.out.println("3. Editorial");
                        int resp = read.nextInt();

                        switch (resp) {
                            case 1:

                                System.out.println("Indique el ISBN del libro a eliminar");
                                ls.eliminarLibro(read.nextLong());
                                break;
                            case 2:

                                System.out.println("Indique el ID del autor a eliminar");
                                as.eliminarAutor(read.nextInt());
                                break;
                            case 3:
                                System.out.println("Indique el ID de la editorial a eliminar");
                                eds.eliminarEditorial(read.nextInt());
                                break;
                            default:
                                throw new AssertionError();
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }

                    break;
                case 4:
                    try {

                        System.out.println("Indique que entidades activas desea listar");
                        System.out.println("1. Libro");
                        System.out.println("2. Autor");
                        System.out.println("3. Editorial");
                        int resp = read.nextInt();
                        switch (resp) {
                            case 1:
                                System.out.println("Libros activos");
                                ls.imprimirLibros(ls.listarLibroActivo());
                                break;
                            case 2:
                                System.out.println("Autores activos");
                                as.imprimirAutores(as.listarAutorActivo());
                                break;
                            case 3:
                                System.out.println("Editoriales activas");
                                eds.imprimirEditoriales(eds.listarEditorialActivo());
                                break;
                            default:
                                throw new AssertionError();
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }

                    break;
                case 5:
                    try {
                        System.out.println("Escriba el nombre del autor que desea buscar");
                        as.imprimirAutores(as.listarAutorNombre(read.next()));
                        

                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }

                    break;
                case 6:

                    try {

                        System.out.println("Escribe el codigo del libro ISBN a buscar");
                        ls.imprimirLibro(ls.listarLibroISBN(read.nextLong()));

                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }

                    break;
                case 7:
                    try {

                        System.out.println("Escriba el titulo del libro a buscar");
                        ls.imprimirLibros(ls.listarLibroTitulo(read.next()));
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }

                    break;
                case 8:
                    try {
                        
                        System.out.println("Escriba el nombre del autor del que desea ver los libros");
                        ls.imprimirLibros(ls.listarLibroAutor(read.next()));

                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }

                case 9:
                    try {
                        System.out.println("Escriba el nombre de la editorial de la que desea ver los libros");
                        ls.imprimirLibros(ls.listarLibroEditorial(read.next()));

                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }

                case 10:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción incorrecta, por favor seleccione una opción posible");
            }

        } while (opt != 10);
    }

}
