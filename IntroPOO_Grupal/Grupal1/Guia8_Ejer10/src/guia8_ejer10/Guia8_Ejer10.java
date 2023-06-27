/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejer10;

import anexo.ArrayService;
import java.util.Arrays;
/**
 *
 * @author LINA RAMIREZ
 */
public class Guia8_Ejer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [] arrA = new double[50];
        double [] arrB = new double[20];
        
        ArrayService AS = new ArrayService();
        
        AS.llenarArray(arrA);
        System.out.println("El arreglo A es el siguiente");
        AS.mostrarArray(arrA);
        AS.llenarCopia(arrA, arrB);
        System.out.println("");
        System.out.println("El arreglo A ordenadoes el siguiente");
        AS.mostrarArray(arrA);
        System.out.println("");
        System.out.println("El arreglo B es el siguiente");
        Arrays.toString(arrB);
        AS.mostrarArray(arrB);
        
    }
    
    
}
