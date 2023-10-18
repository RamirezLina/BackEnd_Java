/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12_jarvis;

import Entities.Armadura;
import Entities.ArmaduraEx;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia12_JARVIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Armadura a1 = new Armadura();
        
        try{
            a1.crearArmadura("Rojo", "Azul", 3, 2, 5, 0, 0, 0, 30);
        }catch(ArmaduraEx e){
            System.out.println(e.getMessage());
        
        }catch(NumberFormatException e){
            System.out.println("El valor ingresado no es un numero");
        }
        
        
        
        
    }
    
}
