/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Autor;
import Persistence.AutorDAO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author LINA RAMIREZ
 */
public class AutorService {
    
    private AutorDAO dao;

    public AutorService() {
        this.dao = new AutorDAO();
    }
    
    
    public void crearAutor(String nombre) throws Exception {

        try {
            //Validamos
            

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }

            //Creamos el autor
            Autor a = new Autor();
            
            a.setNombre(nombre);
            

            dao.guardarAutor(a);
        } catch (Exception e) {
            throw e;
        }
    }
    
    
     public void modificarAutor(Integer id, String nombre) throws Exception {
         
         try {
            //Validamos
            
            if (id == null ) {
                throw new Exception("Debe indicar el codigo");
            }
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre nuevo");
            }
            
            if (!dao.buscarId(id) ) {
                throw new Exception("El codigo no existe, digite nuevamente");
            }
            
            
            
            //Traemos el autor
            Autor a = dao.buscarAutor(id);
             //Modificamos el producto
             a.setNombre(nombre);
            dao.modificarAutor(a);
                    
        } catch (Exception e) {
            throw e;
        }
         
     }
     
     
     public void eliminarAutor(Integer id) throws Exception {
        try {

            if (id == null ) {
                throw new Exception("Debe indicar el codigo");
            }
            
            
            if (!dao.buscarId(id) ) {
                throw new Exception("El codigo no existe, digite nuevamente");
            }
            
            //Traemos el autor
            Autor a = dao.buscarAutor(id);
            a.setAlta(false);
            dao.eliminarAutor(a);
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public List<Autor> listarAutorNombre(String nombre) throws Exception {

        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre del autor a buscar");
            }

            List<Autor> autores = dao.buscarNombre(nombre);

            return autores;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<Autor> listarAutorActivo() throws Exception {

        try {
            

            List<Autor> autores = dao.buscarActivo();

            return autores;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void imprimirAutores(Collection<Autor> autores)throws Exception {
        
        try{
            //Listar las mascotas
            
            
            if (autores.isEmpty()) {
                throw new Exception("No existen autores para imprimir");
            } else {
                for (Autor p : autores) {
                    System.out.println(p.toString());
                }
            }
            
        }catch (Exception e){
            throw e;
        }
    }
    
    public void imprimirAutor(Autor autor)throws Exception {
        
        try{
            //Listar las mascotas
            
            
            System.out.println(autor.toString());
            
        }catch (Exception e){
            throw e;
        }
    }
    
     public Autor buscarAutor(int cod) throws Exception {

        try {

            //Validamos
            if (cod < 0) {
                throw new Exception("Debe indicar el codigo");
            }
            Autor autor = dao.buscarAutor(cod);
            //Verificamos
            if (autor == null) {
                throw new Exception("No se econtró autor para el codigo indicado");
            }

            return autor;
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    
    
}
