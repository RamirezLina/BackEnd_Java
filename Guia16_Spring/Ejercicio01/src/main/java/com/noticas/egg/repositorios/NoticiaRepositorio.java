/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noticas.egg.repositorios;

import com.noticas.egg.entidades.Noticia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LINA RAMIREZ
 */

@Repository
public interface NoticiaRepositorio extends JpaRepository <Noticia, String>{
    
   
    @Query("SELECT n FROM Noticia n WHERE n.titulo = :titulo")
    public Noticia buscarPorTitulo(@Param("titulo") String titulo);
    
//    @Query("SELECT n FROM Noticia e WHERE n.titulo LIKE %:titulo")
//    public List<Noticia> buscarPorTitInicial (@Param ("titulo") String titulo); 
    
    @Query("SELECT n FROM Noticia n WHERE n.alta = true")
    public List<Noticia> buscarNoDisponible (); 
    
    
    
    
    
}
