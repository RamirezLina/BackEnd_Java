/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class AlumnoService {

    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private ArrayList<Alumno> Alumnos;

    public AlumnoService() {
        this.Alumnos = new ArrayList();
    }

    public ArrayList<Alumno> getAlumnos() {
        return Alumnos;
    }
    
    public void añadirAlumno() {

        String resp;
        do {
            System.out.println("Desea añadir un alumno? Responda Si/No");
            resp = read.next();
        } while (!resp.equalsIgnoreCase("si") && !resp.equalsIgnoreCase("no"));

        while (resp.equalsIgnoreCase("si")) {
            System.out.println("");
            System.out.println("Escriba el nombre del alumno a añadir");
            String nombre = read.next();
            ArrayList<Double> notas = new ArrayList();

            for (int i = 0; i < 3; i++) {
                System.out.println("Escriba la nota " + (i + 1));
                notas.add(read.nextDouble());
            }

            Alumno A = new Alumno(nombre, notas);
            Alumnos.add(A);

            do {
                System.out.println("Desea añadir un nuevo alumno? Responda Si/No");
                resp = read.next();
            } while (!resp.equalsIgnoreCase("si") && !resp.equalsIgnoreCase("no"));

        }

        mostrarAlumnos();

    }

    public void mostrarAlumnos() {
        System.out.println("");
        System.out.println("Los alumnos registrados son:");
        Alumnos.forEach((al) -> {
            System.out.print(al.getNombre() + " | ");
        });
        System.out.println("");
        System.out.println("Cantidad " + Alumnos.size());

    }

    public double notaFinal(int j) {
        
        double notaSum = 0;
        double promedio;
        Alumno A = Alumnos.get(j);
        for (Double nota : A.getNotas()) {
                    notaSum += nota;
                }
        promedio = notaSum / A.getNotas().size();
            
        
        Iterator<Alumno> it = Alumnos.iterator();

//        while (it.hasNext()) {
//            if (it.next().getNombre().equalsIgnoreCase(nombre)) {
//
//                for (Double nota : it.next().getNotas()) {
//                    notaSum += nota;
//                }
//
//                promedio = notaSum / it.next().getNotas().size();
//
//            }
//        }

        return promedio;

    }

}
