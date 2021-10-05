/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_3;

/**
 *
 * @author Usuario
 */
public interface TAD {
    
    public void push(String input) throws TADLleno, TADLlenado;
    public String pop() throws TADVacio, TADVaciado;
    public String peek() throws TADVacio;
    public int size();
    public boolean estaVacia();
    public boolean estaLlena();
    public void listar();
      
}
