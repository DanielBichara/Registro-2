/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guía5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author giama
 */
public class Entrada {
    
    static public String inicializar(){
        String buzon = "";
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        
        try{
            buzon=teclado.readLine();
        } catch (IOException e){
            System.out.append("Entrada incorrecta " + e);
        }
            return buzon;
    }
    
    static public int entero(){  
        int valor = Integer.parseInt(inicializar());
        return valor;
    }
    
    static public double real(){  
        double valor = Double.parseDouble(inicializar());
        return valor;
    }
    
    static public String cadena(){
        String valor=inicializar();
        return valor;
    }
    
    static public char caracter(){
        String valor= inicializar();
        return valor.charAt(0);
    }
    
}
