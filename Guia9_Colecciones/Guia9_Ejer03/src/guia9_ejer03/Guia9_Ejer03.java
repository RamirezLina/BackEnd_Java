/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_ejer03;
import Entities.Alumno;
import Services.AlumnoService;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia9_Ejer03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        AlumnoService as = new AlumnoService();
        
        as.añadirAlumno();
        System.out.println("");
        System.out.println("Determinar la nota final de un alumno");
        System.out.println("Ingrese el nombre del alumno a conocer la nota final");
        String nombre = read.next();
        
        int index = -1;
        for (int i = 0; i < as.getAlumnos().size(); i++) {
            
            Alumno A = as.getAlumnos().get(i);
            if (A.getNombre().equalsIgnoreCase(nombre)) {
                index = i;
                System.out.println("La nota final del alumno es " + as.notaFinal(i));
 
            }
            
            if (index == -1) {
                System.out.println("El alumno no se encuentra registrado");
            }
        }
        
        
        
    }
    
}
