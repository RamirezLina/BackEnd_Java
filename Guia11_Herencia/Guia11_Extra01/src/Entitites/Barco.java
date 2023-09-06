/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitites;

/**
 *
 * @author LINA RAMIREZ
 */
public class Barco {
    protected int matricula;
    protected double eslora;
    protected int año;

    public Barco() {
    }

    public Barco(int matricula, double eslora, int año) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.año = año;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public int getAño() {
        return año;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public double valorModulo(){
        double modulo;
        modulo = getEslora()*10;
        
        return modulo;
    }
    
    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", a\u00f1o=" + año + '}';
    }
    
    
    
}
