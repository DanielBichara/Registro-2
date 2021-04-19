/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guía5.Ejercicios;
import Guía5.Entrada;

/**
 *
 * @author giama
 */
public class EjemIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Este programa sirve para comparar las edades de dos personas
        
        int e1, e2;
        String n1, n2;
        
        System.out.print("¿Cuáles son sus nombres? \n");
        n1=Entrada.cadena();
        n2=Entrada.cadena();
        System.out.print("¿Cuáles son sus edades respectivas? \n");
        e1=Entrada.entero();
        e2=Entrada.entero();
        
        if(e1==e2){
            System.out.print(n1 + " y " + n2 + " tienen la misma edad.");
        } else if (e1>e2){
            System.out.print(n1 + " es mayor que " + n2 + ".");
        } else {
            System.out.print(n2 + " es mayor que " + n1 + ".");
        }
        
        
    }
    
}
