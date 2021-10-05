package empresa;

import entidad.Email;

public class Consumidor extends Thread {

    public String nombre;
    public Cola cola;

    public Consumidor(String nombre, Cola cola) {
        super();
        this.nombre = nombre;
        this.cola = cola;
    }

    public void run() {
        // Cada consumidor obtendrá un total de 15 mensajes ya que los 3 productores enviarán 10 mensajes cada uno
        for (int i = 1; i <= 15; i++) {
            Email email = cola.getMensaje();
            System.out.println(nombre + " ha consumido el mensaje y lo ha enviado: " + email);
        }
    }

}
