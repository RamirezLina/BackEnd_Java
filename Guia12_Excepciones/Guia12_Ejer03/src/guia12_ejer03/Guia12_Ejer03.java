/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12_ejer03;

import Entities.DivisionNumero;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia12_Ejer03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        DivisionNumero dn = new DivisionNumero();

        
        try {
            System.out.println("Escriba un numero");
            dn.num1 = read.next();
            int num1 = Integer.parseInt(dn.num1);
            System.out.println("Escriba un numero");
            dn.num2 = read.next();

            
            int num2 = Integer.parseInt(dn.num2);
            
            System.out.println("La division de los numeros da como resultado "+num1/num2);
            
        } catch (NumberFormatException e) {
            System.out.println("El valor ingresado no es un numero entero");

        }catch(ArithmeticException e){
            System.out.println("No puedes divider entre '0'");
        }
    }

}
