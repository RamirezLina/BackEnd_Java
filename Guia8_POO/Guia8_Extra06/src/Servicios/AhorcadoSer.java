/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Scanner;
import Entidades.Ahorcado;

/**
 *
 * @author LINA RAMIREZ
 */
public class AhorcadoSer {
    Scanner read= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public Ahorcado crearJuego(){
        Ahorcado j1 = new Ahorcado();
        System.out.println("Ingrese la palabra");
        String pal = read.next();
        j1.setPalabra(definirPalabra(pal));
        System.out.println("Escriba la cantidad de jugadas máxima");
        j1.setJugadasMax(read.nextInt());
        j1.setLetrasEncontradas(0);
        String [] letrasProbadas = new String[j1.getJugadasMax()];
        j1.setLetrasProbadas(letrasProbadas);
        return j1;
    }
    
    public String [] definirPalabra(String pal){
        String [] palabra = new String[pal.length()];
        
        for (int i = 0; i < palabra.length; i++) {
            palabra[i]=pal.substring(i,i+1);
        }
        
        return palabra;
    }
    
    public void mostrarArray (Ahorcado j){
        System.out.print("[ ");
        for (String letra : j.getPalabra()) {
            System.out.print(letra + " | ");
        }
        System.out.println("]");
    }
    
    public void longitud(Ahorcado j){
        System.out.println("La palabra que debe encontrar tiene "+j.getPalabra().length+ " letras");
    }
    
    public void buscar(String letra, Ahorcado j){
        j.setJugadasMax(j.getJugadasMax()-1);
        int pert = 0;
        
        
        for (String l:  j.getPalabra()){
            
            if (l.equalsIgnoreCase(letra)) {
                j.setLetrasEncontradas(j.getLetrasEncontradas()+1);
                System.out.println("La letra pertenece a la palabra");
                pert = 1;
            }
            
            
        }
        if (pert == 0) {
                System.out.println("La letra no pertenece a la palabra");
                
        }
    }
    
    public void encontradas(Ahorcado j){
        System.out.println("");
        System.out.println("El numero de letras encontradas es "+j.getLetrasEncontradas());
        System.out.println("El numero de letras faltantes es "+(j.getPalabra().length-j.getLetrasEncontradas()));
        
    }
    
    public void intentos (Ahorcado j){
        System.out.println("El número de oportunidades restantes es "+j.getJugadasMax());
    }
    
    public void juego(){
        System.out.println("Bienvenido al juego del Ahorcado");
        System.out.println("Definiremos los elementos del juego");
        
        Ahorcado juego1 = crearJuego();
       
        System.out.println("");
        System.out.println("Empecemos...");
        int i = 0;
        do {
            
            boolean repetida = false;
            System.out.println("Escriba una letra");
            String letra = read.next();
            for (String letrasProbada : juego1.getLetrasProbadas()) {
                if (letra.equalsIgnoreCase(letrasProbada)) {
                    repetida = true;
                }
            }
            if (!repetida) {
                
                longitud(juego1);
                buscar(letra, juego1);
                encontradas(juego1);
                intentos(juego1);
                
                juego1.getLetrasProbadas()[i]=letra;
                i += 1;

                System.out.println("----------------------------");
            }else{
                System.out.println("Letra ya ingresada");
            }
            
        } while ((juego1.getPalabra().length != juego1.getLetrasEncontradas()) && (0!=juego1.getJugadasMax()));
        
        if (juego1.getPalabra().length== juego1.getLetrasEncontradas()) {
            System.out.println("Felicidades ha descubierto la palabra");
            System.out.println("La palabra es...");
            mostrarArray(juego1);
        }else if (0==juego1.getJugadasMax()) {
            System.out.println("¡Qué lástima!, Se acabaron los intentos...");
            System.out.println("La palabra era");
            mostrarArray(juego1);
        }
        
        
        
    }
}
