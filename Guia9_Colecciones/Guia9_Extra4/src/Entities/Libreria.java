/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author LINA RAMIREZ
 */
public class Libreria {

    public boolean prestamo(Libro l) {
        int res = l.getEjemplaresDisp().compareTo(l.getEjemplaresPrest());
        boolean oper = false;
        switch (res) {
            case 1:
                l.setEjemplaresPrest(l.getEjemplaresPrest() + 1);
                oper = true;
                break;
            case 0:
                
                break;
            default:
                System.out.println("Error en el registro de ejemplares prestados");
                break;
        }

        return oper;
    }

    public boolean devolucion(Libro l) {
        int res = l.getEjemplaresPrest();
        boolean oper = false;
        if (res > 0) {
            l.setEjemplaresPrest(l.getEjemplaresPrest() - 1);
            oper = true;
        } 

        return oper;
    }

    public void mostrarLibros(HashSet L) {
        System.out.println("Los libros registrados son:");
        for (Object l : L) {

            System.out.println(l);

        }
        System.out.println("");
        System.out.println("Cantidad: " + L.size());
    }

}
