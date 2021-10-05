package empresa;

import entidad.Email;

public class Productor extends Thread {

    public String nombre;
    public Cola cola;

    public Productor(String nombre, Cola cola) {
        super();
        this.nombre = nombre;
        this.cola = cola;
    }

    public void run() {
        //Se generarán 10 mensajes por productor
        generadorEmail ge = new generadorEmail();
        for (int i = 1; i <= 10; i++) {
            Email email = ge.generarEmail();

            if (email.getDestinatario() != "pikachu@gmail.com") {
                System.out.println(nombre + " ha generado el mail con ID: " + email.getId());
                cola.addMensaje(email);
            } else {
                System.out.println("---------------" + nombre + " no puede añadir este email, debido a que va destinado a pikachu@gmail.com ---------------");
                // Cada vez que se genera el mensaje de Pikachu, el mensaje ocupa una posición, por ello, con el i--; retrocedo una posición para que los emails
                // válidos sean 10
                i--;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
        }
    }
}
