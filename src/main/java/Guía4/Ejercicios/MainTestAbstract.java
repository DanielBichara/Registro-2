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
public class MainTestAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ExtendsAbstract circulo = new ExtendsAbstract();
        
        System.out.println("El área del círculo es: " + circulo.Area(2));
    }
    
}
