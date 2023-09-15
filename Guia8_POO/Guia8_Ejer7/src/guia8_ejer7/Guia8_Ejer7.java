/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejer7;

import Entidades.Persona;
import Entidades.personaServicios;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia8_Ejer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner (System.in);
        personaServicios pS = new personaServicios();
        
        System.out.println("Bienvendio , registre los datos de cuatro personas");
                
        Persona[] personas = new Persona[2];  // Crear un array de Personas con tamaño 5
        int[] IMCs = new int[personas.length];
        boolean[] mayorEds = new boolean [personas.length];
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println("");
            System.out.println("Ingrese los datos de la persona "+ (i+1));
            // Crear una nueva instancia de Persona con el nombre correspondiente
            personas[i] = pS.crearPersona();
        }

        // Ahora tienes un array de objetos Persona con nombres P1, P2, P3, P4, P5

        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
            System.out.println("Calculando IMC para la persona "+(i+1));
            int IMC = pS.calcularIMC(personas[i]);
            switch (IMC) {
                case -1:
                    System.out.println("La persona esta por debajo de su peso ideal");
                    break;
                case 0:
                    System.out.println("La persona esta en su peso ideal");
                    break;
                case 1:
                    System.out.println("La persona tiene sobrepeso");
                    break;
            }
            
            IMCs[i]=IMC;
            boolean mayor = pS.esMayorDeEdad(personas[i]);
            
            if (mayor) {
                System.out.println("La persona " + (i+1)+" es mayor de edad");
            }else{
                System.out.println("La pesrona " +(i+1)+" no es mayor de edad");
            }
            
            mayorEds[i] = mayor;
        }
        
        int contBajoPeso = 0; int contBienPeso = 0; int contSobrepeso = 0;
        int mEdad = 0; int mnEdad = 0;
        
        for (int i = 0; i < personas.length; i++) {
            switch (IMCs[i]) {
                case -1:
                    contBajoPeso += 1;
                    break;
                case 0:
                    contBienPeso += 1;
                    break;
                case 1:
                    contSobrepeso += 1;
                    break;
            }
            
            if (mayorEds[i]) {
                mEdad += 1;
                
            }else {
                mnEdad += 1;
            }
        }
        
        System.out.println("");
        System.out.println("Sobre los IMC de las personas registradas");
        System.out.println("El "+(contBajoPeso*100/personas.length)+"% de las personas tiene bajo peso");
        System.out.println("El "+(contBienPeso*100/personas.length)+"% de las personas estan en su peso ideal");
        System.out.println("El "+(contSobrepeso*100/personas.length)+"% de las personas estan en sobrepeso");
        
        System.out.println("");
        System.out.println("Sobre la edad de las personas registradas");
        System.out.println("El "+(mEdad*100/personas.length)+"% de las personas es mayor de edad");
        System.out.println("El "+(mnEdad*100/personas.length)+"% de las personas es menor de edad");
        
        
        

            
        
    }
    
}
