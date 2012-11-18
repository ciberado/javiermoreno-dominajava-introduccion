/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.ejercicioletras;

/**
 *
 * @author Administrador
 */
public class PlotterLetra03SubrutinaAvanzada {

    
    public static String construirCadena(int numCar, char letra) {
        StringBuilder resultado = new StringBuilder();
        
        for (int i=0; i < numCar; i++) {
            resultado.append(letra);
        }
        
        return resultado.toString();
    }
    
    public static void main(String[] args) {
        
        String cadena;
        cadena = PlotterLetra03SubrutinaAvanzada.construirCadena(8, '#');
        System.out.println(cadena);
        cadena = PlotterLetra03SubrutinaAvanzada.construirCadena(2, '*');
        System.out.println(cadena);
        
        System.out.println(PlotterLetra03SubrutinaAvanzada.construirCadena(2, '#'));
        System.out.println(PlotterLetra03SubrutinaAvanzada.construirCadena(2, '#'));
        System.out.println(PlotterLetra03SubrutinaAvanzada.construirCadena(8, '#'));
        System.out.println(PlotterLetra03SubrutinaAvanzada.construirCadena(2, '#'));
        System.out.println(PlotterLetra03SubrutinaAvanzada.construirCadena(2, '#'));
        System.out.println(PlotterLetra03SubrutinaAvanzada.construirCadena(8, '#'));
        
        
        
    }
}
