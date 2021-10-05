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
public class FIFO implements TAD, Serializable {

    private ArrayList<String> cola = new ArrayList();  
    private int maximo;  // 0 

    public FIFO(int maximo) {
        this.maximo = maximo;
    }

    @Override
    public void push(String input) throws TADLleno, TADLlenado { 

        if (cola.size() == maximo) {
            throw new TADLleno();
        } else {
            cola.add(input);
            if (cola.size() == maximo) {
                throw new TADLlenado();
            }
        }

    }


    @Override
    public String pop() throws TADVacio, TADVaciado {

        String input = null;
        
        if (cola.isEmpty() == true) {
            throw new TADVacio();
        } else {
            cola.remove(0);
            if (cola.isEmpty()) {
                throw new TADVaciado();
            }
        }
        return input;
    }

    @Override
    public String peek() throws TADVacio {
        if (cola.isEmpty() == true) {
            throw new TADVacio();
        }

        return cola.get(0);
    }

    @Override
    public int size() {
        return cola.size();
    }

    @Override
    public boolean estaVacia() {
        return cola.isEmpty();

    }

    // []
    // add "hola"   ["hola"]
    // add "pepe"   ["hola","pepe"]
    // remove 0     ["pepe"]
    @Override
    public boolean estaLlena() {
        if (cola.size()== maximo) {
            return true;
        }

        return false;
    }

    @Override
    public void listar() {
        for (int i = 0; i < cola.size(); i++) {
            System.out.println(cola.get(i));
        }

    }
}
