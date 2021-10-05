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
public class Chasis {
    
    private double peso;
    public static final String MATERIAL1="ALUMINIO";
    public static final String MATERIAL2="ACERO";
    public static final String MATERIAL3="HIERRO";
    public static final String MATERIAL4="FIBRA";
    private String MATERIAL;
    
    
   public Chasis (double peso, String material){
       this.peso=peso;
       this.MATERIAL=material;
   }
  
   public Chasis(){
       this.peso = 1000;
       this.MATERIAL=MATERIAL1;
   }
   
   /**
    * Método que devuelve el valor de peso
    * @return peso
    */
    public double getPeso() {
        return peso;
    }
    
/**
 * Método que actualiza el valor de material
 * @param peso 
 */
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
/**
 * Método que devuelve el valor de MATERIAL
 * @return MATERIAL
 */
    public String getMATERIAL() {
        return MATERIAL;
    }
    
/**
 * Metodo que actualiza el valor de MATERIAL
 * @param MATERIAL 
 */
    public void setMATERIAL(String MATERIAL) {
        this.MATERIAL = MATERIAL;
    }
    
    /**
     * Método que devuelve
     * @return texto con atributos declarados anteriormente
     */
    @Override
    public String toString() {
        return "Chasis [" + "peso = " + peso + ", material = " + MATERIAL + ']';
    }      
   
}
