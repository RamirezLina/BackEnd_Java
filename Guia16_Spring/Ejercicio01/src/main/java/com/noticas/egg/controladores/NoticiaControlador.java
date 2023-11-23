/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noticas.egg.controladores;

import com.noticas.egg.entidades.Noticia;
import com.noticas.egg.excepciones.NotException;
import com.noticas.egg.servicios.NoticiaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author LINA RAMIREZ
 */
@Controller
@RequestMapping("/noticias")
public class NoticiaControlador {
    
    @Autowired
    private NoticiaServicio noticiaServicio;
    
    @GetMapping("/registrar")
    public String registrar(ModelMap modelo){
        
        return "noticia_form.html";   
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam String titulo, @RequestParam String cuerpo,
                            ModelMap modelo){
        
       try{
           noticiaServicio.crearNoticia(titulo, cuerpo);
           modelo.put("exito", "La noticia fue registrada correctamente");
       }catch (NotException e){
            modelo.put("error", e.getMessage());
       }catch (Exception ex){
            modelo.put("error", ex.getMessage());
       }
        
       return "index.html";
    }
    
    
    @GetMapping("/eliminar")
    public String eliminar (ModelMap modelo){
        
        List<Noticia> noticias = noticiaServicio.listarNoticiaDisponible();
        modelo.addAttribute("noticias", noticias);
        return "noticia_list_eliminar.html";
    }
    
    @PostMapping("/eliminar/{id}")
    public String eliminar(@PathVariable String id, ModelMap modelo){
        
        try{
           noticiaServicio.eliminarNoticia(id);
            modelo.put("exito", "La noticia fue eliminada correctamente");
//            return "redirect:../eliminar";
              return "index.html";
       }catch (NotException e){
            modelo.put("error", e.getMessage());
            return "noticia_list_eliminar.html";
       }catch (Exception ex){
            modelo.put("error", ex.getMessage());
            return "noticia_list_eliminar.html";
       }
           
    }
    
    @GetMapping("/modificar")
    public String modificarList (ModelMap modelo){
        
        List<Noticia> noticias = noticiaServicio.listarNoticiaDisponible();
        modelo.addAttribute("noticias", noticias);
        return "noticia_list_modificar.html";
    }
    
    @GetMapping("/modificar/{id}")
    public String modificar (@PathVariable String id, ModelMap modelo) throws NotException{
        
        modelo.put("noticia", noticiaServicio.getOne(id));
        
        return "noticia_modificar.html";
    }
    
    @PostMapping("/modificar/{id}")
    public String modificar (@PathVariable String id, @RequestParam String titulo, @RequestParam String cuerpo, ModelMap modelo){
        
        try{
           noticiaServicio.modificarNoticia(id, titulo, cuerpo);
            modelo.put("exito", "La noticia fue editada correctamente");
            return "redirect:../modificar";
//              return "index.html";
       }catch (NotException e){
            modelo.put("error", e.getMessage());
            return "noticia_modificar.html";
       }catch (Exception ex){
            modelo.put("error", ex.getMessage());
            return "noticia_modificar.html";
       }
           
    }
    
    @GetMapping("/listar")
    public String listarTodos (ModelMap modelo){
        
        modelo.addAttribute("noticias", noticiaServicio.listarNoticiaDisponible());
        
        return "noticia_list.html";
    }
    
    @GetMapping("/lista")
    public String listaUna (){
        
        return "noticia_buscar.html";   
    }
    
    @PostMapping("/lista")
    public String listaUna (@RequestParam String titulo, ModelMap modelo){
        
        try{
            
           
            modelo.put("exito", "La noticia fue encontrada");
            modelo.addAttribute("noticias", noticiaServicio.buscarPorTitulo(titulo));
        
            return "noticia_list.html";

       }catch (NotException e){
            modelo.put("error", e.getMessage());
            return "noticia_lista.html";
       }catch (Exception ex){
            modelo.put("error", ex.getMessage());
            return "noticia_lista.html";
       }
           
    }
}
