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
//        ejer9(args);
//        ejer10(args);
//        ejer11(args);
//        ejer12(args);
//        ejer13(args);
        ejer14(args);
        
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
        
    public static void ejer10 (String[] args){
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese el valor maximo");
        int max = read.nextInt();
        int suma = 0;
        do{
            System.out.println("Ingrese un número");
            int num = read.nextInt();
            suma += num; 
            
        }while (suma <= max);
        
        System.out.println("La suma de los números es ");
        System.out.println(suma);
    }

    public static void ejer11 (String[] args){
        Scanner read = new Scanner (System.in);
        
        System.out.println("Bienvenido a su calculadora virtual");
        int num1; int num2; int opt;
        do{
            System.out.println("Escriba el primer numero entero positivo");
            num1 = read.nextInt();
        }while ( 0 > num1);
        
        do{
            System.out.println("Escriba el segundo numero entero positivo");
            num2 = read.nextInt();
        }while ( 0 > num2);
        
       
        do{
            System.out.println("");
            System.out.println("Eliga una de las opciones del siguiente menu");
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Escriba el numero que relaciona la opcion que desea");
            opt = read.nextInt();
            read.nextLine();

            switch (opt) {
                case 1:
                    System.out.println("La suma de los números es");
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    System.out.println("La resta de los números es");
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println("La multiplicación de los números es");
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    System.out.println("La división de los números es");
                    System.out.println(num1 / num2);
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir del programa? S/N" );
                    String resp = read.nextLine().toUpperCase();
                    
                    if (resp.equals("S")) {
                        opt = 5;
                        break;
                    }else {
                        opt = 1;
                        break;
                    }
                                
                default:
                    System.out.println("Opción incorrecta, seleccione una nueva");
            }
        }while (opt != 5);
        
        
    }
    
    public static void ejer12 (String[] args){
        Scanner read = new Scanner (System.in);
        
        System.out.println("Bienvenido al dispositivo RS232");
        
        int longi; boolean primC; boolean ultC; String cad;
        int correct = 0; 
        int inco = 0;
        
        do{
            System.out.println("Escriba la cadena");
            cad = read.nextLine();
            longi = cad.length();
            primC = cad.startsWith("X");
            ultC = cad.endsWith("O");
            
            if (longi < 6 && primC && ultC){
                correct += 1;
                continue;
            }else {
                inco += 1;
            }
            
        
        }while (!cad.equals("&&&&&"));
        
        System.out.println("El número de lecturas correctas fueron "+ correct);
        System.out.println("El numero de lecturas erroneas es "+ inco);
        
    }
    
    public static void ejer13 (String[] args){
        Scanner read = new Scanner (System.in);
        System.out.println("De que tamaño será el lado del cuadrado");
        int N = read.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == N-1 || j == 0 || j == N-1){
                    System.out.print("*");
                    continue;
                }else{
                    System.out.print(" ");
                }
              
            }
            System.out.println("");
        }
    }
    
    public static void ejer14 (String [] args){
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de euros a convertir");
        double euro = read.nextDouble();
        read.nextLine();
                
         String moneda;
        do{
           System.out.println("A que moneda desea convertir? dolar/yen/libra");
           moneda = read.nextLine().toLowerCase();
         
        }while (!moneda.equals("dolar") && !moneda.equals("yen")&& !moneda.equals("libra"));
        
        cambioMoneda(euro, moneda);
        
         
               
    }
    
    public static void cambioMoneda(double euro, String moneda){
        double cambio;
         switch (moneda) {
            case "dolar":
                cambio = euro*1.28611;
                break;
            case "yen":
                cambio = euro*129.852;
                break;
            case "libra":
                cambio = euro*0.86;
                break;
            default:
                System.out.println("Moneda erronea");
                cambio = 0;
                
        }
         
               
        System.out.println("El valor en "+moneda+" es "+cambio); 
   
    }
    
}
