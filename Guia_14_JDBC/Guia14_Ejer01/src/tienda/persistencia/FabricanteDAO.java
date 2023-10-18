/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;

/**
 *
 * @author LINA RAMIREZ
 */
public final class FabricanteDAO extends DAO {

    public void guardarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar el fabricante a registrar");
            }

            String sql = "INSERT INTO fabricante (codigo, nombre)"
                    + "VALUES ( '" + fabricante.getCodigo() + "' , '" + fabricante.getNombre() + "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar el fabricante que desea modificar");
            }

            String sql = "UPDATE fabricante SET "
                    + "nombre = '" + fabricante.getNombre() + "' WHERE codigo = '" + fabricante.getCodigo() + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    public void eliminarFabricante(Integer codigo) throws Exception {
        try {

            String sql = "DELETE FROM fabricante WHERE codigo = '" + codigo+ "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    public Collection<Fabricante> listarFabricante() throws Exception {
        try {
            String sql = "SELECT codigo, nombre FROM fabricante ";

            consultarBase(sql);

            Fabricante f = null;
            Collection<Fabricante> fabricantes = new ArrayList();
            while (resultado.next()) {
                f = new Fabricante();
                f.setCodigo(resultado.getInt(1));
                f.setNombre(resultado.getString(2));
                fabricantes.add(f);
            }
            desconectarBase();
            return fabricantes;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
    public Fabricante buscarFabricante_id(Integer id) throws Exception {
        try {
            String sql = "SELECT * FROM fabricante WHERE codigo ='"+ id+"'";

            consultarBase(sql);

            Fabricante fabricante = null;
            
            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
                
            }
            desconectarBase();
            return fabricante;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
    

}


