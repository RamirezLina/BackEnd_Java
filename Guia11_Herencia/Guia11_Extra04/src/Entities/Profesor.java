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
public class Profesor extends Empleado{
    protected String dpto;

    public Profesor() {
    }

    public Profesor(String dpto, int anioIncorporacion, int numDespacho, String nombre, String apellido1, String apellido2, int ID, String estadoCivil) {
        super(anioIncorporacion, numDespacho, nombre, apellido1, apellido2, ID, estadoCivil);
        this.dpto = dpto;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }
    
     @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre +", ID "+ID+", estadoCivil=" + estadoCivil + ", número de despacho "+numDespacho+", Departamento "+dpto+'}';
    } 
    
    public void cambioDpto(){
        Scanner read= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Ingrese el nombre del nuevo departamento");
        setDpto(read.next());
    }
}
