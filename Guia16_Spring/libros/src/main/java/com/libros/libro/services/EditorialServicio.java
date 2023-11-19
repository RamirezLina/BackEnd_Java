/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libros.libro.services;

import com.libros.libro.Entities.Autor;
import com.libros.libro.Entities.Editorial;
import com.libros.libro.Entities.Libro;
import com.libros.libro.Repositorios.EditorialRepositorio;
import jakarta.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LINA RAMIREZ
 */
@Service
public class EditorialServicio {
    
    @Autowired
    private EditorialRepositorio editorialRepositorio;
    
    @Transactional
    public void crearEditorial(String nombre){
        
        
        
        Editorial editorial = new Editorial();
        
        editorial.setNombre(nombre);
        
        editorialRepositorio.save(editorial);
        
        
 
    }
    
    public List<Editorial> listarEditoriales(){
        List<Editorial> editoriales = new ArrayList();
        
        editoriales = editorialRepositorio.findAll();
        
        return editoriales;
        
    }
    
    public void modificarEditorial (String nombre, String id){
        
        Optional<Editorial> respuesta = editorialRepositorio.findById(id);
        
        if (respuesta.isPresent()) {
            Editorial editorial = respuesta.get();
            editorial.setNombre(nombre);
            editorialRepositorio.save(editorial);
            
        }
        
    }
    
}
