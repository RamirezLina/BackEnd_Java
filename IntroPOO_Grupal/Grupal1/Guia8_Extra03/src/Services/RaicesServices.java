/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entity.Raices;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class RaicesServices {
    Scanner read= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public Raices crearEcuacion(){
        Raices r = new Raices();
        System.out.println("Creando la Ecuacion aX^2+bX+c");
        System.out.println("Escriba el valor del coeficiente ' a'");
        r.setA(read.nextDouble());
        System.out.println("Escriba el valor de coeficiente ' b '");
        r.setB(read.nextDouble());
        System.out.println("Escriba el valor de coeficiente ' c '");
        r.setC(read.nextDouble());
        
        return r;
    }
    
    public double getDiscriminante(Raices r){
        double disc = Math.pow(r.getB(), 2)-(4*r.getA()*r.getC());
        return disc;
    }
    
    public boolean tieneRaices(Raices r){
        boolean raices;
        raices = getDiscriminante(r)> 0;
        
        return raices;
    }
    
    public boolean tieneRaiz(Raices r){
        boolean unaSolucion = getDiscriminante(r)== 0;
        return unaSolucion;
    }
    
    public void obtenerRaices(Raices r){
        double r1 = (-r.getB()+(Math.sqrt(getDiscriminante(r))))/(2*r.getA());
        double r2 = (-r.getB()-(Math.sqrt(getDiscriminante(r))))/(2*r.getA());
        
        System.out.println("La primer solución de la ecuación cuadrática "+r.getA()+"X^2+"+r.getB()+"X+"+r.getC()+"= 0 es "+r1);
        System.out.println("La segunda solución de la ecuación cuadrática "+r.getA()+"X^2+"+r.getB()+"X+"+r.getC()+"= 0 es "+r2);
    }
    
    public void obtenerRaiz(Raices r){
        double r1 = -r.getB()/(2*r.getA());
        
        
        System.out.println("La unica solución de la ecuación cuadrática "+r.getA()+"X^2+"+r.getB()+"X+"+r.getC()+"= 0 es "+r1);
    }
    
    public void calcular(Raices r){
        if (tieneRaices(r)) {
            System.out.println("La ecuacion tiene dos posibles soluciones");
            System.out.println("");
            obtenerRaices(r);
        }else if (tieneRaiz(r)){
            System.out.println("La ecuacion tiene una única solucion");
            System.out.println("");
            obtenerRaiz(r);
        }else{
            System.out.println("La ecuación"+r.getA()+"X^2+"+r.getB()+"X+"+r.getC()+"= 0 no tiene soluciones reales");
        }
    }
}
