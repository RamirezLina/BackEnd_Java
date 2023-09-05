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
public class Lavadora extends Electrodomestico {
    protected int carga;

    public Lavadora() {
    }

    
    public Lavadora(int carga, double precio, String color, char consumoEner, double peso) {
        super(precio, color, consumoEner, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        crearElectrodomestico();
        do {
            System.out.println("Escriba la capacidad de carga de la lavadora");
            setCarga(read.nextInt());
        } while (getCarga() < 1);
        
    } 
    
    @Override
    public void precioFinal() {
        char consumo = getConsumoEner();
        switch (consumo) {
            case 'A':
                setPrecio(getPrecio() + 1000d + precioPeso()+precioCarga());

                break;
            case 'B':
                setPrecio(getPrecio() + 800d + precioPeso()+precioCarga());
                break;
            case 'C':
                setPrecio(getPrecio() + 600d + precioPeso()+precioCarga());
                break;
            case 'D':
                setPrecio(getPrecio()+500d+precioPeso()+precioCarga());
                break;
            case 'E':
                setPrecio(getPrecio()+300d+precioPeso()+precioCarga());
                break;
            case 'F':
                setPrecio(getPrecio()+100d+precioPeso()+precioCarga());
                break;
            
        }

    }
    
    public double precioCarga(){
        double p;
        if (getCarga()>30) {
            p =500;
        }else{
            p=0;
        }
        return p;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEner=" + consumoEner + ", peso=" + peso + "carga=" + carga + '}';
    }
    
    
    
    
}
