/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Persona {
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected int ID;
    protected String estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido1, String apellido2, int ID, String estadoCivil) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.ID = ID;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public int getID() {
        return ID;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre +", ID "+ID+", estadoCivil=" + estadoCivil + '}';
    }   
    
    public void cambiarEC(){
        Scanner read= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String resp;
        do {            
            System.out.println("Indique como desea definir su estado civil");
            System.out.println("Indique 'S' para solera");
            System.out.println("Indique 'C' para casada");
            
            resp = read.next();
            switch (resp.toUpperCase()) {
                case "S":
                    setEstadoCivil("Soltera");
                    break;

                case "C":
                    setEstadoCivil("Casada");
                    break;
                default:
                    resp = "R";
            }
        } while (resp.equalsIgnoreCase("R") );
    }
    
    
    
}
