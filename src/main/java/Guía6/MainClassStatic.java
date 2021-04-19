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
public class MainClassStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Coche toyota = new Coche();
        
        System.out.println(Coche.numeroRuedas);
        System.out.print("El coche tiene su timón al lado " + Coche.timon);
        
        System.out.println("El método retorna: " + Coche.arrancar());
        System.out.println("El método retorna: " + Coche.combustible());
        System.out.println("El método retorna: " + Coche.frenar());
        System.out.println("El método retorna: " + Coche.girar());
        
        toyota.setColor("Rojo");
        System.out.println("El color del carro es: " + toyota.getColor());
        
        toyota.setVelocidad(100);
        System.out.println("La velocidad máxima del carro es: " + toyota.getVelocidad());
        
        toyota.setTamaño(7);
        System.out.println("El tamaño del carro es: " + toyota.getTamaño());
        
        if (toyota instanceof Coche){
            System.out.println("En efecto toyota es una instancia de Coche.");
        } else {
            System.out.println("El carro toyota no es una instancia de Coche.");
        }
    }
    
}
