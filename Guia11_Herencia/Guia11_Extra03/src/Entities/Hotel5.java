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
public class Hotel5 extends Hotel4 {

    protected int numSalonesConf;
    protected int numSuuites;
    protected int numLimosinas;

    public Hotel5() {
        super();
        do {
            Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
            System.out.println("Indique el numero de limosinas del hotel");
            numLimosinas = read.nextInt();
        } while (numLimosinas<0);

    }

    public Hotel5(int numSalonesConf, int numSuuites, int numLimosinas, char gimnasio, String restaurante, int capacidadRest, int numHabitaciones, int numCamas, int numPisos, Double precioHab, String nombre, String direccion, String localidad, String gerente) {
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

    @Override
    public Double precioHab() {
        Double precio;

        precio = 50d + (1 * getNumCamas()) + aggGim() + aggRest()+aggLim();

        return precio;
    }
    
    public double aggLim(){
        double agregado = 15*getNumLimosinas();
        return agregado;
    }

}
