/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anexo;
import Anexo.Curso;
import java.util.Scanner;
/**
 *
 * @author LINA RAMIREZ
 */
public class CursoServ {
    Scanner read = new Scanner (System.in).useDelimiter("\n");
    
    public String[] cargarAlumnos (){
        String [] alumnos = new String[5];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Escriba el nombre del alumno a registrar");
            System.out.println("Alumno "+(i+1));
            alumnos[i]=read.nextLine();
        }
        return alumnos;
    }
    
    public Curso crearCurso(){
        System.out.println("Se inicia la creación de un nuevo curso");
        System.out.println("Escriba el nombre del curso");
        String nombreCurso = read.nextLine();
        System.out.println("Escriba la cantidad de horas del curso al dia");
        int horasDia = read.nextInt();
        System.out.println("Escriba las veces que se dicta el curso a la semana");
        int diasSemana = read.nextInt();
        String turno;
        do {
            System.out.println("Escriba M si el turno es en la mañana o T si el turno es en la tarde");
            turno = read.next();
        
        } while (!"M".equals(turno) & !"T".equals(turno));
        
        System.out.println("Escriba el precio por hora del curso");
        double precio = read.nextDouble();
        read.next();
        String [] alumnos = cargarAlumnos ();
        
        return  new Curso(nombreCurso, horasDia, diasSemana, turno, precio, alumnos);
    }
    
    public void mostrarArray (Curso c){
        System.out.print("[ ");
        for (String alumno : c.getAlumnos()) {
            System.out.print(alumno + " ");
        }
        System.out.println("]");
    }
    
}
