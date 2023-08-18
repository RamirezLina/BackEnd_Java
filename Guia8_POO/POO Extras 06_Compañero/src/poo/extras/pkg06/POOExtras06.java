package poo.extras.pkg06;

import entidad.Ahorcado;
import servicios.ServicioAhorcado;


public class POOExtras06 {

    public static void main(String[] args) {
        ServicioAhorcado sa = new ServicioAhorcado();
        Ahorcado a = sa.crearJuego();
        //sa.buscar(a);
        //sa.encontradas(a);
        //sa.intentos(a);
        sa.juego(a);
        //sa.escribir(a);
    }

}
