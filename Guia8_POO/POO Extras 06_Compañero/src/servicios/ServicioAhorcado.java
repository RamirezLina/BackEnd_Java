package servicios;

import entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class ServicioAhorcado {

    Scanner leer = new Scanner(System.in);
    Ahorcado a = new Ahorcado();

    public Ahorcado crearJuego() {
        System.out.println("Ingrese la palabra para que la adivinen");
        String palabraString = leer.next();
        char[] palabraArray = palabraString.toCharArray();
        a.setPalabra(palabraArray);
        //System.out.println("Cuantos intentos tienen?");
        //a.setCantidadIntentos(leer.nextInt());
        a.setCantidadIntentos(6);
        a.setLetrasEncontradas(0);
        char[] adivinar = new char[longitud(a)];
        Arrays.fill(adivinar, '-');
        a.setAdivinar(adivinar);
        return a;
    }
    /*Cree un atributo nuevo para setear en el que voy completando las letras
    acertadas, luego comparo este con el atrivuto de la palabra original,
    si ambos son iguales el juego esta ganado */
    
    public int longitud(Ahorcado a) {
        int longitudPalabra = a.getPalabra().length;
        return longitudPalabra;
    }

    public int buscar(Ahorcado a) {
        int correcto = 0;
        System.out.println("Ingrese una letra: ");
        char letra = leer.next().charAt(0);
        char[] palabra = a.getPalabra();
        char[] palabraACompletar = a.getAdivinar();
        for (int i = 0; i < longitud(a); i++) {
            if (palabra[i] == letra) {
                palabraACompletar[i] = letra;
                System.out.println("Letra presente en lugar " + i);
                correcto += 1;
            }
        }
        a.setAdivinar(palabraACompletar);
        return correcto;
    }

    public boolean encontradas(Ahorcado a) {
        boolean existe = false;
        int cont = buscar(a);
        if (cont > 0) {
            a.setLetrasEncontradas(a.getLetrasEncontradas() + cont);
            System.out.println("letras encontradas: " + a.getLetrasEncontradas());
            System.out.println("letras faltantes: " + (longitud(a) - a.getLetrasEncontradas()));
            existe = true;
        }
        return existe;
    }

    public void intentos(Ahorcado a) {
        /*if (!encontradas(a)) {
        a.setCantidadIntentos(a.getCantidadIntentos() - 1);
        }
        System.out.println("intentos restantes: " + a.getCantidadIntentos());*/
        if (!encontradas(a)) {
            a.setCantidadIntentos(a.getCantidadIntentos() - 1);
        }
        System.out.println("intentos restantes: " + a.getCantidadIntentos());
    }

    public void escribirPalabra(Ahorcado a) {
        System.out.println(a.getAdivinar());
        /*char[] adivinar = a.getAdivinar();
        for (int i = 0; i < longitud(a); i++) {
        System.out.print(adivinar[i]);
        }*/
        System.out.println("");
    }

    public void juego(Ahorcado a) {
        do {
            intentos(a);
            System.out.println("");
            escribirPalabra(a);
            dibujo(a);
            System.out.println("......................");
        } while (a.getCantidadIntentos() > 0 && !Arrays.equals(a.getPalabra(), a.getAdivinar())/*a.getLetrasEncontradas() < longitud(a)*/);
        if (a.getCantidadIntentos() == 0) {
            System.out.println("Lo siento, has perdido.");
        }
        if (a.getLetrasEncontradas() == longitud(a)) {
            System.out.println("Felicitaciones. Has acertado.");
        }
    }

    /*Creo el metodo dibujar para hacer el ahorcado*/
    public void dibujo(Ahorcado a) {
        char[][] dibujo = new char[4][4];
        int errores = 6 - a.getCantidadIntentos();
        dibujo[0][0] = '┏';
        dibujo[1][0] = '│';
        dibujo[2][0] = '│';
        dibujo[3][0] = '│';
        dibujo[0][1] = '—';
        dibujo[0][2] = '┬';
        switch (errores) {
            case 1:
                dibujo[1][2] = 'O';
                break;
            case 2:
                dibujo[1][2] = 'O';
                dibujo[2][2] = '|';
                break;
            case 3:
                dibujo[1][2] = 'O';
                dibujo[2][2] = '|';
                dibujo[2][1] = '/';
                break;
            case 4:
                dibujo[1][2] = 'O';
                dibujo[2][2] = '|';
                dibujo[2][1] = '/';
                dibujo[2][3] = '\\';
                break;
            case 5:
                dibujo[1][2] = 'O';
                dibujo[2][2] = '|';
                dibujo[2][1] = '/';
                dibujo[2][3] = '\\';
                dibujo[3][1] = '/';
                break;
            case 6:
                dibujo[1][2] = 'O';
                dibujo[2][2] = '|';
                dibujo[2][1] = '/';
                dibujo[2][3] = '\\';
                dibujo[3][1] = '/';
                dibujo[3][3] = '\\';
                break;
            default:
                break;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(dibujo[i][j]);
            }
            System.out.println("");
        }
    }
}
