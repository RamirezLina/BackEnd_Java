/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.servicios.FabricanteService;
import tienda.servicios.ProductoService;

/**
 *
 * @author LINA RAMIREZ
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FabricanteService fs = new FabricanteService();
        ProductoService ps = new ProductoService();

        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Bienvenido a la aplicación de la tienda Arise");

        int opt;
        do {
            System.out.println("");
            System.out.println("Indique que desea hacer a continuación, digitando el número asociado a la opción");
            System.out.println("1. Lista los nombres y los precios de todos los productos");
            System.out.println("2. Listar aquellos productos que su precio esté entre 120 y 202.");
            System.out.println("3. Listar todos los Portátiles de la tabla producto.");
            System.out.println("4. Listar el nombre y el precio del producto más barato.");
            System.out.println("5. Ingresar un producto a la base de datos.");
            System.out.println("6. Ingresar un fabricante a la base de datos");
            System.out.println("7. Editar un producto con datos a elección.");
            System.out.println("8. Salir");
            System.out.println("");
            opt = read.nextInt();
            System.out.println("");

            switch (opt) {
                case 1:
                    try {
            
                        System.out.println("NOMBRES Y PRECIOS DE TODOS LOS PRODUCTOS");
                        System.out.println("");
                        ps.imprimirProductos(ps.listarProducto());
                        
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                case 2:
                    
                    try {
            
                        System.out.println("PRODUCTOS CON PRECIO ENTRE 120 Y 202");
                        System.out.println("");
                        ps.imprimirProductos(ps.productosPrecio120_202());
                        
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }

                    break;
                case 3:
                    try {
            
                        System.out.println("LISTA DE TODOS LOS PORTÁTILES");
                        System.out.println("");
                        ps.imprimirProductos(ps.listarProtatiles());
                        
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }

                    break;
                case 4:
                    try {
            
                        System.out.println("NOMBRE Y PRECIO DEL PRODUCTO MÁS BARATO");
                        System.out.println("");
                        ps.imprimirProducto(ps.precioMasBajo());
                        
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }

                    break;
                case 5:
                    try {
            
                        System.out.println("INGRESAR UN PRODUCTO A LA BASE DE DATOS");
                        System.out.println("");
                        System.out.println("Indique el codigo del producto");
                        int cod = read.nextInt();
                        System.out.println("Ingrese el nombre del producto");
                        String nombre = read.next();
                        System.out.println("Ingrese el precio del producto");
                        double precio = read.nextDouble();
                        System.out.println("Ingrese el codigo de identificación del fabricante");
                        
                        Fabricante fabricante = fs.buscarfabricantePorId(read.nextInt());
                        ps.crearProducto(cod, nombre, precio, fabricante);
                        
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }

                    break;
                case 6:
                    
                    try {
            
                        System.out.println("INGRESAR UN FABRICANTE A LA BASE DE DATOS");
                        System.out.println("");
                        System.out.println("Indique el codigo del fabricante");
                        int cod = read.nextInt();
                        System.out.println("Ingrese el nombre del fabricante");
                        String nombre = read.next();
                        
                        fs.crearFabricante(cod, nombre);
                        
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }

                    break;
                case 7:
                    try {
            
                        System.out.println("EDITAR UN PRODUCTO");
                        System.out.println("");
                        System.out.println("Indique el codigo del producto");
                        int cod = read.nextInt();
                        System.out.println("Ingrese el nuevo nombre del producto");
                        String nombre = read.next();
                        System.out.println("Ingrese el nuevo precio del producto");
                        double precio = read.nextDouble();
                        
                        ps.modificarProductoNombre(cod, nombre);
                        ps.modificarProductoPrecio(cod, precio);
                        
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }

                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción incorrecta, por favor seleccione una opción posible");
            }

        } while (opt != 8);
    }

}


