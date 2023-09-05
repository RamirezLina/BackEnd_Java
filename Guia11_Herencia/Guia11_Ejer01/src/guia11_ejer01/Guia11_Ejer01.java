/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11_ejer01;

import Entities.Animal;
import Entities.Caballo;
import Entities.Gato;
import Entities.Perro;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia11_Ejer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //Declaración del objeto Perro
       Animal perro1 = new Perro("Stich","Carnivoro",15,"Doberman");
       perro1.Alimentarse();
       
       Animal perro2 = new Perro("Teddy","Croquetas",10,"Chihuahua");
       perro2.Alimentarse();
       
       //Declaración del objeto Gato
       Animal gato1 = new Gato("Pelusa","Galletas",15,"Siamés");
       gato1.Alimentarse();
       
       
       //Declaración del objeto caballo
       Animal caballo1 = new Caballo("Pelusa","Galletas",15,"Siamés");
       caballo1.Alimentarse();
       
       
    }
    
}
