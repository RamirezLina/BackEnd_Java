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
public class Dni {
    private String serie;
    private Integer num;

    public String getSerie() {
        return serie;
    }

    public Integer getNum() {
        return num;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Dni{" + "serie=" + serie + ", num=" + num + '}';
    }
    
    
}
