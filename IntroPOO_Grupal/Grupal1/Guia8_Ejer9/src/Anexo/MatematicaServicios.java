/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anexo;
import Anexo.Matematica;
/**
 *
 * @author LINA RAMIREZ
 */
public class MatematicaServicios {
    
    public double devolverMayor(Matematica m){
        
        double may = Math.max(m.getNum1(),m.getNum2());
        
        return may;
    }
    
    public double calcularPotencia(Matematica m){
        double mayor = Math.round(Math.max(m.getNum1(),m.getNum2())); 
        double menor = Math.round(Math.min(m.getNum1(),m.getNum2()));
        
        double pot = Math.pow(mayor, menor);
        return pot;
        
    }
    
    public double calculaRaiz(Matematica m){
        double menor = Math.abs(Math.min(m.getNum1(),m.getNum2()));
        double raiz = Math.sqrt(menor);
        return raiz;
    }
    
    
    
}
