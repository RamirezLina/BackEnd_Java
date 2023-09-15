/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author LINA RAMIREZ
 */
public class NIFservices {
    Scanner read= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
//    public NIF crearNif(){
//        NIF nif = new NIF();
//        do {
//            System.out.println("Escriba el DNI");
//            nif.setDNI(read.nextInt());
//        
//        } while (nif.getDNI()/100000000>=1 || nif.getDNI()/100000000<0);
//        
//        nif.setLetraNIF(calcularLetra(nif));
//       return nif; 
//    }
    
    public NIF crearNif(){
        NIF nif = new NIF();
        do {
            System.out.println("Escriba el DNI");
            nif.setDNI(read.nextInt());
        
        } while ((int) Math.log10(nif.getDNI())+1 !=8);
        
        nif.setLetraNIF(calcularLetra(nif));
       return nif; 
    }
    
    public String calcularLetra(NIF nif){
        String[] letras = {"T","R", "W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int mod = (int) nif.getDNI()%23;
        
        return letras[mod];    
        }
    
    public void mostrar(NIF nif){
        System.out.println(nif.getDNI()+"-"+nif.getLetraNIF());
        
                
    }
    
    
}
