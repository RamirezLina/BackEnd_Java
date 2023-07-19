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
public class TemperatureConverter {
    public float Celsius_F(float F){
        float result = (F-32)*5/9;
        return result;
                
    }
    
    public double Celsius_K(double K){
        return K - (double) 273.15;
    }
    
    public float Fahren_C(float C){
        float result = (C*9/5)+32;
        return result;
    }
    
    public float Fahren_K(float K){
        return Fahren_C((K-(float)273.15));
    }
    
    public float Kelvin_F(float F){
        
        return Celsius_F(F)+ (float)273.15;
    }
    
    public float Kelvin_C(float C){
        return C + (float)273.15;
        
    }
}
