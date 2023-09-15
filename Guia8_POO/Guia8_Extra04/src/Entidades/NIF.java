/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author LINA RAMIREZ
 */
public class NIF {
    private int DNI;
    private String letraNIF;

    public NIF(int DNI, String letraNIF) {
        this.DNI = DNI;
        this.letraNIF = letraNIF;
    }

    public NIF() {
    }

    public long getDNI() {
        return DNI;
    }

    public String getLetraNIF() {
        return letraNIF;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setLetraNIF(String letraNIF) {
        this.letraNIF = letraNIF;
    }
    
    
}
