package entidad;

import java.util.Arrays;

public class Ahorcado {

    private char[] palabra;
    private int letrasEncontradas;
    private int cantidadIntentos;
    private char[] adivinar;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int letrasEncontradas, int cantidadIntentos, char[] adivinar) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.cantidadIntentos = cantidadIntentos;
        this.adivinar = adivinar;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getCantidadIntentos() {
        return cantidadIntentos;
    }

    public void setCantidadIntentos(int cantidadIntentos) {
        this.cantidadIntentos = cantidadIntentos;
    }

    public char[] getAdivinar() {
        return adivinar;
    }

    public void setAdivinar(char[] adivinar) {
        this.adivinar = adivinar;
    }
}
