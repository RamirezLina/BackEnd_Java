/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Asiento;
import Entities.Cine;
import Entities.Espectador;
import Entities.Pelicula;
import java.util.ArrayList;

/**
 *
 * @author LINA RAMIREZ
 */
public class CineServices {
    private Cine cine;
    
    public CineServices() {
        this.cine = new Cine();
    }

    public Cine getCine() {
        return cine;
    }
    
    
    
    public void etiquetarAsientos(){
        ArrayList<ArrayList<Asiento>> s = new ArrayList();
        ArrayList<String> columnas = new ArrayList();
        columnas.add("A");
        columnas.add("B");
        columnas.add("C");
        columnas.add("D");
        columnas.add("E");
        columnas.add("F");
        ArrayList<Asiento> col;
        
               
        
        for (int i = 0; i  <6; i++) {
            col = new ArrayList();
            for (int j = 8; j > 0; j--) {
                Asiento as = new Asiento();
                as.setFila(j);
                as.setColumna(columnas.get(i));
                as.setEstado(" ");
                col.add(as);
                
            }
            s.add(col);
            
            
        }
        
        cine.setSala(s);
        
    }
    
    public void crearCine(){
        
        Pelicula pel = new Pelicula("Todo lo solido", 3, 15, "Marshall Berman");
        etiquetarAsientos();
        float precio = 12000;
        
        cine.setPelicula(pel);
        cine.setPrecioEntrada(precio);
    }
    
    public ArrayList<Espectador> crearEspectadores(){
        ArrayList<Espectador> espectadores;
        espectadores = new ArrayList();
        ArrayList<String> columnas = new ArrayList();
        columnas.add("A");
        columnas.add("B");
        columnas.add("C");
        columnas.add("D");
        columnas.add("E");
        columnas.add("F");
        
        for (int i = 1; i < 100; i++) {
            Espectador e = new Espectador();
            
            e.setNombre(columnas.get(4)+"i");
            e.setEdad((int)(Math.random()*70));
            e.setDineroDisp((float)(Math.random()*50000));
            
            espectadores.add(e);
        }
        
        return espectadores;

    }
    
    public void mostrarSala(){
        
        for (int i = 0; i < 8; i++) {
            System.out.print("|");
            for (int j = 0; j < 6; j++) {
                System.out.print(cine.getSala().get(j).get(i)+"| ");

            }
            System.out.println();
        }
        
    }
    
    public void UbicarEspectadores(){
        ArrayList<Espectador> esp = crearEspectadores();
        
        for (Espectador e : esp) {
            if (e.getEdad()>=cine.getPelicula().getEdadMinima() && e.getDineroDisp()>=cine.getPrecioEntrada()) {
              Asiento asiento = asientoRandom();
                if (!asiento.getEstado().equals("Lleno")) {
                   asiento.setEstado("X"); 
                }else{
                    System.out.println("Sala llena");
                    break;
                }
                
            }
            
        }
        
    }
    
    public Asiento asientoRandom(){
        boolean dispAsiento  =false;
         Asiento as;
        for (int i = 0; i < 6; i++) {
            
            for (int j = 0; j < 8; j++) {
                if (cine.getSala().get(i).get(j).getEstado().equals(" ")) {
                   dispAsiento=true;
                   break;
                }
            }
            
        }
        if (dispAsiento) {
            do {
                as = cine.getSala().get((int)(Math.random()*6)).get((int)(Math.random()*8));
            } while (as.getEstado().equals("X"));
            
            
        }else{
            as= new Asiento();
            as.setEstado("Lleno");
        }
        
        return as;
        
    }
    
    
    
}
