/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;

/**
 *
 * @author LINA RAMIREZ
 */
public class Sala {
    private ArrayList<ArrayList<Asiento>> sala;

    public Sala() {
        this.sala = new ArrayList();
    }

    public ArrayList<ArrayList<Asiento>> getSala() {
        return sala;
    }

    public void setSala(ArrayList<ArrayList<Asiento>> sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Sala{" + "sala=" + sala + '}';
    }
    
    

    
    
    
}
