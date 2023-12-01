/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libros.libro.Repositorios;

import com.libros.libro.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LINA RAMIREZ
 */
@Repository
public interface UsuarioRepositorio extends JpaRepository <Usuario, String> {
    
//    Retonrnar un usuario por su email
    
//    @Query("SELECT u FROM usuario u WHERE u.email = :email")
//    public Usuario findByemail(@Parama("email") String email);
    
    public abstract Usuario findByemail(String email);
}
