/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejer12;

import Anexo.Persona;
import Anexo.PersonaService;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia8_Ejer12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner (System.in);
        PersonaService ps = new PersonaService();
        
        Persona persona1 = ps.crearPersona();
        System.out.println("Calculando la edad de "+persona1.getName());
        System.out.println("La edad es "+ps.calcularEdad(persona1)+" años");
        System.out.println("");
        System.out.println("La persona creada es "+persona1.toString());
        System.out.println("");
        System.out.println("Escriba la otra edad a comparar");
        int edad = read.nextInt();
        if (ps.menorQue(persona1, edad)) {
            System.out.println("La edad de "+persona1.getName() +"es menor que la edad ingresada");
            
        }else {
           System.out.println("La edad de "+persona1.getName() +" es mayor que la edad ingresada"); 
        }
    }
    
}
