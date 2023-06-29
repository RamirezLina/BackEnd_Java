/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejer13;
import Anexo.CursoServ;
import Anexo.Curso;
import java.util.Scanner;
/**
 *
 * @author LINA RAMIREZ
 */
public class Guia8_Ejer13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        CursoServ cs = new CursoServ();
        // TODO code application logic here
        String resp;
        do {
            System.out.println("Desea crear un curso nuevo? Responda Si o No");        
            resp = read.nextLine();
        } while (!resp.equalsIgnoreCase("si") & !resp.equalsIgnoreCase("no"));
        
        
        
        while (resp.equalsIgnoreCase("si")){
            Curso curso1 = cs.crearCurso();
            System.out.println("Las características del curso son: ");
           
            System.out.println(curso1);
            System.out.println("");
            System.out.println("Los alumnos insicritos al curso son:");
            cs.mostrarArray (curso1);
            
            System.out.println("");
            System.out.println("La ganancia semanal es "+cs.calcularGananciaSemanal(curso1));
            break;
        }
        
//        REVISAR QUE SE PUEDAN INGRESAR LOS NOMBRES DE TODOS LOS ALUMNOS, LO DE NEXT.LINE
        
        
        
    }
    
}
