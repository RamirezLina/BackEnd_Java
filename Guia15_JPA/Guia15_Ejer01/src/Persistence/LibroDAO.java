/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Entidades.Libro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

/**
 *
 * @author LINA RAMIREZ
 */
public class LibroDAO {
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Guia15_Ejer01PU");
    private EntityManager em = emf.createEntityManager(); 
    
    public void guardarLibro(Libro libro) throws Exception {

        
        try {
            if (libro == null) {
                throw new Exception("Debe indicar el libro a registrar");
            }
            
            em.getTransaction().begin();
            em.persist(libro);
            em.getTransaction().commit();

            
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarLibro(Libro libro) throws Exception {
        try {
            if (libro == null) {
                throw new Exception("Debe indicar el libro que desea modificar");
            }
            
            Libro a = buscarLibroISBN(libro.getIsbn());
            a.setTitulo(libro.getTitulo());
            
            
            a.setAnio(libro.getAnio());
            a.setEjemplares(libro.getEjemplares());
            a.setEjemplaresPrestados(libro.getEjemplaresPrestados());
            a.setEjemplaresRestantes(libro.getEjemplaresRestantes());
            a.setAutor(libro.getAutor());
            a.setEditorial(libro.getEditorial());
            em.getTransaction().begin();
            em.merge(a);
            em.getTransaction().commit();

            
        } catch (Exception e) {
            throw e;
        } 
    }
    
    public void eliminarLibro(Libro libro) throws Exception {
        try {
            if (libro == null) {
                throw new Exception("Debe indicar el autor que desea eliminar");
            }
        Libro a = buscarLibroISBN(libro.getIsbn());
        a.setAlta(libro.getAlta());
        em.getTransaction().begin();
        em.merge(a);
        em.getTransaction().commit();

            
        } catch (Exception e) {
            throw e;
        } 
    }
    
    
    public Libro buscarLibroISBN(Long cod) throws Exception {
        try {
            
            Libro libro = (Libro)em.createQuery("SELECT l FROM Libro l "+
                                          " WHERE l.isbn = :codigo")
                                          .setParameter("codigo", cod)
                                          .getSingleResult();
            return libro;
        
        }catch(NoResultException e){
            System.out.println("No se encontró el libro para el ISBN indicado");
            Libro libro;
            return libro = null;
        } catch (Exception ex) {
            
            throw ex;
        }
        
    }
    
       
    public List buscarActivo() throws Exception {
        try {
            
            List<Libro> libros = em.createQuery("SELECT a FROM Libro a " +
                                                    "WHERE a.alta = true").getResultList();
            
            return libros;
                                                    
        }catch(NoResultException e){
            System.out.println("No se encontraron libros activos");
            List<Libro> libros;
            return libros = null;
        } catch (Exception e) {
            throw e;
        } 
        
        
    }
    
    public List buscarTitulo(String titulo) throws Exception {
        try {
            
            List<Libro> libros = em.createQuery("SELECT a FROM Libro a " +
                                                    "WHERE a.titulo LIKE :titulo"
                                                    )
                                                   .setParameter("titulo", titulo)
                                                   .getResultList();
            
            return libros;
                                                    
      
        } catch (Exception e) {
            throw e;
        } 
        
        
    }
    
    
    public List buscarNombreAutor(String autor) throws Exception {
        try {
            
            List<Libro> libros = em.createQuery("SELECT a FROM Libro a " +
                                                    "WHERE a.autor.nombre LIKE :autor"
                                                    )
                                                   .setParameter("autor", autor)
                                                   .getResultList();
            
            return libros;
                                                    
      
        } catch (Exception e) {
            throw e;
        } 

    }
    
    public List buscarEditorial(String editorial) throws Exception {
        try {
            
            List<Libro> libros = em.createQuery("SELECT a FROM Libro a " +
                                                    "WHERE a.editorial.nombre LIKE :editorial"
                                                    )
                                                   .setParameter("editorial", editorial)
                                                   .getResultList();
            
            return libros;
                                                    
      
        } catch (Exception e) {
            throw e;
        } 

    }
    
    
}
