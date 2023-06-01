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
public class Eje2al5 {
     public static void main (String[] args){
        Scanner read = new Scanner (System.in);
//        ejer2(args);
//        ejer3 (args);
//        ejer4 (args);
          ejer5 (args);
          
     }
     
     public static void ejer2 (String [] args){
         Scanner read = new Scanner (System.in);
         System.out.println("Escriba su nombre");
         String nom = read.nextLine();
         System.out.println("Salut "+nom+", je m'appelle Lina");
     }
     
     public static void ejer3 (String[] args){
         Scanner read = new Scanner (System.in);
         System.out.println("Escriba una frase");
         String frase = read.nextLine();
         System.out.println("La frase en mayuscula es "+frase.toUpperCase());
         System.out.println("La frase en minuscula es "+frase.toLowerCase());       
     }

     public static void ejer4 (String [] args){
         Scanner read = new Scanner (System.in);
         System.out.println("Escribir la temeperatura en °C");
         int temp = read.nextInt();
         int tempF = (9*temp/5)+32;
         System.out.println("La temperatura en Farenheit es "+tempF);
         
     }

     public static void ejer5 (String [] args){
         Scanner read = new Scanner (System.in);
         System.out.println("Escriba su edad");
         int num = read.nextInt();
         int dob = num*2;
         int trip = num*3;
         double raiz = Math.sqrt(num);
         
         System.out.println("El doble de su edad es: " + dob);
         System.out.println("El triple de su edad es: " + trip);
         System.out.println("La raíz cuadrada de su edad es: " + raiz);
     }
     
}
