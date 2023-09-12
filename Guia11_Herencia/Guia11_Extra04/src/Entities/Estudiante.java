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
public class Estudiante extends Persona{
    protected String curso;

    public Estudiante() {
    }

    public Estudiante(String curso, String nombre, String apellido1, String apellido2, int ID, String estadoCivil) {
        super(nombre, apellido1, apellido2, ID, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
     @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre +", ID "+ID+", estadoCivil=" + estadoCivil + ", curso "+curso+'}';
    } 
    
    public void cambioCruso(){
        Scanner read= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Ingrese el nombre del nuevo curso");
        setCurso(read.next());
        
    }
}
