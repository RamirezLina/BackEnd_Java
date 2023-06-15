/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

/**
 *
 * @author fabia
 */
public class Vehiculo {
    
    public String marca;
    public String modelo;
    public int ano;
    public String tipo;

    public Vehiculo(String marca, String modelo, int ano, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipo = tipo;
    }



    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", tipo=" + tipo + '}';
    }
    
    
    public int moverse( int segundos){
        
       if (this.tipo == "automovil"){
         return 3* segundos;
       
       }
       
       else if (this.tipo == "motocicleta"){
           
            return 2* segundos;
       }
       else {
       return 1* segundos; 
       
       }
  
    }  
    
    
    
    public int frenar(){
    
    if (this.tipo == "automovil" || this.tipo == "motocicleta" ){
         return 2;
       
       }
       else {
       return 0; 
       
       }
    
    }
    
}
