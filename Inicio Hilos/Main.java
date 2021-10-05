/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Main {

    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int guardado;

        System.out.println("Desea guardar el archivo? 1.SI/ 2.NO");
        guardado = Entrada.nextInt();

        System.out.print("Escriba el primer número: "); // Pedimos por Scanner el número que queremos comprobar
        numero1 = Entrada.nextInt(); // Guardamos el número

        System.out.print("Escriba el segundo número: ");
        numero2 = Entrada.nextInt();

        System.out.print("Escriba el tercer número: ");
        numero3 = Entrada.nextInt();

        System.out.print("Escriba el cuarto número: ");
        numero4 = Entrada.nextInt();

        Proceso hilo1 = new Proceso(numero1); // Asignamos al objeto el valor que le hemos dado a través de Scanner
        hilo1.setName("Hilo 1"); // Le cambiamos el nombre al hilo de serie

        Proceso hilo2 = new Proceso(numero2);
        hilo2.setName("Hilo 2");

        Proceso hilo3 = new Proceso(numero3);
        hilo3.setName("Hilo 3");

        Proceso hilo4 = new Proceso(numero4);
        hilo4.setName("Hilo 4");

        // averiguamos si el usuario quiere guardar el archivo
        switch (guardado) {
            case 1:
                try {
                    // Guardo el resultado en un archivo .txt en la ruta que elijamos.
                    String ruta = "D:\\Documentos\\2. SEGUNDO DE DAM\\2. PROGRAMACIÓN DE SERVICIOS Y PROCESOS\\1. Actividades\\fichero.txt";
                    File file = new File(ruta);

                    // si el archivo no existe, lo creamos.
                    if (!file.exists()) {
                        System.out.println("Se ha creado un nuevo archivo");
                        file.createNewFile();
                    }

                    FileWriter fw = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write("Guardando " + hilo1.getName() + " que tiene el valor de " + numero1 + "\n");
                    bw.write("Guardando " + hilo2.getName() + " que tiene el valor de " + numero2 + "\n");
                    bw.write("Guardando " + hilo3.getName() + " que tiene el valor de " + numero3 + "\n");
                    bw.write("Guardando " + hilo4.getName() + " que tiene el valor de " + numero4 + "\n");
                    bw.close();
                } catch (IOException ex) {
                    System.out.println("No se ha podido crear el archivo");
                }
                break;
            case 2:
                System.out.println("No se ha guardado el archivo");
                break;
            default:
                System.out.println("Debe introducir un número 1.SI/ 2.NO para saber si quiere guardar el resultado");
                System.exit(0);
        }

        //Arrancamos los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

    }
}
