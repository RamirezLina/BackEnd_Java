/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEner;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEner, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEner = consumoEner;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEner() {
        return consumoEner;
    }

    public double getPeso() {
        return peso;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoEner(char consumoEner) {
        this.consumoEner = consumoEner;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra) {
        //El char no se denota con comillas dobles si no simples... se verifica que la opción ingresada sea correcta
        switch (letra) {
            case 'A':
                setConsumoEner('A');
                break;
            case 'B':
                setConsumoEner('B');
                break;
            case 'C':
                setConsumoEner('C');
                break;
            case 'D':
                setConsumoEner('D');
                break;
            case 'E':
                setConsumoEner('E');
                break;
            case 'F':
                setConsumoEner('F');
                break;
            default:
                
                System.out.println("Consumo enérgetico no real, se asigna F");
                setConsumoEner('F');
        }

    }

    public void comprobarColor(String color) {
        ArrayList<String> colores = new ArrayList();
        colores.add("blanco");
        colores.add("negro");
        colores.add("rojo");
        colores.add("azul");
        colores.add("gris");

        for (String c : colores) {
            
            if (color.equalsIgnoreCase(c)) {
                setColor(color);
                break;
            } else {
                setColor("blanco");
                continue;
            }
            
        }

    }

    public void crearElectrodomestico() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        setPrecio(1000d);
        System.out.println("Escriba el color del electrodomestico");
        comprobarColor(read.next());
        System.out.println("Escriba la clasificación del consumo energetico");
        comprobarConsumoEnergetico(read.next().charAt(0));

        do {
            System.out.println("Escriba el peso del electrodomestico");
            setPeso(read.nextDouble());
        } while (getPeso() < 1);

    }

    public void precioFinal() {
        char consumo = getConsumoEner();
        switch (consumo) {
            case 'A':
                setPrecio(getPrecio() + 1000d + precioPeso());

                break;
            case 'B':
                setPrecio(getPrecio() + 800d + precioPeso());
                break;
            case 'C':
                setPrecio(getPrecio() + 600d + precioPeso());
                break;
            case 'D':
                setPrecio(getPrecio()+500d+precioPeso());
                break;
            case 'E':
                setPrecio(getPrecio()+300d+precioPeso());
                break;
            case 'F':
                setPrecio(getPrecio()+100d+precioPeso());
                break;
            
        }

    }

    public double precioPeso() {
        double precioAdi;
        double p = getPeso();
        if (p >= 1 && p <= 19) {
            precioAdi = 100;
        } else if (p >= 20 && p <= 49) {
            precioAdi = 500;

        } else if (p >= 50 && p <= 79) {
            precioAdi = 800;

        } else if (p >= 80) {
            precioAdi = 1000;

        } else {
            System.out.println("No se reconoce ese peso");
            precioAdi = 0;
        }

        return precioAdi;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEner=" + consumoEner + ", peso=" + peso + '}';
    }
    
    

}
