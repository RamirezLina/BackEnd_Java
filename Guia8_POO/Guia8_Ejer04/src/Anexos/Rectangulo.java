/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anexos;
import java.util.Scanner;
/**
 *
 * @author LINA RAMIREZ
 */
public class Rectangulo {
    private double base;
    private double altura;
    
    public Rectangulo(){
        
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public void crear(){
        Scanner read = new Scanner (System.in);
        System.out.println("Indique la base del rectángulo");
        base = read.nextDouble();
        System.out.println("Indique la altura del rectángulo");
        altura = read.nextDouble();
        
        
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double area (){
        double area = base*altura;
        return area;
    }
    
    public double perimetro(){
        double per = (base + altura)*2;
        return per;
    }
    
    public void dibujar(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura -1 || j == 0 || j == base-1 ) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
    
}
