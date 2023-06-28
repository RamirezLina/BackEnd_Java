/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anexo;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;


/**
 *
 * @author LINA RAMIREZ
 */
public class PersonaService {
    Scanner read = new Scanner (System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        
        System.out.println("Digitando información de la persona a registrar");
        System.out.println("Escriba el nombre de la persona");
        String name = read.nextLine();
        System.out.println("Escriba el año de nacimiento");
        int anio = read.nextInt();
        
        System.out.println("Escriba el mes de nacimiento");
        int mes = read.nextInt();
        
        System.out.println("Escriba el dia de nacimiento");
        int dia = read.nextInt();
        
        LocalDate birthDate;
        birthDate = LocalDate.of(anio, mes, dia);
        
        return new Persona(name, birthDate);
    }
    
    public int calcularEdad(Persona p){
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(p.getBirthDate(), fechaActual);
        int edad = periodo.getYears();
        
        return edad;
    }
    
    public boolean menorQue(Persona p, int edad){
        int menor = Math.min(calcularEdad(p),edad);
        boolean pMenor;
        if (menor == calcularEdad(p)) {
            pMenor = true;
        }else{
            pMenor = false;
        }
        return pMenor;
    }
    
    public void mostrarPersona(Persona p){
        System.out.println("El nombre de la persona "+p+" es "+p.getName());
        System.out.println("Su fecha de nacimiento es el "+p.getBirthDate());
        System.out.println("Su edad es "+calcularEdad(p));
    }
}
