/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejer9;
import Anexo.Matematica;
import Anexo.MatematicaServicios;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia8_Ejer9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MatematicaServicios mS = new MatematicaServicios();
        System.out.println("Aleatoriamente seleccionando los dos  numeros...");
        
        Matematica caso1 = new Matematica();
        double num1 = Math.round(Math.random()*20);
        double num2 = Math.round(Math.random()*20);
        caso1.setNum1(num1);
        caso1.setNum2(num2);
        
        
        System.out.println("");
        System.out.println("El numero mayor de los dos numeros es "+mS.devolverMayor(caso1));
        System.out.println("");
        System.out.println("La potencia del mayor numero elevado al menor es "+mS.calcularPotencia(caso1));
        System.out.println("");
        System.out.println("La raiz cuadrada del menor de los valores es "+mS.calculaRaiz(caso1));
        
    }
    
}
