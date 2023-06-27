/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejer8;

import Entidades.Cadena;
import Entidades.CadenaServicios;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia8_Ejer8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner read = new Scanner (System.in).useDelimiter("\n");
       CadenaServicios cs = new CadenaServicios();
       Cadena c1 = new Cadena();
       
       cs.llenarCadena(c1);
       System.out.println(c1);
       System.out.println("El numero de vocales de la frase es "+ cs.mostrarVocales(c1));
       System.out.println("La frase invertida corresponde a:");
       System.out.println(cs.invertirFrase(c1));
       
        System.out.println("");
        System.out.println("Indique el carácter que quiere identificar en la frase");
        String l = read.nextLine();
        System.out.println("El carácter '"+l+"' se repite "+ cs.vecesRepetido(c1, l)+ " veces");
        
        System.out.println("Ingrese la nueva frase a comparar");
        String nuevaFrase = read.nextLine();
        cs.compararLongitud(c1, nuevaFrase);
        
        System.out.println("Ingrese la nueva frase a concatenar");
        String unirFrase = read.nextLine();
        System.out.println("La union de las frases es ...");
        System.out.println(cs.unirFrases(c1, unirFrase));
        
        System.out.println("Escriba el caracter que ira en reemplazo de la 'a'");
        String carac = read.nextLine();
        System.out.println("La frase inicial reemplazando la vocal 'a' por"+carac+ " queda asi! ");
        System.out.println(cs.reemplazar(c1,carac));
        System.out.println("");
        System.out.println("Indique la letra a identificar");
        String let = read.nextLine();
        boolean cont= cs.contiene(c1, let);
        if (cont) {
            System.out.println("La frase contiene la letra "+let);
            
        }else{
            System.out.println("La frase no contiene la letra "+let);
        }
        
        
    }   
    
}
