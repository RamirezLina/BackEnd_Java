/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class tiendaService {
    private Scanner read;
    private HashMap<String, Double> productos;

    public tiendaService() {
        this.read =  new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        this.productos = new HashMap();
       
    }
    
    public void añadirProducto(){
        System.out.println("Escriba el nombre del producto");
        String name = read.next();
        System.out.println("Escriba el precio del producto");
        Double precio = read.nextDouble();
        productos.put(name, precio);
    }
    
    public void modificarPrecio(){
        System.out.println("Escriba el nombre del producto a modificar el precio");
        String name = read.next(); 
        System.out.println("Escriba el nuevo precio");
        Double precio = read.nextDouble();
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(name)) {
                Double value = entry.setValue(precio);
            }
 
        }
        
//       
    }
    
    public void eliminarProducto(){
        System.out.println("Escriba el nombre del producto a eliminar");
        String name = read.next();
        
        for (String p : productos.keySet()) {
            if (p.equalsIgnoreCase(name)) {
                productos.remove(p);
            }
        }
        
    }
    
    public void mostrarProductos(){
        System.out.println("Los productos disponibles en la tienda son:");
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            
            System.out.println(key+" | "+value);
            
        }
    }
    
}
