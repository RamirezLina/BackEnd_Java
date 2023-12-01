/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libros.libro.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author LINA RAMIREZ
 */

@Controller
@RequestMapping("/")
public class PortalControlador { //localhost:8080/
    
    @GetMapping("/")
    public String index(){
     return "index.html";  
    }
    
    @GetMapping("/registrar")
    public String Registrar(){
        return "registro.html";
    }
    
    @GetMapping("/login")
    public String login(){
        return "login.html";
    }
}
