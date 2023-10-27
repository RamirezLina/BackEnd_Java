/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;


import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import Persistence.LibroDAO;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class LibroService {
    
    private LibroDAO dao;
    private AutorService as = new AutorService();
    private EditorialService eds = new EditorialService();

    public LibroService() {
        this.dao = new LibroDAO();
    }
        
    
    public void crearLibro(Long ISBN, String nombre, Integer anio, Integer ejemplares,
            Integer ejemplaresPrestados, Integer ejemplaresRestantes, Integer autor, Integer editorial) throws Exception {

        try {
            //Validamos
            
            if (ISBN == 0) {
                throw new Exception("Debe indicar el codigo ISBN");
            }
            
//            if (!(dao.buscarLibroISBN(ISBN) == null)) {
//                throw new Exception("El codigo ISBN ya existe");
//            }


            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
            
            if (anio == 0) {
                throw new Exception("Debe indicar el año de publicación");
            }
            
            if (ejemplares <= 0) {
                throw new Exception("Debe indicar un numero de ejemplares adecuado");
            }
            
            if (ejemplaresPrestados < 0) {
                throw new Exception("Debe indicar un numero de ejemplares adecuado");
            }
            
            if (ejemplaresRestantes < 0) {
                throw new Exception("Debe indicar un número de ejemplares adecuado");
            }
            
            if (autor == null) {
                throw new Exception("Debe indicar el autor");
            }
            
            if (editorial == null) {
                throw new Exception("Debe indicar la editorial");
            }

            //Creamos el libro
            Libro libro = new Libro();
            
            libro.setIsbn(ISBN);
            libro.setAnio(anio);
            libro.setTitulo(nombre);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            
            Autor a = as.buscarAutor(autor);
            libro.setAutor(a);
            
            Editorial e = eds.buscarEditorial(editorial);
            libro.setEditorial(e);
                      
            dao.guardarLibro(libro);
        } catch (Exception e) {
            throw e;
        }
    }
    
    
     public void modificarLibro(Long ISBN)  throws Exception {
         Scanner read= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

         try {
            //Validamos
            
             if (ISBN == 0) {
                throw new Exception("Debe indicar el codigo ISBN");
            }
            
            if (dao.buscarLibroISBN(ISBN) == null) {
                throw new Exception("El codigo ISBN no existe");
            }

            //Traemos el libro a modificar

            Libro libro = dao.buscarLibroISBN(ISBN);
            String resp;
             do {                 
                 System.out.println("Desea modificar el titulo del libro?");
                 System.out.println("Responda Si o no");
                 resp = read.next();
             } while (!resp.equalsIgnoreCase("SI") && !resp.equalsIgnoreCase("NO"));
             
             if (resp.equalsIgnoreCase("SI")) {
                 System.out.println("Ingrese el nuevo titulo");
                 libro.setTitulo(read.next());
             }
             
            do {                 
                 System.out.println("Desea modificar el año de publicación del libro?");
                 System.out.println("Responda Si o no");
                 resp = read.next();
             } while (!resp.equalsIgnoreCase("SI") && !resp.equalsIgnoreCase("NO"));
             
             if (resp.equalsIgnoreCase("SI")) {
                 System.out.println("Ingrese el nuevo año de publicación");
                 libro.setAnio(read.nextInt());
             }
             
             do {                 
                 System.out.println("Desea modificar el número de ejemplares del libro?");
                 System.out.println("Responda Si o no");
                 resp = read.next();
             } while (!resp.equalsIgnoreCase("SI") && !resp.equalsIgnoreCase("NO"));
             
             if (resp.equalsIgnoreCase("SI")) {
                 System.out.println("Ingrese el nuevo número de ejemplares");
                 libro.setEjemplares(read.nextInt());
             }
             
             do {                 
                 System.out.println("Desea modificar el autor del libro?");
                 System.out.println("Responda Si o no");
                 resp = read.next();
             } while (!resp.equalsIgnoreCase("SI") && !resp.equalsIgnoreCase("NO"));
             
             if (resp.equalsIgnoreCase("SI")) {
                 System.out.println("Ingrese el id del nuevo autor");
                 Autor a = as.buscarAutor(read.nextInt());
                 libro.setAutor(a);
             }
             
             do {                 
                 System.out.println("Desea modificar la editorial del libro?");
                 System.out.println("Responda Si o no");
                 resp = read.next();
             } while (!resp.equalsIgnoreCase("SI") && !resp.equalsIgnoreCase("NO"));
             
             if (resp.equalsIgnoreCase("SI")) {
                 System.out.println("Ingrese el id de la nueva editorial");
                 Editorial e = eds.buscarEditorial(read.nextInt());
                 libro.setEditorial(e);
             }
             
             //Modificamos el libro
             
            dao.modificarLibro(libro);
                    
        } catch (Exception e) {
            throw e;
        }
         
     }
     
     
     public void eliminarLibro(Long ISBN) throws Exception {
        try {

            if (ISBN == null ) {
                throw new Exception("Debe indicar el codigo");
            }
            
            
            if (dao.buscarLibroISBN(ISBN) == null ) {
                throw new Exception("El codigo ISBN no existe, digite nuevamente");
            }
            
            //Traemos el libro
            Libro libro = dao.buscarLibroISBN(ISBN);
            libro.setAlta(false);
            dao.eliminarLibro(libro);
        } catch (Exception e) {
            throw e;
        }
        
    }
    
        
    public List<Libro> listarLibroActivo() throws Exception {

        try {
            

            List<Libro> librosac = dao.buscarActivo();

            return librosac;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void imprimirLibros (Collection<Libro> libros)throws Exception {
        
        try{
            //Listar los libros
            
            
            if (libros.isEmpty()) {
                throw new Exception("No existen libros para imprimir");
            } else {
                for (Libro l : libros) {
                    System.out.println(l.toString());
                }
            }
            
        }catch (Exception e){
            throw e;
        }
    }
    
    public void imprimirLibro(Libro l)throws Exception {
        
        try{
            //Listar las mascotas
            
            
            System.out.println(l.toString());
            
        }catch (Exception e){
            throw e;
        }
    }
    
    
    public Libro listarLibroISBN(Long cod) throws Exception {

        try {
            if (cod == null) {
                throw new Exception("Debe indicar el ISBN del libro a buscar");
            }
            
            if (cod <= 0) {
                throw new Exception("Debe indicar un valor de ISBN adecuado");
            }

            Libro l = dao.buscarLibroISBN(cod);
            
            return l;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<Libro> listarLibroTitulo(String titulo) throws Exception {

        try {
            

            List<Libro> librosTit = dao.buscarTitulo(titulo);

            return librosTit;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<Libro> listarLibroAutor(String nomAutor) throws Exception {

        try {
            

            List<Libro> librosAutor = dao.buscarNombreAutor(nomAutor);

            return librosAutor;
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public List<Libro> listarLibroEditorial(String nomEd) throws Exception {

        try {
            

            List<Libro> librosEd = dao.buscarEditorial(nomEd);

            return librosEd;
        } catch (Exception e) {
            throw e;
        }
    }
    
}
