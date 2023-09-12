/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11_extra04;

import Entities.Empleado;
import Entities.Estudiante;
import Entities.PerServicio;
import Entities.Persona;
import Entities.Profesor;
import Services.FacultadServ;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia11_Extra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido al Sistema de Gestión de la Facultad");
        FacultadServ fs = new FacultadServ();
        fs.menu();
    }
       

}
