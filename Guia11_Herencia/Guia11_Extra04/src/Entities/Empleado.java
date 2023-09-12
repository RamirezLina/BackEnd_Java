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
public class Empleado extends Persona {
    protected int anioIncorporacion;
    protected int numDespacho;

    public Empleado() {
    }

    public Empleado(int anioIncorporacion, int numDespacho, String nombre, String apellido1, String apellido2, int ID, String estadoCivil) {
        super(nombre, apellido1, apellido2, ID, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre +", estadoCivil=" + estadoCivil + ", número de despacho "+numDespacho+'}';
    }  
    
    public void asigDespacho(){
        Scanner read= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Indique el nuevo número del despacho");
        setNumDespacho(read.nextInt());
    }
    
    
}
