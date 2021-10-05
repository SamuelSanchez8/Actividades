/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import entidad.Email;

public class generadorEmail {

    public Email generarEmail() {
        Email email = new Email();
        email.setId(generarId());
        email.setDestinatario(generarDestinatario());
        email.setRemitente(generarRemitente());
        email.setAsunto(generarAsunto());
        email.setCuerpo(generarCuerpo());

        return email;
    }

    public String generarId() {
        List<String> listaIds = new ArrayList<String>();
        listaIds.add("1");
        listaIds.add("2");
        listaIds.add("3");
        listaIds.add("4");
        listaIds.add("5");
        listaIds.add("6");
        listaIds.add("7");
        listaIds.add("8");
        listaIds.add("9");
        listaIds.add("10");

        int numero = ThreadLocalRandom.current().nextInt(0, 10);

        return listaIds.get(numero);
    }

    public String generarDestinatario() {

        List<String> listaDestinatarios = new ArrayList<String>();
        listaDestinatarios.add("Destinatario 1");
        listaDestinatarios.add("Destinatario 2");
        listaDestinatarios.add("Destinatario 3");
        listaDestinatarios.add("Destinatario 4");
        listaDestinatarios.add("pikachu@gmail.com");

        int numero = ThreadLocalRandom.current().nextInt(0, 5);

        return listaDestinatarios.get(numero);
    }

    public String generarRemitente() {
        List<String> listaRemitentes = new ArrayList<String>();
        listaRemitentes.add("Remitente 1");
        listaRemitentes.add("Remitente 2");
        listaRemitentes.add("Remitente 3");
        listaRemitentes.add("Remitente 4");
        listaRemitentes.add("Remitente 5");

        int numero = ThreadLocalRandom.current().nextInt(0, 5);

        return listaRemitentes.get(numero);
    }

    public String generarAsunto() {
        List<String> listaAsuntos = new ArrayList<String>();
        listaAsuntos.add("Asunto 1");
        listaAsuntos.add("Asunto 2");
        listaAsuntos.add("Asunto 3");
        listaAsuntos.add("Asunto 4");
        listaAsuntos.add("Asunto 5");

        int numero = ThreadLocalRandom.current().nextInt(0, 5);

        return listaAsuntos.get(numero);
    }

    public String generarCuerpo() {
        List<String> listaCuerpos = new ArrayList<String>();
        listaCuerpos.add("Cuerpo 1");
        listaCuerpos.add("Cuerpo 2");
        listaCuerpos.add("Cuerpo 3");
        listaCuerpos.add("Cuerpo 4");
        listaCuerpos.add("Cuerpo 5");

        int numero = ThreadLocalRandom.current().nextInt(0, 5);

        return listaCuerpos.get(numero);
    }
}
