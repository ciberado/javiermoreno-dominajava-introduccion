/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class Demo03ListPrimitivasJava5 {

    public static void main(String[] args) {
        
        List<Integer> ventaEntrada = new ArrayList<Integer>();
        ventaEntrada.add(100);
        ventaEntrada.add(30);
        ventaEntrada.add(600);
        ventaEntrada.add(new Integer(1100));
        
        int suma = 0;
        for (Integer valor : ventaEntrada) {
            suma = suma + valor;
        }
        System.out.println("SUMA: " + suma);
    }
    
}
