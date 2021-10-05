/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1;

/**
 *
 * @author Samuel
 */
public class Proceso extends Thread {

    private int Valor;

    public Proceso(int Valor) {
        this.Valor = Valor;
    }
    
    // Arrancamos el hilo

    @Override
    public void run() {

        System.out.println("Arrancando hilo: " + Thread.currentThread().getName());

        // Hacemos esperar para que a la hora de imprimirlo, salga colocado.
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
        }

        long comienzo = System.currentTimeMillis();
        long end = System.currentTimeMillis();

        System.out.println("Inicio de " + Thread.currentThread().getName() + " " + comienzo);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
        }

        // Arrancamos el hilo para comprobar si el número es primo o no.
        int a = 0;
        for (int i = 1; i <= this.Valor; i++) {
            if (this.Valor % i == 0) {
                a++;
            }
        }
        if (a == 2) {

            System.out.println(Thread.currentThread().getName() + ": El número " + this.Valor + " es un número primo");

        } else {
            System.out.println(Thread.currentThread().getName() + ": El número " + this.Valor + " no es un número primo");
        }

        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
        }

        System.out.println("Final de " + Thread.currentThread().getName() + " " + end);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
        }
        System.out.println("El tiempo que ha tardado en procesar el " + Thread.currentThread().getName() + " es de: " + (comienzo - end) + " segundos");

    }
}
