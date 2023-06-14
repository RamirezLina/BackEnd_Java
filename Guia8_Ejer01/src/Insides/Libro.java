/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Insides;

import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class Libro {
    private int ISBN;
    private String Titulo;
    private String Autor;
    private int Pags;
    
    public Libro (){
        
    }

    public Libro(int ISBN, String Titulo, String Autor, int Pags) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Pags = Pags;
    }
    
    public void cargar (){
        Scanner read = new Scanner (System.in);
        System.out.println("Escriba el ISBN");
        this.ISBN = read.nextInt();
        read.nextLine();
        System.out.println("Escriba el titulo del libro");
        this.Titulo = read.nextLine();
        
        System.out.println("Escriba el autor");
        this.Autor = read.nextLine();
        
        System.out.println("Escriba el numero de paginas");
        this.Pags = read.nextInt();
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", Pags=" + Pags + '}';
    }
    
    
    
    
    
}
