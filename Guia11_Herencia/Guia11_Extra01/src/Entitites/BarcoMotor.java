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
public class BarcoMotor extends Barco{
    protected int potencia;

    public BarcoMotor() {
    }

    public BarcoMotor(int potencia, int matricula, double eslora, int año) {
        super(matricula, eslora, año);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    @Override
    public double valorModulo(){
        double modulo;
        modulo = (getEslora()*10)+getPotencia();
        
        return modulo;
    }
    
}
