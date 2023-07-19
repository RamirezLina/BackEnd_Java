/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

/**
 *
 * @author LINA RAMIREZ
 */
public class PasswordValidator {
    public boolean fortalezaC(String C){
        boolean pasaPrueba = true;
        
        boolean mayuscula = false;
        for (int i = 0; i < C.length(); i++) {
            char letra = C.charAt(i);
            if(Character.isUpperCase(letra)){
               mayuscula = true; 
               break;
            }
            
        }
        if (C.length()<10 || !mayuscula) {
            pasaPrueba = false;
        }
        
        if (!(C.contains("!")||C.contains("#")||C.contains("$")||C.contains("%")||C.contains("&")||C.contains("/")||C.contains("|")||C.contains("?")||C.contains("¡")||C.contains("¿"))) {
            pasaPrueba = false;
        }
        
        
        
        
        return pasaPrueba;
    }
}
