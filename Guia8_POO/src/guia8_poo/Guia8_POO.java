/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_poo;
import Entidad01.Persona;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia8_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner (System.in);
        Persona primerHija = new Persona ("Lina",25,"F");
        Persona segundaHija = new Persona ("Vanessa", 24, "F");
        Persona tercerHija = new Persona ("Isa", 20, "F");

        tercerHija.setNombre("Isabella");
        System.out.println(tercerHija.getNombre());
        System.out.println(primerHija+" | "+segundaHija+" | "+tercerHija+" | ");
        
    }
    
}
