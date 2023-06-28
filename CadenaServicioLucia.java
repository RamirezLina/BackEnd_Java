/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author adminprueba
 */
public class CadenaServicio {

    public Cadena crearCadena() {

        Cadena c1 = new Cadena();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase que desee");
        String frase1 = leer.nextLine();
        c1.setFrase(frase1);
        c1.setLongitud(lenght(frase1));
       
        return c1;
    }

    public int mostrarVocales(Cadena c1) {
        int cantidadVocales = 0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            String frase = c1.getFrase();
            char letra = frase.charAt(i);

            switch (Character.toLowerCase(letra)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    cantidadVocales++;
                    break;
                default:
                    break;
            }
        }
        return cantidadVocales;
    }

    public String invertirFrase(Cadena c1) {
        String frase = c1.getFrase();
        String fraseInvertida = "";

        for (int i = c1.getLongitud() - 1; i >= 0; i--) {
            fraseInvertida += frase.charAt(i);
        }

        return fraseInvertida;
    }

    public int vecesRepetido(Cadena c1, String letra) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la letra que desee");
        letra = leer.nextLine();
        String frase = c1.getFrase();
        int cantidadRepeticiones = 0;

        for (int i = 0; i < c1.getLongitud(); i++) {
            String caracter = Character.toString(charAt(i));
            if (letra.equals(caracter)) {
                cantidadRepeticiones++;
            }
        }
        return cantidadRepeticiones;
    }

    public void compararLongitud(Cadena c1, String frase) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase que desee");
        frase = leer.nextLine();
        int longitudFrase = length(frase);
        if (longitudFrase == c1.getLongitud()) {
            System.out.println("Las frases tienen la misma longitud");
        } else {
            System.out.println("Las frases no tienen la misma longitud");
        }
    }

    public String unirFrases(Cadena c1, String frase) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase que desee");
        frase = leer.nextLine();
        String fraseOriginal = c1.getFrase();
        String frasesUnidas = fraseOriginal.concat(frase);

        return frasesUnidas;
    }

    public String reemplazarA(Cadena c1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el caracter por el que va a reemplazar a A");
        String letra = leer.next();
        String frase = c1.getFrase();
        String fraseReemplazada = frase.replaceAll("a", letra);

        return fraseReemplazada;
    }

    public boolean contiene(Cadena c1) {
        boolean resultado = false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la letra que desee");
        String letra = leer.next();
        for (int i = 0; i < c1.getLongitud(); i++) {
            String caracter = Character.toString(charAt(i));
            if (letra.equals(caracter)) {
                resultado = true;
            } else {
                resultado = false;
            }
        }
        return resultado;
    }

    private int lenght(String Frase1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private char charAt(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int length(String frase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
