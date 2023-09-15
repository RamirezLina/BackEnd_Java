/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class personaServicios {
    Scanner read = new Scanner (System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        
        System.out.println("Escriba el nombre de la persona a registrar");
        String name = read.nextLine();
        System.out.println("Escriba la edad");
        int edad = read.nextInt();
        String sexo;
        do {            
            System.out.println("Escriba el sexo H: hombre; M:uner; O: otro");
            sexo = read.next();
        } while (!sexo.equalsIgnoreCase("H") & !sexo.equalsIgnoreCase("M")& !sexo.equalsIgnoreCase("O"));
        System.out.println("Escriba el peso en kg");
        double peso = read.nextDouble();
        System.out.println("Escriba la altura en metros");
        double altura = read.nextDouble();
        read.nextLine();
        return new Persona(name, edad, sexo, peso, altura);
    }
    
    public int calcularIMC(Persona p){
        int result = 0;
        double imc = (p.getPeso()/(Math.pow(p.getAltura(),2)));
        
        if (imc < 20) {
            result = -1;
        }else if(imc <= 25 & imc >=20){
            result = 0;
        }else if(imc > 25){
            result = 1;
        }
        return result;
    }
    
    public boolean esMayorDeEdad(Persona p){
        boolean mayorEdad = true;
        
        if (p.getEdad()< 18) {
            mayorEdad = false;
        }
        return mayorEdad;
    }
    
    
}
