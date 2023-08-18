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
public class Jugador {
    private String name;
    private String lastname;
    private Integer posicion;
    private Integer num;

    public Jugador() {
    }
    
    
    public Jugador(String name, String lastname, Integer posicion, Integer num) {
        this.name = name;
        this.lastname = lastname;
        this.posicion = posicion;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public Integer getNum() {
        return num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Jugador{" + "name=" + name + ", lastname=" + lastname + ", posicion=" + posicion + ", num=" + num + '}';
    }
    
    
    
}
