/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejer03;
import Elementos.Operacion;
/**
 *
 * @author LINA RAMIREZ
 */
public class Guia8_Ejer03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operacion intento1 = new Operacion(4,2);
        System.out.println(intento1);
       
        Operacion intento2 = new Operacion();
        intento2.crearOperacion();
        System.out.println(intento2);
        
        
        System.out.println("La suma de la primer operacion es ");
        System.out.println(intento1.sumar());
        
        System.out.println("La resta de la primer operacion es ");
        System.out.println(intento1.restar());
        
        if (intento1.mult()== 0) {
            System.out.println("Ocurrió un error, uno de los numeros es un 0");
            
        }else {
            System.out.println("La mulltiplicación de la primer operacion es ");
            System.out.println(intento1.mult());
        }
        
        if (intento1.dividir()== 0) {
            System.out.println("Ocurrió un error, uno de los numeros es un 0");
            
        }else {
            System.out.println("La división de la primer operacion es ");
            System.out.println(intento1.dividir());
        }
        
        if (intento2.mult()== 0) {
            System.out.println("Ocurrió un error, uno de los numeros es un 0");
            
        }else {
            System.out.println("La mulltiplicación de la primer operacion es ");
            System.out.println(intento2.mult());
        }
        
        if (intento2.dividir()== 0) {
            System.out.println("Ocurrió un error, uno de los numeros es un 0");
            
        }else {
            System.out.println("La división de la primer operacion es ");
            System.out.println(intento2.dividir());
        }
        
    }
    
}
