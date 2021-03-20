/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guía4.Ejercicios;

/**
 *
 * @author giama
 */
public class Ejer1MainInter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ejer1ClassInter circulo = new Ejer1ClassInter();      
        System.out.println("El área del círculo es: " + circulo.Area(3));
        System.out.println("El perímetro del círculo es: " + circulo.Perimetro(3));
    }
    
}
