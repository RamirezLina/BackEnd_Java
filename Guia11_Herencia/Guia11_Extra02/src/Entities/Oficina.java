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
public class Oficina extends Edificio{
    private int numOficinas;
    private int personasOficina;
    private int numPisos;

    public Oficina() {
        super();
        Scanner read= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Escriba el número de personas trabajan por oficina");
        personasOficina = read.nextInt();
        System.out.println("Indique el numero de oficinas por piso");
        numOficinas=(read.nextInt());
        System.out.println("Indique el numero de pisos en el edificio");
        numPisos=(read.nextInt());
    }

    public Oficina(int numOficinas, int personasOficina, int numPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.personasOficina = personasOficina;
        this.numPisos = numPisos;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public int getPersonasOficina() {
        return personasOficina;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public void setPersonasOficina(int personasOficina) {
        this.personasOficina = personasOficina;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    @Override
    public void calcularSuperficie() {
        double sup = getAncho()*getLargo()*getNumPisos();
        System.out.println("La superficie del edificio es "+sup+" m2");
        
    }

    
    
    public void cantPersonas(){
        
        
        System.out.println("El número de personas máximas permitidas por piso son "+(getPersonasOficina()*getNumOficinas()));
        System.out.println("El numero de personas posibles en todo el edificio son "+(getPersonasOficina()*getNumOficinas()* getNumPisos()));
        
    }
    
}
