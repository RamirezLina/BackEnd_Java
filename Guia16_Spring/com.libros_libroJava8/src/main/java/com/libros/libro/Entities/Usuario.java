/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libros.libro.Entities;

import com.libros.libro.enumeraciones.Rol;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author LINA RAMIREZ
 */
@Entity
@Data
public class Usuario {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2" )
    private String id;
    
    private String nombre;
    private String email;
    private String password;

    
    @Enumerated(EnumType.STRING)
    private Rol rol;
    
    
    
    
    
   


    
    
    
    
    
}
