/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio3_poo;

import desafio3_poo.Entidades.Cliente;
import desafio3_poo.Entidades.Rutina;
import desafio3_poo.Servicios.ServicioCliente;
import desafio3_poo.Servicios.ServicioRutina;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class Desafio3_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //POSIBLES CLIENTES
        Cliente cliente1= new Cliente(1, 21, 1.8, 70, "Pepe", "musculacion");
        Cliente cliente2= new Cliente(2, 21, 1.8, 70, "Pepa", "musculacion");
        Cliente cliente3= new Cliente(3, 21, 1.8, 70, "Pepe", "musculacion");
        Cliente cliente4= new Cliente(4, 21, 1.8, 70, "Pepa", "musculacion");
        Cliente cliente5= new Cliente(5, 21, 1.8, 70, "Pepe", "musculacion");
        
        Rutina rutina1= new Rutina(1, 1.5, "rutina1", "Facil", "rutina genial");
        Rutina rutina2= new Rutina(2, 1.5, "rutina2", "Media", "rutina fantastica");
        Rutina rutina3= new Rutina(3, 1.5, "rutina3", "Dificil", "rutina genial");
        Rutina rutina4= new Rutina(4, 1.5, "rutina4", "Brutal", "rutina fantastica");
        Rutina rutina5= new Rutina(5, 1.5, "rutina5", "Facil", "rutina genial");


//        ArrayList<Cliente> listaClientes = new ArrayList<>();
//
//        // Agregar elementos al ArrayList
//        listaClientes.add(cliente1);
//        listaClientes.add(cliente2);
        
        //SERVICIO Y REGISTRO
        //Servicio Cliente
        System.out.println("*******INICIAL***************");

        ServicioCliente sc= new ServicioCliente();
        sc.registrarCliente(cliente1);
        sc.registrarCliente(cliente2);
        sc.registrarCliente(cliente3);
        sc.registrarCliente(cliente4);
        sc.registrarCliente(cliente5);

        System.out.println(sc.obtenerClientes());
        
        //Servicio Rutina
        ServicioRutina sr= new ServicioRutina();
        sr.registrarRutina(rutina1);
        sr.registrarRutina(rutina2);
        sr.registrarRutina(rutina3);
        sr.registrarRutina(rutina4);
        sr.registrarRutina(rutina5);
        
        System.out.println(sr.obtenerRutinas());
        
        //ACTUALIZAMOS
        System.out.println("*******ACTUALIZAMOS***************");
        sc.actualizarCliente(2, "juana", 20, 1.7, 70, "bajar de peso");
        System.out.println(sc.obtenerClientes());
        
        sr.actualizarRutina(1, "rutina1", 2, "Dificil", "Aburrida");
        System.out.println(sr.obtenerRutinas());

        //BORRAMOS
        System.out.println("*******BORRAMOS***************");

        sc.eliminarCliente(2);
        System.out.println(sc.obtenerClientes());
        
        sr.eliminarRutina(2);
        System.out.println(sr.obtenerRutinas());

    }
    
}
