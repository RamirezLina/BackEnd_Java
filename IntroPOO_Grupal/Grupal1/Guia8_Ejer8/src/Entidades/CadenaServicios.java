/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class CadenaServicios {
    Scanner read = new Scanner (System.in); 
    public void llenarCadena(Cadena c){
        System.out.println("Escriba la frase a guardar");
        String frase = read.nextLine();
        c.setFrase(frase);
        c.setLongFrase(frase.length());
    }
    
    public int mostrarVocales(Cadena c){
        int voc = 0;
        for (int i = 0; i < c.getLongFrase(); i++) {
            String letra = c.getFrase().substring(i, i+1);
            
            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
                voc += 1;
            }
            
            
        }
        
        return voc; 
    }
    
    
    public String invertirFrase(Cadena c){
        
        String invert = "";
        
        for (int i = c.getLongFrase() - 1; i > -1 ; i--) {
            String letra = c.getFrase().substring(i, i+1);
            invert += letra;
        }
        return invert;
    }
    
    public int vecesRepetido (Cadena c, String l){
        int veces = 0;
        for (int i = 0; i < c.getLongFrase(); i++) {
            String letra = c.getFrase().substring(i, i+1);
            if (letra.equalsIgnoreCase(l)) {
                veces += 1;
            }
        }
        return veces;
    }
    
    
    public void compararLongitud (Cadena c, String f){
        if (c.getLongFrase() == f.length()) {
            System.out.println("Las frases tienen la misma longitud");
            
        }else if(c.getLongFrase() > f.length()){
            System.out.println("La frase inicial tiene mayor longitud");
        } else if(c.getLongFrase() < f.length()){
            System.out.println("La frase inicial tiene menor longitud");
        }
    }
    
    public String unirFrases(Cadena c, String frase){
        String unir = c.getFrase().concat(" ").concat(frase);
        
        return unir;
             
    }
    
    public String reemplazar(Cadena c, String carac){
        String resultado = "";
        for (int i = 0; i < c.getLongFrase(); i++) {
            String letra = c.getFrase().substring(i, i+1);
            if (letra.equalsIgnoreCase("a")) {
                letra = carac;
            }
            resultado += letra;
        }
        
        return resultado;
    }
    
    public boolean contiene (Cadena c, String let){
        boolean cont = false;
        for (int i = 0; i < c.getLongFrase(); i++) {
            String letra = c.getFrase().substring(i, i+1);
            if (letra.equalsIgnoreCase(let)) {
                cont = true;
            }
        }
        return cont;
    }
    
    
    
}
