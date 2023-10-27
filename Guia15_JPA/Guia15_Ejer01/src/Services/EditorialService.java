/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Autor;
import Entidades.Editorial;
import Persistence.EditorialDAO;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author LINA RAMIREZ
 */
public class EditorialService {
    
    private EditorialDAO dao;

    public EditorialService() {
        this.dao = new EditorialDAO();
    }
    
        
    public void crearEditorial(String nombre) throws Exception {

        try {
            //Validamos
            

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }

            //Creamos la editorial
            Editorial ed = new Editorial();
            
            ed.setNombre(nombre);
            

            dao.guardarEditorial(ed);
        } catch (Exception e) {
            throw e;
        }
    }
    
    
     public void modificarEditorial(Integer id, String nombre) throws Exception {
         
         try {
            //Validamos
            
            if (id == null ) {
                throw new Exception("Debe indicar el codigo");
            }
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre nuevo");
            }
            
            if (!dao.buscarId(id) ) {
                throw new Exception("El ID no existe, digite nuevamente");
            }
            
            
            
            //Traemos la editorial
            Editorial ed = dao.buscarEditorialID(id);
             //Modificamos la editorial
             ed.setNombre(nombre);
            dao.modificarEditorial(ed);
                    
        } catch (Exception e) {
            throw e;
        }
         
     }
     
     
     public void eliminarEditorial(Integer id) throws Exception {
        try {

            if (id == null ) {
                throw new Exception("Debe indicar el codigo");
            }
            
            
            if (!dao.buscarId(id) ) {
                throw new Exception("El codigo no existe, digite nuevamente");
            }
            
            //Traemos el autor
            Editorial ed = dao.buscarEditorialID(id);
            ed.setAlta(false);
            dao.eliminarEditorial(ed);
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public List<Editorial> listarEditorialNombre(String nombre) throws Exception {

        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre de la editorial a buscar");
            }

            List<Editorial> editoriales = dao.buscarNombre(nombre);
            
            return editoriales;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<Editorial> listarEditorialActivo() throws Exception {

        try {
            

            List<Editorial> editoriales = dao.buscarActivo();

            return editoriales;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void imprimirEditoriales (Collection<Editorial> eds)throws Exception {
        
        try{
            //Listar las mascotas
            
            
            if (eds.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Editorial p : eds) {
                    System.out.println(p.toString());
                }
            }
            
        }catch (Exception e){
            throw e;
        }
    }
    
    public void imprimirEditorial(Editorial ed)throws Exception {
        
        try{
            //Listar las mascotas
            
            
            System.out.println(ed.toString());
            
        }catch (Exception e){
            throw e;
        }
    }
    
    public Editorial buscarEditorial(int cod) throws Exception {

        try {

            //Validamos
            if (cod < 0) {
                throw new Exception("Debe indicar el codigo");
            }
            Editorial ed = dao.buscarEditorialID(cod);
            //Verificamos
            if (ed == null) {
                throw new Exception("No se econtró editorial para el codigo indicado");
            }

            return ed;
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    
}
