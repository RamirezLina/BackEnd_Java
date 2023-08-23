/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author LINA RAMIREZ
 */
public class Cliente {
    private int cc;
    private String nombre;
    private String apellido;
    private String correo;
    private String domicilio;
    private int telefono;

    public Cliente() {
    }

    public Cliente(int cc, String nombre, String apellido, String correo, String domicilio, int telefono) {
        this.cc = cc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public int getCc() {
        return cc;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cc=" + cc + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }
    
    
    
}
