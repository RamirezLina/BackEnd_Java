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
public class Persona {
    private String name;
    private String apellido;
    private Integer edad;
    private Integer documento;
    private Perro perro;

    public Persona() {
    }
    
    

    public Persona(String name, String apellido, Integer edad, Integer documento, Perro perro) {
        this.name = name;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }

    public String getName() {
        return name;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public Integer getDocumento() {
        return documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + '}';
    }
    
    
    
    
}
