/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noticas.egg.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author LINA RAMIREZ
 */
@Controller
@RequestMapping("/ppalnoticias")
public class PrincipalControlador {
  
    @GetMapping("/")
    public String index() {

        return "index.html";
    }  
    
    
}
