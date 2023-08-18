/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.RevolverAgua;

/**
 *
 * @author LINA RAMIREZ
 */
public class revolverSer {

    private RevolverAgua r;

    public revolverSer() {
        this.r = new RevolverAgua();
    }

    public RevolverAgua getR() {
        return r;
    }

    public void llenarRevolver(RevolverAgua r) {
        int posAgua = (int) (Math.random() * 10);
        r.setPosAgua(posAgua);
        int posActual = (int) (Math.random() * 10);
        r.setPosActual(posActual);
    }

    public boolean mojar(RevolverAgua r) {
        boolean mojar = false;
        if (r.getPosActual() == r.getPosAgua()) {
            mojar = true;
        }
        return mojar;
    }

    public void siguienteChorro(RevolverAgua r) {
        if (r.getPosActual() != 9) {
            r.setPosActual(r.getPosActual() + 1);
        } else {
            r.setPosActual(0);

        }

    }

    public void mostrarR(RevolverAgua r) {
        System.out.println("La posición actual del revolver es la número " + r.getPosActual());
        System.out.println("La posición actual del agua es la número " + r.getPosAgua());
        System.out.println("");
    }
}
