/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.servicios.FabricanteService;
/**
 *
 * @author LINA RAMIREZ
 */
public class ProductoDAO extends DAO{
    
    private final FabricanteService fs;

    public ProductoDAO() {
        this.fs = new FabricanteService();
    }
    
    
    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el usuario");
            }

            String sql = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante)"
                    + "VALUES ( '" + producto.getCodigo() + "' , '" + producto.getNombre() + "' , '" +producto.getPrecio() + "' , '" + producto.getCodFabricante().getCodigo() + "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    public void modificarProductoPrecio(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }

            String sql = "UPDATE producto SET "
                    + "precio = '" + producto.getPrecio() + "' WHERE codigo = '" + producto.getCodigo() + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    public void modificarProductoNombre(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }

            String sql = "UPDATE producto SET "
                    + "nombre = '" + producto.getNombre() + "' WHERE codigo = '" + producto.getCodigo() + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarProducto(int codigo) throws Exception {
        try {

            String sql = "DELETE FROM producto WHERE codigo = '" + codigo + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    public Collection<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto ";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                
                
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
    
    public Producto buscarProductoCod(int cod) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE codigo = " + cod+ "";
            consultarBase(sql);
            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodFabricante(fs.buscarfabricantePorId(resultado.getInt(4)));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    public Collection<Producto> productosPrecio120_202() throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE precio between 120 AND 202";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(2));
                producto.setCodigo(resultado.getInt(1));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodFabricante(fs.buscarfabricantePorId(resultado.getInt(4)));
                
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
    public Collection<Producto> listarProtatiles() throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%port_til%'";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(2));
                producto.setCodigo(resultado.getInt(1));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodFabricante(fs.buscarfabricantePorId(resultado.getInt(4)));
                
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
    public Producto precioMasBajo() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto ORDER BY precio ASC LIMIT 1";

            consultarBase(sql);

            Producto producto = null;
            
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
    public boolean buscarId(Integer id) throws Exception {
        try {
            String sql = "SELECT codigo FROM producto WHERE codigo ='"+ id+"'";

            consultarBase(sql);

            boolean existe = false;
             int cod = -1;
            
            while (resultado.next()) {
               
                cod = resultado.getInt(1);
                
                
            }
            desconectarBase();
            if (cod == id) {
               existe = true;
            }
            
            return existe;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
}
