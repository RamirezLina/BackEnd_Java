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
public class Residencia extends Extrahotel{
    protected int numHab;
    protected boolean discGremios;
    protected boolean cDeportivo;

    public Residencia() {
        super();
        Scanner read= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Indique el numero de habitaciones");
        numHab = read.nextInt();
        String resp;
        do {            
            System.out.println("Tiene descuentos a los gremios? S/N");
            resp = read.next();
            switch (resp.toUpperCase()) {
                case "S":
                    discGremios = true;
                    break;

                case "N":
                    discGremios = false;
                    break;
                default:
                    resp = "R";
            }
        
        } while (resp.equalsIgnoreCase("R") );
        
        do {            
            System.out.println("Tiene campo deportivo? S/N");
            resp = read.next();
            switch (resp.toUpperCase()) {
                case "S":
                    cDeportivo = true;
                    break;

                case "N":
                    cDeportivo = false;
                    break;
                default:
                    resp = "R";
            }
        
        } while (resp.equalsIgnoreCase("R") );
        
       
    }

    public Residencia(int numHab, boolean discGremios, boolean cDeportivo) {
        this.numHab = numHab;
        this.discGremios = discGremios;
        this.cDeportivo = cDeportivo;
    }

    public int getNumHab() {
        return numHab;
    }

    public void setNumHab(int numHab) {
        this.numHab = numHab;
    }

    public boolean isDiscGremios() {
        return discGremios;
    }

    public void setDiscGremios(boolean discGremios) {
        this.discGremios = discGremios;
    }

    public boolean iscDeportivo() {
        return cDeportivo;
    }

    public void setcDeportivo(boolean cDeportivo) {
        this.cDeportivo = cDeportivo;
    }
    
    @Override
    public String toString() {
        return "Alojamiento{" + "nombre=" + nombre +", privado="+privado+ " Tiene descuento "+discGremios+'}';
    }
    
}
