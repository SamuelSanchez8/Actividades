/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_1;

/**
 *
 * @author Usuario
 */
public class Rueda {

    public static final int SECO = 0;
    public static final int HUMEDO = 1;
    public static final int NEVADO = 2;
    private double radio;
    private int tipo=SECO;
    
    
    public Rueda(){

        this.radio=1;
        this.tipo=SECO;
    }
    
    public Rueda(double radio, int tipo) {
        this.radio = radio;
        this.tipo = tipo;
   
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public String toString() {
        String str = "";
        if(this.tipo==SECO){
            str ="SECO"; 
        }else if (this.tipo==NEVADO){
            str = "NEVADO";
        }else if (this.tipo == HUMEDO){
            str = "HUMEDO";
        }
        return "Rueda [" + "radio = " + radio + ", tipo = " + str + ']';
    }
}
