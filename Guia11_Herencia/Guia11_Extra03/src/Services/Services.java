/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Alojamiento;
import Entities.Camping;
import Entities.Hotel;
import Entities.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Services {
    private Scanner read;
    private ArrayList <Alojamiento> al;

    public Scanner getRead() {
        return read;
    }

    public ArrayList<Alojamiento> getAl() {
        return al;
    }
    
    

    public Services() {
        read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        al = new ArrayList();
    }
    
    public void mostrarAl(){
        for (Alojamiento a : al) {
            System.out.println(a);
        }
        
        System.out.println("El numero de alojamientos registrados es "+al.size());
    }
    
    public void ordenarHoteles(){
        ArrayList<Hotel> hoteles = new ArrayList();
        for (Alojamiento a : al) {
            if (a instanceof Hotel) {
                Hotel hotel = (Hotel) a;
                hoteles.add((Hotel) a);
            }
        }
        
        Collections.sort(hoteles, Comparador.ordenarporPrecio);
        for (Hotel h : hoteles) {
            System.out.println(h);
        }
        System.out.println("Se tienen "+hoteles.size()+" hoteles registrados");
        
    }
    
    public void campingRest(){
        for (Alojamiento a : al) {
            if (a instanceof Camping) {
                Camping c = (Camping) a;
                if (c.isRestaurante()) {
                    System.out.println(c);
                }
                
            }
        }
        
    }
    
    public void residDisc(){
        for (Alojamiento a : al) {
            if (a instanceof Residencia) {
                Residencia r = (Residencia) a;
                if (r.isDiscGremios()) {
                    System.out.println(r);
                }
            }
            
        }
    }
            
    
    
    
    
    
}
