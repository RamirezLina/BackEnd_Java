/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noticas.egg.servicios;

import com.noticas.egg.entidades.Noticia;
import com.noticas.egg.excepciones.NotException;
import com.noticas.egg.repositorios.NoticiaRepositorio;
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
public class NoticiaServicio {
    
    @Autowired
    private NoticiaRepositorio noticiaRepository;
    
    @Transactional
    public void crearNoticia (String titulo, String cuerpo) throws NotException{
        
        validar(titulo, cuerpo);
        Noticia noticia = new Noticia();
        noticia.setCuerpo(cuerpo);
        noticia.setTitulo(titulo);
        
        noticiaRepository.save(noticia);
    }
    
    
    public List<Noticia> listarNoticia(){
        List<Noticia> noticias = new ArrayList();
        
        noticias = noticiaRepository.findAll();
        
        return noticias;
        
    }
    
    public List<Noticia> listarNoticiaDisponible(){
        List<Noticia> noticias = new ArrayList();
        
        noticias = noticiaRepository.buscarNoDisponible();
        
        return noticias;
        
    }
    
    public Noticia buscarPorTitulo (String titulo) throws NotException{
        
        Noticia noticia = noticiaRepository.buscarPorTitulo(titulo);
       
       
        if (!(noticia.getTitulo() == null) && noticia.getAlta()) {
            
           
            return noticia;
 
        }else{
          throw new NotException("No se encontró noticia con este título");

        }
        
    }
            
            
    public Noticia getOne(String id) throws NotException{
       
        
        Optional<Noticia> respuestaNoticia = noticiaRepository.findById(id);
       
       
        if (respuestaNoticia.isPresent() && respuestaNoticia.get().getAlta()) {
            Noticia noticia = respuestaNoticia.get();
           
            return noticia;
 
        }else{
          throw new NotException("No se encontró noticia con este título");

        }
        
        
        
    }
    
    @Transactional
    public void modificarNoticia (String id, String titulo, String cuerpo) throws NotException{
        
        
        validar(titulo, cuerpo);
        Optional<Noticia> respuestaNoticia = noticiaRepository.findById(id);
        ;
       
        if (respuestaNoticia.isPresent()) {
            Noticia noticia = respuestaNoticia.get();
            noticia.setCuerpo(cuerpo);
            noticia.setTitulo(titulo);
            noticiaRepository.save(noticia);
        }
        
        
        
    }
    
    @Transactional
    public void eliminarNoticia (String id) throws NotException{
        
        
        Optional<Noticia> respuestaNoticia = noticiaRepository.findById(id);
        
        if (respuestaNoticia.isPresent()) {
            Noticia noticia = respuestaNoticia.get();
            noticia.setAlta(false);
            
            noticiaRepository.save(noticia);
        }
        
        
        
    }
    
    
    public void validar(String titulo, String cuerpo) throws NotException{
        
        if(titulo == null || titulo.isEmpty()){
            throw new NotException("El titulo no puede ser nulo o estar vacío");
            
        }
        
        if(cuerpo == null || cuerpo.isEmpty()){
            throw new NotException("El cuerpo de la noticia no puede ser nulo o estar vacío");
            
        }
        
    }
    
}
