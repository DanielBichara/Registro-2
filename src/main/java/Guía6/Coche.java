/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guía6;

/**
 *
 * @author giama
 */
public class Coche {
    private String color;
    private int velocidad;
    private float tamaño;
    public static int numeroRuedas = 4;
    public static final String timon = "izquierdo";
    
    public static String arrancar(){
        return "El coche arrancó";
    }
    
    public static String frenar(){
        return "El coche frenó";
    }
    
    public static String girar(){
        return "El coche ejecutó un giro";
    }
    
    public static String combustible(){
        return "El coche cargo combustible";
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * @return the tamaño
     */
    public float getTamaño() {
        return tamaño;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }
}
