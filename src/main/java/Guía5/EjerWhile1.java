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
public class EjerWhile1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        num=Entrada.entero();
        while (num!=0)
        {
            if (num>0){
                System.out.println("Positivo");
            } else {
                System.out.println("Positivo");
            }
            
            System.out.println("Introduzca otro número: ");
            num=Entrada.entero();
        }
    }
    
}
