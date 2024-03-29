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
public class Extrahotel extends Alojamiento{
    protected boolean privado;
    protected double area;

    public Extrahotel() {
        super();
        Scanner read= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        String resp;
        do {            
            System.out.println("Indique si el hotel es privado o no");
            resp = read.next();
            switch (resp.toUpperCase()) {
                case "S":
                    privado = true;
                    break;

                case "N":
                    privado = false;
                    break;
                default:
                    resp = "R";
            }
        } while (resp.equalsIgnoreCase("R") );
        
    }

    public Extrahotel(boolean privado, double area, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.area = area;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    @Override
    public String toString() {
        return "Alojamiento{" + "nombre=" + nombre +", privado="+privado+'}';
    }
    
    
}
