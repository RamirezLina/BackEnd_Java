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
public class Hotel5 extends Hotel4{
    protected int numSalonesConf;
    protected int numSuuites;
    protected int numLimosinas;

    public Hotel5() {
    }

    public Hotel5(int numSalonesConf, int numSuuites, int numLimosinas, char gimnasio, String restaurante, int capacidadRest, int numHabitaciones, int numCamas, int numPisos, double precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, restaurante, capacidadRest, numHabitaciones, numCamas, numPisos, precioHab, nombre, direccion, localidad, gerente);
        this.numSalonesConf = numSalonesConf;
        this.numSuuites = numSuuites;
        this.numLimosinas = numLimosinas;
    }

    public int getNumSalonesConf() {
        return numSalonesConf;
    }

    public int getNumSuuites() {
        return numSuuites;
    }

    public int getNumLimosinas() {
        return numLimosinas;
    }

    public void setNumSalonesConf(int numSalonesConf) {
        this.numSalonesConf = numSalonesConf;
    }

    public void setNumSuuites(int numSuuites) {
        this.numSuuites = numSuuites;
    }

    public void setNumLimosinas(int numLimosinas) {
        this.numLimosinas = numLimosinas;
    }
    
    
    
}
