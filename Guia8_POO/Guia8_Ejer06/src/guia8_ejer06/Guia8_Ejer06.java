/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejer06;

import Entidades.Cafetera;
import Entidades.CafeteraServicios;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia8_Ejer06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner (System.in).useDelimiter("\n");
        CafeteraServicios cs = new CafeteraServicios();
        System.out.println("Desea crear una nueva cafetera?");
        String resp = read.nextLine();
        if (resp.equalsIgnoreCase("si")) {
           int accResp; 
           Cafetera caf1 = cs.crearCafetera();
            do {                
                System.out.println("");
                System.out.println("Seleccione el numero que represente la acción que desear realizar");
                System.out.println("1. Llenar cafetera");
                System.out.println("2. Servir una taza");
                System.out.println("3. Vaciar cafetera");
                System.out.println("4. Agregar cafe");
                System.out.println("5. Salir del programa");
                accResp = read.nextInt();
                switch (accResp) {
                    case 1:
                        cs.llenarCafetera(caf1);
                        break;
                    case 2:
                        System.out.println("Escriba el tamaño de la taza a servir");
                        int tamanoTaza = read.nextInt();
                        cs.servirTaza(tamanoTaza, caf1);
                        break;
                    case 3:
                        cs.vaciarCafetera(caf1);
                        break;
                    case 4:
                        System.out.println("Escriba la cantidad de cafe a añadir");
                        double cafe = read.nextDouble();
                        cs.agragarCafe(cafe, caf1);
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Valor incorrecto");
                        System.out.println("Regresando a menú principal");
                }  
            } while (accResp!= 5);

        }else{
            System.out.println("Saliendo del sistema, bye");
        }
         
    }
    
}
