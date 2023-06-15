/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intropoo_grupal;
import Operaciones.FiguraGeo;
/**
 *
 * @author LINA RAMIREZ
 */
public class IntroPOO_Grupal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido a la calculadora gráfica");
        System.out.println("A calcular la primer figura");
        FiguraGeo fig1 = new FiguraGeo();
        fig1.crearFig();
        System.out.println(fig1);
        System.out.println("El area de la figura es " + fig1.areaFig());
        System.out.println("E perimetro de la figura es "+ fig1.perimFig());
        
        System.out.println("");
        System.out.println("Ahora, a calcular la segunda figura");
        FiguraGeo fig2 = new FiguraGeo();
        fig2.crearFig();
        System.out.println(fig2);
        System.out.println("El area de la figura es " + fig2.areaFig());
        System.out.println("E perimetro de la figura es "+ fig2.perimFig());
        
    }
    
}
