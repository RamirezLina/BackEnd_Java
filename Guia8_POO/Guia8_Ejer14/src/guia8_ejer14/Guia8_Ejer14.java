/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejer14;

import Entity.Movil;
import Entity.MovilServices;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia8_Ejer14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        MovilServices mS = new MovilServices();
        String resp;
        do {
            System.out.println("Desea crear un producto nuevo? Responda Si o No");        
            resp = read.next();
        } while (!resp.equalsIgnoreCase("si") & !resp.equalsIgnoreCase("no"));
        
        
        
        while (resp.equalsIgnoreCase("si")){
            Movil cel1 =  mS.cargarCelular();
            
            System.out.println("Las características del celular son: ");
           
            System.out.println(cel1);
            
            break;
        }
        
        System.out.println("Finalizando el programa...");
        
    }
    
}
