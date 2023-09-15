/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_extra03;

import Entity.Raices;
import Services.RaicesServices;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia8_Extra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RaicesServices rs = new RaicesServices();
        
        Raices Ec1 = rs.crearEcuacion();
        
        rs.calcular(Ec1);
    }
    
}
