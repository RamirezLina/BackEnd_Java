/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public abstract class Edificio {
    protected double ancho;
    protected double alto;
    protected double largo;

    public Edificio() {
        Scanner read= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Indique el ancho del edificio");
        ancho = read.nextDouble();
        System.out.println("Indique el alto del edificio");
        alto = read.nextDouble();
        System.out.println("Indique el largo del edificio");
        largo = read.nextDouble();
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Edificio{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }
    
    
    public abstract void calcularSuperficie();
    public  void calcularVolumen(){
        double volumen = getAncho()*getAlto()*getLargo();
        System.out.println("El volumen del edificio es "+volumen+" m3");
    };
    
    
    
}
