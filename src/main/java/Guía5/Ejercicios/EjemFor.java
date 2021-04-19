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
public class EjemFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int c, f, p, pr, n;
        
      try{
        System.out.println("¿Desde que número quieres imprimir?(si el inicio es mayor al final la cuenta será regresiva): ");
        c=Entrada.entero();
        System.out.println("¿Hasta qué número quieres imprimir?: ");
        f=Entrada.entero();
        System.out.println("¿Cuántos pasos entre los números?: ");
        p=Entrada.entero();
        System.out.println("Números por línea: ");
        n=Entrada.entero();
        
        if(c>f){
            p=-p;
        }
        
        System.out.println("El conjunto de números es: ");
        
        for(int i=c, t=0; c>f ? i>=f : i<=f; i+=p){
            t++;
            System.out.print(i);
            if(t%n == 0){
                System.out.println();
            } else if (Math.abs(i-f)>0){
                System.out.print(", ");
            } 
            if (Math.abs(i-f)<=0){
                System.out.print(".");
            }
        }
        
    } catch(Exception e){
        System.out.print("Entrada incorrecta.");
    }
      
    }
}
