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
            System.out.println("Escriba el sexo");
            sexo = read.nextLine();
        } while (sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("M")|| sexo.equalsIgnoreCase("O"));
        System.out.println("Escriba el pesp");
        double peso = read.nextDouble();
        System.out.println("Escriba la altura");
        double altura = read.nextDouble();
        
        return new Persona(name, edad, sexo, peso, altura);
    }
}
