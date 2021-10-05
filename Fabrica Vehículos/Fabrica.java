/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_1;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Fabrica {

    private String nombreFabrica;
    private double defaultRadio;
    private int defaultTipo;
    private double defaultPeso;
    private String defaultMaterial;
    private int capacidadFabrica;  // 0
    private Coche[] conjuntoCochesfabricados;
    private int totalCochesFabricados;

    public Fabrica(String nombreFabrica, double defaultRadio, int defaultTipo, double defaultPeso, String defaultMaterial, int capacidadFabrica) {
        this.nombreFabrica = nombreFabrica;
        this.defaultRadio = defaultRadio;
        this.defaultTipo = defaultTipo;
        this.defaultPeso = defaultPeso;
        this.defaultMaterial = defaultMaterial;
        this.capacidadFabrica = capacidadFabrica;
        this.conjuntoCochesfabricados = new Coche[capacidadFabrica];// TODO terminar de construir el vector aprovechando el tamaño de la capdidad que ya sabemos.

    }

    public Fabrica(int capacidadFabrica) {
        this.capacidadFabrica = capacidadFabrica;
    }

    public double getDefaultRadio() {
        return defaultRadio;
    }

    public void setDefaultRadio(double defaultRadio) {
        this.defaultRadio = defaultRadio;
    }

    public int getDefaultTipo() {
        return defaultTipo;
    }

    public void setDefaultTipo(int defaultTipo) {
        this.defaultTipo = defaultTipo;
    }

    public double getDefaultPeso() {
        return defaultPeso;
    }

    public void setDefaultPeso(double defaultPeso) {
        this.defaultPeso = defaultPeso;
    }

    public String getDefaultMaterial() {
        return defaultMaterial;
    }

    public void setDefaultMaterial(String defaultMaterial) {
        this.defaultMaterial = defaultMaterial;
    }

    public boolean iniciarFabricacion(int numeroCoches) {

        int vacio = 0;
        for (int i = 0; i < conjuntoCochesfabricados.length; i++) {
            if (conjuntoCochesfabricados[i] == null) {
                vacio++;
            }
        }

        if (vacio >= numeroCoches) {
            for (int i = 0; i < numeroCoches; i++) {
                for (int j = 0; j < conjuntoCochesfabricados.length; j++) {
                    if (conjuntoCochesfabricados[j] == null) {
                        conjuntoCochesfabricados[j] = fabricarCoche();
                        totalCochesFabricados++;
                        break;
                    }
                }

            }
            return true;
        }
        return false;
    }

    /**
     *
     * @return cochefabricado
     */
    private Coche fabricarCoche() {

        Rueda rueda = new Rueda(defaultRadio, defaultTipo);
        Chasis chasis = new Chasis(defaultPeso, defaultMaterial);

        int colorRandom = (int) (Math.random() * 3);

        Coche cocheFabricado = new Coche(rueda, chasis, colorRandom);

        return cocheFabricado;
    }
 /**
     * Retira los coches si el numero de coches es menor de lo que hay en la fabrica
     * @param numeroCoches numero de coches a borrar
     * @return true | false 
     */
    public boolean retirarCoche(int numeroCoches) {
        int coches = 0;
        for (int i = 0; i < conjuntoCochesfabricados.length; i++) {
            if (conjuntoCochesfabricados[i] != null) {
                coches++;
            }
        }

        if (coches < numeroCoches) {
            return false;
        } else {
            for (int i = 0; i < numeroCoches; i++) {
                if (conjuntoCochesfabricados[i] != null ) {
                    sacarCoche(i);
                    this.totalCochesFabricados--;
                }
            }

            return true;
        }
    }

    /**
     * Retira los coches de un color si el numero de coches de ese color es menor de lo que hay en la fabrica de ese mismo color
     * @param numeroCoches numero de coches a borrar
     * @param color color de coches a borrar
     * @return true | false 
     */
    public boolean retirarCoche(int numeroCoches, int color) {
        int coches = 0;
        int numeroCochesBorrados = 0;
        for (int i = 0; i < conjuntoCochesfabricados.length; i++) {
            if (conjuntoCochesfabricados[i] != null && conjuntoCochesfabricados[i].getColor() == color) {
                coches++;
            }
        }

        if (coches < numeroCoches) {
            return false;
        } else {
            for (int i = 0; i < conjuntoCochesfabricados.length; i++) {
                if (conjuntoCochesfabricados[i] != null && conjuntoCochesfabricados[i].getColor() == color) {
                    sacarCoche(i);
                    this.totalCochesFabricados--;
                    numeroCochesBorrados++;
                }
                if (numeroCochesBorrados == numeroCoches) {
                    break;
                }
            }

            return true;
        }

    }
    /**
     * Método que retira un vehículo guardado en la posición que indiquemos empezando
     * @param posicion 
     */

    private void sacarCoche(int posicion) {
        for (int i = posicion; i < conjuntoCochesfabricados.length - 1; i++) {
            conjuntoCochesfabricados[i] = conjuntoCochesfabricados[i + 1];
        }
        conjuntoCochesfabricados[conjuntoCochesfabricados.length - 1] = null;
    }

    @Override
    public String toString() {
        int color;
        String clr = null;
        String mensaje = "############################################\n";
        mensaje += "Fabrica: " + nombreFabrica + "\n";
        mensaje += "Número actual de Fabricados: " + totalCochesFabricados + "/" + capacidadFabrica + "\n";

        for (int i = 0; i < conjuntoCochesfabricados.length; i++) {
            if (conjuntoCochesfabricados[i] != null) {
                color = conjuntoCochesfabricados[i].getColor();
                if (color == 0) {
                    clr = "ROJO";
                } else if (color == 1) {
                    clr = "AZUL";
                } else if (color == 2) {
                    clr = "AMARILLO";
                } else if (color == 3) {
                    clr = "BLANCO";
                }
                mensaje += "********************************\n";
                mensaje += "Coche " + (i + 1) + " color " + clr + "\n" + conjuntoCochesfabricados[i];

            }
        }

        return mensaje;
    }

}
