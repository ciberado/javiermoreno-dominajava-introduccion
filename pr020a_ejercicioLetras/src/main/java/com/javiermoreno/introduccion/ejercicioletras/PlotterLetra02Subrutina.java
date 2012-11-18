/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.ejercicioletras;

/**
 *
 * @author Administrador
 */
public class PlotterLetra02Subrutina {

    
    public static String construirCadena(int numCar, char letra) {
        if (numCar == 8) {
            String resultado;
            resultado = "########";
            return resultado;
        } else {
            String resultado;
            resultado = "##";
            return resultado;
        }
    }
    public static void main(String[] args) {
        
        String cadena;
        cadena = PlotterLetra02Subrutina.construirCadena(8, '#');
        System.out.println(cadena);
        cadena = PlotterLetra02Subrutina.construirCadena(2, '*');
        System.out.println(cadena);
        
        System.out.println(PlotterLetra02Subrutina.construirCadena(2, '#'));
        System.out.println(PlotterLetra02Subrutina.construirCadena(2, '#'));
        System.out.println(PlotterLetra02Subrutina.construirCadena(8, '#'));
        System.out.println(PlotterLetra02Subrutina.construirCadena(2, '#'));
        System.out.println(PlotterLetra02Subrutina.construirCadena(2, '#'));
        System.out.println(PlotterLetra02Subrutina.construirCadena(8, '#'));
        
        
        
    }
}
