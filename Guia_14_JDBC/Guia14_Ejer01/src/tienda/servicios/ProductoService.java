/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.Collection;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

/**
 *
 * @author LINA RAMIREZ
 */
public class ProductoService {
    
    private ProductoDAO dao;

    public ProductoService() {
        this.dao = new ProductoDAO();
    }
    
    
    public void crearProducto(Integer codigo, String nombre, double precio, Fabricante fabricante) throws Exception {

        try {
            //Validamos
            if (codigo == null ) {
                throw new Exception("Debe indicar el codigo");
            }
            
            if (dao.buscarId(codigo) ) {
                throw new Exception("El codigo ya existe, no se puede repetir");
            }
            
            if (precio == 0) {
                throw new Exception("Debe indicar el precio");
            }

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
            
            
            if (fabricante == null) {
                throw new Exception("Debe indicar el fabricante");
            }

            //Creamos el producto
            Producto p = new Producto();
            p.setCodigo(codigo);
            p.setNombre(nombre);
            p.setPrecio(precio);
            p.setCodFabricante(fabricante);

            dao.guardarProducto(p);
        } catch (Exception e) {
            throw e;
        }
    }
    
    
     public void modificarProductoPrecio(Integer codigo, double precio) throws Exception {
         
         try {
            //Validamos
            if (codigo == null ) {
                throw new Exception("Debe indicar el codigo");
            }
            
            if (!dao.buscarId(codigo) ) {
                throw new Exception("El codigo no existe, digite nuevamente");
            }
            
            if (precio == 0) {
                throw new Exception("Debe indicar el precio");
            }
            
            //Traemos el producto
            Producto p = buscarProductoCod(codigo);
             //Modificamos el producto
             p.setPrecio(precio);
            dao.modificarProductoPrecio(p);
                    
        } catch (Exception e) {
            throw e;
        }
         
     }
     
     
     public void modificarProductoNombre(Integer codigo, String nombre) throws Exception {
         
         try {
            //Validamos
            if (codigo == null ) {
                throw new Exception("Debe indicar el codigo");
            }
            
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }

            
            //Traemos el producto
            Producto p = buscarProductoCod(codigo);
            
            //Modificamos el producto
            p.setNombre(nombre);
            dao.modificarProductoPrecio(p);
                    
        } catch (Exception e) {
            throw e;
        }
         
     }
     public Producto buscarProductoCod(int cod) throws Exception {

        try {

            //Validamos
            if (cod < 0) {
                throw new Exception("Debe indicar el codigo");
            }
            Producto producto = dao.buscarProductoCod(cod);
            //Verificamos
            if (producto == null) {
                throw new Exception("No se econtró producto para el codigo indicado");
            }

            return producto;
        } catch (Exception e) {
            throw e;
        }
    }
     
    public void eliminarProducto(int codigo) throws Exception {

        try {

            //Validamos 
            if (codigo == 0) {
                throw new Exception("Debe indicar el codigo del fabricante");
            }
            
            buscarProductoCod(codigo);

            dao.eliminarProducto(codigo);
            
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Collection<Producto> listarProducto() throws Exception {

        try {

            Collection<Producto> productos = dao.listarProductos();

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void imprimirProductos(Collection<Producto> productos)throws Exception {
        
        try{
            //Listar las mascotas
            
            
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.toString());
                }
            }
            
        }catch (Exception e){
            throw e;
        }
    }
    
    public void imprimirProducto(Producto producto)throws Exception {
        
        try{
            //Listar las mascotas
            
            
            System.out.println(producto.toString());
            
        }catch (Exception e){
            throw e;
        }
    }
    
    public Collection<Producto> productosPrecio120_202() throws Exception {

        try {

            Collection<Producto> productos = dao.productosPrecio120_202();

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public Collection<Producto> listarProtatiles() throws Exception {

        try {

            Collection<Producto> productos = dao.listarProtatiles();

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Producto precioMasBajo() throws Exception {

        try {

            Producto p = dao.precioMasBajo();

            return p;
        } catch (Exception e) {
            throw e;
        }
    }
     
    
}
