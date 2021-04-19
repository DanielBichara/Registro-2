/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guía5;

/**
 *
 * @author giama
 */
public class Ejer1If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1, n2;
        System.out.print("Introduce un número: ");
        n1=Entrada.entero();
        System.out.print("Introduce otro número: ");
        n2=Entrada.entero();
        if(n1==n2){
            System.out.print("Son iguales");
        } else {
            System.out.print("No son iguales");
        }
    }
    
}
