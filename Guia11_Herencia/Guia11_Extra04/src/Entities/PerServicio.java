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
public class PerServicio extends Empleado{
    protected String seccion;

    public PerServicio() {
    }

    public PerServicio(String seccion, int anioIncorporacion, int numDespacho, String nombre, String apellido1, String apellido2, int ID, String estadoCivil) {
        super(anioIncorporacion, numDespacho, nombre, apellido1, apellido2, ID, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre +", ID "+ID+", estadoCivil=" + estadoCivil + ", número de despacho "+numDespacho+", sección "+seccion+'}';
    }  
    
    public void trasladar(){
        Scanner read= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Ingrese el nombre de la nueva sección");
        setSeccion(read.next());
        
    }
    
}
