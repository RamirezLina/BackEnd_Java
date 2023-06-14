/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;
import java.util.Scanner;
/**
 *
 * @author LINA RAMIREZ
 */
public class Operacion {
    private int numero1;
    private int numero2;
    
    public Operacion (int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }
    
    
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }
    
    public void crearOperacion(){
        Scanner read = new Scanner (System.in);
        System.out.println("Indique el primer numero");
        numero1 = read.nextInt();
        
        System.out.println("Indique el segundo numero");
        numero2 = read.nextInt();
        
    }
    
    public int sumar(){
        int sum = numero1 + numero2;
        return sum;
    }
    
    public int restar (){
        int res = numero1 - numero2;
        return res;
    }
    
    public int mult(){
        int res;
        if ((numero1 == 0) || (numero2 == 0)) {
            res = 0;
        }else{
            res = numero1*numero2;
        }
        
        return res;
    }
    
    public double dividir(){
        double res;
        if ((numero1 == 0) || (numero2 == 0)) {
            res = 0;
        }else{
            res = numero1/numero2;
        }
        
        return res;
    }

    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
    
}
