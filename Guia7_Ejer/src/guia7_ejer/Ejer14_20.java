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
public class Ejer14_20 {
    
    public static void main(String [] args){
        Scanner read = new Scanner (System.in);
        
//        ejer15(args);
//        ejer16 (args);
//        ejer17 (args);
//        ejer18(args);
//        ejer19 (args);
        ejer20 (args);
        
        
        
        
    }
    
    public static void aleatorio(int[] vector){
        Scanner read = new Scanner (System.in);
                
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*10000);
        }
       
    }
    public static void mostrar(int[] vector){
        System.out.print("[ ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("]");
    }
    
    public static void ejer15(String[] args){
        Scanner read = new Scanner (System.in);
        int n = 100;
        int[] vector = new int [n];
        
        for (int i = 0; i < n; i++) {
            vector [i] = i + 1;
                              
        }
        mostrarDesc(vector, n);

    }
    
    public static void mostrarDesc(int[] vector, int n){
        System.out.print("[ ");
        for (int i = n-1; i >= 0; i--) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("]");
    }
    
    public static void ejer16(String[] args){
        Scanner read = new Scanner (System.in);
        System.out.println("Escriba el largo del vector");
        int n = read.nextInt();
        int[] vector = new int [n];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*10);
            
        }
       
        System.out.println("Indique el numero a buscar en el vector, valores del 0 al 10");
        int num  = read.nextInt();
        int rep = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                System.out.println("El numero se encuentra en la pos "+ i);
                rep += 1;
            }
            
        }
        System.out.println("El numero se encontró repetido "+ rep +" veces");
    }
    
    public static void ejer17(String[] args){
        Scanner read = new Scanner (System.in);
        System.out.println("Escriba el largo del vector");
        int n = read.nextInt();
        int[] vector = new int [n];
        aleatorio(vector);
        int Dig1 = 0; int Dig2 = 0; int Dig3 = 0; int Dig4 = 0; int Dig5 = 0;
        
        
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < 5; j++) {
                boolean divi = vector[i]/(Math.pow(10,j))<10;
                if (divi) {
                    switch (j) {
                    case 0:
                        Dig1 += 1;
                        break;
                    case 1:
                        Dig2 += 1;
                        break;
                    case 2:
                        Dig3 += 1;
                        break;
                    case 3:
                        Dig4 += 1;
                        break;
                    case 4:
                        Dig5 += 1;
                        break;
                    
                    }
                    break;
                }
                
                
                    
            }
        }
        
        mostrar(vector);
        System.out.println("Se tiene "+Dig1+" numeros de un digito");
        System.out.println("Se tiene "+Dig2+" numeros de dos digitos");
        System.out.println("Se tiene "+Dig3+" numeros de tres digitos");
        System.out.println("Se tiene "+Dig4+" numeros de cuatro digitos");
        System.out.println("Se tiene "+Dig5+" numeros de cinco digitos");
        
    }  
    
    public static void ejer18(String[] args){
        Scanner read = new Scanner (System.in);
        int n = 4;
        int  m = n;
        int[][] matriz = new int [n][m];
        int[][] matrizT = new int [n][m];
        
        llenarMat(matriz);
        System.out.println("La matriz original es ");
        mostrarMat(matriz);
        transMat(matrizT, matriz);
        System.out.println("");
        System.out.println("La matriz transpuesta es");
        mostrarMat(matrizT);
        
    }
    
    
    public static void llenarMat(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            matriz[i][j] = (int) (Math.random() * 10);
        }
    }
}

    
    public static void mostrarMat (int [][] matriz){
        for(int [] fila : matriz) {
            System.out.print("[ ");
            for (int elemento : fila) {
                System.out.print(elemento+" ");
            }
            System.out.println("]");
        }
    }
        
    public static void transMat (int [][] matrizT, int[][] matriz){
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT[0].length; j++) {
                matrizT[i][j] = matriz[j][i];
            }
            
        }
    }
    
    public static void ejer19(String[] args){
        Scanner read = new Scanner (System.in);
        int[][] matriz = {{0,-2,4},{2,0,2},{-4,-2,0}};
        int[][] matrizT = new int[matriz[0].length][matriz.length];
//        int[][] matrizComp = new int[matriz[0].length][matriz.length];
        System.out.println("La Matriz A es ");
        mostrarMat(matriz);
        transMatAnti(matrizT, matriz);
        int [][] matrizComp ={{0,2,4},{2,0,2},{4,-2,0}};
        System.out.println("");
        System.out.println("La matriz B es ");
        mostrarMat(matrizComp);
        siMatAnti(matrizT, matrizComp);
        
    }
    
    public static void transMatAnti (int [][] matrizT, int[][] matriz){
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT[0].length; j++) {
                matrizT[i][j] = -1*matriz[j][i];
            }
            
        }
    }
    
    public static void siMatAnti (int [][] matrizT, int[][] matrizComp){
        int prueba = 1;
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT[0].length; j++) {
                if (matrizT[i][j] != matrizComp[i][j]) {
                    prueba = 0;
                    break;
                }
            }
        }
        
        if (prueba == 0) {
            System.out.println("Las matriz B no es anti simétrica de la matriz original");
  
        }else{
            System.out.println("La matriz B es anti simétrica de la matriz B");
            
        }
    }
    
    public static void ejer20(String[] args){
        Scanner read = new Scanner (System.in);
        int[][] matriz = new int [3][3];
        llenarMatTec(matriz);
        System.out.println("");
        System.out.println("Esta es la matriz ingresada");
        mostrarMat(matriz);
        boolean mag = magico(matriz);
        System.out.println("Analizando la matriz...");
        if (mag) {
            System.out.println("Felicidades!! El cuadrado es mágico");
            
        }else{
            System.out.println("Lastima, El cuadrado no es mágico");
        }
    }
    
    public static void llenarMatTec (int [][] matriz){
        Scanner read = new Scanner (System.in);
        System.out.println("A continuación llenaremos los datos de su matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                do{
                    System.out.println("Ingrese el valor para el lugar ["+i+","+j+"]");
                    matriz [i][j] = read.nextInt();
                    if (matriz [i][j]<1 || matriz [i][j]>9) {
                        System.out.println("Valor inválido. Ingreselo nuevamente");
                    }
                }while (matriz [i][j]<1 || matriz [i][j]>9);
              
            }
            
        }
    }
    
    public static boolean magico(int [][] matriz){
        int sumDP = 0 ;int sumDS = 0 ;int sumFant = 0;int sumCant = 0;int sumF;int sumC;
        boolean mag = true;
        for (int i = 0; i < matriz.length; i++){
            sumF = 0 ; sumC = 0;
            for (int j = 0; j < matriz[0].length; j++){
                sumF += matriz[i][j];
                sumC += matriz[j][i];
                if (i == j) {
                    sumDP += matriz[j][i];
                }
                if (i + j == matriz.length - 1) {
                    sumDS += matriz[j][i];
                }
            }
            
            if (i == 0) {
                sumFant = sumF;
                sumCant = sumC;
            }else{
                if (sumFant != sumF || sumC != sumCant || sumF != sumC) {
                mag = false;
                break;
                }
                    
            }
        }

        if (sumFant != sumDP || sumFant != sumDS) {
            mag = false;
 
        }
        return mag;
    }
 
    
}
