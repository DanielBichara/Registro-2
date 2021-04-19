/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guía6.Ejercicios;

/**
 *
 * @author giama
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PI pi = new PI();
        
        System.out.println("El valor de pi es: " + pi.pi + ".");
        
        if (pi instanceof PI){
            System.out.println("En efecto pi es una instancia de PI.");
        } else {
            System.out.println("No, pi no es una instacia de PI.");
        }
        
    }
    
}
