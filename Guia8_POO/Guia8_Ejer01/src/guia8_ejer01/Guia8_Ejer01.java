/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejer01;
import Insides.Libro;
/**
 *
 * @author LINA RAMIREZ
 */
public class Guia8_Ejer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro primerL = new Libro();
        Libro segunL = new Libro(123, "La ridicula idea", "Rosa Montero", 90);
        System.out.println(primerL.toString());
        System.out.println(segunL.toString());
        segunL.cargar();
        System.out.println(segunL.toString());
        
    }
    
}
