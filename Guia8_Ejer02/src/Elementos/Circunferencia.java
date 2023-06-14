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
public class Circunferencia {
    private double radio;
    
    public Circunferencia (){
        
    }
    public Circunferencia (double radio){
        this.radio = radio;
      
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    public void crearCircunferencia (){
        Scanner read = new Scanner (System.in);
        System.out.println("Escriba el radio de la circunferencia");
        radio = read.nextDouble();
        
    }
    
    public double area(){
        double area = Math.PI*(Math.pow(radio,2));
        return area;
    }
    
    public double perimetro(){
        double perim = 2*Math.PI*radio;
        return perim;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
}
