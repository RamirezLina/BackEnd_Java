/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio3_poo.Servicios;

import desafio3_poo.Entidades.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class ServicioCliente {
    private ArrayList<Cliente> listaClientes = new ArrayList<>();

    public void registrarCliente(Cliente cli){
        listaClientes.add(cli);
    }
    
    public ArrayList obtenerClientes(){
        return listaClientes;
    }
    
    public void actualizarCliente(int idOrig, String nombre, int edad, double altura, double peso, String objetivo){
        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getId()==idOrig) {
                Cliente clienteModificado= new Cliente(idOrig, edad, altura, peso, nombre, objetivo);
                listaClientes.set(i, clienteModificado);
            break;
            }
        }        
    }
    
    public void eliminarCliente (int id){
        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getId()==id) {
                listaClientes.remove(i);
            break;
            }
        }   
    }
    
}
