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
    private String lastname;
    private Dni dni;
    
     public Persona() {
    }
    

    public Persona(String name, String lastname, Dni dni) {
        this.name = name;
        this.lastname = lastname;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Dni getDni() {
        return dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setDni(Dni dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", lastname=" + lastname + ", dni=" + dni + '}';
    }

   
    
}
