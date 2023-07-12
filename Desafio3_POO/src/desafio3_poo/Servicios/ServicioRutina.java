/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio3_poo.Servicios;

import desafio3_poo.Entidades.Rutina;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class ServicioRutina {
    ArrayList<Rutina> listaRutinas= new ArrayList<>();
    
    public void registrarRutina(Rutina rut){
        listaRutinas.add(rut);
    }
    
    public ArrayList obtenerRutinas(){
        return listaRutinas;
    }
    
    public void actualizarRutina(int idOrig, String nombre, double duracion, String nivelDificultad, String descripcion){
        for (int i = 0; i < listaRutinas.size(); i++) {
            if (listaRutinas.get(i).getId()==idOrig) {
                Rutina rutinaModificada= new Rutina(idOrig, duracion, nombre, nivelDificultad, descripcion);
                listaRutinas.set(i, rutinaModificada);
            break;
            }
        }        
    }
    
    public void eliminarRutina (int id){
        for (int i = 0; i < listaRutinas.size(); i++) {
            if (listaRutinas.get(i).getId()==id) {
                listaRutinas.remove(i);
            break;
            }
        }   
    }
}
