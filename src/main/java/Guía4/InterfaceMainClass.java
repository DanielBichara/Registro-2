/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guía4;

/**
 *
 * @author giama
 */
public class InterfaceMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClassTestInter pruebainter = new ClassTestInter ();
        System.out.println("La suma es: " + pruebainter.suma(50,100));
        System.out.println("La resta es: " + pruebainter.suma(50,10));
        System.out.println("La multiplicación es: " + pruebainter.suma(10,5));
        System.out.println("La división es: " + pruebainter.suma(100,10));
        
    }
    
}
