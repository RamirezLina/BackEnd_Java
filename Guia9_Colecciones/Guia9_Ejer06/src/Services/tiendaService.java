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
        int count= 0;
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(name)) {
                Double value = entry.setValue(precio);
                count = 1;
                System.out.println("Se ha modificado el precio del producto");
            }
 
        }
        
        if (count == 0) {
            System.out.println("No se ha encontrado el producto");
            
        }
        
//       
    }
    
    public void eliminarProducto(){
        System.out.println("Escriba el nombre del producto a eliminar");
        String name = read.next();
        
        int count = 0;
        
        for (String p : productos.keySet()) {
            if (p.equals(name)) {
                count = 1;
                System.out.println("Se ha eliminado el producto");
            }
        }
        if (count == 0) {
            System.out.println("No se ha encontrado el producto, verifica letras en mayúscula y tildes");
            
        }
        
        productos.remove(name);
        
    }
    
    public void mostrarProductos(){
        System.out.println("Los productos disponibles en la tienda son:");
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            
            System.out.println(key+" | "+value);
            
        }
    }
    
    public void menu(){
        System.out.println("Bienvenido a su aplicación para el registro de productos");
        
        int opt;
        do {       
            System.out.println("");
            System.out.println("Indique que desea hacer a continuación, digitando el número asociado a la opción");
            System.out.println("1. Añadir un producto");
            System.out.println("2. Modificar precio de un producto");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Mostrar los productos registrados");
            System.out.println("5. Salir");
            opt = read.nextInt();

            switch (opt) {
                case 1:
                    añadirProducto();
                    break;
                case 2:
                    modificarPrecio();

                    break;
                case 3:
                    eliminarProducto();

                    break;
                case 4:
                    mostrarProductos();

                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción incorrecta, por favor seleccione una opción posible");
            }    
           
        } while (opt!=5);
        
    }
}
