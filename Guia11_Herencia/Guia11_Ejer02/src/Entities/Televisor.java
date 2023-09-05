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
public class Televisor extends Electrodomestico{
    protected int resolucion;
    protected boolean TDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean TDT, double precio, String color, char consumoEner, double peso) {
        super(precio, color, consumoEner, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    
    public void crearTelevisor(){
        
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        crearElectrodomestico();
        do {
            System.out.println("Escriba la resolución del televisor");
            setResolucion(read.nextInt());
        } while (getResolucion() < 1);
        
        int inc = 1;
        do {
            System.out.println("El televisor tiene sintonizador TDT? S/N");
            String resp = read.next();
            
            switch (resp.toUpperCase()) {
                case "S":
                    setTDT(true);
                    break;
                case "N":
                    setTDT(false);
                    break;
                default:
                    System.out.println("Opción inconrrecta");
                    inc = 0;
            }
        } while (inc == 0);
    }
    
    @Override
    public void precioFinal() {
        char consumo = getConsumoEner();
        switch (consumo) {
            case 'A':
                setPrecio(getPrecio() + 1000d);

                break;
            case 'B':
                setPrecio(getPrecio() + 800d );
                break;
            case 'C':
                setPrecio(getPrecio() + 600d);
                break;
            case 'D':
                setPrecio(getPrecio()+500d);
                break;
            case 'E':
                setPrecio(getPrecio()+300d);
                break;
            case 'F':
                setPrecio(getPrecio()+100d);
                break;
            
        }
        
        setPrecio(getPrecio()+precioPeso());
        if (getResolucion()>40) {
            setPrecio(getPrecio()*1.3);
        }
        
        if (TDT) {
            setPrecio(getPrecio()+500d);
        }

    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEner=" + consumoEner + ", peso=" + peso + "resolucion=" + resolucion + ", TDT=" + TDT + '}';
    }
    
    
    
    
    
}
