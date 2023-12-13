/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libros.libro.services;

import com.libros.libro.Entities.Autor;
import com.libros.libro.Entities.Editorial;
import com.libros.libro.Entities.Libro;
import com.libros.libro.Repositorios.AutorRepositorio;
import com.libros.libro.Repositorios.EditorialRepositorio;
import com.libros.libro.Repositorios.LibroRepositorio;
import com.libros.libro.excepciones.MiException;
import jakarta.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LINA RAMIREZ
 */
@Service
public class LibroServicio {
    @Autowired
    private LibroRepositorio libroRepositorio;
    
    @Autowired
    private AutorRepositorio autorRepositorio;
    
    @Autowired
    private EditorialRepositorio editorialRepositorio;
    
    @Transactional
    public void crearLibro(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws MiException{
        
        validar(isbn, titulo, idAutor, idEditorial, ejemplares);
        
        
        Autor autor = autorRepositorio.findById(idAutor).get();
        Editorial editorial = editorialRepositorio.findById(idAutor).get();
        
        Libro libro = new Libro();
        
        libro.setISBN(isbn);
        libro.setTitulo(titulo);
        libro.setEjemplares(ejemplares);
        
        libro.setAlta(new Date());
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        
        libroRepositorio.save(libro);
        
    }
    
    
    public List<Libro> listarLibros(){
        List<Libro> libros = new ArrayList();
        
        libros = libroRepositorio.findAll();
        
        return libros;
        
    }
    
    @Transactional
    public void modificarLibro(Long isbn, String titulo, String idAutor, String idEditorial, Integer ejemplares) throws MiException{
        
        validar(isbn, titulo, idAutor, idEditorial, ejemplares);
        
        Optional<Libro> respuesta = libroRepositorio.findById(isbn);
        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(idEditorial);
        
        Autor autor = new Autor();
        Editorial editorial = new Editorial();
        
        if (respuestaAutor.isPresent()) {
            autor = respuestaAutor.get();
            
        }
        
        if (respuestaEditorial.isPresent()) {
            
            editorial = respuestaEditorial.get();
            
        }
        
        if (respuesta.isPresent()) {
            
            Libro libro = respuesta.get();
            libro.setTitulo(titulo);
            
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            libro.setEjemplares(ejemplares);
            libroRepositorio.save(libro);
                
        }else {
            System.out.println("No se puede actualizar el libro");
        }
        
        
    }
    
    private void validar(Long isbn, String titulo, String idAutor, String idEditorial, Integer ejemplares) throws MiException{
        if(isbn == null){
            throw new MiException("El ISBN no puede ser nulo");
            
        }
        
        if(titulo == null || titulo.isEmpty()){
            throw new MiException("El titulo no puede ser nulo o estar vacío");
            
        }
        
        if(idAutor == null || idAutor.isEmpty()){
            throw new MiException("El id del autor no puede ser nulo o estar vacío");
            
        }
        
        if(idEditorial == null || idEditorial.isEmpty()){
            throw new MiException("El id de la editorial no puede ser nulo o estar vacío");
            
        }
    }
    
    
    
    public Libro getOne(Long isbn){
       return libroRepositorio.findById(isbn).get();
    }
 
    
}
