/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class MainTAD {

    public static void main(String[] args) {

        String pathFIFO = "src\\ficheros\\ObjetoFIFO.dat";
        String pathLIFO = "src\\ficheros\\ObjetoLIFO.dat";

        TAD fifo = new FIFO(10);
        TAD lifo = new LIFO(15);

       
        // CARGAR EL OBJETO 
       /** try {
            fifo = cargar(pathFIFO);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        try {
            fifo = cargar(pathLIFO);
        } catch (IOException ex) {
            System.out.println(ex);
        } */
         
        System.out.println("MÉTODO FIFO");
        try {
            System.out.println("AÑADO ELEMENTOS:");
            fifo.push("- PEPE");
            fifo.push("- LUIS");
            fifo.push("- GUSTAVO");

            fifo.listar();

            System.out.println("ELIMINO ELEMENTOS CON POP");

            try {
                System.out.println("PEEK:");
                System.out.println(fifo.peek());
            } catch (TADVacio ex) {
                System.out.println(ex);
            } catch (TADVaciado ex) {
                System.out.println(ex);
            }

        } catch (TADLleno ex) {
            System.out.println(ex);
        } catch (TADLlenado ex) {
            System.out.println(ex);

        }

        System.out.println("LISTADO DE ELEMENTOS QUE QUEDAN TRÁS LAS OPERACIONES: ");
        fifo.listar();

        System.out.println("¿La lista esta llena? " + fifo.estaLlena());
        System.out.println("¿La lista esta vacia? " + fifo.estaVacia());

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("MÉTODO LIFO");
        try {
            System.out.println("AÑADO ELEMENTOS:");
            lifo.push("- PEPE");
            lifo.push("- LUIS");
            lifo.push("- GUSTAVO");

            lifo.listar();

            System.out.println("ELIMINO ELEMENTOS CON POP");

            try {
                lifo.pop();
                lifo.pop();
                lifo.pop();
                System.out.println("PEEK:");
                System.out.println(lifo.peek());
            } catch (TADVacio ex) {
                System.out.println(ex);
            } catch (TADVaciado ex) {
                System.out.println(ex);
            }

        } catch (TADLleno ex) {
            System.out.println(ex);
        } catch (TADLlenado ex) {
            System.out.println(ex);
        }

        System.out.println("LISTADO DE ELEMENTOS QUE QUEDAN TRÁS LAS OPERACIONES: ");

        System.out.println("¿La lista esta llena? " + lifo.estaLlena());
        System.out.println("¿La lista esta vacia? " + lifo.estaVacia());

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        if (!fifo.estaVacia()) {
            guardar(fifo, pathFIFO);
        }
        if (!lifo.estaVacia()) {
            guardar(lifo, pathFIFO);
        }

    }

    public static void guardar(TAD obj, String path) {

        try {
            ObjectOutputStream guardarTAD = new ObjectOutputStream(new FileOutputStream(path));
            guardarTAD.writeObject(obj);
            guardarTAD.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static TAD cargar(String path) throws IOException {
        TAD tad = null;

        try {
            ObjectInputStream cargarFifo = new ObjectInputStream(new FileInputStream(path));
            tad = (TAD) cargarFifo.readObject();

        } catch (Exception e) {
            System.out.println(e);
        }
        return tad;

    }
}
