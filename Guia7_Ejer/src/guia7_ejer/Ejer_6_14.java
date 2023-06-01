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
public class Ejer_6_14 {
    public static void main (String[] args){
        Scanner read = new Scanner (System.in);
//        ejer6(args);
//        ejer7(args);
//        ejer8(args);
        ejer9(args);
        
    }
    
    public static boolean par(int num){
        if (num%2 == 0) {
            return true;       
        } else {
            return false;
        }
        
    }
    public static void ejer6(String[] args){
        Scanner read = new Scanner (System.in);
        System.out.println("Escriba el numero");
        int num = read.nextInt();
        Boolean res = par(num);
        if (res){
            System.out.println("El número es par");
        }else{
            System.out.println("El número no es par");
        }
        
    }
    
    public static void ejer7(String[] args){
       Scanner read = new Scanner (System.in);
        System.out.println("Escriba su frase, ya vera si es incorrecta");
        String frase = read.nextLine();
        if (frase.equals("eureka")) {
            System.out.println("La frase es correcta"); 
        }else{
            System.out.println("Paila con la frase");
        }
       
    }
    
    public static void ejer8(String[] args){
        Scanner read = new Scanner (System.in);
        System.out.println("Escriba su frase =)");
        String frase = read.nextLine();
        int lon = frase.length();
        if (8 == lon) {
            System.out.println("CORRECTO");          
            
        }else{
            System.out.println("INCORRECTO");
        }
    }

    public static void ejer9(String[] args){
        Scanner read = new Scanner (System.in);
        System.out.println("Escriba su frase/palabra");
        String frase = read.nextLine();
        String primerL = frase.substring(0,1);
        if (primerL.equals("A")) {
            System.out.println("CORRECTO");
            
        }else{
            System.out.println("INCORRECTO");
        }
              
        
        
        
    }



}
