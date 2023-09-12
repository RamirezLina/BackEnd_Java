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
public class Camping extends Extrahotel{
    protected int maxCarpas;
    protected int numBanios;
    protected boolean restaurante;

    public Camping() {
        super();
        Scanner read= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Indique el numero máximo de carpas");
        maxCarpas = read.nextInt();
        System.out.println("Indique el numero de baños disponibles");
        numBanios = read.nextInt();
        String resp;
        do {            
            System.out.println("}El camping cuenta con restaurante S/N");
            resp = read.next();
            switch (resp.toUpperCase()) {
                case "S":
                    restaurante = true;
                    break;

                case "N":
                    restaurante = false;
                    break;
                default:
                    resp = "R";
            }
        } while (resp.equalsIgnoreCase("R") );

    }

    

    public Camping(int maxCarpas, int numBanios, boolean restaurante, boolean privado, double area, String nombre, String direccion, String localidad, String gerente) {
        super(privado, area, nombre, direccion, localidad, gerente);
        this.maxCarpas = maxCarpas;
        this.numBanios = numBanios;
        this.restaurante = restaurante;
    }

    public int getMaxCarpas() {
        return maxCarpas;
    }

    public void setMaxCarpas(int maxCarpas) {
        this.maxCarpas = maxCarpas;
    }

    public int getNumBanios() {
        return numBanios;
    }

    public void setNumBanios(int numBanios) {
        this.numBanios = numBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }
    
    @Override
    public String toString() {
        return "Alojamiento{" + "nombre=" + nombre +", privado="+privado+ " Tiene restaurante "+restaurante+'}';
    }
    
    
    
}
