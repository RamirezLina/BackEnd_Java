/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.Collection;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

/**
 *
 * @author LINA RAMIREZ
 */
public class FabricanteService {
    private FabricanteDAO dao;

    public FabricanteService() {
        this.dao = new FabricanteDAO();
    }
    
    public void crearFabricante(Integer codigo, String nombre) throws Exception {

        try {
            //Validamos
            if (codigo == null) {
                throw new Exception("Debe indicar el codigo del cliente");
            }
            
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
            
            if (buscarfabricantePorId(codigo) != null) {
                throw new Exception("Ya existe un fabricante con el codigo indicado" + codigo);
            }

            //Creamos el usuario
            Fabricante f = new Fabricante();
            f.setCodigo(codigo);
            f.setNombre(nombre);
            dao.guardarFabricante(f);
        } catch (Exception e) {
            throw e;
        }
    }
    
     public void modificarFabricante(Integer codigo, String nombreActual, String nombreNuevo) throws Exception {

        try {

            //Validamos
            if (codigo == null) {
                throw new Exception("Debe indicar el fabricante");
            }

            if (nombreActual == null || nombreActual.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre actual");
            }

            if (nombreNuevo == null || nombreNuevo.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre nuevo");
            }

            //Buscamos
            
            if (buscarfabricantePorId(codigo) == null) {
                throw new Exception("No existe un fabricante con el codigo indicado" + codigo);
            }
            Fabricante f = buscarfabricantePorId(codigo);

            

            //Modificamos
            f.setNombre(nombreNuevo);

            dao.modificarFabricante(f);
        } catch (Exception e) {
            throw e;
        }
    }
     
     public void eliminarFabricante(Integer codigo) throws Exception {

        try {

            //Validamos 
            if (codigo == null) {
                throw new Exception("Debe indicar el codigo del fabricante");
            }
            
            if (buscarfabricantePorId(codigo) == null) {
                throw new Exception("No existe un fabricante con el codigo indicado" + codigo);
            }

            dao.eliminarFabricante(codigo);
            
            
        } catch (Exception e) {
            throw e;
        }
    }
     
     public Collection<Fabricante> listarFabricante() throws Exception {

        try {

            Collection<Fabricante> fabricantes = dao.listarFabricante();

            return fabricantes;
        } catch (Exception e) {
            throw e;
        }
    }
     
     
     
    
    public Fabricante buscarfabricantePorId(Integer id) throws Exception {

        try {

            //Validamos
            if (id == null) {
                throw new Exception("Debe indicar el id");
            }

            Fabricante fabricante = dao.buscarFabricante_id(id);

            return fabricante;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void imprimirFabricantes() throws Exception {

        try {

            //Listamos los usuarios
            Collection<Fabricante> fabricantes = listarFabricante();

            //Imprimimos los usuarios
            if (fabricantes.isEmpty()) {
                throw new Exception("No existen fabricantes para mostrar");
            } else {
                fabricantes.forEach((f) -> {
                    System.out.println(f);
                });
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    
}
