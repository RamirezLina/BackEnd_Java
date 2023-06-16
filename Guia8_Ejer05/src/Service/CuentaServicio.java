/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Anexos.Cuenta;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class CuentaServicio {
    Scanner read = new Scanner (System.in).useDelimiter("\n");
    
    public Cuenta crearCuenta(){
        System.out.println("Escriba el numero de la cuenta");
        int numeroCuenta = read.nextInt();
        System.out.println("Escriba el DNI del cliente");
        long DNI = read.nextLong();
        System.out.println("Escruba el saldo actual");
        double saldoActual = read.nextDouble();
        return new Cuenta(numeroCuenta, DNI, saldoActual);
        
        
    }
    
    public void ingresoDinero(Cuenta c ) {
        System.out.println("Ingrese la cantidad de dinero a depósitar");
        double ingreso = read.nextDouble();
        c.setSaldoActual(c.getSaldoActual()+ingreso);
    }
    
    public void retirarDinero(Cuenta c){
        System.out.println("Ingrese la cantidad de dinero a retirar");
        double retiro = read.nextDouble();
        if (c.getSaldoActual()<retiro) {
            c.setSaldoActual(0);
        }else{
            c.setSaldoActual(c.getSaldoActual()-retiro);
        }
    }
    
    public void consultarSaldo(Cuenta c){
        System.out.println("Su saldo disponible es ");
        System.out.println(c.getSaldoActual());
    }
    
    public void consultarDatos (Cuenta c){
        System.out.println("Los datos de su cuenta son: ");
        System.out.println("Número de cuenta: "+c.getNumeroCuenta());
        System.out.println("DNI de cliente de la cuenta: "+c.getDNI());
        System.out.println("El saldo actual en la cuenta es de "+ c.getSaldoActual()+" pesos.");
    }
    
    public void extraccionRapida (Cuenta c){
        System.out.println("Ingrese la cantidad de dinero a retirar");
        double retiro = read.nextDouble();
        
        if (retiro > 0.20*c.getSaldoActual()) {
            System.out.println("No se puede retirar esa cantidad mediante este método");
            
        }else{
            if (c.getSaldoActual()<retiro) {
                c.setSaldoActual(0);
            }else{
                c.setSaldoActual(c.getSaldoActual()-retiro);
            }
        }
        
    }
}
