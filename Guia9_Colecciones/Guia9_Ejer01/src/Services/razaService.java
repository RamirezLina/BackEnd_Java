/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class razaService {

    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private List<String> razaPerros;

    public razaService() {
        this.razaPerros = new ArrayList();
    }

    public void añadirRaza() {

        String resp;
        do {
            System.out.println("Desea guardar una raza? Responda Si/No");
            resp = read.next();
        } while (!resp.equalsIgnoreCase("si") && !resp.equalsIgnoreCase("no"));

        while (resp.equalsIgnoreCase("si")) {
            System.out.println("Escriba la raza del perro a guardar");
            razaPerros.add(read.next());

            do {
                System.out.println("Desea guardar otra raza? Responda Si/No");
                resp = read.next();
            } while (!resp.equalsIgnoreCase("si") && !resp.equalsIgnoreCase("no"));

        }
        
        mostrarRazas();
        
 
    }
    
    public void mostrarRazas(){
        System.out.println("");
        System.out.println("Las razas guardadas son:");
        razaPerros.forEach((raza) -> {
            System.out.print(raza+" - ");
        });
        System.out.println("");  
        System.out.println("Cantidad "+razaPerros.size());
  
        }
    
    public void eliminarRaza(){
        System.out.println("Ingrese la raza del perro a eliminar");
        String raza = read.next();
        Iterator <String> it = razaPerros.iterator();
        int count = 0;
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(raza)) {
                it.remove();
                count = 1;
            }

        }
        
        switch (count) {
            case 0:
                System.out.println("No se encuentra la raza en la lista");
                Collections.sort(razaPerros);
                mostrarRazas();
                break;
            default:
                System.out.println("Se ha eliminado correctamente");
                mostrarRazas();
        }
        
        
    }
}
