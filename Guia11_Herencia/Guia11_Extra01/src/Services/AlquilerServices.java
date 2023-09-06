/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entitites.Alquiler;
import Entitites.Barco;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class AlquilerServices {
    public Scanner read;
    private ArrayList <Alquiler> lista;

    public AlquilerServices() {
        read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        lista = new ArrayList();
    }
    
    
    
    public void precioAlquiler(ArrayList <Barco> barcos){
        Alquiler al = new Alquiler();
        System.out.println("Indique la fecha de alquiler");
        System.out.println("Indique el dia");
        int dia = read.nextInt();
        System.out.println("Indique el mes");
        int mes = read.nextInt();
        System.out.println("Indique el año");
        int año = read.nextInt();
        al.setFechaAlquiler(LocalDate.of(año, mes, dia));
        
        System.out.println("");
        System.out.println("Indique la fecha de devolución");
        System.out.println("Indique el dia");
        int diaD = read.nextInt();
        System.out.println("Indique el mes");
        int mesD = read.nextInt();
        System.out.println("Indique el año");
        int añoD = read.nextInt();
        al.setFechaDevolucion(LocalDate.of(añoD, mesD, diaD));
        System.out.println("");
        System.out.println("Indique la matrícula del barco a alquilar");
        int mat = read.nextInt();
        
        for (Barco b : barcos) {         
            if (b.getMatricula()==mat) {
                al.setBarco(b);
                break;
            }
        }
     
        al.alquilerBarco();
        System.out.println("El precio del alquiler sería "+al.getPrecioAlquiler());
        
        System.out.println("Desea alquilar el barco? S/N");
        String resp = read.next();
        if (resp.equalsIgnoreCase("S")) {
            System.out.println("Indique el nombre de la persona");
            al.setNombreCliente(read.next());
            System.out.println("Ingrese el documento de identidad");
            al.setIdCliente(read.nextInt());
            System.out.println("Indique la posición de amarre");
            al.setPosicionAmarre(read.nextInt());
            lista.add(al);
        }else{
            System.out.println("Regresando al menu principal");
        }
    }
    
    public void alquilerCliente(){
        System.out.println("Indique su numero de identificación");
        int id = read.nextInt();
        int i = 0;
        for (Alquiler al : lista) {
            if (al.getIdCliente()==id) {
                System.out.println(al);
                i += 1;
                
            }
            
        }
        System.out.println("El cliente tiene registrados "+i+" alquileres");
                
        
    }
    
    public void mostrarBarcos(ArrayList <Barco> barcos){
        for (Barco barco : barcos) {
            System.out.println(barco);
        }
        
    }
    
    
    
}
