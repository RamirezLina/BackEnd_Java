/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio3_poo.Entidades;

/**
 *
 * @author Gabriel
 */
public class Cliente {
    private int id, edad;
    private double altura, peso;
    private String nombre, objetivo;

    public Cliente() {
    }

    public Cliente(int id, int edad, double altura, double peso, String nombre, String objetivo) {
        this.id = id;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.nombre = nombre;
        this.objetivo = objetivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", nombre=" + nombre + ", objetivo=" + objetivo + '}'+"\n";
    }
    
    
    
}
