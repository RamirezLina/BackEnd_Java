
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;


import Entidades.Editorial;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

/**
 *
 * @author LINA RAMIREZ
 */
public class EditorialDAO {
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Guia15_Ejer01PU");
    private EntityManager em = emf.createEntityManager(); 
    
    public void guardarEditorial(Editorial ed) throws Exception {
        
        
        
        try {
            if (ed == null) {
                throw new Exception("Debe indicar la editorial a registrar");
            }
            
            em.getTransaction().begin();
            em.persist(ed);
            em.getTransaction().commit();

            
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarEditorial(Editorial ed) throws Exception {
        try {
            if (ed == null) {
                throw new Exception("Debe indicar la editorial que desea modificar");
            }
            
            Editorial e = em.find(Editorial.class, ed.getId());
            e.setNombre(ed.getNombre());
            em.getTransaction().begin();
            em.merge(e);
            em.getTransaction().commit();

            
        } catch (Exception e) {
            throw e;
        } 
    }
    
    public void eliminarEditorial(Editorial ed) throws Exception {
        try {
            if (ed == null) {
                throw new Exception("Debe indicar la editorial que desea eliminar");
            }
        Editorial e = em.find(Editorial.class, ed.getId());
        e.setAlta(ed.getAlta());
        em.getTransaction().begin();
        em.merge(e);
        em.getTransaction().commit();

            
        } catch (Exception e) {
            throw e;
        } 
    }
    
    public List buscarNombre(String nombre) throws Exception {
        try {
            
            List<Editorial> eds = em.createQuery("SELECT a FROM Editorial a " +
                                                    "WHERE a.nombre LIKE :nombre"
                                                    )
                                                     .setParameter("nombre", nombre)
                                                     .getResultList();
            
            return eds;
                                                    
      
        } catch (Exception e) {
            throw e;
        } 
        
        
    }
    
    public List buscarActivo() throws Exception {
        try {
            
            List<Editorial> eds = em.createQuery("SELECT a FROM Editorial a " +
                                                    "WHERE a.alta = true").getResultList();
            
            return eds;
                                                    
      
        } catch (Exception e) {
            throw e;
        } 
        
        
    }
    
    public Editorial buscarEditorialID(int cod) throws Exception {
        try {
            
            Editorial ed = (Editorial)em.createQuery("SELECT l FROM Editorial l "+
                                          "WHERE l.id = :codigo")
                                          .setParameter("codigo", cod)
                                          .getSingleResult();
            return ed;
        
        }catch(NoResultException e){
            System.out.println("No se encontró la editorial para el ID indicado");
            Editorial ed;
            return ed = null;
        } catch (Exception ex) {
            
            throw ex;
        }
        
    }
    
    public boolean buscarId(Integer id) throws Exception {
        try {
            
            Editorial a = em.find(Editorial.class, id);
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
