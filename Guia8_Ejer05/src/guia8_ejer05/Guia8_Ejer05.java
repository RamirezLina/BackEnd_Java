/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejer05;

import Anexos.Cuenta;
import Service.CuentaServicio;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia8_Ejer05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaServicio cs = new CuentaServicio();
        Cuenta c1 = cs.crearCuenta();
        cs.consultarSaldo(c1);
        cs.ingresoDinero(c1);
        cs.consultarSaldo(c1);
        cs.retirarDinero(c1);
        System.out.println("");    
        cs.consultarDatos(c1);
        System.out.println("");
        System.out.println("Metodo de extracción rapida");
        cs.extraccionRapida(c1);
        c1.toString();
    }
    
}
