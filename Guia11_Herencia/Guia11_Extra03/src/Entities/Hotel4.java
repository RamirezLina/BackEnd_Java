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
public class Hotel4 extends Hotel{
    protected char gimnasio;
    protected String restaurante;
    protected int capacidadRest;

    public Hotel4() {
        super();
        Scanner read= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        do {            
            System.out.println("Indique el tipo de gimnasio A/B ");
            gimnasio = read.next().charAt(0);
        } while (gimnasio!='A' && gimnasio!='B');
        System.out.println("Indique el nombre del restaurante");
        restaurante = read.next();
        
        do {            
            System.out.println("Indique la capacidad del restaurante");
            capacidadRest = read.nextInt();
        } while (capacidadRest <1);
        
        
        
        
    }

    public Hotel4(char gimnasio, String restaurante, int capacidadRest, int numHabitaciones, int numCamas, int numPisos, Double precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(numHabitaciones, numCamas, numPisos, precioHab, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.restaurante = restaurante;
        this.capacidadRest = capacidadRest;
    }

    public char getGimnasio() {
        return gimnasio;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public int getCapacidadRest() {
        return capacidadRest;
    }

    public void setGimnasio(char gimnasio) {
        this.gimnasio = gimnasio;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public void setCapacidadRest(int capacidadRest) {
        this.capacidadRest = capacidadRest;
    }
    
    @Override
    public Double precioHab(){
        Double precio;
        
        precio = 50d + (1*getNumCamas())+aggGim()+aggRest();
        
        return precio;
    }
    
    public double aggRest(){
        double agregado;
        if (getCapacidadRest()<30) {
            agregado = 10;
            
        }else if(getCapacidadRest()<50){
            agregado = 30;
            
        }else{
            agregado = 50;
        }
        return agregado;
    }
    
    
    public double aggGim(){
        double aggGim;
        switch (getGimnasio()) {
            case 'A':
                aggGim = 50;
                break;
            case 'B':
                aggGim = 30;
                break;
            default:
                throw new AssertionError();
        }
        
        return aggGim;            
        
    }
}
