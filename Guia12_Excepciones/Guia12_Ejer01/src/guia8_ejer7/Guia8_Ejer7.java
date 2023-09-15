/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejer7;

import Entidades.Persona;
import Entidades.PersonaException;
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
        
        Persona p = new Persona();

        
        try{
            p.getName().isEmpty();
            pS.esMayorDeEdad(p);
            
            
        }catch(NullPointerException e){
            System.out.println("Debe registrar los datos de la persona");
            
        }
    }
        
                       
        
    
}
