/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libros.libro.services;

import com.libros.libro.Entities.Autor;
import com.libros.libro.Entities.Libro;
import com.libros.libro.Repositorios.AutorRepositorio;
import com.libros.libro.excepciones.MiException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LINA RAMIREZ
 */
@Service
public class AutorServicio {
    
    @Autowired
    private AutorRepositorio autorRepositorio;
    
    @Transactional
    public void crearAutor (String nombre) throws MiException{
        
        validar(nombre);
        Autor autor = new Autor();
        autor.setNombre(nombre);
        
        autorRepositorio.save(autor);
        
    }
    
    
    public List<Autor> listarAutores(){
        List<Autor> autores = new ArrayList();
        
        autores = autorRepositorio.findAll();
        
        return autores;
        
    }
    
    @Transactional
    public void modificarAutor (String nombre, String id) throws MiException{
        
        validar(nombre);
        Optional<Autor> respuesta = autorRepositorio.findById(id);
        
        if (respuesta.isPresent()) {
            Autor autor = respuesta.get();
            autor.setNombre(nombre);
            autorRepositorio.save(autor);
            
        }
        
    }
    
    public Autor getOne(String id){
        
        return autorRepositorio.getOne(id);
    }
    
    private void validar(String nombre) throws MiException{
        
        
        if(nombre == null || nombre.isEmpty()){
            throw new MiException("El nombre no puede ser nulo o estar vacío");
            
        }
        
       
    }
}
