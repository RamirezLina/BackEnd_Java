/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Polideportivo extends Edificio{
    private String nombre;
    private String tipoInstalacion;

    public Polideportivo() {
        super();
        Scanner read= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Escriba el nombre del polideportivo");
        nombre= read.next();
        System.out.println("Escriba si la instalación es Techado o Abierto");
        tipoInstalacion = read.next();
    }
    public Polideportivo(String nombre, String tipoInstalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    

    public String getNombre() {
        return nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }
    
    

    @Override
    public void calcularSuperficie() {
        double sup = getAncho()*getLargo();
        System.out.println("La superficie del polideportivo es "+sup+ " m2");
    }

    
    
    
}
