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
public class Circulo implements calculosFormas{
    
    private double radio;
    private double diametro;

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    
    
    @Override
    public void calcularArea() {
        double area = PI*Math.pow(radio, 2);
        System.out.println("El area del circulo es "+ area);
        
    }

    @Override
    public void calcularPerimetro() {
        double per = PI*diametro;
        System.out.println("El perimetro del circulo es "+per);
    }
    
    
    
}
