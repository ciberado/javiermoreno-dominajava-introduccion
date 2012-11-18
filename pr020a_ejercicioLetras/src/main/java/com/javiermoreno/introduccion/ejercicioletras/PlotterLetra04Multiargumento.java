/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.ejercicioletras;

/**
 *
 * @author Administrador
 */
public class PlotterLetra04Multiargumento {

    
    public static String construirCadena(int numCar, char letra) {
        StringBuilder resultado = new StringBuilder();
        
        for (int i=0; i < numCar; i++) {
            resultado.append(letra);
        }
        
        return resultado.toString();
    }
    
    public static void dibujarLineas(int...lineas) {
        for (int idx = 0; idx < lineas.length; idx++) {
            System.out.println(PlotterLetra04Multiargumento.construirCadena(lineas[idx], '#'));
        }
    }
    
    public static void main(String[] args) {
        
        PlotterLetra04Multiargumento.dibujarLineas(8, 2, 2, 6, 2, 2, 2, 8);
        System.out.println();
        PlotterLetra04Multiargumento.dibujarLineas(2, 2, 2, 2, 2, 2, 2, 8);
        
    }
}
