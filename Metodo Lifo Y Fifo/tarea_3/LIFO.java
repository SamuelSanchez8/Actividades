/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_3;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class LIFO implements TAD, Serializable {

    private ArrayList<String> pila = new ArrayList();
    private int maximo;

    public LIFO(int maximo) {
        this.maximo = maximo;
    }

    @Override
    public void push(String input) throws TADLleno, TADLlenado {
     
        if (pila.size() -1 == maximo){
            throw new TADLleno();
        } else {
            pila.add(input);
            if (pila.size() -1 == maximo){
                throw new TADLlenado();
            }
        }
    }

    @Override
    public String pop() throws TADVacio, TADVaciado {
        
        String input = null;
        
        if (pila.isEmpty() == true) {
            throw new TADVacio();
        } else {
            pila.remove(pila.size()-1);
            if (pila.isEmpty()) {
                throw new TADVaciado();
            }
        }
        return input;
    }
    

    @Override
    public String peek() throws TADVacio {

        if (pila.isEmpty() == true) {
            throw new TADVacio();
        }
        return pila.get(pila.size()-1);
    }

    @Override
    public int size() {
        return pila.size();
    }

    @Override
    public boolean estaVacia() {
        return pila.isEmpty();

    }

    @Override
    public boolean estaLlena() {
     if (pila.size() == maximo){
            return true;
        }
        
        return false;
    }

    @Override
    public void listar() {
        for (int i = 0; i < pila.size(); i++) {
            String listar = pila.get(i);
            System.out.println(listar);
        }

    }
}
