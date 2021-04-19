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
public class EjemSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Este programa te dice qué mes corresponde según un número ingresado
        
        int nm;
        
        System.out.print("Introduce el número del cuál quieres saber su mes asociado: ");
               
        switch(nm=Entrada.entero()){
            case 1: 
                System.out.print("El mes " + nm + " es Enero.");
                break;
            case 2:
                System.out.print("El mes " + nm + " es Febrero.");
                break;
            case 3:
                System.out.print("El mes " + nm + " es Marzo.");
                break;
            case 4:
                System.out.print("El mes " + nm + " es Abril.");
                break;
            case 5:
                System.out.print("El mes " + nm + " es Mayo.");
                break;
            case 6:
                System.out.print("El mes " + nm + " es Junio.");
                break;
            case 7:
                System.out.print("El mes " + nm + " es Julio.");
                break;
            case 8:
                System.out.print("El mes " + nm + " es Agosto.");
                break;
            case 9:
                System.out.print("El mes " + nm + " es Septiembre.");
                break;
            case 10:
                System.out.print("El mes " + nm + " es Octubre.");
                break;
            case 11:
                System.out.print("El mes " + nm + " es Noviembre.");
                break;
            case 12:
                System.out.print("El mes " + nm + " es Diciembre.");
                break;
            default:
                System.out.print("Ese mes no existe en el planeta Tierra.");
                break;
        }
        
    }
    
}
