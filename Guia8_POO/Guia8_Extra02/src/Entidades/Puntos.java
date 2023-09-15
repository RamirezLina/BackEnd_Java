/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author LINA RAMIREZ
 */
public class Puntos {
    private long x1;
    private long y1;
    private long x2;
    private long y2;

    public Puntos() {
    }

    public Puntos(long x1, long y1, long x2, long y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public long getX1() {
        return x1;
    }

    public long getY1() {
        return y1;
    }

    public long getX2() {
        return x2;
    }

    public long getY2() {
        return y2;
    }

    public void setX1(long x1) {
        this.x1 = x1;
    }

    public void setY1(long y1) {
        this.y1 = y1;
    }

    public void setX2(long x2) {
        this.x2 = x2;
    }

    public void setY2(long y2) {
        this.y2 = y2;
    }

    @Override
    public String toString() {
        return "Puntos{" + "x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + '}';
    }
    
    
}
