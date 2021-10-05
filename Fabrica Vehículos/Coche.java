/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_1;

import com.sun.xml.internal.bind.v2.TODO;
import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Coche {

    public static final int ROJO = 0;
    public static final int AZUL = 1;
    public static final int AMARILLO = 2;
    public static final int BLANCO = 3;

    private int color = BLANCO;
    private final int NUM_RUEDAS = 4;
    private Rueda[] conjuntoRuedas = new Rueda[NUM_RUEDAS];
    private Chasis chasis = new Chasis();

    public Coche(Rueda rueda, Chasis chasis, int color) {
        this.chasis = chasis;
        this.color = color;
        for (int i = 0; i < NUM_RUEDAS; i++) {
            this.conjuntoRuedas[i] = rueda;
        }
    }

    @Override
    public String toString() {
        String clr = "";
        if (this.color == 0) {
            clr = "ROJO";
        } else if (this.color == 1) {
            clr = "AZUL";
        } else if (this.color == 2) {
            clr = "AMARILLO";
        } else if (this.color == 3) {
            clr = "BLANCO";
        }
        return "Coche [conjuntoRuedas=]" + Arrays.toString(conjuntoRuedas) + "\nchasis=" + chasis + ",  color= " + clr + '}' + "\n";
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setRueda(Rueda rueda, int pos) {

        this.conjuntoRuedas[pos] = rueda;
    }

    public void setConjuntoRuedas(Rueda[] conjuntoRuedas) {
        this.conjuntoRuedas = conjuntoRuedas;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public int getColor() {
        return this.color;
    }

}
