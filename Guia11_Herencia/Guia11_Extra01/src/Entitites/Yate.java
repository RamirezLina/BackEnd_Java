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
public class Yate extends BarcoMotor{
    protected int camarotes;

    public Yate() {
    }

    public Yate(int camarotes, int potencia, int matricula, double eslora, int año) {
        super(potencia, matricula, eslora, año);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
    
    @Override
    public double valorModulo(){
        double modulo;
        modulo = (getEslora()*10)+getPotencia()+getCamarotes();
        
        return modulo;
    }
    
}
