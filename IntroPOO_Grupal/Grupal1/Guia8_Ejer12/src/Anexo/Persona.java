/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anexo;

import java.time.LocalDate;



/**
 *
 * @author LINA RAMIREZ
 */
public class Persona {
    private String name;
    private LocalDate birthDate;
    
    
    public Persona(){
        
    }
    
    public Persona(String name, LocalDate birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", birthDate=" + birthDate + '}';
    }
    
    
    
}
