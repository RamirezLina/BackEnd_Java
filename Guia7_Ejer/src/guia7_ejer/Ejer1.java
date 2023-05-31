/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejer;

import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Ejer1 {
     public static void main (String[] args){
        Scanner read = new Scanner (System.in);
        System.out.println("Escriba el primer numero");
        int num1 = read.nextInt();
        System.out.println("Escriba el segundo numero");
        int num2 = read.nextInt();
        
        suma(num1, num2);
    }
    
    public static void suma (int num1, int num2){
        int sum = num1 + num2;
        System.out.println("La suma de los numeros es "+ sum);
    }
}

