/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Juego {

    private int num;
    private int intentos;

    public Juego() {
        num = (int) (Math.random() * 500);
        intentos = 0;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public void adivinar() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int numint;
        do {
            numint = chequearnum();
            intentos += 1;

            if (numint == num) {
                
                break;
            } else {
                if (numint > num) {
                    System.out.println("El número es menor al ingresado");
                } else {
                    System.out.println("El número es mayor al ingresado");
                }
            }

            
        } while (numint != num);

        System.out.println("Felicidades ha adiviando el numero ");
        System.out.println("Empleó " + intentos + " intentos");

    }

    public int chequearnum() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int numint;
        try {
            System.out.println("Indique un número");
            numint = read.nextInt();
            return numint;
        } catch (InputMismatchException e) {
            intentos += 1;
            System.out.println("No ha ingresado un número, y se cuenta este intento");
            System.out.println("Intente de nuevo");
            return chequearnum();
        }

    }

}
