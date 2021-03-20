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
public class Ejer1ClassInter implements Ejer1Interface{

    @Override
    
    public double Area(double radio) {
        return 3.1416 * radio * radio;
    }

    @Override
    public double Perimetro(double radio) {
        return 3.1416 * 2 * radio;
    }
    
}
