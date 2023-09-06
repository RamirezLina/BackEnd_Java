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
public class Velero extends Barco{
    protected int mastiles;

    public Velero() {
    }

    public Velero(int mastiles, int matricula, double eslora, int año) {
        super(matricula, eslora, año);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }
    
    @Override
    public double valorModulo(){
        double modulo;
        modulo = (getEslora()*10)+getMastiles();
        
        return modulo;
    }
}
