/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libros.libro.Repositorios;

import com.libros.libro.Entities.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LINA RAMIREZ
 */
@Repository
public interface EditorialRepositorio extends JpaRepository<Editorial, String>{
    
}
