/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_ejem1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author LINA RAMIREZ
 */
public class Guia9_Ejem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

//        EJEMPLO 1
//        ArrayList<Integer> listado = new ArrayList();
//        TreeSet<String> arbol = new TreeSet();
//        HashMap<Integer, String> personas = new HashMap();
////        EJEMPLO2
//        int x = 25;
//        String name = "Lina Maria";
//
//        listado.add(x);
//        arbol.add(name);
//        personas.put(x, name);
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println("Escriba la edad");
//            int x1 = read.nextInt();
//            listado.add(x);
//            System.out.println("Escriba el nombre");
//            String name2 = read.next();
//            arbol.add(name2);
//            personas.put(x1, name2);
//
//        }
//        
////        EJEMPLO3
//        listado.remove(24);
//        arbol.remove("ISa");
//        listado.remove(2);
//        personas.remove(45);
        
        
//        EJEMPLO4
        HashMap <Integer, String> personas = new HashMap();
        String n1 = "Albus";
        String n2 = "Severus";
        personas.put(1, n1);
        personas.put(2, n2);
        
        //    EJEMPLO5
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it =bebidas.iterator();
        while (it.hasNext()){
            if (it.next().equals("café")){
                it.remove();
            }
        }
    }
    

    

}
