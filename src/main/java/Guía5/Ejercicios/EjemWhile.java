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
public class EjemWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String p, t;
        System.out.println("¿Qué te gustaria imprimir?: ");
        p=Entrada.cadena();
        System.out.print("Presiona enter para imprimir \"" + p + "\" cuantas veces quieras: ");
        t=Entrada.cadena();
        while(t.isEmpty()){
            System.out.print(p);
            t=Entrada.cadena();
        }
    }
    
}
