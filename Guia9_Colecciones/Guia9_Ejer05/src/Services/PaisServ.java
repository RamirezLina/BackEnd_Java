/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import static java.util.Spliterators.iterator;

/**
 *
 * @author LINA RAMIREZ
 */
public class PaisServ {
    
    private Scanner read;
    
    private HashSet <String> Paises;

    public PaisServ() {
        this.read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        this.Paises = new HashSet();
    }
    
    public void añadirPais() {

        String resp;
        do {
            System.out.println("Desea añadir un país? Responda Si/No");
            resp = read.next();
        } while (!resp.equalsIgnoreCase("si") && !resp.equalsIgnoreCase("no"));

        while (resp.equalsIgnoreCase("si")) {
            System.out.println("");
            System.out.println("Escriba el pais");
            Paises.add(read.next());
            
            do {
                System.out.println("Desea añadir un nuevo país? Responda Si/No");
                resp = read.next();
            } while (!resp.equalsIgnoreCase("si") && !resp.equalsIgnoreCase("no"));

        }
        
        mostrarPaises();

    }
    
    public void mostrarPaises() {
        System.out.println("");
        System.out.println("Los paises registrados son:");
        Paises.forEach((pais) -> {
            System.out.println(pais);
        });
        System.out.println("");
//        System.out.println("Cantidad " + Paises.size());

    }
    
    public void ordenarPaises(){
        ArrayList<String> paisesList = new ArrayList(Paises);
        Collections.sort(paisesList);
        paisesList.forEach((pais) -> {
            System.out.println(pais);
        });
    }
    
    public void eliminarPais(){
        System.out.println("Ingrese el pais a eliminar");
        String pais = read.next();
        int count = 0;
        Iterator <String> it = Paises.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(pais)) {
                it.remove();
                count = 1;
            }
        }
        switch (count) {
            case 0:
                System.out.println("No se encuentra el pais en la lista");
                
                break;
            default:
                System.out.println("Se ha eliminado correctamente");
                ordenarPaises();
        }
    }
    
            
    
}
