/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Entidades.Autor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

/**
 *
 * @author LINA RAMIREZ
 */
public class AutorDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Guia15_Ejer01PU");
    private EntityManager em = emf.createEntityManager(); 
    
    public void guardarAutor(Autor autor) throws Exception {
        
        
        
        try {
            if (autor == null) {
                throw new Exception("Debe indicar el autor a registrar");
            }
            
            em.getTransaction().begin();
            em.persist(autor);
            em.getTransaction().commit();

            
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void modificarAutor(Autor autor) throws Exception {
        try {
            if (autor == null) {
                throw new Exception("Debe indicar el autor que desea modificar");
            }
            
            Autor a = em.find(Autor.class, autor.getId());
            a.setNombre(autor.getNombre());
            em.getTransaction().begin();
            em.merge(a);
            em.getTransaction().commit();

            
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } 
    }
    
    public void eliminarAutor(Autor autor) throws Exception {
        try {
            if (autor == null) {
                throw new Exception("Debe indicar el autor que desea eliminar");
            }
        Autor a = em.find(Autor.class, autor.getId());
        a.setAlta(autor.getAlta());
        em.getTransaction().begin();
        em.merge(a);
        em.getTransaction().commit();

            
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } 
    }
    
    public List buscarNombre(String nombre) throws Exception {
        try {
            
            List<Autor> autores = em.createQuery("SELECT a FROM Autor a " +
                                                    "WHERE a.nombre LIKE :nombre"
                                                    )
                                                   .setParameter("nombre", nombre)
                                                   .getResultList();
            
            return autores;
                                                    
      
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } 
        
        
    }
    
    
    public List buscarActivo() throws Exception {
        try {
            
            List<Autor> autores = em.createQuery("SELECT a FROM Autor a " +
                                                    "WHERE a.alta = true").getResultList();
            
            return autores;
                                                    
      
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
            
        } 
        
        
    }
    
    public Autor buscarAutor(int cod) throws Exception {
        try {
            
            Autor autor = (Autor)em.createQuery("SELECT l FROM Autor l "+
                                          "WHERE l.id =:codigo")
                                          .setParameter("codigo", cod)
                                          .getSingleResult();
            return autor;
        
        }catch(NoResultException e){
            System.out.println("No se encontró el autor para el ID indicado");
            Autor autor;
            return autor = null;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
        
    }
    
    public boolean buscarId(Integer id) throws Exception {
        try {
            
            Autor a = em.find(Autor.class, id);
            boolean existe = false;

            
            if (a != null) {
               existe = true;
            }
            
            return existe;
        } catch (Exception e) {
            e.printStackTrace();
            
            throw new Exception("Error de sistema");
        }
    }
    
    
}
