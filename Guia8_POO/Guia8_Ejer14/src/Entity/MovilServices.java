/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Scanner;
import Entity.MovilServices;

/**
 *
 * @author LINA RAMIREZ
 */
public class MovilServices {
    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public Movil cargarCelular(){
        Movil m = new Movil();
        System.out.println("Se esta añadiendo un nuevo celular a su base de datos");
        System.out.println("Ingrese la marca del celular");
        m.setMarca(read.next());
        System.out.println("ingrese el precio del celular");
        m.setPrecio(read.nextDouble());
        System.out.println("Ingrese el modelo");
        m.setModelo(read.next());
        System.out.println("Ingrese la memoriaRam");
        m.setMemoriaRam(read.nextInt());
        System.out.println("Ingrese el almacenamiento");
        m.setAlmacenamiento(read.nextInt());
        m.setCodigo(ingresarCodigo());
        return m;
    }
    
    public int[] ingresarCodigo(){
        int [] codigo = new int[7];
        
        for (int i = 0; i < codigo.length; i++) {
            System.out.println("Ingrese el numero "+i+" del código");
            codigo[i] = read.nextInt();
        }
        return codigo;
    }



}
