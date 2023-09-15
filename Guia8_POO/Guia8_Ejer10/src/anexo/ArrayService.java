/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anexo;

import java.util.Arrays;

/**
 *
 * @author LINA RAMIREZ
 */
public class ArrayService {
    public void llenarArray (double [] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.round((double) Math.random()*100);
        }
        
    }
    
    public void mostrarArray (double [] arr){
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }
    
    public void llenarCopia (double [] arr1, double [] arr2){
        Arrays.sort(arr1);
        for (int i = 0; i < arr2.length; i++) {
            if (i<10) {
                arr2[i] = arr1[i];
                
            }else{
                Arrays.fill(arr2,10,20,0.5);
            }
        }
        
        
    }
    
}
