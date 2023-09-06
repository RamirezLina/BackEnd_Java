/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Interfaces.calculosFormas;

/**
 *
 * @author LINA RAMIREZ
 */
public class Rectangulo implements calculosFormas {
    
    private double altura;
    private double base;

    public Rectangulo() {
    }

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    
    
    @Override
    public void calcularArea() {
        double area = base*altura;
        System.out.println("El area del rectangulo es "+area);
        
    }

    @Override
    public void calcularPerimetro() {
        double per = (base+altura)*2;
        System.out.println("El perímetro del rectangulo es "+per);

    }
    
}
