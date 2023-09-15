/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author LINA RAMIREZ
 */
public class Cancion {
    private String titulo;
    private String cancion;

    public Cancion() {
    }

    public Cancion(String titulo, String cancion) {
        this.titulo = titulo;
        this.cancion = cancion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCancion() {
        return cancion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }
    
    
}
