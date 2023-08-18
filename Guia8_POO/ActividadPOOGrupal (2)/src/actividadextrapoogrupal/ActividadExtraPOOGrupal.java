/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadextrapoogrupal;

import entity.Alquiler;
import entity.Pelicula;
import java.util.Scanner;
import service.AlquilerService;
import service.PeliculaService;

/**
 *
 * @author chris
 */
public class ActividadExtraPOOGrupal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pelicula[] peliculas = new Pelicula[5];
        Alquiler[] alquileres = new Alquiler[3];

        PeliculaService peliculaServ = new PeliculaService();
        AlquilerService alquilerServ = new AlquilerService();

//        Pelicula pelicula = peliculaServ.crearPelicula();
        int opcion;

        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Ingrese una opción");

        do {
            System.out.println("(1) Cargar película");
            System.out.println("(2) Crear un alquiler");
            System.out.println("(3) Listar películas disponibles");
            System.out.println("(4) Listar alquileres ");
            System.out.println("(5) Buscar pelicula por titulo");
            System.out.println("(6) Buscar pelicula por género");
            System.out.println("(7) Buscar alquiler por fecha");
            System.out.println("(0) Finalizar");

            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        peliculas[i] = peliculaServ.crearPelicula();
                    }
                    break;
                case 2:
                    for (int i = 0; i < 3; i++) {
                        alquileres[i] = alquilerServ.crearAlquiler();
                    }
                    break;
                case 3:
                    peliculaServ.listarPeliculasDisponibles(peliculas);
                    break;
                case 4:
                    peliculaServ.listarPeliculasAlquiladas(peliculas);
                    break;
                case 5:
                    peliculaServ.buscarPorTitulo(peliculas);
                    break;
                case 6:
                    peliculaServ.buscarPorGenero(peliculas);
                    break;
                case 7:
                    alquilerServ.buscarAlquiler(alquileres);
                    break;
                default:
                    System.out.println("Opción invalida ");
                    ;
            }
        } while (opcion != 0);

    }

}
