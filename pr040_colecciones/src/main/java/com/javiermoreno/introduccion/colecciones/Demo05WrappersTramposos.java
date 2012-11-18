/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.colecciones;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Administrador
 */
public class Demo05WrappersTramposos {

    public static void main(String[] args) {
        Set<Short> numeros = new HashSet<Short>();
        for (short i=0; i < 10; i++) {
            numeros.add(i);
            if (i > 0) {
                numeros.remove(i-1);
                //numeros.remove(new Integer(i-1));
                //numeros.remove((short)(i-1));
            }            
        }
        
        System.out.println(numeros.size());
        System.out.println(numeros.toString());
    }
    
    
}
