package empresa;

import java.util.LinkedList;
import java.util.Queue;

import entidad.Email;

public class Cola {

    public final static int MAX_ELEMENTOS = 5;

    private final Queue <Email> cola = new LinkedList<>();

    public synchronized void addMensaje(Email email) {
        // Si la cola está llena, esperamos para añadir los elementis.
        while (cola.size() == MAX_ELEMENTOS) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        cola.offer(email);
        notify();
    }

    public synchronized Email getMensaje() {
        Email s = null;
        // Cuando hay un hueco, introducimos el mensaje en la cola
        while (cola.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        s = cola.poll();
        notify();
        return s;
    }

}
