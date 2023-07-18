/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author LINA RAMIREZ
 */
public class Calculadora {
    
    public float calcularDescuento(int valorInicial, float Disc){
        float valorFinal = valorInicial*(1-(Disc/100));
        return valorFinal;
    }
}
